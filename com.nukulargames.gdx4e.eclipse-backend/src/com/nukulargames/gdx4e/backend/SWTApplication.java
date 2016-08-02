/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.nukulargames.gdx4e.backend;

import java.io.File;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseWheelListener;
import org.eclipse.swt.events.ShellAdapter;
import org.eclipse.swt.events.ShellEvent;
import org.eclipse.swt.events.ShellListener;
import org.eclipse.swt.opengl.GLCanvas;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Audio;
import com.badlogic.gdx.Files;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.LifecycleListener;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Clipboard;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.ObjectMap;

public class SWTApplication implements Application {

	private final ShellListener iconifyListener = new ShellAdapter() {
		public void shellDeiconified(ShellEvent event) {
			postRunnable(new Runnable() {
				@Override
				public void run() {
					if (paused) {
						paused = false;
						listener.pause();
					}
				}
			});
		}

		public void shellIconified(ShellEvent event) {
			postRunnable(new Runnable() {
				@Override
				public void run() {
					if (!paused) {
						paused = true;
						listener.pause();
					}
				}
			});
		}
	};

	private final Listener resizeListener = new Listener() {
		@Override
		public void handleEvent(Event arg0) {
			graphics.updateFramebufferInfo();
			if (!listenerInitialized) {
				return;
			}
			canvas.setCurrent();
			listener.resize(graphics.getWidth(), graphics.getHeight());
			listener.render();
			canvas.swapBuffers();
		}
	};

	private final SWTApplicationConfiguration config;

	private GLCanvas canvas;
	private ApplicationListener listener;
	private boolean listenerInitialized = false;
	
	private boolean paused = false;
	
	private final Audio audio;
	private final Files files;
	private final Net net;
	private final Input input;
	private final ClipboardStub clipboard;
	private final Lwjgl3Graphics graphics;

	private final ObjectMap<String, Preferences> preferences = new ObjectMap<String, Preferences>();
	private int logLevel = LOG_INFO;

	private volatile boolean running = true;
	private final Array<Runnable> runnables = new Array<Runnable>();
	private final Array<Runnable> executedRunnables = new Array<Runnable>();
	private final Array<LifecycleListener> lifecycleListeners = new Array<LifecycleListener>();

	private static int versionMajor, versionMinor;

	static void loadNatives() {
		Lwjgl3NativesLoader.load();
	}

	public SWTApplication(ApplicationListener listener, SWTApplicationConfiguration config) {
		loadNatives();
		this.config = SWTApplicationConfiguration.copy(config);
		if (this.config.title == null) {
			this.config.title = listener.getClass().getSimpleName();
		}

		this.listener = listener;
		
		canvas = prepareCanvas(config, listener);

		Gdx.app = this;

		files = Gdx.files = new Lwjgl3Files();
		net = Gdx.net = new Lwjgl3Net();
		clipboard = new ClipboardStub();
		input = Gdx.input = new SWTMouseInput();
		audio = Gdx.audio = new AudioStub();
		Gdx.graphics = graphics = new Lwjgl3Graphics(canvas, config);
		Gdx.gl30 = graphics.getGL30();
		Gdx.gl20 = Gdx.gl30 != null ? Gdx.gl30 : graphics.getGL20();
		Gdx.gl = Gdx.gl30 != null ? Gdx.gl30 : Gdx.gl20;

		canvas.addListener(SWT.Resize, resizeListener);
		canvas.addMouseListener((MouseListener) input);
		canvas.addMouseMoveListener((MouseMoveListener) input);
		canvas.addMouseWheelListener((MouseWheelListener) input);
		canvas.getShell().addShellListener(iconifyListener);
		
		canvas.getShell().open();
		canvas.getShell().layout(true, true);
		
		try {
			Display.getDefault().asyncExec(new Runnable() {
				public void run() {
					if (!canvas.isDisposed() && running) {
						innerLoop();
						Display.getDefault().timerExec(50, this);
					}
				}
			});

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	private void innerLoop() {
		canvas.setCurrent();

		synchronized (lifecycleListeners) {
			update(lifecycleListeners);
		}

		synchronized (runnables) {
			executedRunnables.clear();
			executedRunnables.addAll(runnables);
			runnables.clear();
		}

		for (Runnable runnable : executedRunnables) {
			runnable.run();
		}
	}

	private void update(Array<LifecycleListener> lifecycleListeners) {
		if (listenerInitialized == false) {
			initializeListener();
		}
		synchronized (runnables) {
			executedRunnables.addAll(runnables);
			runnables.clear();
		}
		for (Runnable runnable : executedRunnables) {
			runnable.run();
		}
		executedRunnables.clear();

		if (canvas.getShell().isVisible()) {
			canvas.setCurrent();
			graphics.update();
			listener.render();
			canvas.swapBuffers();
//			input.update();
		}
	}
	
	private void initializeListener() {
		if (!listenerInitialized) {
			listener.create();
			listener.resize(graphics.getWidth(), graphics.getHeight());
			listenerInitialized = true;
		}
	}

	@Override
	public ApplicationListener getApplicationListener() {
		return listener;
	}

	@Override
	public Graphics getGraphics() {
		return graphics;
	}

	@Override
	public Audio getAudio() {
		return audio;
	}

	@Override
	public Input getInput() {
		return input;
	}

	@Override
	public Files getFiles() {
		return files;
	}

	@Override
	public Net getNet() {
		return net;
	}

	@Override
	public void debug(String tag, String message) {
		if (logLevel >= LOG_DEBUG) {
			System.out.println(tag + ": " + message);
		}
	}

	@Override
	public void debug(String tag, String message, Throwable exception) {
		if (logLevel >= LOG_DEBUG) {
			System.out.println(tag + ": " + message);
			exception.printStackTrace(System.out);
		}
	}

	@Override
	public void log(String tag, String message) {
		if (logLevel >= LOG_INFO) {
			System.out.println(tag + ": " + message);
		}
	}

	@Override
	public void log(String tag, String message, Throwable exception) {
		if (logLevel >= LOG_INFO) {
			System.out.println(tag + ": " + message);
			exception.printStackTrace(System.out);
		}
	}

	@Override
	public void error(String tag, String message) {
		if (logLevel >= LOG_ERROR) {
			System.err.println(tag + ": " + message);
		}
	}

	@Override
	public void error(String tag, String message, Throwable exception) {
		if (logLevel >= LOG_ERROR) {
			System.err.println(tag + ": " + message);
			exception.printStackTrace(System.err);
		}
	}

	@Override
	public void setLogLevel(int logLevel) {
		this.logLevel = logLevel;
	}

	@Override
	public int getLogLevel() {
		return logLevel;
	}

	@Override
	public ApplicationType getType() {
		return ApplicationType.Desktop;
	}

	@Override
	public int getVersion() {
		return 0;
	}

	@Override
	public long getJavaHeap() {
		return Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
	}

	@Override
	public long getNativeHeap() {
		return getJavaHeap();
	}

	@Override
	public Preferences getPreferences(String name) {
		if (preferences.containsKey(name)) {
			return preferences.get(name);
		} else {
			Preferences prefs = new Lwjgl3Preferences(
					new Lwjgl3FileHandle(new File(config.preferencesDirectory, name), config.preferencesFileType));
			preferences.put(name, prefs);
			return prefs;
		}
	}

	@Override
	public Clipboard getClipboard() {
		return clipboard;
	}

	@Override
	public void postRunnable(Runnable runnable) {
		synchronized (runnables) {
			runnables.add(runnable);
		}
	}

	@Override
	public void exit() {
		running = false;
	}

	@Override
	public void addLifecycleListener(LifecycleListener listener) {
		synchronized (lifecycleListeners) {
			lifecycleListeners.add(listener);
		}
	}

	@Override
	public void removeLifecycleListener(LifecycleListener listener) {
		synchronized (lifecycleListeners) {
			lifecycleListeners.add(listener);
		}
	}

	private GLCanvas prepareCanvas(SWTApplicationConfiguration config, ApplicationListener listener) {
		GLCanvas canvas = config.getCanvas();
		canvas.setVisible(true);
		canvas.setCurrent();

		GL.createCapabilities();
		extractVersion();

		for (int i = 0; i < 2; i++) {
			GL11.glClearColor(config.initialBackgroundColor.r, config.initialBackgroundColor.g,
					config.initialBackgroundColor.b, config.initialBackgroundColor.a);
			GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);

			canvas.swapBuffers();
		}

		return canvas;
	}

	private static void extractVersion() {
		// See https://www.opengl.org/wiki/GLAPI/glGetString, format is:
		// <major> "." <minor> ("." <release>) (<space>
		// (<vendor_specific_info>))
		String version = GL11.glGetString(GL11.GL_VERSION);
		try {
			String[] v = version.split(" ", 2)[0].split("\\.", 3);
			versionMajor = Integer.parseInt(v[0]);
			versionMinor = Integer.parseInt(v[1]);
		} catch (Throwable t) {
			throw new GdxRuntimeException("Error extracting the OpenGL version: " + version, t);
		}
	}
}

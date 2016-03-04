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

import java.nio.IntBuffer;

import org.eclipse.swt.opengl.GLCanvas;
import org.eclipse.swt.opengl.GLData;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;

import com.badlogic.gdx.Graphics;
import com.badlogic.gdx.graphics.Cursor;
import com.badlogic.gdx.graphics.Cursor.SystemCursor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.GL30;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.utils.Disposable;
import com.nukulargames.gdx4e.backend.SWTApplicationConfiguration.HdpiMode;

public class Lwjgl3Graphics implements Graphics, Disposable {
	private GLCanvas canvas;
	private SWTApplicationConfiguration config;

	private final GL20 gl20;
	private final GL30 gl30;
	private volatile int backBufferWidth;
	private volatile int backBufferHeight;
	private volatile int logicalWidth;
	private volatile int logicalHeight;
	private BufferFormat bufferFormat;
	private long lastFrameTime = -1;
	private float deltaTime;
	private long frameId;
	private long frameCounterStart = 0;
	private int frames;
	private int fps;

	IntBuffer tmpBuffer = BufferUtils.createIntBuffer(1);
	IntBuffer tmpBuffer2 = BufferUtils.createIntBuffer(1);

	public Lwjgl3Graphics(GLCanvas canvas, SWTApplicationConfiguration config) {
		this.canvas = canvas;
		this.config = config;
		
		if (config.useGL30) {
			this.gl30 = new Lwjgl3GL30();
			this.gl20 = this.gl30;
		} else {
			this.gl20 = new Lwjgl3GL20();
			this.gl30 = null;
		}
		updateFramebufferInfo();
	}

	void updateFramebufferInfo() {
		backBufferWidth = canvas.getSize().x;
		backBufferHeight = canvas.getSize().y;
		
		logicalWidth = canvas.getSize().x;
		logicalHeight = canvas.getSize().y;

		GLData data = canvas.getGLData();
		bufferFormat = new BufferFormat(data.redSize, data.greenSize, data.blueSize, data.alphaSize, data.depthSize,
				data.stencilSize, data.samples, false);
	}

	void update() {
		long time = System.nanoTime();
		if (lastFrameTime == -1)
			lastFrameTime = time;
		deltaTime = (time - lastFrameTime) / 1000000000.0f;
		lastFrameTime = time;

		if (time - frameCounterStart >= 1000000000) {
			fps = frames;
			frames = 0;
			frameCounterStart = time;
		}
		frames++;
		frameId++;
	}

	@Override
	public boolean isGL30Available() {
		return gl30 != null;
	}

	@Override
	public GL20 getGL20() {
		return gl20;
	}

	@Override
	public GL30 getGL30() {
		return gl30;
	}

	@Override
	public int getWidth() {
		if (config.hdpiMode == HdpiMode.Pixels) {
			return backBufferWidth;
		} else {
			return logicalWidth;
		}
	}

	@Override
	public int getHeight() {
		if (config.hdpiMode == HdpiMode.Pixels) {
			return backBufferHeight;
		} else {
			return logicalHeight;
		}
	}

	@Override
	public int getBackBufferWidth() {
		return backBufferWidth;
	}

	@Override
	public int getBackBufferHeight() {
		return backBufferHeight;
	}

	public int getLogicalWidth() {
		return logicalWidth;
	}

	public int getLogicalHeight() {
		return logicalHeight;
	}

	@Override
	public long getFrameId() {
		return frameId;
	}

	@Override
	public float getDeltaTime() {
		return deltaTime;
	}

	@Override
	public float getRawDeltaTime() {
		return deltaTime;
	}

	@Override
	public int getFramesPerSecond() {
		return fps;
	}

	@Override
	public GraphicsType getType() {
		return GraphicsType.LWJGL3;
	}

	@Override
	public float getPpiX() {
		return getPpcX() / 0.393701f;
	}

	@Override
	public float getPpiY() {
		return getPpcY() / 0.393701f;
	}

	@Override
	public float getPpcX() {
		Lwjgl3Monitor monitor = (Lwjgl3Monitor) getMonitor();
		GLFW.glfwGetMonitorPhysicalSize(monitor.monitorHandle, tmpBuffer, tmpBuffer2);
		int sizeX = tmpBuffer.get(0);
		DisplayMode mode = getDisplayMode();
		return mode.width / (float) sizeX * 10;
	}

	@Override
	public float getPpcY() {
		Lwjgl3Monitor monitor = (Lwjgl3Monitor) getMonitor();
		GLFW.glfwGetMonitorPhysicalSize(monitor.monitorHandle, tmpBuffer, tmpBuffer2);
		int sizeY = tmpBuffer2.get(0);
		DisplayMode mode = getDisplayMode();
		return mode.height / (float) sizeY * 10;
	}

	@Override
	public float getDensity() {
		return getPpiX() / 160f;
	}

	@Override
	public boolean supportsDisplayModeChange() {
		return true;
	}

	@Override
	public Monitor getPrimaryMonitor() {
		return SWTApplicationConfiguration.toLwjgl3Monitor(GLFW.glfwGetPrimaryMonitor());
	}

	@Override
	public Monitor getMonitor() {
		return null;
	}

	@Override
	public Monitor[] getMonitors() {
		return null;
	}

	@Override
	public DisplayMode[] getDisplayModes() {
		return null;
	}

	@Override
	public DisplayMode[] getDisplayModes(Monitor monitor) {
		return null;
	}

	@Override
	public DisplayMode getDisplayMode() {
		return null;
	}

	@Override
	public DisplayMode getDisplayMode(Monitor monitor) {
		return null;
	}

	@Override
	public boolean setFullscreenMode(DisplayMode displayMode) {
		return false;
	}

	@Override
	public boolean setWindowedMode(int width, int height) {
		return false;
	}

	@Override
	public void setTitle(String title) {
		if (title == null) {
			title = "";
		}
	}

	@Override
	public void setVSync(boolean vsync) {
	}

	@Override
	public BufferFormat getBufferFormat() {
		return bufferFormat;
	}

	@Override
	public boolean supportsExtension(String extension) {
		return false;
	}

	@Override
	public void setContinuousRendering(boolean isContinuous) {
	}

	@Override
	public boolean isContinuousRendering() {
		return true;
	}

	@Override
	public void requestRendering() {
	}

	@Override
	public boolean isFullscreen() {
		return false;
	}

	@Override
	public Cursor newCursor(Pixmap pixmap, int xHotspot, int yHotspot) {
		return null;
	}

	@Override
	public void setCursor(Cursor cursor) {
	}

	@Override
	public void setSystemCursor(SystemCursor systemCursor) {
	}

	@Override
	public void dispose() {
	}

	public static class Lwjgl3DisplayMode extends DisplayMode {
		final long monitorHandle;

		Lwjgl3DisplayMode(long monitor, int width, int height, int refreshRate, int bitsPerPixel) {
			super(width, height, refreshRate, bitsPerPixel);
			this.monitorHandle = monitor;
		}

		public long getMonitor() {
			return monitorHandle;
		}
	}

	public static class Lwjgl3Monitor extends Monitor {
		final long monitorHandle;

		Lwjgl3Monitor(long monitor, int virtualX, int virtualY, String name) {
			super(virtualX, virtualY, name);
			this.monitorHandle = monitor;
		}

		public long getMonitorHandle() {
			return monitorHandle;
		}
	}
}

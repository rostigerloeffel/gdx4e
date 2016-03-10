package com.nukulargames.gdx4e.actors.preview;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.opengl.GLCanvas;
import org.eclipse.swt.opengl.GLData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.backend.SWTApplication;
import com.nukulargames.gdx4e.backend.SWTApplicationConfiguration;

public class ActorPreview extends ViewPart implements ISelectionListener {

	public static final String ID = "com.nukulargames.gdx4e.actors.preview.ActorPreview";

	private GLCanvas canvas;
	private SWTApplicationConfiguration config;
	private Application application;
	
	public ActorPreview() {
	}

	public void createPartControl(Composite parent) {
		parent.setLayout(new FillLayout());
		Composite container = new Composite(parent, SWT.NONE);
		container.setLayout(new FillLayout());

		GLData data = new GLData();
		data.redSize = 8;
		data.greenSize = 8;
		data.blueSize = 8;
		data.alphaSize = 8;
		data.stencilSize = 0;
		data.depthSize = 16;
		data.samples = 0;
		data.doubleBuffer = true;
		canvas = new GLCanvas(container, SWT.NONE, data);

		config = new SWTApplicationConfiguration();
		config.setCanvas(canvas);

		application = createApplication(config);
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}
	
	private Application createApplication(SWTApplicationConfiguration config) {
		application = new Application();
		new SWTApplication(application, config);
		return application;
	}
	
	@Override
	public void setFocus() {
		canvas.layout(true);
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (application == null) {
			return;
		}
		
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof Actor) {
				Actor actor = (Actor) firstElement;
			} else if (firstElement instanceof Animation) {
				Animation animation = (Animation) firstElement;
				IFile foundFile = findFile(animation, animation.getNormalizedTexture());
				System.out.println("Animation file: " + foundFile);
				Display.getDefault().asyncExec(() -> {
					application.setAnimation(animation, foundFile.getLocation().toPortableString());
				});
			}
		}
	}

	private IFile findFile(EObject object, String path) {
		Path resourcePath = new Path(object.eResource().getURI().toPlatformString(true));
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getFile(resourcePath).getProject();
		IFile file = findFileInProject(path, project);
		if (file != null) {
			return file;
		}
		for (IProject referencingProject : project.getReferencingProjects()) {
			file = findFileInProject(path, referencingProject);
			if (file != null) {
				return file;
			}
		}
		return null;
	}

	private IFile findFileInProject(String path, IProject project) {
		IJavaProject javaProject = JavaCore.create(project);
		try {
			javaProject.getReferencedClasspathEntries();
			
			IClasspathEntry[] classpath = javaProject.getResolvedClasspath(true);
			for (IClasspathEntry classpathEntry : classpath) {
				IFile file = ResourcesPlugin.getWorkspace().getRoot()
						.getFile(classpathEntry.getPath().append(IPath.SEPARATOR + path));
				if (file.exists()) {
					return file;
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	

	@Override
	public void dispose() {
		canvas.dispose();
		getSite().getWorkbenchWindow().getSelectionService().removeSelectionListener(this);
		super.dispose();
	}
}

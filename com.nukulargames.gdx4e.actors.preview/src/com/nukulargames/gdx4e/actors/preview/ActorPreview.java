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
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.backend.SWTApplicationConfiguration;

public class ActorPreview extends ViewPart implements ISelectionListener {

	public static final String ID = "com.nukulargames.gdx4e.actors.preview.ActorPreview";
	
	private GLCanvas canvas;

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
		
		SWTApplicationConfiguration config = new SWTApplicationConfiguration();
		config.setCanvas(canvas);
		
		
		
		getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
		canvas.layout(true);
	}
	
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			Object firstElement = structuredSelection.getFirstElement();
			if (firstElement instanceof Actor) {
				Actor actor = (Actor) firstElement;
			} else if (firstElement instanceof Animation) {
				Animation animation = (Animation) firstElement;
				IFile foundFile = findFile(animation, animation.getTexture());
				System.out.println(foundFile);
			}
		}
	}

	private IFile findFile(EObject object, String path) {
		Path resourcePath = new Path(object.eResource().getURI().toPlatformString(true));
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getFile(resourcePath).getProject();
		IJavaProject javaProject = JavaCore.create(project);
		try {
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

/*
 * generated by Xtext 2.9.2
 */
package com.nukulargames.gdx4e.actors.dsl.ui;

import com.google.inject.Injector;
import com.nukulargames.gdx4e.actors.dsl.ui.internal.DslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return DslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return DslActivator.getInstance().getInjector(DslActivator.COM_NUKULARGAMES_GDX4E_ACTORS_DSL_DSL);
	}
	
}

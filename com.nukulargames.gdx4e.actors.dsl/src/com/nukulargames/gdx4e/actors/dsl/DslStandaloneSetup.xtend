/*
 * generated by Xtext 2.9.1
 */
package com.nukulargames.gdx4e.actors.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class DslStandaloneSetup extends DslStandaloneSetupGenerated {

	def static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}

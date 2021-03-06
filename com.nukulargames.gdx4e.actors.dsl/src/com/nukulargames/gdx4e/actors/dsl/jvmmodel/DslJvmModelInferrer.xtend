/*
 * generated by Xtext 2.9.1
 */
package com.nukulargames.gdx4e.actors.dsl.jvmmodel

import com.google.inject.Inject
import com.nukulargames.gdx4e.actors.Actor
import com.nukulargames.gdx4e.actors.Model
import com.nukulargames.gdx4e.actors.Stage
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor

class DslJvmModelInferrer extends AbstractModelInferrer {

	@Inject extension ActorInferrer actorInferrer
	@Inject extension StageInferrer stageInferrer

	def dispatch void infer(Model element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for (Actor actor : element.actors) {
			actor.infer(element, acceptor, isPreIndexingPhase)
		}
		
		for (Stage stage : element.stages) {
			stage.infer(element, acceptor, isPreIndexingPhase)
		}
	}

}

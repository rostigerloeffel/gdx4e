/*
 * generated by Xtext 2.9.1
 */
package com.nukulargames.gdx4e.actors.dsl.jvmmodel

import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.google.inject.Inject
import com.nukulargames.gdx4e.actors.Actor
import com.nukulargames.gdx4e.actors.ActorsFactory
import com.nukulargames.gdx4e.actors.Model
import com.nukulargames.gdx4e.actors.State
import com.nukulargames.gdx4e.ext.NukuActor
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 
 *
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class DslJvmModelInferrer extends AbstractModelInferrer {

    /**
     * convenience API to build and initialize JVM types and their members.
     */
	@Inject extension JvmTypesBuilder

	extension ActorsFactory factory = ActorsFactory.eINSTANCE

	/**
	 * The dispatch method {@code infer} is called for each instance of the
	 * given element's type that is contained in a resource.
	 * 
	 * @param element
	 *            the model to create one or more
	 *            {@link JvmDeclaredType declared
	 *            types} from.
	 * @param acceptor
	 *            each created
	 *            {@link JvmDeclaredType type}
	 *            without a container should be passed to the acceptor in order
	 *            get attached to the current resource. The acceptor's
	 *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
	 *            accept(..)} method takes the constructed empty type for the
	 *            pre-indexing phase. This one is further initialized in the
	 *            indexing phase using the closure you pass to the returned
	 *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
	 *            initializeLater(..)}.
	 * @param isPreIndexingPhase
	 *            whether the method is called in a pre-indexing phase, i.e.
	 *            when the global index is not yet fully actd. You must not
	 *            rely on linking using the index if isPreIndexingPhase is
	 *            <code>true</code>.
	 */
	def dispatch void infer(Model element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		for (Actor actor : element.actors) {
			infer(element, actor, acceptor, isPreIndexingPhase);
		}
	}
	
	def void infer(Model model, Actor element, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {		
   		val genClass = element.toClass(model.basePackageName + element.name + "Gen")
   		acceptor.accept(genClass) [
   			superTypes += typeRef(NukuActor)

			members += stateEnum(element)
			members += currentState(element)
	
   			members += textureFields(element)  			
   			members += animationFields(element)
   			members += currentAnimationField(element)
   			members += stateTimeField(element)
   			
   			members += constructor(element)
   			members += initPosition(element)
   			members += initSize(element)
   			members += initScale(element)
   			members += initRotation(element)
   			members += initState(element)
   			
   			members += getAnimation(element)
   			
   			members += draw(element)
   			members += drawState(element)
   			members += drawAnimation(element)

   			members += act(element)
   			members += _actState(element)
   			members += actState(element)
   			
   			members += resetStateTime(element)
   			
   			members += getCurrentState(element)
   			members += transit(element)
   			members += _enterState(element)
   			members += enterState(element)
   			members += _leaveState(element)
   			members += leaveState(element)
   		]
   		
   		acceptor.accept(element.toClass(model.basePackageName + element.name)) [
   			superTypes += typeRef(genClass)
   		]
	}
	
	def basePackageName(Model model) {
		if (model.basePackage.nullOrEmpty) {
			""
		} else {
			model.basePackage + "."
		}
	}
	
//	def normalizedStates(Actor actor) {
//		if (actor.states.nullOrEmpty) {
//			val animation = if (actor.animations.nullOrEmpty) {
//				val animation = createAnimation
//				animation.name = "default"
//				animation.texture = actor.name.substring(actor.name.lastIndexOf('.') + 1) + ".png"
//				animation
//			} else {
//				actor.animations.head
//			}
//			val state = createState
//			state.name = "default"
//			state.animation = animation;
//			newArrayList(state)
//		} else {
//			actor.states
//		}
//	}
//	
//	def normalizedAnimations(Actor actor) {
//		if (actor.animations.nullOrEmpty) {
//			val animation = createAnimation
//			animation.name = "default"
//			animation.texture = actor.name.substring(actor.name.lastIndexOf('.') + 1) + ".png"
//			newArrayList(animation)
//		} else {
//			actor.animations
//		}
//	}
	
	def stateEnum(Actor actor) {
		actor.toEnumerationType("States") [
			members += actor.normalizedStates.map[s | actor.toEnumerationLiteral(s.name.toUpperCase)]
		]
	}
	
	def currentState(Actor actor) {
		actor.toField("currentState", typeRef("States")) [
			visibility = JvmVisibility.PRIVATE
			initializer = '''null'''
		]
	}
	
	def textureFields(Actor actor) {
		actor.normalizedAnimations.map[a | actor.toField(a.name.toUpperCase + "_TEXTURE", typeRef(Texture)) [
			visibility = JvmVisibility.PRIVATE
			final = true
			static = true
			initializer = '''new �Texture�(�Gdx�.files.internal("�a.texture ?: actor.name.substring(actor.name.lastIndexOf('.') + 1) + "_" + a.name + ".png"�"))'''
		]]
	}
	
	def animationFields(Actor actor) {
		actor.normalizedAnimations.map[a | actor.toField(a.name.toFirstLower + "Animation", typeRef(Animation)) [
			visibility = JvmVisibility.PRIVATE
			final = true
		]]
	}
	
	def stateTimeField(Actor actor) {
		actor.toField("animationStateTime", typeRef(float)) [
			visibility = JvmVisibility.PRIVATE
			initializer = '''0.0f'''			
		]
	}
	
	def currentAnimationField(Actor actor) {
		actor.toField("currentAnimation", typeRef(Animation))
	}
	
	def constructor(Actor actor) {
		actor.toConstructor[
			visibility = JvmVisibility.PUBLIC
			body = '''
				super();
				�createAnimationCalls(actor)�
				initState();
				initPosition();
				initSize();
				initScale();
				initRotation();
			'''
		]
	}
	
	def createAnimationCalls(Actor actor) {
		actor.normalizedAnimations.map[a | 
			a.name.toFirstLower + "Animation = createAnimation(" + a.name.toUpperCase + "_TEXTURE, " + a.rows + ", " + a.columns + ", (float) " + a.delay + ");"
		].fold("", [ in, line | in + "\n" + line])
	}
	
	def initPosition(Actor actor) {		
		actor.toMethod("initPosition", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setX((float) �actor.x�);
				setY((float) �actor.y�);
			'''
		]
	}
	
	def initSize(Actor actor) {		
		actor.toMethod("initSize", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setWidth((float) �actor.width�);
				setHeight((float) �actor.height�);
			'''
		]
	}
	
	def initScale(Actor actor) {
		actor.toMethod("initScale", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setScaleX((float) �actor.scaleX�);
				setScaleY((float) �actor.scaleY�);
			'''
		]
	}
	
	def initRotation(Actor actor) {		
		actor.toMethod("initRotation", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setRotation((float) �actor.rotation�);
			'''
		]
	}
	
	def initState(Actor actor) {
		actor.toMethod("initState", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				currentState = States.�actor?.defaultState?.name?.toUpperCase ?: actor?.states?.head?.name?.toUpperCase ?: "DEFAULT"�;
			'''
		]
	}
	
	def getAnimation(Actor actor) {
		actor.animations.map[a | actor.toMethod("get" + a.name.toFirstUpper + "Animation", typeRef(Animation)) [
			visibility = JvmVisibility.PUBLIC
			body = '''
				return �a.name.toFirstLower�Animation;
			'''
		]]
	}
	
	def getCurrentState(Actor actor) {
		actor.toMethod("getCurrentState", typeRef("States")) [
			body = '''
				return currentState;
			'''
		]		
	}
	
	def transit(Actor actor) {
		actor.toMethod("transit", typeRef(void)) [
			parameters += actor.toParameter("next", typeRef("States"))
			body = '''
				switch (currentState) {
					�FOR State state : actor.normalizedStates�
						case �state.name.toUpperCase�:
							_leave�state.name.toFirstUpper�State();
							break;
					�ENDFOR�
					default:
				}
				
				switch (next) {
					�FOR State state : actor.normalizedStates�
						case �state.name.toUpperCase�:
							_enter�state.name.toFirstUpper�State();
							break;
					�ENDFOR�
					default:
				}
				currentState = next;
			'''
		]
	}
	
	def _enterState(Actor actor) {
		actor.normalizedStates.map[s | actor.toMethod("_enter" + s.name.toFirstUpper + "State", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				currentAnimation = �animationForState(actor, s).name.toFirstLower�Animation;
				resetStateTime();
				enter�s.name.toFirstUpper�State();
			'''
		]]
	}
	
	def enterState(Actor actor) {
		actor.normalizedStates.map[s | actor.toMethod("enter" + s.name.toFirstUpper + "State", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = ''''''
		]]
	}
	
	def animationForState(Actor actor, State state) {
		state.animation ?: actor.animations.findFirst[a | a.name.equals(state.name)]
	}
	
	def _leaveState(Actor actor) {
		actor.normalizedStates.map[s | actor.toMethod("_leave" + s.name.toFirstUpper + "State", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				leave�s.name.toFirstUpper�State();
			'''			
		]]
	}
	
	def leaveState(Actor actor) {	
		actor.normalizedStates.map[s | actor.toMethod("leave" + s.name.toFirstUpper + "State", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = ''''''			
		]]
	}
	
	def draw(Actor actor) {
		actor.toMethod("draw", typeRef(void)) [
			parameters += actor.toParameter("batch", typeRef(Batch))
			parameters += actor.toParameter("parentAlpha", typeRef(float))
			visibility = JvmVisibility.PUBLIC
			annotationRef(Override)
			body = '''�drawStateCalls(actor)�'''
		]
	}
	
	def drawStateCalls(Actor actor) '''
		switch (currentState) {
			�FOR State state : actor.normalizedStates�
				case �state.name.toUpperCase�:
					draw�state.name.toFirstUpper�State(batch, parentAlpha);
					break;
			�ENDFOR�
			default:
				super.draw(batch, parentAlpha);
		}
	'''
	
	def drawState(Actor actor) {
		actor.normalizedStates.map[s | actor.toMethod("draw" + s.name.toFirstUpper + "State", typeRef(void)) [
			parameters += actor.toParameter("batch", typeRef(Batch))
			parameters += actor.toParameter("parentAlpha", typeRef(float))
			visibility = JvmVisibility.PROTECTED
			body = '''drawAnimation(batch, parentAlpha, currentAnimation);'''	
		]]	
	}
	
	def drawAnimation(Actor actor) {
		actor.toMethod("drawAnimation", typeRef(void)) [
			parameters += actor.toParameter("batch", typeRef(Batch))
			parameters += actor.toParameter("parentAlpha", typeRef(float))
			parameters += actor.toParameter("animation", typeRef(Animation))
			visibility = JvmVisibility.PROTECTED
			body = '''
				if (animation != null) {
					final �TextureRegion� region = animation.getKeyFrame(animationStateTime, true);
					batch.draw(region, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
				}
			'''	
		]
	}
	
	def act(Actor actor) {
		actor.toMethod("act", typeRef(void)) [
			parameters += actor.toParameter("delta", typeRef(float))
			visibility = JvmVisibility.PUBLIC
			annotationRef(Override)
			body = '''�actStateCalls(actor)�'''
		]
	}
	
	def actStateCalls(Actor actor) '''
		switch (currentState) {
			�FOR State state : actor.normalizedStates�
				case �state.name.toUpperCase�:
					_act�state.name.toFirstUpper�State(delta);
					break;
			�ENDFOR�
			default:
				super.act(delta);
		}
	'''
	
	def _actState(Actor actor) {
		actor.normalizedStates.map[s | actor.toMethod("_act" + s.name.toFirstUpper + "State", typeRef(void)) [
			parameters += actor.toParameter("delta", typeRef(float))
			visibility = JvmVisibility.PROTECTED
			body = '''
				animationStateTime += delta;
				act�s.name.toFirstUpper�State(delta);
			'''	
		]]
	}
	
	def actState(Actor actor) {
		actor.normalizedStates.map[s | actor.toMethod("act" + s.name.toFirstUpper + "State", typeRef(void)) [
			parameters += actor.toParameter("delta", typeRef(float))
			visibility = JvmVisibility.PROTECTED
			body = ''''''	
		]]
	}
	
	def resetStateTime(Actor actor) {
		actor.toMethod("resetStateTime", typeRef(void)) [
			body = '''animationStateTime = 0.0f;'''
		]
	}
}

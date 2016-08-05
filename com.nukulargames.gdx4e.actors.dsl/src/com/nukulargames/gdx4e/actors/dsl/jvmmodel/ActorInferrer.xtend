package com.nukulargames.gdx4e.actors.dsl.jvmmodel

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.graphics.Color
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.Animation
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.TextureRegion
import com.google.inject.Inject
import com.nukulargames.gdx4e.actors.Actor
import com.nukulargames.gdx4e.actors.ActorReference
import com.nukulargames.gdx4e.actors.Model
import com.nukulargames.gdx4e.actors.State
import com.nukulargames.gdx4e.ext.NukuActor
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class ActorInferrer {

	@Inject JvmAnnotationReferenceBuilder.Factory annotationRefBuilderFactory
	@Inject JvmTypeReferenceBuilder.Factory typeRefBuilderFactory
	extension JvmAnnotationReferenceBuilder _annotationTypesBuilder
	extension JvmTypeReferenceBuilder _typeReferenceBuilder
	@Inject extension JvmTypesBuilder

	def initBuilders(EObject object) {
		_annotationTypesBuilder = annotationRefBuilderFactory.create(object.eResource.resourceSet);
		_typeReferenceBuilder = typeRefBuilderFactory.create(object.eResource.resourceSet);
	}

	def void infer(Actor element, Model model, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		initBuilders(element)

		val genClass = element.toClass(model.basePackageName + genClassName(element))
		acceptor.accept(genClass) [
			superTypes += superType(element)

			members += assetManager(element)

			members += stateEnum(element)
			members += currentState(element)

			members += dummyFields(element)

			members += textureFields(element)
			members += animationFields(element)
			members += currentAnimationField(element)
			members += stateTimeField(element)

			members += childField(element)

			members += constructor(element)
			members += init(element)
			members += initPosition(element)
			members += initSize(element)
			members += initScale(element)
			members += initRotation(element)
			members += initColor(element)
			members += initAnimations(element)
			members += initState(element)

			members += createTexture(element)
			members += createAnimation(element)

			members += getAnimation(element)

			members += getAssetManager(element)

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

			members += getChildQuantity(element)
			members += getChild(element)
			members += createAllChildren(element)
			members += createChild(element)
			members += createEachChild(element)
			members += initAllChildren(element)
			members += initChild(element)

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

	def genClassName(Actor actor) {
		actor.name + "Gen"
	}

	def superType(Actor actor) {
		typeRef(NukuActor)
	}

	def assetManager(Actor actor) {
		actor.toField("assetManager", typeRef(AssetManager)) [
			static = true
			visibility = JvmVisibility.PROTECTED
			final = true
			initializer = '''new AssetManager()'''
		]
	}

	def stateEnum(Actor actor) {
		actor.toEnumerationType("States") [
			members += actor.normalizedStates.map[s|actor.toEnumerationLiteral(s.name.toUpperCase)]
		]
	}

	def currentState(Actor actor) {
		actor.toField("currentState", typeRef("States")) [
			visibility = JvmVisibility.PRIVATE
			initializer = '''null'''
		]
	}

	def dummyFields(Actor actor) {
		Arrays.asList(actor.toField("importListDummy", typeRef(List)),
			actor.toField("importArrayListDummy", typeRef(ArrayList)))
	}

	def textureFields(Actor actor) {
		actor.normalizedAnimations.map [ a |
			actor.toField(a.name.toFirstLower + "Texture", typeRef(Texture)) [
				visibility = JvmVisibility.PRIVATE
			]
		]
	}

	def animationFields(Actor actor) {
		actor.normalizedAnimations.map [ a |
			actor.toField(a.name.toFirstLower + "Animation", typeRef(Animation)) [
				visibility = JvmVisibility.PRIVATE
			]
		]
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

	def childField(Actor actor) {
		actor.children.map [ c |
			actor.toField(c.normalizedName.toFirstLower, if (c.quantity > 1)
				typeRef('''«List.simpleName»''' + "<" + c.normalizedReference.name + ">")
			else
				typeRef(c.normalizedReference.name)) [
				visibility = JvmVisibility.PRIVATE
			]
		]
	}

	def constructor(Actor actor) {
		actor.toConstructor [
			visibility = JvmVisibility.PUBLIC
			body = '''
				super();
				createAllChildren();
			'''
		]
	}

	def init(Actor actor) {
		actor.toMethod("init", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.PUBLIC
			annotationRef(Override)
			body = '''
				super.init();
				initAnimations();
				initState();
				initAllChildren(); 
				return this;
			'''
		]
	}

	def initPosition(Actor actor) {
		actor.toMethod("initPosition", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setX((float) «actor.x»);
				setY((float) «actor.y»);
				return this;
			'''
		]
	}

	def initSize(Actor actor) {
		actor.toMethod("initSize", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setWidth((float) «actor.width»);
				setHeight((float) «actor.height»);
				return this;
			'''
		]
	}

	def initScale(Actor actor) {
		actor.toMethod("initScale", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setScaleX((float) «actor.scaleX»);
				setScaleY((float) «actor.scaleY»);
				return this;
			'''
		]
	}

	def initRotation(Actor actor) {
		actor.toMethod("initRotation", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setRotation((float) «actor.rotation»);
				return this;
			'''
		]
	}

	def initColor(Actor actor) {
		actor.toMethod("initColor", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				setColor((float) «actor.red», (float) «actor.green», (float) «actor.blue», (float) «actor.alpha»);
				return this;
			'''
		]
	}

	def createTexture(Actor actor) {
		actor.normalizedAnimations.map [ a |
			actor.toMethod("create" + a.name.toFirstUpper + "Texture", typeRef(Texture)) [
				visibility = JvmVisibility.PROTECTED
				annotationRef(
					Override)
				body = '''
					assetManager.load("«a.texture ?: (actor.name.substring(actor.name.lastIndexOf('.') + 1) + "_" + a.name + ".png")»", Texture.class);
					assetManager.finishLoading();
					return assetManager.get("«a.texture ?: (actor.name.substring(actor.name.lastIndexOf('.') + 1) + "_" + a.name + ".png")»", Texture.class);
				'''
			]
		]
	}

	def createAnimation(Actor actor) {
		actor.normalizedAnimations.map [ a |
			actor.toMethod("create" + a.name.toFirstUpper + "Animation", typeRef(Animation)) [
				visibility = JvmVisibility.PROTECTED
				annotationRef(
					Override)
				body = '''return createAnimation(«a.name.toFirstLower»Texture, «a.rows», «a.columns», (float) «a.delay»);'''
			]
		]
	}

	def initAnimations(Actor actor) {
		actor.toMethod("initAnimations", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.PROTECTED
			annotationRef(Override)
			body = '''
				«FOR com.nukulargames.gdx4e.actors.Animation animation : actor.normalizedAnimations»
					«animation.name.toFirstLower»Texture = create«animation.name.toFirstUpper»Texture();
					«animation.name.toFirstLower»Animation = create«animation.name.toFirstUpper»Animation();
				«ENDFOR»
				return this;
			'''
		]
	}

	def initState(Actor actor) {
		actor.toMethod("initState", typeRef(genClassName(actor))) [
			visibility = JvmVisibility.
				PROTECTED
			body = '''
				«val stateName = actor?.defaultState?.name?.toFirstUpper ?: actor?.states?.head?.name?.toFirstUpper ?: "Default"»
				_enter«stateName»State();
				return this;
			'''
		]
	}

	def getAnimation(Actor actor) {
		actor.animations.map [ a |
			actor.toMethod("get" + a.name.toFirstUpper + "Animation", typeRef(Animation)) [
				visibility = JvmVisibility.PUBLIC
				body = '''
					return «a.name.toFirstLower»Animation;
				'''
			]
		]
	}

	def getAssetManager(Actor actor) {
		actor.toMethod("getAssetManager", typeRef(AssetManager)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				return assetManager;
			'''
		]
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
					«FOR State state : actor.normalizedStates»
						case «state.name.toUpperCase»:
							_leave«state.name.toFirstUpper»State();
							break;
					«ENDFOR»
					default:
				}
				
				switch (next) {
					«FOR State state : actor.normalizedStates»
						case «state.name.toUpperCase»:
							_enter«state.name.toFirstUpper»State();
							break;
					«ENDFOR»
					default:
				}
			'''
		]
	}

	def _enterState(Actor actor) {
		actor.normalizedStates.map [ s |
			actor.toMethod("_enter" + s.name.toFirstUpper + "State", typeRef(void)) [
				visibility = JvmVisibility.PROTECTED
				body = '''
					currentAnimation = «animationForState(actor, s).name.toFirstLower»Animation;
					resetStateTime();
					enter«s.name.toFirstUpper»State();
					currentState = States.«s.name.toUpperCase»;
				'''
			]
		]
	}

	def enterState(Actor actor) {
		actor.normalizedStates.map [ s |
			actor.toMethod("enter" + s.name.toFirstUpper + "State", typeRef(void)) [
				visibility = JvmVisibility.PROTECTED
				body = ''''''
			]
		]
	}

	def animationForState(Actor actor, State state) {
		state.animation ?: actor.normalizedAnimations.findFirst[a|a.name.equals(state.name)] ?:
			actor.normalizedAnimations.head
	}

	def _leaveState(Actor actor) {
		actor.normalizedStates.map [ s |
			actor.toMethod("_leave" + s.name.toFirstUpper + "State", typeRef(void)) [
				visibility = JvmVisibility.PROTECTED
				body = '''
					leave«s.name.toFirstUpper»State();
				'''
			]
		]
	}

	def leaveState(Actor actor) {
		actor.normalizedStates.map [ s |
			actor.toMethod("leave" + s.name.toFirstUpper + "State", typeRef(void)) [
				visibility = JvmVisibility.PROTECTED
				body = ''''''
			]
		]
	}

	def draw(Actor actor) {
		actor.toMethod("draw", typeRef(void)) [
			parameters += actor.toParameter("batch", typeRef(Batch))
			parameters += actor.toParameter("parentAlpha", typeRef(float))
			visibility = JvmVisibility.PUBLIC
			annotationRef(Override)
			body = '''«drawStateCalls(actor)»'''
		]
	}

	def drawStateCalls(Actor actor) '''
		switch (currentState) {
			«FOR State state : actor.normalizedStates»
				case «state.name.toUpperCase»:
					draw«state.name.toFirstUpper»State(batch, parentAlpha);
					break;
			«ENDFOR»
			default:
		}
		super.draw(batch, parentAlpha);
	'''

	def drawState(Actor actor) {
		actor.normalizedStates.map [ s |
			actor.toMethod("draw" + s.name.toFirstUpper + "State", typeRef(void)) [
				parameters += actor.toParameter("batch", typeRef(Batch))
				parameters += actor.toParameter("parentAlpha", typeRef(float))
				visibility = JvmVisibility.PROTECTED
				body = '''drawAnimation(batch, parentAlpha, currentAnimation);'''
			]
		]
	}

	def drawAnimation(Actor actor) {
		actor.toMethod("drawAnimation", typeRef(void)) [
			parameters += actor.toParameter("batch", typeRef(Batch))
			parameters += actor.toParameter("parentAlpha", typeRef(float))
			parameters += actor.toParameter("animation", typeRef(Animation))
			visibility = JvmVisibility.PROTECTED
			body = '''
				if (animation != null) {
					final «TextureRegion» region = animation.getKeyFrame(animationStateTime, true);
					«Color» tint = batch.getColor();
					batch.setColor(getColor());
					batch.draw(region, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());
					batch.setColor(tint);
				}
			'''
		]
	}

	def act(Actor actor) {
		actor.toMethod("act", typeRef(void)) [
			parameters += actor.toParameter("delta", typeRef(float))
			visibility = JvmVisibility.PUBLIC
			annotationRef(Override)
			body = '''«actStateCalls(actor)»'''
		]
	}

	def actStateCalls(Actor actor) '''
		switch (currentState) {
			«FOR State state : actor.normalizedStates»
				case «state.name.toUpperCase»:
					_act«state.name.toFirstUpper»State(delta);
					break;
			«ENDFOR»
			default:
		}
		super.act(delta);
	'''

	def _actState(Actor actor) {
		actor.normalizedStates.map [ s |
			actor.toMethod("_act" + s.name.toFirstUpper + "State", typeRef(void)) [
				parameters += actor.toParameter("delta", typeRef(float))
				visibility = JvmVisibility.PROTECTED
				body = '''
					animationStateTime += delta;
					act«s.name.toFirstUpper»State(delta);
				'''
			]
		]
	}

	def actState(Actor actor) {
		actor.normalizedStates.map [ s |
			actor.toMethod("act" + s.name.toFirstUpper + "State", typeRef(void)) [
				parameters += actor.toParameter("delta", typeRef(float))
				visibility = JvmVisibility.PROTECTED
				body = ''''''
			]
		]
	}

	def resetStateTime(Actor actor) {
		actor.toMethod("resetStateTime", typeRef(void)) [
			body = '''animationStateTime = 0.0f;'''
		]
	}

	def getChildQuantity(Actor element) {
		element.children.filter[c|c.quantity > 1].map [ c |
			c.normalizedReference.toMethod("getChild" + c.normalizedName + "Quantity", typeRef(int)) [
				visibility = JvmVisibility.PROTECTED
				body = '''return «c.quantity»;'''
			]
		]
	}

	def createAllChildren(Actor element) {
		element.toMethod("createAllChildren", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				«FOR ActorReference r : element.children»
					createChild«r.normalizedName»();
				«ENDFOR»
			'''
		]
	}

	def createChild(Actor element) {
		element.children.map [ c |
			if (c.quantity > 1) {
				c.normalizedReference.toMethod("createChild" + c.normalizedName, typeRef(void)) [
					visibility = JvmVisibility.PROTECTED
					body = '''
						final «int» quantity = getChild«c.normalizedName»Quantity();
						«c.normalizedName.toFirstLower» = new «ArrayList.simpleName»<>(quantity);
						for («int» i = 0; i < quantity; ++i) {
							final «c.normalizedName» child = createEachChild«c.normalizedName»();
							«c.normalizedName.toFirstLower».add(child);
							addActor(child);
						}
					'''
				]
			} else {
				c.normalizedReference.toMethod("createChild" + c.normalizedName, typeRef(void)) [
					visibility = JvmVisibility.PROTECTED
					body = '''
						«c.normalizedName.toFirstLower» = createEachChild«c.normalizedName»();
						addActor(«c.normalizedName.toFirstLower»);
					'''
				]
			}
		]
	}

	def createEachChild(Actor element) {
		element.children.map [ c |
			c.normalizedReference.toMethod("createEachChild" + c.normalizedName, typeRef(c.normalizedReference.name)) [
				visibility = JvmVisibility.PROTECTED
				body = '''return («typeRef(c.normalizedReference.name)») new «c.normalizedReference.name»();'''
			]
		]
	}

	def initAllChildren(Actor element) {
		element.toMethod("initAllChildren", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				«FOR ActorReference r : element.children»
					initChild«r.normalizedName»();
				«ENDFOR»
			'''
		]
	}

	def initChild(Actor element) {
		element.children.map [ c |
			c.normalizedReference.toMethod("initChild" + c.normalizedName, typeRef(void)) [
				visibility = JvmVisibility.PROTECTED
				body = ''''''
			]
		]
	}

	def getChild(Actor element) {
		element.children.map [ c |
			if (c.quantity > 1)
				c.normalizedReference.toMethod("getChildren" + c.normalizedName,
					typeRef("List<" + c.normalizedReference.name + ">")) [
					visibility = JvmVisibility.PROTECTED
					body = '''return «c.normalizedName.toFirstLower»;'''
				]
			else
				c.normalizedReference.toMethod("getChild" + c.normalizedName, typeRef(c.normalizedReference.name)) [
					visibility = JvmVisibility.PROTECTED
					body = '''return «c.normalizedName.toFirstLower»;'''
				]
		]
	}

}

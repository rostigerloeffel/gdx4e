package com.nukulargames.gdx4e.actors.dsl.jvmmodel

import com.badlogic.gdx.utils.viewport.Viewport
import com.google.inject.Inject
import com.nukulargames.gdx4e.actors.ActorReference
import com.nukulargames.gdx4e.actors.Model
import com.nukulargames.gdx4e.actors.Stage
import com.nukulargames.gdx4e.ext.NukuStage
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

class StageInferrer {
	
	@Inject JvmAnnotationReferenceBuilder.Factory annotationRefBuilderFactory
	@Inject JvmTypeReferenceBuilder.Factory typeRefBuilderFactory
	extension JvmAnnotationReferenceBuilder _annotationTypesBuilder
	extension JvmTypeReferenceBuilder _typeReferenceBuilder	
	@Inject extension JvmTypesBuilder
	
	def initBuilders(EObject object) {
		_annotationTypesBuilder = annotationRefBuilderFactory.create(object.eResource.resourceSet);
		_typeReferenceBuilder = typeRefBuilderFactory.create(object.eResource.resourceSet);
	}

	def void infer(Stage element, Model model, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		initBuilders(element)
		
		val genClass = element.toClass(model.basePackageName + genClassName(element))
		acceptor.accept(genClass) [
			superTypes += superType(element)
			
			members += dummyFields(element)
			
			members += childField(element)
			
			members += genClassConstructor(element)
			
			members += init(element)
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
			
			members += constructor(element)
		]
	}

	def basePackageName(Model model) {
		if (model.basePackage.nullOrEmpty) {
			""
		} else {
			model.basePackage + "."
		}
	}
	
	def genClassName(Stage element) {
		element.name + "Gen"
	}

	def superType(Stage stage) {
		typeRef(NukuStage)
	}
	
	def dummyFields(Stage stage) {
		Arrays.asList(stage.toField("importListDummy", typeRef(List)),
			stage.toField("importArrayListDummy", typeRef(ArrayList)))
	}
	
	def childField(Stage stage) {
		stage.actors.map [ a |
			stage.toField(a.normalizedName.toFirstLower, if (a.quantity > 1)
				typeRef('''«List.simpleName»''' + "<" + a.normalizedReference.name + ">")
			else
				typeRef(a.normalizedReference.name)) [
				visibility = JvmVisibility.PRIVATE
			]
		]
	}

	def genClassConstructor(Stage stage) {
		stage.toConstructor [
			visibility = JvmVisibility.PUBLIC
			parameters += stage.toParameter("viewport", typeRef(Viewport))
			body = '''
				super(viewport);
				createAllChildren();
			'''
		]
	}

	def constructor(Stage stage) {
		stage.toConstructor [
			visibility = JvmVisibility.PUBLIC
			parameters += stage.toParameter("viewport", typeRef(Viewport))
			body = '''
				super(viewport);
			'''
		]
	}

	def init(Stage element) {
		element.toMethod("init", typeRef(genClassName(element))) [
			visibility = JvmVisibility.PUBLIC
			body = '''
				initAllChildren();
				return this;
			'''
		]
	}

	def getChildQuantity(Stage element) {
		element.actors.filter[c|c.quantity > 1].map [ c |
			c.normalizedReference.toMethod("getChild" + c.normalizedName + "Quantity", typeRef(int)) [
				visibility = JvmVisibility.PROTECTED
				body = '''return «c.quantity»;'''
			]
		]
	}

	def createAllChildren(Stage element) {
		element.toMethod("createAllChildren", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				«FOR ActorReference r : element.actors»
					createChild«r.normalizedName»();
				«ENDFOR»
			'''
		]
	}

	def createChild(Stage element) {
		element.actors.map [ c |
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

	def createEachChild(Stage element) {
		element.actors.map [ c |
			c.normalizedReference.toMethod("createEachChild" + c.normalizedName, typeRef(c.normalizedReference.name)) [
				visibility = JvmVisibility.PROTECTED
				body = '''return («typeRef(c.normalizedReference.name)») new «c.normalizedReference.name»();'''
			]
		]
	}

	def initAllChildren(Stage element) {
		element.toMethod("initAllChildren", typeRef(void)) [
			visibility = JvmVisibility.PROTECTED
			body = '''
				«FOR ActorReference r : element.actors»
					initChild«r.normalizedName»();
				«ENDFOR»
			'''
		]
	}

	def initChild(Stage element) {
		element.actors.map [ c |
			c.normalizedReference.toMethod("initChild" + c.normalizedName, typeRef(void)) [
				visibility = JvmVisibility.PROTECTED
				body = ''''''
			]
		]
	}

	def getChild(Stage element) {
		element.actors.map [ c |
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

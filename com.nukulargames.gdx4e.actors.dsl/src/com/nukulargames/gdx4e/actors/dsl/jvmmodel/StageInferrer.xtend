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
		
		val genClass = element.toClass(model.basePackageName + element.name + "Gen")
		acceptor.accept(genClass) [
			superTypes += superType(element)
			
			members += dummyFields(element)
			
			members += childField(element)
			
			members += genClassConstructor(element)
			
			members += initAllChildren(element)
			members += initChild(element)
			members += initChildQuantity(element)
			members += initEachChild(element)
			members += getChild(element)
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
				initAllChildren(); 
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
		element.actors.map [ a |
			if (a.quantity > 1) {
				a.normalizedReference.toMethod("initChild" + a.normalizedName, typeRef(void)) [
					visibility = JvmVisibility.PROTECTED
					body = '''
						«int» quantity = initChild«a.normalizedName»Quantity();
						«a.normalizedName.toFirstLower» = new «ArrayList.simpleName»<>(quantity);
						for («int» i = 0; i < quantity; ++i) {
							«a.normalizedName» child = initEachChild«a.normalizedName»();
							«a.normalizedName.toFirstLower».add(child);
							addActor(child);
						}
					'''
				]
			} else {
				a.normalizedReference.toMethod("initChild" + a.normalizedName, typeRef(void)) [
					visibility = JvmVisibility.PROTECTED
					body = '''
						«a.normalizedName.toFirstLower» = initEachChild«a.normalizedName»();
						addActor(«a.normalizedName.toFirstLower»);
					'''
				]
			}
		]
	}

	def initChildQuantity(Stage element) {
		element.actors.filter[a|a.quantity > 1].map [ a |
			a.normalizedReference.toMethod("initChild" + a.normalizedName + "Quantity", typeRef(int)) [
				visibility = JvmVisibility.PROTECTED
				body = '''return «a.quantity»;'''
			]
		]
	}

	def initEachChild(Stage element) {
		element.actors.map [ a |
			a.normalizedReference.toMethod("initEachChild" + a.normalizedName, typeRef(a.normalizedReference.name)) [
				visibility = JvmVisibility.PROTECTED
				body = '''return new «a.normalizedReference.name»();'''
			]
		]
	}

	def getChild(Stage element) {
		element.actors.map [ a |
			if (a.quantity > 1)
				a.normalizedReference.toMethod("getChildren" + a.normalizedName,
					typeRef("List<" + a.normalizedReference.name + ">")) [
					visibility = JvmVisibility.PROTECTED
					body = '''return «a.normalizedName.toFirstLower»;'''
				]
			else
				a.normalizedReference.toMethod("getChild" + a.normalizedName, typeRef(a.normalizedReference.name)) [
					visibility = JvmVisibility.PROTECTED
					body = '''return «a.normalizedName.toFirstLower»;'''
				]
		]
	}

}

package com.nukulargames.gdx4e.actors.dsl.jvmmodel

import com.google.inject.Inject
import com.nukulargames.gdx4e.actors.Model
import com.nukulargames.gdx4e.actors.Stage
import com.nukulargames.gdx4e.ext.NukuStage
import org.eclipse.emf.ecore.EObject
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

	def superType(Stage stage) {
		typeRef(NukuStage)
	}

}

/*
 * generated by Xtext 2.9.1
 */
package com.nukulargames.gdx4e.actors.dsl.generator

import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.compiler.DisableCodeGenerationAdapter
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class DslGenerator extends JvmModelGenerator {

	@Inject IGeneratorConfigProvider generatorConfigProvider

	override dispatch void internalDoGenerate(JvmDeclaredType type, IFileSystemAccess fsa) {
		if (DisableCodeGenerationAdapter.isDisabled(type) || type.qualifiedName == null)
			return;
		if (type.simpleName.endsWith("Gen")) {
			fsa.generateFile(type.qualifiedName.replace('.', '/') + '.java', type.generateType(generatorConfigProvider.get(type)))
		} else {
			fsa.generateFile(type.qualifiedName.replace('.', '/') + '.java', Stage2dOutputConfigurationProvider.DEFAULT_OUTPUT_ONCE, type.generateType(generatorConfigProvider.get(type)))
		}
	}
	
}

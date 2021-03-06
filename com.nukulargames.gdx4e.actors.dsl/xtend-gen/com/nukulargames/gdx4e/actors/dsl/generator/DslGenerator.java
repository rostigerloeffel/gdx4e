/**
 * generated by Xtext 2.9.1
 */
package com.nukulargames.gdx4e.actors.dsl.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.nukulargames.gdx4e.actors.dsl.generator.Stage2dOutputConfigurationProvider;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.compiler.DisableCodeGenerationAdapter;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class DslGenerator extends JvmModelGenerator {
  @Inject
  private IGeneratorConfigProvider generatorConfigProvider;
  
  @Override
  protected void _internalDoGenerate(final JvmDeclaredType type, final IFileSystemAccess fsa) {
    if ((DisableCodeGenerationAdapter.isDisabled(type) || Objects.equal(type.getQualifiedName(), null))) {
      return;
    }
    String _simpleName = type.getSimpleName();
    boolean _endsWith = _simpleName.endsWith("Gen");
    if (_endsWith) {
      String _qualifiedName = type.getQualifiedName();
      String _replace = _qualifiedName.replace(".", "/");
      String _plus = (_replace + ".java");
      GeneratorConfig _get = this.generatorConfigProvider.get(type);
      CharSequence _generateType = this.generateType(type, _get);
      fsa.generateFile(_plus, _generateType);
    } else {
      String _qualifiedName_1 = type.getQualifiedName();
      String _replace_1 = _qualifiedName_1.replace(".", "/");
      String _plus_1 = (_replace_1 + ".java");
      GeneratorConfig _get_1 = this.generatorConfigProvider.get(type);
      CharSequence _generateType_1 = this.generateType(type, _get_1);
      fsa.generateFile(_plus_1, Stage2dOutputConfigurationProvider.DEFAULT_OUTPUT_ONCE, _generateType_1);
    }
  }
  
  public void internalDoGenerate(final EObject type, final IFileSystemAccess fsa) {
    if (type instanceof JvmDeclaredType) {
      _internalDoGenerate((JvmDeclaredType)type, fsa);
      return;
    } else if (type != null) {
      _internalDoGenerate(type, fsa);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(type, fsa).toString());
    }
  }
}

package com.nukulargames.gdx4e.actors.dsl.jvmmodel;

import com.google.inject.Inject;
import com.nukulargames.gdx4e.actors.Model;
import com.nukulargames.gdx4e.actors.Stage;
import com.nukulargames.gdx4e.ext.NukuStage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class StageInferrer {
  @Inject
  private JvmAnnotationReferenceBuilder.Factory annotationRefBuilderFactory;
  
  @Inject
  private JvmTypeReferenceBuilder.Factory typeRefBuilderFactory;
  
  @Extension
  private JvmAnnotationReferenceBuilder _annotationTypesBuilder;
  
  @Extension
  private JvmTypeReferenceBuilder _typeReferenceBuilder;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  public JvmTypeReferenceBuilder initBuilders(final EObject object) {
    JvmTypeReferenceBuilder _xblockexpression = null;
    {
      Resource _eResource = object.eResource();
      ResourceSet _resourceSet = _eResource.getResourceSet();
      JvmAnnotationReferenceBuilder _create = this.annotationRefBuilderFactory.create(_resourceSet);
      this._annotationTypesBuilder = _create;
      Resource _eResource_1 = object.eResource();
      ResourceSet _resourceSet_1 = _eResource_1.getResourceSet();
      JvmTypeReferenceBuilder _create_1 = this.typeRefBuilderFactory.create(_resourceSet_1);
      _xblockexpression = this._typeReferenceBuilder = _create_1;
    }
    return _xblockexpression;
  }
  
  public void infer(final Stage element, final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    this.initBuilders(element);
    String _basePackageName = this.basePackageName(model);
    String _name = element.getName();
    String _plus = (_basePackageName + _name);
    String _plus_1 = (_plus + "Gen");
    final JvmGenericType genClass = this._jvmTypesBuilder.toClass(element, _plus_1);
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _superType = this.superType(element);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _superType);
    };
    acceptor.<JvmGenericType>accept(genClass, _function);
    String _basePackageName_1 = this.basePackageName(model);
    String _name_1 = element.getName();
    String _plus_2 = (_basePackageName_1 + _name_1);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus_2);
    final Procedure1<JvmGenericType> _function_1 = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(genClass);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
    };
    acceptor.<JvmGenericType>accept(_class, _function_1);
  }
  
  public String basePackageName(final Model model) {
    String _xifexpression = null;
    String _basePackage = model.getBasePackage();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_basePackage);
    if (_isNullOrEmpty) {
      _xifexpression = "";
    } else {
      String _basePackage_1 = model.getBasePackage();
      _xifexpression = (_basePackage_1 + ".");
    }
    return _xifexpression;
  }
  
  public JvmTypeReference superType(final Stage stage) {
    return this._typeReferenceBuilder.typeRef(NukuStage.class);
  }
}

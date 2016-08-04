package com.nukulargames.gdx4e.actors.dsl.jvmmodel;

import com.badlogic.gdx.utils.viewport.Viewport;
import com.google.inject.Inject;
import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.ActorReference;
import com.nukulargames.gdx4e.actors.Model;
import com.nukulargames.gdx4e.actors.Stage;
import com.nukulargames.gdx4e.ext.NukuStage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.JvmAnnotationReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypeReferenceBuilder;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
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
    String _genClassName = this.genClassName(element);
    String _plus = (_basePackageName + _genClassName);
    final JvmGenericType genClass = this._jvmTypesBuilder.toClass(element, _plus);
    final Procedure1<JvmGenericType> _function = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _superType = this.superType(element);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _superType);
      EList<JvmMember> _members = it.getMembers();
      List<JvmField> _dummyFields = this.dummyFields(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members, _dummyFields);
      EList<JvmMember> _members_1 = it.getMembers();
      List<JvmField> _childField = this.childField(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_1, _childField);
      EList<JvmMember> _members_2 = it.getMembers();
      JvmConstructor _genClassConstructor = this.genClassConstructor(element);
      this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_2, _genClassConstructor);
      EList<JvmMember> _members_3 = it.getMembers();
      JvmOperation _init = this.init(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_3, _init);
      EList<JvmMember> _members_4 = it.getMembers();
      JvmOperation _initAllChildren = this.initAllChildren(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _initAllChildren);
      EList<JvmMember> _members_5 = it.getMembers();
      List<JvmOperation> _initChild = this.initChild(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_5, _initChild);
      EList<JvmMember> _members_6 = it.getMembers();
      Iterable<JvmOperation> _initChildQuantity = this.initChildQuantity(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_6, _initChildQuantity);
      EList<JvmMember> _members_7 = it.getMembers();
      List<JvmOperation> _initEachChild = this.initEachChild(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_7, _initEachChild);
      EList<JvmMember> _members_8 = it.getMembers();
      List<JvmOperation> _child = this.getChild(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_8, _child);
    };
    acceptor.<JvmGenericType>accept(genClass, _function);
    String _basePackageName_1 = this.basePackageName(model);
    String _name = element.getName();
    String _plus_1 = (_basePackageName_1 + _name);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(element, _plus_1);
    final Procedure1<JvmGenericType> _function_1 = (JvmGenericType it) -> {
      EList<JvmTypeReference> _superTypes = it.getSuperTypes();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(genClass);
      this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
      EList<JvmMember> _members = it.getMembers();
      JvmConstructor _constructor = this.constructor(element);
      this._jvmTypesBuilder.<JvmConstructor>operator_add(_members, _constructor);
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
  
  public String genClassName(final Stage element) {
    String _name = element.getName();
    return (_name + "Gen");
  }
  
  public JvmTypeReference superType(final Stage stage) {
    return this._typeReferenceBuilder.typeRef(NukuStage.class);
  }
  
  public List<JvmField> dummyFields(final Stage stage) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(List.class);
    JvmField _field = this._jvmTypesBuilder.toField(stage, "importListDummy", _typeRef);
    JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(ArrayList.class);
    JvmField _field_1 = this._jvmTypesBuilder.toField(stage, "importArrayListDummy", _typeRef_1);
    return Arrays.<JvmField>asList(_field, _field_1);
  }
  
  public List<JvmField> childField(final Stage stage) {
    EList<ActorReference> _actors = stage.getActors();
    final Function1<ActorReference, JvmField> _function = (ActorReference a) -> {
      String _normalizedName = a.getNormalizedName();
      String _firstLower = StringExtensions.toFirstLower(_normalizedName);
      JvmTypeReference _xifexpression = null;
      int _quantity = a.getQuantity();
      boolean _greaterThan = (_quantity > 1);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        String _simpleName = List.class.getSimpleName();
        _builder.append(_simpleName, "");
        String _plus = (_builder.toString() + "<");
        Actor _normalizedReference = a.getNormalizedReference();
        String _name = _normalizedReference.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + ">");
        _xifexpression = this._typeReferenceBuilder.typeRef(_plus_2);
      } else {
        Actor _normalizedReference_1 = a.getNormalizedReference();
        String _name_1 = _normalizedReference_1.getName();
        _xifexpression = this._typeReferenceBuilder.typeRef(_name_1);
      }
      final Procedure1<JvmField> _function_1 = (JvmField it) -> {
        it.setVisibility(JvmVisibility.PRIVATE);
      };
      return this._jvmTypesBuilder.toField(stage, _firstLower, _xifexpression, _function_1);
    };
    return ListExtensions.<ActorReference, JvmField>map(_actors, _function);
  }
  
  public JvmConstructor genClassConstructor(final Stage stage) {
    final Procedure1<JvmConstructor> _function = (JvmConstructor it) -> {
      it.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmFormalParameter> _parameters = it.getParameters();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Viewport.class);
      JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(stage, "viewport", _typeRef);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("super(viewport);");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toConstructor(stage, _function);
  }
  
  public JvmConstructor constructor(final Stage stage) {
    final Procedure1<JvmConstructor> _function = (JvmConstructor it) -> {
      it.setVisibility(JvmVisibility.PUBLIC);
      EList<JvmFormalParameter> _parameters = it.getParameters();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Viewport.class);
      JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(stage, "viewport", _typeRef);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("super(viewport);");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toConstructor(stage, _function);
  }
  
  public JvmOperation init(final Stage element) {
    String _genClassName = this.genClassName(element);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PUBLIC);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("initAllChildren();");
          _builder.newLine();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(element, "init", _typeRef, _function);
  }
  
  public JvmOperation initAllChildren(final Stage element) {
    String _genClassName = this.genClassName(element);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          {
            EList<ActorReference> _actors = element.getActors();
            for(final ActorReference r : _actors) {
              _builder.append("initChild");
              String _normalizedName = r.getNormalizedName();
              _builder.append(_normalizedName, "");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(element, "initAllChildren", _typeRef, _function);
  }
  
  public List<JvmOperation> initChild(final Stage element) {
    EList<ActorReference> _actors = element.getActors();
    final Function1<ActorReference, JvmOperation> _function = (ActorReference a) -> {
      JvmOperation _xifexpression = null;
      int _quantity = a.getQuantity();
      boolean _greaterThan = (_quantity > 1);
      if (_greaterThan) {
        Actor _normalizedReference = a.getNormalizedReference();
        String _normalizedName = a.getNormalizedName();
        String _plus = ("initChild" + _normalizedName);
        String _genClassName = this.genClassName(element);
        JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
        final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
          it.setVisibility(JvmVisibility.PROTECTED);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append(int.class, "");
              _builder.append(" quantity = initChild");
              String _normalizedName = a.getNormalizedName();
              _builder.append(_normalizedName, "");
              _builder.append("Quantity();");
              _builder.newLineIfNotEmpty();
              String _normalizedName_1 = a.getNormalizedName();
              String _firstLower = StringExtensions.toFirstLower(_normalizedName_1);
              _builder.append(_firstLower, "");
              _builder.append(" = new ");
              String _simpleName = ArrayList.class.getSimpleName();
              _builder.append(_simpleName, "");
              _builder.append("<>(quantity);");
              _builder.newLineIfNotEmpty();
              _builder.append("for (");
              _builder.append(int.class, "");
              _builder.append(" i = 0; i < quantity; ++i) {");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              String _normalizedName_2 = a.getNormalizedName();
              _builder.append(_normalizedName_2, "\t");
              _builder.append(" child = initEachChild");
              String _normalizedName_3 = a.getNormalizedName();
              _builder.append(_normalizedName_3, "\t");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              String _normalizedName_4 = a.getNormalizedName();
              String _firstLower_1 = StringExtensions.toFirstLower(_normalizedName_4);
              _builder.append(_firstLower_1, "\t");
              _builder.append(".add(child);");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("addActor(child);");
              _builder.newLine();
              _builder.append("}");
              _builder.newLine();
              _builder.append("return this;");
              _builder.newLine();
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        _xifexpression = this._jvmTypesBuilder.toMethod(_normalizedReference, _plus, _typeRef, _function_1);
      } else {
        Actor _normalizedReference_1 = a.getNormalizedReference();
        String _normalizedName_1 = a.getNormalizedName();
        String _plus_1 = ("initChild" + _normalizedName_1);
        String _genClassName_1 = this.genClassName(element);
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(_genClassName_1);
        final Procedure1<JvmOperation> _function_2 = (JvmOperation it) -> {
          it.setVisibility(JvmVisibility.PROTECTED);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              String _normalizedName = a.getNormalizedName();
              String _firstLower = StringExtensions.toFirstLower(_normalizedName);
              _builder.append(_firstLower, "");
              _builder.append(" = initEachChild");
              String _normalizedName_1 = a.getNormalizedName();
              _builder.append(_normalizedName_1, "");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
              _builder.append("addActor(");
              String _normalizedName_2 = a.getNormalizedName();
              String _firstLower_1 = StringExtensions.toFirstLower(_normalizedName_2);
              _builder.append(_firstLower_1, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
              _builder.append("return this;");
              _builder.newLine();
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        _xifexpression = this._jvmTypesBuilder.toMethod(_normalizedReference_1, _plus_1, _typeRef_1, _function_2);
      }
      return _xifexpression;
    };
    return ListExtensions.<ActorReference, JvmOperation>map(_actors, _function);
  }
  
  public Iterable<JvmOperation> initChildQuantity(final Stage element) {
    EList<ActorReference> _actors = element.getActors();
    final Function1<ActorReference, Boolean> _function = (ActorReference a) -> {
      int _quantity = a.getQuantity();
      return Boolean.valueOf((_quantity > 1));
    };
    Iterable<ActorReference> _filter = IterableExtensions.<ActorReference>filter(_actors, _function);
    final Function1<ActorReference, JvmOperation> _function_1 = (ActorReference a) -> {
      Actor _normalizedReference = a.getNormalizedReference();
      String _normalizedName = a.getNormalizedName();
      String _plus = ("initChild" + _normalizedName);
      String _plus_1 = (_plus + "Quantity");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(int.class);
      final Procedure1<JvmOperation> _function_2 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            int _quantity = a.getQuantity();
            _builder.append(_quantity, "");
            _builder.append(";");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(_normalizedReference, _plus_1, _typeRef, _function_2);
    };
    return IterableExtensions.<ActorReference, JvmOperation>map(_filter, _function_1);
  }
  
  public List<JvmOperation> initEachChild(final Stage element) {
    EList<ActorReference> _actors = element.getActors();
    final Function1<ActorReference, JvmOperation> _function = (ActorReference a) -> {
      Actor _normalizedReference = a.getNormalizedReference();
      String _normalizedName = a.getNormalizedName();
      String _plus = ("initEachChild" + _normalizedName);
      Actor _normalizedReference_1 = a.getNormalizedReference();
      String _name = _normalizedReference_1.getName();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_name);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return (");
            Actor _normalizedReference = a.getNormalizedReference();
            String _name = _normalizedReference.getName();
            JvmTypeReference _typeRef = StageInferrer.this._typeReferenceBuilder.typeRef(_name);
            _builder.append(_typeRef, "");
            _builder.append(") new ");
            Actor _normalizedReference_1 = a.getNormalizedReference();
            String _name_1 = _normalizedReference_1.getName();
            _builder.append(_name_1, "");
            _builder.append("().init();");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(_normalizedReference, _plus, _typeRef, _function_1);
    };
    return ListExtensions.<ActorReference, JvmOperation>map(_actors, _function);
  }
  
  public List<JvmOperation> getChild(final Stage element) {
    EList<ActorReference> _actors = element.getActors();
    final Function1<ActorReference, JvmOperation> _function = (ActorReference a) -> {
      JvmOperation _xifexpression = null;
      int _quantity = a.getQuantity();
      boolean _greaterThan = (_quantity > 1);
      if (_greaterThan) {
        Actor _normalizedReference = a.getNormalizedReference();
        String _normalizedName = a.getNormalizedName();
        String _plus = ("getChildren" + _normalizedName);
        Actor _normalizedReference_1 = a.getNormalizedReference();
        String _name = _normalizedReference_1.getName();
        String _plus_1 = ("List<" + _name);
        String _plus_2 = (_plus_1 + ">");
        JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_plus_2);
        final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
          it.setVisibility(JvmVisibility.PROTECTED);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("return ");
              String _normalizedName = a.getNormalizedName();
              String _firstLower = StringExtensions.toFirstLower(_normalizedName);
              _builder.append(_firstLower, "");
              _builder.append(";");
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        _xifexpression = this._jvmTypesBuilder.toMethod(_normalizedReference, _plus, _typeRef, _function_1);
      } else {
        Actor _normalizedReference_2 = a.getNormalizedReference();
        String _normalizedName_1 = a.getNormalizedName();
        String _plus_3 = ("getChild" + _normalizedName_1);
        Actor _normalizedReference_3 = a.getNormalizedReference();
        String _name_1 = _normalizedReference_3.getName();
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(_name_1);
        final Procedure1<JvmOperation> _function_2 = (JvmOperation it) -> {
          it.setVisibility(JvmVisibility.PROTECTED);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("return ");
              String _normalizedName = a.getNormalizedName();
              String _firstLower = StringExtensions.toFirstLower(_normalizedName);
              _builder.append(_firstLower, "");
              _builder.append(";");
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        _xifexpression = this._jvmTypesBuilder.toMethod(_normalizedReference_2, _plus_3, _typeRef_1, _function_2);
      }
      return _xifexpression;
    };
    return ListExtensions.<ActorReference, JvmOperation>map(_actors, _function);
  }
}

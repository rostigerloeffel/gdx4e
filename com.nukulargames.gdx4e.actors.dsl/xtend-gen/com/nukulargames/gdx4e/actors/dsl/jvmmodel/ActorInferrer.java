package com.nukulargames.gdx4e.actors.dsl.jvmmodel;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.google.inject.Inject;
import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.ActorReference;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.actors.Model;
import com.nukulargames.gdx4e.actors.State;
import com.nukulargames.gdx4e.ext.NukuActor;
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
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
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
public class ActorInferrer {
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
  
  public void infer(final Actor element, final Model model, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
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
      JvmField _assetManager = this.assetManager(element);
      this._jvmTypesBuilder.<JvmField>operator_add(_members, _assetManager);
      EList<JvmMember> _members_1 = it.getMembers();
      JvmEnumerationType _stateEnum = this.stateEnum(element);
      this._jvmTypesBuilder.<JvmEnumerationType>operator_add(_members_1, _stateEnum);
      EList<JvmMember> _members_2 = it.getMembers();
      JvmField _currentState = this.currentState(element);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_2, _currentState);
      EList<JvmMember> _members_3 = it.getMembers();
      List<JvmField> _dummyFields = this.dummyFields(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_3, _dummyFields);
      EList<JvmMember> _members_4 = it.getMembers();
      List<JvmField> _textureFields = this.textureFields(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_4, _textureFields);
      EList<JvmMember> _members_5 = it.getMembers();
      List<JvmField> _animationFields = this.animationFields(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_5, _animationFields);
      EList<JvmMember> _members_6 = it.getMembers();
      JvmField _currentAnimationField = this.currentAnimationField(element);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_6, _currentAnimationField);
      EList<JvmMember> _members_7 = it.getMembers();
      JvmField _stateTimeField = this.stateTimeField(element);
      this._jvmTypesBuilder.<JvmField>operator_add(_members_7, _stateTimeField);
      EList<JvmMember> _members_8 = it.getMembers();
      List<JvmField> _childField = this.childField(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_8, _childField);
      EList<JvmMember> _members_9 = it.getMembers();
      JvmConstructor _constructor = this.constructor(element);
      this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_9, _constructor);
      EList<JvmMember> _members_10 = it.getMembers();
      JvmOperation _init = this.init(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_10, _init);
      EList<JvmMember> _members_11 = it.getMembers();
      JvmOperation _initPosition = this.initPosition(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_11, _initPosition);
      EList<JvmMember> _members_12 = it.getMembers();
      JvmOperation _initSize = this.initSize(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_12, _initSize);
      EList<JvmMember> _members_13 = it.getMembers();
      JvmOperation _initScale = this.initScale(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_13, _initScale);
      EList<JvmMember> _members_14 = it.getMembers();
      JvmOperation _initRotation = this.initRotation(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_14, _initRotation);
      EList<JvmMember> _members_15 = it.getMembers();
      JvmOperation _initColor = this.initColor(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_15, _initColor);
      EList<JvmMember> _members_16 = it.getMembers();
      JvmOperation _initAnimations = this.initAnimations(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_16, _initAnimations);
      EList<JvmMember> _members_17 = it.getMembers();
      JvmOperation _initState = this.initState(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_17, _initState);
      EList<JvmMember> _members_18 = it.getMembers();
      List<JvmOperation> _createTexture = this.createTexture(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_18, _createTexture);
      EList<JvmMember> _members_19 = it.getMembers();
      List<JvmOperation> _createAnimation = this.createAnimation(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_19, _createAnimation);
      EList<JvmMember> _members_20 = it.getMembers();
      List<JvmOperation> _animation = this.getAnimation(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_20, _animation);
      EList<JvmMember> _members_21 = it.getMembers();
      JvmOperation _draw = this.draw(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_21, _draw);
      EList<JvmMember> _members_22 = it.getMembers();
      List<JvmOperation> _drawState = this.drawState(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_22, _drawState);
      EList<JvmMember> _members_23 = it.getMembers();
      JvmOperation _drawAnimation = this.drawAnimation(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_23, _drawAnimation);
      EList<JvmMember> _members_24 = it.getMembers();
      JvmOperation _act = this.act(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_24, _act);
      EList<JvmMember> _members_25 = it.getMembers();
      List<JvmOperation> __actState = this._actState(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_25, __actState);
      EList<JvmMember> _members_26 = it.getMembers();
      List<JvmOperation> _actState = this.actState(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_26, _actState);
      EList<JvmMember> _members_27 = it.getMembers();
      JvmOperation _resetStateTime = this.resetStateTime(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_27, _resetStateTime);
      EList<JvmMember> _members_28 = it.getMembers();
      JvmOperation _currentState_1 = this.getCurrentState(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_28, _currentState_1);
      EList<JvmMember> _members_29 = it.getMembers();
      JvmOperation _transit = this.transit(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_29, _transit);
      EList<JvmMember> _members_30 = it.getMembers();
      List<JvmOperation> __enterState = this._enterState(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_30, __enterState);
      EList<JvmMember> _members_31 = it.getMembers();
      List<JvmOperation> _enterState = this.enterState(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_31, _enterState);
      EList<JvmMember> _members_32 = it.getMembers();
      List<JvmOperation> __leaveState = this._leaveState(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_32, __leaveState);
      EList<JvmMember> _members_33 = it.getMembers();
      List<JvmOperation> _leaveState = this.leaveState(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_33, _leaveState);
      EList<JvmMember> _members_34 = it.getMembers();
      JvmOperation _initAllChildren = this.initAllChildren(element);
      this._jvmTypesBuilder.<JvmOperation>operator_add(_members_34, _initAllChildren);
      EList<JvmMember> _members_35 = it.getMembers();
      List<JvmOperation> _initChild = this.initChild(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_35, _initChild);
      EList<JvmMember> _members_36 = it.getMembers();
      Iterable<JvmOperation> _initChildQuantity = this.initChildQuantity(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_36, _initChildQuantity);
      EList<JvmMember> _members_37 = it.getMembers();
      List<JvmOperation> _initEachChild = this.initEachChild(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_37, _initEachChild);
      EList<JvmMember> _members_38 = it.getMembers();
      List<JvmOperation> _child = this.getChild(element);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members_38, _child);
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
  
  public String genClassName(final Actor actor) {
    String _name = actor.getName();
    return (_name + "Gen");
  }
  
  public JvmTypeReference superType(final Actor actor) {
    return this._typeReferenceBuilder.typeRef(NukuActor.class);
  }
  
  public JvmField assetManager(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(AssetManager.class);
    final Procedure1<JvmField> _function = (JvmField it) -> {
      it.setStatic(true);
      it.setVisibility(JvmVisibility.PROTECTED);
      it.setFinal(true);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("new AssetManager()");
        }
      };
      this._jvmTypesBuilder.setInitializer(it, _client);
    };
    return this._jvmTypesBuilder.toField(actor, "assetManager", _typeRef, _function);
  }
  
  public JvmEnumerationType stateEnum(final Actor actor) {
    final Procedure1<JvmEnumerationType> _function = (JvmEnumerationType it) -> {
      EList<JvmMember> _members = it.getMembers();
      EList<State> _normalizedStates = actor.getNormalizedStates();
      final Function1<State, JvmEnumerationLiteral> _function_1 = (State s) -> {
        String _name = s.getName();
        String _upperCase = _name.toUpperCase();
        return this._jvmTypesBuilder.toEnumerationLiteral(actor, _upperCase);
      };
      List<JvmEnumerationLiteral> _map = ListExtensions.<State, JvmEnumerationLiteral>map(_normalizedStates, _function_1);
      this._jvmTypesBuilder.<JvmMember>operator_add(_members, _map);
    };
    return this._jvmTypesBuilder.toEnumerationType(actor, "States", _function);
  }
  
  public JvmField currentState(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("States");
    final Procedure1<JvmField> _function = (JvmField it) -> {
      it.setVisibility(JvmVisibility.PRIVATE);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("null");
        }
      };
      this._jvmTypesBuilder.setInitializer(it, _client);
    };
    return this._jvmTypesBuilder.toField(actor, "currentState", _typeRef, _function);
  }
  
  public List<JvmField> dummyFields(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(List.class);
    JvmField _field = this._jvmTypesBuilder.toField(actor, "importListDummy", _typeRef);
    JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(ArrayList.class);
    JvmField _field_1 = this._jvmTypesBuilder.toField(actor, "importArrayListDummy", _typeRef_1);
    return Arrays.<JvmField>asList(_field, _field_1);
  }
  
  public List<JvmField> textureFields(final Actor actor) {
    EList<Animation> _normalizedAnimations = actor.getNormalizedAnimations();
    final Function1<Animation, JvmField> _function = (Animation a) -> {
      String _name = a.getName();
      String _firstLower = StringExtensions.toFirstLower(_name);
      String _plus = (_firstLower + "Texture");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Texture.class);
      final Procedure1<JvmField> _function_1 = (JvmField it) -> {
        it.setVisibility(JvmVisibility.PRIVATE);
      };
      return this._jvmTypesBuilder.toField(actor, _plus, _typeRef, _function_1);
    };
    return ListExtensions.<Animation, JvmField>map(_normalizedAnimations, _function);
  }
  
  public List<JvmField> animationFields(final Actor actor) {
    EList<Animation> _normalizedAnimations = actor.getNormalizedAnimations();
    final Function1<Animation, JvmField> _function = (Animation a) -> {
      String _name = a.getName();
      String _firstLower = StringExtensions.toFirstLower(_name);
      String _plus = (_firstLower + "Animation");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(com.badlogic.gdx.graphics.g2d.Animation.class);
      final Procedure1<JvmField> _function_1 = (JvmField it) -> {
        it.setVisibility(JvmVisibility.PRIVATE);
      };
      return this._jvmTypesBuilder.toField(actor, _plus, _typeRef, _function_1);
    };
    return ListExtensions.<Animation, JvmField>map(_normalizedAnimations, _function);
  }
  
  public JvmField stateTimeField(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(float.class);
    final Procedure1<JvmField> _function = (JvmField it) -> {
      it.setVisibility(JvmVisibility.PRIVATE);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("0.0f");
        }
      };
      this._jvmTypesBuilder.setInitializer(it, _client);
    };
    return this._jvmTypesBuilder.toField(actor, "animationStateTime", _typeRef, _function);
  }
  
  public JvmField currentAnimationField(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(com.badlogic.gdx.graphics.g2d.Animation.class);
    return this._jvmTypesBuilder.toField(actor, "currentAnimation", _typeRef);
  }
  
  public List<JvmField> childField(final Actor actor) {
    EList<ActorReference> _children = actor.getChildren();
    final Function1<ActorReference, JvmField> _function = (ActorReference c) -> {
      String _normalizedName = c.getNormalizedName();
      String _firstLower = StringExtensions.toFirstLower(_normalizedName);
      JvmTypeReference _xifexpression = null;
      int _quantity = c.getQuantity();
      boolean _greaterThan = (_quantity > 1);
      if (_greaterThan) {
        StringConcatenation _builder = new StringConcatenation();
        String _simpleName = List.class.getSimpleName();
        _builder.append(_simpleName, "");
        String _plus = (_builder.toString() + "<");
        Actor _normalizedReference = c.getNormalizedReference();
        String _name = _normalizedReference.getName();
        String _plus_1 = (_plus + _name);
        String _plus_2 = (_plus_1 + ">");
        _xifexpression = this._typeReferenceBuilder.typeRef(_plus_2);
      } else {
        Actor _normalizedReference_1 = c.getNormalizedReference();
        String _name_1 = _normalizedReference_1.getName();
        _xifexpression = this._typeReferenceBuilder.typeRef(_name_1);
      }
      final Procedure1<JvmField> _function_1 = (JvmField it) -> {
        it.setVisibility(JvmVisibility.PRIVATE);
      };
      return this._jvmTypesBuilder.toField(actor, _firstLower, _xifexpression, _function_1);
    };
    return ListExtensions.<ActorReference, JvmField>map(_children, _function);
  }
  
  public JvmConstructor constructor(final Actor actor) {
    final Procedure1<JvmConstructor> _function = (JvmConstructor it) -> {
      it.setVisibility(JvmVisibility.PUBLIC);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("super();");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toConstructor(actor, _function);
  }
  
  public JvmOperation init(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PUBLIC);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("super.init();");
          _builder.newLine();
          _builder.append("initAnimations();");
          _builder.newLine();
          _builder.append("initState();");
          _builder.newLine();
          _builder.append("initAllChildren(); ");
          _builder.newLine();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "init", _typeRef, _function);
  }
  
  public JvmOperation initPosition(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("setX((float) ");
          float _x = actor.getX();
          _builder.append(_x, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("setY((float) ");
          float _y = actor.getY();
          _builder.append(_y, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "initPosition", _typeRef, _function);
  }
  
  public JvmOperation initSize(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("setWidth((float) ");
          float _width = actor.getWidth();
          _builder.append(_width, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("setHeight((float) ");
          float _height = actor.getHeight();
          _builder.append(_height, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "initSize", _typeRef, _function);
  }
  
  public JvmOperation initScale(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("setScaleX((float) ");
          float _scaleX = actor.getScaleX();
          _builder.append(_scaleX, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("setScaleY((float) ");
          float _scaleY = actor.getScaleY();
          _builder.append(_scaleY, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "initScale", _typeRef, _function);
  }
  
  public JvmOperation initRotation(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("setRotation((float) ");
          float _rotation = actor.getRotation();
          _builder.append(_rotation, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "initRotation", _typeRef, _function);
  }
  
  public JvmOperation initColor(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("setColor((float) ");
          float _red = actor.getRed();
          _builder.append(_red, "");
          _builder.append(", (float) ");
          float _green = actor.getGreen();
          _builder.append(_green, "");
          _builder.append(", (float) ");
          float _blue = actor.getBlue();
          _builder.append(_blue, "");
          _builder.append(", (float) ");
          float _alpha = actor.getAlpha();
          _builder.append(_alpha, "");
          _builder.append(");");
          _builder.newLineIfNotEmpty();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "initColor", _typeRef, _function);
  }
  
  public List<JvmOperation> createTexture(final Actor actor) {
    EList<Animation> _normalizedAnimations = actor.getNormalizedAnimations();
    final Function1<Animation, JvmOperation> _function = (Animation a) -> {
      String _name = a.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("create" + _firstUpper);
      String _plus_1 = (_plus + "Texture");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(Texture.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        this._annotationTypesBuilder.annotationRef(Override.class);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return assetManager.get(\"");
            String _elvis = null;
            String _texture = a.getTexture();
            if (_texture != null) {
              _elvis = _texture;
            } else {
              String _name = actor.getName();
              String _name_1 = actor.getName();
              int _lastIndexOf = _name_1.lastIndexOf(".");
              int _plus = (_lastIndexOf + 1);
              String _substring = _name.substring(_plus);
              String _plus_1 = (_substring + "_");
              String _name_2 = a.getName();
              String _plus_2 = (_plus_1 + _name_2);
              String _plus_3 = (_plus_2 + ".png");
              _elvis = _plus_3;
            }
            _builder.append(_elvis, "");
            _builder.append("\", Texture.class);");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<Animation, JvmOperation>map(_normalizedAnimations, _function);
  }
  
  public List<JvmOperation> createAnimation(final Actor actor) {
    EList<Animation> _normalizedAnimations = actor.getNormalizedAnimations();
    final Function1<Animation, JvmOperation> _function = (Animation a) -> {
      String _name = a.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("create" + _firstUpper);
      String _plus_1 = (_plus + "Animation");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(com.badlogic.gdx.graphics.g2d.Animation.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        this._annotationTypesBuilder.annotationRef(Override.class);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return createAnimation(");
            String _name = a.getName();
            String _firstLower = StringExtensions.toFirstLower(_name);
            _builder.append(_firstLower, "");
            _builder.append("Texture, ");
            int _rows = a.getRows();
            _builder.append(_rows, "");
            _builder.append(", ");
            int _columns = a.getColumns();
            _builder.append(_columns, "");
            _builder.append(", (float) ");
            float _delay = a.getDelay();
            _builder.append(_delay, "");
            _builder.append(");");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<Animation, JvmOperation>map(_normalizedAnimations, _function);
  }
  
  public JvmOperation initAnimations(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          {
            EList<Animation> _normalizedAnimations = actor.getNormalizedAnimations();
            for(final Animation animation : _normalizedAnimations) {
              String _name = animation.getName();
              String _firstLower = StringExtensions.toFirstLower(_name);
              _builder.append(_firstLower, "");
              _builder.append("Texture = create");
              String _name_1 = animation.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_1);
              _builder.append(_firstUpper, "");
              _builder.append("Texture();");
              _builder.newLineIfNotEmpty();
              String _name_2 = animation.getName();
              String _firstLower_1 = StringExtensions.toFirstLower(_name_2);
              _builder.append(_firstLower_1, "");
              _builder.append("Animation = create");
              String _name_3 = animation.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
              _builder.append(_firstUpper_1, "");
              _builder.append("Animation();");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "initAnimations", _typeRef, _function);
  }
  
  public JvmOperation initState(final Actor actor) {
    String _genClassName = this.genClassName(actor);
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_genClassName);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          String _elvis = null;
          String _elvis_1 = null;
          State _defaultState = null;
          if (actor!=null) {
            _defaultState=actor.getDefaultState();
          }
          String _name = null;
          if (_defaultState!=null) {
            _name=_defaultState.getName();
          }
          String _firstUpper = null;
          if (_name!=null) {
            _firstUpper=StringExtensions.toFirstUpper(_name);
          }
          if (_firstUpper != null) {
            _elvis_1 = _firstUpper;
          } else {
            EList<State> _states = null;
            if (actor!=null) {
              _states=actor.getStates();
            }
            State _head = null;
            if (_states!=null) {
              _head=IterableExtensions.<State>head(_states);
            }
            String _name_1 = null;
            if (_head!=null) {
              _name_1=_head.getName();
            }
            String _firstUpper_1 = null;
            if (_name_1!=null) {
              _firstUpper_1=StringExtensions.toFirstUpper(_name_1);
            }
            _elvis_1 = _firstUpper_1;
          }
          if (_elvis_1 != null) {
            _elvis = _elvis_1;
          } else {
            _elvis = "Default";
          }
          final String stateName = _elvis;
          _builder.newLineIfNotEmpty();
          _builder.append("_enter");
          _builder.append(stateName, "");
          _builder.append("State();");
          _builder.newLineIfNotEmpty();
          _builder.append("return this;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "initState", _typeRef, _function);
  }
  
  public List<JvmOperation> getAnimation(final Actor actor) {
    EList<Animation> _animations = actor.getAnimations();
    final Function1<Animation, JvmOperation> _function = (Animation a) -> {
      String _name = a.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("get" + _firstUpper);
      String _plus_1 = (_plus + "Animation");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(com.badlogic.gdx.graphics.g2d.Animation.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PUBLIC);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            String _name = a.getName();
            String _firstLower = StringExtensions.toFirstLower(_name);
            _builder.append(_firstLower, "");
            _builder.append("Animation;");
            _builder.newLineIfNotEmpty();
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<Animation, JvmOperation>map(_animations, _function);
  }
  
  public JvmOperation getCurrentState(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef("States");
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("return currentState;");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "getCurrentState", _typeRef, _function);
  }
  
  public JvmOperation transit(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      EList<JvmFormalParameter> _parameters = it.getParameters();
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef("States");
      JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(actor, "next", _typeRef_1);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("switch (currentState) {");
          _builder.newLine();
          {
            EList<State> _normalizedStates = actor.getNormalizedStates();
            for(final State state : _normalizedStates) {
              _builder.append("\t");
              _builder.append("case ");
              String _name = state.getName();
              String _upperCase = _name.toUpperCase();
              _builder.append(_upperCase, "\t");
              _builder.append(":");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("_leave");
              String _name_1 = state.getName();
              String _firstUpper = StringExtensions.toFirstUpper(_name_1);
              _builder.append(_firstUpper, "\t\t");
              _builder.append("State();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("break;");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("default:");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
          _builder.newLine();
          _builder.append("switch (next) {");
          _builder.newLine();
          {
            EList<State> _normalizedStates_1 = actor.getNormalizedStates();
            for(final State state_1 : _normalizedStates_1) {
              _builder.append("\t");
              _builder.append("case ");
              String _name_2 = state_1.getName();
              String _upperCase_1 = _name_2.toUpperCase();
              _builder.append(_upperCase_1, "\t");
              _builder.append(":");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("_enter");
              String _name_3 = state_1.getName();
              String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
              _builder.append(_firstUpper_1, "\t\t");
              _builder.append("State();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("\t");
              _builder.append("break;");
              _builder.newLine();
            }
          }
          _builder.append("\t");
          _builder.append("default:");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "transit", _typeRef, _function);
  }
  
  public List<JvmOperation> _enterState(final Actor actor) {
    EList<State> _normalizedStates = actor.getNormalizedStates();
    final Function1<State, JvmOperation> _function = (State s) -> {
      String _name = s.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("_enter" + _firstUpper);
      String _plus_1 = (_plus + "State");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("currentAnimation = ");
            Animation _animationForState = ActorInferrer.this.animationForState(actor, s);
            String _name = _animationForState.getName();
            String _firstLower = StringExtensions.toFirstLower(_name);
            _builder.append(_firstLower, "");
            _builder.append("Animation;");
            _builder.newLineIfNotEmpty();
            _builder.append("resetStateTime();");
            _builder.newLine();
            _builder.append("enter");
            String _name_1 = s.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name_1);
            _builder.append(_firstUpper, "");
            _builder.append("State();");
            _builder.newLineIfNotEmpty();
            _builder.append("currentState = States.");
            String _name_2 = s.getName();
            String _upperCase = _name_2.toUpperCase();
            _builder.append(_upperCase, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<State, JvmOperation>map(_normalizedStates, _function);
  }
  
  public List<JvmOperation> enterState(final Actor actor) {
    EList<State> _normalizedStates = actor.getNormalizedStates();
    final Function1<State, JvmOperation> _function = (State s) -> {
      String _name = s.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("enter" + _firstUpper);
      String _plus_1 = (_plus + "State");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<State, JvmOperation>map(_normalizedStates, _function);
  }
  
  public Animation animationForState(final Actor actor, final State state) {
    Animation _elvis = null;
    Animation _elvis_1 = null;
    Animation _animation = state.getAnimation();
    if (_animation != null) {
      _elvis_1 = _animation;
    } else {
      EList<Animation> _normalizedAnimations = actor.getNormalizedAnimations();
      final Function1<Animation, Boolean> _function = (Animation a) -> {
        String _name = a.getName();
        String _name_1 = state.getName();
        return Boolean.valueOf(_name.equals(_name_1));
      };
      Animation _findFirst = IterableExtensions.<Animation>findFirst(_normalizedAnimations, _function);
      _elvis_1 = _findFirst;
    }
    if (_elvis_1 != null) {
      _elvis = _elvis_1;
    } else {
      EList<Animation> _normalizedAnimations_1 = actor.getNormalizedAnimations();
      Animation _head = IterableExtensions.<Animation>head(_normalizedAnimations_1);
      _elvis = _head;
    }
    return _elvis;
  }
  
  public List<JvmOperation> _leaveState(final Actor actor) {
    EList<State> _normalizedStates = actor.getNormalizedStates();
    final Function1<State, JvmOperation> _function = (State s) -> {
      String _name = s.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("_leave" + _firstUpper);
      String _plus_1 = (_plus + "State");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("leave");
            String _name = s.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            _builder.append(_firstUpper, "");
            _builder.append("State();");
            _builder.newLineIfNotEmpty();
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<State, JvmOperation>map(_normalizedStates, _function);
  }
  
  public List<JvmOperation> leaveState(final Actor actor) {
    EList<State> _normalizedStates = actor.getNormalizedStates();
    final Function1<State, JvmOperation> _function = (State s) -> {
      String _name = s.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("leave" + _firstUpper);
      String _plus_1 = (_plus + "State");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<State, JvmOperation>map(_normalizedStates, _function);
  }
  
  public JvmOperation draw(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      EList<JvmFormalParameter> _parameters = it.getParameters();
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(Batch.class);
      JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(actor, "batch", _typeRef_1);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
      JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(float.class);
      JvmFormalParameter _parameter_1 = this._jvmTypesBuilder.toParameter(actor, "parentAlpha", _typeRef_2);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
      it.setVisibility(JvmVisibility.PUBLIC);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          CharSequence _drawStateCalls = ActorInferrer.this.drawStateCalls(actor);
          _builder.append(_drawStateCalls, "");
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "draw", _typeRef, _function);
  }
  
  public CharSequence drawStateCalls(final Actor actor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch (currentState) {");
    _builder.newLine();
    {
      EList<State> _normalizedStates = actor.getNormalizedStates();
      for(final State state : _normalizedStates) {
        _builder.append("\t");
        _builder.append("case ");
        String _name = state.getName();
        String _upperCase = _name.toUpperCase();
        _builder.append(_upperCase, "\t");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("draw");
        String _name_1 = state.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper, "\t\t");
        _builder.append("State(batch, parentAlpha);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("super.draw(batch, parentAlpha);");
    _builder.newLine();
    return _builder;
  }
  
  public List<JvmOperation> drawState(final Actor actor) {
    EList<State> _normalizedStates = actor.getNormalizedStates();
    final Function1<State, JvmOperation> _function = (State s) -> {
      String _name = s.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("draw" + _firstUpper);
      String _plus_1 = (_plus + "State");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(Batch.class);
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(actor, "batch", _typeRef_1);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
        JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(float.class);
        JvmFormalParameter _parameter_1 = this._jvmTypesBuilder.toParameter(actor, "parentAlpha", _typeRef_2);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("drawAnimation(batch, parentAlpha, currentAnimation);");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<State, JvmOperation>map(_normalizedStates, _function);
  }
  
  public JvmOperation drawAnimation(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      EList<JvmFormalParameter> _parameters = it.getParameters();
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(Batch.class);
      JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(actor, "batch", _typeRef_1);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      EList<JvmFormalParameter> _parameters_1 = it.getParameters();
      JvmTypeReference _typeRef_2 = this._typeReferenceBuilder.typeRef(float.class);
      JvmFormalParameter _parameter_1 = this._jvmTypesBuilder.toParameter(actor, "parentAlpha", _typeRef_2);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter_1);
      EList<JvmFormalParameter> _parameters_2 = it.getParameters();
      JvmTypeReference _typeRef_3 = this._typeReferenceBuilder.typeRef(com.badlogic.gdx.graphics.g2d.Animation.class);
      JvmFormalParameter _parameter_2 = this._jvmTypesBuilder.toParameter(actor, "animation", _typeRef_3);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_2, _parameter_2);
      it.setVisibility(JvmVisibility.PROTECTED);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("if (animation != null) {");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("final ");
          _builder.append(TextureRegion.class, "\t");
          _builder.append(" region = animation.getKeyFrame(animationStateTime, true);");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append(Color.class, "\t");
          _builder.append(" tint = batch.getColor();");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("batch.setColor(getColor());");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("batch.draw(region, getX(), getY(), getOriginX(), getOriginY(), getWidth(), getHeight(), getScaleX(), getScaleY(), getRotation());");
          _builder.newLine();
          _builder.append("\t");
          _builder.append("batch.setColor(tint);");
          _builder.newLine();
          _builder.append("}");
          _builder.newLine();
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "drawAnimation", _typeRef, _function);
  }
  
  public JvmOperation act(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      EList<JvmFormalParameter> _parameters = it.getParameters();
      JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(float.class);
      JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(actor, "delta", _typeRef_1);
      this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
      it.setVisibility(JvmVisibility.PUBLIC);
      this._annotationTypesBuilder.annotationRef(Override.class);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          CharSequence _actStateCalls = ActorInferrer.this.actStateCalls(actor);
          _builder.append(_actStateCalls, "");
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "act", _typeRef, _function);
  }
  
  public CharSequence actStateCalls(final Actor actor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch (currentState) {");
    _builder.newLine();
    {
      EList<State> _normalizedStates = actor.getNormalizedStates();
      for(final State state : _normalizedStates) {
        _builder.append("\t");
        _builder.append("case ");
        String _name = state.getName();
        String _upperCase = _name.toUpperCase();
        _builder.append(_upperCase, "\t");
        _builder.append(":");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("_act");
        String _name_1 = state.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_1);
        _builder.append(_firstUpper, "\t\t");
        _builder.append("State(delta);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("break;");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("default:");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("super.act(delta);");
    _builder.newLine();
    return _builder;
  }
  
  public List<JvmOperation> _actState(final Actor actor) {
    EList<State> _normalizedStates = actor.getNormalizedStates();
    final Function1<State, JvmOperation> _function = (State s) -> {
      String _name = s.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("_act" + _firstUpper);
      String _plus_1 = (_plus + "State");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(float.class);
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(actor, "delta", _typeRef_1);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("animationStateTime += delta;");
            _builder.newLine();
            _builder.append("act");
            String _name = s.getName();
            String _firstUpper = StringExtensions.toFirstUpper(_name);
            _builder.append(_firstUpper, "");
            _builder.append("State(delta);");
            _builder.newLineIfNotEmpty();
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<State, JvmOperation>map(_normalizedStates, _function);
  }
  
  public List<JvmOperation> actState(final Actor actor) {
    EList<State> _normalizedStates = actor.getNormalizedStates();
    final Function1<State, JvmOperation> _function = (State s) -> {
      String _name = s.getName();
      String _firstUpper = StringExtensions.toFirstUpper(_name);
      String _plus = ("act" + _firstUpper);
      String _plus_1 = (_plus + "State");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        EList<JvmFormalParameter> _parameters = it.getParameters();
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(float.class);
        JvmFormalParameter _parameter = this._jvmTypesBuilder.toParameter(actor, "delta", _typeRef_1);
        this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(actor, _plus_1, _typeRef, _function_1);
    };
    return ListExtensions.<State, JvmOperation>map(_normalizedStates, _function);
  }
  
  public JvmOperation resetStateTime(final Actor actor) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          _builder.append("animationStateTime = 0.0f;");
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(actor, "resetStateTime", _typeRef, _function);
  }
  
  public JvmOperation initAllChildren(final Actor element) {
    JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
    final Procedure1<JvmOperation> _function = (JvmOperation it) -> {
      it.setVisibility(JvmVisibility.PROTECTED);
      StringConcatenationClient _client = new StringConcatenationClient() {
        @Override
        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
          {
            EList<ActorReference> _children = element.getChildren();
            for(final ActorReference r : _children) {
              _builder.append("initChild");
              String _normalizedName = r.getNormalizedName();
              _builder.append(_normalizedName, "");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
            }
          }
        }
      };
      this._jvmTypesBuilder.setBody(it, _client);
    };
    return this._jvmTypesBuilder.toMethod(element, "initAllChildren", _typeRef, _function);
  }
  
  public List<JvmOperation> initChild(final Actor element) {
    EList<ActorReference> _children = element.getChildren();
    final Function1<ActorReference, JvmOperation> _function = (ActorReference c) -> {
      JvmOperation _xifexpression = null;
      int _quantity = c.getQuantity();
      boolean _greaterThan = (_quantity > 1);
      if (_greaterThan) {
        Actor _normalizedReference = c.getNormalizedReference();
        String _normalizedName = c.getNormalizedName();
        String _plus = ("initChild" + _normalizedName);
        JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
          it.setVisibility(JvmVisibility.PROTECTED);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append(int.class, "");
              _builder.append(" quantity = initChild");
              String _normalizedName = c.getNormalizedName();
              _builder.append(_normalizedName, "");
              _builder.append("Quantity();");
              _builder.newLineIfNotEmpty();
              String _normalizedName_1 = c.getNormalizedName();
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
              String _normalizedName_2 = c.getNormalizedName();
              _builder.append(_normalizedName_2, "\t");
              _builder.append(" child = initEachChild");
              String _normalizedName_3 = c.getNormalizedName();
              _builder.append(_normalizedName_3, "\t");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              String _normalizedName_4 = c.getNormalizedName();
              String _firstLower_1 = StringExtensions.toFirstLower(_normalizedName_4);
              _builder.append(_firstLower_1, "\t");
              _builder.append(".add(child);");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("addActor(child);");
              _builder.newLine();
              _builder.append("}");
              _builder.newLine();
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        _xifexpression = this._jvmTypesBuilder.toMethod(_normalizedReference, _plus, _typeRef, _function_1);
      } else {
        Actor _normalizedReference_1 = c.getNormalizedReference();
        String _normalizedName_1 = c.getNormalizedName();
        String _plus_1 = ("initChild" + _normalizedName_1);
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(void.class);
        final Procedure1<JvmOperation> _function_2 = (JvmOperation it) -> {
          it.setVisibility(JvmVisibility.PROTECTED);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              String _normalizedName = c.getNormalizedName();
              String _firstLower = StringExtensions.toFirstLower(_normalizedName);
              _builder.append(_firstLower, "");
              _builder.append(" = initEachChild");
              String _normalizedName_1 = c.getNormalizedName();
              _builder.append(_normalizedName_1, "");
              _builder.append("();");
              _builder.newLineIfNotEmpty();
              _builder.append("addActor(");
              String _normalizedName_2 = c.getNormalizedName();
              String _firstLower_1 = StringExtensions.toFirstLower(_normalizedName_2);
              _builder.append(_firstLower_1, "");
              _builder.append(");");
              _builder.newLineIfNotEmpty();
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        _xifexpression = this._jvmTypesBuilder.toMethod(_normalizedReference_1, _plus_1, _typeRef_1, _function_2);
      }
      return _xifexpression;
    };
    return ListExtensions.<ActorReference, JvmOperation>map(_children, _function);
  }
  
  public Iterable<JvmOperation> initChildQuantity(final Actor element) {
    EList<ActorReference> _children = element.getChildren();
    final Function1<ActorReference, Boolean> _function = (ActorReference c) -> {
      int _quantity = c.getQuantity();
      return Boolean.valueOf((_quantity > 1));
    };
    Iterable<ActorReference> _filter = IterableExtensions.<ActorReference>filter(_children, _function);
    final Function1<ActorReference, JvmOperation> _function_1 = (ActorReference c) -> {
      Actor _normalizedReference = c.getNormalizedReference();
      String _normalizedName = c.getNormalizedName();
      String _plus = ("initChild" + _normalizedName);
      String _plus_1 = (_plus + "Quantity");
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(int.class);
      final Procedure1<JvmOperation> _function_2 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return ");
            int _quantity = c.getQuantity();
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
  
  public List<JvmOperation> initEachChild(final Actor element) {
    EList<ActorReference> _children = element.getChildren();
    final Function1<ActorReference, JvmOperation> _function = (ActorReference c) -> {
      Actor _normalizedReference = c.getNormalizedReference();
      String _normalizedName = c.getNormalizedName();
      String _plus = ("initEachChild" + _normalizedName);
      Actor _normalizedReference_1 = c.getNormalizedReference();
      String _name = _normalizedReference_1.getName();
      JvmTypeReference _typeRef = this._typeReferenceBuilder.typeRef(_name);
      final Procedure1<JvmOperation> _function_1 = (JvmOperation it) -> {
        it.setVisibility(JvmVisibility.PROTECTED);
        StringConcatenationClient _client = new StringConcatenationClient() {
          @Override
          protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
            _builder.append("return (");
            Actor _normalizedReference = c.getNormalizedReference();
            String _name = _normalizedReference.getName();
            JvmTypeReference _typeRef = ActorInferrer.this._typeReferenceBuilder.typeRef(_name);
            _builder.append(_typeRef, "");
            _builder.append(") new ");
            Actor _normalizedReference_1 = c.getNormalizedReference();
            String _name_1 = _normalizedReference_1.getName();
            _builder.append(_name_1, "");
            _builder.append("().init();");
          }
        };
        this._jvmTypesBuilder.setBody(it, _client);
      };
      return this._jvmTypesBuilder.toMethod(_normalizedReference, _plus, _typeRef, _function_1);
    };
    return ListExtensions.<ActorReference, JvmOperation>map(_children, _function);
  }
  
  public List<JvmOperation> getChild(final Actor element) {
    EList<ActorReference> _children = element.getChildren();
    final Function1<ActorReference, JvmOperation> _function = (ActorReference c) -> {
      JvmOperation _xifexpression = null;
      int _quantity = c.getQuantity();
      boolean _greaterThan = (_quantity > 1);
      if (_greaterThan) {
        Actor _normalizedReference = c.getNormalizedReference();
        String _normalizedName = c.getNormalizedName();
        String _plus = ("getChildren" + _normalizedName);
        Actor _normalizedReference_1 = c.getNormalizedReference();
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
              String _normalizedName = c.getNormalizedName();
              String _firstLower = StringExtensions.toFirstLower(_normalizedName);
              _builder.append(_firstLower, "");
              _builder.append(";");
            }
          };
          this._jvmTypesBuilder.setBody(it, _client);
        };
        _xifexpression = this._jvmTypesBuilder.toMethod(_normalizedReference, _plus, _typeRef, _function_1);
      } else {
        Actor _normalizedReference_2 = c.getNormalizedReference();
        String _normalizedName_1 = c.getNormalizedName();
        String _plus_3 = ("getChild" + _normalizedName_1);
        Actor _normalizedReference_3 = c.getNormalizedReference();
        String _name_1 = _normalizedReference_3.getName();
        JvmTypeReference _typeRef_1 = this._typeReferenceBuilder.typeRef(_name_1);
        final Procedure1<JvmOperation> _function_2 = (JvmOperation it) -> {
          it.setVisibility(JvmVisibility.PROTECTED);
          StringConcatenationClient _client = new StringConcatenationClient() {
            @Override
            protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
              _builder.append("return ");
              String _normalizedName = c.getNormalizedName();
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
    return ListExtensions.<ActorReference, JvmOperation>map(_children, _function);
  }
}

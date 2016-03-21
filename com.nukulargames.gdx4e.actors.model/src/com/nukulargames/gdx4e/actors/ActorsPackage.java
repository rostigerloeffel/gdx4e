/**
 */
package com.nukulargames.gdx4e.actors;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.nukulargames.gdx4e.actors.ActorsFactory
 * @model kind="package"
 * @generated
 */
public interface ActorsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "actors";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "com.nukulargames/gdx4e/actors";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "actors";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ActorsPackage eINSTANCE = com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.nukulargames.gdx4e.actors.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.nukulargames.gdx4e.actors.impl.ModelImpl
	 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ACTORS = 0;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__BASE_PACKAGE = 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.nukulargames.gdx4e.actors.impl.ActorImpl <em>Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.nukulargames.gdx4e.actors.impl.ActorImpl
	 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getActor()
	 * @generated
	 */
	int ACTOR = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__Y = 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__HEIGHT = 4;

	/**
	 * The feature id for the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SCALE_X = 5;

	/**
	 * The feature id for the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__SCALE_Y = 6;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ROTATION = 7;

	/**
	 * The feature id for the '<em><b>Animations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ANIMATIONS = 8;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__STATES = 9;

	/**
	 * The feature id for the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__DEFAULT_STATE = 10;

	/**
	 * The feature id for the '<em><b>Normalized States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NORMALIZED_STATES = 11;

	/**
	 * The feature id for the '<em><b>Normalized Animations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__NORMALIZED_ANIMATIONS = 12;

	/**
	 * The feature id for the '<em><b>Red</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__RED = 13;

	/**
	 * The feature id for the '<em><b>Green</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__GREEN = 14;

	/**
	 * The feature id for the '<em><b>Blue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__BLUE = 15;

	/**
	 * The feature id for the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__ALPHA = 16;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR__CHILDREN = 17;

	/**
	 * The number of structural features of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_FEATURE_COUNT = 18;

	/**
	 * The number of operations of the '<em>Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl <em>Actor Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl
	 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getActorReference()
	 * @generated
	 */
	int ACTOR_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Holds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__HOLDS = 0;

	/**
	 * The feature id for the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__USES = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Normalized Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__NORMALIZED_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Normalized Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE__NORMALIZED_NAME = 5;

	/**
	 * The number of structural features of the '<em>Actor Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Actor Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.nukulargames.gdx4e.actors.impl.StageImpl <em>Stage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.nukulargames.gdx4e.actors.impl.StageImpl
	 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getStage()
	 * @generated
	 */
	int STAGE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Actors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE__ACTORS = 1;

	/**
	 * The number of structural features of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Stage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.nukulargames.gdx4e.actors.impl.AnimationImpl <em>Animation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.nukulargames.gdx4e.actors.impl.AnimationImpl
	 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getAnimation()
	 * @generated
	 */
	int ANIMATION = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__TEXTURE = 1;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__COLUMNS = 2;

	/**
	 * The feature id for the '<em><b>Rows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__ROWS = 3;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__DELAY = 4;

	/**
	 * The feature id for the '<em><b>Normalized Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION__NORMALIZED_TEXTURE = 5;

	/**
	 * The number of structural features of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Animation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.nukulargames.gdx4e.actors.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.nukulargames.gdx4e.actors.impl.StateImpl
	 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getState()
	 * @generated
	 */
	int STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Animation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ANIMATION = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.nukulargames.gdx4e.actors.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see com.nukulargames.gdx4e.actors.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link com.nukulargames.gdx4e.actors.Model#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see com.nukulargames.gdx4e.actors.Model#getActors()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Actors();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Model#getBasePackage <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Package</em>'.
	 * @see com.nukulargames.gdx4e.actors.Model#getBasePackage()
	 * @see #getModel()
	 * @generated
	 */
	EAttribute getModel_BasePackage();

	/**
	 * Returns the meta object for class '{@link com.nukulargames.gdx4e.actors.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor
	 * @generated
	 */
	EClass getActor();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getName()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getX()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_X();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getY()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Y();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getWidth()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Width();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getHeight()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Height();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getScaleX <em>Scale X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale X</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getScaleX()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ScaleX();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getScaleY <em>Scale Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale Y</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getScaleY()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_ScaleY();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getRotation()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Rotation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.nukulargames.gdx4e.actors.Actor#getAnimations <em>Animations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animations</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getAnimations()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Animations();

	/**
	 * Returns the meta object for the containment reference list '{@link com.nukulargames.gdx4e.actors.Actor#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getStates()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_States();

	/**
	 * Returns the meta object for the reference '{@link com.nukulargames.gdx4e.actors.Actor#getDefaultState <em>Default State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default State</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getDefaultState()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_DefaultState();

	/**
	 * Returns the meta object for the reference list '{@link com.nukulargames.gdx4e.actors.Actor#getNormalizedStates <em>Normalized States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Normalized States</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getNormalizedStates()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_NormalizedStates();

	/**
	 * Returns the meta object for the reference list '{@link com.nukulargames.gdx4e.actors.Actor#getNormalizedAnimations <em>Normalized Animations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Normalized Animations</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getNormalizedAnimations()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_NormalizedAnimations();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getRed <em>Red</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getRed()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Red();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getGreen <em>Green</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Green</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getGreen()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Green();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getBlue <em>Blue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blue</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getBlue()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Blue();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Actor#getAlpha <em>Alpha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alpha</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getAlpha()
	 * @see #getActor()
	 * @generated
	 */
	EAttribute getActor_Alpha();

	/**
	 * Returns the meta object for the containment reference list '{@link com.nukulargames.gdx4e.actors.Actor#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see com.nukulargames.gdx4e.actors.Actor#getChildren()
	 * @see #getActor()
	 * @generated
	 */
	EReference getActor_Children();

	/**
	 * Returns the meta object for class '{@link com.nukulargames.gdx4e.actors.ActorReference <em>Actor Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Reference</em>'.
	 * @see com.nukulargames.gdx4e.actors.ActorReference
	 * @generated
	 */
	EClass getActorReference();

	/**
	 * Returns the meta object for the containment reference '{@link com.nukulargames.gdx4e.actors.ActorReference#getHolds <em>Holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Holds</em>'.
	 * @see com.nukulargames.gdx4e.actors.ActorReference#getHolds()
	 * @see #getActorReference()
	 * @generated
	 */
	EReference getActorReference_Holds();

	/**
	 * Returns the meta object for the reference '{@link com.nukulargames.gdx4e.actors.ActorReference#getUses <em>Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Uses</em>'.
	 * @see com.nukulargames.gdx4e.actors.ActorReference#getUses()
	 * @see #getActorReference()
	 * @generated
	 */
	EReference getActorReference_Uses();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.ActorReference#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see com.nukulargames.gdx4e.actors.ActorReference#getQuantity()
	 * @see #getActorReference()
	 * @generated
	 */
	EAttribute getActorReference_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.ActorReference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.nukulargames.gdx4e.actors.ActorReference#getName()
	 * @see #getActorReference()
	 * @generated
	 */
	EAttribute getActorReference_Name();

	/**
	 * Returns the meta object for the reference '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedReference <em>Normalized Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Normalized Reference</em>'.
	 * @see com.nukulargames.gdx4e.actors.ActorReference#getNormalizedReference()
	 * @see #getActorReference()
	 * @generated
	 */
	EReference getActorReference_NormalizedReference();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedName <em>Normalized Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normalized Name</em>'.
	 * @see com.nukulargames.gdx4e.actors.ActorReference#getNormalizedName()
	 * @see #getActorReference()
	 * @generated
	 */
	EAttribute getActorReference_NormalizedName();

	/**
	 * Returns the meta object for class '{@link com.nukulargames.gdx4e.actors.Stage <em>Stage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stage</em>'.
	 * @see com.nukulargames.gdx4e.actors.Stage
	 * @generated
	 */
	EClass getStage();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Stage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.nukulargames.gdx4e.actors.Stage#getName()
	 * @see #getStage()
	 * @generated
	 */
	EAttribute getStage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.nukulargames.gdx4e.actors.Stage#getActors <em>Actors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Actors</em>'.
	 * @see com.nukulargames.gdx4e.actors.Stage#getActors()
	 * @see #getStage()
	 * @generated
	 */
	EReference getStage_Actors();

	/**
	 * Returns the meta object for class '{@link com.nukulargames.gdx4e.actors.Animation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animation</em>'.
	 * @see com.nukulargames.gdx4e.actors.Animation
	 * @generated
	 */
	EClass getAnimation();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Animation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.nukulargames.gdx4e.actors.Animation#getName()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Animation#getTexture <em>Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Texture</em>'.
	 * @see com.nukulargames.gdx4e.actors.Animation#getTexture()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Texture();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Animation#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Columns</em>'.
	 * @see com.nukulargames.gdx4e.actors.Animation#getColumns()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Columns();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Animation#getRows <em>Rows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rows</em>'.
	 * @see com.nukulargames.gdx4e.actors.Animation#getRows()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Rows();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Animation#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see com.nukulargames.gdx4e.actors.Animation#getDelay()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_Delay();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.Animation#getNormalizedTexture <em>Normalized Texture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Normalized Texture</em>'.
	 * @see com.nukulargames.gdx4e.actors.Animation#getNormalizedTexture()
	 * @see #getAnimation()
	 * @generated
	 */
	EAttribute getAnimation_NormalizedTexture();

	/**
	 * Returns the meta object for class '{@link com.nukulargames.gdx4e.actors.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see com.nukulargames.gdx4e.actors.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link com.nukulargames.gdx4e.actors.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.nukulargames.gdx4e.actors.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for the reference '{@link com.nukulargames.gdx4e.actors.State#getAnimation <em>Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Animation</em>'.
	 * @see com.nukulargames.gdx4e.actors.State#getAnimation()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Animation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ActorsFactory getActorsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.nukulargames.gdx4e.actors.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.nukulargames.gdx4e.actors.impl.ModelImpl
		 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ACTORS = eINSTANCE.getModel_Actors();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL__BASE_PACKAGE = eINSTANCE.getModel_BasePackage();

		/**
		 * The meta object literal for the '{@link com.nukulargames.gdx4e.actors.impl.ActorImpl <em>Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.nukulargames.gdx4e.actors.impl.ActorImpl
		 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getActor()
		 * @generated
		 */
		EClass ACTOR = eINSTANCE.getActor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__NAME = eINSTANCE.getActor_Name();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__X = eINSTANCE.getActor_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__Y = eINSTANCE.getActor_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__WIDTH = eINSTANCE.getActor_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__HEIGHT = eINSTANCE.getActor_Height();

		/**
		 * The meta object literal for the '<em><b>Scale X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__SCALE_X = eINSTANCE.getActor_ScaleX();

		/**
		 * The meta object literal for the '<em><b>Scale Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__SCALE_Y = eINSTANCE.getActor_ScaleY();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ROTATION = eINSTANCE.getActor_Rotation();

		/**
		 * The meta object literal for the '<em><b>Animations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__ANIMATIONS = eINSTANCE.getActor_Animations();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__STATES = eINSTANCE.getActor_States();

		/**
		 * The meta object literal for the '<em><b>Default State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__DEFAULT_STATE = eINSTANCE.getActor_DefaultState();

		/**
		 * The meta object literal for the '<em><b>Normalized States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__NORMALIZED_STATES = eINSTANCE.getActor_NormalizedStates();

		/**
		 * The meta object literal for the '<em><b>Normalized Animations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__NORMALIZED_ANIMATIONS = eINSTANCE.getActor_NormalizedAnimations();

		/**
		 * The meta object literal for the '<em><b>Red</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__RED = eINSTANCE.getActor_Red();

		/**
		 * The meta object literal for the '<em><b>Green</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__GREEN = eINSTANCE.getActor_Green();

		/**
		 * The meta object literal for the '<em><b>Blue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__BLUE = eINSTANCE.getActor_Blue();

		/**
		 * The meta object literal for the '<em><b>Alpha</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR__ALPHA = eINSTANCE.getActor_Alpha();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR__CHILDREN = eINSTANCE.getActor_Children();

		/**
		 * The meta object literal for the '{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl <em>Actor Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl
		 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getActorReference()
		 * @generated
		 */
		EClass ACTOR_REFERENCE = eINSTANCE.getActorReference();

		/**
		 * The meta object literal for the '<em><b>Holds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REFERENCE__HOLDS = eINSTANCE.getActorReference_Holds();

		/**
		 * The meta object literal for the '<em><b>Uses</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REFERENCE__USES = eINSTANCE.getActorReference_Uses();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_REFERENCE__QUANTITY = eINSTANCE.getActorReference_Quantity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_REFERENCE__NAME = eINSTANCE.getActorReference_Name();

		/**
		 * The meta object literal for the '<em><b>Normalized Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTOR_REFERENCE__NORMALIZED_REFERENCE = eINSTANCE.getActorReference_NormalizedReference();

		/**
		 * The meta object literal for the '<em><b>Normalized Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTOR_REFERENCE__NORMALIZED_NAME = eINSTANCE.getActorReference_NormalizedName();

		/**
		 * The meta object literal for the '{@link com.nukulargames.gdx4e.actors.impl.StageImpl <em>Stage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.nukulargames.gdx4e.actors.impl.StageImpl
		 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getStage()
		 * @generated
		 */
		EClass STAGE = eINSTANCE.getStage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAGE__NAME = eINSTANCE.getStage_Name();

		/**
		 * The meta object literal for the '<em><b>Actors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAGE__ACTORS = eINSTANCE.getStage_Actors();

		/**
		 * The meta object literal for the '{@link com.nukulargames.gdx4e.actors.impl.AnimationImpl <em>Animation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.nukulargames.gdx4e.actors.impl.AnimationImpl
		 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getAnimation()
		 * @generated
		 */
		EClass ANIMATION = eINSTANCE.getAnimation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__NAME = eINSTANCE.getAnimation_Name();

		/**
		 * The meta object literal for the '<em><b>Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__TEXTURE = eINSTANCE.getAnimation_Texture();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__COLUMNS = eINSTANCE.getAnimation_Columns();

		/**
		 * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__ROWS = eINSTANCE.getAnimation_Rows();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__DELAY = eINSTANCE.getAnimation_Delay();

		/**
		 * The meta object literal for the '<em><b>Normalized Texture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMATION__NORMALIZED_TEXTURE = eINSTANCE.getAnimation_NormalizedTexture();

		/**
		 * The meta object literal for the '{@link com.nukulargames.gdx4e.actors.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.nukulargames.gdx4e.actors.impl.StateImpl
		 * @see com.nukulargames.gdx4e.actors.impl.ActorsPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '<em><b>Animation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ANIMATION = eINSTANCE.getState_Animation();

	}

} //ActorsPackage

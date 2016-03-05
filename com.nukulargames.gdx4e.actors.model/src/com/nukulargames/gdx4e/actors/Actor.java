/**
 */
package com.nukulargames.gdx4e.actors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getName <em>Name</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getX <em>X</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getY <em>Y</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getLayer <em>Layer</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getWidth <em>Width</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getHeight <em>Height</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getRotation <em>Rotation</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getAnimations <em>Animations</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getStates <em>States</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getDefaultState <em>Default State</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getNormalizedStates <em>Normalized States</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getNormalizedAnimations <em>Normalized Animations</em>}</li>
 * </ul>
 *
 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_X()
	 * @model
	 * @generated
	 */
	float getX();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(float value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Y()
	 * @model
	 * @generated
	 */
	float getY();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(float value);

	/**
	 * Returns the value of the '<em><b>Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layer</em>' reference.
	 * @see #setLayer(Layer)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Layer()
	 * @model
	 * @generated
	 */
	Layer getLayer();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getLayer <em>Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layer</em>' reference.
	 * @see #getLayer()
	 * @generated
	 */
	void setLayer(Layer value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Width()
	 * @model default="1.0"
	 * @generated
	 */
	float getWidth();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(float value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Height()
	 * @model default="1.0"
	 * @generated
	 */
	float getHeight();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(float value);

	/**
	 * Returns the value of the '<em><b>Scale X</b></em>' attribute.
	 * The default value is <code>"1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale X</em>' attribute.
	 * @see #setScaleX(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_ScaleX()
	 * @model default="1.0f"
	 * @generated
	 */
	float getScaleX();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getScaleX <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale X</em>' attribute.
	 * @see #getScaleX()
	 * @generated
	 */
	void setScaleX(float value);

	/**
	 * Returns the value of the '<em><b>Scale Y</b></em>' attribute.
	 * The default value is <code>"1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Y</em>' attribute.
	 * @see #setScaleY(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_ScaleY()
	 * @model default="1.0f"
	 * @generated
	 */
	float getScaleY();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getScaleY <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Y</em>' attribute.
	 * @see #getScaleY()
	 * @generated
	 */
	void setScaleY(float value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Rotation()
	 * @model
	 * @generated
	 */
	float getRotation();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(float value);

	/**
	 * Returns the value of the '<em><b>Animations</b></em>' containment reference list.
	 * The list contents are of type {@link com.nukulargames.gdx4e.actors.Animation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animations</em>' containment reference list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Animations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Animation> getAnimations();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link com.nukulargames.gdx4e.actors.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Default State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default State</em>' reference.
	 * @see #setDefaultState(State)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_DefaultState()
	 * @model
	 * @generated
	 */
	State getDefaultState();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getDefaultState <em>Default State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default State</em>' reference.
	 * @see #getDefaultState()
	 * @generated
	 */
	void setDefaultState(State value);

	/**
	 * Returns the value of the '<em><b>Normalized States</b></em>' reference list.
	 * The list contents are of type {@link com.nukulargames.gdx4e.actors.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalized States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalized States</em>' reference list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_NormalizedStates()
	 * @model derived="true"
	 * @generated
	 */
	EList<State> getNormalizedStates();

	/**
	 * Returns the value of the '<em><b>Normalized Animations</b></em>' reference list.
	 * The list contents are of type {@link com.nukulargames.gdx4e.actors.Animation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalized Animations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalized Animations</em>' reference list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_NormalizedAnimations()
	 * @model derived="true"
	 * @generated
	 */
	EList<Animation> getNormalizedAnimations();

} // Actor

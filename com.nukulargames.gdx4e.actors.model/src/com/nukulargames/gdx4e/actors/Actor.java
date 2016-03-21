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
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getRed <em>Red</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getGreen <em>Green</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getBlue <em>Blue</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Actor#getChildren <em>Children</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Red</b></em>' attribute.
	 * The default value is <code>"1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Red</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red</em>' attribute.
	 * @see #setRed(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Red()
	 * @model default="1.0f"
	 * @generated
	 */
	float getRed();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getRed <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red</em>' attribute.
	 * @see #getRed()
	 * @generated
	 */
	void setRed(float value);

	/**
	 * Returns the value of the '<em><b>Green</b></em>' attribute.
	 * The default value is <code>"1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Green</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Green</em>' attribute.
	 * @see #setGreen(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Green()
	 * @model default="1.0f"
	 * @generated
	 */
	float getGreen();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getGreen <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Green</em>' attribute.
	 * @see #getGreen()
	 * @generated
	 */
	void setGreen(float value);

	/**
	 * Returns the value of the '<em><b>Blue</b></em>' attribute.
	 * The default value is <code>"1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blue</em>' attribute.
	 * @see #setBlue(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Blue()
	 * @model default="1.0f"
	 * @generated
	 */
	float getBlue();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getBlue <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blue</em>' attribute.
	 * @see #getBlue()
	 * @generated
	 */
	void setBlue(float value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"1.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Alpha()
	 * @model default="1.0f"
	 * @generated
	 */
	float getAlpha();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Actor#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(float value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link com.nukulargames.gdx4e.actors.ActorReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActor_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorReference> getChildren();

} // Actor

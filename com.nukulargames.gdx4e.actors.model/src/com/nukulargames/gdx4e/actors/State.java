/**
 */
package com.nukulargames.gdx4e.actors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.State#getName <em>Name</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.State#getAnimation <em>Animation</em>}</li>
 * </ul>
 *
 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
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
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getState_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Animation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animation</em>' reference.
	 * @see #setAnimation(Animation)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getState_Animation()
	 * @model
	 * @generated
	 */
	Animation getAnimation();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.State#getAnimation <em>Animation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Animation</em>' reference.
	 * @see #getAnimation()
	 * @generated
	 */
	void setAnimation(Animation value);

} // State

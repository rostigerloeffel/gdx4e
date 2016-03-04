/**
 */
package com.nukulargames.gdx4e.actors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getActor <em>Actor</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference()
 * @model
 * @generated
 */
public interface ActorReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actor</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' reference.
	 * @see #setActor(Actor)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_Actor()
	 * @model required="true"
	 * @generated
	 */
	Actor getActor();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getActor <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actor</em>' reference.
	 * @see #getActor()
	 * @generated
	 */
	void setActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dimensions</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dimensions</em>' attribute list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_Dimensions()
	 * @model
	 * @generated
	 */
	EList<Integer> getDimensions();

} // ActorReference

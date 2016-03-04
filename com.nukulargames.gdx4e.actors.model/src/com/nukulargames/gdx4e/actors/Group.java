/**
 */
package com.nukulargames.gdx4e.actors;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.Group#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Actor {
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
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getGroup_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActorReference> getChildren();

} // Group

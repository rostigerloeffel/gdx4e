/**
 */
package com.nukulargames.gdx4e.actors;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.Model#getActors <em>Actors</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Model#getBasePackage <em>Base Package</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Model#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject {
	/**
	 * Returns the value of the '<em><b>Actors</b></em>' containment reference list.
	 * The list contents are of type {@link com.nukulargames.gdx4e.actors.Actor}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actors</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actors</em>' containment reference list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getModel_Actors()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActors();

	/**
	 * Returns the value of the '<em><b>Base Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package</em>' attribute.
	 * @see #setBasePackage(String)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getModel_BasePackage()
	 * @model
	 * @generated
	 */
	String getBasePackage();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Model#getBasePackage <em>Base Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package</em>' attribute.
	 * @see #getBasePackage()
	 * @generated
	 */
	void setBasePackage(String value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link com.nukulargames.gdx4e.actors.Layer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getModel_Layers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Layer> getLayers();

} // Model

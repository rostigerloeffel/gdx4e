/**
 */
package com.nukulargames.gdx4e.actors;

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
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getHolds <em>Holds</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getUses <em>Uses</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getName <em>Name</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedReference <em>Normalized Reference</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedName <em>Normalized Name</em>}</li>
 * </ul>
 *
 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference()
 * @model
 * @generated
 */
public interface ActorReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Holds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Holds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Holds</em>' containment reference.
	 * @see #setHolds(Actor)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_Holds()
	 * @model containment="true"
	 * @generated
	 */
	Actor getHolds();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getHolds <em>Holds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Holds</em>' containment reference.
	 * @see #getHolds()
	 * @generated
	 */
	void setHolds(Actor value);

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' reference.
	 * @see #setUses(Actor)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_Uses()
	 * @model
	 * @generated
	 */
	Actor getUses();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getUses <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uses</em>' reference.
	 * @see #getUses()
	 * @generated
	 */
	void setUses(Actor value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_Quantity()
	 * @model default="1" required="true"
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

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
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Normalized Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalized Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalized Reference</em>' reference.
	 * @see #isSetNormalizedReference()
	 * @see #unsetNormalizedReference()
	 * @see #setNormalizedReference(Actor)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_NormalizedReference()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	Actor getNormalizedReference();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedReference <em>Normalized Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalized Reference</em>' reference.
	 * @see #isSetNormalizedReference()
	 * @see #unsetNormalizedReference()
	 * @see #getNormalizedReference()
	 * @generated
	 */
	void setNormalizedReference(Actor value);

	/**
	 * Unsets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedReference <em>Normalized Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalizedReference()
	 * @see #getNormalizedReference()
	 * @see #setNormalizedReference(Actor)
	 * @generated
	 */
	void unsetNormalizedReference();

	/**
	 * Returns whether the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedReference <em>Normalized Reference</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normalized Reference</em>' reference is set.
	 * @see #unsetNormalizedReference()
	 * @see #getNormalizedReference()
	 * @see #setNormalizedReference(Actor)
	 * @generated
	 */
	boolean isSetNormalizedReference();

	/**
	 * Returns the value of the '<em><b>Normalized Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalized Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalized Name</em>' attribute.
	 * @see #isSetNormalizedName()
	 * @see #unsetNormalizedName()
	 * @see #setNormalizedName(String)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getActorReference_NormalizedName()
	 * @model unsettable="true" derived="true"
	 * @generated
	 */
	String getNormalizedName();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedName <em>Normalized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalized Name</em>' attribute.
	 * @see #isSetNormalizedName()
	 * @see #unsetNormalizedName()
	 * @see #getNormalizedName()
	 * @generated
	 */
	void setNormalizedName(String value);

	/**
	 * Unsets the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedName <em>Normalized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNormalizedName()
	 * @see #getNormalizedName()
	 * @see #setNormalizedName(String)
	 * @generated
	 */
	void unsetNormalizedName();

	/**
	 * Returns whether the value of the '{@link com.nukulargames.gdx4e.actors.ActorReference#getNormalizedName <em>Normalized Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Normalized Name</em>' attribute is set.
	 * @see #unsetNormalizedName()
	 * @see #getNormalizedName()
	 * @see #setNormalizedName(String)
	 * @generated
	 */
	boolean isSetNormalizedName();

} // ActorReference

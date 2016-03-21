/**
 */
package com.nukulargames.gdx4e.actors.impl;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.ActorReference;
import com.nukulargames.gdx4e.actors.ActorsPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getHolds <em>Holds</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getNormalizedReference <em>Normalized Reference</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getNormalizedName <em>Normalized Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorReferenceImpl extends MinimalEObjectImpl.Container implements ActorReference {
	/**
	 * The cached value of the '{@link #getHolds() <em>Holds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHolds()
	 * @generated
	 * @ordered
	 */
	protected Actor holds;

	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected Actor uses;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 1;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNormalizedReference() <em>Normalized Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedReference()
	 * @generated
	 * @ordered
	 */
	protected Actor normalizedReference;

	/**
	 * This is true if the Normalized Reference reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalizedReferenceESet;

	/**
	 * The default value of the '{@link #getNormalizedName() <em>Normalized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedName()
	 * @generated
	 * @ordered
	 */
	protected static final String NORMALIZED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNormalizedName() <em>Normalized Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedName()
	 * @generated
	 * @ordered
	 */
	protected String normalizedName = NORMALIZED_NAME_EDEFAULT;

	/**
	 * This is true if the Normalized Name attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean normalizedNameESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActorsPackage.Literals.ACTOR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getHolds() {
		return holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHolds(Actor newHolds, NotificationChain msgs) {
		Actor oldHolds = holds;
		holds = newHolds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__HOLDS, oldHolds, newHolds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHolds(Actor newHolds) {
		if (newHolds != holds) {
			NotificationChain msgs = null;
			if (holds != null)
				msgs = ((InternalEObject)holds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ActorsPackage.ACTOR_REFERENCE__HOLDS, null, msgs);
			if (newHolds != null)
				msgs = ((InternalEObject)newHolds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ActorsPackage.ACTOR_REFERENCE__HOLDS, null, msgs);
			msgs = basicSetHolds(newHolds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__HOLDS, newHolds, newHolds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getUses() {
		if (uses != null && uses.eIsProxy()) {
			InternalEObject oldUses = (InternalEObject)uses;
			uses = (Actor)eResolveProxy(oldUses);
			if (uses != oldUses) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActorsPackage.ACTOR_REFERENCE__USES, oldUses, uses));
			}
		}
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(Actor newUses) {
		Actor oldUses = uses;
		uses = newUses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__USES, oldUses, uses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__QUANTITY, oldQuantity, quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getNormalizedReference() {
		if (normalizedReference != null && normalizedReference.eIsProxy()) {
			InternalEObject oldNormalizedReference = (InternalEObject)normalizedReference;
			normalizedReference = (Actor)eResolveProxy(oldNormalizedReference);
			if (normalizedReference != oldNormalizedReference) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActorsPackage.ACTOR_REFERENCE__NORMALIZED_REFERENCE, oldNormalizedReference, normalizedReference));
			}
		}
		return normalizedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetNormalizedReference() {
		return normalizedReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizedReference(Actor newNormalizedReference) {
		Actor oldNormalizedReference = normalizedReference;
		normalizedReference = newNormalizedReference;
		boolean oldNormalizedReferenceESet = normalizedReferenceESet;
		normalizedReferenceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__NORMALIZED_REFERENCE, oldNormalizedReference, normalizedReference, !oldNormalizedReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNormalizedReference() {
		Actor oldNormalizedReference = normalizedReference;
		boolean oldNormalizedReferenceESet = normalizedReferenceESet;
		normalizedReference = null;
		normalizedReferenceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ActorsPackage.ACTOR_REFERENCE__NORMALIZED_REFERENCE, oldNormalizedReference, null, oldNormalizedReferenceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNormalizedReference() {
		return normalizedReferenceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNormalizedName() {
		return normalizedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizedName(String newNormalizedName) {
		String oldNormalizedName = normalizedName;
		normalizedName = newNormalizedName;
		boolean oldNormalizedNameESet = normalizedNameESet;
		normalizedNameESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__NORMALIZED_NAME, oldNormalizedName, normalizedName, !oldNormalizedNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNormalizedName() {
		String oldNormalizedName = normalizedName;
		boolean oldNormalizedNameESet = normalizedNameESet;
		normalizedName = NORMALIZED_NAME_EDEFAULT;
		normalizedNameESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ActorsPackage.ACTOR_REFERENCE__NORMALIZED_NAME, oldNormalizedName, NORMALIZED_NAME_EDEFAULT, oldNormalizedNameESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNormalizedName() {
		return normalizedNameESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActorsPackage.ACTOR_REFERENCE__HOLDS:
				return basicSetHolds(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActorsPackage.ACTOR_REFERENCE__HOLDS:
				return getHolds();
			case ActorsPackage.ACTOR_REFERENCE__USES:
				if (resolve) return getUses();
				return basicGetUses();
			case ActorsPackage.ACTOR_REFERENCE__QUANTITY:
				return getQuantity();
			case ActorsPackage.ACTOR_REFERENCE__NAME:
				return getName();
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_REFERENCE:
				if (resolve) return getNormalizedReference();
				return basicGetNormalizedReference();
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_NAME:
				return getNormalizedName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ActorsPackage.ACTOR_REFERENCE__HOLDS:
				setHolds((Actor)newValue);
				return;
			case ActorsPackage.ACTOR_REFERENCE__USES:
				setUses((Actor)newValue);
				return;
			case ActorsPackage.ACTOR_REFERENCE__QUANTITY:
				setQuantity((Integer)newValue);
				return;
			case ActorsPackage.ACTOR_REFERENCE__NAME:
				setName((String)newValue);
				return;
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_REFERENCE:
				setNormalizedReference((Actor)newValue);
				return;
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_NAME:
				setNormalizedName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ActorsPackage.ACTOR_REFERENCE__HOLDS:
				setHolds((Actor)null);
				return;
			case ActorsPackage.ACTOR_REFERENCE__USES:
				setUses((Actor)null);
				return;
			case ActorsPackage.ACTOR_REFERENCE__QUANTITY:
				setQuantity(QUANTITY_EDEFAULT);
				return;
			case ActorsPackage.ACTOR_REFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_REFERENCE:
				unsetNormalizedReference();
				return;
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_NAME:
				unsetNormalizedName();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ActorsPackage.ACTOR_REFERENCE__HOLDS:
				return holds != null;
			case ActorsPackage.ACTOR_REFERENCE__USES:
				return uses != null;
			case ActorsPackage.ACTOR_REFERENCE__QUANTITY:
				return quantity != QUANTITY_EDEFAULT;
			case ActorsPackage.ACTOR_REFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_REFERENCE:
				return isSetNormalizedReference();
			case ActorsPackage.ACTOR_REFERENCE__NORMALIZED_NAME:
				return isSetNormalizedName();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (quantity: ");
		result.append(quantity);
		result.append(", name: ");
		result.append(name);
		result.append(", normalizedName: ");
		if (normalizedNameESet) result.append(normalizedName); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ActorReferenceImpl

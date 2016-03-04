/**
 */
package com.nukulargames.gdx4e.actors.impl;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.ActorReference;
import com.nukulargames.gdx4e.actors.ActorsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getActor <em>Actor</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorReferenceImpl#getDimensions <em>Dimensions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorReferenceImpl extends MinimalEObjectImpl.Container implements ActorReference {
	/**
	 * The cached value of the '{@link #getActor() <em>Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActor()
	 * @generated
	 * @ordered
	 */
	protected Actor actor;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> dimensions;

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
	public Actor getActor() {
		if (actor != null && actor.eIsProxy()) {
			InternalEObject oldActor = (InternalEObject)actor;
			actor = (Actor)eResolveProxy(oldActor);
			if (actor != oldActor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActorsPackage.ACTOR_REFERENCE__ACTOR, oldActor, actor));
			}
		}
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetActor() {
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActor(Actor newActor) {
		Actor oldActor = actor;
		actor = newActor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR_REFERENCE__ACTOR, oldActor, actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getDimensions() {
		if (dimensions == null) {
			dimensions = new EDataTypeUniqueEList<Integer>(Integer.class, this, ActorsPackage.ACTOR_REFERENCE__DIMENSIONS);
		}
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ActorsPackage.ACTOR_REFERENCE__ACTOR:
				if (resolve) return getActor();
				return basicGetActor();
			case ActorsPackage.ACTOR_REFERENCE__DIMENSIONS:
				return getDimensions();
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
			case ActorsPackage.ACTOR_REFERENCE__ACTOR:
				setActor((Actor)newValue);
				return;
			case ActorsPackage.ACTOR_REFERENCE__DIMENSIONS:
				getDimensions().clear();
				getDimensions().addAll((Collection<? extends Integer>)newValue);
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
			case ActorsPackage.ACTOR_REFERENCE__ACTOR:
				setActor((Actor)null);
				return;
			case ActorsPackage.ACTOR_REFERENCE__DIMENSIONS:
				getDimensions().clear();
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
			case ActorsPackage.ACTOR_REFERENCE__ACTOR:
				return actor != null;
			case ActorsPackage.ACTOR_REFERENCE__DIMENSIONS:
				return dimensions != null && !dimensions.isEmpty();
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
		result.append(" (dimensions: ");
		result.append(dimensions);
		result.append(')');
		return result.toString();
	}

} //ActorReferenceImpl

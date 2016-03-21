/**
 */
package com.nukulargames.gdx4e.actors.impl;

import com.nukulargames.gdx4e.actors.Actor;
import com.nukulargames.gdx4e.actors.ActorReference;
import com.nukulargames.gdx4e.actors.ActorsPackage;
import com.nukulargames.gdx4e.actors.Animation;
import com.nukulargames.gdx4e.actors.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getX <em>X</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getY <em>Y</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getRotation <em>Rotation</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getAnimations <em>Animations</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getStates <em>States</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getDefaultState <em>Default State</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getNormalizedStates <em>Normalized States</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getNormalizedAnimations <em>Normalized Animations</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getRed <em>Red</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getGreen <em>Green</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getBlue <em>Blue</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.impl.ActorImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorImpl extends MinimalEObjectImpl.Container implements Actor {
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
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final float X_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected float x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final float Y_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected float y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final float WIDTH_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected float width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final float HEIGHT_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected float height = HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALE_X_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getScaleX() <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleX()
	 * @generated
	 * @ordered
	 */
	protected float scaleX = SCALE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected static final float SCALE_Y_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getScaleY() <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScaleY()
	 * @generated
	 * @ordered
	 */
	protected float scaleY = SCALE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected static final float ROTATION_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getRotation() <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotation()
	 * @generated
	 * @ordered
	 */
	protected float rotation = ROTATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnimations() <em>Animations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimations()
	 * @generated
	 * @ordered
	 */
	protected EList<Animation> animations;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getDefaultState() <em>Default State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultState()
	 * @generated
	 * @ordered
	 */
	protected State defaultState;

	/**
	 * The cached value of the '{@link #getNormalizedStates() <em>Normalized States</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> normalizedStates;

	/**
	 * The cached value of the '{@link #getNormalizedAnimations() <em>Normalized Animations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizedAnimations()
	 * @generated
	 * @ordered
	 */
	protected EList<Animation> normalizedAnimations;

	/**
	 * The default value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected static final float RED_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getRed() <em>Red</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed()
	 * @generated
	 * @ordered
	 */
	protected float red = RED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected static final float GREEN_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getGreen() <em>Green</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGreen()
	 * @generated
	 * @ordered
	 */
	protected float green = GREEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected static final float BLUE_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getBlue() <em>Blue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlue()
	 * @generated
	 * @ordered
	 */
	protected float blue = BLUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected static final float ALPHA_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlpha()
	 * @generated
	 * @ordered
	 */
	protected float alpha = ALPHA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorReference> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActorsPackage.Literals.ACTOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setX(float newX) {
		float oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setY(float newY) {
		float oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(float newWidth) {
		float oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(float newHeight) {
		float oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScaleX() {
		return scaleX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleX(float newScaleX) {
		float oldScaleX = scaleX;
		scaleX = newScaleX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__SCALE_X, oldScaleX, scaleX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getScaleY() {
		return scaleY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScaleY(float newScaleY) {
		float oldScaleY = scaleY;
		scaleY = newScaleY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__SCALE_Y, oldScaleY, scaleY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRotation() {
		return rotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRotation(float newRotation) {
		float oldRotation = rotation;
		rotation = newRotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__ROTATION, oldRotation, rotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Animation> getAnimations() {
		if (animations == null) {
			animations = new EObjectContainmentEList<Animation>(Animation.class, this, ActorsPackage.ACTOR__ANIMATIONS);
		}
		return animations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, ActorsPackage.ACTOR__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getDefaultState() {
		if (defaultState != null && defaultState.eIsProxy()) {
			InternalEObject oldDefaultState = (InternalEObject)defaultState;
			defaultState = (State)eResolveProxy(oldDefaultState);
			if (defaultState != oldDefaultState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ActorsPackage.ACTOR__DEFAULT_STATE, oldDefaultState, defaultState));
			}
		}
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State basicGetDefaultState() {
		return defaultState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultState(State newDefaultState) {
		State oldDefaultState = defaultState;
		defaultState = newDefaultState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__DEFAULT_STATE, oldDefaultState, defaultState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getNormalizedStates() {
		if (normalizedStates == null) {
			normalizedStates = new EObjectResolvingEList<State>(State.class, this, ActorsPackage.ACTOR__NORMALIZED_STATES);
		}
		return normalizedStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Animation> getNormalizedAnimations() {
		if (normalizedAnimations == null) {
			normalizedAnimations = new EObjectResolvingEList<Animation>(Animation.class, this, ActorsPackage.ACTOR__NORMALIZED_ANIMATIONS);
		}
		return normalizedAnimations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getRed() {
		return red;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed(float newRed) {
		float oldRed = red;
		red = newRed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__RED, oldRed, red));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getGreen() {
		return green;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGreen(float newGreen) {
		float oldGreen = green;
		green = newGreen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__GREEN, oldGreen, green));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getBlue() {
		return blue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlue(float newBlue) {
		float oldBlue = blue;
		blue = newBlue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__BLUE, oldBlue, blue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAlpha() {
		return alpha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlpha(float newAlpha) {
		float oldAlpha = alpha;
		alpha = newAlpha;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ActorsPackage.ACTOR__ALPHA, oldAlpha, alpha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorReference> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<ActorReference>(ActorReference.class, this, ActorsPackage.ACTOR__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ActorsPackage.ACTOR__ANIMATIONS:
				return ((InternalEList<?>)getAnimations()).basicRemove(otherEnd, msgs);
			case ActorsPackage.ACTOR__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case ActorsPackage.ACTOR__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case ActorsPackage.ACTOR__NAME:
				return getName();
			case ActorsPackage.ACTOR__X:
				return getX();
			case ActorsPackage.ACTOR__Y:
				return getY();
			case ActorsPackage.ACTOR__WIDTH:
				return getWidth();
			case ActorsPackage.ACTOR__HEIGHT:
				return getHeight();
			case ActorsPackage.ACTOR__SCALE_X:
				return getScaleX();
			case ActorsPackage.ACTOR__SCALE_Y:
				return getScaleY();
			case ActorsPackage.ACTOR__ROTATION:
				return getRotation();
			case ActorsPackage.ACTOR__ANIMATIONS:
				return getAnimations();
			case ActorsPackage.ACTOR__STATES:
				return getStates();
			case ActorsPackage.ACTOR__DEFAULT_STATE:
				if (resolve) return getDefaultState();
				return basicGetDefaultState();
			case ActorsPackage.ACTOR__NORMALIZED_STATES:
				return getNormalizedStates();
			case ActorsPackage.ACTOR__NORMALIZED_ANIMATIONS:
				return getNormalizedAnimations();
			case ActorsPackage.ACTOR__RED:
				return getRed();
			case ActorsPackage.ACTOR__GREEN:
				return getGreen();
			case ActorsPackage.ACTOR__BLUE:
				return getBlue();
			case ActorsPackage.ACTOR__ALPHA:
				return getAlpha();
			case ActorsPackage.ACTOR__CHILDREN:
				return getChildren();
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
			case ActorsPackage.ACTOR__NAME:
				setName((String)newValue);
				return;
			case ActorsPackage.ACTOR__X:
				setX((Float)newValue);
				return;
			case ActorsPackage.ACTOR__Y:
				setY((Float)newValue);
				return;
			case ActorsPackage.ACTOR__WIDTH:
				setWidth((Float)newValue);
				return;
			case ActorsPackage.ACTOR__HEIGHT:
				setHeight((Float)newValue);
				return;
			case ActorsPackage.ACTOR__SCALE_X:
				setScaleX((Float)newValue);
				return;
			case ActorsPackage.ACTOR__SCALE_Y:
				setScaleY((Float)newValue);
				return;
			case ActorsPackage.ACTOR__ROTATION:
				setRotation((Float)newValue);
				return;
			case ActorsPackage.ACTOR__ANIMATIONS:
				getAnimations().clear();
				getAnimations().addAll((Collection<? extends Animation>)newValue);
				return;
			case ActorsPackage.ACTOR__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case ActorsPackage.ACTOR__DEFAULT_STATE:
				setDefaultState((State)newValue);
				return;
			case ActorsPackage.ACTOR__NORMALIZED_STATES:
				getNormalizedStates().clear();
				getNormalizedStates().addAll((Collection<? extends State>)newValue);
				return;
			case ActorsPackage.ACTOR__NORMALIZED_ANIMATIONS:
				getNormalizedAnimations().clear();
				getNormalizedAnimations().addAll((Collection<? extends Animation>)newValue);
				return;
			case ActorsPackage.ACTOR__RED:
				setRed((Float)newValue);
				return;
			case ActorsPackage.ACTOR__GREEN:
				setGreen((Float)newValue);
				return;
			case ActorsPackage.ACTOR__BLUE:
				setBlue((Float)newValue);
				return;
			case ActorsPackage.ACTOR__ALPHA:
				setAlpha((Float)newValue);
				return;
			case ActorsPackage.ACTOR__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ActorReference>)newValue);
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
			case ActorsPackage.ACTOR__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__X:
				setX(X_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__Y:
				setY(Y_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__SCALE_X:
				setScaleX(SCALE_X_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__SCALE_Y:
				setScaleY(SCALE_Y_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__ROTATION:
				setRotation(ROTATION_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__ANIMATIONS:
				getAnimations().clear();
				return;
			case ActorsPackage.ACTOR__STATES:
				getStates().clear();
				return;
			case ActorsPackage.ACTOR__DEFAULT_STATE:
				setDefaultState((State)null);
				return;
			case ActorsPackage.ACTOR__NORMALIZED_STATES:
				getNormalizedStates().clear();
				return;
			case ActorsPackage.ACTOR__NORMALIZED_ANIMATIONS:
				getNormalizedAnimations().clear();
				return;
			case ActorsPackage.ACTOR__RED:
				setRed(RED_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__GREEN:
				setGreen(GREEN_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__BLUE:
				setBlue(BLUE_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__ALPHA:
				setAlpha(ALPHA_EDEFAULT);
				return;
			case ActorsPackage.ACTOR__CHILDREN:
				getChildren().clear();
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
			case ActorsPackage.ACTOR__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ActorsPackage.ACTOR__X:
				return x != X_EDEFAULT;
			case ActorsPackage.ACTOR__Y:
				return y != Y_EDEFAULT;
			case ActorsPackage.ACTOR__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ActorsPackage.ACTOR__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ActorsPackage.ACTOR__SCALE_X:
				return scaleX != SCALE_X_EDEFAULT;
			case ActorsPackage.ACTOR__SCALE_Y:
				return scaleY != SCALE_Y_EDEFAULT;
			case ActorsPackage.ACTOR__ROTATION:
				return rotation != ROTATION_EDEFAULT;
			case ActorsPackage.ACTOR__ANIMATIONS:
				return animations != null && !animations.isEmpty();
			case ActorsPackage.ACTOR__STATES:
				return states != null && !states.isEmpty();
			case ActorsPackage.ACTOR__DEFAULT_STATE:
				return defaultState != null;
			case ActorsPackage.ACTOR__NORMALIZED_STATES:
				return normalizedStates != null && !normalizedStates.isEmpty();
			case ActorsPackage.ACTOR__NORMALIZED_ANIMATIONS:
				return normalizedAnimations != null && !normalizedAnimations.isEmpty();
			case ActorsPackage.ACTOR__RED:
				return red != RED_EDEFAULT;
			case ActorsPackage.ACTOR__GREEN:
				return green != GREEN_EDEFAULT;
			case ActorsPackage.ACTOR__BLUE:
				return blue != BLUE_EDEFAULT;
			case ActorsPackage.ACTOR__ALPHA:
				return alpha != ALPHA_EDEFAULT;
			case ActorsPackage.ACTOR__CHILDREN:
				return children != null && !children.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", scaleX: ");
		result.append(scaleX);
		result.append(", scaleY: ");
		result.append(scaleY);
		result.append(", rotation: ");
		result.append(rotation);
		result.append(", red: ");
		result.append(red);
		result.append(", green: ");
		result.append(green);
		result.append(", blue: ");
		result.append(blue);
		result.append(", alpha: ");
		result.append(alpha);
		result.append(')');
		return result.toString();
	}

} //ActorImpl

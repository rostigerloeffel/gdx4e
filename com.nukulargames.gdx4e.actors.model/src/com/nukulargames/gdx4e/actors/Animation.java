/**
 */
package com.nukulargames.gdx4e.actors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.nukulargames.gdx4e.actors.Animation#getName <em>Name</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Animation#getTexture <em>Texture</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Animation#getColumns <em>Columns</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Animation#getRows <em>Rows</em>}</li>
 *   <li>{@link com.nukulargames.gdx4e.actors.Animation#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getAnimation()
 * @model
 * @generated
 */
public interface Animation extends EObject {
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
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getAnimation_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Animation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Texture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Texture</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Texture</em>' attribute.
	 * @see #setTexture(String)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getAnimation_Texture()
	 * @model
	 * @generated
	 */
	String getTexture();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Animation#getTexture <em>Texture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Texture</em>' attribute.
	 * @see #getTexture()
	 * @generated
	 */
	void setTexture(String value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(int)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getAnimation_Columns()
	 * @model default="1"
	 * @generated
	 */
	int getColumns();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Animation#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(int value);

	/**
	 * Returns the value of the '<em><b>Rows</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rows</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rows</em>' attribute.
	 * @see #setRows(int)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getAnimation_Rows()
	 * @model default="1"
	 * @generated
	 */
	int getRows();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Animation#getRows <em>Rows</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rows</em>' attribute.
	 * @see #getRows()
	 * @generated
	 */
	void setRows(int value);

	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * The default value is <code>"0.0f"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(float)
	 * @see com.nukulargames.gdx4e.actors.ActorsPackage#getAnimation_Delay()
	 * @model default="0.0f"
	 * @generated
	 */
	float getDelay();

	/**
	 * Sets the value of the '{@link com.nukulargames.gdx4e.actors.Animation#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(float value);

} // Animation

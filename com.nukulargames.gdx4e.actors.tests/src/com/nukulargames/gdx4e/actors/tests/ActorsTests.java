/**
 */
package com.nukulargames.gdx4e.actors.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>actors</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActorsTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new ActorsTests("actors Tests");
		suite.addTestSuite(ActorTest.class);
		suite.addTestSuite(ActorReferenceTest.class);
		suite.addTestSuite(AnimationTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorsTests(String name) {
		super(name);
	}

} //ActorsTests

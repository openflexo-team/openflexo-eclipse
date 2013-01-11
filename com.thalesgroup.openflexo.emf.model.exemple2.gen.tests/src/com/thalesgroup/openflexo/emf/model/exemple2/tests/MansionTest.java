/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.thalesgroup.openflexo.emf.model.exemple2.tests;

import com.thalesgroup.openflexo.emf.model.exemple2.Exemple2Factory;
import com.thalesgroup.openflexo.emf.model.exemple2.Mansion;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mansion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MansionTest extends HouseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MansionTest.class);
	}

	/**
	 * Constructs a new Mansion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MansionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Mansion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Mansion getFixture() {
		return (Mansion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Exemple2Factory.eINSTANCE.createMansion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //MansionTest

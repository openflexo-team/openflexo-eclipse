/**
 */
package com.thalesgroup.openflexo.emf.model.city2.tests;

import com.thalesgroup.openflexo.emf.model.city2.Appartment;
import com.thalesgroup.openflexo.emf.model.city2.City2Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Appartment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AppartmentTest extends HouseTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AppartmentTest.class);
	}

	/**
	 * Constructs a new Appartment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppartmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Appartment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Appartment getFixture() {
		return (Appartment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(City2Factory.eINSTANCE.createAppartment());
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

} //AppartmentTest

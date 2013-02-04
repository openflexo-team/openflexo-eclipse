/**
 */
package com.thalesgroup.openflexo.emf.model.city1.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import com.thalesgroup.openflexo.emf.model.city1.City1Factory;
import com.thalesgroup.openflexo.emf.model.city1.Resident;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Resident</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ResidentTest extends TestCase {

	/**
	 * The fixture for this Resident test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Resident fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ResidentTest.class);
	}

	/**
	 * Constructs a new Resident test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResidentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Resident test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Resident fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Resident test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Resident getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(City1Factory.eINSTANCE.createResident());
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

} //ResidentTest

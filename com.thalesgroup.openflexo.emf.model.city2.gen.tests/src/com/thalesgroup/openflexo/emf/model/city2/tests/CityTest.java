/**
 */
package com.thalesgroup.openflexo.emf.model.city2.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import com.thalesgroup.openflexo.emf.model.city2.City;
import com.thalesgroup.openflexo.emf.model.city2.City2Factory;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>City</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class CityTest extends TestCase {

	/**
	 * The fixture for this City test case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected City fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CityTest.class);
	}

	/**
	 * Constructs a new City test case with the given name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CityTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this City test case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(City fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this City test case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected City getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(City2Factory.eINSTANCE.createCity());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} // CityTest

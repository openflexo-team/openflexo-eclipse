/**
 */
package com.thalesgroup.openflexo.emf.model.city2.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import com.thalesgroup.openflexo.emf.model.city2.City2Factory;
import com.thalesgroup.openflexo.emf.model.city2.Mayor;

/**
 * <!-- begin-user-doc --> A test case for the model object '<em><b>Mayor</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class MayorTest extends TestCase {

	/**
	 * The fixture for this Mayor test case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Mayor fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MayorTest.class);
	}

	/**
	 * Constructs a new Mayor test case with the given name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MayorTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mayor test case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(Mayor fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mayor test case. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Mayor getFixture() {
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
		setFixture(City2Factory.eINSTANCE.createMayor());
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

} // MayorTest

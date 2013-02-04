/**
 */
package com.thalesgroup.openflexo.emf.model.city1;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package
 * @generated
 */
public interface city1Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	city1Factory eINSTANCE = com.thalesgroup.openflexo.emf.model.city1.impl.city1FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns a new object of class '<em>House</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>House</em>'.
	 * @generated
	 */
	House createHouse();

	/**
	 * Returns a new object of class '<em>Resident</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resident</em>'.
	 * @generated
	 */
	Resident createResident();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	city1Package getcity1Package();

} //city1Factory

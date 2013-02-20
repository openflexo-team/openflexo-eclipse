/**
 */
package com.thalesgroup.openflexo.emf.model.city2;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.openflexo.emf.model.city2.City2Package
 * @generated
 */
public interface City2Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	City2Factory eINSTANCE = com.thalesgroup.openflexo.emf.model.city2.impl.City2FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>City</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>City</em>'.
	 * @generated
	 */
	City createCity();

	/**
	 * Returns a new object of class '<em>Mansion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mansion</em>'.
	 * @generated
	 */
	Mansion createMansion();

	/**
	 * Returns a new object of class '<em>Appartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Appartment</em>'.
	 * @generated
	 */
	Appartment createAppartment();

	/**
	 * Returns a new object of class '<em>Mayor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mayor</em>'.
	 * @generated
	 */
	Mayor createMayor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	City2Package getCity2Package();

} //City2Factory

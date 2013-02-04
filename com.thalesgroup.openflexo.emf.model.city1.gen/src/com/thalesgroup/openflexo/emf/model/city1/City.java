/**
 */
package com.thalesgroup.openflexo.emf.model.city1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city1.City#getHouses <em>Houses</em>}</li>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city1.City#getResidents <em>Residents</em>}</li>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city1.City#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getCity()
 * @model
 * @generated
 */
public interface City extends EObject {
	/**
	 * Returns the value of the '<em><b>Houses</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.openflexo.emf.model.city1.House}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Houses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Houses</em>' containment reference list.
	 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getCity_Houses()
	 * @model containment="true"
	 * @generated
	 */
	EList<House> getHouses();

	/**
	 * Returns the value of the '<em><b>Residents</b></em>' containment reference list.
	 * The list contents are of type {@link com.thalesgroup.openflexo.emf.model.city1.Resident}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Residents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Residents</em>' containment reference list.
	 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getCity_Residents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resident> getResidents();

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
	 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getCity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.thalesgroup.openflexo.emf.model.city1.City#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // City

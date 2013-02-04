/**
 */
package com.thalesgroup.openflexo.emf.model.city1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city1.House#getOwner <em>Owner</em>}</li>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city1.House#getType <em>Type</em>}</li>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.city1.House#getInfo <em>Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(Resident)
	 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getHouse_Owner()
	 * @model required="true"
	 * @generated
	 */
	Resident getOwner();

	/**
	 * Sets the value of the '{@link com.thalesgroup.openflexo.emf.model.city1.House#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(Resident value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link com.thalesgroup.openflexo.emf.model.city1.HouseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see com.thalesgroup.openflexo.emf.model.city1.HouseType
	 * @see #setType(HouseType)
	 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getHouse_Type()
	 * @model required="true"
	 * @generated
	 */
	HouseType getType();

	/**
	 * Sets the value of the '{@link com.thalesgroup.openflexo.emf.model.city1.House#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see com.thalesgroup.openflexo.emf.model.city1.HouseType
	 * @see #getType()
	 * @generated
	 */
	void setType(HouseType value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' attribute.
	 * @see #setInfo(String)
	 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getHouse_Info()
	 * @model required="true"
	 * @generated
	 */
	String getInfo();

	/**
	 * Sets the value of the '{@link com.thalesgroup.openflexo.emf.model.city1.House#getInfo <em>Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' attribute.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(String value);

} // House

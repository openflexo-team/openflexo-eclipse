/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.thalesgroup.openflexo.emf.model.exemple2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mansion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.thalesgroup.openflexo.emf.model.exemple2.Mansion#getNumber <em>Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.thalesgroup.openflexo.emf.model.exemple2.Exemple2Package#getMansion()
 * @model
 * @generated
 */
public interface Mansion extends House {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see com.thalesgroup.openflexo.emf.model.exemple2.Exemple2Package#getMansion_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link com.thalesgroup.openflexo.emf.model.exemple2.Mansion#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

} // Mansion

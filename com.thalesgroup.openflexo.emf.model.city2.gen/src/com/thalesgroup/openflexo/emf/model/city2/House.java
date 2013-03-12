/**
 */
package com.thalesgroup.openflexo.emf.model.city2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>House</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city2.House#getOwner <em>Owner</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.thalesgroup.openflexo.emf.model.city2.City2Package#getHouse()
 * @model abstract="true"
 * @generated
 */
public interface House extends EObject {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see com.thalesgroup.openflexo.emf.model.city2.City2Package#getHouse_Owner()
	 * @model required="true"
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link com.thalesgroup.openflexo.emf.model.city2.House#getOwner <em>Owner</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

} // House

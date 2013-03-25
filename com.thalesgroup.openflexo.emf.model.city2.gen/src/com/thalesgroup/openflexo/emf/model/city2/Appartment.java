/**
 */
package com.thalesgroup.openflexo.emf.model.city2;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Appartment</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link com.thalesgroup.openflexo.emf.model.city2.Appartment#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 * 
 * @see com.thalesgroup.openflexo.emf.model.city2.City2Package#getAppartment()
 * @model
 * @generated
 */
public interface Appartment extends House {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see com.thalesgroup.openflexo.emf.model.city2.City2Package#getAppartment_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link com.thalesgroup.openflexo.emf.model.city2.Appartment#getLabel <em>Label</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Appartment

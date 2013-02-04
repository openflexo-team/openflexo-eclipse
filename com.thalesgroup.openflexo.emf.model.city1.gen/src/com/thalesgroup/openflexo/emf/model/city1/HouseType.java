/**
 */
package com.thalesgroup.openflexo.emf.model.city1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>House Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.thalesgroup.openflexo.emf.model.city1.city1Package#getHouseType()
 * @model
 * @generated
 */
public enum HouseType implements Enumerator {
	/**
	 * The '<em><b>Mansion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANSION_VALUE
	 * @generated
	 * @ordered
	 */
	MANSION(0, "Mansion", "Mansion"),

	/**
	 * The '<em><b>Appartment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPARTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	APPARTMENT(1, "Appartment", "Appartment");

	/**
	 * The '<em><b>Mansion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mansion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANSION
	 * @model name="Mansion"
	 * @generated
	 * @ordered
	 */
	public static final int MANSION_VALUE = 0;

	/**
	 * The '<em><b>Appartment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Appartment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPARTMENT
	 * @model name="Appartment"
	 * @generated
	 * @ordered
	 */
	public static final int APPARTMENT_VALUE = 1;

	/**
	 * An array of all the '<em><b>House Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HouseType[] VALUES_ARRAY =
		new HouseType[] {
			MANSION,
			APPARTMENT,
		};

	/**
	 * A public read-only list of all the '<em><b>House Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HouseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>House Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HouseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HouseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>House Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HouseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HouseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>House Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HouseType get(int value) {
		switch (value) {
			case MANSION_VALUE: return MANSION;
			case APPARTMENT_VALUE: return APPARTMENT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HouseType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HouseType

/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.Struct#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Struct#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Struct#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getStruct()
 * @model
 * @generated
 */
public interface Struct extends BabelDefinition, ElementTypeReference
{
  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getStruct_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(Struct)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getStruct_SuperType()
   * @model
   * @generated
   */
  Struct getSuperType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Struct#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Struct value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getStruct_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

} // Struct

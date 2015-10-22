/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.EnumProperty#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.EnumProperty#getName <em>Name</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.EnumProperty#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getEnumProperty()
 * @model
 * @generated
 */
public interface EnumProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Comment</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getEnumProperty_Comment()
   * @model unique="false"
   * @generated
   */
  EList<String> getComment();

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(EnumPropertyId)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getEnumProperty_Name()
   * @model containment="true"
   * @generated
   */
  EnumPropertyId getName();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.EnumProperty#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(EnumPropertyId value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(EnumOrdinal)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getEnumProperty_Type()
   * @model containment="true"
   * @generated
   */
  EnumOrdinal getType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.EnumProperty#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(EnumOrdinal value);

} // EnumProperty

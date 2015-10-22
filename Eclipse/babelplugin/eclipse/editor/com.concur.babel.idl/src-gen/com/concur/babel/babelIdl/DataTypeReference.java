/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.DataTypeReference#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getDataTypeReference()
 * @model
 * @generated
 */
public interface DataTypeReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.concur.babel.babelIdl.DataTypeEnum}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.concur.babel.babelIdl.DataTypeEnum
   * @see #setType(DataTypeEnum)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getDataTypeReference_Type()
   * @model
   * @generated
   */
  DataTypeEnum getType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.DataTypeReference#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.concur.babel.babelIdl.DataTypeEnum
   * @see #getType()
   * @generated
   */
  void setType(DataTypeEnum value);

} // DataTypeReference

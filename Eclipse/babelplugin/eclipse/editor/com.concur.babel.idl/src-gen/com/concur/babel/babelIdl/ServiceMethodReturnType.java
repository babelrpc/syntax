/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Method Return Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getVoidType <em>Void Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethodReturnType()
 * @model
 * @generated
 */
public interface ServiceMethodReturnType extends EObject
{
  /**
   * Returns the value of the '<em><b>Void Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Void Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Void Type</em>' attribute.
   * @see #setVoidType(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethodReturnType_VoidType()
   * @model
   * @generated
   */
  String getVoidType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getVoidType <em>Void Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Void Type</em>' attribute.
   * @see #getVoidType()
   * @generated
   */
  void setVoidType(String value);

  /**
   * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Type</em>' containment reference.
   * @see #setDataType(DataTypeReference)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethodReturnType_DataType()
   * @model containment="true"
   * @generated
   */
  DataTypeReference getDataType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getDataType <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data Type</em>' containment reference.
   * @see #getDataType()
   * @generated
   */
  void setDataType(DataTypeReference value);

  /**
   * Returns the value of the '<em><b>Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' reference.
   * @see #setElementType(ElementTypeReference)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethodReturnType_ElementType()
   * @model
   * @generated
   */
  ElementTypeReference getElementType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getElementType <em>Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(ElementTypeReference value);

} // ServiceMethodReturnType

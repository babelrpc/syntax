/**
 */
package com.concur.babel.babelIdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.ListType#getDateType <em>Date Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ListType#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getListType()
 * @model
 * @generated
 */
public interface ListType extends DataTypeReference
{
  /**
   * Returns the value of the '<em><b>Date Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Type</em>' containment reference.
   * @see #setDateType(DataTypeReference)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getListType_DateType()
   * @model containment="true"
   * @generated
   */
  DataTypeReference getDateType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ListType#getDateType <em>Date Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Type</em>' containment reference.
   * @see #getDateType()
   * @generated
   */
  void setDateType(DataTypeReference value);

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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getListType_ElementType()
   * @model
   * @generated
   */
  ElementTypeReference getElementType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ListType#getElementType <em>Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(ElementTypeReference value);

} // ListType

/**
 */
package com.concur.babel.babelIdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.MapType#getKeyDataType <em>Key Data Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.MapType#getKeyElementType <em>Key Element Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.MapType#getValDataType <em>Val Data Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.MapType#getValElementType <em>Val Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends DataTypeReference
{
  /**
   * Returns the value of the '<em><b>Key Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Data Type</em>' containment reference.
   * @see #setKeyDataType(DataTypeReference)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getMapType_KeyDataType()
   * @model containment="true"
   * @generated
   */
  DataTypeReference getKeyDataType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.MapType#getKeyDataType <em>Key Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Data Type</em>' containment reference.
   * @see #getKeyDataType()
   * @generated
   */
  void setKeyDataType(DataTypeReference value);

  /**
   * Returns the value of the '<em><b>Key Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key Element Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key Element Type</em>' reference.
   * @see #setKeyElementType(ElementTypeReference)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getMapType_KeyElementType()
   * @model
   * @generated
   */
  ElementTypeReference getKeyElementType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.MapType#getKeyElementType <em>Key Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key Element Type</em>' reference.
   * @see #getKeyElementType()
   * @generated
   */
  void setKeyElementType(ElementTypeReference value);

  /**
   * Returns the value of the '<em><b>Val Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Data Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Data Type</em>' containment reference.
   * @see #setValDataType(DataTypeReference)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getMapType_ValDataType()
   * @model containment="true"
   * @generated
   */
  DataTypeReference getValDataType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.MapType#getValDataType <em>Val Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Data Type</em>' containment reference.
   * @see #getValDataType()
   * @generated
   */
  void setValDataType(DataTypeReference value);

  /**
   * Returns the value of the '<em><b>Val Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Val Element Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Val Element Type</em>' reference.
   * @see #setValElementType(ElementTypeReference)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getMapType_ValElementType()
   * @model
   * @generated
   */
  ElementTypeReference getValElementType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.MapType#getValElementType <em>Val Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Val Element Type</em>' reference.
   * @see #getValElementType()
   * @generated
   */
  void setValElementType(ElementTypeReference value);

} // MapType

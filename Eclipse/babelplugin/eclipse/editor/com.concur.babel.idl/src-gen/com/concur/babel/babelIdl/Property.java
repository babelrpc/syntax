/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.Property#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Property#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Property#getDateType <em>Date Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Property#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Property#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject
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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getProperty_Comment()
   * @model unique="false"
   * @generated
   */
  EList<String> getComment();

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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getProperty_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getProperty_DateType()
   * @model containment="true"
   * @generated
   */
  DataTypeReference getDateType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Property#getDateType <em>Date Type</em>}' containment reference.
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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getProperty_ElementType()
   * @model
   * @generated
   */
  ElementTypeReference getElementType();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Property#getElementType <em>Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(ElementTypeReference value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(PropertyValue)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getProperty_Name()
   * @model containment="true"
   * @generated
   */
  PropertyValue getName();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Property#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(PropertyValue value);

} // Property

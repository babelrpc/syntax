/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethod#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethod#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethod#getReturn <em>Return</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethod#getName <em>Name</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ServiceMethod#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethod()
 * @model
 * @generated
 */
public interface ServiceMethod extends EObject
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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethod_Comment()
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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethod_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return</em>' containment reference.
   * @see #setReturn(ServiceMethodReturnType)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethod_Return()
   * @model containment="true"
   * @generated
   */
  ServiceMethodReturnType getReturn();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ServiceMethod#getReturn <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return</em>' containment reference.
   * @see #getReturn()
   * @generated
   */
  void setReturn(ServiceMethodReturnType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethod_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ServiceMethod#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.ServiceProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceMethod_Properties()
   * @model containment="true"
   * @generated
   */
  EList<ServiceProperty> getProperties();

} // ServiceMethod

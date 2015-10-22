/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.Service#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Service#getServiceMethods <em>Service Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getService()
 * @model
 * @generated
 */
public interface Service extends BabelDefinition
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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getService_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

  /**
   * Returns the value of the '<em><b>Service Methods</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.ServiceMethod}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Service Methods</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Service Methods</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getService_ServiceMethods()
   * @model containment="true"
   * @generated
   */
  EList<ServiceMethod> getServiceMethods();

} // Service

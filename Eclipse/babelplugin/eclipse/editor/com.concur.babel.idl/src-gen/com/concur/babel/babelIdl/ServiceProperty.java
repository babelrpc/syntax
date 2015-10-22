/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.ServiceProperty#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceProperty()
 * @model
 * @generated
 */
public interface ServiceProperty extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(Property)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getServiceProperty_Name()
   * @model containment="true"
   * @generated
   */
  Property getName();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ServiceProperty#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(Property value);

} // ServiceProperty

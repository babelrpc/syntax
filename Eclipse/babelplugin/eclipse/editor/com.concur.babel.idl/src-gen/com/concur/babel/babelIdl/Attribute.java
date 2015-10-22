/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.Attribute#getScope <em>Scope</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Attribute#getAttr <em>Attr</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scope</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scope</em>' attribute.
   * @see #setScope(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getAttribute_Scope()
   * @model
   * @generated
   */
  String getScope();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Attribute#getScope <em>Scope</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scope</em>' attribute.
   * @see #getScope()
   * @generated
   */
  void setScope(String value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' attribute.
   * @see #setAttr(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getAttribute_Attr()
   * @model
   * @generated
   */
  String getAttr();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Attribute#getAttr <em>Attr</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' attribute.
   * @see #getAttr()
   * @generated
   */
  void setAttr(String value);

} // Attribute

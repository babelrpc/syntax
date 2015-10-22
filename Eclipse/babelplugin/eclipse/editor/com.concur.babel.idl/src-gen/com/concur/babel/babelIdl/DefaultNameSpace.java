/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Name Space</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.DefaultNameSpace#getDef <em>Def</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.DefaultNameSpace#getNs <em>Ns</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getDefaultNameSpace()
 * @model
 * @generated
 */
public interface DefaultNameSpace extends EObject
{
  /**
   * Returns the value of the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Def</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Def</em>' attribute.
   * @see #setDef(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getDefaultNameSpace_Def()
   * @model
   * @generated
   */
  String getDef();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.DefaultNameSpace#getDef <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def</em>' attribute.
   * @see #getDef()
   * @generated
   */
  void setDef(String value);

  /**
   * Returns the value of the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ns</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ns</em>' attribute.
   * @see #setNs(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getDefaultNameSpace_Ns()
   * @model
   * @generated
   */
  String getNs();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.DefaultNameSpace#getNs <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns</em>' attribute.
   * @see #getNs()
   * @generated
   */
  void setNs(String value);

} // DefaultNameSpace

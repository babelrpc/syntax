/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.Namespace#getLang <em>Lang</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.Namespace#getNs <em>Ns</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getNamespace()
 * @model
 * @generated
 */
public interface Namespace extends EObject
{
  /**
   * Returns the value of the '<em><b>Lang</b></em>' attribute.
   * The literals are from the enumeration {@link com.concur.babel.babelIdl.SupportedLangs}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lang</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lang</em>' attribute.
   * @see com.concur.babel.babelIdl.SupportedLangs
   * @see #setLang(SupportedLangs)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getNamespace_Lang()
   * @model
   * @generated
   */
  SupportedLangs getLang();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Namespace#getLang <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lang</em>' attribute.
   * @see com.concur.babel.babelIdl.SupportedLangs
   * @see #getLang()
   * @generated
   */
  void setLang(SupportedLangs value);

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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getNamespace_Ns()
   * @model
   * @generated
   */
  String getNs();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.Namespace#getNs <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ns</em>' attribute.
   * @see #getNs()
   * @generated
   */
  void setNs(String value);

} // Namespace

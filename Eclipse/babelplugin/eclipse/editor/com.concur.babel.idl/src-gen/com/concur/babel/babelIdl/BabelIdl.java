/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Babel Idl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.BabelIdl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.BabelIdl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.BabelIdl#getDefaultNamespace <em>Default Namespace</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.BabelIdl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.BabelIdl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getBabelIdl()
 * @model
 * @generated
 */
public interface BabelIdl extends EObject
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
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getBabelIdl_Comment()
   * @model unique="false"
   * @generated
   */
  EList<String> getComment();

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.ImportStatement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getBabelIdl_Imports()
   * @model containment="true"
   * @generated
   */
  EList<ImportStatement> getImports();

  /**
   * Returns the value of the '<em><b>Default Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Namespace</em>' containment reference.
   * @see #setDefaultNamespace(DefaultNameSpace)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getBabelIdl_DefaultNamespace()
   * @model containment="true"
   * @generated
   */
  DefaultNameSpace getDefaultNamespace();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.BabelIdl#getDefaultNamespace <em>Default Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Namespace</em>' containment reference.
   * @see #getDefaultNamespace()
   * @generated
   */
  void setDefaultNamespace(DefaultNameSpace value);

  /**
   * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.Namespace}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespaces</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getBabelIdl_Namespaces()
   * @model containment="true"
   * @generated
   */
  EList<Namespace> getNamespaces();

  /**
   * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.BabelDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definitions</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getBabelIdl_Definitions()
   * @model containment="true"
   * @generated
   */
  EList<BabelDefinition> getDefinitions();

} // BabelIdl

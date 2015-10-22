/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Const Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.ConstValueType#getStringVal <em>String Val</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ConstValueType#getBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.ConstValueType#getNumVal <em>Num Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getConstValueType()
 * @model
 * @generated
 */
public interface ConstValueType extends EObject
{
  /**
   * Returns the value of the '<em><b>String Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Val</em>' attribute.
   * @see #setStringVal(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getConstValueType_StringVal()
   * @model
   * @generated
   */
  String getStringVal();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ConstValueType#getStringVal <em>String Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Val</em>' attribute.
   * @see #getStringVal()
   * @generated
   */
  void setStringVal(String value);

  /**
   * Returns the value of the '<em><b>Bool Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bool Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bool Val</em>' attribute.
   * @see #setBoolVal(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getConstValueType_BoolVal()
   * @model
   * @generated
   */
  String getBoolVal();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ConstValueType#getBoolVal <em>Bool Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bool Val</em>' attribute.
   * @see #getBoolVal()
   * @generated
   */
  void setBoolVal(String value);

  /**
   * Returns the value of the '<em><b>Num Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Val</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Val</em>' attribute.
   * @see #setNumVal(String)
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getConstValueType_NumVal()
   * @model
   * @generated
   */
  String getNumVal();

  /**
   * Sets the value of the '{@link com.concur.babel.babelIdl.ConstValueType#getNumVal <em>Num Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Val</em>' attribute.
   * @see #getNumVal()
   * @generated
   */
  void setNumVal(String value);

} // ConstValueType

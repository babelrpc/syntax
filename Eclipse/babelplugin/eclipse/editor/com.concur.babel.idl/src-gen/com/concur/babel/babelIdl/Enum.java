/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.Enum#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends BabelDefinition, ElementTypeReference
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link com.concur.babel.babelIdl.EnumProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see com.concur.babel.babelIdl.BabelIdlPackage#getEnum_Properties()
   * @model containment="true"
   * @generated
   */
  EList<EnumProperty> getProperties();

} // Enum

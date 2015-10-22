/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.concur.babel.babelIdl.BabelIdlPackage
 * @generated
 */
public interface BabelIdlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BabelIdlFactory eINSTANCE = com.concur.babel.babelIdl.impl.BabelIdlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Babel Idl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Babel Idl</em>'.
   * @generated
   */
  BabelIdl createBabelIdl();

  /**
   * Returns a new object of class '<em>Babel Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Babel Definition</em>'.
   * @generated
   */
  BabelDefinition createBabelDefinition();

  /**
   * Returns a new object of class '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Namespace</em>'.
   * @generated
   */
  Namespace createNamespace();

  /**
   * Returns a new object of class '<em>Default Name Space</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Default Name Space</em>'.
   * @generated
   */
  DefaultNameSpace createDefaultNameSpace();

  /**
   * Returns a new object of class '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Statement</em>'.
   * @generated
   */
  ImportStatement createImportStatement();

  /**
   * Returns a new object of class '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum</em>'.
   * @generated
   */
  Enum createEnum();

  /**
   * Returns a new object of class '<em>Enum Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Property</em>'.
   * @generated
   */
  EnumProperty createEnumProperty();

  /**
   * Returns a new object of class '<em>Enum Ordinal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Ordinal</em>'.
   * @generated
   */
  EnumOrdinal createEnumOrdinal();

  /**
   * Returns a new object of class '<em>Enum Property Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Enum Property Id</em>'.
   * @generated
   */
  EnumPropertyId createEnumPropertyId();

  /**
   * Returns a new object of class '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const</em>'.
   * @generated
   */
  Const createConst();

  /**
   * Returns a new object of class '<em>Const Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const Property</em>'.
   * @generated
   */
  ConstProperty createConstProperty();

  /**
   * Returns a new object of class '<em>Const Value Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const Value Type</em>'.
   * @generated
   */
  ConstValueType createConstValueType();

  /**
   * Returns a new object of class '<em>Const Property Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Const Property Id</em>'.
   * @generated
   */
  ConstPropertyId createConstPropertyId();

  /**
   * Returns a new object of class '<em>Struct</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Struct</em>'.
   * @generated
   */
  Struct createStruct();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Value</em>'.
   * @generated
   */
  PropertyValue createPropertyValue();

  /**
   * Returns a new object of class '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service</em>'.
   * @generated
   */
  Service createService();

  /**
   * Returns a new object of class '<em>Service Method</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Method</em>'.
   * @generated
   */
  ServiceMethod createServiceMethod();

  /**
   * Returns a new object of class '<em>Service Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Property</em>'.
   * @generated
   */
  ServiceProperty createServiceProperty();

  /**
   * Returns a new object of class '<em>Service Method Return Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Service Method Return Type</em>'.
   * @generated
   */
  ServiceMethodReturnType createServiceMethodReturnType();

  /**
   * Returns a new object of class '<em>Data Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Reference</em>'.
   * @generated
   */
  DataTypeReference createDataTypeReference();

  /**
   * Returns a new object of class '<em>Element Type Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Element Type Reference</em>'.
   * @generated
   */
  ElementTypeReference createElementTypeReference();

  /**
   * Returns a new object of class '<em>List Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Type</em>'.
   * @generated
   */
  ListType createListType();

  /**
   * Returns a new object of class '<em>Map Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Type</em>'.
   * @generated
   */
  MapType createMapType();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BabelIdlPackage getBabelIdlPackage();

} //BabelIdlFactory

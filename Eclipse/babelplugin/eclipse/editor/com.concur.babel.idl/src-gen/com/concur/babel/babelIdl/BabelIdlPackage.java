/**
 */
package com.concur.babel.babelIdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.concur.babel.babelIdl.BabelIdlFactory
 * @model kind="package"
 * @generated
 */
public interface BabelIdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "babelIdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.concur.com/babel/BabelIdl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "babelIdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BabelIdlPackage eINSTANCE = com.concur.babel.babelIdl.impl.BabelIdlPackageImpl.init();

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.BabelIdlImpl <em>Babel Idl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.BabelIdlImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getBabelIdl()
   * @generated
   */
  int BABEL_IDL = 0;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_IDL__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_IDL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Default Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_IDL__DEFAULT_NAMESPACE = 2;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_IDL__NAMESPACES = 3;

  /**
   * The feature id for the '<em><b>Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_IDL__DEFINITIONS = 4;

  /**
   * The number of structural features of the '<em>Babel Idl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_IDL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.BabelDefinitionImpl <em>Babel Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.BabelDefinitionImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getBabelDefinition()
   * @generated
   */
  int BABEL_DEFINITION = 1;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_DEFINITION__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_DEFINITION__NAME = 1;

  /**
   * The number of structural features of the '<em>Babel Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BABEL_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.NamespaceImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 2;

  /**
   * The feature id for the '<em><b>Lang</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__LANG = 0;

  /**
   * The feature id for the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NS = 1;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.DefaultNameSpaceImpl <em>Default Name Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.DefaultNameSpaceImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getDefaultNameSpace()
   * @generated
   */
  int DEFAULT_NAME_SPACE = 3;

  /**
   * The feature id for the '<em><b>Def</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NAME_SPACE__DEF = 0;

  /**
   * The feature id for the '<em><b>Ns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NAME_SPACE__NS = 1;

  /**
   * The number of structural features of the '<em>Default Name Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DEFAULT_NAME_SPACE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ImportStatementImpl <em>Import Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ImportStatementImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getImportStatement()
   * @generated
   */
  int IMPORT_STATEMENT = 4;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT__IMPORT_URI = 0;

  /**
   * The number of structural features of the '<em>Import Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_STATEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.EnumImpl <em>Enum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.EnumImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnum()
   * @generated
   */
  int ENUM = 5;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__COMMENT = BABEL_DEFINITION__COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__NAME = BABEL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM__PROPERTIES = BABEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Enum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_FEATURE_COUNT = BABEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.EnumPropertyImpl <em>Enum Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.EnumPropertyImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnumProperty()
   * @generated
   */
  int ENUM_PROPERTY = 6;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY__TYPE = 2;

  /**
   * The number of structural features of the '<em>Enum Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.EnumOrdinalImpl <em>Enum Ordinal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.EnumOrdinalImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnumOrdinal()
   * @generated
   */
  int ENUM_ORDINAL = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ORDINAL__TYPE = 0;

  /**
   * The number of structural features of the '<em>Enum Ordinal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_ORDINAL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.EnumPropertyIdImpl <em>Enum Property Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.EnumPropertyIdImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnumPropertyId()
   * @generated
   */
  int ENUM_PROPERTY_ID = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>Enum Property Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_PROPERTY_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ConstImpl <em>Const</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ConstImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConst()
   * @generated
   */
  int CONST = 9;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__COMMENT = BABEL_DEFINITION__COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__NAME = BABEL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST__PROPERTIES = BABEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Const</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_FEATURE_COUNT = BABEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ConstPropertyImpl <em>Const Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ConstPropertyImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConstProperty()
   * @generated
   */
  int CONST_PROPERTY = 10;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_PROPERTY__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_PROPERTY__NAME = 1;

  /**
   * The feature id for the '<em><b>Val</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_PROPERTY__VAL = 2;

  /**
   * The number of structural features of the '<em>Const Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_PROPERTY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ConstValueTypeImpl <em>Const Value Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ConstValueTypeImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConstValueType()
   * @generated
   */
  int CONST_VALUE_TYPE = 11;

  /**
   * The feature id for the '<em><b>String Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_VALUE_TYPE__STRING_VAL = 0;

  /**
   * The feature id for the '<em><b>Bool Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_VALUE_TYPE__BOOL_VAL = 1;

  /**
   * The feature id for the '<em><b>Num Val</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_VALUE_TYPE__NUM_VAL = 2;

  /**
   * The number of structural features of the '<em>Const Value Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_VALUE_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ConstPropertyIdImpl <em>Const Property Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ConstPropertyIdImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConstPropertyId()
   * @generated
   */
  int CONST_PROPERTY_ID = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_PROPERTY_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>Const Property Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONST_PROPERTY_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.StructImpl <em>Struct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.StructImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getStruct()
   * @generated
   */
  int STRUCT = 13;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__COMMENT = BABEL_DEFINITION__COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__NAME = BABEL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__ATTRIBUTES = BABEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__SUPER_TYPE = BABEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT__PROPERTIES = BABEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCT_FEATURE_COUNT = BABEL_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.PropertyImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 14;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Date Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DATE_TYPE = 2;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ELEMENT_TYPE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 4;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.PropertyValueImpl <em>Property Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.PropertyValueImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getPropertyValue()
   * @generated
   */
  int PROPERTY_VALUE = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>Property Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ServiceImpl <em>Service</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ServiceImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getService()
   * @generated
   */
  int SERVICE = 16;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__COMMENT = BABEL_DEFINITION__COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__NAME = BABEL_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__ATTRIBUTES = BABEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Service Methods</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE__SERVICE_METHODS = BABEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Service</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_FEATURE_COUNT = BABEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ServiceMethodImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getServiceMethod()
   * @generated
   */
  int SERVICE_METHOD = 17;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD__COMMENT = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Return</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD__RETURN = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD__NAME = 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD__PROPERTIES = 4;

  /**
   * The number of structural features of the '<em>Service Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ServicePropertyImpl <em>Service Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ServicePropertyImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getServiceProperty()
   * @generated
   */
  int SERVICE_PROPERTY = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROPERTY__NAME = 0;

  /**
   * The number of structural features of the '<em>Service Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_PROPERTY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ServiceMethodReturnTypeImpl <em>Service Method Return Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ServiceMethodReturnTypeImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getServiceMethodReturnType()
   * @generated
   */
  int SERVICE_METHOD_RETURN_TYPE = 19;

  /**
   * The feature id for the '<em><b>Void Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD_RETURN_TYPE__VOID_TYPE = 0;

  /**
   * The feature id for the '<em><b>Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD_RETURN_TYPE__DATA_TYPE = 1;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE = 2;

  /**
   * The number of structural features of the '<em>Service Method Return Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SERVICE_METHOD_RETURN_TYPE_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.DataTypeReferenceImpl <em>Data Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.DataTypeReferenceImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getDataTypeReference()
   * @generated
   */
  int DATA_TYPE_REFERENCE = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_REFERENCE__TYPE = 0;

  /**
   * The number of structural features of the '<em>Data Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ElementTypeReferenceImpl <em>Element Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ElementTypeReferenceImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getElementTypeReference()
   * @generated
   */
  int ELEMENT_TYPE_REFERENCE = 21;

  /**
   * The number of structural features of the '<em>Element Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.ListTypeImpl <em>List Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.ListTypeImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getListType()
   * @generated
   */
  int LIST_TYPE = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__TYPE = DATA_TYPE_REFERENCE__TYPE;

  /**
   * The feature id for the '<em><b>Date Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__DATE_TYPE = DATA_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE__ELEMENT_TYPE = DATA_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>List Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_TYPE_FEATURE_COUNT = DATA_TYPE_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.MapTypeImpl <em>Map Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.MapTypeImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getMapType()
   * @generated
   */
  int MAP_TYPE = 23;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__TYPE = DATA_TYPE_REFERENCE__TYPE;

  /**
   * The feature id for the '<em><b>Key Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__KEY_DATA_TYPE = DATA_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Key Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__KEY_ELEMENT_TYPE = DATA_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Val Data Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__VAL_DATA_TYPE = DATA_TYPE_REFERENCE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Val Element Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE__VAL_ELEMENT_TYPE = DATA_TYPE_REFERENCE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Map Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAP_TYPE_FEATURE_COUNT = DATA_TYPE_REFERENCE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.impl.AttributeImpl
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 24;

  /**
   * The feature id for the '<em><b>Scope</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__SCOPE = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTR = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.DataTypeEnum <em>Data Type Enum</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.DataTypeEnum
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getDataTypeEnum()
   * @generated
   */
  int DATA_TYPE_ENUM = 25;

  /**
   * The meta object id for the '{@link com.concur.babel.babelIdl.SupportedLangs <em>Supported Langs</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.concur.babel.babelIdl.SupportedLangs
   * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getSupportedLangs()
   * @generated
   */
  int SUPPORTED_LANGS = 26;


  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.BabelIdl <em>Babel Idl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Babel Idl</em>'.
   * @see com.concur.babel.babelIdl.BabelIdl
   * @generated
   */
  EClass getBabelIdl();

  /**
   * Returns the meta object for the attribute list '{@link com.concur.babel.babelIdl.BabelIdl#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comment</em>'.
   * @see com.concur.babel.babelIdl.BabelIdl#getComment()
   * @see #getBabelIdl()
   * @generated
   */
  EAttribute getBabelIdl_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.BabelIdl#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.concur.babel.babelIdl.BabelIdl#getImports()
   * @see #getBabelIdl()
   * @generated
   */
  EReference getBabelIdl_Imports();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.BabelIdl#getDefaultNamespace <em>Default Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Namespace</em>'.
   * @see com.concur.babel.babelIdl.BabelIdl#getDefaultNamespace()
   * @see #getBabelIdl()
   * @generated
   */
  EReference getBabelIdl_DefaultNamespace();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.BabelIdl#getNamespaces <em>Namespaces</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Namespaces</em>'.
   * @see com.concur.babel.babelIdl.BabelIdl#getNamespaces()
   * @see #getBabelIdl()
   * @generated
   */
  EReference getBabelIdl_Namespaces();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.BabelIdl#getDefinitions <em>Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Definitions</em>'.
   * @see com.concur.babel.babelIdl.BabelIdl#getDefinitions()
   * @see #getBabelIdl()
   * @generated
   */
  EReference getBabelIdl_Definitions();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.BabelDefinition <em>Babel Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Babel Definition</em>'.
   * @see com.concur.babel.babelIdl.BabelDefinition
   * @generated
   */
  EClass getBabelDefinition();

  /**
   * Returns the meta object for the attribute list '{@link com.concur.babel.babelIdl.BabelDefinition#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comment</em>'.
   * @see com.concur.babel.babelIdl.BabelDefinition#getComment()
   * @see #getBabelDefinition()
   * @generated
   */
  EAttribute getBabelDefinition_Comment();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.BabelDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.BabelDefinition#getName()
   * @see #getBabelDefinition()
   * @generated
   */
  EAttribute getBabelDefinition_Name();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see com.concur.babel.babelIdl.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.Namespace#getLang <em>Lang</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lang</em>'.
   * @see com.concur.babel.babelIdl.Namespace#getLang()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Lang();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.Namespace#getNs <em>Ns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns</em>'.
   * @see com.concur.babel.babelIdl.Namespace#getNs()
   * @see #getNamespace()
   * @generated
   */
  EAttribute getNamespace_Ns();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.DefaultNameSpace <em>Default Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Default Name Space</em>'.
   * @see com.concur.babel.babelIdl.DefaultNameSpace
   * @generated
   */
  EClass getDefaultNameSpace();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.DefaultNameSpace#getDef <em>Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def</em>'.
   * @see com.concur.babel.babelIdl.DefaultNameSpace#getDef()
   * @see #getDefaultNameSpace()
   * @generated
   */
  EAttribute getDefaultNameSpace_Def();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.DefaultNameSpace#getNs <em>Ns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ns</em>'.
   * @see com.concur.babel.babelIdl.DefaultNameSpace#getNs()
   * @see #getDefaultNameSpace()
   * @generated
   */
  EAttribute getDefaultNameSpace_Ns();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Statement</em>'.
   * @see com.concur.babel.babelIdl.ImportStatement
   * @generated
   */
  EClass getImportStatement();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.ImportStatement#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see com.concur.babel.babelIdl.ImportStatement#getImportURI()
   * @see #getImportStatement()
   * @generated
   */
  EAttribute getImportStatement_ImportURI();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum</em>'.
   * @see com.concur.babel.babelIdl.Enum
   * @generated
   */
  EClass getEnum();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.Enum#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.concur.babel.babelIdl.Enum#getProperties()
   * @see #getEnum()
   * @generated
   */
  EReference getEnum_Properties();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.EnumProperty <em>Enum Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Property</em>'.
   * @see com.concur.babel.babelIdl.EnumProperty
   * @generated
   */
  EClass getEnumProperty();

  /**
   * Returns the meta object for the attribute list '{@link com.concur.babel.babelIdl.EnumProperty#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comment</em>'.
   * @see com.concur.babel.babelIdl.EnumProperty#getComment()
   * @see #getEnumProperty()
   * @generated
   */
  EAttribute getEnumProperty_Comment();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.EnumProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.EnumProperty#getName()
   * @see #getEnumProperty()
   * @generated
   */
  EReference getEnumProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.EnumProperty#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.concur.babel.babelIdl.EnumProperty#getType()
   * @see #getEnumProperty()
   * @generated
   */
  EReference getEnumProperty_Type();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.EnumOrdinal <em>Enum Ordinal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Ordinal</em>'.
   * @see com.concur.babel.babelIdl.EnumOrdinal
   * @generated
   */
  EClass getEnumOrdinal();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.EnumOrdinal#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.concur.babel.babelIdl.EnumOrdinal#getType()
   * @see #getEnumOrdinal()
   * @generated
   */
  EAttribute getEnumOrdinal_Type();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.EnumPropertyId <em>Enum Property Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Property Id</em>'.
   * @see com.concur.babel.babelIdl.EnumPropertyId
   * @generated
   */
  EClass getEnumPropertyId();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.EnumPropertyId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.EnumPropertyId#getName()
   * @see #getEnumPropertyId()
   * @generated
   */
  EAttribute getEnumPropertyId_Name();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.Const <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const</em>'.
   * @see com.concur.babel.babelIdl.Const
   * @generated
   */
  EClass getConst();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.Const#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.concur.babel.babelIdl.Const#getProperties()
   * @see #getConst()
   * @generated
   */
  EReference getConst_Properties();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ConstProperty <em>Const Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const Property</em>'.
   * @see com.concur.babel.babelIdl.ConstProperty
   * @generated
   */
  EClass getConstProperty();

  /**
   * Returns the meta object for the attribute list '{@link com.concur.babel.babelIdl.ConstProperty#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comment</em>'.
   * @see com.concur.babel.babelIdl.ConstProperty#getComment()
   * @see #getConstProperty()
   * @generated
   */
  EAttribute getConstProperty_Comment();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.ConstProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.ConstProperty#getName()
   * @see #getConstProperty()
   * @generated
   */
  EReference getConstProperty_Name();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.ConstProperty#getVal <em>Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val</em>'.
   * @see com.concur.babel.babelIdl.ConstProperty#getVal()
   * @see #getConstProperty()
   * @generated
   */
  EReference getConstProperty_Val();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ConstValueType <em>Const Value Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const Value Type</em>'.
   * @see com.concur.babel.babelIdl.ConstValueType
   * @generated
   */
  EClass getConstValueType();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.ConstValueType#getStringVal <em>String Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Val</em>'.
   * @see com.concur.babel.babelIdl.ConstValueType#getStringVal()
   * @see #getConstValueType()
   * @generated
   */
  EAttribute getConstValueType_StringVal();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.ConstValueType#getBoolVal <em>Bool Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool Val</em>'.
   * @see com.concur.babel.babelIdl.ConstValueType#getBoolVal()
   * @see #getConstValueType()
   * @generated
   */
  EAttribute getConstValueType_BoolVal();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.ConstValueType#getNumVal <em>Num Val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num Val</em>'.
   * @see com.concur.babel.babelIdl.ConstValueType#getNumVal()
   * @see #getConstValueType()
   * @generated
   */
  EAttribute getConstValueType_NumVal();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ConstPropertyId <em>Const Property Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Const Property Id</em>'.
   * @see com.concur.babel.babelIdl.ConstPropertyId
   * @generated
   */
  EClass getConstPropertyId();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.ConstPropertyId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.ConstPropertyId#getName()
   * @see #getConstPropertyId()
   * @generated
   */
  EAttribute getConstPropertyId_Name();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.Struct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Struct</em>'.
   * @see com.concur.babel.babelIdl.Struct
   * @generated
   */
  EClass getStruct();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.Struct#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.concur.babel.babelIdl.Struct#getAttributes()
   * @see #getStruct()
   * @generated
   */
  EReference getStruct_Attributes();

  /**
   * Returns the meta object for the reference '{@link com.concur.babel.babelIdl.Struct#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super Type</em>'.
   * @see com.concur.babel.babelIdl.Struct#getSuperType()
   * @see #getStruct()
   * @generated
   */
  EReference getStruct_SuperType();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.Struct#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.concur.babel.babelIdl.Struct#getProperties()
   * @see #getStruct()
   * @generated
   */
  EReference getStruct_Properties();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see com.concur.babel.babelIdl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute list '{@link com.concur.babel.babelIdl.Property#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comment</em>'.
   * @see com.concur.babel.babelIdl.Property#getComment()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.Property#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.concur.babel.babelIdl.Property#getAttributes()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.Property#getDateType <em>Date Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date Type</em>'.
   * @see com.concur.babel.babelIdl.Property#getDateType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_DateType();

  /**
   * Returns the meta object for the reference '{@link com.concur.babel.babelIdl.Property#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element Type</em>'.
   * @see com.concur.babel.babelIdl.Property#getElementType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_ElementType();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Name();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Value</em>'.
   * @see com.concur.babel.babelIdl.PropertyValue
   * @generated
   */
  EClass getPropertyValue();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.PropertyValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.PropertyValue#getName()
   * @see #getPropertyValue()
   * @generated
   */
  EAttribute getPropertyValue_Name();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service</em>'.
   * @see com.concur.babel.babelIdl.Service
   * @generated
   */
  EClass getService();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.Service#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.concur.babel.babelIdl.Service#getAttributes()
   * @see #getService()
   * @generated
   */
  EReference getService_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.Service#getServiceMethods <em>Service Methods</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Service Methods</em>'.
   * @see com.concur.babel.babelIdl.Service#getServiceMethods()
   * @see #getService()
   * @generated
   */
  EReference getService_ServiceMethods();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ServiceMethod <em>Service Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Method</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethod
   * @generated
   */
  EClass getServiceMethod();

  /**
   * Returns the meta object for the attribute list '{@link com.concur.babel.babelIdl.ServiceMethod#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Comment</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethod#getComment()
   * @see #getServiceMethod()
   * @generated
   */
  EAttribute getServiceMethod_Comment();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.ServiceMethod#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethod#getAttributes()
   * @see #getServiceMethod()
   * @generated
   */
  EReference getServiceMethod_Attributes();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.ServiceMethod#getReturn <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethod#getReturn()
   * @see #getServiceMethod()
   * @generated
   */
  EReference getServiceMethod_Return();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.ServiceMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethod#getName()
   * @see #getServiceMethod()
   * @generated
   */
  EAttribute getServiceMethod_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.concur.babel.babelIdl.ServiceMethod#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethod#getProperties()
   * @see #getServiceMethod()
   * @generated
   */
  EReference getServiceMethod_Properties();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ServiceProperty <em>Service Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Property</em>'.
   * @see com.concur.babel.babelIdl.ServiceProperty
   * @generated
   */
  EClass getServiceProperty();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.ServiceProperty#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see com.concur.babel.babelIdl.ServiceProperty#getName()
   * @see #getServiceProperty()
   * @generated
   */
  EReference getServiceProperty_Name();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ServiceMethodReturnType <em>Service Method Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Service Method Return Type</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethodReturnType
   * @generated
   */
  EClass getServiceMethodReturnType();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getVoidType <em>Void Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Void Type</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethodReturnType#getVoidType()
   * @see #getServiceMethodReturnType()
   * @generated
   */
  EAttribute getServiceMethodReturnType_VoidType();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getDataType <em>Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Data Type</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethodReturnType#getDataType()
   * @see #getServiceMethodReturnType()
   * @generated
   */
  EReference getServiceMethodReturnType_DataType();

  /**
   * Returns the meta object for the reference '{@link com.concur.babel.babelIdl.ServiceMethodReturnType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element Type</em>'.
   * @see com.concur.babel.babelIdl.ServiceMethodReturnType#getElementType()
   * @see #getServiceMethodReturnType()
   * @generated
   */
  EReference getServiceMethodReturnType_ElementType();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.DataTypeReference <em>Data Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Reference</em>'.
   * @see com.concur.babel.babelIdl.DataTypeReference
   * @generated
   */
  EClass getDataTypeReference();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.DataTypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see com.concur.babel.babelIdl.DataTypeReference#getType()
   * @see #getDataTypeReference()
   * @generated
   */
  EAttribute getDataTypeReference_Type();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ElementTypeReference <em>Element Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Type Reference</em>'.
   * @see com.concur.babel.babelIdl.ElementTypeReference
   * @generated
   */
  EClass getElementTypeReference();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Type</em>'.
   * @see com.concur.babel.babelIdl.ListType
   * @generated
   */
  EClass getListType();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.ListType#getDateType <em>Date Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Date Type</em>'.
   * @see com.concur.babel.babelIdl.ListType#getDateType()
   * @see #getListType()
   * @generated
   */
  EReference getListType_DateType();

  /**
   * Returns the meta object for the reference '{@link com.concur.babel.babelIdl.ListType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element Type</em>'.
   * @see com.concur.babel.babelIdl.ListType#getElementType()
   * @see #getListType()
   * @generated
   */
  EReference getListType_ElementType();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.MapType <em>Map Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Map Type</em>'.
   * @see com.concur.babel.babelIdl.MapType
   * @generated
   */
  EClass getMapType();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.MapType#getKeyDataType <em>Key Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Key Data Type</em>'.
   * @see com.concur.babel.babelIdl.MapType#getKeyDataType()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_KeyDataType();

  /**
   * Returns the meta object for the reference '{@link com.concur.babel.babelIdl.MapType#getKeyElementType <em>Key Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Key Element Type</em>'.
   * @see com.concur.babel.babelIdl.MapType#getKeyElementType()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_KeyElementType();

  /**
   * Returns the meta object for the containment reference '{@link com.concur.babel.babelIdl.MapType#getValDataType <em>Val Data Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val Data Type</em>'.
   * @see com.concur.babel.babelIdl.MapType#getValDataType()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_ValDataType();

  /**
   * Returns the meta object for the reference '{@link com.concur.babel.babelIdl.MapType#getValElementType <em>Val Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Val Element Type</em>'.
   * @see com.concur.babel.babelIdl.MapType#getValElementType()
   * @see #getMapType()
   * @generated
   */
  EReference getMapType_ValElementType();

  /**
   * Returns the meta object for class '{@link com.concur.babel.babelIdl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see com.concur.babel.babelIdl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.Attribute#getScope <em>Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Scope</em>'.
   * @see com.concur.babel.babelIdl.Attribute#getScope()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Scope();

  /**
   * Returns the meta object for the attribute '{@link com.concur.babel.babelIdl.Attribute#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attr</em>'.
   * @see com.concur.babel.babelIdl.Attribute#getAttr()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Attr();

  /**
   * Returns the meta object for enum '{@link com.concur.babel.babelIdl.DataTypeEnum <em>Data Type Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Data Type Enum</em>'.
   * @see com.concur.babel.babelIdl.DataTypeEnum
   * @generated
   */
  EEnum getDataTypeEnum();

  /**
   * Returns the meta object for enum '{@link com.concur.babel.babelIdl.SupportedLangs <em>Supported Langs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Supported Langs</em>'.
   * @see com.concur.babel.babelIdl.SupportedLangs
   * @generated
   */
  EEnum getSupportedLangs();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BabelIdlFactory getBabelIdlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.BabelIdlImpl <em>Babel Idl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.BabelIdlImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getBabelIdl()
     * @generated
     */
    EClass BABEL_IDL = eINSTANCE.getBabelIdl();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BABEL_IDL__COMMENT = eINSTANCE.getBabelIdl_Comment();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BABEL_IDL__IMPORTS = eINSTANCE.getBabelIdl_Imports();

    /**
     * The meta object literal for the '<em><b>Default Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BABEL_IDL__DEFAULT_NAMESPACE = eINSTANCE.getBabelIdl_DefaultNamespace();

    /**
     * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BABEL_IDL__NAMESPACES = eINSTANCE.getBabelIdl_Namespaces();

    /**
     * The meta object literal for the '<em><b>Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BABEL_IDL__DEFINITIONS = eINSTANCE.getBabelIdl_Definitions();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.BabelDefinitionImpl <em>Babel Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.BabelDefinitionImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getBabelDefinition()
     * @generated
     */
    EClass BABEL_DEFINITION = eINSTANCE.getBabelDefinition();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BABEL_DEFINITION__COMMENT = eINSTANCE.getBabelDefinition_Comment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BABEL_DEFINITION__NAME = eINSTANCE.getBabelDefinition_Name();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.NamespaceImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__LANG = eINSTANCE.getNamespace_Lang();

    /**
     * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMESPACE__NS = eINSTANCE.getNamespace_Ns();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.DefaultNameSpaceImpl <em>Default Name Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.DefaultNameSpaceImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getDefaultNameSpace()
     * @generated
     */
    EClass DEFAULT_NAME_SPACE = eINSTANCE.getDefaultNameSpace();

    /**
     * The meta object literal for the '<em><b>Def</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_NAME_SPACE__DEF = eINSTANCE.getDefaultNameSpace_Def();

    /**
     * The meta object literal for the '<em><b>Ns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DEFAULT_NAME_SPACE__NS = eINSTANCE.getDefaultNameSpace_Ns();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ImportStatementImpl <em>Import Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ImportStatementImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getImportStatement()
     * @generated
     */
    EClass IMPORT_STATEMENT = eINSTANCE.getImportStatement();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT_STATEMENT__IMPORT_URI = eINSTANCE.getImportStatement_ImportURI();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.EnumImpl <em>Enum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.EnumImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnum()
     * @generated
     */
    EClass ENUM = eINSTANCE.getEnum();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM__PROPERTIES = eINSTANCE.getEnum_Properties();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.EnumPropertyImpl <em>Enum Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.EnumPropertyImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnumProperty()
     * @generated
     */
    EClass ENUM_PROPERTY = eINSTANCE.getEnumProperty();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_PROPERTY__COMMENT = eINSTANCE.getEnumProperty_Comment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_PROPERTY__NAME = eINSTANCE.getEnumProperty_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_PROPERTY__TYPE = eINSTANCE.getEnumProperty_Type();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.EnumOrdinalImpl <em>Enum Ordinal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.EnumOrdinalImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnumOrdinal()
     * @generated
     */
    EClass ENUM_ORDINAL = eINSTANCE.getEnumOrdinal();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_ORDINAL__TYPE = eINSTANCE.getEnumOrdinal_Type();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.EnumPropertyIdImpl <em>Enum Property Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.EnumPropertyIdImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getEnumPropertyId()
     * @generated
     */
    EClass ENUM_PROPERTY_ID = eINSTANCE.getEnumPropertyId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUM_PROPERTY_ID__NAME = eINSTANCE.getEnumPropertyId_Name();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ConstImpl <em>Const</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ConstImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConst()
     * @generated
     */
    EClass CONST = eINSTANCE.getConst();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONST__PROPERTIES = eINSTANCE.getConst_Properties();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ConstPropertyImpl <em>Const Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ConstPropertyImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConstProperty()
     * @generated
     */
    EClass CONST_PROPERTY = eINSTANCE.getConstProperty();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_PROPERTY__COMMENT = eINSTANCE.getConstProperty_Comment();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONST_PROPERTY__NAME = eINSTANCE.getConstProperty_Name();

    /**
     * The meta object literal for the '<em><b>Val</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONST_PROPERTY__VAL = eINSTANCE.getConstProperty_Val();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ConstValueTypeImpl <em>Const Value Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ConstValueTypeImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConstValueType()
     * @generated
     */
    EClass CONST_VALUE_TYPE = eINSTANCE.getConstValueType();

    /**
     * The meta object literal for the '<em><b>String Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_VALUE_TYPE__STRING_VAL = eINSTANCE.getConstValueType_StringVal();

    /**
     * The meta object literal for the '<em><b>Bool Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_VALUE_TYPE__BOOL_VAL = eINSTANCE.getConstValueType_BoolVal();

    /**
     * The meta object literal for the '<em><b>Num Val</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_VALUE_TYPE__NUM_VAL = eINSTANCE.getConstValueType_NumVal();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ConstPropertyIdImpl <em>Const Property Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ConstPropertyIdImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getConstPropertyId()
     * @generated
     */
    EClass CONST_PROPERTY_ID = eINSTANCE.getConstPropertyId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONST_PROPERTY_ID__NAME = eINSTANCE.getConstPropertyId_Name();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.StructImpl <em>Struct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.StructImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getStruct()
     * @generated
     */
    EClass STRUCT = eINSTANCE.getStruct();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT__ATTRIBUTES = eINSTANCE.getStruct_Attributes();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT__SUPER_TYPE = eINSTANCE.getStruct_SuperType();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRUCT__PROPERTIES = eINSTANCE.getStruct_Properties();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.PropertyImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__COMMENT = eINSTANCE.getProperty_Comment();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ATTRIBUTES = eINSTANCE.getProperty_Attributes();

    /**
     * The meta object literal for the '<em><b>Date Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__DATE_TYPE = eINSTANCE.getProperty_DateType();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ELEMENT_TYPE = eINSTANCE.getProperty_ElementType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.PropertyValueImpl <em>Property Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.PropertyValueImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getPropertyValue()
     * @generated
     */
    EClass PROPERTY_VALUE = eINSTANCE.getPropertyValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_VALUE__NAME = eINSTANCE.getPropertyValue_Name();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ServiceImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getService()
     * @generated
     */
    EClass SERVICE = eINSTANCE.getService();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__ATTRIBUTES = eINSTANCE.getService_Attributes();

    /**
     * The meta object literal for the '<em><b>Service Methods</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE__SERVICE_METHODS = eINSTANCE.getService_ServiceMethods();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ServiceMethodImpl <em>Service Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ServiceMethodImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getServiceMethod()
     * @generated
     */
    EClass SERVICE_METHOD = eINSTANCE.getServiceMethod();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_METHOD__COMMENT = eINSTANCE.getServiceMethod_Comment();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_METHOD__ATTRIBUTES = eINSTANCE.getServiceMethod_Attributes();

    /**
     * The meta object literal for the '<em><b>Return</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_METHOD__RETURN = eINSTANCE.getServiceMethod_Return();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_METHOD__NAME = eINSTANCE.getServiceMethod_Name();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_METHOD__PROPERTIES = eINSTANCE.getServiceMethod_Properties();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ServicePropertyImpl <em>Service Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ServicePropertyImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getServiceProperty()
     * @generated
     */
    EClass SERVICE_PROPERTY = eINSTANCE.getServiceProperty();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_PROPERTY__NAME = eINSTANCE.getServiceProperty_Name();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ServiceMethodReturnTypeImpl <em>Service Method Return Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ServiceMethodReturnTypeImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getServiceMethodReturnType()
     * @generated
     */
    EClass SERVICE_METHOD_RETURN_TYPE = eINSTANCE.getServiceMethodReturnType();

    /**
     * The meta object literal for the '<em><b>Void Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SERVICE_METHOD_RETURN_TYPE__VOID_TYPE = eINSTANCE.getServiceMethodReturnType_VoidType();

    /**
     * The meta object literal for the '<em><b>Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_METHOD_RETURN_TYPE__DATA_TYPE = eINSTANCE.getServiceMethodReturnType_DataType();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE = eINSTANCE.getServiceMethodReturnType_ElementType();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.DataTypeReferenceImpl <em>Data Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.DataTypeReferenceImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getDataTypeReference()
     * @generated
     */
    EClass DATA_TYPE_REFERENCE = eINSTANCE.getDataTypeReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DATA_TYPE_REFERENCE__TYPE = eINSTANCE.getDataTypeReference_Type();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ElementTypeReferenceImpl <em>Element Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ElementTypeReferenceImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getElementTypeReference()
     * @generated
     */
    EClass ELEMENT_TYPE_REFERENCE = eINSTANCE.getElementTypeReference();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.ListTypeImpl <em>List Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.ListTypeImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getListType()
     * @generated
     */
    EClass LIST_TYPE = eINSTANCE.getListType();

    /**
     * The meta object literal for the '<em><b>Date Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__DATE_TYPE = eINSTANCE.getListType_DateType();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_TYPE__ELEMENT_TYPE = eINSTANCE.getListType_ElementType();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.MapTypeImpl <em>Map Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.MapTypeImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getMapType()
     * @generated
     */
    EClass MAP_TYPE = eINSTANCE.getMapType();

    /**
     * The meta object literal for the '<em><b>Key Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__KEY_DATA_TYPE = eINSTANCE.getMapType_KeyDataType();

    /**
     * The meta object literal for the '<em><b>Key Element Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__KEY_ELEMENT_TYPE = eINSTANCE.getMapType_KeyElementType();

    /**
     * The meta object literal for the '<em><b>Val Data Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__VAL_DATA_TYPE = eINSTANCE.getMapType_ValDataType();

    /**
     * The meta object literal for the '<em><b>Val Element Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAP_TYPE__VAL_ELEMENT_TYPE = eINSTANCE.getMapType_ValElementType();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.impl.AttributeImpl
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__SCOPE = eINSTANCE.getAttribute_Scope();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTR = eINSTANCE.getAttribute_Attr();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.DataTypeEnum <em>Data Type Enum</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.DataTypeEnum
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getDataTypeEnum()
     * @generated
     */
    EEnum DATA_TYPE_ENUM = eINSTANCE.getDataTypeEnum();

    /**
     * The meta object literal for the '{@link com.concur.babel.babelIdl.SupportedLangs <em>Supported Langs</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.concur.babel.babelIdl.SupportedLangs
     * @see com.concur.babel.babelIdl.impl.BabelIdlPackageImpl#getSupportedLangs()
     * @generated
     */
    EEnum SUPPORTED_LANGS = eINSTANCE.getSupportedLangs();

  }

} //BabelIdlPackage

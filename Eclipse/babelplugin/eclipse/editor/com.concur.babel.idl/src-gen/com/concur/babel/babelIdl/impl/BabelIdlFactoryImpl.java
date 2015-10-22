/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.Attribute;
import com.concur.babel.babelIdl.BabelDefinition;
import com.concur.babel.babelIdl.BabelIdl;
import com.concur.babel.babelIdl.BabelIdlFactory;
import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.Const;
import com.concur.babel.babelIdl.ConstProperty;
import com.concur.babel.babelIdl.ConstPropertyId;
import com.concur.babel.babelIdl.ConstValueType;
import com.concur.babel.babelIdl.DataTypeEnum;
import com.concur.babel.babelIdl.DataTypeReference;
import com.concur.babel.babelIdl.DefaultNameSpace;
import com.concur.babel.babelIdl.ElementTypeReference;
import com.concur.babel.babelIdl.EnumOrdinal;
import com.concur.babel.babelIdl.EnumProperty;
import com.concur.babel.babelIdl.EnumPropertyId;
import com.concur.babel.babelIdl.ImportStatement;
import com.concur.babel.babelIdl.ListType;
import com.concur.babel.babelIdl.MapType;
import com.concur.babel.babelIdl.Namespace;
import com.concur.babel.babelIdl.Property;
import com.concur.babel.babelIdl.PropertyValue;
import com.concur.babel.babelIdl.Service;
import com.concur.babel.babelIdl.ServiceMethod;
import com.concur.babel.babelIdl.ServiceMethodReturnType;
import com.concur.babel.babelIdl.ServiceProperty;
import com.concur.babel.babelIdl.Struct;
import com.concur.babel.babelIdl.SupportedLangs;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BabelIdlFactoryImpl extends EFactoryImpl implements BabelIdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BabelIdlFactory init()
  {
    try
    {
      BabelIdlFactory theBabelIdlFactory = (BabelIdlFactory)EPackage.Registry.INSTANCE.getEFactory(BabelIdlPackage.eNS_URI);
      if (theBabelIdlFactory != null)
      {
        return theBabelIdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BabelIdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BabelIdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BabelIdlPackage.BABEL_IDL: return createBabelIdl();
      case BabelIdlPackage.BABEL_DEFINITION: return createBabelDefinition();
      case BabelIdlPackage.NAMESPACE: return createNamespace();
      case BabelIdlPackage.DEFAULT_NAME_SPACE: return createDefaultNameSpace();
      case BabelIdlPackage.IMPORT_STATEMENT: return createImportStatement();
      case BabelIdlPackage.ENUM: return createEnum();
      case BabelIdlPackage.ENUM_PROPERTY: return createEnumProperty();
      case BabelIdlPackage.ENUM_ORDINAL: return createEnumOrdinal();
      case BabelIdlPackage.ENUM_PROPERTY_ID: return createEnumPropertyId();
      case BabelIdlPackage.CONST: return createConst();
      case BabelIdlPackage.CONST_PROPERTY: return createConstProperty();
      case BabelIdlPackage.CONST_VALUE_TYPE: return createConstValueType();
      case BabelIdlPackage.CONST_PROPERTY_ID: return createConstPropertyId();
      case BabelIdlPackage.STRUCT: return createStruct();
      case BabelIdlPackage.PROPERTY: return createProperty();
      case BabelIdlPackage.PROPERTY_VALUE: return createPropertyValue();
      case BabelIdlPackage.SERVICE: return createService();
      case BabelIdlPackage.SERVICE_METHOD: return createServiceMethod();
      case BabelIdlPackage.SERVICE_PROPERTY: return createServiceProperty();
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE: return createServiceMethodReturnType();
      case BabelIdlPackage.DATA_TYPE_REFERENCE: return createDataTypeReference();
      case BabelIdlPackage.ELEMENT_TYPE_REFERENCE: return createElementTypeReference();
      case BabelIdlPackage.LIST_TYPE: return createListType();
      case BabelIdlPackage.MAP_TYPE: return createMapType();
      case BabelIdlPackage.ATTRIBUTE: return createAttribute();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BabelIdlPackage.DATA_TYPE_ENUM:
        return createDataTypeEnumFromString(eDataType, initialValue);
      case BabelIdlPackage.SUPPORTED_LANGS:
        return createSupportedLangsFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case BabelIdlPackage.DATA_TYPE_ENUM:
        return convertDataTypeEnumToString(eDataType, instanceValue);
      case BabelIdlPackage.SUPPORTED_LANGS:
        return convertSupportedLangsToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BabelIdl createBabelIdl()
  {
    BabelIdlImpl babelIdl = new BabelIdlImpl();
    return babelIdl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BabelDefinition createBabelDefinition()
  {
    BabelDefinitionImpl babelDefinition = new BabelDefinitionImpl();
    return babelDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace createNamespace()
  {
    NamespaceImpl namespace = new NamespaceImpl();
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultNameSpace createDefaultNameSpace()
  {
    DefaultNameSpaceImpl defaultNameSpace = new DefaultNameSpaceImpl();
    return defaultNameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImportStatement createImportStatement()
  {
    ImportStatementImpl importStatement = new ImportStatementImpl();
    return importStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public com.concur.babel.babelIdl.Enum createEnum()
  {
    EnumImpl enum_ = new EnumImpl();
    return enum_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumProperty createEnumProperty()
  {
    EnumPropertyImpl enumProperty = new EnumPropertyImpl();
    return enumProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumOrdinal createEnumOrdinal()
  {
    EnumOrdinalImpl enumOrdinal = new EnumOrdinalImpl();
    return enumOrdinal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumPropertyId createEnumPropertyId()
  {
    EnumPropertyIdImpl enumPropertyId = new EnumPropertyIdImpl();
    return enumPropertyId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Const createConst()
  {
    ConstImpl const_ = new ConstImpl();
    return const_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstProperty createConstProperty()
  {
    ConstPropertyImpl constProperty = new ConstPropertyImpl();
    return constProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstValueType createConstValueType()
  {
    ConstValueTypeImpl constValueType = new ConstValueTypeImpl();
    return constValueType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConstPropertyId createConstPropertyId()
  {
    ConstPropertyIdImpl constPropertyId = new ConstPropertyIdImpl();
    return constPropertyId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Struct createStruct()
  {
    StructImpl struct = new StructImpl();
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValue createPropertyValue()
  {
    PropertyValueImpl propertyValue = new PropertyValueImpl();
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethod createServiceMethod()
  {
    ServiceMethodImpl serviceMethod = new ServiceMethodImpl();
    return serviceMethod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceProperty createServiceProperty()
  {
    ServicePropertyImpl serviceProperty = new ServicePropertyImpl();
    return serviceProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethodReturnType createServiceMethodReturnType()
  {
    ServiceMethodReturnTypeImpl serviceMethodReturnType = new ServiceMethodReturnTypeImpl();
    return serviceMethodReturnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeReference createDataTypeReference()
  {
    DataTypeReferenceImpl dataTypeReference = new DataTypeReferenceImpl();
    return dataTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeReference createElementTypeReference()
  {
    ElementTypeReferenceImpl elementTypeReference = new ElementTypeReferenceImpl();
    return elementTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListType createListType()
  {
    ListTypeImpl listType = new ListTypeImpl();
    return listType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MapType createMapType()
  {
    MapTypeImpl mapType = new MapTypeImpl();
    return mapType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeEnum createDataTypeEnumFromString(EDataType eDataType, String initialValue)
  {
    DataTypeEnum result = DataTypeEnum.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDataTypeEnumToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedLangs createSupportedLangsFromString(EDataType eDataType, String initialValue)
  {
    SupportedLangs result = SupportedLangs.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSupportedLangsToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BabelIdlPackage getBabelIdlPackage()
  {
    return (BabelIdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BabelIdlPackage getPackage()
  {
    return BabelIdlPackage.eINSTANCE;
  }

} //BabelIdlFactoryImpl

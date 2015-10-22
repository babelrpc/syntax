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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BabelIdlPackageImpl extends EPackageImpl implements BabelIdlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass babelIdlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass babelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass namespaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass defaultNameSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass importStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumOrdinalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass enumPropertyIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constPropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constValueTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constPropertyIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass structEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceMethodEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass servicePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass serviceMethodReturnTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass elementTypeReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass listTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mapTypeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum dataTypeEnumEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum supportedLangsEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.concur.babel.babelIdl.BabelIdlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BabelIdlPackageImpl()
  {
    super(eNS_URI, BabelIdlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BabelIdlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BabelIdlPackage init()
  {
    if (isInited) return (BabelIdlPackage)EPackage.Registry.INSTANCE.getEPackage(BabelIdlPackage.eNS_URI);

    // Obtain or create and register package
    BabelIdlPackageImpl theBabelIdlPackage = (BabelIdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BabelIdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BabelIdlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBabelIdlPackage.createPackageContents();

    // Initialize created meta-data
    theBabelIdlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBabelIdlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BabelIdlPackage.eNS_URI, theBabelIdlPackage);
    return theBabelIdlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBabelIdl()
  {
    return babelIdlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBabelIdl_Comment()
  {
    return (EAttribute)babelIdlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBabelIdl_Imports()
  {
    return (EReference)babelIdlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBabelIdl_DefaultNamespace()
  {
    return (EReference)babelIdlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBabelIdl_Namespaces()
  {
    return (EReference)babelIdlEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBabelIdl_Definitions()
  {
    return (EReference)babelIdlEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBabelDefinition()
  {
    return babelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBabelDefinition_Comment()
  {
    return (EAttribute)babelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBabelDefinition_Name()
  {
    return (EAttribute)babelDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getNamespace()
  {
    return namespaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_Lang()
  {
    return (EAttribute)namespaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getNamespace_Ns()
  {
    return (EAttribute)namespaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDefaultNameSpace()
  {
    return defaultNameSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultNameSpace_Def()
  {
    return (EAttribute)defaultNameSpaceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDefaultNameSpace_Ns()
  {
    return (EAttribute)defaultNameSpaceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImportStatement()
  {
    return importStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImportStatement_ImportURI()
  {
    return (EAttribute)importStatementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnum()
  {
    return enumEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnum_Properties()
  {
    return (EReference)enumEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumProperty()
  {
    return enumPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumProperty_Comment()
  {
    return (EAttribute)enumPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumProperty_Name()
  {
    return (EReference)enumPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEnumProperty_Type()
  {
    return (EReference)enumPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumOrdinal()
  {
    return enumOrdinalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumOrdinal_Type()
  {
    return (EAttribute)enumOrdinalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnumPropertyId()
  {
    return enumPropertyIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnumPropertyId_Name()
  {
    return (EAttribute)enumPropertyIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConst()
  {
    return constEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConst_Properties()
  {
    return (EReference)constEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstProperty()
  {
    return constPropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstProperty_Comment()
  {
    return (EAttribute)constPropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstProperty_Name()
  {
    return (EReference)constPropertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstProperty_Val()
  {
    return (EReference)constPropertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstValueType()
  {
    return constValueTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstValueType_StringVal()
  {
    return (EAttribute)constValueTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstValueType_BoolVal()
  {
    return (EAttribute)constValueTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstValueType_NumVal()
  {
    return (EAttribute)constValueTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstPropertyId()
  {
    return constPropertyIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getConstPropertyId_Name()
  {
    return (EAttribute)constPropertyIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStruct()
  {
    return structEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Attributes()
  {
    return (EReference)structEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_SuperType()
  {
    return (EReference)structEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStruct_Properties()
  {
    return (EReference)structEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Comment()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Attributes()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_DateType()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_ElementType()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Name()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyValue()
  {
    return propertyValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyValue_Name()
  {
    return (EAttribute)propertyValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getService()
  {
    return serviceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_Attributes()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getService_ServiceMethods()
  {
    return (EReference)serviceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceMethod()
  {
    return serviceMethodEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceMethod_Comment()
  {
    return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceMethod_Attributes()
  {
    return (EReference)serviceMethodEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceMethod_Return()
  {
    return (EReference)serviceMethodEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceMethod_Name()
  {
    return (EAttribute)serviceMethodEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceMethod_Properties()
  {
    return (EReference)serviceMethodEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceProperty()
  {
    return servicePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceProperty_Name()
  {
    return (EReference)servicePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getServiceMethodReturnType()
  {
    return serviceMethodReturnTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getServiceMethodReturnType_VoidType()
  {
    return (EAttribute)serviceMethodReturnTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceMethodReturnType_DataType()
  {
    return (EReference)serviceMethodReturnTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getServiceMethodReturnType_ElementType()
  {
    return (EReference)serviceMethodReturnTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDataTypeReference()
  {
    return dataTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDataTypeReference_Type()
  {
    return (EAttribute)dataTypeReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getElementTypeReference()
  {
    return elementTypeReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getListType()
  {
    return listTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListType_DateType()
  {
    return (EReference)listTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getListType_ElementType()
  {
    return (EReference)listTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMapType()
  {
    return mapTypeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapType_KeyDataType()
  {
    return (EReference)mapTypeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapType_KeyElementType()
  {
    return (EReference)mapTypeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapType_ValDataType()
  {
    return (EReference)mapTypeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMapType_ValElementType()
  {
    return (EReference)mapTypeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Scope()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Attr()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDataTypeEnum()
  {
    return dataTypeEnumEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getSupportedLangs()
  {
    return supportedLangsEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BabelIdlFactory getBabelIdlFactory()
  {
    return (BabelIdlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    babelIdlEClass = createEClass(BABEL_IDL);
    createEAttribute(babelIdlEClass, BABEL_IDL__COMMENT);
    createEReference(babelIdlEClass, BABEL_IDL__IMPORTS);
    createEReference(babelIdlEClass, BABEL_IDL__DEFAULT_NAMESPACE);
    createEReference(babelIdlEClass, BABEL_IDL__NAMESPACES);
    createEReference(babelIdlEClass, BABEL_IDL__DEFINITIONS);

    babelDefinitionEClass = createEClass(BABEL_DEFINITION);
    createEAttribute(babelDefinitionEClass, BABEL_DEFINITION__COMMENT);
    createEAttribute(babelDefinitionEClass, BABEL_DEFINITION__NAME);

    namespaceEClass = createEClass(NAMESPACE);
    createEAttribute(namespaceEClass, NAMESPACE__LANG);
    createEAttribute(namespaceEClass, NAMESPACE__NS);

    defaultNameSpaceEClass = createEClass(DEFAULT_NAME_SPACE);
    createEAttribute(defaultNameSpaceEClass, DEFAULT_NAME_SPACE__DEF);
    createEAttribute(defaultNameSpaceEClass, DEFAULT_NAME_SPACE__NS);

    importStatementEClass = createEClass(IMPORT_STATEMENT);
    createEAttribute(importStatementEClass, IMPORT_STATEMENT__IMPORT_URI);

    enumEClass = createEClass(ENUM);
    createEReference(enumEClass, ENUM__PROPERTIES);

    enumPropertyEClass = createEClass(ENUM_PROPERTY);
    createEAttribute(enumPropertyEClass, ENUM_PROPERTY__COMMENT);
    createEReference(enumPropertyEClass, ENUM_PROPERTY__NAME);
    createEReference(enumPropertyEClass, ENUM_PROPERTY__TYPE);

    enumOrdinalEClass = createEClass(ENUM_ORDINAL);
    createEAttribute(enumOrdinalEClass, ENUM_ORDINAL__TYPE);

    enumPropertyIdEClass = createEClass(ENUM_PROPERTY_ID);
    createEAttribute(enumPropertyIdEClass, ENUM_PROPERTY_ID__NAME);

    constEClass = createEClass(CONST);
    createEReference(constEClass, CONST__PROPERTIES);

    constPropertyEClass = createEClass(CONST_PROPERTY);
    createEAttribute(constPropertyEClass, CONST_PROPERTY__COMMENT);
    createEReference(constPropertyEClass, CONST_PROPERTY__NAME);
    createEReference(constPropertyEClass, CONST_PROPERTY__VAL);

    constValueTypeEClass = createEClass(CONST_VALUE_TYPE);
    createEAttribute(constValueTypeEClass, CONST_VALUE_TYPE__STRING_VAL);
    createEAttribute(constValueTypeEClass, CONST_VALUE_TYPE__BOOL_VAL);
    createEAttribute(constValueTypeEClass, CONST_VALUE_TYPE__NUM_VAL);

    constPropertyIdEClass = createEClass(CONST_PROPERTY_ID);
    createEAttribute(constPropertyIdEClass, CONST_PROPERTY_ID__NAME);

    structEClass = createEClass(STRUCT);
    createEReference(structEClass, STRUCT__ATTRIBUTES);
    createEReference(structEClass, STRUCT__SUPER_TYPE);
    createEReference(structEClass, STRUCT__PROPERTIES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__COMMENT);
    createEReference(propertyEClass, PROPERTY__ATTRIBUTES);
    createEReference(propertyEClass, PROPERTY__DATE_TYPE);
    createEReference(propertyEClass, PROPERTY__ELEMENT_TYPE);
    createEReference(propertyEClass, PROPERTY__NAME);

    propertyValueEClass = createEClass(PROPERTY_VALUE);
    createEAttribute(propertyValueEClass, PROPERTY_VALUE__NAME);

    serviceEClass = createEClass(SERVICE);
    createEReference(serviceEClass, SERVICE__ATTRIBUTES);
    createEReference(serviceEClass, SERVICE__SERVICE_METHODS);

    serviceMethodEClass = createEClass(SERVICE_METHOD);
    createEAttribute(serviceMethodEClass, SERVICE_METHOD__COMMENT);
    createEReference(serviceMethodEClass, SERVICE_METHOD__ATTRIBUTES);
    createEReference(serviceMethodEClass, SERVICE_METHOD__RETURN);
    createEAttribute(serviceMethodEClass, SERVICE_METHOD__NAME);
    createEReference(serviceMethodEClass, SERVICE_METHOD__PROPERTIES);

    servicePropertyEClass = createEClass(SERVICE_PROPERTY);
    createEReference(servicePropertyEClass, SERVICE_PROPERTY__NAME);

    serviceMethodReturnTypeEClass = createEClass(SERVICE_METHOD_RETURN_TYPE);
    createEAttribute(serviceMethodReturnTypeEClass, SERVICE_METHOD_RETURN_TYPE__VOID_TYPE);
    createEReference(serviceMethodReturnTypeEClass, SERVICE_METHOD_RETURN_TYPE__DATA_TYPE);
    createEReference(serviceMethodReturnTypeEClass, SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE);

    dataTypeReferenceEClass = createEClass(DATA_TYPE_REFERENCE);
    createEAttribute(dataTypeReferenceEClass, DATA_TYPE_REFERENCE__TYPE);

    elementTypeReferenceEClass = createEClass(ELEMENT_TYPE_REFERENCE);

    listTypeEClass = createEClass(LIST_TYPE);
    createEReference(listTypeEClass, LIST_TYPE__DATE_TYPE);
    createEReference(listTypeEClass, LIST_TYPE__ELEMENT_TYPE);

    mapTypeEClass = createEClass(MAP_TYPE);
    createEReference(mapTypeEClass, MAP_TYPE__KEY_DATA_TYPE);
    createEReference(mapTypeEClass, MAP_TYPE__KEY_ELEMENT_TYPE);
    createEReference(mapTypeEClass, MAP_TYPE__VAL_DATA_TYPE);
    createEReference(mapTypeEClass, MAP_TYPE__VAL_ELEMENT_TYPE);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__SCOPE);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTR);

    // Create enums
    dataTypeEnumEEnum = createEEnum(DATA_TYPE_ENUM);
    supportedLangsEEnum = createEEnum(SUPPORTED_LANGS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    enumEClass.getESuperTypes().add(this.getBabelDefinition());
    enumEClass.getESuperTypes().add(this.getElementTypeReference());
    constEClass.getESuperTypes().add(this.getBabelDefinition());
    structEClass.getESuperTypes().add(this.getBabelDefinition());
    structEClass.getESuperTypes().add(this.getElementTypeReference());
    serviceEClass.getESuperTypes().add(this.getBabelDefinition());
    listTypeEClass.getESuperTypes().add(this.getDataTypeReference());
    mapTypeEClass.getESuperTypes().add(this.getDataTypeReference());

    // Initialize classes and features; add operations and parameters
    initEClass(babelIdlEClass, BabelIdl.class, "BabelIdl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBabelIdl_Comment(), ecorePackage.getEString(), "comment", null, 0, -1, BabelIdl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBabelIdl_Imports(), this.getImportStatement(), null, "imports", null, 0, -1, BabelIdl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBabelIdl_DefaultNamespace(), this.getDefaultNameSpace(), null, "defaultNamespace", null, 0, 1, BabelIdl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBabelIdl_Namespaces(), this.getNamespace(), null, "namespaces", null, 0, -1, BabelIdl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBabelIdl_Definitions(), this.getBabelDefinition(), null, "definitions", null, 0, -1, BabelIdl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(babelDefinitionEClass, BabelDefinition.class, "BabelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBabelDefinition_Comment(), ecorePackage.getEString(), "comment", null, 0, -1, BabelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getBabelDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, BabelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNamespace_Lang(), this.getSupportedLangs(), "lang", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getNamespace_Ns(), ecorePackage.getEString(), "ns", null, 0, 1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(defaultNameSpaceEClass, DefaultNameSpace.class, "DefaultNameSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefaultNameSpace_Def(), ecorePackage.getEString(), "def", null, 0, 1, DefaultNameSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDefaultNameSpace_Ns(), ecorePackage.getEString(), "ns", null, 0, 1, DefaultNameSpace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(importStatementEClass, ImportStatement.class, "ImportStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImportStatement_ImportURI(), ecorePackage.getEString(), "importURI", null, 0, 1, ImportStatement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumEClass, com.concur.babel.babelIdl.Enum.class, "Enum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEnum_Properties(), this.getEnumProperty(), null, "properties", null, 0, -1, com.concur.babel.babelIdl.Enum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumPropertyEClass, EnumProperty.class, "EnumProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumProperty_Comment(), ecorePackage.getEString(), "comment", null, 0, -1, EnumProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumProperty_Name(), this.getEnumPropertyId(), null, "name", null, 0, 1, EnumProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEnumProperty_Type(), this.getEnumOrdinal(), null, "type", null, 0, 1, EnumProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumOrdinalEClass, EnumOrdinal.class, "EnumOrdinal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumOrdinal_Type(), ecorePackage.getEInt(), "type", null, 0, 1, EnumOrdinal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(enumPropertyIdEClass, EnumPropertyId.class, "EnumPropertyId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnumPropertyId_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnumPropertyId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constEClass, Const.class, "Const", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConst_Properties(), this.getConstProperty(), null, "properties", null, 0, -1, Const.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constPropertyEClass, ConstProperty.class, "ConstProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstProperty_Comment(), ecorePackage.getEString(), "comment", null, 0, -1, ConstProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstProperty_Name(), this.getConstPropertyId(), null, "name", null, 0, 1, ConstProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstProperty_Val(), this.getConstValueType(), null, "val", null, 0, 1, ConstProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constValueTypeEClass, ConstValueType.class, "ConstValueType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstValueType_StringVal(), ecorePackage.getEString(), "stringVal", null, 0, 1, ConstValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstValueType_BoolVal(), ecorePackage.getEString(), "boolVal", null, 0, 1, ConstValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getConstValueType_NumVal(), ecorePackage.getEString(), "numVal", null, 0, 1, ConstValueType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constPropertyIdEClass, ConstPropertyId.class, "ConstPropertyId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getConstPropertyId_Name(), ecorePackage.getEString(), "name", null, 0, 1, ConstPropertyId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(structEClass, Struct.class, "Struct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStruct_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_SuperType(), this.getStruct(), null, "superType", null, 0, 1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStruct_Properties(), this.getProperty(), null, "properties", null, 0, -1, Struct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Comment(), ecorePackage.getEString(), "comment", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_DateType(), this.getDataTypeReference(), null, "dateType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_ElementType(), this.getElementTypeReference(), null, "elementType", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Name(), this.getPropertyValue(), null, "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getService_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getService_ServiceMethods(), this.getServiceMethod(), null, "serviceMethods", null, 0, -1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceMethod_Comment(), ecorePackage.getEString(), "comment", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceMethod_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceMethod_Return(), this.getServiceMethodReturnType(), null, "return", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getServiceMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceMethod_Properties(), this.getServiceProperty(), null, "properties", null, 0, -1, ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(servicePropertyEClass, ServiceProperty.class, "ServiceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getServiceProperty_Name(), this.getProperty(), null, "name", null, 0, 1, ServiceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(serviceMethodReturnTypeEClass, ServiceMethodReturnType.class, "ServiceMethodReturnType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getServiceMethodReturnType_VoidType(), ecorePackage.getEString(), "voidType", null, 0, 1, ServiceMethodReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceMethodReturnType_DataType(), this.getDataTypeReference(), null, "dataType", null, 0, 1, ServiceMethodReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getServiceMethodReturnType_ElementType(), this.getElementTypeReference(), null, "elementType", null, 0, 1, ServiceMethodReturnType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeReferenceEClass, DataTypeReference.class, "DataTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDataTypeReference_Type(), this.getDataTypeEnum(), "type", null, 0, 1, DataTypeReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(elementTypeReferenceEClass, ElementTypeReference.class, "ElementTypeReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(listTypeEClass, ListType.class, "ListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getListType_DateType(), this.getDataTypeReference(), null, "dateType", null, 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getListType_ElementType(), this.getElementTypeReference(), null, "elementType", null, 0, 1, ListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mapTypeEClass, MapType.class, "MapType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMapType_KeyDataType(), this.getDataTypeReference(), null, "keyDataType", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapType_KeyElementType(), this.getElementTypeReference(), null, "keyElementType", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapType_ValDataType(), this.getDataTypeReference(), null, "valDataType", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapType_ValElementType(), this.getElementTypeReference(), null, "valElementType", null, 0, 1, MapType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_Attr(), ecorePackage.getEString(), "attr", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(dataTypeEnumEEnum, DataTypeEnum.class, "DataTypeEnum");
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.BOOL);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.BYTE);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.UNIT16);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.UINT32);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.UNIT64);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.SBYTE);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.INT16);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.INT32);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.INT64);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.FLOAT32);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.FLOAT64);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.STRING);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.DATETIME);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.DECIMAL);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.CHAR);
    addEEnumLiteral(dataTypeEnumEEnum, DataTypeEnum.BINARY);

    initEEnum(supportedLangsEEnum, SupportedLangs.class, "SupportedLangs");
    addEEnumLiteral(supportedLangsEEnum, SupportedLangs.JAVA);
    addEEnumLiteral(supportedLangsEEnum, SupportedLangs.CSHARP);
    addEEnumLiteral(supportedLangsEEnum, SupportedLangs.ASP);

    // Create resource
    createResource(eNS_URI);
  }

} //BabelIdlPackageImpl

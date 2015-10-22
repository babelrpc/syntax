/**
 */
package com.concur.babel.babelIdl.util;

import com.concur.babel.babelIdl.Attribute;
import com.concur.babel.babelIdl.BabelDefinition;
import com.concur.babel.babelIdl.BabelIdl;
import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.Const;
import com.concur.babel.babelIdl.ConstProperty;
import com.concur.babel.babelIdl.ConstPropertyId;
import com.concur.babel.babelIdl.ConstValueType;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.concur.babel.babelIdl.BabelIdlPackage
 * @generated
 */
public class BabelIdlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BabelIdlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BabelIdlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BabelIdlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BabelIdlSwitch<Adapter> modelSwitch =
    new BabelIdlSwitch<Adapter>()
    {
      @Override
      public Adapter caseBabelIdl(BabelIdl object)
      {
        return createBabelIdlAdapter();
      }
      @Override
      public Adapter caseBabelDefinition(BabelDefinition object)
      {
        return createBabelDefinitionAdapter();
      }
      @Override
      public Adapter caseNamespace(Namespace object)
      {
        return createNamespaceAdapter();
      }
      @Override
      public Adapter caseDefaultNameSpace(DefaultNameSpace object)
      {
        return createDefaultNameSpaceAdapter();
      }
      @Override
      public Adapter caseImportStatement(ImportStatement object)
      {
        return createImportStatementAdapter();
      }
      @Override
      public Adapter caseEnum(com.concur.babel.babelIdl.Enum object)
      {
        return createEnumAdapter();
      }
      @Override
      public Adapter caseEnumProperty(EnumProperty object)
      {
        return createEnumPropertyAdapter();
      }
      @Override
      public Adapter caseEnumOrdinal(EnumOrdinal object)
      {
        return createEnumOrdinalAdapter();
      }
      @Override
      public Adapter caseEnumPropertyId(EnumPropertyId object)
      {
        return createEnumPropertyIdAdapter();
      }
      @Override
      public Adapter caseConst(Const object)
      {
        return createConstAdapter();
      }
      @Override
      public Adapter caseConstProperty(ConstProperty object)
      {
        return createConstPropertyAdapter();
      }
      @Override
      public Adapter caseConstValueType(ConstValueType object)
      {
        return createConstValueTypeAdapter();
      }
      @Override
      public Adapter caseConstPropertyId(ConstPropertyId object)
      {
        return createConstPropertyIdAdapter();
      }
      @Override
      public Adapter caseStruct(Struct object)
      {
        return createStructAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter casePropertyValue(PropertyValue object)
      {
        return createPropertyValueAdapter();
      }
      @Override
      public Adapter caseService(Service object)
      {
        return createServiceAdapter();
      }
      @Override
      public Adapter caseServiceMethod(ServiceMethod object)
      {
        return createServiceMethodAdapter();
      }
      @Override
      public Adapter caseServiceProperty(ServiceProperty object)
      {
        return createServicePropertyAdapter();
      }
      @Override
      public Adapter caseServiceMethodReturnType(ServiceMethodReturnType object)
      {
        return createServiceMethodReturnTypeAdapter();
      }
      @Override
      public Adapter caseDataTypeReference(DataTypeReference object)
      {
        return createDataTypeReferenceAdapter();
      }
      @Override
      public Adapter caseElementTypeReference(ElementTypeReference object)
      {
        return createElementTypeReferenceAdapter();
      }
      @Override
      public Adapter caseListType(ListType object)
      {
        return createListTypeAdapter();
      }
      @Override
      public Adapter caseMapType(MapType object)
      {
        return createMapTypeAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.BabelIdl <em>Babel Idl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.BabelIdl
   * @generated
   */
  public Adapter createBabelIdlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.BabelDefinition <em>Babel Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.BabelDefinition
   * @generated
   */
  public Adapter createBabelDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.Namespace
   * @generated
   */
  public Adapter createNamespaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.DefaultNameSpace <em>Default Name Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.DefaultNameSpace
   * @generated
   */
  public Adapter createDefaultNameSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ImportStatement <em>Import Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ImportStatement
   * @generated
   */
  public Adapter createImportStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.Enum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.Enum
   * @generated
   */
  public Adapter createEnumAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.EnumProperty <em>Enum Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.EnumProperty
   * @generated
   */
  public Adapter createEnumPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.EnumOrdinal <em>Enum Ordinal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.EnumOrdinal
   * @generated
   */
  public Adapter createEnumOrdinalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.EnumPropertyId <em>Enum Property Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.EnumPropertyId
   * @generated
   */
  public Adapter createEnumPropertyIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.Const <em>Const</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.Const
   * @generated
   */
  public Adapter createConstAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ConstProperty <em>Const Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ConstProperty
   * @generated
   */
  public Adapter createConstPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ConstValueType <em>Const Value Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ConstValueType
   * @generated
   */
  public Adapter createConstValueTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ConstPropertyId <em>Const Property Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ConstPropertyId
   * @generated
   */
  public Adapter createConstPropertyIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.Struct <em>Struct</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.Struct
   * @generated
   */
  public Adapter createStructAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.PropertyValue <em>Property Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.PropertyValue
   * @generated
   */
  public Adapter createPropertyValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.Service <em>Service</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.Service
   * @generated
   */
  public Adapter createServiceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ServiceMethod <em>Service Method</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ServiceMethod
   * @generated
   */
  public Adapter createServiceMethodAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ServiceProperty <em>Service Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ServiceProperty
   * @generated
   */
  public Adapter createServicePropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ServiceMethodReturnType <em>Service Method Return Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ServiceMethodReturnType
   * @generated
   */
  public Adapter createServiceMethodReturnTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.DataTypeReference <em>Data Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.DataTypeReference
   * @generated
   */
  public Adapter createDataTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ElementTypeReference <em>Element Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ElementTypeReference
   * @generated
   */
  public Adapter createElementTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.ListType <em>List Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.ListType
   * @generated
   */
  public Adapter createListTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.MapType <em>Map Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.MapType
   * @generated
   */
  public Adapter createMapTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.concur.babel.babelIdl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.concur.babel.babelIdl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BabelIdlAdapterFactory

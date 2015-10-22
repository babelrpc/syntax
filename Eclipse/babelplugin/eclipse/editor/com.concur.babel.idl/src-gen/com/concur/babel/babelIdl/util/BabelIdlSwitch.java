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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.concur.babel.babelIdl.BabelIdlPackage
 * @generated
 */
public class BabelIdlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BabelIdlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BabelIdlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = BabelIdlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case BabelIdlPackage.BABEL_IDL:
      {
        BabelIdl babelIdl = (BabelIdl)theEObject;
        T result = caseBabelIdl(babelIdl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.BABEL_DEFINITION:
      {
        BabelDefinition babelDefinition = (BabelDefinition)theEObject;
        T result = caseBabelDefinition(babelDefinition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.NAMESPACE:
      {
        Namespace namespace = (Namespace)theEObject;
        T result = caseNamespace(namespace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.DEFAULT_NAME_SPACE:
      {
        DefaultNameSpace defaultNameSpace = (DefaultNameSpace)theEObject;
        T result = caseDefaultNameSpace(defaultNameSpace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.IMPORT_STATEMENT:
      {
        ImportStatement importStatement = (ImportStatement)theEObject;
        T result = caseImportStatement(importStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.ENUM:
      {
        com.concur.babel.babelIdl.Enum enum_ = (com.concur.babel.babelIdl.Enum)theEObject;
        T result = caseEnum(enum_);
        if (result == null) result = caseBabelDefinition(enum_);
        if (result == null) result = caseElementTypeReference(enum_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.ENUM_PROPERTY:
      {
        EnumProperty enumProperty = (EnumProperty)theEObject;
        T result = caseEnumProperty(enumProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.ENUM_ORDINAL:
      {
        EnumOrdinal enumOrdinal = (EnumOrdinal)theEObject;
        T result = caseEnumOrdinal(enumOrdinal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.ENUM_PROPERTY_ID:
      {
        EnumPropertyId enumPropertyId = (EnumPropertyId)theEObject;
        T result = caseEnumPropertyId(enumPropertyId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.CONST:
      {
        Const const_ = (Const)theEObject;
        T result = caseConst(const_);
        if (result == null) result = caseBabelDefinition(const_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.CONST_PROPERTY:
      {
        ConstProperty constProperty = (ConstProperty)theEObject;
        T result = caseConstProperty(constProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.CONST_VALUE_TYPE:
      {
        ConstValueType constValueType = (ConstValueType)theEObject;
        T result = caseConstValueType(constValueType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.CONST_PROPERTY_ID:
      {
        ConstPropertyId constPropertyId = (ConstPropertyId)theEObject;
        T result = caseConstPropertyId(constPropertyId);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.STRUCT:
      {
        Struct struct = (Struct)theEObject;
        T result = caseStruct(struct);
        if (result == null) result = caseBabelDefinition(struct);
        if (result == null) result = caseElementTypeReference(struct);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.PROPERTY_VALUE:
      {
        PropertyValue propertyValue = (PropertyValue)theEObject;
        T result = casePropertyValue(propertyValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.SERVICE:
      {
        Service service = (Service)theEObject;
        T result = caseService(service);
        if (result == null) result = caseBabelDefinition(service);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.SERVICE_METHOD:
      {
        ServiceMethod serviceMethod = (ServiceMethod)theEObject;
        T result = caseServiceMethod(serviceMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.SERVICE_PROPERTY:
      {
        ServiceProperty serviceProperty = (ServiceProperty)theEObject;
        T result = caseServiceProperty(serviceProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE:
      {
        ServiceMethodReturnType serviceMethodReturnType = (ServiceMethodReturnType)theEObject;
        T result = caseServiceMethodReturnType(serviceMethodReturnType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.DATA_TYPE_REFERENCE:
      {
        DataTypeReference dataTypeReference = (DataTypeReference)theEObject;
        T result = caseDataTypeReference(dataTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.ELEMENT_TYPE_REFERENCE:
      {
        ElementTypeReference elementTypeReference = (ElementTypeReference)theEObject;
        T result = caseElementTypeReference(elementTypeReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.LIST_TYPE:
      {
        ListType listType = (ListType)theEObject;
        T result = caseListType(listType);
        if (result == null) result = caseDataTypeReference(listType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.MAP_TYPE:
      {
        MapType mapType = (MapType)theEObject;
        T result = caseMapType(mapType);
        if (result == null) result = caseDataTypeReference(mapType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case BabelIdlPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Babel Idl</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Babel Idl</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBabelIdl(BabelIdl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Babel Definition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Babel Definition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBabelDefinition(BabelDefinition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamespace(Namespace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Default Name Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Default Name Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefaultNameSpace(DefaultNameSpace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImportStatement(ImportStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnum(com.concur.babel.babelIdl.Enum object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumProperty(EnumProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Ordinal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Ordinal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumOrdinal(EnumOrdinal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Property Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Property Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumPropertyId(EnumPropertyId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConst(Const object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstProperty(ConstProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const Value Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const Value Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstValueType(ConstValueType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Const Property Id</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Const Property Id</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstPropertyId(ConstPropertyId object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Struct</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Struct</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStruct(Struct object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyValue(PropertyValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseService(Service object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceMethod(ServiceMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceProperty(ServiceProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Service Method Return Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Service Method Return Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseServiceMethodReturnType(ServiceMethodReturnType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeReference(DataTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element Type Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Type Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementTypeReference(ElementTypeReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListType(ListType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMapType(MapType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //BabelIdlSwitch

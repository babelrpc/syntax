/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.DataTypeReference;
import com.concur.babel.babelIdl.ElementTypeReference;
import com.concur.babel.babelIdl.ServiceMethodReturnType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Method Return Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodReturnTypeImpl#getVoidType <em>Void Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodReturnTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodReturnTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceMethodReturnTypeImpl extends MinimalEObjectImpl.Container implements ServiceMethodReturnType
{
  /**
   * The default value of the '{@link #getVoidType() <em>Void Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVoidType()
   * @generated
   * @ordered
   */
  protected static final String VOID_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVoidType() <em>Void Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVoidType()
   * @generated
   * @ordered
   */
  protected String voidType = VOID_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataType()
   * @generated
   * @ordered
   */
  protected DataTypeReference dataType;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected ElementTypeReference elementType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceMethodReturnTypeImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return BabelIdlPackage.Literals.SERVICE_METHOD_RETURN_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVoidType()
  {
    return voidType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVoidType(String newVoidType)
  {
    String oldVoidType = voidType;
    voidType = newVoidType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__VOID_TYPE, oldVoidType, voidType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeReference getDataType()
  {
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDataType(DataTypeReference newDataType, NotificationChain msgs)
  {
    DataTypeReference oldDataType = dataType;
    dataType = newDataType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE, oldDataType, newDataType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataType(DataTypeReference newDataType)
  {
    if (newDataType != dataType)
    {
      NotificationChain msgs = null;
      if (dataType != null)
        msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE, null, msgs);
      if (newDataType != null)
        msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE, null, msgs);
      msgs = basicSetDataType(newDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE, newDataType, newDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeReference getElementType()
  {
    if (elementType != null && elementType.eIsProxy())
    {
      InternalEObject oldElementType = (InternalEObject)elementType;
      elementType = (ElementTypeReference)eResolveProxy(oldElementType);
      if (elementType != oldElementType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE, oldElementType, elementType));
      }
    }
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeReference basicGetElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(ElementTypeReference newElementType)
  {
    ElementTypeReference oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE, oldElementType, elementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE:
        return basicSetDataType(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__VOID_TYPE:
        return getVoidType();
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE:
        return getDataType();
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE:
        if (resolve) return getElementType();
        return basicGetElementType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__VOID_TYPE:
        setVoidType((String)newValue);
        return;
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE:
        setDataType((DataTypeReference)newValue);
        return;
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE:
        setElementType((ElementTypeReference)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__VOID_TYPE:
        setVoidType(VOID_TYPE_EDEFAULT);
        return;
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE:
        setDataType((DataTypeReference)null);
        return;
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE:
        setElementType((ElementTypeReference)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__VOID_TYPE:
        return VOID_TYPE_EDEFAULT == null ? voidType != null : !VOID_TYPE_EDEFAULT.equals(voidType);
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__DATA_TYPE:
        return dataType != null;
      case BabelIdlPackage.SERVICE_METHOD_RETURN_TYPE__ELEMENT_TYPE:
        return elementType != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (voidType: ");
    result.append(voidType);
    result.append(')');
    return result.toString();
  }

} //ServiceMethodReturnTypeImpl

/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.DataTypeReference;
import com.concur.babel.babelIdl.ElementTypeReference;
import com.concur.babel.babelIdl.ListType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.ListTypeImpl#getDateType <em>Date Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ListTypeImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListTypeImpl extends DataTypeReferenceImpl implements ListType
{
  /**
   * The cached value of the '{@link #getDateType() <em>Date Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateType()
   * @generated
   * @ordered
   */
  protected DataTypeReference dateType;

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
  protected ListTypeImpl()
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
    return BabelIdlPackage.Literals.LIST_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeReference getDateType()
  {
    return dateType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDateType(DataTypeReference newDateType, NotificationChain msgs)
  {
    DataTypeReference oldDateType = dateType;
    dateType = newDateType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.LIST_TYPE__DATE_TYPE, oldDateType, newDateType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateType(DataTypeReference newDateType)
  {
    if (newDateType != dateType)
    {
      NotificationChain msgs = null;
      if (dateType != null)
        msgs = ((InternalEObject)dateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.LIST_TYPE__DATE_TYPE, null, msgs);
      if (newDateType != null)
        msgs = ((InternalEObject)newDateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.LIST_TYPE__DATE_TYPE, null, msgs);
      msgs = basicSetDateType(newDateType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.LIST_TYPE__DATE_TYPE, newDateType, newDateType));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BabelIdlPackage.LIST_TYPE__ELEMENT_TYPE, oldElementType, elementType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.LIST_TYPE__ELEMENT_TYPE, oldElementType, elementType));
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
      case BabelIdlPackage.LIST_TYPE__DATE_TYPE:
        return basicSetDateType(null, msgs);
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
      case BabelIdlPackage.LIST_TYPE__DATE_TYPE:
        return getDateType();
      case BabelIdlPackage.LIST_TYPE__ELEMENT_TYPE:
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
      case BabelIdlPackage.LIST_TYPE__DATE_TYPE:
        setDateType((DataTypeReference)newValue);
        return;
      case BabelIdlPackage.LIST_TYPE__ELEMENT_TYPE:
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
      case BabelIdlPackage.LIST_TYPE__DATE_TYPE:
        setDateType((DataTypeReference)null);
        return;
      case BabelIdlPackage.LIST_TYPE__ELEMENT_TYPE:
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
      case BabelIdlPackage.LIST_TYPE__DATE_TYPE:
        return dateType != null;
      case BabelIdlPackage.LIST_TYPE__ELEMENT_TYPE:
        return elementType != null;
    }
    return super.eIsSet(featureID);
  }

} //ListTypeImpl

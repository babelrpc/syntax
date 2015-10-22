/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.DataTypeReference;
import com.concur.babel.babelIdl.ElementTypeReference;
import com.concur.babel.babelIdl.MapType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.MapTypeImpl#getKeyDataType <em>Key Data Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.MapTypeImpl#getKeyElementType <em>Key Element Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.MapTypeImpl#getValDataType <em>Val Data Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.MapTypeImpl#getValElementType <em>Val Element Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MapTypeImpl extends DataTypeReferenceImpl implements MapType
{
  /**
   * The cached value of the '{@link #getKeyDataType() <em>Key Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyDataType()
   * @generated
   * @ordered
   */
  protected DataTypeReference keyDataType;

  /**
   * The cached value of the '{@link #getKeyElementType() <em>Key Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKeyElementType()
   * @generated
   * @ordered
   */
  protected ElementTypeReference keyElementType;

  /**
   * The cached value of the '{@link #getValDataType() <em>Val Data Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValDataType()
   * @generated
   * @ordered
   */
  protected DataTypeReference valDataType;

  /**
   * The cached value of the '{@link #getValElementType() <em>Val Element Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValElementType()
   * @generated
   * @ordered
   */
  protected ElementTypeReference valElementType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MapTypeImpl()
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
    return BabelIdlPackage.Literals.MAP_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeReference getKeyDataType()
  {
    return keyDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKeyDataType(DataTypeReference newKeyDataType, NotificationChain msgs)
  {
    DataTypeReference oldKeyDataType = keyDataType;
    keyDataType = newKeyDataType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE, oldKeyDataType, newKeyDataType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyDataType(DataTypeReference newKeyDataType)
  {
    if (newKeyDataType != keyDataType)
    {
      NotificationChain msgs = null;
      if (keyDataType != null)
        msgs = ((InternalEObject)keyDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE, null, msgs);
      if (newKeyDataType != null)
        msgs = ((InternalEObject)newKeyDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE, null, msgs);
      msgs = basicSetKeyDataType(newKeyDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE, newKeyDataType, newKeyDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeReference getKeyElementType()
  {
    if (keyElementType != null && keyElementType.eIsProxy())
    {
      InternalEObject oldKeyElementType = (InternalEObject)keyElementType;
      keyElementType = (ElementTypeReference)eResolveProxy(oldKeyElementType);
      if (keyElementType != oldKeyElementType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BabelIdlPackage.MAP_TYPE__KEY_ELEMENT_TYPE, oldKeyElementType, keyElementType));
      }
    }
    return keyElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeReference basicGetKeyElementType()
  {
    return keyElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setKeyElementType(ElementTypeReference newKeyElementType)
  {
    ElementTypeReference oldKeyElementType = keyElementType;
    keyElementType = newKeyElementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.MAP_TYPE__KEY_ELEMENT_TYPE, oldKeyElementType, keyElementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataTypeReference getValDataType()
  {
    return valDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValDataType(DataTypeReference newValDataType, NotificationChain msgs)
  {
    DataTypeReference oldValDataType = valDataType;
    valDataType = newValDataType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE, oldValDataType, newValDataType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValDataType(DataTypeReference newValDataType)
  {
    if (newValDataType != valDataType)
    {
      NotificationChain msgs = null;
      if (valDataType != null)
        msgs = ((InternalEObject)valDataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE, null, msgs);
      if (newValDataType != null)
        msgs = ((InternalEObject)newValDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE, null, msgs);
      msgs = basicSetValDataType(newValDataType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE, newValDataType, newValDataType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeReference getValElementType()
  {
    if (valElementType != null && valElementType.eIsProxy())
    {
      InternalEObject oldValElementType = (InternalEObject)valElementType;
      valElementType = (ElementTypeReference)eResolveProxy(oldValElementType);
      if (valElementType != oldValElementType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BabelIdlPackage.MAP_TYPE__VAL_ELEMENT_TYPE, oldValElementType, valElementType));
      }
    }
    return valElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementTypeReference basicGetValElementType()
  {
    return valElementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValElementType(ElementTypeReference newValElementType)
  {
    ElementTypeReference oldValElementType = valElementType;
    valElementType = newValElementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.MAP_TYPE__VAL_ELEMENT_TYPE, oldValElementType, valElementType));
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
      case BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE:
        return basicSetKeyDataType(null, msgs);
      case BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE:
        return basicSetValDataType(null, msgs);
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
      case BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE:
        return getKeyDataType();
      case BabelIdlPackage.MAP_TYPE__KEY_ELEMENT_TYPE:
        if (resolve) return getKeyElementType();
        return basicGetKeyElementType();
      case BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE:
        return getValDataType();
      case BabelIdlPackage.MAP_TYPE__VAL_ELEMENT_TYPE:
        if (resolve) return getValElementType();
        return basicGetValElementType();
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
      case BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE:
        setKeyDataType((DataTypeReference)newValue);
        return;
      case BabelIdlPackage.MAP_TYPE__KEY_ELEMENT_TYPE:
        setKeyElementType((ElementTypeReference)newValue);
        return;
      case BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE:
        setValDataType((DataTypeReference)newValue);
        return;
      case BabelIdlPackage.MAP_TYPE__VAL_ELEMENT_TYPE:
        setValElementType((ElementTypeReference)newValue);
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
      case BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE:
        setKeyDataType((DataTypeReference)null);
        return;
      case BabelIdlPackage.MAP_TYPE__KEY_ELEMENT_TYPE:
        setKeyElementType((ElementTypeReference)null);
        return;
      case BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE:
        setValDataType((DataTypeReference)null);
        return;
      case BabelIdlPackage.MAP_TYPE__VAL_ELEMENT_TYPE:
        setValElementType((ElementTypeReference)null);
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
      case BabelIdlPackage.MAP_TYPE__KEY_DATA_TYPE:
        return keyDataType != null;
      case BabelIdlPackage.MAP_TYPE__KEY_ELEMENT_TYPE:
        return keyElementType != null;
      case BabelIdlPackage.MAP_TYPE__VAL_DATA_TYPE:
        return valDataType != null;
      case BabelIdlPackage.MAP_TYPE__VAL_ELEMENT_TYPE:
        return valElementType != null;
    }
    return super.eIsSet(featureID);
  }

} //MapTypeImpl

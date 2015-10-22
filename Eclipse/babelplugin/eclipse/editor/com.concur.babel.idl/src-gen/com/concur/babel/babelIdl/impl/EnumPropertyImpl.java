/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.EnumOrdinal;
import com.concur.babel.babelIdl.EnumProperty;
import com.concur.babel.babelIdl.EnumPropertyId;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.EnumPropertyImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.EnumPropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.EnumPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumPropertyImpl extends MinimalEObjectImpl.Container implements EnumProperty
{
  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected EList<String> comment;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected EnumPropertyId name;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EnumOrdinal type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnumPropertyImpl()
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
    return BabelIdlPackage.Literals.ENUM_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getComment()
  {
    if (comment == null)
    {
      comment = new EDataTypeEList<String>(String.class, this, BabelIdlPackage.ENUM_PROPERTY__COMMENT);
    }
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumPropertyId getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(EnumPropertyId newName, NotificationChain msgs)
  {
    EnumPropertyId oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.ENUM_PROPERTY__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(EnumPropertyId newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.ENUM_PROPERTY__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.ENUM_PROPERTY__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.ENUM_PROPERTY__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnumOrdinal getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(EnumOrdinal newType, NotificationChain msgs)
  {
    EnumOrdinal oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.ENUM_PROPERTY__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(EnumOrdinal newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.ENUM_PROPERTY__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.ENUM_PROPERTY__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.ENUM_PROPERTY__TYPE, newType, newType));
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
      case BabelIdlPackage.ENUM_PROPERTY__NAME:
        return basicSetName(null, msgs);
      case BabelIdlPackage.ENUM_PROPERTY__TYPE:
        return basicSetType(null, msgs);
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
      case BabelIdlPackage.ENUM_PROPERTY__COMMENT:
        return getComment();
      case BabelIdlPackage.ENUM_PROPERTY__NAME:
        return getName();
      case BabelIdlPackage.ENUM_PROPERTY__TYPE:
        return getType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BabelIdlPackage.ENUM_PROPERTY__COMMENT:
        getComment().clear();
        getComment().addAll((Collection<? extends String>)newValue);
        return;
      case BabelIdlPackage.ENUM_PROPERTY__NAME:
        setName((EnumPropertyId)newValue);
        return;
      case BabelIdlPackage.ENUM_PROPERTY__TYPE:
        setType((EnumOrdinal)newValue);
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
      case BabelIdlPackage.ENUM_PROPERTY__COMMENT:
        getComment().clear();
        return;
      case BabelIdlPackage.ENUM_PROPERTY__NAME:
        setName((EnumPropertyId)null);
        return;
      case BabelIdlPackage.ENUM_PROPERTY__TYPE:
        setType((EnumOrdinal)null);
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
      case BabelIdlPackage.ENUM_PROPERTY__COMMENT:
        return comment != null && !comment.isEmpty();
      case BabelIdlPackage.ENUM_PROPERTY__NAME:
        return name != null;
      case BabelIdlPackage.ENUM_PROPERTY__TYPE:
        return type != null;
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
    result.append(" (comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //EnumPropertyImpl

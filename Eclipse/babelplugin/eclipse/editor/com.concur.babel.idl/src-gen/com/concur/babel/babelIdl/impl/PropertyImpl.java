/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.Attribute;
import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.DataTypeReference;
import com.concur.babel.babelIdl.ElementTypeReference;
import com.concur.babel.babelIdl.Property;
import com.concur.babel.babelIdl.PropertyValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.PropertyImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.PropertyImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.PropertyImpl#getDateType <em>Date Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.PropertyImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.PropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MinimalEObjectImpl.Container implements Property
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
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected EList<Attribute> attributes;

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
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected PropertyValue name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyImpl()
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
    return BabelIdlPackage.Literals.PROPERTY;
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
      comment = new EDataTypeEList<String>(String.class, this, BabelIdlPackage.PROPERTY__COMMENT);
    }
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Attribute> getAttributes()
  {
    if (attributes == null)
    {
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, BabelIdlPackage.PROPERTY__ATTRIBUTES);
    }
    return attributes;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.PROPERTY__DATE_TYPE, oldDateType, newDateType);
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
        msgs = ((InternalEObject)dateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.PROPERTY__DATE_TYPE, null, msgs);
      if (newDateType != null)
        msgs = ((InternalEObject)newDateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.PROPERTY__DATE_TYPE, null, msgs);
      msgs = basicSetDateType(newDateType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.PROPERTY__DATE_TYPE, newDateType, newDateType));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, BabelIdlPackage.PROPERTY__ELEMENT_TYPE, oldElementType, elementType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.PROPERTY__ELEMENT_TYPE, oldElementType, elementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyValue getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(PropertyValue newName, NotificationChain msgs)
  {
    PropertyValue oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.PROPERTY__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(PropertyValue newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.PROPERTY__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.PROPERTY__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.PROPERTY__NAME, newName, newName));
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
      case BabelIdlPackage.PROPERTY__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case BabelIdlPackage.PROPERTY__DATE_TYPE:
        return basicSetDateType(null, msgs);
      case BabelIdlPackage.PROPERTY__NAME:
        return basicSetName(null, msgs);
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
      case BabelIdlPackage.PROPERTY__COMMENT:
        return getComment();
      case BabelIdlPackage.PROPERTY__ATTRIBUTES:
        return getAttributes();
      case BabelIdlPackage.PROPERTY__DATE_TYPE:
        return getDateType();
      case BabelIdlPackage.PROPERTY__ELEMENT_TYPE:
        if (resolve) return getElementType();
        return basicGetElementType();
      case BabelIdlPackage.PROPERTY__NAME:
        return getName();
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
      case BabelIdlPackage.PROPERTY__COMMENT:
        getComment().clear();
        getComment().addAll((Collection<? extends String>)newValue);
        return;
      case BabelIdlPackage.PROPERTY__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case BabelIdlPackage.PROPERTY__DATE_TYPE:
        setDateType((DataTypeReference)newValue);
        return;
      case BabelIdlPackage.PROPERTY__ELEMENT_TYPE:
        setElementType((ElementTypeReference)newValue);
        return;
      case BabelIdlPackage.PROPERTY__NAME:
        setName((PropertyValue)newValue);
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
      case BabelIdlPackage.PROPERTY__COMMENT:
        getComment().clear();
        return;
      case BabelIdlPackage.PROPERTY__ATTRIBUTES:
        getAttributes().clear();
        return;
      case BabelIdlPackage.PROPERTY__DATE_TYPE:
        setDateType((DataTypeReference)null);
        return;
      case BabelIdlPackage.PROPERTY__ELEMENT_TYPE:
        setElementType((ElementTypeReference)null);
        return;
      case BabelIdlPackage.PROPERTY__NAME:
        setName((PropertyValue)null);
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
      case BabelIdlPackage.PROPERTY__COMMENT:
        return comment != null && !comment.isEmpty();
      case BabelIdlPackage.PROPERTY__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case BabelIdlPackage.PROPERTY__DATE_TYPE:
        return dateType != null;
      case BabelIdlPackage.PROPERTY__ELEMENT_TYPE:
        return elementType != null;
      case BabelIdlPackage.PROPERTY__NAME:
        return name != null;
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

} //PropertyImpl

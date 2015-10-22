/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.Attribute;
import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.ServiceMethod;
import com.concur.babel.babelIdl.ServiceMethodReturnType;
import com.concur.babel.babelIdl.ServiceProperty;

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
 * An implementation of the model object '<em><b>Service Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodImpl#getReturn <em>Return</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceMethodImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceMethodImpl extends MinimalEObjectImpl.Container implements ServiceMethod
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
   * The cached value of the '{@link #getReturn() <em>Return</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturn()
   * @generated
   * @ordered
   */
  protected ServiceMethodReturnType return_;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<ServiceProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceMethodImpl()
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
    return BabelIdlPackage.Literals.SERVICE_METHOD;
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
      comment = new EDataTypeEList<String>(String.class, this, BabelIdlPackage.SERVICE_METHOD__COMMENT);
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
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, BabelIdlPackage.SERVICE_METHOD__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ServiceMethodReturnType getReturn()
  {
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturn(ServiceMethodReturnType newReturn, NotificationChain msgs)
  {
    ServiceMethodReturnType oldReturn = return_;
    return_ = newReturn;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.SERVICE_METHOD__RETURN, oldReturn, newReturn);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturn(ServiceMethodReturnType newReturn)
  {
    if (newReturn != return_)
    {
      NotificationChain msgs = null;
      if (return_ != null)
        msgs = ((InternalEObject)return_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.SERVICE_METHOD__RETURN, null, msgs);
      if (newReturn != null)
        msgs = ((InternalEObject)newReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.SERVICE_METHOD__RETURN, null, msgs);
      msgs = basicSetReturn(newReturn, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.SERVICE_METHOD__RETURN, newReturn, newReturn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.SERVICE_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceProperty> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<ServiceProperty>(ServiceProperty.class, this, BabelIdlPackage.SERVICE_METHOD__PROPERTIES);
    }
    return properties;
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
      case BabelIdlPackage.SERVICE_METHOD__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case BabelIdlPackage.SERVICE_METHOD__RETURN:
        return basicSetReturn(null, msgs);
      case BabelIdlPackage.SERVICE_METHOD__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case BabelIdlPackage.SERVICE_METHOD__COMMENT:
        return getComment();
      case BabelIdlPackage.SERVICE_METHOD__ATTRIBUTES:
        return getAttributes();
      case BabelIdlPackage.SERVICE_METHOD__RETURN:
        return getReturn();
      case BabelIdlPackage.SERVICE_METHOD__NAME:
        return getName();
      case BabelIdlPackage.SERVICE_METHOD__PROPERTIES:
        return getProperties();
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
      case BabelIdlPackage.SERVICE_METHOD__COMMENT:
        getComment().clear();
        getComment().addAll((Collection<? extends String>)newValue);
        return;
      case BabelIdlPackage.SERVICE_METHOD__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case BabelIdlPackage.SERVICE_METHOD__RETURN:
        setReturn((ServiceMethodReturnType)newValue);
        return;
      case BabelIdlPackage.SERVICE_METHOD__NAME:
        setName((String)newValue);
        return;
      case BabelIdlPackage.SERVICE_METHOD__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends ServiceProperty>)newValue);
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
      case BabelIdlPackage.SERVICE_METHOD__COMMENT:
        getComment().clear();
        return;
      case BabelIdlPackage.SERVICE_METHOD__ATTRIBUTES:
        getAttributes().clear();
        return;
      case BabelIdlPackage.SERVICE_METHOD__RETURN:
        setReturn((ServiceMethodReturnType)null);
        return;
      case BabelIdlPackage.SERVICE_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BabelIdlPackage.SERVICE_METHOD__PROPERTIES:
        getProperties().clear();
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
      case BabelIdlPackage.SERVICE_METHOD__COMMENT:
        return comment != null && !comment.isEmpty();
      case BabelIdlPackage.SERVICE_METHOD__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case BabelIdlPackage.SERVICE_METHOD__RETURN:
        return return_ != null;
      case BabelIdlPackage.SERVICE_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BabelIdlPackage.SERVICE_METHOD__PROPERTIES:
        return properties != null && !properties.isEmpty();
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
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //ServiceMethodImpl

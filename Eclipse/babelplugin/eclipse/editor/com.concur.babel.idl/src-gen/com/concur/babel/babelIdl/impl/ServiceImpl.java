/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.Attribute;
import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.Service;
import com.concur.babel.babelIdl.ServiceMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ServiceImpl#getServiceMethods <em>Service Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends BabelDefinitionImpl implements Service
{
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
   * The cached value of the '{@link #getServiceMethods() <em>Service Methods</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getServiceMethods()
   * @generated
   * @ordered
   */
  protected EList<ServiceMethod> serviceMethods;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ServiceImpl()
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
    return BabelIdlPackage.Literals.SERVICE;
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
      attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, BabelIdlPackage.SERVICE__ATTRIBUTES);
    }
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ServiceMethod> getServiceMethods()
  {
    if (serviceMethods == null)
    {
      serviceMethods = new EObjectContainmentEList<ServiceMethod>(ServiceMethod.class, this, BabelIdlPackage.SERVICE__SERVICE_METHODS);
    }
    return serviceMethods;
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
      case BabelIdlPackage.SERVICE__ATTRIBUTES:
        return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
      case BabelIdlPackage.SERVICE__SERVICE_METHODS:
        return ((InternalEList<?>)getServiceMethods()).basicRemove(otherEnd, msgs);
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
      case BabelIdlPackage.SERVICE__ATTRIBUTES:
        return getAttributes();
      case BabelIdlPackage.SERVICE__SERVICE_METHODS:
        return getServiceMethods();
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
      case BabelIdlPackage.SERVICE__ATTRIBUTES:
        getAttributes().clear();
        getAttributes().addAll((Collection<? extends Attribute>)newValue);
        return;
      case BabelIdlPackage.SERVICE__SERVICE_METHODS:
        getServiceMethods().clear();
        getServiceMethods().addAll((Collection<? extends ServiceMethod>)newValue);
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
      case BabelIdlPackage.SERVICE__ATTRIBUTES:
        getAttributes().clear();
        return;
      case BabelIdlPackage.SERVICE__SERVICE_METHODS:
        getServiceMethods().clear();
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
      case BabelIdlPackage.SERVICE__ATTRIBUTES:
        return attributes != null && !attributes.isEmpty();
      case BabelIdlPackage.SERVICE__SERVICE_METHODS:
        return serviceMethods != null && !serviceMethods.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ServiceImpl

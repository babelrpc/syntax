/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.DefaultNameSpace;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Name Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.DefaultNameSpaceImpl#getDef <em>Def</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.DefaultNameSpaceImpl#getNs <em>Ns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DefaultNameSpaceImpl extends MinimalEObjectImpl.Container implements DefaultNameSpace
{
  /**
   * The default value of the '{@link #getDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected static final String DEF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDef() <em>Def</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDef()
   * @generated
   * @ordered
   */
  protected String def = DEF_EDEFAULT;

  /**
   * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNs()
   * @generated
   * @ordered
   */
  protected static final String NS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNs()
   * @generated
   * @ordered
   */
  protected String ns = NS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefaultNameSpaceImpl()
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
    return BabelIdlPackage.Literals.DEFAULT_NAME_SPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDef()
  {
    return def;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDef(String newDef)
  {
    String oldDef = def;
    def = newDef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.DEFAULT_NAME_SPACE__DEF, oldDef, def));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNs()
  {
    return ns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNs(String newNs)
  {
    String oldNs = ns;
    ns = newNs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.DEFAULT_NAME_SPACE__NS, oldNs, ns));
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
      case BabelIdlPackage.DEFAULT_NAME_SPACE__DEF:
        return getDef();
      case BabelIdlPackage.DEFAULT_NAME_SPACE__NS:
        return getNs();
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
      case BabelIdlPackage.DEFAULT_NAME_SPACE__DEF:
        setDef((String)newValue);
        return;
      case BabelIdlPackage.DEFAULT_NAME_SPACE__NS:
        setNs((String)newValue);
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
      case BabelIdlPackage.DEFAULT_NAME_SPACE__DEF:
        setDef(DEF_EDEFAULT);
        return;
      case BabelIdlPackage.DEFAULT_NAME_SPACE__NS:
        setNs(NS_EDEFAULT);
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
      case BabelIdlPackage.DEFAULT_NAME_SPACE__DEF:
        return DEF_EDEFAULT == null ? def != null : !DEF_EDEFAULT.equals(def);
      case BabelIdlPackage.DEFAULT_NAME_SPACE__NS:
        return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
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
    result.append(" (def: ");
    result.append(def);
    result.append(", ns: ");
    result.append(ns);
    result.append(')');
    return result.toString();
  }

} //DefaultNameSpaceImpl

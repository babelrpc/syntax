/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.Namespace;
import com.concur.babel.babelIdl.SupportedLangs;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.NamespaceImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.NamespaceImpl#getNs <em>Ns</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamespaceImpl extends MinimalEObjectImpl.Container implements Namespace
{
  /**
   * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected static final SupportedLangs LANG_EDEFAULT = SupportedLangs.JAVA;

  /**
   * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLang()
   * @generated
   * @ordered
   */
  protected SupportedLangs lang = LANG_EDEFAULT;

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
  protected NamespaceImpl()
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
    return BabelIdlPackage.Literals.NAMESPACE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SupportedLangs getLang()
  {
    return lang;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLang(SupportedLangs newLang)
  {
    SupportedLangs oldLang = lang;
    lang = newLang == null ? LANG_EDEFAULT : newLang;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.NAMESPACE__LANG, oldLang, lang));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.NAMESPACE__NS, oldNs, ns));
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
      case BabelIdlPackage.NAMESPACE__LANG:
        return getLang();
      case BabelIdlPackage.NAMESPACE__NS:
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
      case BabelIdlPackage.NAMESPACE__LANG:
        setLang((SupportedLangs)newValue);
        return;
      case BabelIdlPackage.NAMESPACE__NS:
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
      case BabelIdlPackage.NAMESPACE__LANG:
        setLang(LANG_EDEFAULT);
        return;
      case BabelIdlPackage.NAMESPACE__NS:
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
      case BabelIdlPackage.NAMESPACE__LANG:
        return lang != LANG_EDEFAULT;
      case BabelIdlPackage.NAMESPACE__NS:
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
    result.append(" (lang: ");
    result.append(lang);
    result.append(", ns: ");
    result.append(ns);
    result.append(')');
    return result.toString();
  }

} //NamespaceImpl

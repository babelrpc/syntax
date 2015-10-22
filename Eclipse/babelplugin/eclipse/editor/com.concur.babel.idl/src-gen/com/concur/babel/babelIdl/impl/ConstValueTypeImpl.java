/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.ConstValueType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Const Value Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.ConstValueTypeImpl#getStringVal <em>String Val</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ConstValueTypeImpl#getBoolVal <em>Bool Val</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.ConstValueTypeImpl#getNumVal <em>Num Val</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstValueTypeImpl extends MinimalEObjectImpl.Container implements ConstValueType
{
  /**
   * The default value of the '{@link #getStringVal() <em>String Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringVal()
   * @generated
   * @ordered
   */
  protected static final String STRING_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringVal() <em>String Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringVal()
   * @generated
   * @ordered
   */
  protected String stringVal = STRING_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolVal() <em>Bool Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolVal()
   * @generated
   * @ordered
   */
  protected static final String BOOL_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolVal() <em>Bool Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolVal()
   * @generated
   * @ordered
   */
  protected String boolVal = BOOL_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getNumVal() <em>Num Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumVal()
   * @generated
   * @ordered
   */
  protected static final String NUM_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNumVal() <em>Num Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumVal()
   * @generated
   * @ordered
   */
  protected String numVal = NUM_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstValueTypeImpl()
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
    return BabelIdlPackage.Literals.CONST_VALUE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringVal()
  {
    return stringVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringVal(String newStringVal)
  {
    String oldStringVal = stringVal;
    stringVal = newStringVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.CONST_VALUE_TYPE__STRING_VAL, oldStringVal, stringVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBoolVal()
  {
    return boolVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBoolVal(String newBoolVal)
  {
    String oldBoolVal = boolVal;
    boolVal = newBoolVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.CONST_VALUE_TYPE__BOOL_VAL, oldBoolVal, boolVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNumVal()
  {
    return numVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumVal(String newNumVal)
  {
    String oldNumVal = numVal;
    numVal = newNumVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.CONST_VALUE_TYPE__NUM_VAL, oldNumVal, numVal));
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
      case BabelIdlPackage.CONST_VALUE_TYPE__STRING_VAL:
        return getStringVal();
      case BabelIdlPackage.CONST_VALUE_TYPE__BOOL_VAL:
        return getBoolVal();
      case BabelIdlPackage.CONST_VALUE_TYPE__NUM_VAL:
        return getNumVal();
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
      case BabelIdlPackage.CONST_VALUE_TYPE__STRING_VAL:
        setStringVal((String)newValue);
        return;
      case BabelIdlPackage.CONST_VALUE_TYPE__BOOL_VAL:
        setBoolVal((String)newValue);
        return;
      case BabelIdlPackage.CONST_VALUE_TYPE__NUM_VAL:
        setNumVal((String)newValue);
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
      case BabelIdlPackage.CONST_VALUE_TYPE__STRING_VAL:
        setStringVal(STRING_VAL_EDEFAULT);
        return;
      case BabelIdlPackage.CONST_VALUE_TYPE__BOOL_VAL:
        setBoolVal(BOOL_VAL_EDEFAULT);
        return;
      case BabelIdlPackage.CONST_VALUE_TYPE__NUM_VAL:
        setNumVal(NUM_VAL_EDEFAULT);
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
      case BabelIdlPackage.CONST_VALUE_TYPE__STRING_VAL:
        return STRING_VAL_EDEFAULT == null ? stringVal != null : !STRING_VAL_EDEFAULT.equals(stringVal);
      case BabelIdlPackage.CONST_VALUE_TYPE__BOOL_VAL:
        return BOOL_VAL_EDEFAULT == null ? boolVal != null : !BOOL_VAL_EDEFAULT.equals(boolVal);
      case BabelIdlPackage.CONST_VALUE_TYPE__NUM_VAL:
        return NUM_VAL_EDEFAULT == null ? numVal != null : !NUM_VAL_EDEFAULT.equals(numVal);
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
    result.append(" (stringVal: ");
    result.append(stringVal);
    result.append(", boolVal: ");
    result.append(boolVal);
    result.append(", numVal: ");
    result.append(numVal);
    result.append(')');
    return result.toString();
  }

} //ConstValueTypeImpl

/**
 */
package com.concur.babel.babelIdl.impl;

import com.concur.babel.babelIdl.BabelDefinition;
import com.concur.babel.babelIdl.BabelIdl;
import com.concur.babel.babelIdl.BabelIdlPackage;
import com.concur.babel.babelIdl.DefaultNameSpace;
import com.concur.babel.babelIdl.ImportStatement;
import com.concur.babel.babelIdl.Namespace;

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
 * An implementation of the model object '<em><b>Babel Idl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.concur.babel.babelIdl.impl.BabelIdlImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.BabelIdlImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.BabelIdlImpl#getDefaultNamespace <em>Default Namespace</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.BabelIdlImpl#getNamespaces <em>Namespaces</em>}</li>
 *   <li>{@link com.concur.babel.babelIdl.impl.BabelIdlImpl#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BabelIdlImpl extends MinimalEObjectImpl.Container implements BabelIdl
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
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<ImportStatement> imports;

  /**
   * The cached value of the '{@link #getDefaultNamespace() <em>Default Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultNamespace()
   * @generated
   * @ordered
   */
  protected DefaultNameSpace defaultNamespace;

  /**
   * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespaces()
   * @generated
   * @ordered
   */
  protected EList<Namespace> namespaces;

  /**
   * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitions()
   * @generated
   * @ordered
   */
  protected EList<BabelDefinition> definitions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BabelIdlImpl()
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
    return BabelIdlPackage.Literals.BABEL_IDL;
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
      comment = new EDataTypeEList<String>(String.class, this, BabelIdlPackage.BABEL_IDL__COMMENT);
    }
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ImportStatement> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<ImportStatement>(ImportStatement.class, this, BabelIdlPackage.BABEL_IDL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DefaultNameSpace getDefaultNamespace()
  {
    return defaultNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultNamespace(DefaultNameSpace newDefaultNamespace, NotificationChain msgs)
  {
    DefaultNameSpace oldDefaultNamespace = defaultNamespace;
    defaultNamespace = newDefaultNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE, oldDefaultNamespace, newDefaultNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultNamespace(DefaultNameSpace newDefaultNamespace)
  {
    if (newDefaultNamespace != defaultNamespace)
    {
      NotificationChain msgs = null;
      if (defaultNamespace != null)
        msgs = ((InternalEObject)defaultNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE, null, msgs);
      if (newDefaultNamespace != null)
        msgs = ((InternalEObject)newDefaultNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE, null, msgs);
      msgs = basicSetDefaultNamespace(newDefaultNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE, newDefaultNamespace, newDefaultNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Namespace> getNamespaces()
  {
    if (namespaces == null)
    {
      namespaces = new EObjectContainmentEList<Namespace>(Namespace.class, this, BabelIdlPackage.BABEL_IDL__NAMESPACES);
    }
    return namespaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<BabelDefinition> getDefinitions()
  {
    if (definitions == null)
    {
      definitions = new EObjectContainmentEList<BabelDefinition>(BabelDefinition.class, this, BabelIdlPackage.BABEL_IDL__DEFINITIONS);
    }
    return definitions;
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
      case BabelIdlPackage.BABEL_IDL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE:
        return basicSetDefaultNamespace(null, msgs);
      case BabelIdlPackage.BABEL_IDL__NAMESPACES:
        return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
      case BabelIdlPackage.BABEL_IDL__DEFINITIONS:
        return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
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
      case BabelIdlPackage.BABEL_IDL__COMMENT:
        return getComment();
      case BabelIdlPackage.BABEL_IDL__IMPORTS:
        return getImports();
      case BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE:
        return getDefaultNamespace();
      case BabelIdlPackage.BABEL_IDL__NAMESPACES:
        return getNamespaces();
      case BabelIdlPackage.BABEL_IDL__DEFINITIONS:
        return getDefinitions();
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
      case BabelIdlPackage.BABEL_IDL__COMMENT:
        getComment().clear();
        getComment().addAll((Collection<? extends String>)newValue);
        return;
      case BabelIdlPackage.BABEL_IDL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends ImportStatement>)newValue);
        return;
      case BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE:
        setDefaultNamespace((DefaultNameSpace)newValue);
        return;
      case BabelIdlPackage.BABEL_IDL__NAMESPACES:
        getNamespaces().clear();
        getNamespaces().addAll((Collection<? extends Namespace>)newValue);
        return;
      case BabelIdlPackage.BABEL_IDL__DEFINITIONS:
        getDefinitions().clear();
        getDefinitions().addAll((Collection<? extends BabelDefinition>)newValue);
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
      case BabelIdlPackage.BABEL_IDL__COMMENT:
        getComment().clear();
        return;
      case BabelIdlPackage.BABEL_IDL__IMPORTS:
        getImports().clear();
        return;
      case BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE:
        setDefaultNamespace((DefaultNameSpace)null);
        return;
      case BabelIdlPackage.BABEL_IDL__NAMESPACES:
        getNamespaces().clear();
        return;
      case BabelIdlPackage.BABEL_IDL__DEFINITIONS:
        getDefinitions().clear();
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
      case BabelIdlPackage.BABEL_IDL__COMMENT:
        return comment != null && !comment.isEmpty();
      case BabelIdlPackage.BABEL_IDL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case BabelIdlPackage.BABEL_IDL__DEFAULT_NAMESPACE:
        return defaultNamespace != null;
      case BabelIdlPackage.BABEL_IDL__NAMESPACES:
        return namespaces != null && !namespaces.isEmpty();
      case BabelIdlPackage.BABEL_IDL__DEFINITIONS:
        return definitions != null && !definitions.isEmpty();
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

} //BabelIdlImpl

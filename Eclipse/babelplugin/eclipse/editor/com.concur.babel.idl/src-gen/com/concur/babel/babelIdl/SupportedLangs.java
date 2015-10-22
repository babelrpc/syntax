/**
 */
package com.concur.babel.babelIdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Supported Langs</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getSupportedLangs()
 * @model
 * @generated
 */
public enum SupportedLangs implements Enumerator
{
  /**
   * The '<em><b>JAVA</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JAVA_VALUE
   * @generated
   * @ordered
   */
  JAVA(0, "JAVA", "java"),

  /**
   * The '<em><b>CSHARP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CSHARP_VALUE
   * @generated
   * @ordered
   */
  CSHARP(1, "CSHARP", "csharp"),

  /**
   * The '<em><b>ASP</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ASP_VALUE
   * @generated
   * @ordered
   */
  ASP(2, "ASP", "asp");

  /**
   * The '<em><b>JAVA</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>JAVA</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #JAVA
   * @model literal="java"
   * @generated
   * @ordered
   */
  public static final int JAVA_VALUE = 0;

  /**
   * The '<em><b>CSHARP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CSHARP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CSHARP
   * @model literal="csharp"
   * @generated
   * @ordered
   */
  public static final int CSHARP_VALUE = 1;

  /**
   * The '<em><b>ASP</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>ASP</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #ASP
   * @model literal="asp"
   * @generated
   * @ordered
   */
  public static final int ASP_VALUE = 2;

  /**
   * An array of all the '<em><b>Supported Langs</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final SupportedLangs[] VALUES_ARRAY =
    new SupportedLangs[]
    {
      JAVA,
      CSHARP,
      ASP,
    };

  /**
   * A public read-only list of all the '<em><b>Supported Langs</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<SupportedLangs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Supported Langs</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SupportedLangs get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SupportedLangs result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Supported Langs</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SupportedLangs getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      SupportedLangs result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Supported Langs</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static SupportedLangs get(int value)
  {
    switch (value)
    {
      case JAVA_VALUE: return JAVA;
      case CSHARP_VALUE: return CSHARP;
      case ASP_VALUE: return ASP;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private SupportedLangs(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //SupportedLangs

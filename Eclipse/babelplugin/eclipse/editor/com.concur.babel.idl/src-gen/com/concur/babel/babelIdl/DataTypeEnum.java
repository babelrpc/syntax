/**
 */
package com.concur.babel.babelIdl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.concur.babel.babelIdl.BabelIdlPackage#getDataTypeEnum()
 * @model
 * @generated
 */
public enum DataTypeEnum implements Enumerator
{
  /**
   * The '<em><b>BOOL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BOOL_VALUE
   * @generated
   * @ordered
   */
  BOOL(0, "BOOL", "bool"),

  /**
   * The '<em><b>BYTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BYTE_VALUE
   * @generated
   * @ordered
   */
  BYTE(1, "BYTE", "byte"),

  /**
   * The '<em><b>UNIT16</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIT16_VALUE
   * @generated
   * @ordered
   */
  UNIT16(2, "UNIT16", "uint16"),

  /**
   * The '<em><b>UINT32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UINT32_VALUE
   * @generated
   * @ordered
   */
  UINT32(3, "UINT32", "uint32"),

  /**
   * The '<em><b>UNIT64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UNIT64_VALUE
   * @generated
   * @ordered
   */
  UNIT64(4, "UNIT64", "uint64"),

  /**
   * The '<em><b>SBYTE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SBYTE_VALUE
   * @generated
   * @ordered
   */
  SBYTE(5, "SBYTE", "sbyte"),

  /**
   * The '<em><b>INT16</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT16_VALUE
   * @generated
   * @ordered
   */
  INT16(6, "INT16", "int16"),

  /**
   * The '<em><b>INT32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT32_VALUE
   * @generated
   * @ordered
   */
  INT32(7, "INT32", "int32"),

  /**
   * The '<em><b>INT64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INT64_VALUE
   * @generated
   * @ordered
   */
  INT64(8, "INT64", "int64"),

  /**
   * The '<em><b>FLOAT32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT32_VALUE
   * @generated
   * @ordered
   */
  FLOAT32(9, "FLOAT32", "float32"),

  /**
   * The '<em><b>FLOAT64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FLOAT64_VALUE
   * @generated
   * @ordered
   */
  FLOAT64(10, "FLOAT64", "float64"),

  /**
   * The '<em><b>STRING</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STRING_VALUE
   * @generated
   * @ordered
   */
  STRING(11, "STRING", "string"),

  /**
   * The '<em><b>DATETIME</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DATETIME_VALUE
   * @generated
   * @ordered
   */
  DATETIME(12, "DATETIME", "datetime"),

  /**
   * The '<em><b>DECIMAL</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DECIMAL_VALUE
   * @generated
   * @ordered
   */
  DECIMAL(13, "DECIMAL", "decimal"),

  /**
   * The '<em><b>CHAR</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #CHAR_VALUE
   * @generated
   * @ordered
   */
  CHAR(14, "CHAR", "char"),

  /**
   * The '<em><b>BINARY</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BINARY_VALUE
   * @generated
   * @ordered
   */
  BINARY(15, "BINARY", "binary");

  /**
   * The '<em><b>BOOL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BOOL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BOOL
   * @model literal="bool"
   * @generated
   * @ordered
   */
  public static final int BOOL_VALUE = 0;

  /**
   * The '<em><b>BYTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BYTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BYTE
   * @model literal="byte"
   * @generated
   * @ordered
   */
  public static final int BYTE_VALUE = 1;

  /**
   * The '<em><b>UNIT16</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNIT16</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNIT16
   * @model literal="uint16"
   * @generated
   * @ordered
   */
  public static final int UNIT16_VALUE = 2;

  /**
   * The '<em><b>UINT32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UINT32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UINT32
   * @model literal="uint32"
   * @generated
   * @ordered
   */
  public static final int UINT32_VALUE = 3;

  /**
   * The '<em><b>UNIT64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>UNIT64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #UNIT64
   * @model literal="uint64"
   * @generated
   * @ordered
   */
  public static final int UNIT64_VALUE = 4;

  /**
   * The '<em><b>SBYTE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SBYTE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SBYTE
   * @model literal="sbyte"
   * @generated
   * @ordered
   */
  public static final int SBYTE_VALUE = 5;

  /**
   * The '<em><b>INT16</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INT16</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT16
   * @model literal="int16"
   * @generated
   * @ordered
   */
  public static final int INT16_VALUE = 6;

  /**
   * The '<em><b>INT32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INT32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT32
   * @model literal="int32"
   * @generated
   * @ordered
   */
  public static final int INT32_VALUE = 7;

  /**
   * The '<em><b>INT64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>INT64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #INT64
   * @model literal="int64"
   * @generated
   * @ordered
   */
  public static final int INT64_VALUE = 8;

  /**
   * The '<em><b>FLOAT32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FLOAT32</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT32
   * @model literal="float32"
   * @generated
   * @ordered
   */
  public static final int FLOAT32_VALUE = 9;

  /**
   * The '<em><b>FLOAT64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>FLOAT64</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #FLOAT64
   * @model literal="float64"
   * @generated
   * @ordered
   */
  public static final int FLOAT64_VALUE = 10;

  /**
   * The '<em><b>STRING</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>STRING</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STRING
   * @model literal="string"
   * @generated
   * @ordered
   */
  public static final int STRING_VALUE = 11;

  /**
   * The '<em><b>DATETIME</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DATETIME</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DATETIME
   * @model literal="datetime"
   * @generated
   * @ordered
   */
  public static final int DATETIME_VALUE = 12;

  /**
   * The '<em><b>DECIMAL</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>DECIMAL</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #DECIMAL
   * @model literal="decimal"
   * @generated
   * @ordered
   */
  public static final int DECIMAL_VALUE = 13;

  /**
   * The '<em><b>CHAR</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>CHAR</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #CHAR
   * @model literal="char"
   * @generated
   * @ordered
   */
  public static final int CHAR_VALUE = 14;

  /**
   * The '<em><b>BINARY</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>BINARY</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #BINARY
   * @model literal="binary"
   * @generated
   * @ordered
   */
  public static final int BINARY_VALUE = 15;

  /**
   * An array of all the '<em><b>Data Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final DataTypeEnum[] VALUES_ARRAY =
    new DataTypeEnum[]
    {
      BOOL,
      BYTE,
      UNIT16,
      UINT32,
      UNIT64,
      SBYTE,
      INT16,
      INT32,
      INT64,
      FLOAT32,
      FLOAT64,
      STRING,
      DATETIME,
      DECIMAL,
      CHAR,
      BINARY,
    };

  /**
   * A public read-only list of all the '<em><b>Data Type Enum</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<DataTypeEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Data Type Enum</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataTypeEnum get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataTypeEnum result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type Enum</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataTypeEnum getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      DataTypeEnum result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Data Type Enum</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DataTypeEnum get(int value)
  {
    switch (value)
    {
      case BOOL_VALUE: return BOOL;
      case BYTE_VALUE: return BYTE;
      case UNIT16_VALUE: return UNIT16;
      case UINT32_VALUE: return UINT32;
      case UNIT64_VALUE: return UNIT64;
      case SBYTE_VALUE: return SBYTE;
      case INT16_VALUE: return INT16;
      case INT32_VALUE: return INT32;
      case INT64_VALUE: return INT64;
      case FLOAT32_VALUE: return FLOAT32;
      case FLOAT64_VALUE: return FLOAT64;
      case STRING_VALUE: return STRING;
      case DATETIME_VALUE: return DATETIME;
      case DECIMAL_VALUE: return DECIMAL;
      case CHAR_VALUE: return CHAR;
      case BINARY_VALUE: return BINARY;
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
  private DataTypeEnum(int value, String name, String literal)
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
  
} //DataTypeEnum

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Result codes returned by Cell.Error.
 * </p>
 */
public enum tagVisCellError implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visErrorSuccess(0),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  visErrorDivideByZero(39),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  visErrorValue(47),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  visErrorReference(55),
  /**
   * <p>
   * The value of this constant is 61
   * </p>
   */
  visErrorName(61),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  visErrorNumber(68),
  /**
   * <p>
   * The value of this constant is 74
   * </p>
   */
  visErrorNotAvailable(74),
  ;

  private  int value;
  tagVisCellError(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed in parameters to MouseDown, MouseMove and MouseUp events.
 * </p>
 */
public enum VisKeyButtonFlags implements ComEnum {
  /**
   * <p>
   * .
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visMouseLeft(1),
  /**
   * <p>
   * .
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visMouseMiddle(16),
  /**
   * <p>
   * .
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visMouseRight(2),
  /**
   * <p>
   * .
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visKeyShift(4),
  /**
   * <p>
   * .
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visKeyControl(8),
  ;

  private  int value;
  VisKeyButtonFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

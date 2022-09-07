package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Result codes returned by Stat method.
 * </p>
 */
public enum tagVisStatCodes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visStatNormal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visStatAppHasShutdown(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visStatDeleted(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visStatTouched(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visStatClosed(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visStatSuspended(16),
  ;

  private  int value;
  tagVisStatCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

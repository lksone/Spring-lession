package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Protection Property values of command bars.
 * </p>
 */
public enum tagVisUIBarProtection implements ComEnum {
  /**
   * <p>
   * No protection.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visBarNoProtection(0),
  /**
   * <p>
   * Bar may not be customized.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visBarNoCustomize(1),
  /**
   * <p>
   * Bar may not be resized.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visBarNoResize(2),
  /**
   * <p>
   * Bar may not be moved.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visBarNoMove(4),
  /**
   * <p>
   * Bar may not be docked/undocked.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visBarNoChangeDock(16),
  /**
   * <p>
   * Bar may not be docked vertically.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visBarNoVerticalDock(32),
  /**
   * <p>
   * Bar may not be docked horizontally.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visBarNoHorizontalDock(64),
  ;

  private  int value;
  tagVisUIBarProtection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

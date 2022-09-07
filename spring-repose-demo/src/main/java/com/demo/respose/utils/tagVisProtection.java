package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Document.Protection.
 * </p>
 */
public enum tagVisProtection implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visProtectNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visProtectStyles(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visProtectShapes(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visProtectMasters(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visProtectBackgrounds(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visProtectPreviews(16),
  ;

  private  int value;
  tagVisProtection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

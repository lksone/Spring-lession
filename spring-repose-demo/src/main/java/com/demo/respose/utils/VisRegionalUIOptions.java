package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Regional UI options.
 * </p>
 */
public enum VisRegionalUIOptions implements ComEnum {
  /**
   * <p>
   * Use system settings to determine visible state of regional UI.
   * </p>
   * <p>
   * The value of this constant is 65535
   * </p>
   */
  VisRegionalUIOptionsUseSystemSettings(65535),
  /**
   * <p>
   * Always hide regional UI.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  VisRegionalUIOptionsHide(0),
  /**
   * <p>
   * Always show regional UI.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  VisRegionalUIOptionsShow(1),
  ;

  private  int value;
  VisRegionalUIOptions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

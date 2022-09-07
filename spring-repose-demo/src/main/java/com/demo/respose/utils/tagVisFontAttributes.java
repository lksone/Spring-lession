package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Attribute codes returned by Font.Attributes.
 * </p>
 */
public enum tagVisFontAttributes implements ComEnum {
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visFontRaster(16),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visFontDevice(32),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visFontScalable(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visFont0Alias(128),
  ;

  private  int value;
  tagVisFontAttributes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

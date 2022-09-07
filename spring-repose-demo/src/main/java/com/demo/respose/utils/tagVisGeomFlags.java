package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to pass to Row methods that get/put vertex arrays.
 * </p>
 */
public enum tagVisGeomFlags implements ComEnum {
  /**
   * <p>
   * Last point (X and Y cells) not included in data.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGeomExcludeLastPoint(1),
  /**
   * <p>
   * XY values are fractions of width or height.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visGeomWHPct(16),
  /**
   * <p>
   * XY values are local, internal coordinates (inches in the drawing).
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visGeomXYLocal(32),
  ;

  private  int value;
  tagVisGeomFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

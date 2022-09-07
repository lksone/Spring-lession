package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to pass to Selection.DrawRegion.
 * </p>
 */
public enum tagVisDrawRegionFlags implements ComEnum {
  /**
   * <p>
   * A flag that if set tells DrawRegion to delete its input shapes.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDrawRegionDeleteInput(4),
  /**
   * <p>
   * A flag that if set tells DrawRegion to consider invisible geometry.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visDrawRegionIncludeHidden(16),
  /**
   * <p>
   * A flag that if set tells DrawRegion to not consider visible geometry.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visDrawRegionIgnoreVisible(32),
  /**
   * <p>
   * A flag that if set tells DrawRegion to consider data graphics.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visDrawRegionIncludeDataGraphics(64),
  ;

  private  int value;
  tagVisDrawRegionFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

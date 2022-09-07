package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisMasterTypes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTypeMaster(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTypeFillPattern(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visTypeLinePattern(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visTypeLineEnd(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visTypeDataGraphic(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visTypeThemeColors(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visTypeThemeEffects(7),
  ;

  private  int value;
  VisMasterTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

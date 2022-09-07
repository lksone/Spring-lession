package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Parameter values for Windows.Arrange.
 * </p>
 */
public enum tagVisWindowArrange implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visArrangeTileVertical(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visArrangeTileHorizontal(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visArrangeCascade(3),
  ;

  private  int value;
  tagVisWindowArrange(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisLayoutIncrementalType implements ComEnum {
  /**
   * <p>
   * Align
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLayoutIncrAlign(1),
  /**
   * <p>
   * Space
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLayoutIncrSpace(2),
  ;

  private  int value;
  VisLayoutIncrementalType(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

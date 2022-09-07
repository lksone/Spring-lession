package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisReplaceFlags implements ComEnum {
  /**
   * <p>
   * Use the behavior specified by the replacement shape
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visReplaceShapeDefault(0),
  /**
   * <p>
   * Override the replacement shape replace behavior. Unlock the replacement text, data and format
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visReplaceShapeKeepBasic(1),
  /**
   * <p>
   * Override the replacement shape replace behavior. Lock the replacement text
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visReplaceShapeLockText(2),
  /**
   * <p>
   * Override the replacement shape replace behavior. Lock the replacement data
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visReplaceShapeLockShapeData(4),
  /**
   * <p>
   * Override the replacement shape replace behavior. Lock the replacement format
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visReplaceShapeLockFormat(8),
  ;

  private  int value;
  VisReplaceFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

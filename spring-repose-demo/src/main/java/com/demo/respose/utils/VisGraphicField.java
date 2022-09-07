package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisGraphicField implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGraphicPropertyLabel(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGraphicExpression(2),
  ;

  private  int value;
  VisGraphicField(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

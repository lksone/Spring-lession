package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisRibbonXModes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRXModeNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRXModeDrawing(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRXModeStencil(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visRXModePrintPreview(4),
  ;

  private  int value;
  VisRibbonXModes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

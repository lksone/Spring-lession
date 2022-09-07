package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flip directions.
 * </p>
 */
public enum VisFlipDirection implements ComEnum {
  /**
   * <p>
   * Flip the selection horizontally.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFlipHorizontal(1),
  /**
   * <p>
   * Flip the selection vertically.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFlipVertical(2),
  ;

  private  int value;
  VisFlipDirection(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

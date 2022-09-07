package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Action codes used in conjunction with Select method.
 * </p>
 */
public enum tagVisSelectArgs implements ComEnum {
  /**
   * <p>
   * Deselect item
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDeselect(1),
  /**
   * <p>
   * Select item
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSelect(2),
  /**
   * <p>
   * Sub select item
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSubSelect(3),
  /**
   * <p>
   * Select item and its siblings
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSelectAll(4),
  /**
   * <p>
   * Deselect all items
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visDeselectAll(256),
  ;

  private  int value;
  tagVisSelectArgs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

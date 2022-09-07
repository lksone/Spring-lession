package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values to use with RowIndex Property of MenusSets and Toolbars.
 * </p>
 */
public enum tagVisUIBarRow implements ComEnum {
  /**
   * <p>
   * First row.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visBarRowFirst(0),
  /**
   * <p>
   * Last row.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visBarRowLast(-1),
  ;

  private  int value;
  tagVisUIBarRow(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

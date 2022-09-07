package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flag to be passed to Shape.SectionExists and similar methods.
 * </p>
 */
public enum tagVisExistsFlags implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visExistsLocally(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visExistsAnywhere(0),
  ;

  private  int value;
  tagVisExistsFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

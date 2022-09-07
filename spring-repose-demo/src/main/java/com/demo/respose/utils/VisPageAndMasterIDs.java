package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values related to IDs of Visio Pages and Masters.
 * </p>
 */
public enum VisPageAndMasterIDs implements ComEnum {
  /**
   * <p>
   * An ID no page will ever have.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visInvalPageID(-1),
  /**
   * <p>
   * An ID no master will ever have.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visInvalMasterID(-1),
  ;

  private  int value;
  VisPageAndMasterIDs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

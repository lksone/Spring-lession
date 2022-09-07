package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * HIDDEN Values to be passed to ToolbarStyle.
 * </p>
 */
public enum tagVisToolbarFlavors implements ComEnum {
  /**
   * <p>
   * Obsolete as of Visio 5.0. Use ShowToolbar=false.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visToolBarNone(-1),
  /**
   * <p>
   * Obsolete as of Visio 5.0. Use ShowToolbar=true.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visToolBarOn(0),
  /**
   * <p>
   * Obsolete as of Visio 5.0. Use ShowToolbar=true.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visToolBarMSOffice(0),
  /**
   * <p>
   * Obsolete as of Visio 5.0. Use ShowToolbar=true.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visToolBarLotusSS(0),
  ;

  private  int value;
  tagVisToolbarFlavors(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

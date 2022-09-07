package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * States of buttons in command bars.
 * </p>
 */
public enum tagVisUIButtonState implements ComEnum {
  /**
   * <p>
   * Button is not checked.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visButtonUp(0),
  /**
   * <p>
   * Button is checked.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visButtonDown(-1),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visButtonMixed(2),
  ;

  private  int value;
  tagVisUIButtonState(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

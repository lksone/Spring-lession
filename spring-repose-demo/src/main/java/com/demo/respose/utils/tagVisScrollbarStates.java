package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values to use with Window.ShowScrollBars.
 * </p>
 */
public enum tagVisScrollbarStates implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visScrollBarNeither(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visScrollBarHoriz(1),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visScrollBarVert(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visScrollBarBoth(5),
  ;

  private  int value;
  tagVisScrollbarStates(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

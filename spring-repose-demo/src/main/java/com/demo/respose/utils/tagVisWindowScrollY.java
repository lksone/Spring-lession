package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Y parameters to use with Window.Scroll.
 * </p>
 */
public enum tagVisWindowScrollY implements ComEnum {
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visScrollNoneY(9),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visScrollUp(0),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visScrollUpPage(2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visScrollDown(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visScrollDownPage(3),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visScrollToTop(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visScrollToBottom(7),
  ;

  private  int value;
  tagVisWindowScrollY(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * X parameters to use with Window.Scroll.
 * </p>
 */
public enum tagVisWindowScrollX implements ComEnum {
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visScrollNoneX(9),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visScrollLeft(0),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visScrollLeftPage(2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visScrollRight(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visScrollRightPage(3),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visScrollToLeft(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visScrollToRight(7),
  ;

  private  int value;
  tagVisWindowScrollX(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

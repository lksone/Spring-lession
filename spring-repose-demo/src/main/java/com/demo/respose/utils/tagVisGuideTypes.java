package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Type codes to be passed to Page.AddGuide.
 * </p>
 */
public enum tagVisGuideTypes implements ComEnum {
  /**
   * <p>
   * Instructs AddGuide to produce a guide point.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPoint(1),
  /**
   * <p>
   * Instructs AddGuide to produce a horizontal guide.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visHorz(2),
  /**
   * <p>
   * Instructs AddGuide to produce a vertical guide.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visVert(3),
  ;

  private  int value;
  tagVisGuideTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisGraphicItemTypes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTypeIconSet(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visTypeTextCallout(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visTypeDataBar(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visTypeColorByValue(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visTypeHeading(6),
  ;

  private  int value;
  VisGraphicItemTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

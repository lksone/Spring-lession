package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values related to IDs of Visio Shapes.
 * </p>
 */
public enum tagVisShapeIDs implements ComEnum {
  /**
   * <p>
   * An ID no shape will ever have.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visInvalShapeID(-1),
  /**
   * <p>
   * The ID of a page's or master's page sheet.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPageSheetID(0),
  ;

  private  int value;
  tagVisShapeIDs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

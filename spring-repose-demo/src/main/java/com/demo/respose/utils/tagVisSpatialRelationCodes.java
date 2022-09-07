package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Codes for spatial shape relationships.
 * </p>
 */
public enum tagVisSpatialRelationCodes implements ComEnum {
  /**
   * <p>
   * Shapes share interior points but neither contains the other.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSpatialOverlap(1),
  /**
   * <p>
   * Shape contains other shape.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSpatialContain(2),
  /**
   * <p>
   * Shape contained in other shape.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSpatialContainedIn(4),
  /**
   * <p>
   * Shapes are close but don't overlap or contain one another.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSpatialTouching(8),
  ;

  private  int value;
  tagVisSpatialRelationCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

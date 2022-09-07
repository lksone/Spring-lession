package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Codes returned by Connect.ToPart.
 * </p>
 */
public enum tagVisToParts implements ComEnum {
  /**
   * <p>
   * Connect.ToPart: Not known
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visConnectToError(-1),
  /**
   * <p>
   * Connect.ToPart: Connection is to nothing.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visToNone(0),
  /**
   * <p>
   * Connect.ToPart: Connection is to x-coordinate of guide.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGuideX(1),
  /**
   * <p>
   * Connect.ToPart: Connection is to y-coordinate of guide.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGuideY(2),
  /**
   * <p>
   * Connect.ToPart: Connection is to shape. (Walking glue)
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visWholeShape(3),
  /**
   * <p>
   * Connect.ToPart: Connection is to a point on a guide.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGuideIntersect(4),
  /**
   * <p>
   * Connect.ToPart: Connection is to the direction of a connection point.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visToAngle(7),
  /**
   * <p>
   * Connect.ToPart: Connection is to connection point (+ row index).
   * </p>
   * <p>
   * The value of this constant is 100
   * </p>
   */
  visConnectionPoint(100),
  /**
   * <p>
   * Obsolete - Use visConnectFrom/ToError.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visConnectError(-1),
  /**
   * <p>
   * Obsolete - Use visFrom/ToNone.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visNone(0),
  ;

  private  int value;
  tagVisToParts(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Codes returned by Connect.FromPart.
 * </p>
 */
public enum tagVisFromParts implements ComEnum {
  /**
   * <p>
   * Connect.FromPart: Not known
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visConnectFromError(-1),
  /**
   * <p>
   * Connect.FromPart: Connection is from nothing.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFromNone(0),
  /**
   * <p>
   * Connect.FromPart: Connection is from left edge of shape.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLeftEdge(1),
  /**
   * <p>
   * Connect.FromPart: Connection is from (x) center of shape.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCenterEdge(2),
  /**
   * <p>
   * Connect.FromPart: Connection is from right edge of shape.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visRightEdge(3),
  /**
   * <p>
   * Connect.FromPart: Connection is from bottom edge of shape.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visBottomEdge(4),
  /**
   * <p>
   * Connect.FromPart: Connection is from (y) middle of shape.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visMiddleEdge(5),
  /**
   * <p>
   * Connect.FromPart: Connection is from top edge of shape.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visTopEdge(6),
  /**
   * <p>
   * Connect.FromPart: Connection is from begin x of 1-D shape.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visBeginX(7),
  /**
   * <p>
   * Connect.FromPart: Connection is from begin y of 1-D shape.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visBeginY(8),
  /**
   * <p>
   * Connect.FromPart: Connection is from begin of 1-D shape.
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visBegin(9),
  /**
   * <p>
   * Connect.FromPart: Connection is from end x of 1-D shape.
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visEndX(10),
  /**
   * <p>
   * Connect.FromPart: Connection is from end y of 1-D shape.
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visEndY(11),
  /**
   * <p>
   * Connect.FromPart: Connection is from end of 1-D shape.
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visEnd(12),
  /**
   * <p>
   * Connect.FromPart: Connection is from the direction of a connection point.
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visFromAngle(13),
  /**
   * <p>
   * Connect.FromPart: Connection is from the pin of a shape.
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visFromPin(14),
  /**
   * <p>
   * Connect.FromPart: Connection is from control point (+ row index).
   * </p>
   * <p>
   * The value of this constant is 100
   * </p>
   */
  visControlPoint(100),
  ;

  private  int value;
  tagVisFromParts(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

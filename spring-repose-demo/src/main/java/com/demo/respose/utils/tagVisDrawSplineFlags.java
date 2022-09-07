package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to pass to DrawSpline or DrawPolyline.
 * </p>
 */
public enum tagVisDrawSplineFlags implements ComEnum {
  /**
   * <p>
   * A flag that if set allows generation of periodic splines.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSplinePeriodic(1),
  /**
   * <p>
   * A flag that if set allows generation of circular arcs instead of spline segments.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSplineDoCircles(2),
  /**
   * <p>
   * A flag that if set tells Visio to break splines when direction changes abruptly.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSplineAbrupt(4),
  /**
   * <p>
   * A flag that if set tells Visio to generate splines with 1D behavior.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSpline1D(8),
  /**
   * <p>
   * A flag that if set tells Visio to generate polylines with 1D behavior.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visPolyline1D(8),
  /**
   * <p>
   * A flag that if set tells DrawPolyline to accept [x,y, {x,y,bow}] rather than {x,y}.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visPolyarcs(256),
  ;

  private  int value;
  tagVisDrawSplineFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

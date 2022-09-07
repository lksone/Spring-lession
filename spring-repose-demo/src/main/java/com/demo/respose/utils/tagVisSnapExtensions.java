package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Document.SnapExtensions.
 * </p>
 */
public enum tagVisSnapExtensions implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSnapExtNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSnapExtAlignmentBoxExtension(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSnapExtCenterAxes(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSnapExtCurveTangent(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSnapExtEndpoint(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visSnapExtMidpoint(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visSnapExtLinearExtension(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visSnapExtCurveExtension(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visSnapExtEndpointPerpendicular(128),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visSnapExtMidpointPerpendicular(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visSnapExtEndpointHorizontal(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visSnapExtEndpointVertical(1024),
  /**
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visSnapExtEllipseCenter(2048),
  /**
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visSnapExtIsometricAngles(4096),
  ;

  private  int value;
  tagVisSnapExtensions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

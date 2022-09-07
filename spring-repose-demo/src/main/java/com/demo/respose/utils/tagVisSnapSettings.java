package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Document.SnapSettings.
 * </p>
 */
public enum tagVisSnapSettings implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSnapToNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSnapToRulerSubdivisions(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSnapToGrid(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSnapToGuides(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSnapToHandles(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visSnapToVertices(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visSnapToConnectionPoints(32),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visSnapToGeometry(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visSnapToAlignmentBox(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visSnapToExtensions(1024),
  /**
   * <p>
   * Same as Doc.SnapEnabled=FALSE.
   * </p>
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  visSnapToDisabled(32768),
  /**
   * <p>
   * The value of this constant is 65536
   * </p>
   */
  visSnapToIntersections(65536),
  ;

  private  int value;
  tagVisSnapSettings(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

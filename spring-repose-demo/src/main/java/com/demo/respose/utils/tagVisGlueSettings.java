package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Document.GlueSettings.
 * </p>
 */
public enum tagVisGlueSettings implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGlueToNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGlueToGuides(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGlueToHandles(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGlueToVertices(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visGlueToConnectionPoints(8),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visGlueToGeometry(32),
  /**
   * <p>
   * Same as Doc.GlueEnabled=FALSE.
   * </p>
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  visGlueToDisabled(32768),
  ;

  private  int value;
  tagVisGlueSettings(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to spatial relation methods.
 * </p>
 */
public enum tagVisSpatialRelationFlags implements ComEnum {
  /**
   * <p>
   * A flag that if set tells spatial methods to consider guides to have extent.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSpatialIncludeGuides(2),
  /**
   * <p>
   * A flag that if set tells spatial methods to return frontmost shapes first.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSpatialFrontToBack(4),
  /**
   * <p>
   * A flag that if set tells spatial methods to return backmost shapes first.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSpatialBackToFront(8),
  /**
   * <p>
   * A flag that if set tells spatial methods to consider hidden geometry.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visSpatialIncludeHidden(16),
  /**
   * <p>
   * A flag that if set tells spatial methods to not consider visible geometry.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visSpatialIgnoreVisible(32),
  /**
   * <p>
   * A flag that if set tells spatial methods to consider data graphics.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visSpatialIncludeDataGraphics(64),
  /**
   * <p>
   * A flag that if set tells spatial methods to include containers, which are excluded by default.
   * </p>
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visSpatialIncludeContainerShapes(128),
  ;

  private  int value;
  tagVisSpatialRelationFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

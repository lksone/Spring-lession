package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to be passed to BoundingBox.
 * </p>
 */
public enum tagVisBoundingBoxArgs implements ComEnum {
  /**
   * <p>
   * Pass this to BoundingBox to include upright width/height box(es) in result.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visBBoxUprightWH(1),
  /**
   * <p>
   * Pass this to BoundingBox to include upright text box(es) in result.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visBBoxUprightText(2),
  /**
   * <p>
   * Pass this to BoundingBox to include geometric extents in result.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visBBoxExtents(4),
  /**
   * <p>
   * If visBBoxExtents is also set this tells BoundingBox to consider hidden geometry.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visBBoxIncludeHidden(16),
  /**
   * <p>
   * If visBBoxExtents is also set this tells BoundingBox to not consider visible geometry.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visBBoxIgnoreVisible(32),
  /**
   * <p>
   * Pass this to BoundingBox to include data graphic callout shapes in result.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visBBoxIncludeDataGraphics(64),
  /**
   * <p>
   * Pass this to BoundingBox to have it consider guides to have extent.
   * </p>
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visBBoxIncludeGuides(4096),
  /**
   * <p>
   * Pass this to BoundingBox to have results reported in page/master coords rather than local coords of parent.
   * </p>
   * <p>
   * The value of this constant is 8192
   * </p>
   */
  visBBoxDrawingCoords(8192),
  /**
   * <p>
   * Pass this to BoundingBox to have it consider non-printing shapes to have no extent.
   * </p>
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  visBBoxNoNonPrint(16384),
  ;

  private  int value;
  tagVisBoundingBoxArgs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

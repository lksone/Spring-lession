package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Application.DefaultZoomBehavior, Document.ZoomBehavior and Window.ZoomBehavior.
 * </p>
 */
public enum tagVisZoomBehavior implements ComEnum {
  /**
   * <p>
   * Undefined zoom behavior, use the zoom behavior of the document or application.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visZoomNone(0),
  /**
   * <p>
   * Container zooms in-place Visio.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visZoomInPlaceContainer(1),
  /**
   * <p>
   * Visio zooms when open in-place; Visio adjusts the zoom level for better appearance.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visZoomVisio(2),
  /**
   * <p>
   * Visio zooms when open in-place; Visio does not adjust the zoom level.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visZoomVisioExact(4),
  ;

  private  int value;
  tagVisZoomBehavior(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

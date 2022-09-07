package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisGluedShapesFlags {
  /**
   * <p>
   * Return 1-D shapes glued to this shape
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGluedShapesAll1D, // 0
  /**
   * <p>
   * Return 1-D shapes whose End Points are glued to this shape
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGluedShapesIncoming1D, // 1
  /**
   * <p>
   * Return 1-D shapes whose Begin Points are glued to this shape
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGluedShapesOutgoing1D, // 2
  /**
   * <p>
   * Return 2-D shapes glued to this shape and 2-D shapes that this shape is glued to
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visGluedShapesAll2D, // 3
  /**
   * <p>
   * If the source object is a 1-D shape, return the 2-D shape that the Begin Point is glued to.  If the source object is a 2-D shape, return 2-D shapes glued to this shape.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGluedShapesIncoming2D, // 4
  /**
   * <p>
   * If the source object is a 1-D shape, return the 2-D shape that the End Point is glued to.  If the source object is a 2-D shape, return 2-D shapes that this shape is glued to.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visGluedShapesOutgoing2D, // 5
}

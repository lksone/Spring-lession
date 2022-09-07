package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Rotation types.
 * </p>
 */
public enum VisRotationTypes {
  /**
   * <p>
   * Rotate the selection relative to the center of the selection.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRotateSelection, // 0
  /**
   * <p>
   * Rotate the selection around a pin.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRotateSelectionWithPin, // 1
  /**
   * <p>
   * Rotate the shapes around their pins relative to their current angle.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRotateShapes, // 2
}

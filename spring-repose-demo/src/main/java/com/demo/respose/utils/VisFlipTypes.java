package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flip types.
 * </p>
 */
public enum VisFlipTypes {
  /**
   * <p>
   * Flip the selection about the center of the selection.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFlipSelection, // 0
  /**
   * <p>
   * Flip the selection about a pin.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFlipSelectionWithPin, // 1
  /**
   * <p>
   * Flip the shapes about their pins.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFlipShapes, // 2
}

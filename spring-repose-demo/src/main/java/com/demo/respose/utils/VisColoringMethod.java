package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisColoringMethod {
  /**
   * <p>
   * Each color represents a unique value
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visColorDiscrete, // 0
  /**
   * <p>
   * Each color represents the range of values
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visColorRange, // 1
  /**
   * <p>
   * Invalid coloring method
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visColorInvalid, // 2
}

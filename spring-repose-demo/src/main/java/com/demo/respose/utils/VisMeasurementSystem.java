package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Measurement system types.
 * </p>
 */
public enum VisMeasurementSystem {
  /**
   * <p>
   * Choose Metric or US depending on user locale preferences set in the System Control Panel.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visMSDefault, // 0
  /**
   * <p>
   * Metric measurement system.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visMSMetric, // 1
  /**
   * <p>
   * US units measurement system.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visMSUS, // 2
}

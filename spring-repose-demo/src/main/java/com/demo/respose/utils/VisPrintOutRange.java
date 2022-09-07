package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Print Out range options
 * </p>
 */
public enum VisPrintOutRange {
  /**
   * <p>
   * Print all foreground pages
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPrintAll, // 0
  /**
   * <p>
   * Print pages between From Index and To Index
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPrintFromTo, // 1
  /**
   * <p>
   * Print Active Page
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPrintCurrentPage, // 2
  /**
   * <p>
   * Print current selection
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPrintSelection, // 3
  /**
   * <p>
   * Print current view area
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPrintCurrentView, // 4
}

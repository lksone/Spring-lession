package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values for the PageSizingBehavior property.
 * </p>
 */
public enum VisPageSizingBehaviors {
  /**
   * <p>
   * Do not automatically resize the pages under any circumstances.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visNeverResizePages, // 0
  /**
   * <p>
   * Automatically resize all pages when the control resizes or when a new document is loaded into it. Leave shapes alone.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visResizePages, // 1
}

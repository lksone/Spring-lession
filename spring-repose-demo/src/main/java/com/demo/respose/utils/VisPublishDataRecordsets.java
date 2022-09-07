package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisPublishDataRecordsets {
  /**
   * <p>
   * All of the data recordsets should be published.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPublishDataRecordsetAll, // 0
  /**
   * <p>
   * None of the data recordsets should be published.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPublishDataRecordsetNone, // 1
  /**
   * <p>
   * The recordsets to be published are passed in a SAFEARRAY.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPublishDataRecordsetSelect, // 2
}

package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisRecordsetFieldStatus {
  /**
   * <p>
   * Field is not present as shape data label
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFieldNotMapped, // 0
  /**
   * <p>
   * No callout applied for the field in all selected linked shapes
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFieldMappedNoCallouts, // 1
  /**
   * <p>
   * Callout applied on some shapes having this field
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFieldMappedSomeCallouts, // 2
  /**
   * <p>
   * All shapes have this field and Callout applied on them
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFieldMappedAllCallouts, // 3
}

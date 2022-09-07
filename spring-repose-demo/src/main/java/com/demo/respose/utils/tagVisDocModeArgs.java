package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Document.Mode and IDs returned by Document.ID.
 * </p>
 */
public enum tagVisDocModeArgs implements ComEnum {
  /**
   * <p>
   * The value Document.ID will never report for an open document.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visInvalDocID(-1),
  /**
   * <p>
   * The value reported by Document.Mode for a document in run mode.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDocModeRun(0),
  /**
   * <p>
   * The value reported by Document.Mode for a document in design mode.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDocModeDesign(1),
  ;

  private  int value;
  tagVisDocModeArgs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

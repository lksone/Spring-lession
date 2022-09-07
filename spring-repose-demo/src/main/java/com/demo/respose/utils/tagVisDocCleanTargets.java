package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to Document.Clean indicating what objects to examine.
 * </p>
 */
public enum tagVisDocCleanTargets implements ComEnum {
  /**
   * <p>
   * Tells Document.Clean to examine foreground pages.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDocCleanTargFPages(1),
  /**
   * <p>
   * Tells Document.Clean to examine background pages.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDocCleanTargBPages(2),
  /**
   * <p>
   * Tells Document.Clean to examine masters.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDocCleanTargMasters(4),
  /**
   * <p>
   * Tells Document.Clean to examine styles.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDocCleanTargStyles(8),
  /**
   * <p>
   * Tells Document.Clean to examine document sheets.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visDocCleanTargDoc(16),
  /**
   * <p>
   * Tells Document.Clean to examine reviewer pages.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visDocCleanTargRPages(32),
  /**
   * <p>
   * Tells Document.Clean to examine only page sheets.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visDocCleanPageSheet(256),
  /**
   * <p>
   * Tells Document.Clean to examine all objects. [Default value for nTargets]
   * </p>
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visDocCleanTargAll(255),
  ;

  private  int value;
  tagVisDocCleanTargets(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

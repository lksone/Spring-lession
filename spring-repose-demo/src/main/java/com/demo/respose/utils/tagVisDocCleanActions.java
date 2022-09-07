package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to Document.Clean indicating what to perform, report and fix.
 * </p>
 */
public enum tagVisDocCleanActions implements ComEnum {
  /**
   * <p>
   * Tells Document.Clean to detect 'meaningless' local overrides.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDocCleanActLocalFormulas(1),
  /**
   * <p>
   * Tells Document.Clean to detect 'empty' local rows and sections.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDocCleanActEmptyRowsAndSects(2),
  /**
   * <p>
   * Tells Document.Clean to detect non-default font settings.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDocCleanActNonDefaultFonts(4),
  /**
   * <p>
   * Tells Document.Clean to detect results that don't match formulas.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDocCleanActStaleResults(8),
  /**
   * <p>
   * Tells Document.Clean to detect missing subscriptions.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visDocCleanActMissingSubs(16),
  /**
   * <p>
   * Tells Document.Clean to detect formulas that can be generated from result.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visDocCleanActConstantFormulas(32),
  /**
   * <p>
   * Tells Document.Clean to detect almost zero results and make them zero.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visDocCleanActNearZero(64),
  /**
   * <p>
   * Tells Document.Clean to detect duplicate subscriptions.
   * </p>
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visDocCleanActDuplicateSubs(128),
  /**
   * <p>
   * Tells Document.Clean to detect invalid display list linkages.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visDocCleanActBadDisplayLists(256),
  /**
   * <p>
   * Obsolete starting with Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visDocCleanActBadFieldCounts(512),
  /**
   * <p>
   * Tells Document.Clean to detect deleted fields.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visDocCleanActDeletedFields(1024),
  /**
   * <p>
   * Tells Document.Clean to detect fields with missing or non-standard formulas.
   * </p>
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visDocCleanActBadFieldFormulas(2048),
  /**
   * <p>
   * Tells Document.Clean to detect invalid mark to field correspondence.
   * </p>
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visDocCleanActBadFieldMarks(4096),
  /**
   * <p>
   * Tells Document.Clean to detect formulas with #Ref() errors.
   * </p>
   * <p>
   * The value of this constant is 8192
   * </p>
   */
  visDocCleanActBadReferences(8192),
  /**
   * <p>
   * Tells Document.Clean to perform all actions.
   * </p>
   * <p>
   * The value of this constant is 16383
   * </p>
   */
  visDocCleanActAll(16383),
  /**
   * <p>
   * Problems that Document.Clean detects by default. [Default value for nActions]
   * </p>
   * <p>
   * The value of this constant is 8152
   * </p>
   */
  visDocCleanActDefault(8152),
  /**
   * <p>
   * Problems that Document.Clean reports by default. [Default value for nAlerts]
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDocCleanAlertDefault(0),
  /**
   * <p>
   * Problems that Document.Clean fixes by default. [Default value for nFixes]
   * </p>
   * <p>
   * The value of this constant is 984
   * </p>
   */
  visDocCleanFixDefault(984),
  ;

  private  int value;
  tagVisDocCleanActions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Default Save Format Options
 * </p>
 */
public enum VisDefaultSaveFormats implements ComEnum {
  /**
   * <p>
   * File format for Current Version (15.0).
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDefaultSaveCurrent(0),
  /**
   * <p>
   * Synonym of visDefaultSaveCurrent.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDefaultSaveCurrentBinary(0),
  /**
   * <p>
   * Binary format for Previous Version (11.0).
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDefaultSavePreviousBinary(1),
  /**
   * <p>
   * Synonym of visDefaultSaveCurrent.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDefaultSaveCurrentXML(2),
  /**
   * <p>
   * Macro enabled format for Current Version (15.0).
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visDefaultSaveCurrentMacroEnabled(3),
  ;

  private  int value;
  VisDefaultSaveFormats(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

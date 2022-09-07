package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Toolbar Bar constants for Spacing property. Obsolete as of Visio 2000.
 * </p>
 */
public enum tagVisUISpacingTypes implements ComEnum {
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCtrlSpacingNONE(0),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCtrlSpacingVARIABLE_BEFORE(1),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCtrlSpacingVARIABLE_AFTER(2),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCtrlSpacingFIXED_BEFORE(4),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCtrlSpacingFIXED_AFTER(8),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visCtrlSpacingNEW_ROW(16),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visCtrlSpacingTB_NOTFIXED(32),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visCtrlSpacingPALETTERIGHT(64),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 80
   * </p>
   */
  visCtrlSpacingNEW_ROW_PALETTERIGHT(80),
  ;

  private  int value;
  tagVisUISpacingTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

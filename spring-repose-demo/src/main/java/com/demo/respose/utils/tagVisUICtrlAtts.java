package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Toolbar Bar constants for control alignment. Obsolete as of Visio 2003,
 * </p>
 */
public enum tagVisUICtrlAtts implements ComEnum {
  /**
   * <p>
   * Obsolete as of Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCtrlAlignmentLEFT(1),
  /**
   * <p>
   * Obsolete as of Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCtrlAlignmentCENTER(2),
  /**
   * <p>
   * Obsolete as of Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCtrlAlignmentRIGHT(4),
  /**
   * <p>
   * Obsolete as of Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visCtrlAlignmentBOX(128),
  /**
   * <p>
   * Obsolete as of Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 129
   * </p>
   */
  visCtrlAlignmentLEFTBOX(129),
  /**
   * <p>
   * Obsolete as of Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 130
   * </p>
   */
  visCtrlAlignmentCENTERBOX(130),
  /**
   * <p>
   * Obsolete as of Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 132
   * </p>
   */
  visCtrlAlignmentRIGHTBOX(132),
  ;

  private  int value;
  tagVisUICtrlAtts(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

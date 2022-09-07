package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Document.PaperSize.
 * </p>
 */
public enum tagVisPaperSizes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPaperSizeUnknown(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPaperSizeLetter(1),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visPaperSizeLegal(5),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visPaperSizeA3(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visPaperSizeA4(9),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visPaperSizeA5(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visPaperSizeB4(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visPaperSizeB5(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visPaperSizeFolio(14),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visPaperSizeNote(18),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visPaperSizeC(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visPaperSizeD(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visPaperSizeE(26),
  ;

  private  int value;
  tagVisPaperSizes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

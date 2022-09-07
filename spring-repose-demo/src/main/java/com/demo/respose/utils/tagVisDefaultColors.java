package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Indices of colors (in default palette).
 * </p>
 */
public enum tagVisDefaultColors implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTransparent(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visBlack(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visWhite(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRed(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visGreen(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visBlue(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visYellow(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visMagenta(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visCyan(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDarkRed(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visDarkGreen(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visDarkBlue(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visDarkYellow(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visPurple(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visDarkCyan(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visGray(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visGray10(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visGray20(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visGray30(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visGray40(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visDarkGray(19),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visGray50(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visGray60(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visGray70(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visGray80(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visGray90(23),
  ;

  private  int value;
  tagVisDefaultColors(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

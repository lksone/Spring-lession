package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to be passed to GetResults or SetFormulas/Results.
 * </p>
 */
public enum tagVisGetSetArgs implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGetFloats(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGetTruncatedInts(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGetRoundedInts(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visGetStrings(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGetFormulas(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visGetFormulasU(5),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSetFormulas(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSetBlastGuards(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSetTestCircular(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSetUniversalSyntax(8),
  ;

  private  int value;
  tagVisGetSetArgs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

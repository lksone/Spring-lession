package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Run types to be passed to Characters.RunBegin/End.
 * </p>
 */
public enum tagVisRunTypes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCharPropRow(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visParaPropRow(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visTabPropRow(3),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visWordRun(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visParaRun(11),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visFieldRun(20),
  ;

  private  int value;
  tagVisRunTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

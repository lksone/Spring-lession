package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisQuickStyleMatrixIndices implements ComEnum {
  /**
   * <p>
   * None
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visQuickStyleMatrixNone(0),
  /**
   * <p>
   * Theme 1
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visQuickStyleMatrixTheme1(1),
  /**
   * <p>
   * Theme 2
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visQuickStyleMatrixTheme2(2),
  /**
   * <p>
   * Theme 3
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visQuickStyleMatrixTheme3(3),
  /**
   * <p>
   * Theme 4
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visQuickStyleMatrixTheme4(4),
  /**
   * <p>
   * Theme 5
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visQuickStyleMatrixTheme5(5),
  /**
   * <p>
   * Theme 6
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visQuickStyleMatrixTheme6(6),
  /**
   * <p>
   * Variant 1
   * </p>
   * <p>
   * The value of this constant is 100
   * </p>
   */
  visQuickStyleMatrixVariant1(100),
  /**
   * <p>
   * Variant 2
   * </p>
   * <p>
   * The value of this constant is 101
   * </p>
   */
  visQuickStyleMatrixVariant2(101),
  /**
   * <p>
   * Variant 3
   * </p>
   * <p>
   * The value of this constant is 102
   * </p>
   */
  visQuickStyleMatrixVariant3(102),
  /**
   * <p>
   * Variant 4
   * </p>
   * <p>
   * The value of this constant is 103
   * </p>
   */
  visQuickStyleMatrixVariant4(103),
  ;

  private  int value;
  VisQuickStyleMatrixIndices(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

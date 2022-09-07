package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisRemoveHiddenInfoItems implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRHINone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRHIPersonalInfo(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRHIPreview(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visRHIMasters(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visRHIStyles(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visRHIDataRecordsets(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visRHIValidationRules(32),
  ;

  private  int value;
  VisRemoveHiddenInfoItems(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

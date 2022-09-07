package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisRefreshSettings implements ComEnum {
  /**
   * <p>
   * Over write data on refresh.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRefreshOverwriteAll(1),
  /**
   * <p>
   * Disable refresh reconcilation UI.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRefreshNoReconcilationUI(2),
  ;

  private  int value;
  VisRefreshSettings(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

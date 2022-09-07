package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisPrimaryKeySettings implements ComEnum {
  /**
   * <p>
   * The key is by row order.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visKeyRowOrder(1),
  /**
   * <p>
   * The key is a single key.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visKeySingle(2),
  /**
   * <p>
   * The key is a composite key.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visKeyComposite(3),
  ;

  private  int value;
  VisPrimaryKeySettings(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

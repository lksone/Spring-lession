package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to pass to App.OnComponentEnterState method.
 * </p>
 */
public enum tagVisOnComponentEnterCodes implements ComEnum {
  /**
   * <p>
   * Tells App.OnComponentEnterState that component's modal state is changing.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visComponentStateModal(1),
  /**
   * <p>
   * Include with visComponentStateModal to defer events while modal.
   * </p>
   * <p>
   * The value of this constant is 65536
   * </p>
   */
  visModalDeferEvents(65536),
  /**
   * <p>
   * Include with visComponentStateModal to inhibit Before/AfterModal.
   * </p>
   * <p>
   * The value of this constant is 131072
   * </p>
   */
  visModalNoBeforeAfter(131072),
  /**
   * <p>
   * Include with visComponentStateModal to prevent message filter from blocking.
   * </p>
   * <p>
   * The value of this constant is 262144
   * </p>
   */
  visModalDontBlockMessages(262144),
  /**
   * <p>
   * Include with visComponentStateModal to force Visio's frame to disable.
   * </p>
   * <p>
   * The value of this constant is 524288
   * </p>
   */
  visModalDisableVisiosFrame(524288),
  ;

  private  int value;
  tagVisOnComponentEnterCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

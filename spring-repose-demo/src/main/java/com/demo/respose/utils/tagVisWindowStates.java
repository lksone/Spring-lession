package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * State codes returned by Window.WindowState.
 * </p>
 */
public enum tagVisWindowStates implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visWSNone(0),
  /**
   * <p>
   * The value of this constant is 1073741824
   * </p>
   */
  visWSMaximized(1073741824),
  /**
   * <p>
   * The value of this constant is 536870912
   * </p>
   */
  visWSMinimized(536870912),
  /**
   * <p>
   * The value of this constant is 268435456
   * </p>
   */
  visWSRestored(268435456),
  /**
   * <p>
   * The value of this constant is 134217728
   * </p>
   */
  visWSVisible(134217728),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visWSDockedLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visWSDockedTop(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visWSDockedRight(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visWSDockedBottom(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visWSFloating(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visWSAnchorLeft(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visWSAnchorTop(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visWSAnchorRight(128),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visWSAnchorBottom(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visWSAnchorAutoHide(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visWSAnchorMerged(1024),
  /**
   * <p>
   * The value of this constant is 67108864
   * </p>
   */
  visWSActive(67108864),
  ;

  private  int value;
  tagVisWindowStates(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

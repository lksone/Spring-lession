package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values used in conjunction with Selection.IterationMode.
 * </p>
 */
public enum tagVisSelectMode implements ComEnum {
  /**
   * <p>
   * Don't enumerate selected sheets that have sub-selections.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visSelModeSkipSuper(256),
  /**
   * <p>
   * Only enumerate selected sheets that have sub-selections.
   * </p>
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visSelModeOnlySuper(512),
  /**
   * <p>
   * Don't enumerate selected sheets that are sub-selections.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visSelModeSkipSub(1024),
  /**
   * <p>
   * Only enumerate selected sheets that are sub-selections.
   * </p>
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visSelModeOnlySub(2048),
  ;

  private  int value;
  tagVisSelectMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

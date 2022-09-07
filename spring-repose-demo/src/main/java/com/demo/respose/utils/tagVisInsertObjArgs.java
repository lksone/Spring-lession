package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to be passed to InsertObject or InsertFromFile.
 * </p>
 */
public enum tagVisInsertObjArgs implements ComEnum {
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visInsertLink(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visInsertIcon(16),
  /**
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visInsertDontShow(4096),
  /**
   * <p>
   * The value of this constant is 8192
   * </p>
   */
  visInsertAsControl(8192),
  /**
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  visInsertAsEmbed(16384),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visInsertNoDesignModeTransition(256),
  ;

  private  int value;
  tagVisInsertObjArgs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

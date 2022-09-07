package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values for various properties of a Visio master.
 * </p>
 */
public enum tagVisMasterProperties implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCenter(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visRight(3),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visIconFormatVisio(0),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visIconFormatBMP(2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visNormal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTall(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visWide(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDouble(4),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visAutomatic(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visManual(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visMasIsLinePat(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visMasIsLineEnd(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visMasIsFillPat(4),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visMasLPTileDeform(0),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visMasLPTile(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visMasLPStretch(32),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  visMasLPAnnotate(48),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visMasLPScale(64),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visMasLEDefault(0),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visMasLEUpright(256),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visMasLEScale(1024),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visMasFPTile(0),
  /**
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visMasFPCenter(4096),
  /**
   * <p>
   * The value of this constant is 8192
   * </p>
   */
  visMasFPStretch(8192),
  /**
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  visMasFPScale(16384),
  ;

  private  int value;
  tagVisMasterProperties(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

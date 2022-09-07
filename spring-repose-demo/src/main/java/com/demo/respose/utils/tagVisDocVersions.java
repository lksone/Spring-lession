package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Document version codes.
 * </p>
 */
public enum tagVisDocVersions implements ComEnum {
  /**
   * <p>
   * The version number of an unsaved document.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visVersionUnsaved(0),
  /**
   * <p>
   * Visio 1.0 document.
   * </p>
   * <p>
   * The value of this constant is 65571
   * </p>
   */
  visVersion10(65571),
  /**
   * <p>
   * Visio 2.0 document.
   * </p>
   * <p>
   * The value of this constant is 131072
   * </p>
   */
  visVersion20(131072),
  /**
   * <p>
   * Visio 3.0 document.
   * </p>
   * <p>
   * The value of this constant is 196611
   * </p>
   */
  visVersion30(196611),
  /**
   * <p>
   * Visio 4.x document.
   * </p>
   * <p>
   * The value of this constant is 262144
   * </p>
   */
  visVersion40(262144),
  /**
   * <p>
   * Visio 5.0 document.
   * </p>
   * <p>
   * The value of this constant is 327680
   * </p>
   */
  visVersion50(327680),
  /**
   * <p>
   * Visio 2000/2002 document. (Same value as visVersion100)
   * </p>
   * <p>
   * The value of this constant is 393216
   * </p>
   */
  visVersion60(393216),
  /**
   * <p>
   * Visio 2000/2002 document. (Same value as visVersion60)
   * </p>
   * <p>
   * The value of this constant is 393216
   * </p>
   */
  visVersion100(393216),
  /**
   * <p>
   * Visio 2003/2007/2010 document. (Same value as visVersion120 and visVersion140)
   * </p>
   * <p>
   * The value of this constant is 720896
   * </p>
   */
  visVersion110(720896),
  /**
   * <p>
   * Visio 2003/2007/2010 document. (Same value as visVersion110 and visVersion140)
   * </p>
   * <p>
   * The value of this constant is 720896
   * </p>
   */
  visVersion120(720896),
  /**
   * <p>
   * Visio 2003/2007/2010 document. (Same value as visVersion110 and visVersion120)
   * </p>
   * <p>
   * The value of this constant is 720896
   * </p>
   */
  visVersion140(720896),
  /**
   * <p>
   * Visio 2013 document.
   * </p>
   * <p>
   * The value of this constant is 983040
   * </p>
   */
  visVersion150(983040),
  ;

  private  int value;
  tagVisDocVersions(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

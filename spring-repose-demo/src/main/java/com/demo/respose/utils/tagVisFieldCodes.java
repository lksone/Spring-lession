package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Text field codes.
 * </p>
 */
public enum tagVisFieldCodes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFCodeCreateDate(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFCodeCreateTime(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFCodeCurrentDate(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFCodeCurrentTime(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visFCodeEditDate(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFCodeEditTime(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visFCodePrintDate(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visFCodePrintTime(7),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFCodeCreator(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFCodeDescription(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFCodeDirectory(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFCodeFileName(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visFCodeKeyWords(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFCodeSubject(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visFCodeTitle(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visFCodeManager(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visFCodeCompany(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visFCodeCategory(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visFCodeHyperlinkBase(10),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFCodeWidth(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFCodeHeight(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFCodeAngle(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFCodeData1(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFCodeData2(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFCodeData3(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFCodeObjectID(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visFCodeMasterName(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFCodeObjectName(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visFCodeObjectType(6),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFCodeBackgroundName(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFCodePageName(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFCodeNumberOfPages(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFCodePageNumber(3),
  ;

  private  int value;
  tagVisFieldCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

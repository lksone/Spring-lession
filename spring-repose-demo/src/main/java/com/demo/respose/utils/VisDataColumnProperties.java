package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisDataColumnProperties implements ComEnum {
  /**
   * <p>
   * The Type property of the DataColumn.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDataColumnPropertyType(1),
  /**
   * <p>
   * The Language ID property of the DataColumn.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDataColumnPropertyLangID(2),
  /**
   * <p>
   * The Calendar property of the DataColumn.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visDataColumnPropertyCalendar(3),
  /**
   * <p>
   * The Units property of the DataColumn.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDataColumnPropertyUnits(4),
  /**
   * <p>
   * The Currency property of the DataColumn.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visDataColumnPropertyCurrency(5),
  /**
   * <p>
   * The Display Name property of the DataColumn.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visDataColumnPropertyDisplayName(6),
  /**
   * <p>
   * The Visible property of the DataColumn.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visDataColumnPropertyVisible(7),
  /**
   * <p>
   * The Hyperlink property for the DataColumn. Determines if hyperlink is created for the column on link.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDataColumnPropertyHyperlink(8),
  ;

  private  int value;
  VisDataColumnProperties(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

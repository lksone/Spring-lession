package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values returned by Selection.ItemStatus.
 * </p>
 */
public enum tagVisSelectItemStatus implements ComEnum {
  /**
   * <p>
   * Item(i) is the primary selected item.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSelIsPrimaryItem(1),
  /**
   * <p>
   * Item(i) is a sub-selection.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSelIsSubItem(2),
  /**
   * <p>
   * Item(i) has sub-selected items.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSelIsSuperItem(4),
  ;

  private  int value;
  tagVisSelectItemStatus(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

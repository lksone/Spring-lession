package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Values passed to CreateSelection method when selecting by visSelTypeByType.
 * </p>
 */
public enum VisTypeSelectionTypes implements ComEnum {
  /**
   * <p>
   * Shape that contains shapes.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTypeSelGroup(1),
  /**
   * <p>
   * Native Visio shape.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTypeSelShape(2),
  /**
   * <p>
   * Shape that is a guide.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visTypeSelGuide(4),
  /**
   * <p>
   * Shape that is metafile.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visTypeSelMetafile(8),
  /**
   * <p>
   * Shape that is bitmap.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visTypeSelBitmap(16),
  /**
   * <p>
   * Shape that is ink.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visTypeSelInk(32),
  /**
   * <p>
   * Shape that is link, embed or control.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visTypeSelOLE(64),
  ;

  private  int value;
  VisTypeSelectionTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

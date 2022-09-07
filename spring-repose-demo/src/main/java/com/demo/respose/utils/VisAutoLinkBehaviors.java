package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisAutoLinkBehaviors implements ComEnum {
  /**
   * <p>
   * Link Selected Shapes only; do not walk into sub-shapes of selected shapes
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visAutoLinkSelectedShapesOnly(1),
  /**
   * <p>
   * Show progress bar without link details during Automatic linking
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visAutoLinkGenericProgressBar(2),
  /**
   * <p>
   * Do not apply default Data Graphic to shapes linked during Automatic linking
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visAutoLinkNoApplyDataGraphic(4),
  /**
   * <p>
   * Replace existing links during Automatic linking
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visAutoLinkReplaceExistingLinks(8),
  /**
   * <p>
   * Do not replace existing links during Automatic linking
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visAutoLinkDontReplaceExistingLinks(16),
  /**
   * <p>
   * Allow Null database values to match to "No Formula" in Visio ShapeSheet
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visAutoLinkNullMatchesNoFormula(32),
  /**
   * <p>
   * Include hidden shape data (custom property) rows in comparison testing, only used when field type is visAutoLinkCustPropsLabel
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visAutoLinkIncludeHiddenProps(64),
  ;

  private  int value;
  VisAutoLinkBehaviors(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

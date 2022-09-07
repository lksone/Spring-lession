package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to be passed to Cut, Copy or Paste.
 * </p>
 */
public enum tagVisCutCopyPasteCodes implements ComEnum {
  /**
   * <p>
   * Causes Cut/Copy/Paste methods to behave same as UI.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCopyPasteNormal(0),
  /**
   * <p>
   * Causes Cut/Copy/Paste methods to preserve shape locations.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCopyPasteNoTranslate(1),
  /**
   * <p>
   * Causes Cut/Copy/Paste methods to paste to the center of the page view on paste.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCopyPasteCenter(2),
  /**
   * <p>
   * Causes Cut method to not perform connector heal behavior during cut action
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCopyPasteNoHealConnectors(4),
  /**
   * <p>
   * Causes Cut/Copy method to not include unselected members of containers or list
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCopyPasteNoContainerMembers(8),
  /**
   * <p>
   * Causes Cut/Copy method to not include unselected callouts associated with selected shapes
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visCopyPasteNoAssociatedCallouts(16),
  /**
   * <p>
   * Causes Paste method to not add pasted shape to any containers
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visCopyPasteDontAddToContainers(32),
  /**
   * <p>
   * Causes Copy method to not offset shapes on copy.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visCopyPasteNoCascade(64),
  ;

  private  int value;
  tagVisCutCopyPasteCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

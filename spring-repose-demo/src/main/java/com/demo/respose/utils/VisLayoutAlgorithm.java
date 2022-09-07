package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisLayoutAlgorithm implements ComEnum {
  /**
   * <p>
   * Default layout settings of page
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPageDefault(1),
  /**
   * <p>
   * Flowchart - top to bottom
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFlowchartTopToBottom(2),
  /**
   * <p>
   * Flowchart - left to right
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFlowchartLeftToRight(3),
  /**
   * <p>
   * Layout radially
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visRadial(4),
  /**
   * <p>
   * Flowchart - bottom to top
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFlowchartBottomToTop(5),
  /**
   * <p>
   * Flowchart - right to left
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visFlowchartRightToLeft(6),
  /**
   * <p>
   * Layout circularly
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visCircular(7),
  /**
   * <p>
   * Wide tree down right
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visWideTreeDownRight(8),
  /**
   * <p>
   * Wide tree right down
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visWideTreeRightDown(9),
  /**
   * <p>
   * Wide tree right up
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visWideTreeRightUp(10),
  /**
   * <p>
   * Wide tree up right
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visWideTreeUpRight(11),
  /**
   * <p>
   * Wide tree up left
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visWideTreeUpLeft(12),
  /**
   * <p>
   * Wide tree left up
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visWideTreeLeftUp(13),
  /**
   * <p>
   * Wide tree left down
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visWideTreeLeftDown(14),
  /**
   * <p>
   * Wide tree down left
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visWideTreeDownLeft(15),
  /**
   * <p>
   * Default settings of parent
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visParentDefault(16),
  /**
   * <p>
   * Hierarchy - top to bottom left
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visHierarchyTopToBottomLeft(17),
  /**
   * <p>
   * Hierarchy - top to bottom center
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visHierarchyTopToBottomCenter(18),
  /**
   * <p>
   * Hierarchy - top to bottom right
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visHierarchyTopToBottomRight(19),
  /**
   * <p>
   * Hierarchy - bottom to top left
   * </p>
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visHierarchyBottomToTopLeft(20),
  /**
   * <p>
   * Hierarchy - bottom to top center
   * </p>
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visHierarchyBottomToTopCenter(21),
  /**
   * <p>
   * Hierarchy - bottom to top right
   * </p>
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visHierarchyBottomToTopRight(22),
  /**
   * <p>
   * Hierarchy - left to right top
   * </p>
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visHierarchyLeftToRightTop(23),
  /**
   * <p>
   * Hierarchy - left to right middle
   * </p>
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visHierarchyLeftToRightMiddle(24),
  /**
   * <p>
   * Hierarchy - left to right bottom
   * </p>
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visHierarchyLeftToRightBottom(25),
  /**
   * <p>
   * Hierarchy - right to left top
   * </p>
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visHierarchyRightToLeftTop(26),
  /**
   * <p>
   * Hierarchy - right to left middle
   * </p>
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visHierarchyRightToLeftMiddle(27),
  /**
   * <p>
   * Hierarchy - right to left bottom
   * </p>
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visHierarchyRightToLeftBottom(28),
  ;

  private  int value;
  VisLayoutAlgorithm(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

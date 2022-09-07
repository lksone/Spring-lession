package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Type and id codes returned by Window.Type, SubType and ID.
 * </p>
 */
public enum tagVisWinTypes implements ComEnum {
  /**
   * <p>
   * The window's type is not known to Visio.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visWinOther(0),
  /**
   * <p>
   * The window is a drawing window. Use subtype to determine what kind of drawing window.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDrawing(1),
  /**
   * <p>
   * The window is a stencil window.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visStencil(2),
  /**
   * <p>
   * The window is a sheet window.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSheet(3),
  /**
   * <p>
   * The window is an icon window.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visIcon(4),
  /**
   * <p>
   * The window is the application window.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visApplication(5),
  /**
   * <p>
   * A built in anchor bar in a drawing window. Use ID to determine what kind of anchor bar.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visAnchorBarBuiltIn(6),
  /**
   * <p>
   * A stencil window docked in a drawing window.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visDockedStencilBuiltIn(7),
  /**
   * <p>
   * An Add-on window with drawing window behavior.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDrawingAddon(8),
  /**
   * <p>
   * An Add-on window with stencil window behavior.
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visStencilAddon(9),
  /**
   * <p>
   * An Add-on window with anchor bar behavior.
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visAnchorBarAddon(10),
  /**
   * <p>
   * An Add-on window with docked stencil behavior.
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visDockedStencilAddon(11),
  /**
   * <p>
   * Returned by Window.SubType if type is visDrawing and window is showing a page.
   * </p>
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visPageWin(128),
  /**
   * <p>
   * Returned by Window.SubType if type is visDrawing and window is showing a group of a page.
   * </p>
   * <p>
   * The value of this constant is 160
   * </p>
   */
  visPageGroupWin(160),
  /**
   * <p>
   * Returned by Window.SubType if type is visDrawing and window is showing a master.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visMasterWin(64),
  /**
   * <p>
   * Returned by Window.SubType if type is visDrawing and window is showing a group of a master.
   * </p>
   * <p>
   * The value of this constant is 96
   * </p>
   */
  visMasterGroupWin(96),
  /**
   * <p>
   * The value Window.ID returns if it has no ID.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visInvalWinID(-1),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is custom properties window.
   * </p>
   * <p>
   * The value of this constant is 1658
   * </p>
   */
  visWinIDCustProp(1658),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is pan/zoom window.
   * </p>
   * <p>
   * The value of this constant is 1653
   * </p>
   */
  visWinIDPanZoom(1653),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is size and position window.
   * </p>
   * <p>
   * The value of this constant is 1670
   * </p>
   */
  visWinIDSizePos(1670),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is drawing explorer window.
   * </p>
   * <p>
   * The value of this constant is 1721
   * </p>
   */
  visWinIDDrawingExplorer(1721),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is ShapeSheet formula tracing window.
   * </p>
   * <p>
   * The value of this constant is 1781
   * </p>
   */
  visWinIDFormulaTracing(1781),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is drawing explorer window in MDI stencil window.
   * </p>
   * <p>
   * The value of this constant is 1796
   * </p>
   */
  visWinIDStencilExplorer(1796),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is master explorer window in master edit window.
   * </p>
   * <p>
   * The value of this constant is 1916
   * </p>
   */
  visWinIDMasterExplorer(1916),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is shape search window.
   * </p>
   * <p>
   * The value of this constant is 1669
   * </p>
   */
  visWinIDShapeSearch(1669),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is data explorer window.
   * </p>
   * <p>
   * The value of this constant is 2044
   * </p>
   */
  visWinIDExternalData(2044),
  /**
   * <p>
   * Returned by Window.ID if Type is visAnchorBarBuiltIn and window is validation issues window.
   * </p>
   * <p>
   * The value of this constant is 2263
   * </p>
   */
  visWinIDValidationIssues(2263),
  ;

  private  int value;
  tagVisWinTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

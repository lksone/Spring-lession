package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * UI Object Set identifiers.
 * </p>
 */
public enum tagVisUIObjSets implements ComEnum {
  /**
   * <p>
   * Obsolete as of Visio 2000. Use visUIObjSetDrawing in lieu.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visUIObjSetNoDocument(1),
  /**
   * <p>
   * Menus and toolbars when active window is Drawing window
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visUIObjSetDrawing(2),
  /**
   * <p>
   * Menus and toolbars when active window is Stencil window
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visUIObjSetStencil(3),
  /**
   * <p>
   * Menus and toolbars when active window is ShapeSheet window
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visUIObjSetShapeSheet(4),
  /**
   * <p>
   * Menus and toolbars when active window is Icon Editor window
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visUIObjSetIcon(5),
  /**
   * <p>
   * Use only for accelerators when Visio is running in-place.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visUIObjSetInPlace(6),
  /**
   * <p>
   * Menus and toolbars when Visio is in Print Preview mode
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visUIObjSetPrintPreview(7),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visUIObjSetText(8),
  /**
   * <p>
   * Context menu: Visio shape
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visUIObjSetCntx_DrawObjSel(9),
  /**
   * <p>
   * Context menu: Foreign shape
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visUIObjSetCntx_DrawOleObjSel(10),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visUIObjSetCntx_DrawNoObjSel(11),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visUIObjSetCntx_InPlaceNoObj(12),
  /**
   * <p>
   * Context menu: Editing text
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visUIObjSetCntx_TextEdit(13),
  /**
   * <p>
   * Same as visUIObjSetCntx_Master
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visUIObjSetCntx_StencilRO(14),
  /**
   * <p>
   * Context menu: ShapeSheet window
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visUIObjSetCntx_ShapeSheet(15),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visUIObjSetCntx_Toolbar(16),
  /**
   * <p>
   * Context menu: Full Screen mode
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visUIObjSetCntx_FullScreen(17),
  /**
   * <p>
   * Same as visUIObjSetActiveXDoc.
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visUIObjSetBinderInPlace(18),
  /**
   * <p>
   * Use only for accelerators when Visio is running as an ActiveX document.
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visUIObjSetActiveXDoc(18),
  /**
   * <p>
   * Do not use.
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visUIObjSetCntx_Debug(19),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visUIObjSetCntx_StencilRW(20),
  /**
   * <p>
   * Same as visUIObjSetCntx_Stencil
   * </p>
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visUIObjSetCntx_StencilDocked(21),
  /**
   * <p>
   * Use only for accelerators when an object is active in Visio.
   * </p>
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visUIObjSetHostingInPlace(22),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visUIObjSetCntx_Hyperlink(23),
  /**
   * <p>
   * Toolbar palette: Line color
   * </p>
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visUIObjSetPal_LineColors(24),
  /**
   * <p>
   * Toolbar palette: Line weight
   * </p>
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visUIObjSetPal_LineWeights(25),
  /**
   * <p>
   * Toolbar palette: Line pattern
   * </p>
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visUIObjSetPal_LinePatterns(26),
  /**
   * <p>
   * Toolbar palette: Fill color
   * </p>
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visUIObjSetPal_FillColors(27),
  /**
   * <p>
   * Toolbar palette: Fill pattern
   * </p>
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visUIObjSetPal_FillPatterns(28),
  /**
   * <p>
   * Toolbar palette: Text color
   * </p>
   * <p>
   * The value of this constant is 29
   * </p>
   */
  visUIObjSetPal_TextColors(29),
  /**
   * <p>
   * Toolbar palette: Align shapes
   * </p>
   * <p>
   * The value of this constant is 30
   * </p>
   */
  visUIObjSetPal_AlignShapes(30),
  /**
   * <p>
   * Toolbar palette: Distribute shapes
   * </p>
   * <p>
   * The value of this constant is 31
   * </p>
   */
  visUIObjSetPal_DistributeShapes(31),
  /**
   * <p>
   * Toolbar palette: Shadow color
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visUIObjSetPal_Shadow(32),
  /**
   * <p>
   * Toolbar palette: Line end
   * </p>
   * <p>
   * The value of this constant is 33
   * </p>
   */
  visUIObjSetPal_LineEnds(33),
  /**
   * <p>
   * Toolbar palette: Corner rounding
   * </p>
   * <p>
   * The value of this constant is 34
   * </p>
   */
  visUIObjSetPal_CornerRounding(34),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 35
   * </p>
   */
  visUIObjSetCntx_ToolbarInPlace(35),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 36
   * </p>
   */
  visUIObjSetCntx_ToolbarHostingInPlace(36),
  /**
   * <p>
   * Toolbar palette: Rectangle and ellipse drawing tools
   * </p>
   * <p>
   * The value of this constant is 37
   * </p>
   */
  visUIObjSetPal_Rectangle_Tool(37),
  /**
   * <p>
   * Toolbar palette: Add line jumps to
   * </p>
   * <p>
   * The value of this constant is 38
   * </p>
   */
  visUIObjSetPopup_LineJumpCode(38),
  /**
   * <p>
   * Toolbar palette: Line jump style
   * </p>
   * <p>
   * The value of this constant is 39
   * </p>
   */
  visUIObjSetPopup_LineJumpStyle(39),
  /**
   * <p>
   * Toolbar palette: Connector, Connection point and Stamp drawing tools
   * </p>
   * <p>
   * The value of this constant is 40
   * </p>
   */
  visUIObjSetPal_ConnectorTool(40),
  /**
   * <p>
   * Toolbar palette: Text and text block drawing tools
   * </p>
   * <p>
   * The value of this constant is 41
   * </p>
   */
  visUIObjSetPal_TextTool(41),
  /**
   * <p>
   * Toolbar palette: Line, Arc, Pencil and Freehand drawing tools
   * </p>
   * <p>
   * The value of this constant is 42
   * </p>
   */
  visUIObjSetPal_LineTool(42),
  /**
   * <p>
   * Toolbar palette: Rotation and crop tools
   * </p>
   * <p>
   * The value of this constant is 43
   * </p>
   */
  visUIObjSetPal_RotationTool(43),
  /**
   * <p>
   * Context menu: Connection point
   * </p>
   * <p>
   * The value of this constant is 44
   * </p>
   */
  visUIObjSetCntx_ConnectPtType(44),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 45
   * </p>
   */
  visUIObjSetPal_Undo(45),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 46
   * </p>
   */
  visUIObjSetPal_Redo(46),
  /**
   * <p>
   * Context menu: Page tab
   * </p>
   * <p>
   * The value of this constant is 47
   * </p>
   */
  visUIObjSetCntx_PageTabs(47),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 48
   * </p>
   */
  visUIObjSetPal_ShapeExt(48),
  /**
   * <p>
   * Context menu: Drawing Explorer, root item
   * </p>
   * <p>
   * The value of this constant is 49
   * </p>
   */
  visUIObjSetCntx_DEDocument(49),
  /**
   * <p>
   * Context menu: Drawing Explorer, Pages folder
   * </p>
   * <p>
   * The value of this constant is 50
   * </p>
   */
  visUIObjSetCntx_DEPages(50),
  /**
   * <p>
   * Context menu: Drawing Explorer, Page item
   * </p>
   * <p>
   * The value of this constant is 51
   * </p>
   */
  visUIObjSetCntx_DEPage(51),
  /**
   * <p>
   * Context menu: Drawing Explorer, Shapes folder
   * </p>
   * <p>
   * The value of this constant is 52
   * </p>
   */
  visUIObjSetCntx_DEShapes(52),
  /**
   * <p>
   * Context menu: Drawing Explorer, Shape item
   * </p>
   * <p>
   * The value of this constant is 53
   * </p>
   */
  visUIObjSetCntx_DEShape(53),
  /**
   * <p>
   * Context menu: Drawing Explorer, Layers folder
   * </p>
   * <p>
   * The value of this constant is 54
   * </p>
   */
  visUIObjSetCntx_DELayers(54),
  /**
   * <p>
   * Context menu: Drawing Explorer, Layer item
   * </p>
   * <p>
   * The value of this constant is 55
   * </p>
   */
  visUIObjSetCntx_DELayer(55),
  /**
   * <p>
   * Context menu: Drawing Explorer, Styles folder
   * </p>
   * <p>
   * The value of this constant is 56
   * </p>
   */
  visUIObjSetCntx_DEStyles(56),
  /**
   * <p>
   * Context menu: Drawing Explorer, Style item
   * </p>
   * <p>
   * The value of this constant is 57
   * </p>
   */
  visUIObjSetCntx_DEStyle(57),
  /**
   * <p>
   * Context menu: Drawing Explorer, Masters folder
   * </p>
   * <p>
   * The value of this constant is 58
   * </p>
   */
  visUIObjSetCntx_DEMasters(58),
  /**
   * <p>
   * Context menu: Drawing Explorer, Master item
   * </p>
   * <p>
   * The value of this constant is 59
   * </p>
   */
  visUIObjSetCntx_DEMaster(59),
  /**
   * <p>
   * Context menu: Drawing Explorer, Patterns folder
   * </p>
   * <p>
   * The value of this constant is 60
   * </p>
   */
  visUIObjSetCntx_DEPatterns(60),
  /**
   * <p>
   * Context menu: Anchored windows
   * </p>
   * <p>
   * The value of this constant is 61
   * </p>
   */
  visUIObjSetCntx_AnchorBar_Base(61),
  /**
   * <p>
   * Context menu: Custom properties window
   * </p>
   * <p>
   * The value of this constant is 62
   * </p>
   */
  visUIObjSetCntx_AnchorBar_CustProp(62),
  /**
   * <p>
   * Context menu: Size & Position window
   * </p>
   * <p>
   * The value of this constant is 63
   * </p>
   */
  visUIObjSetCntx_AnchorBar_SizePos(63),
  /**
   * <p>
   * Context menu: Master
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visUIObjSetCntx_Master(14),
  /**
   * <p>
   * Context menu: Stencil window
   * </p>
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visUIObjSetCntx_Stencil(21),
  /**
   * <p>
   * Built-in commands available through the Customize dialog.
   * </p>
   * <p>
   * The value of this constant is 1000
   * </p>
   */
  visUIObjSetCntx_AddCommands(1000),
  /**
   * <p>
   * Built-in menus available through the Customize dialog.
   * </p>
   * <p>
   * The value of this constant is 1010
   * </p>
   */
  visUIObjSetCntx_BuiltinMenus(1010),
  /**
   * <p>
   * Reserved.
   * </p>
   * <p>
   * The value of this constant is 1011
   * </p>
   */
  visUIObjSetCntx_ShortcutMenus(1011),
  /**
   * <p>
   * Context menu: Master Explorer, root item
   * </p>
   * <p>
   * The value of this constant is 66
   * </p>
   */
  visUIObjSetCntx_MEDocument(66),
  /**
   * <p>
   * Context menu: Master Explorer, Masters folder
   * </p>
   * <p>
   * The value of this constant is 67
   * </p>
   */
  visUIObjSetCntx_MEMasters(67),
  /**
   * <p>
   * Context menu: Comment Marker
   * </p>
   * <p>
   * The value of this constant is 68
   * </p>
   */
  visUIObjSetCntx_CommentMarker(68),
  /**
   * <p>
   * Context menu: Shapes window
   * </p>
   * <p>
   * The value of this constant is 69
   * </p>
   */
  visUIObjSetCntx_AnchorBar_Shapes(69),
  /**
   * <p>
   * Context menu: Data Explorer Tabs
   * </p>
   * <p>
   * The value of this constant is 70
   * </p>
   */
  visUIObjSetCntx_DataExplorerTabs(70),
  /**
   * <p>
   * Context menu: Data Explorer List
   * </p>
   * <p>
   * The value of this constant is 71
   * </p>
   */
  visUIObjSetCntx_DataExplorerList(71),
  /**
   * <p>
   * Context menu: Page Tab Navigation
   * </p>
   * <p>
   * The value of this constant is 74
   * </p>
   */
  visUIObjSetCntx_PageTabNavigation(74),
  /**
   * <p>
   * Context menu: Page in Drawing Window, no shape selected
   * </p>
   * <p>
   * The value of this constant is 75
   * </p>
   */
  visUIObjSetCntx_Page(75),
  /**
   * <p>
   * Context menu: Issues window
   * </p>
   * <p>
   * The value of this constant is 76
   * </p>
   */
  visUIObjSetCntx_Issues(76),
  ;

  private  int value;
  tagVisUIObjSets(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

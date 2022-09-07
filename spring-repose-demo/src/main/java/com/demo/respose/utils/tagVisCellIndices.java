package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Logical indices of cells in rows of shape or style objects.
 * </p>
 */
public enum tagVisCellIndices implements ComEnum {
  /**
   * <p>
   * An index no cell will ever have.
   * </p>
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visCellInval(255),
  /**
   * <p>
   * Cell logically at or before every other cell in a row.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCellFirst(0),
  /**
   * <p>
   * Connotes unspecified cell.
   * </p>
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visCellNone(255),
  /**
   * <p>
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormPinX  name:PinX|TxtPinX
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visXFormPinX(0),
  /**
   * <p>
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormPinY  name:PinY|TxtPinY
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visXFormPinY(1),
  /**
   * <p>
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormWidth  name:Width|TxtWidth
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visXFormWidth(2),
  /**
   * <p>
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormHeight  name:Height|TxtHeight
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visXFormHeight(3),
  /**
   * <p>
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormLocPinX  name:LocPinX|TxtLocPinX
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visXFormLocPinX(4),
  /**
   * <p>
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormLocPinX  name:LocPinY|TxtLocPinY
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visXFormLocPinY(5),
  /**
   * <p>
   * visSectionObject,visRowXFormOut|visRowTextXForm,visXFormAngle  name:Angle|TxtAngle
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visXFormAngle(6),
  /**
   * <p>
   * visSectionObject,visRowXFormOut,visXFormFlipX  name:FlipX
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visXFormFlipX(7),
  /**
   * <p>
   * visSectionObject,visRowXFormOut,visXFormFlipY  name:FlipY
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visXFormFlipY(8),
  /**
   * <p>
   * visSectionObject,visRowXFormOut,visXFormResizeMode  name:ResizeMode
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visXFormResizeMode(9),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineWeight  name:LineWeight
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLineWeight(0),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineColor  name:LineColor
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLineColor(1),
  /**
   * <p>
   * visSectionObject,visRowLine,visLinePattern  name:LinePattern
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLinePattern(2),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineRounding  name:Rounding
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visLineRounding(3),
  /**
   * <p>
   * Synonym of visLineEndArrowSize
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLineArrowSize(4),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineEndArrowSize  name:EndArrowSize
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLineEndArrowSize(4),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineBeginArrow  name:BeginArrow
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visLineBeginArrow(5),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineEndArrow  name:EndArrow
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visLineEndArrow(6),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineEndCap  name:LineCap
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visLineEndCap(7),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineBeginArrowSize  name:BeginArrowSize
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLineBeginArrowSize(8),
  /**
   * <p>
   * visSectionObject,visRowLine,visLineColorTrans  name:LineColorTrans
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visLineColorTrans(9),
  /**
   * <p>
   * visSectionObject,visRowLine,visCompoundType  name:CompoundType
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visCompoundType(10),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillForegnd  name:FillForegnd
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFillForegnd(0),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillBkgnd  name:FillBkgnd
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFillBkgnd(1),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillPattern  name:FillPattern
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFillPattern(2),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwForegnd  name:ShdwForegnd
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFillShdwForegnd(3),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwBkgnd  name:ShdwBkgnd
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visFillShdwBkgnd(4),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwPattern  name:ShdwPattern
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFillShdwPattern(5),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillForegndTrans  name:FillForegndTrans
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visFillForegndTrans(6),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillBkgndTrans  name:FillBkgndTrans
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visFillBkgndTrans(7),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwForegndTrans  name:ShdwForegndTrans
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visFillShdwForegndTrans(8),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwBkgndTrans  name:ShdwBkgndTrans
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visFillShdwBkgndTrans(9),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwType  name:ShdwType
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visFillShdwType(10),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwOffsetX  name:ShdwOffsetX
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visFillShdwOffsetX(11),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwOffsetY  name:ShdwOffsetY
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visFillShdwOffsetY(12),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwObliqueAngle  name:ShdwObliqueAngle
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visFillShdwObliqueAngle(13),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwScaleFactor  name:ShdwScaleFactor
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visFillShdwScaleFactor(14),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwBlur  name:ShdwBlur
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visFillShdwBlur(15),
  /**
   * <p>
   * visSectionObject,visRowFill,visFillShdwShow  name:ShdwShow
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visFillShdwShow(16),
  /**
   * <p>
   * visSectionObject,visRowXForm1D,vis1DBeginX  name:BeginX
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  vis1DBeginX(0),
  /**
   * <p>
   * visSectionObject,visRowXForm1D,vis1DBeginY  name:BeginY
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  vis1DBeginY(1),
  /**
   * <p>
   * visSectionObject,visRowXForm1D,vis1DEndX  name:EndX
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  vis1DEndX(2),
  /**
   * <p>
   * visSectionObject,visRowXForm1D,vis1DEndY  name:EndY
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  vis1DEndY(3),
  /**
   * <p>
   * For internal use only.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visEvtCellTheData(0),
  /**
   * <p>
   * visSectionObject,visRowEvent,visEvtCellTheText  name:TheText
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visEvtCellTheText(1),
  /**
   * <p>
   * visSectionObject,visRowEvent,visEvtCellDblClick  name:EventDblClick
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visEvtCellDblClick(2),
  /**
   * <p>
   * visSectionObject,visRowEvent,visEvtCellXFMod  name:EventXFMod
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visEvtCellXFMod(3),
  /**
   * <p>
   * visSectionObject,visRowEvent,visEvtCellDrop  name:EventDrop
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visEvtCellDrop(4),
  /**
   * <p>
   * visSectionObject,visRowLayerMem,visLayerMember  name:LayerMember
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLayerMember(0),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGuideFlags(2),
  /**
   * <p>
   * visSectionObject,visRowStyle,visStyleIncludesLine  name:EnableLineProps
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visStyleIncludesLine(0),
  /**
   * <p>
   * visSectionObject,visRowStyle,visStyleIncludesFill  name:EnableFillProps
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visStyleIncludesFill(1),
  /**
   * <p>
   * visSectionObject,visRowStyle,visStyleIncludesText  name:EnableTextProps
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visStyleIncludesText(2),
  /**
   * <p>
   * visSectionObject,visRowStyle,visStyleHidden  name:HideForApply
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visStyleHidden(3),
  /**
   * <p>
   * visSectionObject,visRowForeign,visFrgnImgOffsetX  name:ImgOffsetX
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFrgnImgOffsetX(0),
  /**
   * <p>
   * visSectionObject,visRowForeign,visFrgnImgOffsetY  name:ImgOffsetY
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFrgnImgOffsetY(1),
  /**
   * <p>
   * visSectionObject,visRowForeign,visFrgnImgWidth  name:ImgWidth
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFrgnImgWidth(2),
  /**
   * <p>
   * visSectionObject,visRowForeign,visFrgnImgHeight  name:ImgHeight
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFrgnImgHeight(3),
  /**
   * <p>
   * visSectionObject,visRowForeign,visFrgnImgClippingPath  name:ClippingPath
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visFrgnImgClippingPath(4),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageWidth  name:PageWidth
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPageWidth(0),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageHeight  name:PageHeight
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPageHeight(1),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageShdwOffsetX  name:ShdwOffsetX
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPageShdwOffsetX(2),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageShdwOffsetY  name:ShdwOffsetY
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPageShdwOffsetY(3),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageScale  name:PageScale
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPageScale(4),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageDrawingScale  name:DrawingScale
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visPageDrawingScale(5),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageDrawSizeType  name:DrawingSizeType
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visPageDrawSizeType(6),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageDrawScaleType  name:DrawingScaleType
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visPageDrawScaleType(7),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageInhibitSnap  name:InhibitSnap
   * </p>
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visPageInhibitSnap(26),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageLockReplace  name:PageLockReplace
   * </p>
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visPageLockReplace(27),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageLockDuplicate  name:PageLockDuplicate
   * </p>
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visPageLockDuplicate(28),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageUIVisibility  name:UIVisibility
   * </p>
   * <p>
   * The value of this constant is 34
   * </p>
   */
  visPageUIVisibility(34),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageShdwType  name:ShdwType
   * </p>
   * <p>
   * The value of this constant is 35
   * </p>
   */
  visPageShdwType(35),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageShdwObliqueAngle  name:ShdwObliqueAngle
   * </p>
   * <p>
   * The value of this constant is 36
   * </p>
   */
  visPageShdwObliqueAngle(36),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageShdwScaleFactor  name:ShdwScaleFactor
   * </p>
   * <p>
   * The value of this constant is 37
   * </p>
   */
  visPageShdwScaleFactor(37),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageDrawResizeType  name:DrawingResizeType
   * </p>
   * <p>
   * The value of this constant is 38
   * </p>
   */
  visPageDrawResizeType(38),
  /**
   * <p>
   * visSectionObject,visRowPage,visPageZOrderChanged  name:ZOrderChanged
   * </p>
   * <p>
   * The value of this constant is 39
   * </p>
   */
  visPageZOrderChanged(39),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkLeftMargin  name:LeftMargin
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTxtBlkLeftMargin(0),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkRightMargin  name:RightMargin
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTxtBlkRightMargin(1),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkTopMargin  name:TopMargin
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTxtBlkTopMargin(2),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkBottomMargin  name:BottomMargin
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visTxtBlkBottomMargin(3),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkVerticalAlign  name:VerticalAlign
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visTxtBlkVerticalAlign(4),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkBkgnd  name:TextBkgnd  (value is one greater than other color cells)
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visTxtBlkBkgnd(5),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkDefaultTabStop  name:DefaultTabStop
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visTxtBlkDefaultTabStop(6),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkDirection  name:TextDirection
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visTxtBlkDirection(10),
  /**
   * <p>
   * visSectionObject,visRowText,visTxtBlkBkgndTrans  name:TextBkgndTrans
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visTxtBlkBkgndTrans(11),
  /**
   * <p>
   * visSectionObject,visRowAlign,visAlignLeft  name:AlignLeft
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visAlignLeft(0),
  /**
   * <p>
   * visSectionObject,visRowAlign,visAlignCenter  name:AlignCenter
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visAlignCenter(1),
  /**
   * <p>
   * visSectionObject,visRowAlign,visAlignRight  name:AlignRight
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visAlignRight(2),
  /**
   * <p>
   * visSectionObject,visRowAlign,visAlignTop  name:AlignTop
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visAlignTop(3),
  /**
   * <p>
   * visSectionObject,visRowAlign,visAlignMiddle  name:AlignMiddle
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visAlignMiddle(4),
  /**
   * <p>
   * visSectionObject,visRowAlign,visAlignBottom  name:AlignBottom
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visAlignBottom(5),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockWidth  name:LockWidth
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLockWidth(0),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockHeight  name:LockHeight
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLockHeight(1),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockMoveX  name:LockMoveX
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLockMoveX(2),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockMoveY  name:LockMoveY
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visLockMoveY(3),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockAspect  name:LockAspect
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLockAspect(4),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockDelete  name:LockDelete
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visLockDelete(5),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockBegin  name:LockBegin
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visLockBegin(6),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockEnd  name:LockEnd
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visLockEnd(7),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockRotate  name:LockRotate
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLockRotate(8),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockCrop  name:LockCrop
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visLockCrop(9),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockVtxEdit  name:LockVtxEdit
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visLockVtxEdit(10),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockTextEdit  name:LockTextEdit
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visLockTextEdit(11),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockFormat  name:LockFormat
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visLockFormat(12),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockGroup  name:LockGroup
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visLockGroup(13),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockCalcWH  name:LockCalcWH
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visLockCalcWH(14),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockSelect  name:LockSelect
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visLockSelect(15),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockCustProp  name:LockCustProp
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visLockCustProp(16),
  /**
   * <p>
   * visSectionObject,visRowHelpCopyright,visObjHelp  name:HelpTopic
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visObjHelp(0),
  /**
   * <p>
   * visSectionObject,visRowHelpCopyright,visCopyright  name:Copyright  [Write once cell.]
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCopyright(1),
  /**
   * <p>
   * visSectionObject,visRowMisc,visNoObjHandles  name:NoObjHandles
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visNoObjHandles(0),
  /**
   * <p>
   * visSectionObject,visRowMisc,visNonPrinting  name:NonPrinting
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visNonPrinting(1),
  /**
   * <p>
   * visSectionObject,visRowMisc,visNoCtlHandles  name:NoCtlHandles
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visNoCtlHandles(2),
  /**
   * <p>
   * visSectionObject,visRowMisc,visNoAlignBox  name:NoAlignBox
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visNoAlignBox(3),
  /**
   * <p>
   * visSectionObject,visRowMisc,visUpdateAlignBox  name:UpdateAlignBox
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visUpdateAlignBox(4),
  /**
   * <p>
   * visSectionObject,visRowMisc,visHideText  name:HideText
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visHideText(5),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Text direction now in cell visTxtBlkDirection of row visRowText.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visVerticalText(6),
  /**
   * <p>
   * visSectionObject,visRowMisc,visDynFeedback  name:DynFeedback
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDynFeedback(8),
  /**
   * <p>
   * visSectionObject,visRowMisc,visGlueType  name:GlueType
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visGlueType(9),
  /**
   * <p>
   * visSectionObject,visRowMisc,visWalkPref  name:WalkPreference
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visWalkPref(10),
  /**
   * <p>
   * visSectionObject,visRowMisc,visBegTrigger  name:BegTrigger
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visBegTrigger(11),
  /**
   * <p>
   * visSectionObject,visRowMisc,visEndTrigger  name:EndTrigger
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visEndTrigger(12),
  /**
   * <p>
   * visSectionObject,visRowMisc,visLOFlags  name:ObjType
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visLOFlags(13),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Replaced by cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visLOInteraction(14),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Replaced by cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visLOBehavior(15),
  /**
   * <p>
   * visSectionObject,visRowMisc,visComment  name:Comment
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visComment(16),
  /**
   * <p>
   * visSectionObject,visRowMisc,visDropSource  name:IsDropSource
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visDropSource(17),
  /**
   * <p>
   * visSectionObject,visRowMisc,visNoLiveDynamics  name:NoLiveDynamics
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visNoLiveDynamics(18),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjLocalizeMerge  name:LocalizeMerge
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visObjLocalizeMerge(19),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjNoProofing  name:NoProofing
   * </p>
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visObjNoProofing(20),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjCalendar  name:Calendar
   * </p>
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visObjCalendar(25),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjLangID  name:LangID
   * </p>
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visObjLangID(26),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjKeywords  name:Keywords
   * </p>
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visObjKeywords(27),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjDropOnPageScale  name:DropOnPageScale
   * </p>
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visObjDropOnPageScale(28),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjTheme  name:ThemeTrigger
   * </p>
   * <p>
   * The value of this constant is 29
   * </p>
   */
  visObjTheme(29),
  /**
   * <p>
   * visSectionObject,visRowMisc,visObjThemeModern  name:ThemeModernTrigger
   * </p>
   * <p>
   * The value of this constant is 30
   * </p>
   */
  visObjThemeModern(30),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visXRulerDensity  name:XRulerDensity
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visXRulerDensity(0),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visYRulerDensity  name:YRulerDensity
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visYRulerDensity(1),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visXRulerOrigin  name:XRulerOrigin
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visXRulerOrigin(4),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visYRulerOrigin  name:YRulerOrigin
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visYRulerOrigin(5),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visXGridDensity  name:XGridDensity
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visXGridDensity(6),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visYGridDensity  name:YGridDensity
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visYGridDensity(7),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visXGridSpacing  name:XGridSpacing
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visXGridSpacing(8),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visYGridSpacing  name:YGridSpacing
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visYGridSpacing(9),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visXGridOrigin  name:XGridOrigin
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visXGridOrigin(10),
  /**
   * <p>
   * visSectionObject,visRowRulerGrid,visYGridOrigin  name:YGridOrigin
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visYGridOrigin(11),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocOutputFormat  name:OutputFormat
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDocOutputFormat(0),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocLockPreview  name:LockPreview
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDocLockPreview(1),
  /**
   * <p>
   * Reserved for future use.   visSectionObject,visRowDoc,visDocMetric  name:Metric
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDocMetric(2),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocAddMarkup  name:AddMarkup
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visDocAddMarkup(3),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocViewMarkup  name:ViewMarkup
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDocViewMarkup(4),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocLockReplace  name:DocLockReplace
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visDocLockReplace(5),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocNoCoauth  name:NoCoauth
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visDocNoCoauth(6),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocLockDuplicatePage  name:DocLockDuplicatePage
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visDocLockDuplicatePage(7),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocPreviewQuality  name:PreviewQuality
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visDocPreviewQuality(9),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocPreviewScope  name:PreviewScope
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visDocPreviewScope(10),
  /**
   * <p>
   * visSectionObject,visRowDoc,visDocLangID  name:LangID
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visDocLangID(19),
  /**
   * <p>
   * visSectionObject,visRowImage,visImageGamma  name:Gamma
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visImageGamma(0),
  /**
   * <p>
   * visSectionObject,visRowImage,visImageContrast  name:Contrast
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visImageContrast(1),
  /**
   * <p>
   * visSectionObject,visRowImage,visImageBrightness  name:Brightness
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visImageBrightness(2),
  /**
   * <p>
   * visSectionObject,visRowImage,visImageSharpen  name:Sharpen
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visImageSharpen(3),
  /**
   * <p>
   * visSectionObject,visRowImage,visImageBlur  name:Blur
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visImageBlur(4),
  /**
   * <p>
   * visSectionObject,visRowImage,visImageDenoise  name:Denoise
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visImageDenoise(5),
  /**
   * <p>
   * visSectionObject,visRowImage,visImageTransparency  name:Transparency
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visImageTransparency(6),
  /**
   * <p>
   * visSectionObject,visRowGroup,visGroupSelectMode  name:SelectMode
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGroupSelectMode(0),
  /**
   * <p>
   * visSectionObject,visRowGroup,visGroupDisplayMode  name:DisplayMode
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGroupDisplayMode(1),
  /**
   * <p>
   * visSectionObject,visRowGroup,visGroupIsDropTarget  name:IsDropTarget
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGroupIsDropTarget(2),
  /**
   * <p>
   * visSectionObject,visRowGroup,visGroupIsSnapTarget  name:IsSnapTarget
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visGroupIsSnapTarget(3),
  /**
   * <p>
   * visSectionObject,visRowGroup,visGroupIsTextEditTarget  name:IsTextEditTarget
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGroupIsTextEditTarget(4),
  /**
   * <p>
   * visSectionObject,visRowGroup,visGroupDontMoveChildren  name:DontMoveChildren
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visGroupDontMoveChildren(5),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOPermX  name:ShapePermeableX
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSLOPermX(0),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOPermY  name:ShapePermeableY
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSLOPermY(1),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOPermeablePlace  name:ShapePermeablePlace
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSLOPermeablePlace(2),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLORelationships  name:Relationships
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSLORelationships(3),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOFixedCode  name:ShapeFixedCode
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSLOFixedCode(8),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOPlowCode  name:ShapePlowCode
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visSLOPlowCode(9),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLORouteStyle  name:ShapeRouteStyle
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visSLORouteStyle(10),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOPlaceStyle  name:ShapePlaceStyle
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visSLOPlaceStyle(11),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOConFixedCode  name:ConFixedCode
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visSLOConFixedCode(12),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOJumpCode  name:ConLineJumpCode
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visSLOJumpCode(13),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOJumpStyle  name:ConLineJumpStyle
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visSLOJumpStyle(14),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOJumpDirX  name:ConLineJumpDirX
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visSLOJumpDirX(16),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOJumpDirY  name:ConLineJumpDirY
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visSLOJumpDirY(17),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOPlaceFlip  name:ShapePlaceFlip
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visSLOPlaceFlip(18),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOLineRouteExt  name:ConLineRouteExt
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visSLOLineRouteExt(19),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOLineRouteExt  name:ShapeSplit
   * </p>
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visSLOSplit(20),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOLineRouteExt  name:ShapeSplittable
   * </p>
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visSLOSplittable(21),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLODisplayLevel  name:DisplayLevel
   * </p>
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visSLODisplayLevel(22),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLORelChanged  name:RelChanged
   * </p>
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visSLORelChanged(23),
  /**
   * <p>
   * visSectionObject,visRowShapeLayout,visSLOCategoryChanged  name:CategoryChanged
   * </p>
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visSLOCategoryChanged(24),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOResizePage  name:ResizePage
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOResizePage(0),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOEnableGrid  name:EnableGrid
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOEnableGrid(1),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLODynamicsOff  name:DynamicsOff
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPLODynamicsOff(2),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOCtrlAsInput  name:CtrlAsInput
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPLOCtrlAsInput(3),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOAvoidPageBreaks  name:AvoidPageBreaks
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPLOAvoidPageBreaks(4),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOPlaceStyle  name:PlaceStyle
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visPLOPlaceStyle(8),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLORouteStyle  name:RouteStyle
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visPLORouteStyle(9),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOPlaceDepth  name:PlaceDepth
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visPLOPlaceDepth(10),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOPlowCode  name:PlowCode
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visPLOPlowCode(11),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOJumpCode  name:LineJumpCode
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visPLOJumpCode(12),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOJumpStyle  name:LineJumpStyle
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visPLOJumpStyle(13),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOJumpDirX  name:PageLineJumpDirX
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visPLOJumpDirX(14),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOJumpDirY  name:PageLineJumpDirY
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visPLOJumpDirY(15),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOLineToNodeX  name:LineToNodeX
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visPLOLineToNodeX(16),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOLineToNodeY  name:LineToNodeY
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visPLOLineToNodeY(17),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOBlockSizeX  name:BlockSizeX
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visPLOBlockSizeX(18),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOBlockSizeY  name:BlockSizeY
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visPLOBlockSizeY(19),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOAvenueSizeX  name:AvenueSizeX
   * </p>
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visPLOAvenueSizeX(20),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOAvenueSizeY  name:AvenueSizeY
   * </p>
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visPLOAvenueSizeY(21),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOLineToLineX  name:LineToLineX
   * </p>
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visPLOLineToLineX(22),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOLineToLineY  name:LineToLineY
   * </p>
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visPLOLineToLineY(23),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOJumpFactorX  name:LineJumpFactorX
   * </p>
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visPLOJumpFactorX(24),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOJumpFactorY  name:LineJumpFactorY
   * </p>
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visPLOJumpFactorY(25),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOLineAdjustFrom  name:LineAdjustFrom
   * </p>
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visPLOLineAdjustFrom(26),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOLineAdjustTo  name:LineAdjustTo
   * </p>
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visPLOLineAdjustTo(27),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOPlaceFlip  name:PlaceFlip
   * </p>
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visPLOPlaceFlip(28),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOLineRouteExt  name:LineRouteExt
   * </p>
   * <p>
   * The value of this constant is 29
   * </p>
   */
  visPLOLineRouteExt(29),
  /**
   * <p>
   * visSectionObject,visRowPageLayout,visPLOSplit  name:ShapeSplit
   * </p>
   * <p>
   * The value of this constant is 30
   * </p>
   */
  visPLOSplit(30),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterFont  name:Char.Font[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCharacterFont(0),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterColor  name:Char.Color[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCharacterColor(1),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterStyle  name:Char.Style[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCharacterStyle(2),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterCase  name:Char.Case[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCharacterCase(3),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterPos  name:Char.Pos[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCharacterPos(4),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterFontScale  name:Char.FontScale[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCharacterFontScale(5),
  /**
   * <p>
   * Obsolete starting with Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visCharacterLocale(6),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterSize  name:Char.Size[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visCharacterSize(7),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterDblUnderline  name:Char.DblUnderline[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCharacterDblUnderline(8),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterOverline  name:Char.Overline[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visCharacterOverline(9),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterStrikethru  name:Char.Strikethru[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visCharacterStrikethru(10),
  /**
   * <p>
   * Obsolete starting with Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visCharacterPerpendicular(12),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterDoubleStrikethrough  name:Char.DoubleStrikethrough[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visCharacterDoubleStrikethrough(13),
  /**
   * <p>
   * Obsolete starting with Visio 2013
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visCharacterRTLText(14),
  /**
   * <p>
   * Obsolete starting with Visio 2013
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visCharacterUseVertical(15),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterLetterspace  name:Char.Letterspace[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visCharacterLetterspace(16),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterColorTrans  name:Char.ColorTrans[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visCharacterColorTrans(17),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterAsianFont  name:Char.AsianFont[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 51
   * </p>
   */
  visCharacterAsianFont(51),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterComplexScriptFont  name:Char.ComplexScriptFont[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 52
   * </p>
   */
  visCharacterComplexScriptFont(52),
  /**
   * <p>
   * Obsolete starting with Visio 2013
   * </p>
   * <p>
   * The value of this constant is 53
   * </p>
   */
  visCharacterLocalizeFont(53),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterComplexScriptSize  name:Char.ComplexScriptSize[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 54
   * </p>
   */
  visCharacterComplexScriptSize(54),
  /**
   * <p>
   * visSectionCharacter,visRowCharacter+(i-1),visCharacterLangID  name:Char.LangID[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 57
   * </p>
   */
  visCharacterLangID(57),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visIndentFirst  name:Para.IndFirst[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visIndentFirst(0),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visIndentLeft  name:Para.IndLeft[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visIndentLeft(1),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visIndentRight  name:Para.IndRight[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visIndentRight(2),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visSpaceLine  name:Para.SpLine[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSpaceLine(3),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visSpaceBefore  name:Para.SpBefore[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSpaceBefore(4),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visSpaceAfter  name:Para.SpAfter[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visSpaceAfter(5),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visHorzAlign  name:Para.HorzAlign[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visHorzAlign(6),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visBulletIndex  name:Para.Bullet[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visBulletIndex(7),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i-1),visBulletString  name:Para.BulletStr[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visBulletString(8),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i=1),visBulletFont  name:Para.BulletFont[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visBulletFont(9),
  /**
   * <p>
   * Obsolete starting with Visio 2013
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visLocalizeBulletFont(10),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i=1),visBulletFontSize  name:Para.BulletFontSize[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visBulletFontSize(11),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i=1),visTextPosAfterBullet  name:Para.TextPosAfterBullet[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visTextPosAfterBullet(12),
  /**
   * <p>
   * visSectionParagraph,visRowParagraph+(i=1),visFlags  name:Para.Flags[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visFlags(13),
  /**
   * <p>
   * visSectionTab,visRowTab+i,visTabStopCount  # of stops in row i, i>0.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTabStopCount(0),
  /**
   * <p>
   * visSectionTab,visRowTab+i  Position of stop j in row i is in cell ((j-1)*3)+visTabPos.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTabPos(1),
  /**
   * <p>
   * visSectionTab,visRowTab+i  Alignment of stop j in row i is in cell ((j-1)*3)+visTabAlign.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTabAlign(2),
  /**
   * <p>
   * visSectionScratch,visRowScratch+(i-1),visScratchX  name:Scratch.Xi i>0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visScratchX(0),
  /**
   * <p>
   * visSectionScratch,visRowScratch+(i-1),visScratchY  name:Scratch.Yi i>0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visScratchY(1),
  /**
   * <p>
   * visSectionScratch,visRowScratch+(i-1),visScratchA  name:Scratch.Ai i>0
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visScratchA(2),
  /**
   * <p>
   * visSectionScratch,visRowScratch+(i-1),visScratchB  name:Scratch.Bi i>0
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visScratchB(3),
  /**
   * <p>
   * visSectionScratch,visRowScratch+(i-1),visScratchC  name:Scratch.Ci i>0
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visScratchC(4),
  /**
   * <p>
   * visSectionScratch,visRowScratch+(i-1),visScratchD  name:Scratch.Di i>0
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visScratchD(5),
  /**
   * <p>
   * visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctX  name:Connections.Xi i>0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCnnctX(0),
  /**
   * <p>
   * visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctY  name:Connections.Yi i>0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCnnctY(1),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctDirX  name:Connections.DirX[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCnnctDirX(2),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctDirY  name:Connections.DirY[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCnnctDirY(3),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctType  name:Connections.Type[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCnnctType(4),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctAutoGen  name:Connections.AutoGen[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCnnctAutoGen(5),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctA  name:Connections.Ai i>0  (Seldom used in practice)
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCnnctA(2),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctB  name:Connections.Bi i>0  (Seldom used in practice)
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCnnctB(3),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctC  name:Connections.Ci i>0  (Seldom used in practice)
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCnnctC(4),
  /**
   * <p>
   * rowtype:visTagCnnct[Pt|Named]ABCD  visSectionConnectionPts,visRowConnectionPts+(i-1),visCnnctD  name:Connections.Di i>0  (Seldom used in practice)
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCnnctD(5),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldCell  name:Fields.Value[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFieldCell(0),
  /**
   * <p>
   * Obsolete starting with Visio 2013
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFieldEditMode(1),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldFormat  name:Fields.Format[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFieldFormat(2),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldType  name:Fields.Type[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFieldType(3),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldUICategory  name:Fields.UICat[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visFieldUICategory(4),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldUICode  name:Fields.UICod[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFieldUICode(5),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldUIFormat  name:Fields.UIFmt[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visFieldUIFormat(6),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldCalendar  name:Fields.Calendar[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visFieldCalendar(7),
  /**
   * <p>
   * visSectionTextField,visRowField+(i-1),visFieldObjectKind  name:Fields.ObjectKind[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visFieldObjectKind(10),
  /**
   * <p>
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlX  name:Controls.Xi i>0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCtlX(0),
  /**
   * <p>
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlY  name:Controls.Yi i>0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCtlY(1),
  /**
   * <p>
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlXDyn  name:Controls.XDyn[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCtlXDyn(2),
  /**
   * <p>
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlYDyn  name:Controls.YDyn[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCtlYDyn(3),
  /**
   * <p>
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlXCon  name:Controls.XCon[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCtlXCon(4),
  /**
   * <p>
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlYCon  name:Controls.YCon[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCtlYCon(5),
  /**
   * <p>
   * rowtype:visTagCtlPt[Tip]  visSectionControls,visRowControl+(i-1),visCtlGlue  name:Controls.CanGlue[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visCtlGlue(6),
  /**
   * <p>
   * Reserved for future use
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visCtlType(7),
  /**
   * <p>
   * rowtype:visTagCtlPtTip  visSectionControls,visRowControl+(i-1),visCtlTip  name:Controls.Prompt[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCtlTip(8),
  /**
   * <p>
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoFill  name:Geometryi.NoFill i>0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCompNoFill(0),
  /**
   * <p>
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoLine  name:Geometryi.NoLine i>0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCompNoLine(1),
  /**
   * <p>
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoShow  name:Geometryi.NoShow i>0
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCompNoShow(2),
  /**
   * <p>
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoSnap  name:Geometryi.NoSnap i>0
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCompNoSnap(3),
  /**
   * <p>
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompPath  name:Geometryi.Path i>0
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCompPath(4),
  /**
   * <p>
   * rowtype:visTagComponent  visSectionFirstComponent+(i-1),visRowComponent,visCompNoQuickDrag  name:Geometryi.NoQuickDrag i>0
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCompNoQuickDrag(5),
  /**
   * <p>
   * visSectionFirstComponent+(i-1),j,visX  name:Geometryi.Xj i>0, j>=visRowVertex
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visX(0),
  /**
   * <p>
   * visSectionFirstComponent+(i-1),j,visY  name:Geometryi.Yj i>0, j>=visRowVertex
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visY(1),
  /**
   * <p>
   * rowtype:visTagArcTo  visSectionFirstComponent+(i-1),j,visBow  name:Geometryi.Aj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visBow(2),
  /**
   * <p>
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineX1  name:Geometryi.X1 i>0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visInfiniteLineX1(0),
  /**
   * <p>
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineY1  name:Geometryi.Y1 i>0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visInfiniteLineY1(1),
  /**
   * <p>
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineX2  name:Geometryi.A1 i>0
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visInfiniteLineX2(2),
  /**
   * <p>
   * rowtype:visTagInfiniteLine  visSectionFirstComponent+(i-1),visRowVertex,visInfiniteLineY2  name:Geometryi.B1 i>0
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visInfiniteLineY2(3),
  /**
   * <p>
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseCenterX  name:Geometryi.X1 i>0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visEllipseCenterX(0),
  /**
   * <p>
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseCenterY  name:Geometryi.Y1 i>0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visEllipseCenterY(1),
  /**
   * <p>
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMajorX  name:Geometryi.A1 i>0
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visEllipseMajorX(2),
  /**
   * <p>
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMajorY  name:Geometryi.B1 i>0
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visEllipseMajorY(3),
  /**
   * <p>
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMinorX  name:Geometryi.C1 i>0
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visEllipseMinorX(4),
  /**
   * <p>
   * rowtype:visTagEllipse  visSectionFirstComponent+(i-1),visRowVertex,visEllipseMinorY  name:Geometryi.D1 i>0
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visEllipseMinorY(5),
  /**
   * <p>
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visControlX  name:Geometryi.Aj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visControlX(2),
  /**
   * <p>
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visControlY  name:Geometryi.Bj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visControlY(3),
  /**
   * <p>
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visEccentricityAngle  name:Geometryi.Cj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visEccentricityAngle(4),
  /**
   * <p>
   * rowtype:visTagEllipticalArcTo  visSectionFirstComponent+(i-1),j,visAspectRatio  name:Geometryi.Dj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visAspectRatio(5),
  /**
   * <p>
   * rowtype:visTagSplineBeg|Span  visSectionFirstComponent+(i-1),j,visSplineKnot  name:Geometryi.Aj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSplineKnot(2),
  /**
   * <p>
   * rowtype:visTagSplineBeg  visSectionFirstComponent+(i-1),j,visSplineKnot2  name:Geometryi.Bj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSplineKnot2(3),
  /**
   * <p>
   * rowtype:visTagSplineBeg  visSectionFirstComponent+(i-1),j,visSplineKnot3  name:Geometryi.Cj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSplineKnot3(4),
  /**
   * <p>
   * rowtype:visTagSplineBeg  visSectionFirstComponent+(i-1),j,visSplineDegree  name:Geometryi.Dj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visSplineDegree(5),
  /**
   * <p>
   * rowtype:visTagPolylineTo  visSectionFirstComponent+(i-1),j,visPolylineData  name:Geometryi.Aj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPolylineData(2),
  /**
   * <p>
   * rowtype:visTagRelCubBezTo  visSectionFirstComponent+(i-1),j,visControl1X  name:Geometryi.Aj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visControl1X(2),
  /**
   * <p>
   * rowtype:visTagRelCubBezTo  visSectionFirstComponent+(i-1),j,visControl1Y  name:Geometryi.Bj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visControl1Y(3),
  /**
   * <p>
   * rowtype:visTagRelCubBezTo  visSectionFirstComponent+(i-1),j,visControl2X  name:Geometryi.Cj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visControl2X(4),
  /**
   * <p>
   * rowtype:visTagRelCubBezTo  visSectionFirstComponent+(i-1),j,visControl2Y  name:Geometryi.Dj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visControl2Y(5),
  /**
   * <p>
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSKnot  name:Geometryi.Aj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visNURBSKnot(2),
  /**
   * <p>
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSWeight  name:Geometryi.Bj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visNURBSWeight(3),
  /**
   * <p>
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSKnotPrev  name:Geometryi.Cj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visNURBSKnotPrev(4),
  /**
   * <p>
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSWeightPrev  name:Geometryi.Dj i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visNURBSWeightPrev(5),
  /**
   * <p>
   * rowtype:visTagNURBSTo  visSectionFirstComponent+(i-1),j,visNURBSData  name:Geometryi.Ej i>0, j>visRowVertex
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visNURBSData(6),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionMenu  name:Actions.Menu[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visActionMenu(0),
  /**
   * <p>
   * Obsolete as of Visio 2002.   visSectionAction,visRowAction+(i-1),visActionPrompt  name:Actions.Prompt[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visActionPrompt(1),
  /**
   * <p>
   * Reserved for future use
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visActionHelp(2),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionAction  name:Actions.Action[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visActionAction(3),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionChecked  name:Actions.Ci i>0
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visActionChecked(4),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionDisabled  name:Actions.Di i>0
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visActionDisabled(5),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionReadOnly  name:Actions.ReadOnly i>0
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visActionReadOnly(6),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionInvisible  name:Actions.Invisible i>0
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visActionInvisible(7),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionBeginGroup  name:Actions.BeginGroup i>0
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visActionBeginGroup(8),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionFlyoutChild  name:Actions.FlyoutChild i>0
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visActionFlyoutChild(9),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionTagName  name:Actions.TagName i>0
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visActionTagName(14),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionButtonFace  name:Actions.ButtonFace i>0
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visActionButtonFace(15),
  /**
   * <p>
   * visSectionAction,visRowAction+(i-1),visActionSortKey  name:Actions.SortKey i>0
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visActionSortKey(16),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerName  name:Layers.Name[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLayerName(0),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerColor  name:Layers.Color[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLayerColor(2),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerStatus  name:Layers.Status[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visLayerStatus(3),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerVisible  name:Layers.Visible[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLayerVisible(4),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerPrint  name:Layers.Print[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visLayerPrint(5),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerActive  name:Layers.Active[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visLayerActive(6),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerLock  name:Layers.Locked[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visLayerLock(7),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerSnap  name:Layers.Snap[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLayerSnap(8),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerGlue  name:Layers.Glue[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visLayerGlue(9),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerNameUniv  name:Layers.NameUniv[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visLayerNameUniv(10),
  /**
   * <p>
   * visSectionLayer,visRowLayer+(i-1),visLayerColorTrans  name:Layers.ColorTrans[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visLayerColorTrans(11),
  /**
   * <p>
   * visSectionUser,visRowUser+i,visUserValue  name:name:User.<rowname> i>=0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visUserValue(0),
  /**
   * <p>
   * visSectionUser,visRowUser+i,visUserPrompt  name:name:User.<rowname>.Prompt i>=0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visUserPrompt(1),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsValue  name:name:Prop.<rowname> i>=0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCustPropsValue(0),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsPrompt  name:name:Prop.<rowname>.Prompt i>=0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCustPropsPrompt(1),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsLabel  name:name:Prop.<rowname>.Label i>=0
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCustPropsLabel(2),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsFormat  name:name:Prop.<rowname>.Format i>=0
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCustPropsFormat(3),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsSortKey  name:name:Prop.<rowname>.SortKey i>=0
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCustPropsSortKey(4),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsType  name:name:Prop.<rowname>.Type i>=0
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCustPropsType(5),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsInvis  name:name:Prop.<rowname>.Invisible i>=0
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visCustPropsInvis(6),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsAsk  name:name:Prop.<rowname>.Verify i>=0
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visCustPropsAsk(7),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsDataLinked  name:name:Prop.<rowname>.DataLinked i>=0
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCustPropsDataLinked(8),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsLangID  name:name:Prop.<rowname>.LangID i>=0
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visCustPropsLangID(14),
  /**
   * <p>
   * visSectionProp,visRowProp+i,visCustPropsCalendar  name:name:Prop.<rowname>.Calendar i>=0
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visCustPropsCalendar(15),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkDescription  name:name:Hyperlink.<rowname> i>=0
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visHLinkDescription(0),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkAddress  name:name:Hyperlink.<rowname>.Address i>=0
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visHLinkAddress(1),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkSubAddress  name:name:Hyperlink.<rowname>.SubAddress i>=0
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visHLinkSubAddress(2),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkExtraInfo  name:name:Hyperlink.<rowname>.ExtraInfo i>=0
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visHLinkExtraInfo(3),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkFrame  name:name:Hyperlink.<rowname>.Frame i>=0
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visHLinkFrame(4),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkNewWin  name:name:Hyperlink.<rowname>.NewWindow i>=0
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visHLinkNewWin(5),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkDefault  name:name:Hyperlink.<rowname>.Default i>=0
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visHLinkDefault(7),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkInvisible  name:name:Hyperlink.<rowname>.Invisible i>=0
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visHLinkInvisible(8),
  /**
   * <p>
   * visSectionHyperlink,visRow1stHyperlink+i,visHLinkSortKey  name:name:Hyperlink.<rowname>.SortKey i>=0
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visHLinkSortKey(15),
  /**
   * <p>
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerName  name:Reviewer.Name[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visReviewerName(0),
  /**
   * <p>
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerInitials  name:Reviewer.Initials[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visReviewerInitials(1),
  /**
   * <p>
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerColor  name:Reviewer.Color[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visReviewerColor(2),
  /**
   * <p>
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerReviewerID  name:Reviewer.ReviewerID[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visReviewerReviewerID(3),
  /**
   * <p>
   * visSectionReviewer,visRowReviewer+(i-1),visReviewerCurrentIndex  name:Reviewer.CurrentIndex[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visReviewerCurrentIndex(4),
  /**
   * <p>
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationX  name:Annotation.X[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visAnnotationX(0),
  /**
   * <p>
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationY  name:Annotation.Y[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visAnnotationY(1),
  /**
   * <p>
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationReviewerID  name:Annotation.ReviewerID[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visAnnotationReviewerID(2),
  /**
   * <p>
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationMarkerIndex  name:Annotation.MarkerIndex[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visAnnotationMarkerIndex(3),
  /**
   * <p>
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationDate  name:Annotation.Date[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visAnnotationDate(4),
  /**
   * <p>
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationComment  name:Annotation.Comment[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visAnnotationComment(5),
  /**
   * <p>
   * visSectionAnnotation,visRowAnnotation+(i-1),visAnnotationLangID  name:Annotation.LangID[i] i=<1>,2,3,...
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visAnnotationLangID(6),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagX  name:SmartTag.X[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSmartTagX(0),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagY  name:SmartTag.Y[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSmartTagY(1),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagName  name:SmartTag.Y[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSmartTagName(2),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagXJustify  name:SmartTag.XJustify[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSmartTagXJustify(3),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagYJustify  name:SmartTag.YJustify[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSmartTagYJustify(4),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagDisplayMode  name:SmartTag.DisplayMode[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visSmartTagDisplayMode(5),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagButtonFace  name:SmartTag.ButtonFace[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visSmartTagButtonFace(6),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagDisabled  name:SmartTag.Disabled[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visSmartTagDisabled(7),
  /**
   * <p>
   * visSectionSmartTag,visRowSmartTag+i,visSmartTagDescription  name:SmartTag.Description[i] i=<0>,1,2,...
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visSmartTagDescription(15),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesLeftMargin  name:PrintProperties.LeftMargin
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPrintPropertiesLeftMargin(0),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesRightMargin  name:PrintProperties.RightMargin
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPrintPropertiesRightMargin(1),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesTopMargin  name:PrintProperties.TopMargin
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPrintPropertiesTopMargin(2),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesBottomMargin  name:PrintProperties.BottomMargin
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPrintPropertiesBottomMargin(3),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesScaleX  name:PrintProperties.ScaleX
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPrintPropertiesScaleX(4),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesScaleY  name:PrintProperties.ScaleY
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visPrintPropertiesScaleY(5),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPagesX  name:PrintProperties.PagesX
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visPrintPropertiesPagesX(6),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPagesY  name:PrintProperties.PagesY
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visPrintPropertiesPagesY(7),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesCenterX  name:PrintProperties.CenterX
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visPrintPropertiesCenterX(8),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesCenterY  name:PrintProperties.CenterY
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visPrintPropertiesCenterY(9),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesOnPage  name:PrintProperties.OnPage
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visPrintPropertiesOnPage(10),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPrintGrid  name:PrintProperties.PrintGrid
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visPrintPropertiesPrintGrid(11),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPageOrientation  name:PrintProperties.PrintPageOrientation
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visPrintPropertiesPageOrientation(16),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPaperKind  name:PrintProperties.PrintPaperKind
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visPrintPropertiesPaperKind(17),
  /**
   * <p>
   * visSectionObject,visRowPrintProperties,visPrintPropertiesPaperSource  name:PrintProperties.PrintPaperSource
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visPrintPropertiesPaperSource(18),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockFromGroupFormat  name:LockFromGroupFormat
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visLockFromGroupFormat(17),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockThemeColors  name:LockThemeColors
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visLockThemeColors(18),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockThemeEffects  name:LockThemeEffects
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visLockThemeEffects(19),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockThemeConnectors  name:LockThemeConnectors
   * </p>
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visLockThemeConnectors(20),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockThemeFonts  name:LockThemeFonts
   * </p>
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visLockThemeFonts(21),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockThemeIndex  name:LockThemeIndex
   * </p>
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visLockThemeIndex(22),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockReplace  name:LockReplace
   * </p>
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visLockReplace(23),
  /**
   * <p>
   * visSectionObject,visRowLock,visLockVariation  name:LockVariation
   * </p>
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visLockVariation(24),
  /**
   * <p>
   * visSectionObject,visRowEvent,visEvtCellMultiDrop  name:EventMultiDrop
   * </p>
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visEvtCellMultiDrop(22),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visLineGradientDir  name:LineGradientDir
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLineGradientDir(0),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visLineGradientAngle  name:LineGradientAngle
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLineGradientAngle(1),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visFillGradientDir   name:FillGradientDir
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFillGradientDir(2),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visFillGradientAngle  name:FillGradientAngle
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFillGradientAngle(3),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visLineGradientEnabled  name:LineGradientEnabled
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLineGradientEnabled(4),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visFillGradientEnabled  name:FillGradientEnabled
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFillGradientEnabled(5),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visRotateGradientWithShape  name:RotateGradientWithShape
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visRotateGradientWithShape(6),
  /**
   * <p>
   * visSectionObject,visRowGradientProperties,visUseGroupGradient  name:UseGroupGradient
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visUseGroupGradient(7),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleLineColor  name:QuickStyleLineColor
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visQuickStyleLineColor(0),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleFillColor  name:QuickStyleFillColor
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visQuickStyleFillColor(1),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleShadowColor  name:QuickStyleShadowColor
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visQuickStyleShadowColor(2),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleFontColor  name:QuickStyleFontColor
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visQuickStyleFontColor(3),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleLineMatrix  name:QuickStyleLineMatrix
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visQuickStyleLineMatrix(4),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleFillMatrix  name:QuickStyleFillMatrix
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visQuickStyleFillMatrix(5),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleEffectsMatrix  name:QuickStyleEffectsMatrix
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visQuickStyleEffectsMatrix(6),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleFontMatrix  name:QuickStyleFontMatrix
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visQuickStyleFontMatrix(7),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleType  name:QuickStyleType
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visQuickStyleType(8),
  /**
   * <p>
   * visSectionObject,visRowQuickStyleProperties,visQuickStyleVariation  name:QuickStyleVariation
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visQuickStyleVariation(9),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visReflectionTrans  name:ReflectionTrans
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visReflectionTrans(0),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visReflectionSize  name:ReflectionSize
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visReflectionSize(1),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visReflectionDist  name:ReflectionDist
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visReflectionDist(2),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visReflectionBlur  name:ReflectionBlur
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visReflectionBlur(3),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visGlowColor  name:GlowColor
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGlowColor(4),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visGlowColorTrans  name:GlowColorTrans
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visGlowColorTrans(5),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visGlowSize  name:GlowSize
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visGlowSize(6),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visSoftEdgesSize  name:SoftEdgesSize
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visSoftEdgesSize(7),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visSketchSeed  name:SketchSeed
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSketchSeed(8),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visSketchEnabled  name:SketchEnabled
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visSketchEnabled(9),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visSketchAmount  name:SketchAmount
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visSketchAmount(10),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visSketchLineWeight  name:SketchLineWeight
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visSketchLineWeight(11),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visSketchLineChange  name:SketchLineChange
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visSketchLineChange(12),
  /**
   * <p>
   * visSectionObject,visRowOtherEffectProperties,visSketchFillChange  name:SketchFillChange
   * </p>
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visSketchFillChange(13),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelTopType  name:BevelTopType
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visBevelTopType(0),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelTopWidth  name:BevelTopWidth
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visBevelTopWidth(1),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelTopHeight  name:BevelTopHeight
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visBevelTopHeight(2),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelBottomType  name:BevelBottomType
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visBevelBottomType(3),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelBottomWidth  name:BevelBottomWidth
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visBevelBottomWidth(4),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelBottomHeight  name:BevelBottomHeight
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visBevelBottomHeight(5),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelDepthColor  name:BevelDepthColor
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visBevelDepthColor(6),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelDepthSize  name:BevelDepthSize
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visBevelDepthSize(7),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelContourColor  name:BevelContourColor
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visBevelContourColor(8),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelContourSize  name:BevelContourSize
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visBevelContourSize(9),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelMaterialType  name:BevelMaterialType
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visBevelMaterialType(10),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelLightingType  name:BevelLightingType
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visBevelLightingType(11),
  /**
   * <p>
   * visSectionObject,visRowBevelProperties,visBevelLightingAngle  name:BevelLightingAngle
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visBevelLightingAngle(12),
  /**
   * <p>
   * visSectionObject,visRow3DProperties,visRotationXAngle  name:RotationXAngle
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRotationXAngle(0),
  /**
   * <p>
   * visSectionObject,visRow3DProperties,visRotationYAngle  name:RotationYAngle
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRotationYAngle(1),
  /**
   * <p>
   * visSectionObject,visRow3DProperties,visRotationZAngle  name:RotationZAngle
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRotationZAngle(2),
  /**
   * <p>
   * visSectionObject,visRow3DProperties,visRotationType  name:RotationType
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visRotationType(3),
  /**
   * <p>
   * visSectionObject,visRow3DProperties,visPerspective  name:Perspective
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPerspective(4),
  /**
   * <p>
   * visSectionObject,visRow3DProperties,visDistanceFromGround  name:DistanceFromGround
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visDistanceFromGround(5),
  /**
   * <p>
   * visSectionObject,visRow3DProperties,visKeepTextFlat  name:KeepTextFlat
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visKeepTextFlat(6),
  /**
   * <p>
   * visSectionObject,visRowGradientStop,visGradientStopColor  name:GradientStopColor
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGradientStopColor(0),
  /**
   * <p>
   * visSectionObject,visRowGradientStop,visGradientStopColorTrans  name:GradientStopColorTrans
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGradientStopColorTrans(1),
  /**
   * <p>
   * visSectionObject,visRowGradientStop,visGradientStopPosition  name:GradientStopPosition
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGradientStopPosition(2),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visColorSchemeIndex  name:ColorSchemeIndex
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visColorSchemeIndex(0),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visEffectSchemeIndex  name:EffectSchemeIndex
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visEffectSchemeIndex(1),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visConnectorSchemeIndex  name:ConnectorSchemeIndex
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visConnectorSchemeIndex(2),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visFontSchemeIndex  name:FontSchemeIndex
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFontSchemeIndex(3),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visThemeIndex  name:ThemeIndex
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visThemeIndex(4),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visVariationColorIndex  name:VariationColorIndex
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visVariationColorIndex(5),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visVariationStyleIndex  name:VariationStyleIndex
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visVariationStyleIndex(6),
  /**
   * <p>
   * visSectionObject,visRowThemeProperties,visEmbellishmentIndex  name:EmbellishmentIndex
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visEmbellishmentIndex(7),
  /**
   * <p>
   * visSectionObject,visRowReplaceBehaviors,visReplaceLockShapeData  name:ReplaceLockShapeData
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visReplaceLockShapeData(0),
  /**
   * <p>
   * visSectionObject,visRowReplaceBehaviors,visReplaceLockText  name:ReplaceLockText
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visReplaceLockText(1),
  /**
   * <p>
   * visSectionObject,visRowReplaceBehaviors,visReplaceLockFormat  name:ReplaceLockFormat
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visReplaceLockFormat(2),
  /**
   * <p>
   * visSectionObject,visRowReplaceBehaviors,visReplaceCopyCells  name:ReplaceCopyCells
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visReplaceCopyCells(3),
  /**
   * <p>
   * visSectionObject,visDiagramSemanticsProperties,visDataSource  name:visDataSource
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDataSource(0),
  /**
   * <p>
   * visSectionObject,visDiagramSemanticsProperties,visDataItem  name:visDataItem
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDataItem(1),
  /**
   * <p>
   * visSectionObject,visDiagramSemanticsProperties,visShapeMasterSelector  name:visShapeMasterSelector
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visShapeMasterSelector(2),
  /**
   * <p>
   * visSectionObject,visDiagramSemanticsProperties,visLabelField  name:visLabelField
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visLabelField(3),
  /**
   * <p>
   * visSectionObject,visDiagramSemanticsProperties,visActiveRecord  name:visActiveRecord
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visActiveRecord(4),
  /**
   * <p>
   * visSectionObject,visDiagramSemanticsProperties,visContainerLayout  name:visContainerLayout
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visContainerLayout(5),
  ;

  private  int value;
  tagVisCellIndices(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

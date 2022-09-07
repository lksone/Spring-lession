package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Symbolic values for certain cells.
 * </p>
 */
public enum tagVisCellVals implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visXFormResizeDontCare(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visXFormResizeSpread(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visXFormResizeScale(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visArrowSizeVerySmall(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visArrowSizeSmall(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visArrowSizeMedium(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visArrowSizeLarge(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visArrowSizeVeryLarge(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visArrowSizeJumbo(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visArrowSizeColossal(6),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visNoFill(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSolid(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visWideUpDiagonal(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visWideCross(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visWideDiagonalCross(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visWideDownDiagonal(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visWideHorz(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visWideVert(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visBackDotsMini(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visHalfAndHalf(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visForeDotsMini(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visForeDotsNarrow(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visForeDotsWide(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visThickHorz(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visThickVertical(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visThickDownDiagonal(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visThickUpDiagonal(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visThickDiagonalCross(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visBackDotsWide(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visThinHorz(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visThinVert(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visThinDownDiagonal(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visThinUpDiagonal(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visThinCross(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visThinDiagonalCross(24),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visGuideXActive(1024),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.
   * </p>
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visGuideYActive(2048),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPrintSetup(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTight(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visStandard(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCustom(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLogical(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visDSMetric(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visDSEngr(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visDSArch(7),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visNoScale(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visArchitectural(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visEngineering(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visScaleCustom(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visScaleMetric(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visScaleMechanical(5),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visVertTop(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visVertMiddle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visVertBottom(2),
  /**
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visTxtBlkOpaque(255),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTxtBlkLeftToRight(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTxtBlkTopToBottom(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDynFBDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDynFBUCon3Leg(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDynFBUCon5Leg(2),
  /**
   * <p>
   * Only static glue can be established from this shape.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGlueTypeDefault(0),
  /**
   * <p>
   * Obsolete. Used in old style Universal connectors.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGlueTypeTrigger(1),
  /**
   * <p>
   * Walking glue can be established from this shape.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGlueTypeWalking(2),
  /**
   * <p>
   * Walking glue cannot be established from this shape.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGlueTypeNoWalking(4),
  /**
   * <p>
   * Walking glue cannot be established to this shape.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visGlueTypeNoWalkingTo(8),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visWalkPrefBegNS(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visWalkPrefEndNS(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOFlagsVisDecides(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLOFlagsPlacable(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOFlagsRoutable(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLOFlagsDont(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLOFlagsPNRGroup(8),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOIPlaceNormal(0),
  /**
   * <p>
   * Added starting with 5.0b. Starting with Visio 2000 use visSLOPermX cell instead.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOIPlaceXPermeable(2),
  /**
   * <p>
   * Added starting with 5.0b. Starting with Visio 2000 use visSLOPermX cell instead.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLOIPlaceYPermeable(4),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOIRouteNormal(0),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOBPlaceNormal(0),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOBRouteNormal(0),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLOBRouteRightAng(1),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOBRouteStraight(2),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visLOBRouteFlowNS(5),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visLOBRouteFlowWE(6),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visLOBRouteTreeNS(7),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Layout properties now in cells in visRowShapeLayout and visRowPageLayout.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLOBRouteTreeWE(8),
  /**
   * <p>
   * Added starting with 5.0b. Starting with Visio 2000 use visSLOConFixedCode cell instead.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visLOBRouteManual(1024),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visRulerFine(32),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visRulerNormal(16),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visRulerCoarse(8),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRulerFixed(0),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visGridFine(8),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visGridNormal(4),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGridCoarse(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGridFixed(0),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDocPreviewQualityDraft(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDocPreviewQualityDetailed(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDocPreviewScope1stPage(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDocPreviewScopeNone(1),
  /**
   * <p>
   * Obsolete starting with Visio 2003.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDocPreviewScopeAllPages(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPPOSameAsPrinter(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPPOPortrait(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPPOLandscape(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGrpSelModeGroupOnly(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGrpSelModeGroup1st(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGrpSelModeMembers1st(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGrpDispModeNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGrpDispModeBack(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visGrpDispModeFront(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLORouteDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLORouteRightAngle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLORouteStraight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visLORouteOrgChartNS(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLORouteOrgChartWE(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visLORouteFlowchartNS(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visLORouteFlowchartWE(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visLORouteTreeNS(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLORouteTreeWE(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visLORouteNetwork(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visLORouteOrgChartSN(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visLORouteOrgChartEW(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visLORouteFlowchartSN(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visLORouteFlowchartEW(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visLORouteTreeSN(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visLORouteTreeEW(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visLORouteCenterToCenter(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visLORouteSimpleNS(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visLORouteSimpleWE(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visLORouteSimpleSN(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visLORouteSimpleEW(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visLORouteSimpleHV(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visLORouteSimpleVH(22),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOJumpStyleDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLOJumpStyleArc(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOJumpStyleGap(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visLOJumpStyleSquare(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLOJumpStyleTriangle(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visLOJumpStyle2Point(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visLOJumpStyle3Point(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visLOJumpStyle4Point(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLOJumpStyle5Point(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visLOJumpStyle6Point(9),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOJumpDirXDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLOJumpDirXUp(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOJumpDirXDown(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOJumpDirYDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLOJumpDirYLeft(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOJumpDirYRight(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOFlipDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLOFlipX(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOFlipY(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLOFlipRotate(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLOFlipNone(8),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLORouteExtDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLORouteExtStraight(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLORouteExtNURBS(2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSLOFixedPlacement(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSLOFixedPlow(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSLOFixedPermeablePlow(4),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visSLOFixedConnPtsIgnore(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visSLOFixedConnPtsOnly(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visSLOFixedNoFoldToShape(128),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSLOPlowDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSLOPlowNever(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSLOPlowAlways(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSLOConFixedRerouteFreely(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSLOConFixedRerouteAsNeeded(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSLOConFixedRerouteNever(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSLOConFixedRerouteOnCrossover(3),
  /**
   * <p>
   * For internal use only.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSLOConFixedByAlgFrom(4),
  /**
   * <p>
   * For internal use only.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visSLOConFixedByAlgTo(5),
  /**
   * <p>
   * For internal use only.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visSLOConFixedByAlgFromTo(6),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSLOJumpDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSLOJumpNever(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSLOJumpAlways(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSLOJumpOther(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSLOJumpNeither(4),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOPlaceDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOPlaceTopToBottom(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPLOPlaceLeftToRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPLOPlaceRadial(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPLOPlaceBottomToTop(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visPLOPlaceRightToLeft(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visPLOPlaceCircular(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visPLOPlaceCompactDownRight(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visPLOPlaceCompactRightDown(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visPLOPlaceCompactRightUp(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visPLOPlaceCompactUpRight(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visPLOPlaceCompactUpLeft(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visPLOPlaceCompactLeftUp(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visPLOPlaceCompactLeftDown(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visPLOPlaceCompactDownLeft(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visPLOPlaceParentDefault(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visPLOPlaceHierarchyTopToBottomLeft(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visPLOPlaceHierarchyTopToBottomCenter(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visPLOPlaceHierarchyTopToBottomRight(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visPLOPlaceHierarchyBottomToTopLeft(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visPLOPlaceHierarchyBottomToTopCenter(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visPLOPlaceHierarchyBottomToTopRight(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visPLOPlaceHierarchyLeftToRightTop(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visPLOPlaceHierarchyLeftToRightMiddle(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visPLOPlaceHierarchyLeftToRightBottom(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visPLOPlaceHierarchyRightToLeftTop(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visPLOPlaceHierarchyRightToLeftMiddle(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visPLOPlaceHierarchyRightToLeftBottom(27),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLOPlaceDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLOPlaceTopToBottom(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLOPlaceLeftToRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visLOPlaceRadial(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visLOPlaceBottomToTop(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visLOPlaceRightToLeft(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visLOPlaceCircular(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visLOPlaceCompactDownRight(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visLOPlaceCompactRightDown(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visLOPlaceCompactRightUp(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visLOPlaceCompactUpRight(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visLOPlaceCompactUpLeft(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visLOPlaceCompactLeftUp(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visLOPlaceCompactLeftDown(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visLOPlaceCompactDownLeft(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visLOPlaceParentDefault(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visLOPlaceHierarchyTopToBottomLeft(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visLOPlaceHierarchyTopToBottomCenter(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visLOPlaceHierarchyTopToBottomRight(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visLOPlaceHierarchyBottomToTopLeft(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visLOPlaceHierarchyBottomToTopCenter(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visLOPlaceHierarchyBottomToTopRight(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visLOPlaceHierarchyLeftToRightTop(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visLOPlaceHierarchyLeftToRightMiddle(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visLOPlaceHierarchyLeftToRightBottom(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visLOPlaceHierarchyRightToLeftTop(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visLOPlaceHierarchyRightToLeftMiddle(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visLOPlaceHierarchyRightToLeftBottom(27),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOPlaceDepthDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOPlaceDepthMedium(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPLOPlaceDepthDeep(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPLOPlaceDepthShallow(3),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOPlowNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOPlowAll(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOJumpNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOJumpHorizontal(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPLOJumpVertical(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPLOJumpLastRouted(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPLOJumpDisplayOrder(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visPLOJumpReverseDisplayOrder(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visPLOJumpProhibitAll(6),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOLineAdjustFromNotRelated(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOLineAdjustFromAll(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPLOLineAdjustFromNone(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPLOLineAdjustFromRoutingDefault(3),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOLineAdjustToDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOLineAdjustToAll(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPLOLineAdjustToNone(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPLOLineAdjustToRelated(3),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visBold(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visItalic(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visUnderLine(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSmallCaps(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visComplexBold(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visComplexItalic(32),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCaseNormal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCaseAllCaps(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCaseInitialCaps(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPosNormal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPosSuper(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPosSub(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visHorzLeft(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visHorzCenter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visHorzRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visHorzJustify(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visHorzForce(4),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visHorzDistribute(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visHorzJustifyLow(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visHorzJustifyMedium(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visHorzJustifyHigh(7),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTabStopLeft(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTabStopCenter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTabStopRight(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visTabStopDecimal(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visTabStopComma(4),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCnnctTypeInward(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCnnctTypeOutward(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCnnctTypeInwardOutward(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCtlProportional(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCtlLocked(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCtlOffsetMin(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCtlOffsetMid(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCtlOffsetMax(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCtlProportionalHidden(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visCtlLockedHidden(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visCtlOffsetMinHidden(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCtlOffsetMidHidden(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visCtlOffsetMaxHidden(9),
  /**
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visNoLayerColor(255),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLayerValid(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLayerDeleted(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLayerAvailable(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPropTypeString(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPropTypeListFix(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visPropTypeNumber(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visPropTypeBool(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visPropTypeListVar(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visPropTypeDate(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visPropTypeDuration(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visPropTypeCurrency(7),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCalWestern(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCalArabicHijri(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCalHebrewLunar(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCalChineseTaiwan(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCalJapaneseEmperor(4),
  /**
   * <p>
   * Synonym of visCalThaiBuddhist
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCalThaiBuddhism(5),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCalThaiBuddhist(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visCalKoreanDanki(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visCalSakaEra(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCalTranslitEnglish(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visCalTranslitFrench(9),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visPLOSplitNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPLOSplitAllow(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSLOSplitNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSLOSplitAllow(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSLOSplittableNone(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSLOSplittableAllow(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFSTPageDefault(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFSTSimple(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFSTOblique(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visUIVNormal(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visUIVHidden(1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visLocFontIfArialOrSym(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visLocFontAlways(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visLocFontNever(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSmartTagXJustifyLeft(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSmartTagXJustifyCenter(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSmartTagXJustifyRight(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSmartTagYJustifyTop(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSmartTagYJustifyMiddle(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSmartTagYJustifyBottom(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSmartTagDispModeMouseOver(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSmartTagDispModeShapeSelected(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSmartTagDispModeAlways(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTFOKStandard(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTFOKHorizontalInVertical(1),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visPPFlagsRTLText(1),
  ;

  private  int value;
  tagVisCellVals(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

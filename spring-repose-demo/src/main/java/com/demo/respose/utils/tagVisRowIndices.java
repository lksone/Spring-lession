package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Logical indices of rows in shape or style object sections.
 * </p>
 */
public enum tagVisRowIndices implements ComEnum {
  /**
   * <p>
   * An index no row will ever have.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visRowInval(-1),
  /**
   * <p>
   * Row logically at or before every other row in a section.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowFirst(0),
  /**
   * <p>
   * Row logically after every other row in a section.
   * </p>
   * <p>
   * The value of this constant is -2
   * </p>
   */
  visRowLast(-2),
  /**
   * <p>
   * Connotes unspecified row.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visRowNone(-1),
  /**
   * <p>
   * Index of row in Shape's visSectionObject that defines its transform. Appears as Shape Transform 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRowXFormOut(1),
  /**
   * <p>
   * Synonym of visRowXFormOut
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRowXFormIn(1),
  /**
   * <p>
   * Index of row in Shape or Style's visSectionObject that defines line properties. Appears as Line Format 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRowLine(2),
  /**
   * <p>
   * Index of row in Shape or Style's visSectionObject that defines fill properties. Appears as Fill Format 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visRowFill(3),
  /**
   * <p>
   * Index of row in 1D Shape's visSectionObject that defines its end-points. Appears as 1-D Endpoints 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visRowXForm1D(4),
  /**
   * <p>
   * Index of row in Shape's visSectionObject that defines the Shape's reactions to certain events. Events 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visRowEvent(5),
  /**
   * <p>
   * Index of row in Shape's visSectionObject that defines what layers it belongs to. Layer Membership 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visRowLayerMem(6),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Guides now represented by XFormOut and geometry.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visRowGuide(7),
  /**
   * <p>
   * Index of row in Style's visSectionObject that defines style specific properties. Style Properties 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visRowStyle(8),
  /**
   * <p>
   * Index of row in visSectionObject of Shape of ForeignType visTypeForeignObject that defines foreign properties. Foreign Image Info 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visRowForeign(9),
  /**
   * <p>
   * Index of row in visSectionObject of Shape of type visTypePage that defines page/master specific properties. Page Properties Info 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visRowPage(10),
  /**
   * <p>
   * Index of row in Shape or Style's visSectionObject that defines text block properties. Character 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visRowText(11),
  /**
   * <p>
   * Index of row in Shape's visSectionObject that defines its text transform. Text Transform 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visRowTextXForm(12),
  /**
   * <p>
   * Index of row in Shape's visSectionObject that defines what Shape is aligned with. Alignment 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visRowAlign(14),
  /**
   * <p>
   * Index of row in Shape's visSectionObject indicating operations it is protected against. Protection 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visRowLock(15),
  /**
   * <p>
   * Index of row in Shape's visSectionObject that defines help and copyright properties. Not shown in sheet window.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visRowHelpCopyright(16),
  /**
   * <p>
   * Synonym of visRowHelpCopyright
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visRowData123(16),
  /**
   * <p>
   * Index of row in Shape's visSectionObject that defines various behavioral properties. Miscellaneous 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visRowMisc(17),
  /**
   * <p>
   * Index of row in Page or Master's visSectionObject that defines ruler and grid settings. Ruler & Grid 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visRowRulerGrid(18),
  /**
   * <p>
   * Obsolete starting with Visio 2000. Hyperlinks are now rows in visSectionHyperlink.
   * </p>
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visRowHyperlink(19),
  /**
   * <p>
   * Index of row in visSectionObject of Shape of type visTypeDoc that defines document properties. Document 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visRowDoc(20),
  /**
   * <p>
   * Index of row in visSectionObject of Shape of ForeignType visTypeBitMap that defines image properties. Image 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visRowImage(21),
  /**
   * <p>
   * Index of row in visSectionObject of Shape of type visTypeGroup that defines group properties. Group 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visRowGroup(22),
  /**
   * <p>
   * Index of row in visSectionObject of Shape that defines its placement and routing behavior. Shape Layout 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visRowShapeLayout(23),
  /**
   * <p>
   * Index of row in visSectionObject of Page or Master that defines how its Shapes place and route. Page Layout 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visRowPageLayout(24),
  /**
   * <p>
   * Index of row in visSectionObject of Document that defines printing properties. Print Properties 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visRowPrintProperties(25),
  /**
   * <p>
   * Index of row in visSectionObject of Document that defines gradient properties. Gradient Properties 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visRowGradientProperties(26),
  /**
   * <p>
   * Index of row in visSectionObject of Document that defines QuickStyle properties. QuickStyle 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visRowQuickStyleProperties(27),
  /**
   * <p>
   * Index of row in visSectionObject of Document that defines other effect properties. Other Effect Properties 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visRowOtherEffectProperties(28),
  /**
   * <p>
   * Index of row in visSectionObject of Document that defines bevel properties. Bevel Properties 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 29
   * </p>
   */
  visRowBevelProperties(29),
  /**
   * <p>
   * Index of row in visSectionObject of Document that defines 3-D rotation properties. 3-D Rotation 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 30
   * </p>
   */
  visRow3DRotationProperties(30),
  /**
   * <p>
   * Index of row in visSectionObject of Page that defines theme properties. Theme Properties 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 31
   * </p>
   */
  visRowThemeProperties(31),
  /**
   * <p>
   * Index of row in Shape visSectionObject that defines the Change Shape behaviors. Appears as Change Shape Behaviors 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visRowReplaceBehaviors(32),
  /**
   * <p>
   * Index of row in Symentic Diagram Layout 'section' in sheet window.
   * </p>
   * <p>
   * The value of this constant is 33
   * </p>
   */
  visRowDgmSemanticsLayoutProperties(33),
  /**
   * <p>
   * Index of component properties row in a geometry section (visSectionFirstComponent+i).
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowComponent(0),
  /**
   * <p>
   * Index of 1st vertex row in a geometry section (visSectionFirstComponent+i).
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRowVertex(1),
  /**
   * <p>
   * Index of 1st row in visSectionMember. For internal use only.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowMember(0),
  /**
   * <p>
   * Index of 1st row in visSectionCharacter.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowCharacter(0),
  /**
   * <p>
   * Index of 1st row in visSectionParagraph.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowParagraph(0),
  /**
   * <p>
   * Index of 1st row in visSectionTab.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowTab(0),
  /**
   * <p>
   * Index of 1st row in visSectionScratch.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowScratch(0),
  /**
   * <p>
   * Index of 1st row in visSectionConnectionPts.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowConnectionPts(0),
  /**
   * <p>
   * Synonym of visRowConnectionPts
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowExport(0),
  /**
   * <p>
   * Index of 1st row in visSectionTextField.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowField(0),
  /**
   * <p>
   * Index of 1st row in visSectionControls.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowControl(0),
  /**
   * <p>
   * Index of 1st row in visSectionAction.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowAction(0),
  /**
   * <p>
   * Index of 1st row in visSectionLayer.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowLayer(0),
  /**
   * <p>
   * Index of 1st row in visSectionUser.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowUser(0),
  /**
   * <p>
   * Index of 1st row in visSectionProp.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowProp(0),
  /**
   * <p>
   * Index of 1st row in visSectionHyperlink.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRow1stHyperlink(0),
  /**
   * <p>
   * Generic index of 1st row in non-object/geometry section.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowFormat(0),
  /**
   * <p>
   * Index of 1st row in visSectionReviewer.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowReviewer(0),
  /**
   * <p>
   * Index of 1st row in visSectionAnnotation.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowAnnotation(0),
  /**
   * <p>
   * Index of 1st row in visSectionSmartTag.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowSmartTag(0),
  /**
   * <p>
   * Index of 1st row in visSectionLineGradientStops and visSectionFillGradientStops.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visRowGradientStop(0),
  ;

  private  int value;
  tagVisRowIndices(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Logical indices of sections in shape or style objects.
 * </p>
 */
public enum tagVisSectionIndices implements ComEnum {
  /**
   * <p>
   * An index no section will ever have.
   * </p>
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visSectionInval(255),
  /**
   * <p>
   * Index that every actual section index exceeds.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSectionFirst(0),
  /**
   * <p>
   * Index that exceeds every actual section index.
   * </p>
   * <p>
   * The value of this constant is 252
   * </p>
   */
  visSectionLast(252),
  /**
   * <p>
   * Connotes unspecified section.
   * </p>
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visSectionNone(255),
  /**
   * <p>
   * Index of section that stores general non-repeated properties of an object. Appears as many sections in sheet window.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSectionObject(1),
  /**
   * <p>
   * Index of section Visio uses internally to represent an object's display list. For internal use only.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSectionMember(2),
  /**
   * <p>
   * Index of section that stores character properties such as font and text color.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visSectionCharacter(3),
  /**
   * <p>
   * Index of section that stores paragraph properties such as indent and horizontal text alignment.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSectionParagraph(4),
  /**
   * <p>
   * Index of section that stores positions and alignments of tab stops.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visSectionTab(5),
  /**
   * <p>
   * Index of section with cells used to hold temporary or intermediate results.
   * </p>
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visSectionScratch(6),
  /**
   * <p>
   * Index of section whose rows represent an object's connection points. Connection point rows are namable.
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visSectionConnectionPts(7),
  /**
   * <p>
   * Synonym of visSectionConnectionPts
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visSectionExport(7),
  /**
   * <p>
   * Index of section that describes an object's text fields.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSectionTextField(8),
  /**
   * <p>
   * Index of section whose rows represent an object's control handles.
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visSectionControls(9),
  /**
   * <p>
   * Index of an object's 1st geometry section. Additional sections have indices visSectionFirstComponent+i.
   * </p>
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visSectionFirstComponent(10),
  /**
   * <p>
   * Highest possible index of an object's last geometry section.
   * </p>
   * <p>
   * The value of this constant is 239
   * </p>
   */
  visSectionLastComponent(239),
  /**
   * <p>
   * Index of section whose rows represent actions that appear on an object's right mouse menu.
   * </p>
   * <p>
   * The value of this constant is 240
   * </p>
   */
  visSectionAction(240),
  /**
   * <p>
   * Index of section whose rows represent a page's or master's layers.
   * </p>
   * <p>
   * The value of this constant is 241
   * </p>
   */
  visSectionLayer(241),
  /**
   * <p>
   * Index of section with cells created and used by external solutions. User section rows are named.
   * </p>
   * <p>
   * The value of this constant is 242
   * </p>
   */
  visSectionUser(242),
  /**
   * <p>
   * Index of section that stores custom database-like properties of an object. Property section rows are named.
   * </p>
   * <p>
   * The value of this constant is 243
   * </p>
   */
  visSectionProp(243),
  /**
   * <p>
   * Index of section whose rows represent links to another object. Hyperlink section rows are named.
   * </p>
   * <p>
   * The value of this constant is 244
   * </p>
   */
  visSectionHyperlink(244),
  /**
   * <p>
   * Index of section whose rows represent reviewers.
   * </p>
   * <p>
   * The value of this constant is 245
   * </p>
   */
  visSectionReviewer(245),
  /**
   * <p>
   * Index of section whose rows represent annotations.
   * </p>
   * <p>
   * The value of this constant is 246
   * </p>
   */
  visSectionAnnotation(246),
  /**
   * <p>
   * Index of section whose rows represent action tags.
   * </p>
   * <p>
   * The value of this constant is 247
   * </p>
   */
  visSectionSmartTag(247),
  /**
   * <p>
   * Highest possible actual section index. Was 243 in Visio 5.0 and prior. Deprecated in Visio 2013 with the addition of gradient stop sections.
   * </p>
   * <p>
   * The value of this constant is 247
   * </p>
   */
  visSectionLastReal(247),
  /**
   * <p>
   * Index of section whose rows represent line gradient stops.
   * </p>
   * <p>
   * The value of this constant is 248
   * </p>
   */
  visSectionLineGradientStops(248),
  /**
   * <p>
   * Index of section whose rows represent fill gradient stops.
   * </p>
   * <p>
   * The value of this constant is 249
   * </p>
   */
  visSectionFillGradientStops(249),
  /**
   * <p>
   * Index of section that represent diagram semantics properties.
   * </p>
   * <p>
   * The value of this constant is 250
   * </p>
   */
  visSectionDgmSemantics(250),
  ;

  private  int value;
  tagVisSectionIndices(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

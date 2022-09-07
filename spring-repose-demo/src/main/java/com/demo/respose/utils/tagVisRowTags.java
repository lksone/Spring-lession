package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Row tags to be used with shape.rowtype and similar methods.
 * </p>
 */
public enum tagVisRowTags implements ComEnum {
  /**
   * <p>
   * Connotes row of default type to AddRow, AddNamedRow or AddRows.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visTagDefault(0),
  /**
   * <p>
   * Lowest row tag value
   * </p>
   * <p>
   * The value of this constant is 130
   * </p>
   */
  visTagBase(130),
  /**
   * <p>
   * The rowtype of rows in visSectionUser. Reserved for future use.
   * </p>
   * <p>
   * The value of this constant is 180
   * </p>
   */
  visTagRowVoid(180),
  /**
   * <p>
   * A tag no row will ever have.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visTagInvalid(-1),
  /**
   * <p>
   * The rowtype of the component properties row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 137
   * </p>
   */
  visTagComponent(137),
  /**
   * <p>
   * The rowtype of a MoveTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 138
   * </p>
   */
  visTagMoveTo(138),
  /**
   * <p>
   * The rowtype of a LineTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 139
   * </p>
   */
  visTagLineTo(139),
  /**
   * <p>
   * The rowtype of an ArcTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 140
   * </p>
   */
  visTagArcTo(140),
  /**
   * <p>
   * The rowtype of an InfiniteLine row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 141
   * </p>
   */
  visTagInfiniteLine(141),
  /**
   * <p>
   * The rowtype of an Ellipse row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 143
   * </p>
   */
  visTagEllipse(143),
  /**
   * <p>
   * The rowtype of an EllipticalArcTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 144
   * </p>
   */
  visTagEllipticalArcTo(144),
  /**
   * <p>
   * The rowtype of a SplineStart row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 165
   * </p>
   */
  visTagSplineBeg(165),
  /**
   * <p>
   * The rowtype of a SplineKnot row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 166
   * </p>
   */
  visTagSplineSpan(166),
  /**
   * <p>
   * The rowtype of a PolyLineTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 193
   * </p>
   */
  visTagPolylineTo(193),
  /**
   * <p>
   * The rowtype of a NURBSTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 195
   * </p>
   */
  visTagNURBSTo(195),
  /**
   * <p>
   * The rowtype of a row in visSectionTab that defines 0 tab stops.
   * </p>
   * <p>
   * The value of this constant is 136
   * </p>
   */
  visTagTab0(136),
  /**
   * <p>
   * The rowtype of a row in visSectionTab that defines up to 2 tab stops.
   * </p>
   * <p>
   * The value of this constant is 150
   * </p>
   */
  visTagTab2(150),
  /**
   * <p>
   * The rowtype of a row in visSectionTab that defines up to 10 tab stops.
   * </p>
   * <p>
   * The value of this constant is 151
   * </p>
   */
  visTagTab10(151),
  /**
   * <p>
   * The rowtype of a row in visSectionTab that defines up to 60 tab stops.
   * </p>
   * <p>
   * The value of this constant is 181
   * </p>
   */
  visTagTab60(181),
  /**
   * <p>
   * The rowtype of a row in a visSectionConnectionPts with unnamed rows.
   * </p>
   * <p>
   * The value of this constant is 153
   * </p>
   */
  visTagCnnctPt(153),
  /**
   * <p>
   * The rowtype of a row in a visSectionConnectionPts with named rows.
   * </p>
   * <p>
   * The value of this constant is 185
   * </p>
   */
  visTagCnnctNamed(185),
  /**
   * <p>
   * The rowtype of an extended row in a visSectionConnectionPts with unnamed rows. Seldom used in practice.
   * </p>
   * <p>
   * The value of this constant is 186
   * </p>
   */
  visTagCnnctPtABCD(186),
  /**
   * <p>
   * The rowtype of an extended row in a visSectionConnectionPts with named rows. Seldom used in practice.
   * </p>
   * <p>
   * The value of this constant is 187
   * </p>
   */
  visTagCnnctNamedABCD(187),
  /**
   * <p>
   * The rowtype of a row in visSectionControls that doesn't supply a tooltip.
   * </p>
   * <p>
   * The value of this constant is 162
   * </p>
   */
  visTagCtlPt(162),
  /**
   * <p>
   * The rowtype of a row in visSectionControls that does supply a tooltip.
   * </p>
   * <p>
   * The value of this constant is 170
   * </p>
   */
  visTagCtlPtTip(170),
  /**
   * <p>
   * The rowtype of a RelMoveTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 238
   * </p>
   */
  visTagRelMoveTo(238),
  /**
   * <p>
   * The rowtype of a RelLineTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 239
   * </p>
   */
  visTagRelLineTo(239),
  /**
   * <p>
   * The rowtype of a RelEAR row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 240
   * </p>
   */
  visTagRelEllipticalArcTo(240),
  /**
   * <p>
   * The rowtype of a RelCubBezTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 236
   * </p>
   */
  visTagRelCubBezTo(236),
  /**
   * <p>
   * The rowtype of a RelQuadBezTo row in a geometry section.
   * </p>
   * <p>
   * The value of this constant is 237
   * </p>
   */
  visTagRelQuadBezTo(237),
  ;

  private  int value;
  tagVisRowTags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

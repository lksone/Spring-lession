package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Unit codes to be used with cell.result and similar methods.
 * </p>
 */
public enum tagVisUnitCodes implements ComEnum {
  /**
   * <p>
   * Result expressed in internal units. (Inches for distances/positions.)
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visNumber(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  visPercent(33),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  visAcre(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  visHectare(37),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  visDate(40),
  /**
   * <p>
   * Default duration units
   * </p>
   * <p>
   * The value of this constant is 42
   * </p>
   */
  visDurationUnits(42),
  /**
   * <p>
   * Elapsed duration: week
   * </p>
   * <p>
   * The value of this constant is 43
   * </p>
   */
  visElapsedWeek(43),
  /**
   * <p>
   * Elapsed duration: day
   * </p>
   * <p>
   * The value of this constant is 44
   * </p>
   */
  visElapsedDay(44),
  /**
   * <p>
   * Elapsed duration: hour
   * </p>
   * <p>
   * The value of this constant is 45
   * </p>
   */
  visElapsedHour(45),
  /**
   * <p>
   * Elapsed duration: minute
   * </p>
   * <p>
   * The value of this constant is 46
   * </p>
   */
  visElapsedMin(46),
  /**
   * <p>
   * Elapsed duration: second
   * </p>
   * <p>
   * The value of this constant is 47
   * </p>
   */
  visElapsedSec(47),
  /**
   * <p>
   * Specifies default text type units
   * </p>
   * <p>
   * The value of this constant is 48
   * </p>
   */
  visTypeUnits(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  visPicasAndPoints(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  visPoints(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  visPicas(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  visCicerosAndDidots(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  visDidots(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  visCiceros(54),
  /**
   * <p>
   * The value of this constant is 63
   * </p>
   */
  visPageUnits(63),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visDrawingUnits(64),
  /**
   * <p>
   * The value of this constant is 65
   * </p>
   */
  visInches(65),
  /**
   * <p>
   * The value of this constant is 66
   * </p>
   */
  visFeet(66),
  /**
   * <p>
   * The value of this constant is 67
   * </p>
   */
  visFeetAndInches(67),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  visMiles(68),
  /**
   * <p>
   * The value of this constant is 69
   * </p>
   */
  visCentimeters(69),
  /**
   * <p>
   * The value of this constant is 70
   * </p>
   */
  visMillimeters(70),
  /**
   * <p>
   * The value of this constant is 71
   * </p>
   */
  visMeters(71),
  /**
   * <p>
   * The value of this constant is 72
   * </p>
   */
  visKilometers(72),
  /**
   * <p>
   * The value of this constant is 73
   * </p>
   */
  visInchFrac(73),
  /**
   * <p>
   * The value of this constant is 74
   * </p>
   */
  visMileFrac(74),
  /**
   * <p>
   * The value of this constant is 75
   * </p>
   */
  visYards(75),
  /**
   * <p>
   * The value of this constant is 76
   * </p>
   */
  visNautMiles(76),
  /**
   * <p>
   * The value of this constant is 80
   * </p>
   */
  visAngleUnits(80),
  /**
   * <p>
   * The value of this constant is 81
   * </p>
   */
  visDegrees(81),
  /**
   * <p>
   * The value of this constant is 82
   * </p>
   */
  visDegreeMinSec(82),
  /**
   * <p>
   * The value of this constant is 83
   * </p>
   */
  visRadians(83),
  /**
   * <p>
   * The value of this constant is 84
   * </p>
   */
  visMin(84),
  /**
   * <p>
   * The value of this constant is 85
   * </p>
   */
  visSec(85),
  /**
   * <p>
   * The value of this constant is 95
   * </p>
   */
  visUnitsGUID(95),
  /**
   * <p>
   * The value of this constant is 111
   * </p>
   */
  visCurrency(111),
  /**
   * <p>
   * The value of this constant is 138
   * </p>
   */
  visUnitsNURBS(138),
  /**
   * <p>
   * The value of this constant is 139
   * </p>
   */
  visUnitsPolyline(139),
  /**
   * <p>
   * The value of this constant is 225
   * </p>
   */
  visUnitsPoint(225),
  /**
   * <p>
   * The value of this constant is 231
   * </p>
   */
  visUnitsString(231),
  /**
   * <p>
   * The value of this constant is 251
   * </p>
   */
  visUnitsColor(251),
  /**
   * <p>
   * The value of this constant is 252
   * </p>
   */
  visNoCast(252),
  /**
   * <p>
   * The value of this constant is 255
   * </p>
   */
  visUnitsInval(255),
  ;

  private  int value;
  tagVisUnitCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Text field formats.
 * </p>
 */
public enum tagVisFieldFormats implements ComEnum {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visFmtNumGenNoUnits(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visFmtNumGenDefUnits(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visFmt0PlNoUnits(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visFmt0PlDefUnits(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visFmt1PlNoUnits(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visFmt1PlDefUnits(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visFmt2PlNoUnits(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visFmt2PlDefUnits(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visFmt3PlNoUnits(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visFmt3PlDefUnits(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visFmtFeetAndInches(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visFmtRadians(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visFmtDegrees(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visFmtFeetAndInches1Pl(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visFmtFeetAndInches2Pl(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visFmtFraction1PlNoUnits(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visFmtFraction1PlDefUnits(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visFmtFraction2PlNoUnits(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visFmtFraction2PlDefUnits(18),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visFmtDateShort(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visFmtDateLong(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visFmtDateMDYY(22),
  /**
   * <p>
   * The value of this constant is 23
   * </p>
   */
  visFmtDateMMDDYY(23),
  /**
   * <p>
   * The value of this constant is 24
   * </p>
   */
  visFmtDateMmmDYYYY(24),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visFmtDateMmmmDYYYY(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visFmtDateDMYY(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visFmtDateDDMMYY(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visFmtDateDMMMYYYY(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  visFmtDateDMMMMYYYY(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  visFmtTimeGen(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  visFmtTimeHMM(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visFmtTimeHHMM(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  visFmtTimeHMM24(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  visFmtTimeHHMM24(34),
  /**
   * <p>
   * The value of this constant is 35
   * </p>
   */
  visFmtTimeHMMAMPM(35),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  visFmtTimeHHMMAMPM(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  visFmtStrNormal(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  visFmtStrLower(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  visFmtStrUpper(39),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  visFmtJDategggeXmXdXww(40),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  visFmtJDateyyyyXmXdXww(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  visFmtJDategggeXmXdX(42),
  /**
   * <p>
   * The value of this constant is 43
   * </p>
   */
  visFmtJDateyyyyXmXdX(43),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  visFmtJDateyyyymd(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  visFmtJDateyymmdd(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  visFmtJDatehmmaxpx(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  visFmtJDateaxpxhmm(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  visFmtJDateaxpxhXmmX(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  visFmtJDatehXmmX(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  visFmtCDateiiieXmmmmXdddd(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  visFmtCDateiieXmmmmXdddd(51),
  /**
   * <p>
   * Added starting with 5.0c.
   * </p>
   * <p>
   * The value of this constant is 52
   * </p>
   */
  visFmtCDateieXmmmmXddddXww(52),
  /**
   * <p>
   * Changed value from 52 to 53 starting with 5.0c.
   * </p>
   * <p>
   * The value of this constant is 53
   * </p>
   */
  visFmtCDateieXmmmmXdddd(53),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  visFmtDateyyyymd(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  visFmtDateyymmdd(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  visFmtTimeAMPMhmm_J(46),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  visFmtDateTWNfYYYYMMDDD_C(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  visFmtDateTWNsYYYYMMDDD_C(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  visFmtDateTWNfyyyymmddww_C(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  visFmtDateTWNfyyyymmdd_C(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  visFmtDategggemdww_J(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  visFmtDateyyyymdww_J(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  visFmtDategggemd_J(56),
  /**
   * <p>
   * The value of this constant is 57
   * </p>
   */
  visFmtDateyyyymd_J(57),
  /**
   * <p>
   * The value of this constant is 58
   * </p>
   */
  visFmtDateYYYYMMMDDDWWW_C(58),
  /**
   * <p>
   * The value of this constant is 59
   * </p>
   */
  visFmtDateYYYYMMMDDD_C(59),
  /**
   * <p>
   * The value of this constant is 60
   * </p>
   */
  visFmtDategeMMMMddddww_K(60),
  /**
   * <p>
   * The value of this constant is 61
   * </p>
   */
  visFmtDateyyyymdww_K(61),
  /**
   * <p>
   * The value of this constant is 62
   * </p>
   */
  visFmtDategeMMMMddd_K(62),
  /**
   * <p>
   * The value of this constant is 63
   * </p>
   */
  visFmtDateyyyymd_K(63),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visFmtDateyyyy_m_d(64),
  /**
   * <p>
   * The value of this constant is 65
   * </p>
   */
  visFmtDateyy_mm_dd(65),
  /**
   * <p>
   * The value of this constant is 66
   * </p>
   */
  visFmtTimeAMPMhmm_C(66),
  /**
   * <p>
   * The value of this constant is 67
   * </p>
   */
  visFmtTimeAMPMhmm_K(67),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  visFmtTimeAMPM_hmm_J(68),
  /**
   * <p>
   * The value of this constant is 69
   * </p>
   */
  visFmtTimehmm_J(69),
  /**
   * <p>
   * The value of this constant is 70
   * </p>
   */
  visFmtTimeAMPM_hmm_C(70),
  /**
   * <p>
   * The value of this constant is 71
   * </p>
   */
  visFmtTimehmm_C(71),
  /**
   * <p>
   * The value of this constant is 72
   * </p>
   */
  visFmtTimeAMPM_hmm_K(72),
  /**
   * <p>
   * The value of this constant is 73
   * </p>
   */
  visFmtTimehmm_K(73),
  /**
   * <p>
   * The value of this constant is 74
   * </p>
   */
  visFmtTimeHMMAMPM_E(74),
  /**
   * <p>
   * The value of this constant is 75
   * </p>
   */
  visFmtTimeHHMMAMPM_E(75),
  /**
   * <p>
   * The value of this constant is 76
   * </p>
   */
  visFmtDateyyyymd_S(76),
  /**
   * <p>
   * The value of this constant is 77
   * </p>
   */
  visFmtDateyyyymmdd_S(77),
  /**
   * <p>
   * The value of this constant is 78
   * </p>
   */
  visFmtDatewwyyyymmdd_S(78),
  /**
   * <p>
   * The value of this constant is 79
   * </p>
   */
  visFmtDatewwyyyymd_S(79),
  /**
   * <p>
   * The value of this constant is 80
   * </p>
   */
  visFmtTimeAMPMhmm_S(80),
  /**
   * <p>
   * The value of this constant is 81
   * </p>
   */
  visFmtTimeAMPMhhmm_S(81),
  /**
   * <p>
   * The value of this constant is 200
   * </p>
   */
  visFmtMsoDateShort(200),
  /**
   * <p>
   * The value of this constant is 201
   * </p>
   */
  visFmtMsoDateLongDay(201),
  /**
   * <p>
   * The value of this constant is 202
   * </p>
   */
  visFmtMsoDateLong(202),
  /**
   * <p>
   * The value of this constant is 203
   * </p>
   */
  visFmtMsoDateShortAlt(203),
  /**
   * <p>
   * The value of this constant is 204
   * </p>
   */
  visFmtMsoDateISO(204),
  /**
   * <p>
   * The value of this constant is 205
   * </p>
   */
  visFmtMsoDateShortMon(205),
  /**
   * <p>
   * The value of this constant is 206
   * </p>
   */
  visFmtMsoDateShortSlash(206),
  /**
   * <p>
   * The value of this constant is 207
   * </p>
   */
  visFmtMsoDateShortAbb(207),
  /**
   * <p>
   * The value of this constant is 208
   * </p>
   */
  visFmtMsoDateEnglish(208),
  /**
   * <p>
   * The value of this constant is 209
   * </p>
   */
  visFmtMsoDateMonthYr(209),
  /**
   * <p>
   * The value of this constant is 210
   * </p>
   */
  visFmtMsoDateMon_Yr(210),
  /**
   * <p>
   * The value of this constant is 211
   * </p>
   */
  visFmtMsoTimeDatePM(211),
  /**
   * <p>
   * The value of this constant is 212
   * </p>
   */
  visFmtMsoTimeDateSecPM(212),
  /**
   * <p>
   * The value of this constant is 213
   * </p>
   */
  visFmtMsoTimePM(213),
  /**
   * <p>
   * The value of this constant is 214
   * </p>
   */
  visFmtMsoTimeSecPM(214),
  /**
   * <p>
   * The value of this constant is 215
   * </p>
   */
  visFmtMsoTime24(215),
  /**
   * <p>
   * The value of this constant is 216
   * </p>
   */
  visFmtMsoTimeSec24(216),
  /**
   * <p>
   * The value of this constant is 217
   * </p>
   */
  visFmtMsoFEExtra1(217),
  /**
   * <p>
   * The value of this constant is 218
   * </p>
   */
  visFmtMsoFEExtra2(218),
  /**
   * <p>
   * The value of this constant is 219
   * </p>
   */
  visFmtMsoFEExtra3(219),
  /**
   * <p>
   * The value of this constant is 220
   * </p>
   */
  visFmtMsoFEExtra4(220),
  /**
   * <p>
   * The value of this constant is 221
   * </p>
   */
  visFmtMsoFEExtra5(221),
  ;

  private  int value;
  tagVisFieldFormats(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

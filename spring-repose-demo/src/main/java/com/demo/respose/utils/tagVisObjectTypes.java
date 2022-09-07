package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Codes returned by object.ObjectType.
 * </p>
 */
public enum tagVisObjectTypes implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visObjTypeUnknown(1),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visObjTypeApp(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visObjTypeCell(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visObjTypeChars(5),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visObjTypeConnect(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visObjTypeConnects(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visObjTypeDoc(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visObjTypeDocs(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visObjTypeMaster(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visObjTypeMasters(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visObjTypePage(14),
  /**
   * <p>
   * The value of this constant is 15
   * </p>
   */
  visObjTypePages(15),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visObjTypeSelection(16),
  /**
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visObjTypeShape(17),
  /**
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visObjTypeShapes(18),
  /**
   * <p>
   * The value of this constant is 19
   * </p>
   */
  visObjTypeStyle(19),
  /**
   * <p>
   * The value of this constant is 20
   * </p>
   */
  visObjTypeStyles(20),
  /**
   * <p>
   * The value of this constant is 21
   * </p>
   */
  visObjTypeWindow(21),
  /**
   * <p>
   * The value of this constant is 22
   * </p>
   */
  visObjTypeWindows(22),
  /**
   * <p>
   * The value of this constant is 25
   * </p>
   */
  visObjTypeLayer(25),
  /**
   * <p>
   * The value of this constant is 26
   * </p>
   */
  visObjTypeLayers(26),
  /**
   * <p>
   * The value of this constant is 27
   * </p>
   */
  visObjTypeFont(27),
  /**
   * <p>
   * The value of this constant is 28
   * </p>
   */
  visObjTypeFonts(28),
  /**
   * <p>
   * The value of this constant is 29
   * </p>
   */
  visObjTypeColor(29),
  /**
   * <p>
   * The value of this constant is 30
   * </p>
   */
  visObjTypeColors(30),
  /**
   * <p>
   * The value of this constant is 31
   * </p>
   */
  visObjTypeAddon(31),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visObjTypeAddons(32),
  /**
   * <p>
   * The value of this constant is 33
   * </p>
   */
  visObjTypeEvent(33),
  /**
   * <p>
   * The value of this constant is 34
   * </p>
   */
  visObjTypeEventList(34),
  /**
   * <p>
   * The value of this constant is 36
   * </p>
   */
  visObjTypeGlobal(36),
  /**
   * <p>
   * The value of this constant is 37
   * </p>
   */
  visObjTypeHyperlink(37),
  /**
   * <p>
   * The value of this constant is 38
   * </p>
   */
  visObjTypeOLEObjects(38),
  /**
   * <p>
   * The value of this constant is 39
   * </p>
   */
  visObjTypeOLEObject(39),
  /**
   * <p>
   * The value of this constant is 40
   * </p>
   */
  visObjTypePaths(40),
  /**
   * <p>
   * The value of this constant is 41
   * </p>
   */
  visObjTypePath(41),
  /**
   * <p>
   * The value of this constant is 42
   * </p>
   */
  visObjTypeCurve(42),
  /**
   * <p>
   * The value of this constant is 43
   * </p>
   */
  visObjTypeHyperlinks(43),
  /**
   * <p>
   * The value of this constant is 44
   * </p>
   */
  visObjTypeSection(44),
  /**
   * <p>
   * The value of this constant is 45
   * </p>
   */
  visObjTypeRow(45),
  /**
   * <p>
   * The value of this constant is 46
   * </p>
   */
  visObjTypeMasterShortcuts(46),
  /**
   * <p>
   * The value of this constant is 47
   * </p>
   */
  visObjTypeMasterShortcut(47),
  /**
   * <p>
   * The value of this constant is 48
   * </p>
   */
  visObjTypeMSGWrap(48),
  /**
   * <p>
   * The value of this constant is 49
   * </p>
   */
  visObjTypeMouseEvent(49),
  /**
   * <p>
   * The value of this constant is 50
   * </p>
   */
  visObjTypeKeyboardEvent(50),
  /**
   * <p>
   * The value of this constant is 51
   * </p>
   */
  visObjTypeApplicationSettings(51),
  /**
   * <p>
   * The value of this constant is 52
   * </p>
   */
  visObjTypeDataRecordsets(52),
  /**
   * <p>
   * The value of this constant is 53
   * </p>
   */
  visObjTypeDataRecordset(53),
  /**
   * <p>
   * The value of this constant is 54
   * </p>
   */
  visObjTypeDataConnection(54),
  /**
   * <p>
   * The value of this constant is 55
   * </p>
   */
  visObjTypeDataColumns(55),
  /**
   * <p>
   * The value of this constant is 56
   * </p>
   */
  visObjTypeDataColumn(56),
  /**
   * <p>
   * The value of this constant is 57
   * </p>
   */
  visObjTypeDataRecordsetChangedEvent(57),
  /**
   * <p>
   * The value of this constant is 58
   * </p>
   */
  visObjTypeGraphicItems(58),
  /**
   * <p>
   * The value of this constant is 59
   * </p>
   */
  visObjTypeGraphicItem(59),
  /**
   * <p>
   * The value of this constant is 60
   * </p>
   */
  visObjTypeContainerProperties(60),
  /**
   * <p>
   * The value of this constant is 61
   * </p>
   */
  visObjTypeRelatedShapePairEvent(61),
  /**
   * <p>
   * The value of this constant is 62
   * </p>
   */
  visObjTypeMovedSelectionEvent(62),
  /**
   * <p>
   * The value of this constant is 63
   * </p>
   */
  visObjTypeServerPublishOptions(63),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visObjTypeValidation(64),
  /**
   * <p>
   * The value of this constant is 65
   * </p>
   */
  visObjTypeValidationRuleSets(65),
  /**
   * <p>
   * The value of this constant is 66
   * </p>
   */
  visObjTypeValidationRuleSet(66),
  /**
   * <p>
   * The value of this constant is 67
   * </p>
   */
  visObjTypeValidationRules(67),
  /**
   * <p>
   * The value of this constant is 68
   * </p>
   */
  visObjTypeValidationRule(68),
  /**
   * <p>
   * The value of this constant is 69
   * </p>
   */
  visObjTypeValidationIssues(69),
  /**
   * <p>
   * The value of this constant is 70
   * </p>
   */
  visObjTypeValidationIssue(70),
  /**
   * <p>
   * The value of this constant is 71
   * </p>
   */
  visObjTypeReplaceShapesEvent(71),
  /**
   * <p>
   * The value of this constant is 73
   * </p>
   */
  visObjTypeComments(73),
  /**
   * <p>
   * The value of this constant is 74
   * </p>
   */
  visObjTypeComment(74),
  ;

  private  int value;
  tagVisObjectTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D070C-0000-0000-C000-000000000046}")
public interface IVShape extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(7)
  void voidGroup();


  /**
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(8)
  void bringForward();


  /**
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(9)
  void bringToFront();


  /**
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(10)
  void convertToGroup();


  /**
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(11)
  void flipHorizontal();


  /**
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(12)
  void flipVertical();


  /**
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(13)
  void reverseEnds();


  /**
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(14)
  void sendBackward();


  /**
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(15)
  void sendToBack();


  /**
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(16)
  void rotate90();


  /**
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(17)
  void ungroup();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(18)
 

    IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(19)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject parent();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of typeIVApplication
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(20)
 

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(21)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Master"
   * </p>
   * @return  Returns a value of typeIVMaster
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(22)
 

    IVMaster master();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(23)
  short type();


  /**
   * <p>
   * Returns visObjTypeShape (17).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(24)
  short objectType();


  /**
   * <p>
   * Returns cell of this shape with given locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @param localeSpecificCellName Mandatory java.lang.String parameter.
   * @return  Returns a value of typeIVCell
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(25)
 IVCell cells(
    String localeSpecificCellName);


  /**
   * <p>
   * Getter method for the COM property "CellsSRC"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param column Mandatory short parameter.
   * @return  Returns a value of typeIVCell
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(26)
 IVCell cellsSRC(
    short section,
    short row,
    short column);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of typeIVShapes
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(27)
 

    IVShapes shapes();


  @VTID(27)
  @ReturnValue(defaultPropertyThrough={IVShapes.class})
 IVShape shapes(
    @MarshalAs(NativeType.VARIANT) Object nameUIDOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Data1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(28)
  String data1();


  /**
   * <p>
   * Setter method for the COM property "Data1"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(29)
  void data1(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Data2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(30)
  String data2();


  /**
   * <p>
   * Setter method for the COM property "Data2"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(31)
  void data2(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Data3"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(32)
  String data3();


  /**
   * <p>
   * Setter method for the COM property "Data3"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(33)
  void data3(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Help"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(34)
  String help();


  /**
   * <p>
   * Setter method for the COM property "Help"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(35)
  void help(
    String lpbstrRet);


  /**
   * <p>
   * Returns synthetic name of shape (sheet.ID). Locale independent.
   * </p>
   * <p>
   * Getter method for the COM property "NameID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(36)
  String nameID();


  /**
   * <p>
   * Shape's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(37)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Shape's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(38)
  @DefaultMethod
  void name(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(39)
  String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(40)
  void text(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "CharCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(41)
  int charCount();


  /**
   * <p>
   * Getter method for the COM property "Characters"
   * </p>
   * @return  Returns a value of typeIVCharacters
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(42)
 

    IVCharacters characters();


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(43)
  void old_Copy();


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(44)
  void old_Cut();


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(45)
  void delete();


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(46)
  void voidDuplicate();


  /**
   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   * @return  Returns a value of typeIVShape
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(47)
 IVShape drop(
    Com4jObject objectToDrop,
    double xPos,
    double yPos);


  /**
   * <p>
   * Getter method for the COM property "OneD"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(48)
  short oneD();


  /**
   * <p>
   * Setter method for the COM property "OneD"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(49)
  void oneD(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "GeometryCount"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(50)
  short geometryCount();


  /**
   * <p>
   * Getter method for the COM property "RowCount"
   * </p>
   * @param section Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(51)
  short rowCount(
    short section);


  /**
   * @param section Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(52)
  short addSection(
    short section);


  /**
   * @param section Mandatory short parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(53)
  void deleteSection(
    short section);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param rowTag Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(54)
  short addRow(
    short section,
    short row,
    short rowTag);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(55)
  void deleteRow(
    short section,
    short row);


  /**
   * <p>
   * Getter method for the COM property "RowsCellCount"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(56)
  short rowsCellCount(
    short section,
    short row);


  /**
   * <p>
   * Getter method for the COM property "RowType"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(57)
  short rowType(
    short section,
    short row);


  /**
   * <p>
   * Setter method for the COM property "RowType"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(58)
  void rowType(
    short section,
    short row,
    short lpi2Ret);


  /**
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(59)
  void setCenter(
    double xPos,
    double yPos);


  /**
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(60)
  void setBegin(
    double xPos,
    double yPos);


  /**
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(61)
  void setEnd(
    double xPos,
    double yPos);


  /**
   * <p>
   * Getter method for the COM property "Connects"
   * </p>
   * @return  Returns a value of typeIVConnects
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(62)
 IVConnects connects();


  @VTID(62)
  @ReturnValue(defaultPropertyThrough={IVConnects.class})
 IVConnect connects(
    int index);

  /**
   * <p>
   * Getter method for the COM property "Index16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(63)
  short index16();


  /**
   * <p>
   * Locale specific name of style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(64)
  String style();


  /**
   * <p>
   * Locale specific name of style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(65)
  void style(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of style to apply to this shape while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "StyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(66)
  void styleKeepFmt(
    String rhs);


  /**
   * <p>
   * Locale specific name of line style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "LineStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(67)
  String lineStyle();


  /**
   * <p>
   * Locale specific name of line style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "LineStyle"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(68)
  void lineStyle(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of line style to apply to this shape while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "LineStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(69)
  void lineStyleKeepFmt(
    String rhs);


  /**
   * <p>
   * Locale specific name of fill style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "FillStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(70)
  String fillStyle();


  /**
   * <p>
   * Locale specific name of fill style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "FillStyle"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(71)
  void fillStyle(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of fill style to apply to this shape while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "FillStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(72)
  void fillStyleKeepFmt(
    String rhs);


  /**
   * <p>
   * Locale specific name of text style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "TextStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(73)
  String textStyle();


  /**
   * <p>
   * Locale specific name of text style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "TextStyle"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(74)
  void textStyle(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of text style to apply to this shape while keeping local overrides.
   * </p>
   * <p>
   * Setter method for the COM property "TextStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(75)
  void textStyleKeepFmt(
    String rhs);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(76)
  void export(
    String fileName);


  /**
   * <p>
   * Getter method for the COM property "old_AreaIU"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(77)
  double old_AreaIU();


  /**
   * <p>
   * Getter method for the COM property "old_LengthIU"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(78)
  double old_LengthIU();


  /**
   * <p>
   * Getter method for the COM property "GeomExIf"
   * </p>
   * @param fFill Mandatory short parameter.
   * @param lineRes Mandatory double parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(79)
  Com4jObject geomExIf(
    short fFill,
    double lineRes);


  /**
   * <p>
   * Getter method for the COM property "UniqueID"
   * </p>
   * @param fUniqueID Mandatory short parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(80)
  String uniqueID(
    short fUniqueID);


  /**
   * <p>
   * Getter method for the COM property "ContainingPage"
   * </p>
   * @return  Returns a value of typeIVPage
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(81)
 IVPage containingPage();


  /**
   * <p>
   * Getter method for the COM property "ContainingMaster"
   * </p>
   * @return  Returns a value of typeIVMaster
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
  @VTID(82)
  IVMaster containingMaster();


  /**
   * <p>
   * Getter method for the COM property "ContainingShape"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(83)
  IVShape containingShape();


  /**
   * <p>
   * Getter method for the COM property "SectionExists"
   * </p>
   * @param section Mandatory short parameter.
   * @param fExistsLocally Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(84)
  short sectionExists(
    short section,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "RowExists"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param fExistsLocally Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(85)
  short rowExists(
    short section,
    short row,
    short fExistsLocally);


  /**
   * <p>
   * Returns whether this shape has cell with given locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "CellExists"
   * </p>
   * @param localeSpecificCellName Mandatory java.lang.String parameter.
   * @param fExistsLocally Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(86)
  short cellExists(
    String localeSpecificCellName,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "CellsSRCExists"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param column Mandatory short parameter.
   * @param fExistsLocally Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(87)
  short cellsSRCExists(
    short section,
    short row,
    short column,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "LayerCount"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(88)
  short layerCount();


  /**
   * <p>
   * Getter method for the COM property "Layer"
   * </p>
   * @param index Mandatory short parameter.
   * @return  Returns a value of type IVLayer
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(89)
  IVLayer layer(
    short index);


  /**
   * @param section Mandatory short parameter.
   * @param rowName Mandatory java.lang.String parameter.
   * @param rowTag Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(90)
  short addNamedRow(
    short section,
    String rowName,
    short rowTag);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param rowTag Mandatory short parameter.
   * @param rowCount Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(91)
  short addRows(
    short section,
    short row,
    short rowTag,
    short rowCount);


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type IVEventList
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(92)
  IVEventList eventList();


  @VTID(92)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(93)
  short persistsEvents();


  /**
   * @param xBegin Mandatory double parameter.
   * @param yBegin Mandatory double parameter.
   * @param xEnd Mandatory double parameter.
   * @param yEnd Mandatory double parameter.
   * @return  Returns a value of type IVShape
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(94)
  IVShape drawLine(
    double xBegin,
    double yBegin,
    double xEnd,
    double yEnd);


  /**
   * @param x1 Mandatory double parameter.
   * @param y1 Mandatory double parameter.
   * @param x2 Mandatory double parameter.
   * @param y2 Mandatory double parameter.
   * @return  Returns a value of type IVShape
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(95)
  IVShape drawRectangle(
    double x1,
    double y1,
    double x2,
    double y2);


  /**
   * @param x1 Mandatory double parameter.
   * @param y1 Mandatory double parameter.
   * @param x2 Mandatory double parameter.
   * @param y2 Mandatory double parameter.
   * @return  Returns a value of type IVShape
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(96)
  IVShape drawOval(
    double x1,
    double y1,
    double x2,
    double y2);


        /**
         * @param tolerance Mandatory double parameter.
         * @param flags Mandatory short parameter.
         */

        @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
        @VTID(100)
        void fitCurve(
          double tolerance,
          short flags);


        /**
         * @param fileName Mandatory java.lang.String parameter.
         * @return  Returns a value of type IVShape
         */

        @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
        @VTID(101)
        IVShape _import(
          String fileName);


        /**
         */

        @DISPID(83) //= 0x53. The runtime will prefer the VTID if present
        @VTID(102)
        void centerDrawing();


        /**
         * @param fileName Mandatory java.lang.String parameter.
         * @param flags Mandatory short parameter.
         * @return  Returns a value of type IVShape
         */

        @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
        @VTID(103)
        IVShape insertFromFile(
          String fileName,
          short flags);


        /**
         * @param classOrProgID Mandatory java.lang.String parameter.
         * @param flags Mandatory short parameter.
         * @return  Returns a value of type IVShape
         */

        @DISPID(85) //= 0x55. The runtime will prefer the VTID if present
        @VTID(104)
        IVShape insertObject(
          String classOrProgID,
          short flags);


        /**
         * <p>
         * Getter method for the COM property "ClassID"
         * </p>
         * @return  Returns a value of type java.lang.String
         */

        @DISPID(86) //= 0x56. The runtime will prefer the VTID if present
        @VTID(105)
        String classID();


        /**
         * <p>
         * Getter method for the COM property "ForeignType"
         * </p>
         * @return  Returns a value of type short
         */

        @DISPID(87) //= 0x57. The runtime will prefer the VTID if present
        @VTID(106)
        short foreignType();


        /**
         * <p>
         * Getter method for the COM property "Object"
         * </p>
         * @return  Returns a value of type com4j.Com4jObject
         */

        @DISPID(88) //= 0x58. The runtime will prefer the VTID if present
        @VTID(107)
        @ReturnValue(type=NativeType.Dispatch)
        Com4jObject object();


        /**
         * @return  Returns a value of type IVWindow
         */

        @DISPID(89) //= 0x59. The runtime will prefer the VTID if present
        @VTID(108)
        IVWindow openDrawWindow();


        /**
         * @return  Returns a value of type IVWindow
         */

        @DISPID(90) //= 0x5a. The runtime will prefer the VTID if present
        @VTID(109)
        IVWindow openSheetWindow();


        /**
         * <p>
         * Getter method for the COM property "ID16"
         * </p>
         * @return  Returns a value of type short
         */

        @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
        @VTID(110)
        short iD16();


                  /**
                   * <p>
                   * Getter method for the COM property "FromConnects"
                   * </p>
                   * @return  Returns a value of type IVConnects
                   */

                  @DISPID(97) //= 0x61. The runtime will prefer the VTID if present
                  @VTID(116)
                  IVConnects fromConnects();


                  @VTID(116)
                  @ReturnValue(defaultPropertyThrough={IVConnects.class})
                  IVConnect fromConnects(
                    int index);

                  /**
                   */

                  @DISPID(98) //= 0x62. The runtime will prefer the VTID if present
                  @VTID(117)
                  void layout();


                  /**
                   * @param flags Mandatory short parameter.
                   * @param lpr8Left Mandatory Holder<Double> parameter.
                   * @param lpr8Bottom Mandatory Holder<Double> parameter.
                   * @param lpr8Right Mandatory Holder<Double> parameter.
                   * @param lpr8Top Mandatory Holder<Double> parameter.
                   */

                  @DISPID(99) //= 0x63. The runtime will prefer the VTID if present
                  @VTID(118)
                  void boundingBox(
                    short flags,
                    Holder<Double> lpr8Left,
                    Holder<Double> lpr8Bottom,
                    Holder<Double> lpr8Right,
                    Holder<Double> lpr8Top);


                  /**
                   * @param xPos Mandatory double parameter.
                   * @param yPos Mandatory double parameter.
                   * @param tolerance Mandatory double parameter.
                   * @return  Returns a value of type short
                   */

                  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
                  @VTID(119)
                  short hitTest(
                    double xPos,
                    double yPos,
                    double tolerance);


                  /**
                   * <p>
                   * Getter method for the COM property "Hyperlink"
                   * </p>
                   * @return  Returns a value of type IVHyperlink
                   */

                  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
                  @VTID(120)
                  IVHyperlink hyperlink();


                  /**
                   * <p>
                   * Getter method for the COM property "ProgID"
                   * </p>
                   * @return  Returns a value of type java.lang.String
                   */

                  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
                  @VTID(121)
                  String progID();


                  /**
                   * <p>
                   * Getter method for the COM property "ObjectIsInherited"
                   * </p>
                   * @return  Returns a value of type short
                   */

                  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
                  @VTID(122)
                  short objectIsInherited();


                  /**
                   * <p>
                   * Getter method for the COM property "Paths"
                   * </p>
                   * @return  Returns a value of type IVPaths
                   */

                  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
                  @VTID(123)
                  IVPaths paths();


                  @VTID(123)
                  @ReturnValue(defaultPropertyThrough={IVPaths.class})
                  IVPath paths(
                    int index);

                  /**
                   * <p>
                   * Getter method for the COM property "PathsLocal"
                   * </p>
                   * @return  Returns a value of type IVPaths
                   */

                  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
                  @VTID(124)
                  IVPaths pathsLocal();


                  @VTID(124)
                  @ReturnValue(defaultPropertyThrough={IVPaths.class})
                  IVPath pathsLocal(
                    int index);

                  /**
                   * @return  Returns a value of type IVHyperlink
                   */

                  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
                  @VTID(125)
                  IVHyperlink addHyperlink();


                  /**
                   * <p>
                   * Getter method for the COM property "ID"
                   * </p>
                   * @return  Returns a value of type int
                   */

                  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
                  @VTID(126)
                  int id();


                  /**
                   * <p>
                   * Getter method for the COM property "Index"
                   * </p>
                   * @return  Returns a value of type int
                   */

                  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
                  @VTID(127)
                  int index();


                  /**
                   * <p>
                   * Getter method for the COM property "Section"
                   * </p>
                   * @param index Mandatory short parameter.
                   * @return  Returns a value of type IVSection
                   */

                  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
                  @VTID(128)
                  IVSection section(
                    short index);


                  /**
                   * <p>
                   * Getter method for the COM property "Hyperlinks"
                   * </p>
                   * @return  Returns a value of type IVHyperlinks
                   */

                  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
                  @VTID(129)
                  IVHyperlinks hyperlinks();


                  @VTID(129)
                  @ReturnValue(defaultPropertyThrough={IVHyperlinks.class})
                  IVHyperlink hyperlinks(
                    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

                  /**
                   * <p>
                   * Getter method for the COM property "SpatialRelation"
                   * </p>
                   * @param otherShape Mandatory IVShape parameter.
                   * @param tolerance Mandatory double parameter.
                   * @param flags Mandatory short parameter.
                   * @return  Returns a value of type short
                   */

                  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
                  @VTID(130)
                  short spatialRelation(
                    IVShape otherShape,
                    double tolerance,
                    short flags);


                  /**
                   * <p>
                   * Getter method for the COM property "DistanceFrom"
                   * </p>
                   * @param otherShape Mandatory IVShape parameter.
                   * @param flags Mandatory short parameter.
                   * @return  Returns a value of type double
                   */

                  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
                  @VTID(131)
                  double distanceFrom(
                    IVShape otherShape,
                    short flags);


                  /**
                   * <p>
                   * Getter method for the COM property "DistanceFromPoint"
                   * </p>
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param flags Mandatory short parameter.
                   * @param pvPathIndex Optional parameter. Default value is com4j.Variant.getMissing()
                   * @param pvCurveIndex Optional parameter. Default value is com4j.Variant.getMissing()
                   * @param pvt Optional parameter. Default value is com4j.Variant.getMissing()
                   * @return  Returns a value of type double
                   */

                  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
                  @VTID(132)
                  double distanceFromPoint(
                    double x,
                    double y,
                    short flags,
                    @Optional Object pvPathIndex,
                    @Optional Object pvCurveIndex,
                    @Optional Object pvt);


                  /**
                   * <p>
                   * Getter method for the COM property "SpatialNeighbors"
                   * </p>
                   * @param relation Mandatory short parameter.
                   * @param tolerance Mandatory double parameter.
                   * @param flags Mandatory short parameter.
                   * @param resultRoot Optional parameter. Default value is com4j.Variant.getMissing()
                   * @return  Returns a value of type IVSelection
                   */

                  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
                  @VTID(133)
                  IVSelection spatialNeighbors(
                    short relation,
                    double tolerance,
                    short flags,
                    @Optional @MarshalAs(NativeType.VARIANT) Object resultRoot);


                  /**
                   * <p>
                   * Getter method for the COM property "SpatialSearch"
                   * </p>
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param relation Mandatory short parameter.
                   * @param tolerance Mandatory double parameter.
                   * @param flags Mandatory short parameter.
                   * @return  Returns a value of type IVSelection
                   */

                  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
                  @VTID(134)
                  IVSelection spatialSearch(
                    double x,
                    double y,
                    short relation,
                    double tolerance,
                    short flags);


                  /**
                   * @param otherShape Mandatory IVShape parameter.
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param xprime Mandatory Holder<Double> parameter.
                   * @param yprime Mandatory Holder<Double> parameter.
                   */

                  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
                  @VTID(135)
                  void transformXYTo(
                    IVShape otherShape,
                    double x,
                    double y,
                    Holder<Double> xprime,
                    Holder<Double> yprime);


                  /**
                   * @param otherShape Mandatory IVShape parameter.
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param xprime Mandatory Holder<Double> parameter.
                   * @param yprime Mandatory Holder<Double> parameter.
                   */

                  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
                  @VTID(136)
                  void transformXYFrom(
                    IVShape otherShape,
                    double x,
                    double y,
                    Holder<Double> xprime,
                    Holder<Double> yprime);


                  /**
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param xprime Mandatory Holder<Double> parameter.
                   * @param yprime Mandatory Holder<Double> parameter.
                   */

                  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
                  @VTID(137)
                  void xyToPage(
                    double x,
                    double y,
                    Holder<Double> xprime,
                    Holder<Double> yprime);


                  /**
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param xprime Mandatory Holder<Double> parameter.
                   * @param yprime Mandatory Holder<Double> parameter.
                   */

                  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
                  @VTID(138)
                  void xyFromPage(
                    double x,
                    double y,
                    Holder<Double> xprime,
                    Holder<Double> yprime);


                  /**
                   */

                  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
                  @VTID(139)
                  void updateAlignmentBox();


                  /**
                   * <p>
                   * Returns cell of this shape with given locale independent name.
                   * </p>
                   * <p>
                   * Getter method for the COM property "CellsU"
                   * </p>
                   * @param localeIndependentCellName Mandatory java.lang.String parameter.
                   * @return  Returns a value of type IVCell
                   */

                  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
                  @VTID(140)
                  IVCell cellsU(
                    String localeIndependentCellName);


                  /**
                   * <p>
                   * Shape's locale independent name.
                   * </p>
                   * <p>
                   * Getter method for the COM property "NameU"
                   * </p>
                   * @return  Returns a value of type java.lang.String
                   */

                  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
                  @VTID(141)
                  String nameU();


                  /**
                   * <p>
                   * Shape's locale independent name.
                   * </p>
                   * <p>
                   * Setter method for the COM property "NameU"
                   * </p>
                   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
                   */

                  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
                  @VTID(142)
                  void nameU(
                    String lpLocaleIndependentName);


                  /**
                   * <p>
                   * Returns whether this shape has cell with given locale independent name.
                   * </p>
                   * <p>
                   * Getter method for the COM property "CellExistsU"
                   * </p>
                   * @param localeIndependentCellName Mandatory java.lang.String parameter.
                   * @param fExistsLocally Mandatory short parameter.
                   * @return  Returns a value of type short
                   */

                  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
                  @VTID(143)
                  short cellExistsU(
                    String localeIndependentCellName,
                    short fExistsLocally);


                        /**
                         * <p>
                         * Returns index of row of cell with given locale specific name.
                         * </p>
                         * <p>
                         * Getter method for the COM property "CellsRowIndex"
                         * </p>
                         * @param localeSpecificCellName Mandatory java.lang.String parameter.
                         * @return  Returns a value of type short
                         */

                        @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
                        @VTID(147)
                        short cellsRowIndex(
                          String localeSpecificCellName);


                        /**
                         * <p>
                         * Returns index of row of cell with given locale independent name.
                         * </p>
                         * <p>
                         * Getter method for the COM property "CellsRowIndexU"
                         * </p>
                         * @param localeIndependentCellName Mandatory java.lang.String parameter.
                         * @return  Returns a value of type short
                         */

                        @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
                        @VTID(148)
                        short cellsRowIndexU(
                          String localeIndependentCellName);


                        /**
                         * <p>
                         * Getter method for the COM property "IsOpenForTextEdit"
                         * </p>
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
                        @VTID(149)
                        boolean isOpenForTextEdit();


                        /**
                         * <p>
                         * If shape is part of a master instance, returns the top level shape of the instance. Otherwise, returns Nothing.
                         * </p>
                         * <p>
                         * Getter method for the COM property "RootShape"
                         * </p>
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743951) //= 0x6002008f. The runtime will prefer the VTID if present
                        @VTID(150)
                        IVShape rootShape();


                        /**
                         * <p>
                         * If shape is part of a master instance, returns the shape in the master from which this one inherits. Otherwise, returns Nothing.
                         * </p>
                         * <p>
                         * Getter method for the COM property "MasterShape"
                         * </p>
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743952) //= 0x60020090. The runtime will prefer the VTID if present
                        @VTID(151)
                        IVShape masterShape();


                        /**
                         * <p>
                         * Getter method for the COM property "Picture"
                         * </p>
                         * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
                         */

                        @DISPID(1610743953) //= 0x60020091. The runtime will prefer the VTID if present
                        @VTID(152)
                        Holder<com4j.stdole.IPictureDisp> picture();


                        /**
                         * <p>
                         * Returns the created group shape
                         * </p>
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743954) //= 0x60020092. The runtime will prefer the VTID if present
                        @VTID(153)
                        IVShape group();


                        /**
                         * <p>
                         * Returns the duplicated shape
                         * </p>
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743955) //= 0x60020093. The runtime will prefer the VTID if present
                        @VTID(154)
                        IVShape duplicate();


                        /**
                         * <p>
                         * Performs end point and glue swapping on 1D shapes
                         * </p>
                         */

                        @DISPID(1610743956) //= 0x60020094. The runtime will prefer the VTID if present
                        @VTID(155)
                        void swapEnds();


                        /**
                         * <p>
                         * Setter method for the COM property "Parent"
                         * </p>
                         * @param lpdispRet Mandatory com4j.Com4jObject parameter.
                         */

                        @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
                        @VTID(156)
                        void parent(
                          @MarshalAs(NativeType.Dispatch) Com4jObject lpdispRet);


                        /**
                         * <p>
                         * If Type = visTypeForeignObject, then this data will be the metafile, bitmap, or OLE data for the shape.
                         * </p>
                         * <p>
                         * Getter method for the COM property "ForeignData"
                         * </p>
                         * @return  Returns a value of type byte[]
                         */

                        @DISPID(1610743958) //= 0x60020096. The runtime will prefer the VTID if present
                        @VTID(157)
                        byte[] foreignData();


                        /**
                         * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743959) //= 0x60020097. The runtime will prefer the VTID if present
                        @VTID(158)
                        void copy(
                          @Optional @MarshalAs(NativeType.VARIANT) Object flags);


                        /**
                         * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743960) //= 0x60020098. The runtime will prefer the VTID if present
                        @VTID(159)
                        void cut(
                          @Optional @MarshalAs(NativeType.VARIANT) Object flags);


                        /**
                         * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743961) //= 0x60020099. The runtime will prefer the VTID if present
                        @VTID(160)
                        void paste(
                          @Optional @MarshalAs(NativeType.VARIANT) Object flags);


                        /**
                         * @param format Mandatory int parameter.
                         * @param link Optional parameter. Default value is com4j.Variant.getMissing()
                         * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743962) //= 0x6002009a. The runtime will prefer the VTID if present
                        @VTID(161)
                        void pasteSpecial(
                          int format,
                          @Optional @MarshalAs(NativeType.VARIANT) Object link,
                          @Optional @MarshalAs(NativeType.VARIANT) Object displayAsIcon);


                        /**
                         * @param selType Mandatory VisSelectionTypes parameter.
                         * @param iterationMode Optional parameter. Default value is 256
                         * @param data Optional parameter. Default value is com4j.Variant.getMissing()
                         * @return  Returns a value of type IVSelection
                         */

                        @DISPID(1610743963) //= 0x6002009b. The runtime will prefer the VTID if present
                        @VTID(162)
                        IVSelection createSelection(
                          VisSelectionTypes selType,
                          @Optional @DefaultValue("256") tagVisSelectMode iterationMode,
                          @Optional @MarshalAs(NativeType.VARIANT) Object data);


                        /**
                         * <p>
                         * Getter method for the COM property "Language"
                         * </p>
                         * @return  Returns a value of type int
                         */

                        @DISPID(1610743964) //= 0x6002009c. The runtime will prefer the VTID if present
                        @VTID(163)
                        int language();


                        /**
                         * <p>
                         * Setter method for the COM property "Language"
                         * </p>
                         * @param lpLangID Mandatory int parameter.
                         */

                        @DISPID(1610743964) //= 0x6002009c. The runtime will prefer the VTID if present
                        @VTID(164)
                        void language(
                          int lpLangID);


                        /**
                         * @param distance Mandatory double parameter.
                         */

                        @DISPID(1610743966) //= 0x6002009e. The runtime will prefer the VTID if present
                        @VTID(165)
                        void offset(
                          double distance);


                        /**
                         * @param type Mandatory short parameter.
                         * @param xPos Mandatory double parameter.
                         * @param yPos Mandatory double parameter.
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743967) //= 0x6002009f. The runtime will prefer the VTID if present
                        @VTID(166)
                        IVShape addGuide(
                          short type,
                          double xPos,
                          double yPos);


                        /**
                         * <p>
                         * Getter method for the COM property "AreaIU"
                         * </p>
                         * @param fIncludeSubShapes Optional parameter. Default value is false
                         * @return  Returns a value of type double
                         */

                        @DISPID(1610743968) //= 0x600200a0. The runtime will prefer the VTID if present
                        @VTID(167)
                        double areaIU(
                          @Optional @DefaultValue("0") boolean fIncludeSubShapes);


                        /**
                         * <p>
                         * Getter method for the COM property "LengthIU"
                         * </p>
                         * @param fIncludeSubShapes Optional parameter. Default value is false
                         * @return  Returns a value of type double
                         */

                        @DISPID(1610743969) //= 0x600200a1. The runtime will prefer the VTID if present
                        @VTID(168)
                        double lengthIU(
                          @Optional @DefaultValue("0") boolean fIncludeSubShapes);


                        /**
                         * @param xBegin Mandatory double parameter.
                         * @param yBegin Mandatory double parameter.
                         * @param xEnd Mandatory double parameter.
                         * @param yEnd Mandatory double parameter.
                         * @param xControl Mandatory double parameter.
                         * @param yControl Mandatory double parameter.
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743970) //= 0x600200a2. The runtime will prefer the VTID if present
                        @VTID(169)
                        IVShape drawArcByThreePoints(
                          double xBegin,
                          double yBegin,
                          double xEnd,
                          double yEnd,
                          double xControl,
                          double yControl);


                        /**
                         * @param xBegin Mandatory double parameter.
                         * @param yBegin Mandatory double parameter.
                         * @param xEnd Mandatory double parameter.
                         * @param yEnd Mandatory double parameter.
                         * @param sweepFlag Mandatory VisArcSweepFlags parameter.
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743971) //= 0x600200a3. The runtime will prefer the VTID if present
                        @VTID(170)
                        IVShape drawQuarterArc(
                          double xBegin,
                          double yBegin,
                          double xEnd,
                          double yEnd,
                          VisArcSweepFlags sweepFlag);


                        /**
                         * @param xCenter Mandatory double parameter.
                         * @param yCenter Mandatory double parameter.
                         * @param radius Mandatory double parameter.
                         * @param startAngle Optional parameter. Default value is 0.0
                         * @param endAngle Optional parameter. Default value is 3.1415927410125732
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743972) //= 0x600200a4. The runtime will prefer the VTID if present
                        @VTID(171)
                        IVShape drawCircularArc(
                          double xCenter,
                          double yCenter,
                          double radius,
                          @Optional @DefaultValue("0") double startAngle,
                          @Optional @DefaultValue("3.14159274101257") double endAngle);


                        /**
                         * <p>
                         * Getter method for the COM property "ContainingPageID"
                         * </p>
                         * @return  Returns a value of type int
                         */

                        @DISPID(1610743973) //= 0x600200a5. The runtime will prefer the VTID if present
                        @VTID(172)
                        int containingPageID();


                        /**
                         * <p>
                         * Getter method for the COM property "ContainingMasterID"
                         * </p>
                         * @return  Returns a value of type int
                         */

                        @DISPID(1610743974) //= 0x600200a6. The runtime will prefer the VTID if present
                        @VTID(173)
                        int containingMasterID();


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         * @param rowID Mandatory int parameter.
                         * @param applyDataGraphicAfterLink Optional parameter. Default value is false
                         */

                        @DISPID(1610743975) //= 0x600200a7. The runtime will prefer the VTID if present
                        @VTID(174)
                        void linkToData(
                          int dataRecordsetID,
                          int rowID,
                          @Optional @DefaultValue("-1") boolean applyDataGraphicAfterLink);


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         */

                        @DISPID(1610743976) //= 0x600200a8. The runtime will prefer the VTID if present
                        @VTID(175)
                        void breakLinkToData(
                          int dataRecordsetID);


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         * @return  Returns a value of type int
                         */

                        @DISPID(1610743977) //= 0x600200a9. The runtime will prefer the VTID if present
                        @VTID(176)
                        int getLinkedDataRow(
                          int dataRecordsetID);


                        /**
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743978) //= 0x600200aa. The runtime will prefer the VTID if present
                        @VTID(177)
                        int[] getLinkedDataRecordsetIDs();


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743979) //= 0x600200ab. The runtime will prefer the VTID if present
                        @VTID(178)
                        int[] getCustomPropertiesLinkedToData(
                          int dataRecordsetID);


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         * @param customPropertyIndex Mandatory int parameter.
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743980) //= 0x600200ac. The runtime will prefer the VTID if present
                        @VTID(179)
                        boolean isCustomPropertyLinked(
                          int dataRecordsetID,
                          int customPropertyIndex);


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         * @param customPropertyIndex Mandatory int parameter.
                         * @return  Returns a value of type java.lang.String
                         */

                        @DISPID(1610743981) //= 0x600200ad. The runtime will prefer the VTID if present
                        @VTID(180)
                        String getCustomPropertyLinkedColumn(
                          int dataRecordsetID,
                          int customPropertyIndex);


                        /**
                         * @param toShape Mandatory IVShape parameter.
                         * @param placementDir Mandatory VisAutoConnectDir parameter.
                         * @param connector Optional parameter. Default value is unprintable.
                         */

                        @DISPID(1610743982) //= 0x600200ae. The runtime will prefer the VTID if present
                        @VTID(181)
                        void autoConnect(
                          IVShape toShape,
                          VisAutoConnectDir placementDir,
                          @Optional Com4jObject connector);


                        /**
                         * <p>
                         * Getter method for the COM property "DataGraphic"
                         * </p>
                         * @return  Returns a value of type IVMaster
                         */

                        @DISPID(1610743983) //= 0x600200af. The runtime will prefer the VTID if present
                        @VTID(182)
                        IVMaster dataGraphic();


                        /**
                         * <p>
                         * Setter method for the COM property "DataGraphic"
                         * </p>
                         * @param dataGraphic Mandatory IVMaster parameter.
                         */

                        @DISPID(1610743983) //= 0x600200af. The runtime will prefer the VTID if present
                        @VTID(183)
                        void dataGraphic(
                          IVMaster dataGraphic);


                        /**
                         * <p>
                         * Getter method for the COM property "IsDataGraphicCallout"
                         * </p>
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743985) //= 0x600200b1. The runtime will prefer the VTID if present
                        @VTID(184)
                        boolean isDataGraphicCallout();


                        /**
                         * <p>
                         * Getter method for the COM property "ContainerProperties"
                         * </p>
                         * @return  Returns a value of type IVContainerProperties
                         */

                        @DISPID(1610743986) //= 0x600200b2. The runtime will prefer the VTID if present
                        @VTID(185)
                        IVContainerProperties containerProperties();


                        /**
                         * @param category Mandatory java.lang.String parameter.
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743987) //= 0x600200b3. The runtime will prefer the VTID if present
                        @VTID(186)
                        boolean hasCategory(
                          String category);


                        /**
                         * <p>
                         * Getter method for the COM property "MemberOfContainers"
                         * </p>
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743988) //= 0x600200b4. The runtime will prefer the VTID if present
                        @VTID(187)
                        int[] memberOfContainers();


                        /**
                         * @param flags Mandatory VisConnectedShapesFlags parameter.
                         * @param categoryFilter Mandatory java.lang.String parameter.
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743989) //= 0x600200b5. The runtime will prefer the VTID if present
                        @VTID(188)
                        int[] connectedShapes(
                          VisConnectedShapesFlags flags,
                          String categoryFilter);


                        /**
                         * @param flags Mandatory VisGluedShapesFlags parameter.
                         * @param categoryFilter Mandatory java.lang.String parameter.
                         * @param pOtherConnectedShape Optional parameter. Default value is unprintable.
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743990) //= 0x600200b6. The runtime will prefer the VTID if present
                        @VTID(189)
                        int[] gluedShapes(
                          VisGluedShapesFlags flags,
                          String categoryFilter,
                          @Optional IVShape pOtherConnectedShape);


                        /**
                         * @param connectorEnd Mandatory VisConnectorEnds parameter.
                         * @param offsetX Mandatory double parameter.
                         * @param offsetY Mandatory double parameter.
                         * @param units Mandatory tagVisUnitCodes parameter.
                         */

                        @DISPID(1610743991) //= 0x600200b7. The runtime will prefer the VTID if present
                        @VTID(190)
                        void disconnect(
                          VisConnectorEnds connectorEnd,
                          double offsetX,
                          double offsetY,
                          tagVisUnitCodes units);


                        /**
                         * <p>
                         * Getter method for the COM property "IsCallout"
                         * </p>
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743992) //= 0x600200b8. The runtime will prefer the VTID if present
                        @VTID(191)
                        boolean isCallout();


                        /**
                         * <p>
                         * Getter method for the COM property "CalloutTarget"
                         * </p>
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743993) //= 0x600200b9. The runtime will prefer the VTID if present
                        @VTID(192)
                        IVShape calloutTarget();


                        /**
                         * <p>
                         * Setter method for the COM property "CalloutTarget"
                         * </p>
                         * @param pCalloutShape Mandatory IVShape parameter.
                         */

                        @DISPID(1610743993) //= 0x600200b9. The runtime will prefer the VTID if present
                        @VTID(193)
                        void calloutTarget(
                          IVShape pCalloutShape);


                        /**
                         * <p>
                         * Getter method for the COM property "CalloutsAssociated"
                         * </p>
                         * @return  Returns a value of type int[]
                         */

                        @DISPID(1610743995) //= 0x600200bb. The runtime will prefer the VTID if present
                        @VTID(194)
                        int[] calloutsAssociated();


                        /**
                         * @param direction Mandatory VisResizeDirection parameter.
                         * @param distance Mandatory double parameter.
                         * @param unitCode Mandatory tagVisUnitCodes parameter.
                         */

                        @DISPID(1610743996) //= 0x600200bc. The runtime will prefer the VTID if present
                        @VTID(195)
                        void resize(
                          VisResizeDirection direction,
                          double distance,
                          tagVisUnitCodes unitCode);


                        /**
                         */

                        @DISPID(1610743997) //= 0x600200bd. The runtime will prefer the VTID if present
                        @VTID(196)
                        void addToContainers();


                        /**
                         */

                        @DISPID(1610743998) //= 0x600200be. The runtime will prefer the VTID if present
                        @VTID(197)
                        void removeFromContainers();


                        /**
                         * @return  Returns a value of type IVPage
                         */

                        @DISPID(1610743999) //= 0x600200bf. The runtime will prefer the VTID if present
                        @VTID(198)
                        IVPage createSubProcess();


                        /**
                         * @param page Mandatory IVPage parameter.
                         * @param objectToDrop Mandatory com4j.Com4jObject parameter.
                         * @param newShape Optional parameter. Default value is 0
                         * @return  Returns a value of type IVSelection
                         */

                        @DISPID(1610744000) //= 0x600200c0. The runtime will prefer the VTID if present
                        @VTID(199)
                        IVSelection moveToSubprocess(
                          IVPage page,
                          Com4jObject objectToDrop,
                          @Optional @DefaultValue("0") Holder<IVShape> newShape);


                        /**
                         * @param delFlags Mandatory int parameter.
                         */

                        @DISPID(1610744001) //= 0x600200c1. The runtime will prefer the VTID if present
                        @VTID(200)
                        void deleteEx(
                          int delFlags);


                        /**
                         * @param masterOrMasterShortcutToDrop Mandatory com4j.Com4jObject parameter.
                         * @param replaceFlags Optional parameter. Default value is 0
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610744002) //= 0x600200c2. The runtime will prefer the VTID if present
                        @VTID(201)
                        IVShape replaceShape(
                          Com4jObject masterOrMasterShortcutToDrop,
                          @Optional @DefaultValue("0") int replaceFlags);


                        /**
                         * @param lineMatrix Mandatory VisQuickStyleMatrixIndices parameter.
                         * @param fillMatrix Mandatory VisQuickStyleMatrixIndices parameter.
                         * @param effectsMatrix Mandatory VisQuickStyleMatrixIndices parameter.
                         * @param fontMatrix Mandatory VisQuickStyleMatrixIndices parameter.
                         * @param lineColor Mandatory VisQuickStyleColors parameter.
                         * @param fillColor Mandatory VisQuickStyleColors parameter.
                         * @param shadowColor Mandatory VisQuickStyleColors parameter.
                         * @param fontColor Mandatory VisQuickStyleColors parameter.
                         */

                        @DISPID(1610744003) //= 0x600200c3. The runtime will prefer the VTID if present
                        @VTID(202)
                        void setQuickStyle(
                          VisQuickStyleMatrixIndices lineMatrix,
                          VisQuickStyleMatrixIndices fillMatrix,
                          VisQuickStyleMatrixIndices effectsMatrix,
                          VisQuickStyleMatrixIndices fontMatrix,
                          VisQuickStyleColors lineColor,
                          VisQuickStyleColors fillColor,
                          VisQuickStyleColors shadowColor,
                          VisQuickStyleColors fontColor);


                        /**
                         * @param fileName Mandatory java.lang.String parameter.
                         * @param changePictureFlags Optional parameter. Default value is 0
                         * @return  Returns a value of type double
                         */

                        @DISPID(1610744004) //= 0x600200c4. The runtime will prefer the VTID if present
                        @VTID(203)
                        double changePicture(
                          String fileName,
                          @Optional @DefaultValue("0") int changePictureFlags);


                        /**
                         * <p>
                         * Getter method for the COM property "Comments"
                         * </p>
                         * @return  Returns a value of type IVComments
                         */

                        @DISPID(1610744005) //= 0x600200c5. The runtime will prefer the VTID if present
                        @VTID(204)
                        IVComments comments();


                        @VTID(204)
                        @ReturnValue(defaultPropertyThrough={IVComments.class})
                        IVComment comments(
                          int index);

                        /**
                         * @param flags Mandatory short parameter.
                         * @param lpr8Left Mandatory Holder<Double> parameter.
                         * @param lpr8Bottom Mandatory Holder<Double> parameter.
                         * @param lpr8Right Mandatory Holder<Double> parameter.
                         * @param lpr8Top Mandatory Holder<Double> parameter.
                         */

                        @DISPID(1610744006) //= 0x600200c6. The runtime will prefer the VTID if present
                        @VTID(205)
                        void visualBoundingBox(
                          short flags,
                          Holder<Double> lpr8Left,
                          Holder<Double> lpr8Bottom,
                          Holder<Double> lpr8Right,
                          Holder<Double> lpr8Top);


                        /**
                         * <p>
                         * Getter method for the COM property "Title"
                         * </p>
                         * @return  Returns a value of type java.lang.String
                         */

                        @DISPID(1610744007) //= 0x600200c7. The runtime will prefer the VTID if present
                        @VTID(206)
                        String title();


                        /**
                         * <p>
                         * Setter method for the COM property "Title"
                         * </p>
                         * @param pTitle Mandatory java.lang.String parameter.
                         */

                        @DISPID(1610744007) //= 0x600200c7. The runtime will prefer the VTID if present
                        @VTID(207)
                        void title(
                          String pTitle);


                        /**
                         * <p>
                         * Getter method for the COM property "AlternativeText"
                         * </p>
                         * @return  Returns a value of type java.lang.String
                         */

                        @DISPID(1610744009) //= 0x600200c9. The runtime will prefer the VTID if present
                        @VTID(208)
                        String alternativeText();


                        /**
                         * <p>
                         * Setter method for the COM property "AlternativeText"
                         * </p>
                         * @param pAlternativeText Mandatory java.lang.String parameter.
                         */

                        @DISPID(1610744009) //= 0x600200c9. The runtime will prefer the VTID if present
                        @VTID(209)
                        void alternativeText(
                          String pAlternativeText);


                        /**
                         * <p>
                         * Getter method for the COM property "NavigationIndex"
                         * </p>
                         * @return  Returns a value of type int
                         */

                        @DISPID(1610744011) //= 0x600200cb. The runtime will prefer the VTID if present
                        @VTID(210)
                        int navigationIndex();


                        /**
                         * <p>
                         * Setter method for the COM property "NavigationIndex"
                         * </p>
                         * @param lpIndex Mandatory int parameter.
                         */

                        @DISPID(1610744011) //= 0x600200cb. The runtime will prefer the VTID if present
                        @VTID(211)
                        void navigationIndex(
                          int lpIndex);


                        /**
                         * @param dataRecordsetID Mandatory int parameter.
                         */

                        @DISPID(1610744013) //= 0x600200cd. The runtime will prefer the VTID if present
                        @VTID(212)
                        void visualizeData(
                          int dataRecordsetID);


                        // Properties:
                      }

package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D0705-0000-0000-C000-000000000046}")
public interface IVDocument extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type IVApplication
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Returns visObjTypeDoc (10).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "InPlace"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(10)
  short inPlace();


  /**
   * <p>
   * Getter method for the COM property "Masters"
   * </p>
   * @return  Returns a value of type IVMasters
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(11)
  IVMasters masters();


  @VTID(11)
  @ReturnValue(defaultPropertyThrough={IVMasters.class})
  IVMaster masters(
    @MarshalAs(NativeType.VARIANT) Object nameUIDOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Pages"
   * </p>
   * @return  Returns a value of type IVPages
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(12)
  IVPages pages();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={IVPages.class})
  IVPage pages(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Styles"
   * </p>
   * @return  Returns a value of type IVStyles
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  IVStyles styles();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={IVStyles.class})
  IVStyle styles(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(14)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(15)
  String path();


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(16)
  String fullName();


  /**
   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
   * @param xPos Mandatory short parameter.
   * @param yPos Mandatory short parameter.
   * @return  Returns a value of type IVMaster
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  IVMaster drop(
    Com4jObject objectToDrop,
    short xPos,
    short yPos);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(18)
  short index();


  /**
   * <p>
   * Getter method for the COM property "old_Saved"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  short old_Saved();


  /**
   * <p>
   * Setter method for the COM property "old_Saved"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  void old_Saved(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  short readOnly();


  /**
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  short save();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type short
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  short saveAs(
    String fileName);


  /**
   * <p>
   * Getter method for the COM property "old_Version"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  int old_Version();


  /**
   * <p>
   * Setter method for the COM property "old_Version"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(25)
  void old_Version(
    int lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(26)
  String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(27)
  void title(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(28)
  String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(29)
  void subject(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(30)
  String creator();


  /**
   * <p>
   * Setter method for the COM property "Creator"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(31)
  void creator(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Keywords"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(32)
  String keywords();


  /**
   * <p>
   * Setter method for the COM property "Keywords"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(33)
  void keywords(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(34)
  String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(35)
  void description(
    String lpbstrRet);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(36)
  void print();


  /**
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(37)
  void close();


  /**
   * <p>
   * Getter method for the COM property "CustomMenus"
   * </p>
   * @return  Returns a value of type IVUIObject
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(38)
  

    IVUIObject customMenus();


  /**
   * @param menusObject Mandatory IVUIObject parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(39)
  void setCustomMenus(
    IVUIObject menusObject);


  /**
   * <p>
   * Getter method for the COM property "CustomMenusFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(40)
  String customMenusFile();


  /**
   * <p>
   * Setter method for the COM property "CustomMenusFile"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(41)
  void customMenusFile(
    String lpbstrRet);


  /**
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(42)
  void clearCustomMenus();


  /**
   * <p>
   * Getter method for the COM property "CustomToolbars"
   * </p>
   * @return  Returns a value of type IVUIObject
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(43)
  IVUIObject customToolbars();


  /**
   * @param toolbarsObject Mandatory IVUIObject parameter.
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(44)
  void setCustomToolbars(
    IVUIObject toolbarsObject);


  /**
   * <p>
   * Getter method for the COM property "CustomToolbarsFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(45)
  String customToolbarsFile();


  /**
   * <p>
   * Setter method for the COM property "CustomToolbarsFile"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(46)
  void customToolbarsFile(
    String lpbstrRet);


  /**
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(47)
  void clearCustomToolbars();


  /**
   * <p>
   * Getter method for the COM property "Fonts"
   * </p>
   * @return  Returns a value of type IVFonts
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(48)
  IVFonts fonts();


  @VTID(48)
  @ReturnValue(defaultPropertyThrough={IVFonts.class})
  IVFont fonts(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Colors"
   * </p>
   * @return  Returns a value of type IVColors
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(49)
  IVColors colors();


  @VTID(49)
  @ReturnValue(defaultPropertyThrough={IVColors.class})
  IVColor colors(
    int index);

  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type IVEventList
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(50)
  

    IVEventList eventList();


  @VTID(50)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "Template"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(51)
  String template();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param saveFlags Mandatory short parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(52)
  void saveAsEx(
    String fileName,
    short saveFlags);


  /**
   * <p>
   * Getter method for the COM property "old_SavePreviewMode"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(53)
  short old_SavePreviewMode();


  /**
   * <p>
   * Setter method for the COM property "old_SavePreviewMode"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(54)
  void old_SavePreviewMode(
    short lpi2Ret);


  /**
   * @param id Mandatory short parameter.
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(55)
  void getIcon(
    short id,
    String fileName);


  /**
   * @param id Mandatory short parameter.
   * @param index Mandatory short parameter.
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(56)
  void setIcon(
    short id,
    short index,
    String fileName);


  /**
   * <p>
   * Getter method for the COM property "LeftMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(57)
  double leftMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   * <p>
   * Setter method for the COM property "LeftMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(58)
  void leftMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    double lpr8Ret);


  /**
   * <p>
   * Getter method for the COM property "RightMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(59)
  double rightMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   * <p>
   * Setter method for the COM property "RightMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(60)
  void rightMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    double lpr8Ret);


  /**
   * <p>
   * Getter method for the COM property "TopMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(61)
  double topMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   * <p>
   * Setter method for the COM property "TopMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(62)
  void topMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    double lpr8Ret);


  /**
   * <p>
   * Getter method for the COM property "BottomMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type double
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(63)
  double bottomMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   * <p>
   * Setter method for the COM property "BottomMargin"
   * </p>
   * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(64)
  void bottomMargin(
    @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    double lpr8Ret);


  /**
   * <p>
   * Getter method for the COM property "old_PrintLandscape"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(65)
  short old_PrintLandscape();


  /**
   * <p>
   * Setter method for the COM property "old_PrintLandscape"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(66)
  void old_PrintLandscape(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "old_PrintCenteredH"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(67)
  short old_PrintCenteredH();


  /**
   * <p>
   * Setter method for the COM property "old_PrintCenteredH"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(68)
  void old_PrintCenteredH(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "old_PrintCenteredV"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(69)
  short old_PrintCenteredV();


  /**
   * <p>
   * Setter method for the COM property "old_PrintCenteredV"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(70)
  void old_PrintCenteredV(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "PrintScale"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(71)
  double printScale();


  /**
   * <p>
   * Setter method for the COM property "PrintScale"
   * </p>
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(72)
  void printScale(
    double lpr8Ret);


  /**
   * <p>
   * Getter method for the COM property "old_PrintFitOnPages"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(73)
  short old_PrintFitOnPages();


  /**
   * <p>
   * Setter method for the COM property "old_PrintFitOnPages"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(74)
  void old_PrintFitOnPages(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "PrintPagesAcross"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(75)
  short printPagesAcross();


  /**
   * <p>
   * Setter method for the COM property "PrintPagesAcross"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(76)
  void printPagesAcross(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "PrintPagesDown"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(77)
  short printPagesDown();


  /**
   * <p>
   * Setter method for the COM property "PrintPagesDown"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(78)
  void printPagesDown(
    short lpi2Ret);


  /**
   * <p>
   * Locale specific name of document's default style.
   * </p>
   * <p>
   * Getter method for the COM property "DefaultStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(79)
  String defaultStyle();


  /**
   * <p>
   * Locale specific name of document's default style.
   * </p>
   * <p>
   * Setter method for the COM property "DefaultStyle"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(80)
  void defaultStyle(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Locale specific name of document's default line style.
   * </p>
   * <p>
   * Getter method for the COM property "DefaultLineStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(81)
  String defaultLineStyle();


  /**
   * <p>
   * Locale specific name of document's default line style.
   * </p>
   * <p>
   * Setter method for the COM property "DefaultLineStyle"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(82)
  void defaultLineStyle(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Locale specific name of document's default fill style.
   * </p>
   * <p>
   * Getter method for the COM property "DefaultFillStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(83)
  String defaultFillStyle();


  /**
   * <p>
   * Locale specific name of document's default fill style.
   * </p>
   * <p>
   * Setter method for the COM property "DefaultFillStyle"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(84)
  void defaultFillStyle(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Locale specific name of document's default text style.
   * </p>
   * <p>
   * Getter method for the COM property "DefaultTextStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(85)
  String defaultTextStyle();


  /**
   * <p>
   * Locale specific name of document's default text style.
   * </p>
   * <p>
   * Setter method for the COM property "DefaultTextStyle"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(86)
  void defaultTextStyle(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(87)
  short persistsEvents();


  /**
   * @return  Returns a value of type IVWindow
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(88)
  IVWindow openStencilWindow();


  /**
   * @param line Mandatory java.lang.String parameter.
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(89)
  void parseLine(
    String line);


  /**
   * @param line Mandatory java.lang.String parameter.
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(90)
  void executeLine(
    String line);


  /**
   * <p>
   * Interface returned is VBIDE.VBProject.
   * </p>
   * <p>
   * Getter method for the COM property "VBProject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(91)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject vbProject();


  /**
   * <p>
   * Getter method for the COM property "PaperWidth"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @DISPID(60) //= 0x3c. The runtime will prefer the VTID if present
  @VTID(92)
  double paperWidth(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "PaperHeight"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(93)
  double paperHeight(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   * <p>
   * Getter method for the COM property "old_PaperSize"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(94)
  short old_PaperSize();


  /**
   * <p>
   * Setter method for the COM property "old_PaperSize"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(62) //= 0x3e. The runtime will prefer the VTID if present
  @VTID(95)
  void old_PaperSize(
    short lpi2Ret);


  /**
   * @param target Mandatory java.lang.String parameter.
   * @param location Mandatory java.lang.String parameter.
   */

  @DISPID(63) //= 0x3f. The runtime will prefer the VTID if present
  @VTID(96)
  void followHyperlink45(
    String target,
    String location);


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(97)
  String codeName();


  /**
   * <p>
   * Getter method for the COM property "old_Mode"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(98)
  short old_Mode();


  /**
   * <p>
   * Setter method for the COM property "old_Mode"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(64) //= 0x40. The runtime will prefer the VTID if present
  @VTID(99)
  void old_Mode(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "OLEObjects"
   * </p>
   * @return  Returns a value of type IVOLEObjects
   */

  @DISPID(65) //= 0x41. The runtime will prefer the VTID if present
  @VTID(100)
  

    IVOLEObjects oleObjects();


  @VTID(100)
  @ReturnValue(defaultPropertyThrough={IVOLEObjects.class})
  

    IVOLEObject oleObjects(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * @param address Mandatory java.lang.String parameter.
   * @param subAddress Mandatory java.lang.String parameter.
   * @param extraInfo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param frame Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newWindow Optional parameter. Default value is com4j.Variant.getMissing()
   * @param res1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param res2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param res3 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(66) //= 0x42. The runtime will prefer the VTID if present
  @VTID(101)
  void followHyperlink(
    String address,
    String subAddress,
    @Optional @MarshalAs(NativeType.VARIANT) Object extraInfo,
    @Optional @MarshalAs(NativeType.VARIANT) Object frame,
    @Optional @MarshalAs(NativeType.VARIANT) Object newWindow,
    @Optional @MarshalAs(NativeType.VARIANT) Object res1,
    @Optional @MarshalAs(NativeType.VARIANT) Object res2,
    @Optional @MarshalAs(NativeType.VARIANT) Object res3);


  /**
   * <p>
   * Getter method for the COM property "Manager"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(102)
  String manager();


  /**
   * <p>
   * Setter method for the COM property "Manager"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(67) //= 0x43. The runtime will prefer the VTID if present
  @VTID(103)
  void manager(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Company"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(104)
  String company();


  /**
   * <p>
   * Setter method for the COM property "Company"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(68) //= 0x44. The runtime will prefer the VTID if present
  @VTID(105)
  void company(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(106)
  String category();


  /**
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(69) //= 0x45. The runtime will prefer the VTID if present
  @VTID(107)
  void category(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "HyperlinkBase"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(108)
  String hyperlinkBase();


  /**
   * <p>
   * Setter method for the COM property "HyperlinkBase"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(70) //= 0x46. The runtime will prefer the VTID if present
  @VTID(109)
  void hyperlinkBase(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "DocumentSheet"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(71) //= 0x47. The runtime will prefer the VTID if present
  @VTID(110)
  IVShape documentSheet();


  /**
   * <p>
   * Getter method for the COM property "Container"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(72) //= 0x48. The runtime will prefer the VTID if present
  @VTID(111)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject container();


  /**
   * <p>
   * Getter method for the COM property "ClassID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(73) //= 0x49. The runtime will prefer the VTID if present
  @VTID(112)
  String classID();


  /**
   * <p>
   * Getter method for the COM property "ProgID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(74) //= 0x4a. The runtime will prefer the VTID if present
  @VTID(113)
  String progID();


  /**
   * <p>
   * Getter method for the COM property "MasterShortcuts"
   * </p>
   * @return  Returns a value of type IVMasterShortcuts
   */

  @DISPID(75) //= 0x4b. The runtime will prefer the VTID if present
  @VTID(114)
  IVMasterShortcuts masterShortcuts();


  @VTID(114)
  @ReturnValue(defaultPropertyThrough={IVMasterShortcuts.class})
  IVMasterShortcut masterShortcuts(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "AlternateNames"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(115)
  String alternateNames();


  /**
   * <p>
   * Setter method for the COM property "AlternateNames"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(76) //= 0x4c. The runtime will prefer the VTID if present
  @VTID(116)
  void alternateNames(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "GestureFormatSheet"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(77) //= 0x4d. The runtime will prefer the VTID if present
  @VTID(117)
  IVShape gestureFormatSheet();


  /**
   */

  @DISPID(78) //= 0x4e. The runtime will prefer the VTID if present
  @VTID(118)
  void clearGestureFormatSheet();


  /**
   * <p>
   * Getter method for the COM property "AutoRecover"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(119)
  boolean autoRecover();


  /**
   * <p>
   * Setter method for the COM property "AutoRecover"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(79) //= 0x4f. The runtime will prefer the VTID if present
  @VTID(120)
  void autoRecover(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743922) //= 0x60020072. The runtime will prefer the VTID if present
  @VTID(121)
  boolean saved();


  /**
   * <p>
   * Setter method for the COM property "Saved"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743922) //= 0x60020072. The runtime will prefer the VTID if present
  @VTID(122)
  void saved(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type tagVisDocVersions
   */

  @DISPID(1610743924) //= 0x60020074. The runtime will prefer the VTID if present
  @VTID(123)
  tagVisDocVersions version();


  /**
   * <p>
   * Setter method for the COM property "Version"
   * </p>
   * @param lpi4Ret Mandatory tagVisDocVersions parameter.
   */

  @DISPID(1610743924) //= 0x60020074. The runtime will prefer the VTID if present
  @VTID(124)
  void version(
    tagVisDocVersions lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "SavePreviewMode"
   * </p>
   * @return  Returns a value of type tagVisSavePreviewMode
   */

  @DISPID(1610743926) //= 0x60020076. The runtime will prefer the VTID if present
  @VTID(125)
  tagVisSavePreviewMode savePreviewMode();


  /**
   * <p>
   * Setter method for the COM property "SavePreviewMode"
   * </p>
   * @param lpi4Ret Mandatory tagVisSavePreviewMode parameter.
   */

  @DISPID(1610743926) //= 0x60020076. The runtime will prefer the VTID if present
  @VTID(126)
  void savePreviewMode(
    tagVisSavePreviewMode lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "PrintLandscape"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743928) //= 0x60020078. The runtime will prefer the VTID if present
  @VTID(127)
  boolean printLandscape();


  /**
   * <p>
   * Setter method for the COM property "PrintLandscape"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743928) //= 0x60020078. The runtime will prefer the VTID if present
  @VTID(128)
  void printLandscape(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "PrintCenteredH"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743930) //= 0x6002007a. The runtime will prefer the VTID if present
  @VTID(129)
  boolean printCenteredH();


  /**
   * <p>
   * Setter method for the COM property "PrintCenteredH"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743930) //= 0x6002007a. The runtime will prefer the VTID if present
  @VTID(130)
  void printCenteredH(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "PrintCenteredV"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743932) //= 0x6002007c. The runtime will prefer the VTID if present
  @VTID(131)
  boolean printCenteredV();


  /**
   * <p>
   * Setter method for the COM property "PrintCenteredV"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743932) //= 0x6002007c. The runtime will prefer the VTID if present
  @VTID(132)
  void printCenteredV(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "PrintFitOnPages"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743934) //= 0x6002007e. The runtime will prefer the VTID if present
  @VTID(133)
  boolean printFitOnPages();


  /**
   * <p>
   * Setter method for the COM property "PrintFitOnPages"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743934) //= 0x6002007e. The runtime will prefer the VTID if present
  @VTID(134)
  void printFitOnPages(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "PaperSize"
   * </p>
   * @return  Returns a value of type tagVisPaperSizes
   */

  @DISPID(1610743936) //= 0x60020080. The runtime will prefer the VTID if present
  @VTID(135)
  tagVisPaperSizes paperSize();


  /**
   * <p>
   * Setter method for the COM property "PaperSize"
   * </p>
   * @param lpi4Ret Mandatory tagVisPaperSizes parameter.
   */

  @DISPID(1610743936) //= 0x60020080. The runtime will prefer the VTID if present
  @VTID(136)
  void paperSize(
    tagVisPaperSizes lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type tagVisDocModeArgs
   */

  @DISPID(1610743938) //= 0x60020082. The runtime will prefer the VTID if present
  @VTID(137)
  tagVisDocModeArgs mode();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param lpi4Ret Mandatory tagVisDocModeArgs parameter.
   */

  @DISPID(1610743938) //= 0x60020082. The runtime will prefer the VTID if present
  @VTID(138)
  void mode(
    tagVisDocModeArgs lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "SnapEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743940) //= 0x60020084. The runtime will prefer the VTID if present
  @VTID(139)
  boolean snapEnabled();


  /**
   * <p>
   * Setter method for the COM property "SnapEnabled"
   * </p>
   * @param pbRet Mandatory boolean parameter.
   */

  @DISPID(1610743940) //= 0x60020084. The runtime will prefer the VTID if present
  @VTID(140)
  void snapEnabled(
    boolean pbRet);


  /**
   * <p>
   * Getter method for the COM property "SnapSettings"
   * </p>
   * @return  Returns a value of type tagVisSnapSettings
   */

  @DISPID(1610743942) //= 0x60020086. The runtime will prefer the VTID if present
  @VTID(141)
  tagVisSnapSettings snapSettings();


  /**
   * <p>
   * Setter method for the COM property "SnapSettings"
   * </p>
   * @param pnRet Mandatory tagVisSnapSettings parameter.
   */

  @DISPID(1610743942) //= 0x60020086. The runtime will prefer the VTID if present
  @VTID(142)
  void snapSettings(
    tagVisSnapSettings pnRet);


  /**
   * <p>
   * Getter method for the COM property "SnapExtensions"
   * </p>
   * @return  Returns a value of type tagVisSnapExtensions
   */

  @DISPID(1610743944) //= 0x60020088. The runtime will prefer the VTID if present
  @VTID(143)
  tagVisSnapExtensions snapExtensions();


  /**
   * <p>
   * Setter method for the COM property "SnapExtensions"
   * </p>
   * @param pnRet Mandatory tagVisSnapExtensions parameter.
   */

  @DISPID(1610743944) //= 0x60020088. The runtime will prefer the VTID if present
  @VTID(144)
  void snapExtensions(
    tagVisSnapExtensions pnRet);


  /**
   * <p>
   * Getter method for the COM property "SnapAngles"
   * </p>
   * @return  Returns a value of type double[]
   */

  @DISPID(1610743946) //= 0x6002008a. The runtime will prefer the VTID if present
  @VTID(145)
  double[] snapAngles();


    /**
     * <p>
     * Getter method for the COM property "GlueEnabled"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610743948) //= 0x6002008c. The runtime will prefer the VTID if present
    @VTID(147)
    boolean glueEnabled();


    /**
     * <p>
     * Setter method for the COM property "GlueEnabled"
     * </p>
     * @param pbRet Mandatory boolean parameter.
     */

    @DISPID(1610743948) //= 0x6002008c. The runtime will prefer the VTID if present
    @VTID(148)
    void glueEnabled(
      boolean pbRet);


    /**
     * <p>
     * Getter method for the COM property "GlueSettings"
     * </p>
     * @return  Returns a value of type tagVisGlueSettings
     */

    @DISPID(1610743950) //= 0x6002008e. The runtime will prefer the VTID if present
    @VTID(149)
    tagVisGlueSettings glueSettings();


    /**
     * <p>
     * Setter method for the COM property "GlueSettings"
     * </p>
     * @param pnRet Mandatory tagVisGlueSettings parameter.
     */

    @DISPID(1610743950) //= 0x6002008e. The runtime will prefer the VTID if present
    @VTID(150)
    void glueSettings(
      tagVisGlueSettings pnRet);


    /**
     * <p>
     * Getter method for the COM property "DynamicGridEnabled"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610743952) //= 0x60020090. The runtime will prefer the VTID if present
    @VTID(151)
    boolean dynamicGridEnabled();


    /**
     * <p>
     * Setter method for the COM property "DynamicGridEnabled"
     * </p>
     * @param pbRet Mandatory boolean parameter.
     */

    @DISPID(1610743952) //= 0x60020090. The runtime will prefer the VTID if present
    @VTID(152)
    void dynamicGridEnabled(
      boolean pbRet);


    /**
     * <p>
     * Getter method for the COM property "DefaultGuideStyle"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743954) //= 0x60020092. The runtime will prefer the VTID if present
    @VTID(153)
    String defaultGuideStyle();


    /**
     * <p>
     * Setter method for the COM property "DefaultGuideStyle"
     * </p>
     * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
     */

    @DISPID(1610743954) //= 0x60020092. The runtime will prefer the VTID if present
    @VTID(154)
    void defaultGuideStyle(
      String lpLocaleSpecificName);


    /**
     * <p>
     * Getter method for the COM property "Protection"
     * </p>
     * @param bstrPassword Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type tagVisProtection
     */

    @DISPID(1610743956) //= 0x60020094. The runtime will prefer the VTID if present
    @VTID(155)
    tagVisProtection protection(
      @Optional @MarshalAs(NativeType.VARIANT) Object bstrPassword);


    /**
     * <p>
     * Setter method for the COM property "Protection"
     * </p>
     * @param bstrPassword Optional parameter. Default value is com4j.Variant.getMissing()
     * @param pnRet Mandatory tagVisProtection parameter.
     */

    @DISPID(1610743956) //= 0x60020094. The runtime will prefer the VTID if present
    @VTID(156)
    void protection(
      @Optional @MarshalAs(NativeType.VARIANT) Object bstrPassword,
      tagVisProtection pnRet);


    /**
     * <p>
     * Getter method for the COM property "Printer"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743958) //= 0x60020096. The runtime will prefer the VTID if present
    @VTID(157)
    String printer();


    /**
     * <p>
     * Setter method for the COM property "Printer"
     * </p>
     * @param pbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610743958) //= 0x60020096. The runtime will prefer the VTID if present
    @VTID(158)
    void printer(
      String pbstrRet);


    /**
     * <p>
     * Getter method for the COM property "PrintCopies"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610743960) //= 0x60020098. The runtime will prefer the VTID if present
    @VTID(159)
    int printCopies();


    /**
     * <p>
     * Setter method for the COM property "PrintCopies"
     * </p>
     * @param pnRet Mandatory int parameter.
     */

    @DISPID(1610743960) //= 0x60020098. The runtime will prefer the VTID if present
    @VTID(160)
    void printCopies(
      int pnRet);


    /**
     * <p>
     * Getter method for the COM property "HeaderLeft"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743962) //= 0x6002009a. The runtime will prefer the VTID if present
    @VTID(161)
    String headerLeft();


    /**
     * <p>
     * Setter method for the COM property "HeaderLeft"
     * </p>
     * @param pbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610743962) //= 0x6002009a. The runtime will prefer the VTID if present
    @VTID(162)
    void headerLeft(
      String pbstrRet);


    /**
     * <p>
     * Getter method for the COM property "HeaderCenter"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743964) //= 0x6002009c. The runtime will prefer the VTID if present
    @VTID(163)
    String headerCenter();


    /**
     * <p>
     * Setter method for the COM property "HeaderCenter"
     * </p>
     * @param pbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610743964) //= 0x6002009c. The runtime will prefer the VTID if present
    @VTID(164)
    void headerCenter(
      String pbstrRet);


    /**
     * <p>
     * Getter method for the COM property "HeaderRight"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743966) //= 0x6002009e. The runtime will prefer the VTID if present
    @VTID(165)
    String headerRight();


    /**
     * <p>
     * Setter method for the COM property "HeaderRight"
     * </p>
     * @param pbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610743966) //= 0x6002009e. The runtime will prefer the VTID if present
    @VTID(166)
    void headerRight(
      String pbstrRet);


    /**
     * <p>
     * Getter method for the COM property "HeaderMargin"
     * </p>
     * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type double
     */

    @DISPID(1610743968) //= 0x600200a0. The runtime will prefer the VTID if present
    @VTID(167)
    double headerMargin(
      @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


    /**
     * <p>
     * Setter method for the COM property "HeaderMargin"
     * </p>
     * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
     * @param pdRet Mandatory double parameter.
     */

    @DISPID(1610743968) //= 0x600200a0. The runtime will prefer the VTID if present
    @VTID(168)
    void headerMargin(
      @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
      double pdRet);


    /**
     * <p>
     * Getter method for the COM property "FooterLeft"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743970) //= 0x600200a2. The runtime will prefer the VTID if present
    @VTID(169)
    String footerLeft();


    /**
     * <p>
     * Setter method for the COM property "FooterLeft"
     * </p>
     * @param pbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610743970) //= 0x600200a2. The runtime will prefer the VTID if present
    @VTID(170)
    void footerLeft(
      String pbstrRet);


    /**
     * <p>
     * Getter method for the COM property "FooterCenter"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743972) //= 0x600200a4. The runtime will prefer the VTID if present
    @VTID(171)
    String footerCenter();


    /**
     * <p>
     * Setter method for the COM property "FooterCenter"
     * </p>
     * @param pbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610743972) //= 0x600200a4. The runtime will prefer the VTID if present
    @VTID(172)
    void footerCenter(
      String pbstrRet);


    /**
     * <p>
     * Getter method for the COM property "FooterRight"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743974) //= 0x600200a6. The runtime will prefer the VTID if present
    @VTID(173)
    String footerRight();


    /**
     * <p>
     * Setter method for the COM property "FooterRight"
     * </p>
     * @param pbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610743974) //= 0x600200a6. The runtime will prefer the VTID if present
    @VTID(174)
    void footerRight(
      String pbstrRet);


    /**
     * <p>
     * Getter method for the COM property "FooterMargin"
     * </p>
     * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
     * @return  Returns a value of type double
     */

    @DISPID(1610743976) //= 0x600200a8. The runtime will prefer the VTID if present
    @VTID(175)
    double footerMargin(
      @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


    /**
     * <p>
     * Setter method for the COM property "FooterMargin"
     * </p>
     * @param unitsNameOrCode Optional parameter. Default value is com4j.Variant.getMissing()
     * @param pdRet Mandatory double parameter.
     */

    @DISPID(1610743976) //= 0x600200a8. The runtime will prefer the VTID if present
    @VTID(176)
    void footerMargin(
      @Optional @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
      double pdRet);


    /**
     * <p>
     * Getter method for the COM property "HeaderFooterFont"
     * </p>
     * @return  Returns a value of type Holder<com4j.stdole.IFontDisp>
     */

    @DISPID(1610743978) //= 0x600200aa. The runtime will prefer the VTID if present
    @VTID(177)
    Holder<com4j.stdole.IFontDisp> headerFooterFont();


    /**
     * <p>
     * Setter method for the COM property "HeaderFooterFont"
     * </p>
     * @param ppFontDisp Mandatory Holder<com4j.stdole.IFontDisp> parameter.
     */

    @DISPID(1610743978) //= 0x600200aa. The runtime will prefer the VTID if present
    @VTID(178)
    void headerFooterFont(
      Holder<com4j.stdole.IFontDisp> ppFontDisp);


    /**
     * <p>
     * Getter method for the COM property "HeaderFooterColor"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610743980) //= 0x600200ac. The runtime will prefer the VTID if present
    @VTID(179)
    int headerFooterColor();


    /**
     * <p>
     * Setter method for the COM property "HeaderFooterColor"
     * </p>
     * @param pColor Mandatory int parameter.
     */

    @DISPID(1610743980) //= 0x600200ac. The runtime will prefer the VTID if present
    @VTID(180)
    void headerFooterColor(
      int pColor);


    /**
     * <p>
     * Obsolete as of Visio 2003.
     * </p>
     * <p>
     * Setter method for the COM property "Password"
     * </p>
     * @param bstrExistingPassword Optional parameter. Default value is com4j.Variant.getMissing()
     * @param rhs Mandatory java.lang.String parameter.
     */

    @DISPID(1610743982) //= 0x600200ae. The runtime will prefer the VTID if present
    @VTID(181)
    void password(
      @Optional @MarshalAs(NativeType.VARIANT) Object bstrExistingPassword,
      String rhs);


    /**
     * <p>
     * Getter method for the COM property "PreviewPicture"
     * </p>
     * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
     */

    @DISPID(1610743983) //= 0x600200af. The runtime will prefer the VTID if present
    @VTID(182)
    Holder<com4j.stdole.IPictureDisp> previewPicture();


    /**
     * <p>
     * Setter method for the COM property "PreviewPicture"
     * </p>
     * @param ppPictureDisp Mandatory Holder<com4j.stdole.IPictureDisp> parameter.
     */

    @DISPID(1610743983) //= 0x600200af. The runtime will prefer the VTID if present
    @VTID(183)
    void previewPicture(
      Holder<com4j.stdole.IPictureDisp> ppPictureDisp);


    /**
     * <p>
     * Detects and repairs various indicated conditions in a document.
     * </p>
     * @param nTargets Optional parameter. Default value is com4j.Variant.getMissing()
     * @param nActions Optional parameter. Default value is com4j.Variant.getMissing()
     * @param nAlerts Optional parameter. Default value is com4j.Variant.getMissing()
     * @param nFixes Optional parameter. Default value is com4j.Variant.getMissing()
     * @param bStopOnError Optional parameter. Default value is com4j.Variant.getMissing()
     * @param bLogFileName Optional parameter. Default value is com4j.Variant.getMissing()
     * @param nReserved Optional parameter. Default value is com4j.Variant.getMissing()
     */

    @DISPID(1610743985) //= 0x600200b1. The runtime will prefer the VTID if present
    @VTID(184)
    void clean(
      @Optional @MarshalAs(NativeType.VARIANT) Object nTargets,
      @Optional @MarshalAs(NativeType.VARIANT) Object nActions,
      @Optional @MarshalAs(NativeType.VARIANT) Object nAlerts,
      @Optional @MarshalAs(NativeType.VARIANT) Object nFixes,
      @Optional @MarshalAs(NativeType.VARIANT) Object bStopOnError,
      @Optional @MarshalAs(NativeType.VARIANT) Object bLogFileName,
      @Optional @MarshalAs(NativeType.VARIANT) Object nReserved);


    /**
     * <p>
     * Getter method for the COM property "BuildNumberCreated"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610743986) //= 0x600200b2. The runtime will prefer the VTID if present
    @VTID(185)
    int buildNumberCreated();


    /**
     * <p>
     * Getter method for the COM property "BuildNumberEdited"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610743987) //= 0x600200b3. The runtime will prefer the VTID if present
    @VTID(186)
    int buildNumberEdited();


    /**
     * <p>
     * Getter method for the COM property "TimeCreated"
     * </p>
     * @return  Returns a value of type java.util.Date
     */

    @DISPID(1610743988) //= 0x600200b4. The runtime will prefer the VTID if present
    @VTID(187)
    java.util.Date timeCreated();


    /**
     * <p>
     * Getter method for the COM property "Time"
     * </p>
     * @return  Returns a value of type java.util.Date
     */

    @DISPID(1610743989) //= 0x600200b5. The runtime will prefer the VTID if present
    @VTID(188)
    java.util.Date time();


    /**
     * <p>
     * Getter method for the COM property "TimeEdited"
     * </p>
     * @return  Returns a value of type java.util.Date
     */

    @DISPID(1610743990) //= 0x600200b6. The runtime will prefer the VTID if present
    @VTID(189)
    java.util.Date timeEdited();


    /**
     * <p>
     * Getter method for the COM property "TimePrinted"
     * </p>
     * @return  Returns a value of type java.util.Date
     */

    @DISPID(1610743991) //= 0x600200b7. The runtime will prefer the VTID if present
    @VTID(190)
    java.util.Date timePrinted();


    /**
     * <p>
     * Getter method for the COM property "TimeSaved"
     * </p>
     * @return  Returns a value of type java.util.Date
     */

    @DISPID(1610743992) //= 0x600200b8. The runtime will prefer the VTID if present
    @VTID(191)
    java.util.Date timeSaved();


    /**
     * <p>
     * Copies the preview picture from pSourceDoc into this one.
     * </p>
     * @param pSourceDoc Mandatory IVDocument parameter.
     */

    @DISPID(1610743993) //= 0x600200b9. The runtime will prefer the VTID if present
    @VTID(192)
    void copyPreviewPicture(
      IVDocument pSourceDoc);


    /**
     * <p>
     * True if this document was saved as a workspace. False otherwise.
     * </p>
     * <p>
     * Getter method for the COM property "ContainsWorkspace"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610743994) //= 0x600200ba. The runtime will prefer the VTID if present
    @VTID(193)
    boolean containsWorkspace();


    /**
     * <p>
     * Getter method for the COM property "EmailRoutingData"
     * </p>
     * @return  Returns a value of type java.lang.Object[]
     */

    @DISPID(1610743995) //= 0x600200bb. The runtime will prefer the VTID if present
    @VTID(194)
    Object[] emailRoutingData();


    /**
     * <p>
     * Getter method for the COM property "VBProjectData"
     * </p>
     * @return  Returns a value of type byte[]
     */

    @DISPID(1610743996) //= 0x600200bc. The runtime will prefer the VTID if present
    @VTID(195)
    byte[] vbProjectData();


    /**
     * <p>
     * Returns number of Solution XML elements in document. The first element has index 1.
     * </p>
     * <p>
     * Getter method for the COM property "SolutionXMLElementCount"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610743997) //= 0x600200bd. The runtime will prefer the VTID if present
    @VTID(196)
    int solutionXMLElementCount();


    /**
     * <p>
     * Returns the name of the i'th (1-based) Solution XML element.
     * </p>
     * <p>
     * Getter method for the COM property "SolutionXMLElementName"
     * </p>
     * @param index Mandatory int parameter.
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610743998) //= 0x600200be. The runtime will prefer the VTID if present
    @VTID(197)
    String solutionXMLElementName(
      int index);


    /**
     * <p>
     * Returns true if there is a Solution XML element with the given name.
     * </p>
     * <p>
     * Getter method for the COM property "SolutionXMLElementExists"
     * </p>
     * @param elementName Mandatory java.lang.String parameter.
     * @return  Returns a value of type boolean
     */

    @DISPID(1610743999) //= 0x600200bf. The runtime will prefer the VTID if present
    @VTID(198)
    boolean solutionXMLElementExists(
      String elementName);


    /**
     * <p>
     * Data of the Solution XML element with the given name. Putting data to non-existent element creates element.
     * </p>
     * <p>
     * Getter method for the COM property "SolutionXMLElement"
     * </p>
     * @param elementName Mandatory java.lang.String parameter.
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610744000) //= 0x600200c0. The runtime will prefer the VTID if present
    @VTID(199)
    String solutionXMLElement(
      String elementName);


    /**
     * <p>
     * Data of the Solution XML element with the given name. Putting data to non-existent element creates element.
     * </p>
     * <p>
     * Setter method for the COM property "SolutionXMLElement"
     * </p>
     * @param elementName Mandatory java.lang.String parameter.
     * @param pWellFormedXML Mandatory java.lang.String parameter.
     */

    @DISPID(1610744000) //= 0x600200c0. The runtime will prefer the VTID if present
    @VTID(200)
    void solutionXMLElement(
      String elementName,
      String pWellFormedXML);


    /**
     * <p>
     * Deletes the Solution XML element with the given name.
     * </p>
     * @param elementName Mandatory java.lang.String parameter.
     */

    @DISPID(1610744002) //= 0x600200c2. The runtime will prefer the VTID if present
    @VTID(201)
    void deleteSolutionXMLElement(
      String elementName);


    /**
     * <p>
     * Getter method for the COM property "FullBuildNumberCreated"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610744003) //= 0x600200c3. The runtime will prefer the VTID if present
    @VTID(202)
    int fullBuildNumberCreated();


    /**
     * <p>
     * Getter method for the COM property "FullBuildNumberEdited"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610744004) //= 0x600200c4. The runtime will prefer the VTID if present
    @VTID(203)
    int fullBuildNumberEdited();


    /**
     * <p>
     * Getter method for the COM property "ID"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610744005) //= 0x600200c5. The runtime will prefer the VTID if present
    @VTID(204)
    int id();


    /**
     * <p>
     * Getter method for the COM property "MacrosEnabled"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610744006) //= 0x600200c6. The runtime will prefer the VTID if present
    @VTID(205)
    boolean macrosEnabled();


    /**
     * <p>
     * Getter method for the COM property "ZoomBehavior"
     * </p>
     * @return  Returns a value of type tagVisZoomBehavior
     */

    @DISPID(1610744007) //= 0x600200c7. The runtime will prefer the VTID if present
    @VTID(206)
    tagVisZoomBehavior zoomBehavior();


    /**
     * <p>
     * Setter method for the COM property "ZoomBehavior"
     * </p>
     * @param pnZoomBehavior Mandatory tagVisZoomBehavior parameter.
     */

    @DISPID(1610744007) //= 0x600200c7. The runtime will prefer the VTID if present
    @VTID(207)
    void zoomBehavior(
      tagVisZoomBehavior pnZoomBehavior);


    /**
     * @return  Returns a value of type boolean
     */

    @DISPID(1610744009) //= 0x600200c9. The runtime will prefer the VTID if present
    @VTID(208)
    boolean canCheckIn();


    /**
     * @param saveChanges Optional parameter. Default value is false
     * @param comments Optional parameter. Default value is com4j.Variant.getMissing()
     * @param makePublic Optional parameter. Default value is false
     */

    @DISPID(1610744010) //= 0x600200ca. The runtime will prefer the VTID if present
    @VTID(209)
    void checkIn(
      @Optional @DefaultValue("-1") boolean saveChanges,
      @Optional Object comments,
      @Optional @DefaultValue("0") boolean makePublic);


    /**
     * <p>
     * Getter method for the COM property "Type"
     * </p>
     * @return  Returns a value of type VisDocumentTypes
     */

    @DISPID(1610744011) //= 0x600200cb. The runtime will prefer the VTID if present
    @VTID(210)
    VisDocumentTypes type();


    /**
     * <p>
     * Getter method for the COM property "Language"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610744012) //= 0x600200cc. The runtime will prefer the VTID if present
    @VTID(211)
    int language();


    /**
     * <p>
     * Setter method for the COM property "Language"
     * </p>
     * @param lpLangID Mandatory int parameter.
     */

    @DISPID(1610744012) //= 0x600200cc. The runtime will prefer the VTID if present
    @VTID(212)
    void language(
      int lpLangID);


    /**
     * <p>
     * Getter method for the COM property "RemovePersonalInformation"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610744014) //= 0x600200ce. The runtime will prefer the VTID if present
    @VTID(213)
    boolean removePersonalInformation();


    /**
     * <p>
     * Setter method for the COM property "RemovePersonalInformation"
     * </p>
     * @param pbRet Mandatory boolean parameter.
     */

    @DISPID(1610744014) //= 0x600200ce. The runtime will prefer the VTID if present
    @VTID(214)
    void removePersonalInformation(
      boolean pbRet);


    /**
     * @param printRange Mandatory VisPrintOutRange parameter.
     * @param fromPage Optional parameter. Default value is 1
     * @param toPage Optional parameter. Default value is -1
     * @param scaleCurrentViewToPaper Optional parameter. Default value is false
     * @param printerName Optional parameter. Default value is ""
     * @param printToFile Optional parameter. Default value is false
     * @param outputFileName Optional parameter. Default value is ""
     * @param copies Optional parameter. Default value is 1
     * @param collate Optional parameter. Default value is false
     * @param colorAsBlack Optional parameter. Default value is false
     */

    @DISPID(1610744016) //= 0x600200d0. The runtime will prefer the VTID if present
    @VTID(215)
    void printOut(
      VisPrintOutRange printRange,
      @Optional @DefaultValue("1") int fromPage,
      @Optional @DefaultValue("-1") int toPage,
      @Optional @DefaultValue("0") boolean scaleCurrentViewToPaper,
      @Optional @DefaultValue("") String printerName,
      @Optional @DefaultValue("0") boolean printToFile,
      @Optional @DefaultValue("") String outputFileName,
      @Optional @DefaultValue("1") int copies,
      @Optional @DefaultValue("0") boolean collate,
      @Optional @DefaultValue("0") boolean colorAsBlack);


    /**
     * @param bstrUndoScopeName Mandatory java.lang.String parameter.
     * @return  Returns a value of type int
     */

    @DISPID(1610744017) //= 0x600200d1. The runtime will prefer the VTID if present
    @VTID(216)
    int beginUndoScope(
      String bstrUndoScopeName);


    /**
     * @param nScopeID Mandatory int parameter.
     * @param bCommit Mandatory boolean parameter.
     */

    @DISPID(1610744018) //= 0x600200d2. The runtime will prefer the VTID if present
    @VTID(217)
    void endUndoScope(
      int nScopeID,
      boolean bCommit);


    /**
     * @param pUndoUnit Mandatory com4j.Com4jObject parameter.
     */

    @DISPID(1610744019) //= 0x600200d3. The runtime will prefer the VTID if present
    @VTID(218)
    void addUndoUnit(
      Com4jObject pUndoUnit);


    /**
     */

    @DISPID(1610744020) //= 0x600200d4. The runtime will prefer the VTID if present
    @VTID(219)
    void purgeUndo();


    /**
     * <p>
     * Getter method for the COM property "UndoEnabled"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610744021) //= 0x600200d5. The runtime will prefer the VTID if present
    @VTID(220)
    boolean undoEnabled();


    /**
     * <p>
     * Setter method for the COM property "UndoEnabled"
     * </p>
     * @param pbRet Mandatory boolean parameter.
     */

    @DISPID(1610744021) //= 0x600200d5. The runtime will prefer the VTID if present
    @VTID(221)
    void undoEnabled(
      boolean pbRet);


    /**
     * <p>
     * Renames the currently open top level undo scope such that bstrScopeName shows up in the Undo menu item. Raises an exception if not in an open scope.
     * </p>
     * @param bstrScopeName Mandatory java.lang.String parameter.
     */

    @DISPID(1610744023) //= 0x600200d7. The runtime will prefer the VTID if present
    @VTID(222)
    void renameCurrentScope(
      String bstrScopeName);


    /**
     * <p>
     * Getter method for the COM property "SharedWorkspace"
     * </p>
     * @return  Returns a value of type com4j.Com4jObject
     */

    @DISPID(1610744024) //= 0x600200d8. The runtime will prefer the VTID if present
    @VTID(223)
    @ReturnValue(type=NativeType.Dispatch)
    Com4jObject sharedWorkspace();


    /**
     * <p>
     * Getter method for the COM property "Sync"
     * </p>
     * @return  Returns a value of type com4j.Com4jObject
     */

    @DISPID(1610744025) //= 0x600200d9. The runtime will prefer the VTID if present
    @VTID(224)
    @ReturnValue(type=NativeType.Dispatch)
    Com4jObject sync();


    /**
     * @param removeHiddenInfoItems Mandatory int parameter.
     */

    @DISPID(1610744026) //= 0x600200da. The runtime will prefer the VTID if present
    @VTID(225)
    void removeHiddenInformation(
      int removeHiddenInfoItems);


    /**
     * <p>
     * Getter method for the COM property "DataRecordsets"
     * </p>
     * @return  Returns a value of type IVDataRecordsets
     */

    @DISPID(1610744027) //= 0x600200db. The runtime will prefer the VTID if present
    @VTID(226)
    IVDataRecordsets dataRecordsets();


    @VTID(226)
    @ReturnValue(defaultPropertyThrough={IVDataRecordsets.class})
    IVDataRecordset dataRecordsets(
      int index);

    /**
     * @param eType Mandatory VisThemeTypes parameter.
     * @return  Returns a value of type java.lang.String[]
     */

    @DISPID(1610744028) //= 0x600200dc. The runtime will prefer the VTID if present
    @VTID(227)
    String[] getThemeNames(
      VisThemeTypes eType);


    /**
     * @param eType Mandatory VisThemeTypes parameter.
     * @return  Returns a value of type java.lang.String[]
     */

    @DISPID(1610744029) //= 0x600200dd. The runtime will prefer the VTID if present
    @VTID(228)
    String[] getThemeNamesU(
      VisThemeTypes eType);


    /**
     * @return  Returns a value of type boolean
     */

    @DISPID(1610744030) //= 0x600200de. The runtime will prefer the VTID if present
    @VTID(229)
    boolean canUndoCheckOut();


    /**
     */

    @DISPID(1610744031) //= 0x600200df. The runtime will prefer the VTID if present
    @VTID(230)
    void undoCheckOut();


    /**
     * <p>
     * Getter method for the COM property "ContainsWorkspaceEx"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610744032) //= 0x600200e0. The runtime will prefer the VTID if present
    @VTID(231)
    boolean containsWorkspaceEx();


    /**
     * <p>
     * Setter method for the COM property "ContainsWorkspaceEx"
     * </p>
     * @param trueOrFalse Mandatory boolean parameter.
     */

    @DISPID(1610744032) //= 0x600200e0. The runtime will prefer the VTID if present
    @VTID(232)
    void containsWorkspaceEx(
      boolean trueOrFalse);


    /**
     * @param fixedFormat Mandatory VisFixedFormatTypes parameter.
     * @param outputFileName Mandatory java.lang.String parameter.
     * @param intent Mandatory VisDocExIntent parameter.
     * @param printRange Mandatory VisPrintOutRange parameter.
     * @param fromPage Optional parameter. Default value is 1
     * @param toPage Optional parameter. Default value is -1
     * @param colorAsBlack Optional parameter. Default value is false
     * @param includeBackground Optional parameter. Default value is false
     * @param includeDocumentProperties Optional parameter. Default value is false
     * @param includeStructureTags Optional parameter. Default value is false
     * @param useISO19005_1 Optional parameter. Default value is false
     * @param fixedFormatExtClass Optional parameter. Default value is com4j.Variant.getMissing()
     */

    @DISPID(1610744034) //= 0x600200e2. The runtime will prefer the VTID if present
    @VTID(233)
    void exportAsFixedFormat(
      VisFixedFormatTypes fixedFormat,
      String outputFileName,
      VisDocExIntent intent,
      VisPrintOutRange printRange,
      @Optional @DefaultValue("1") int fromPage,
      @Optional @DefaultValue("-1") int toPage,
      @Optional @DefaultValue("0") boolean colorAsBlack,
      @Optional @DefaultValue("-1") boolean includeBackground,
      @Optional @DefaultValue("-1") boolean includeDocumentProperties,
      @Optional @DefaultValue("-1") boolean includeStructureTags,
      @Optional @DefaultValue("0") boolean useISO19005_1,
      @Optional @MarshalAs(NativeType.VARIANT) Object fixedFormatExtClass);


    /**
     * <p>
     * Getter method for the COM property "DefaultSavePath"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610744035) //= 0x600200e3. The runtime will prefer the VTID if present
    @VTID(234)
    String defaultSavePath();


    /**
     * <p>
     * Setter method for the COM property "DefaultSavePath"
     * </p>
     * @param saveLocation Mandatory java.lang.String parameter.
     */

    @DISPID(1610744035) //= 0x600200e3. The runtime will prefer the VTID if present
    @VTID(235)
    void defaultSavePath(
      String saveLocation);


    /**
     * <p>
     * Getter method for the COM property "CustomUI"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610744037) //= 0x600200e5. The runtime will prefer the VTID if present
    @VTID(236)
    String customUI();


    /**
     * <p>
     * Setter method for the COM property "CustomUI"
     * </p>
     * @param lpbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610744037) //= 0x600200e5. The runtime will prefer the VTID if present
    @VTID(237)
    void customUI(
      String lpbstrRet);


    /**
     * <p>
     * Getter method for the COM property "UserCustomUI"
     * </p>
     * @return  Returns a value of type java.lang.String
     */

    @DISPID(1610744039) //= 0x600200e7. The runtime will prefer the VTID if present
    @VTID(238)
    String userCustomUI();


    /**
     * <p>
     * Setter method for the COM property "UserCustomUI"
     * </p>
     * @param lpbstrRet Mandatory java.lang.String parameter.
     */

    @DISPID(1610744039) //= 0x600200e7. The runtime will prefer the VTID if present
    @VTID(239)
    void userCustomUI(
      String lpbstrRet);


    /**
     * <p>
     * Getter method for the COM property "ServerPublishOptions"
     * </p>
     * @return  Returns a value of type IVServerPublishOptions
     */

    @DISPID(1610744041) //= 0x600200e9. The runtime will prefer the VTID if present
    @VTID(240)
    IVServerPublishOptions serverPublishOptions();


    /**
     * <p>
     * Getter method for the COM property "Validation"
     * </p>
     * @return  Returns a value of type IVValidation
     */

    @DISPID(1610744042) //= 0x600200ea. The runtime will prefer the VTID if present
    @VTID(241)
    IVValidation validation();


    @VTID(241)
    @ReturnValue(defaultPropertyThrough={IVValidation.class,IVValidationIssues.class})
    IVValidationIssue validation(
      int index);

    /**
     * <p>
     * Getter method for the COM property "DiagramServicesEnabled"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610744043) //= 0x600200eb. The runtime will prefer the VTID if present
    @VTID(242)
    int diagramServicesEnabled();


    /**
     * <p>
     * Setter method for the COM property "DiagramServicesEnabled"
     * </p>
     * @param pDiagramServices Mandatory int parameter.
     */

    @DISPID(1610744043) //= 0x600200eb. The runtime will prefer the VTID if present
    @VTID(243)
    void diagramServicesEnabled(
      int pDiagramServices);


    /**
     * <p>
     * Getter method for the COM property "CompatibilityMode"
     * </p>
     * @return  Returns a value of type boolean
     */

    @DISPID(1610744045) //= 0x600200ed. The runtime will prefer the VTID if present
    @VTID(244)
    boolean compatibilityMode();


    /**
     * <p>
     * Getter method for the COM property "Comments"
     * </p>
     * @return  Returns a value of type IVComments
     */

    @DISPID(1610744046) //= 0x600200ee. The runtime will prefer the VTID if present
    @VTID(245)
    IVComments comments();


    @VTID(245)
    @ReturnValue(defaultPropertyThrough={IVComments.class})
    IVComment comments(
      int index);

    /**
     * <p>
     * Getter method for the COM property "EditorCount"
     * </p>
     * @return  Returns a value of type int
     */

    @DISPID(1610744047) //= 0x600200ef. The runtime will prefer the VTID if present
    @VTID(246)
    int editorCount();


    /**
     * <p>
     * Getter method for the COM property "Permission"
     * </p>
     * @return  Returns a value of type com4j.Com4jObject
     */

    @DISPID(1610744048) //= 0x600200f0. The runtime will prefer the VTID if present
    @VTID(247)
    @ReturnValue(type=NativeType.Dispatch)
    Com4jObject permission();


    // Properties:
  }

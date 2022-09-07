package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0727-0000-0000-C000-000000000046}")
public interface IVMasterShortcut extends Com4jObject {
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
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type IVDocument
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short index();


  /**
   * <p>
   * Returns visObjTypeMasterShortcut (47).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  short stat();


  /**
   * <p>
   * MasterShortcut's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  String name();


  /**
   * <p>
   * MasterShortcut's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  void name(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Getter method for the COM property "Prompt"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  String prompt();


  /**
   * <p>
   * Setter method for the COM property "Prompt"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  void prompt(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "AlignName"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  short alignName();


  /**
   * <p>
   * Setter method for the COM property "AlignName"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  void alignName(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "IconSize"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  short iconSize();


  /**
   * <p>
   * Setter method for the COM property "IconSize"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  void iconSize(
    short lpi2Ret);


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(20)
  void delete();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(21)
  void importIcon(
    String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param flags Mandatory short parameter.
   * @param transparentRGB Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(22)
  void exportIcon(
    String fileName,
    short flags,
    @Optional @MarshalAs(NativeType.VARIANT) Object transparentRGB);


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(23)
  int id();


  /**
   * @return  Returns a value of type IVWindow
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(24)
  IVWindow openIconWindow();


  /**
   * <p>
   * Getter method for the COM property "TargetDocumentName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(25)
  String targetDocumentName();


  /**
   * <p>
   * Setter method for the COM property "TargetDocumentName"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(26)
  void targetDocumentName(
    String lpbstrRet);


  /**
   * <p>
   * Locale independent name of target Master.
   * </p>
   * <p>
   * Getter method for the COM property "TargetMasterName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(27)
  String targetMasterName();


  /**
   * <p>
   * Locale independent name of target Master.
   * </p>
   * <p>
   * Setter method for the COM property "TargetMasterName"
   * </p>
   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(28)
  void targetMasterName(
    String lpLocaleIndependentName);


  /**
   * <p>
   * Getter method for the COM property "TargetBaseID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(29)
  String targetBaseID();


  /**
   * <p>
   * Setter method for the COM property "TargetBaseID"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(30)
  void targetBaseID(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "DropActions"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(31)
  String dropActions();


  /**
   * <p>
   * Setter method for the COM property "DropActions"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(32)
  void dropActions(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "ShapeHelp"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(33)
  String shapeHelp();


  /**
   * <p>
   * Setter method for the COM property "ShapeHelp"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(34)
  void shapeHelp(
    String lpbstrRet);


  /**
   * <p>
   * MasterShortcut's locale independent name.
   * </p>
   * <p>
   * Getter method for the COM property "NameU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(35)
  String nameU();


  /**
   * <p>
   * MasterShortcut's locale independent name.
   * </p>
   * <p>
   * Setter method for the COM property "NameU"
   * </p>
   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(36)
  void nameU(
    String lpLocaleIndependentName);


  /**
   * <p>
   * Getter method for the COM property "IndexInStencil"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(37)
  short indexInStencil();


  /**
   * <p>
   * Getter method for the COM property "Icon"
   * </p>
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610743839) //= 0x6002001f. The runtime will prefer the VTID if present
  @VTID(38)
  Holder<com4j.stdole.IPictureDisp> icon();


  /**
   * <p>
   * Setter method for the COM property "Icon"
   * </p>
   * @param ppPictureDisp Mandatory Holder<com4j.stdole.IPictureDisp> parameter.
   */

  @DISPID(1610743839) //= 0x6002001f. The runtime will prefer the VTID if present
  @VTID(39)
  void icon(
    Holder<com4j.stdole.IPictureDisp> ppPictureDisp);


  /**
   * <p>
   * Setter method for the COM property "IndexInStencil"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(40)
  void indexInStencil(
    short lpi2Ret);


  // Properties:
}

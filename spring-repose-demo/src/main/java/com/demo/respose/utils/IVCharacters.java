package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0702-0000-0000-C000-000000000046}")
public interface IVCharacters extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Adds custom field. Formula parsed against locale specific syntax.
   * </p>
   * @param formula Mandatory java.lang.String parameter.
   * @param format Mandatory short parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void addCustomField(
    String formula,
    short format);


  /**
   * @param category Mandatory short parameter.
   * @param code Mandatory short parameter.
   * @param format Mandatory short parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void addField(
    short category,
    short code,
    short format);


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type IVApplication
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Begin"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  int begin();


  /**
   * <p>
   * Setter method for the COM property "Begin"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  void begin(
    int lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "CharCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  int charCount();


  /**
   * <p>
   * Setter method for the COM property "CharProps"
   * </p>
   * @param cellIndex Mandatory short parameter.
   * @param rhs Mandatory short parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(13)
  void charProps(
    short cellIndex,
    short rhs);


  /**
   * <p>
   * Getter method for the COM property "CharPropsRow"
   * </p>
   * @param biasLorR Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(14)
  short charPropsRow(
    short biasLorR);


  /**
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  void copy();


  /**
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  void cut();


  /**
   * <p>
   * Returns visObjTypeChars (5).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "End"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  int end();


  /**
   * <p>
   * Setter method for the COM property "End"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(19)
  void end(
    int lpi4Ret);


  /**
   * <p>
   * Getter method for the COM property "FieldCategory"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  short fieldCategory();


  /**
   * <p>
   * Getter method for the COM property "FieldCode"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  short fieldCode();


  /**
   * <p>
   * Getter method for the COM property "FieldFormat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  short fieldFormat();


  /**
   * <p>
   * Returns field's formula in in locale specific syntax.
   * </p>
   * <p>
   * Getter method for the COM property "FieldFormula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  String fieldFormula();


  /**
   * <p>
   * Getter method for the COM property "IsField"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  short isField();


  /**
   * <p>
   * Setter method for the COM property "ParaProps"
   * </p>
   * @param cellIndex Mandatory short parameter.
   * @param rhs Mandatory short parameter.
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(25)
  void paraProps(
    short cellIndex,
    short rhs);


  /**
   * <p>
   * Getter method for the COM property "ParaPropsRow"
   * </p>
   * @param biasLorR Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  short paraPropsRow(
    short biasLorR);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(27)
  void paste();


  /**
   * <p>
   * Getter method for the COM property "TabPropsRow"
   * </p>
   * @param biasLorR Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
  short tabPropsRow(
    short biasLorR);


  /**
   * <p>
   * Getter method for the COM property "RunBegin"
   * </p>
   * @param runType Mandatory short parameter.
   * @return  Returns a value of type int
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  int runBegin(
    short runType);


  /**
   * <p>
   * Getter method for the COM property "RunEnd"
   * </p>
   * @param runType Mandatory short parameter.
   * @return  Returns a value of type int
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  int runEnd(
    short runType);


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(31)
  IVShape shape();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(32)
  short stat();


  /**
   * <p>
   * Superseded by variant=Characters.Text.
   * </p>
   * <p>
   * Getter method for the COM property "TextAsString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(999) //= 0x3e7. The runtime will prefer the VTID if present
  @VTID(33)
  String textAsString();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param lpvarRet Mandatory java.lang.Object parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(34)
  @DefaultMethod
  void text(
    @MarshalAs(NativeType.VARIANT) Object lpvarRet);


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type IVDocument
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(35)
  IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type IVEventList
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(36)
  IVEventList eventList();


  @VTID(36)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(37)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(38)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  Object text();


  /**
   * <p>
   * Adds custom field. Formula parsed against locale independent syntax.
   * </p>
   * @param formula Mandatory java.lang.String parameter.
   * @param format Mandatory short parameter.
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(39)
  void addCustomFieldU(
    String formula,
    short format);


  /**
   * <p>
   * Returns field's formula in in locale independent syntax.
   * </p>
   * <p>
   * Getter method for the COM property "FieldFormulaU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(40)
  String fieldFormulaU();


  /**
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(41)
  void delete();


  /**
   * @param category Mandatory tagVisFieldCategories parameter.
   * @param code Mandatory tagVisFieldCodes parameter.
   * @param format Mandatory tagVisFieldFormats parameter.
   * @param langID Optional parameter. Default value is 0
   * @param calendarID Optional parameter. Default value is -1
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(42)
  void addFieldEx(
    tagVisFieldCategories category,
    tagVisFieldCodes code,
    tagVisFieldFormats format,
    @Optional @DefaultValue("0") int langID,
    @Optional @DefaultValue("-1") int calendarID);


  /**
   * <p>
   * Getter method for the COM property "ContainingPageID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743844) //= 0x60020024. The runtime will prefer the VTID if present
  @VTID(43)
  int containingPageID();


  /**
   * <p>
   * Getter method for the COM property "ContainingMasterID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743845) //= 0x60020025. The runtime will prefer the VTID if present
  @VTID(44)
  int containingMasterID();


  // Properties:
}

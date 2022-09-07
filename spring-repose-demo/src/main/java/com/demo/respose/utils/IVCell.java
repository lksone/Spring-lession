package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D0701-0000-0000-C000-000000000046}")
public interface IVCell extends Com4jObject {
  // Methods:
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
  @VTID(7)
 

    IVApplication application();


  /**
   * <p>
   * Returns visObjTypeCell (4).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Error"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short error();


  /**
   * <p>
   * Cell's formula in locale specific syntax.
   * </p>
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  String formula();


  /**
   * <p>
   * Cell's formula in locale specific syntax.
   * </p>
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  void formula(
    String lpbstrRet);


  /**
   * <p>
   * Sets cell's formula overriding guard. Parsed against locale specific syntax.
   * </p>
   * <p>
   * Setter method for the COM property "FormulaForce"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  void formulaForce(
    String rhs);


  /**
   * @param cellObject MandatoryIVCell parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  void glueTo(
   IVCell cellObject);


  /**
   * @param sheetObject MandatoryIVShape parameter.
   * @param xPercent Mandatory double parameter.
   * @param yPercent Mandatory double parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  void glueToPos(
   IVShape sheetObject,
    double xPercent,
    double yPercent);


  /**
   * <p>
   * Getter method for the COM property "Result"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @return  Returns a value of type double
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  double result(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   * <p>
   * Setter method for the COM property "Result"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  void result(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    double lpr8Ret);


  /**
   * <p>
   * Setter method for the COM property "ResultForce"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @param rhs Mandatory double parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
  void resultForce(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "ResultIU"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(18)
  @DefaultMethod
  double resultIU();


  /**
   * <p>
   * Setter method for the COM property "ResultIU"
   * </p>
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  void resultIU(
    double lpr8Ret);


  /**
   * <p>
   * Setter method for the COM property "ResultIUForce"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(20)
  void resultIUForce(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(21)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Units"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(22)
  short units();


  /**
   * <p>
   * Cell's name in locale independent syntax.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(23)
  String name();


  /**
   * <p>
   * Cell's name in locale specific syntax.
   * </p>
   * <p>
   * Getter method for the COM property "LocalName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(24)
  String localName();


  /**
   * <p>
   * Name of cell's row in locale specific syntax.
   * </p>
   * <p>
   * Setter method for the COM property "RowName"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(25)
  void rowName(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(26)
 

    IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of typeIVShape
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(27)
 IVShape shape();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of typeIVStyle
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(28)
 

    IVStyle style();


  /**
   * <p>
   * Getter method for the COM property "Section"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(29)
  short section();


  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(30)
  short row();


  /**
   * <p>
   * Getter method for the COM property "Column"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(31)
  short column();


  /**
   * <p>
   * Getter method for the COM property "IsConstant"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(32)
  short isConstant();


  /**
   * <p>
   * Getter method for the COM property "IsInherited"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(33)
  short isInherited();


  /**
   * <p>
   * Getter method for the COM property "ResultInt"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @param fRound Mandatory short parameter.
   * @return  Returns a value of type int
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(34)
  int resultInt(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    short fRound);


  /**
   * <p>
   * Setter method for the COM property "ResultFromInt"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2499) //= 0x9c3. The runtime will prefer the VTID if present
  @VTID(35)
  void resultFromInt(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    int rhs);


  /**
   * <p>
   * Setter method for the COM property "ResultFromIntForce"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @param rhs Mandatory int parameter.
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(36)
  void resultFromIntForce(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode,
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ResultStr"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(37)
  String resultStr(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  /**
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(38)
  void trigger();


  /**
   * <p>
   * Name of cell's row in locale specific syntax.
   * </p>
   * <p>
   * Getter method for the COM property "RowName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(39)
  String rowName();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of typeIVEventList
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(40)
 

    IVEventList eventList();


  @VTID(40)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
 IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(41)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "ContainingRow"
   * </p>
   * @return  Returns a value of typeIVRow
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(42)
 IVRow containingRow();


  @VTID(42)
  @ReturnValue(defaultPropertyThrough={IVRow.class})
  IVCell containingRow(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Cell's formula in locale independent syntax.
   * </p>
   * <p>
   * Getter method for the COM property "FormulaU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(43)
  String formulaU();


  /**
   * <p>
   * Cell's formula in locale independent syntax.
   * </p>
   * <p>
   * Setter method for the COM property "FormulaU"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(44)
  void formulaU(
    String lpbstrRet);


  /**
   * <p>
   * Sets cell's formula overriding guard. Parsed against locale independent syntax.
   * </p>
   * <p>
   * Setter method for the COM property "FormulaForceU"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(45)
  void formulaForceU(
    String rhs);


  /**
   * <p>
   * Name of cell's row in locale independent syntax.
   * </p>
   * <p>
   * Getter method for the COM property "RowNameU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(46)
  String rowNameU();


  /**
   * <p>
   * Name of cell's row in locale independent syntax.
   * </p>
   * <p>
   * Setter method for the COM property "RowNameU"
   * </p>
   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(47)
  void rowNameU(
    String lpLocaleIndependentName);


  /**
   * <p>
   * Getter method for the COM property "InheritedValueSource"
   * </p>
   * @return  Returns a value of type IVCell
   */

  @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
  @VTID(48)
  IVCell inheritedValueSource();


  /**
   * <p>
   * Getter method for the COM property "InheritedFormulaSource"
   * </p>
   * @return  Returns a value of type IVCell
   */

  @DISPID(1610743850) //= 0x6002002a. The runtime will prefer the VTID if present
  @VTID(49)
  IVCell inheritedFormulaSource();


  /**
   * <p>
   * Getter method for the COM property "ContainingPageID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743853) //= 0x6002002d. The runtime will prefer the VTID if present
  @VTID(52)
  int containingPageID();


  /**
   * <p>
   * Getter method for the COM property "ContainingMasterID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743854) //= 0x6002002e. The runtime will prefer the VTID if present
  @VTID(53)
  int containingMasterID();


  /**
   * <p>
   * Getter method for the COM property "ResultStrU"
   * </p>
   * @param unitsNameOrCode Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743855) //= 0x6002002f. The runtime will prefer the VTID if present
  @VTID(54)
  String resultStrU(
    @MarshalAs(NativeType.VARIANT) Object unitsNameOrCode);


  // Properties:
}

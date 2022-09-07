package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D0712-0000-0000-C000-000000000046}")
public interface IVLayer extends Com4jObject {
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
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
 

    IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return  Returns a value of typeIVPage
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
 IVPage page();


  /**
   * <p>
   * Getter method for the COM property "Master"
   * </p>
   * @return  Returns a value of typeIVMaster
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
 

    IVMaster master();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  short index();


  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(12)
  short row();


  /**
   * @param sheetObject MandatoryIVShape parameter.
   * @param fPresMems Mandatory short parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(13)
  void add(
   IVShape sheetObject,
    short fPresMems);


  /**
   * @param sheetObject MandatoryIVShape parameter.
   * @param fPresMems Mandatory short parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(14)
  void remove(
   IVShape sheetObject,
    short fPresMems);


  /**
   * @param fDeleteShapes Mandatory short parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  void delete(
    short fDeleteShapes);


  /**
   * <p>
   * Layer's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(16)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Layer's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(17)
  @DefaultMethod
  void name(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Getter method for the COM property "CellsC"
   * </p>
   * @param column Mandatory short parameter.
   * @return  Returns a value of typeIVCell
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(18)
 IVCell cellsC(
    short column);


  /**
   * <p>
   * Returns visObjTypeLayer (25).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(19)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(20)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of typeIVEventList
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(21)
 

    IVEventList eventList();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
 IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(22)
  short persistsEvents();


  /**
   * <p>
   * Layer's locale independent name.
   * </p>
   * <p>
   * Getter method for the COM property "NameU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(23)
  String nameU();


  /**
   * <p>
   * Layer's locale independent name.
   * </p>
   * <p>
   * Setter method for the COM property "NameU"
   * </p>
   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  void nameU(
    String lpLocaleIndependentName);


  // Properties:
}

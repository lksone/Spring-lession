package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0706-0000-0000-C000-000000000046}")
public interface IVDocuments extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(7)
 IVDocument add(
    String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(8)
 IVDocument open(
    String fileName);


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of typeIVApplication
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
 

    IVApplication application();


  /**
   * <p>
   * Returns visObjTypeDocs (11).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  short objectType();


  /**
   * <p>
   * The first item in a Documents collection is item 1.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
 IVDocument item(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(12)
  short count();


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param flags Mandatory short parameter.
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
 IVDocument openEx(
    String fileName,
    short flags);


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of typeIVEventList
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
 

    IVEventList eventList();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
 IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  short persistsEvents();


  /**
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
  String[] getNames();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @Override
  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param objectID Mandatory int parameter.
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
 IVDocument itemFromID(
    int objectID);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  boolean canCheckOut(
    String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  void checkOut(
    String fileName);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param measurementSystem Optional parameter. Default value is 0
   * @param flags Optional parameter. Default value is 0
   * @param langID Optional parameter. Default value is 0
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
 IVDocument addEx(
    String fileName,
    @Optional @DefaultValue("0")VisMeasurementSystem measurementSystem,
    @Optional @DefaultValue("0") int flags,
    @Optional @DefaultValue("0") int langID);


  // Properties:
}

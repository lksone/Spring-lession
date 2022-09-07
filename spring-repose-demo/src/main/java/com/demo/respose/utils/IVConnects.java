package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0704-0000-0000-C000-000000000046}")
public interface IVConnects extends Com4jObject,Iterable<Com4jObject> {
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

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(7)
 

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Item16"
   * </p>
   * @param index Mandatory short parameter.
   * @return  Returns a value of typeIVConnect
   */

  @DISPID(999) //= 0x3e7. The runtime will prefer the VTID if present
  @VTID(8)
 IVConnect item16(
    short index);


  /**
   * <p>
   * Getter method for the COM property "Count16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  short count16();


  /**
   * <p>
   * Getter method for the COM property "FromSheet"
   * </p>
   * @return  Returns a value of typeIVShape
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
 IVShape fromSheet();


  /**
   * <p>
   * Returns visObjTypeConnects (9).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  

    IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "ToSheet"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  IVShape toSheet();


  /**
   * <p>
   * The first item in a Connects collection is item 1.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type IVConnect
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(15)
  @DefaultMethod
  IVConnect item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(16)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

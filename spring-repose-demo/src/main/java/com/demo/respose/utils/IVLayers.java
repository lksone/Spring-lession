package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0713-0000-0000-C000-000000000046}")
public interface IVLayers extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(11)
  short count();


  /**
   * <p>
   * The first item in a Layers collection is item 1. Name treated as locale specific.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of typeIVLayer
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
 IVLayer item(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);


  /**
   * @param layerName Mandatory java.lang.String parameter.
   * @return  Returns a value of typeIVLayer
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
 IVLayer add(
    String layerName);


  /**
   * <p>
   * Returns visObjTypeLayers (26).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of typeIVEventList
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(16)
 

    IVEventList eventList();


  @VTID(16)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  short persistsEvents();


  /**
   * <p>
   * Like Item() but names treated locale independent.
   * </p>
   * <p>
   * Getter method for the COM property "ItemU"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type IVLayer
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(18)
  IVLayer itemU(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(19)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

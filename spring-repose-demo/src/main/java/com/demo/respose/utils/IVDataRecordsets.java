package com.demo.respose.utils

;

import com4j.*;

@IID("{000D072E-0000-0000-C000-000000000046}")
public interface IVDataRecordsets extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type IVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type IVDocument
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type IVDataRecordset
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  IVDataRecordset item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param id Mandatory int parameter.
   * @return  Returns a value of type IVDataRecordset
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  IVDataRecordset itemFromID(
    int id);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type IVEventList
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  IVEventList eventList();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * @param connectionIDOrString Mandatory java.lang.Object parameter.
   * @param commandString Mandatory java.lang.String parameter.
   * @param addOptions Mandatory int parameter.
   * @param name Optional parameter. Default value is ""
   * @return  Returns a value of type IVDataRecordset
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  IVDataRecordset add(
    @MarshalAs(NativeType.VARIANT) Object connectionIDOrString,
    String commandString,
    int addOptions,
    @Optional @DefaultValue("") String name);


  /**
   * @param xmlString Mandatory java.lang.String parameter.
   * @param addOptions Mandatory int parameter.
   * @param name Optional parameter. Default value is ""
   * @return  Returns a value of type IVDataRecordset
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  IVDataRecordset addFromXML(
    String xmlString,
    int addOptions,
    @Optional @DefaultValue("") String name);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   * @param addOptions Mandatory int parameter.
   * @param name Optional parameter. Default value is ""
   * @return  Returns a value of type IVDataRecordset
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  IVDataRecordset addFromConnectionFile(
    String fileName,
    int addOptions,
    @Optional @DefaultValue("") String name);


  /**
   * @param dataErrorCode Mandatory Holder<Integer> parameter.
   * @param dataErrorDescription Mandatory Holder<java.lang.String> parameter.
   * @param recordsetID Mandatory Holder<Integer> parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  void getLastDataError(
    Holder<Integer> dataErrorCode,
    Holder<String> dataErrorDescription,
    Holder<Integer> recordsetID);


  // Properties:
}

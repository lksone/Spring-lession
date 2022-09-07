package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0711-0000-0000-C000-000000000046}")
public interface IVWindows extends Com4jObject,Iterable<Com4jObject> {
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

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(7)
 

    IVApplication application();


  /**
   * <p>
   * Returns visObjTypeWindows (22).
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
   * The first item in a Windows collection is item 1.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory short parameter.
   * @return  Returns a value of typeIVWindow
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
 IVWindow item(
    short index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  short count();


  /**
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  void voidArrange();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of typeIVEventList
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
 

    IVEventList eventList();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
 IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  short persistsEvents();


  /**
   * @param bstrCaption Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nFlags Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nHeight Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of typeIVWindow
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(14)
 IVWindow add_WithoutMergeArgs(
    @Optional @MarshalAs(NativeType.VARIANT) Object bstrCaption,
    @Optional @MarshalAs(NativeType.VARIANT) Object nFlags,
    @Optional @MarshalAs(NativeType.VARIANT) Object nType,
    @Optional @MarshalAs(NativeType.VARIANT) Object nLeft,
    @Optional @MarshalAs(NativeType.VARIANT) Object nTop,
    @Optional @MarshalAs(NativeType.VARIANT) Object nWidth,
    @Optional @MarshalAs(NativeType.VARIANT) Object nHeight);


  /**
   * @param nArrangeFlags Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(15)
  void arrange(
    @Optional @MarshalAs(NativeType.VARIANT) Object nArrangeFlags);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @Override
  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(16)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param nID Mandatory int parameter.
   * @return  Returns a value of typeIVWindow
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(17)
 IVWindow itemFromID(
    int nID);


  /**
   * @param bstrCaption Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nFlags Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nLeft Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nTop Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nWidth Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nHeight Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bstrMergeID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param bstrMergeClass Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nMergePosition Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of typeIVWindow
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
 IVWindow add(
    @Optional @MarshalAs(NativeType.VARIANT) Object bstrCaption,
    @Optional @MarshalAs(NativeType.VARIANT) Object nFlags,
    @Optional @MarshalAs(NativeType.VARIANT) Object nType,
    @Optional @MarshalAs(NativeType.VARIANT) Object nLeft,
    @Optional @MarshalAs(NativeType.VARIANT) Object nTop,
    @Optional @MarshalAs(NativeType.VARIANT) Object nWidth,
    @Optional @MarshalAs(NativeType.VARIANT) Object nHeight,
    @Optional @MarshalAs(NativeType.VARIANT) Object bstrMergeID,
    @Optional @MarshalAs(NativeType.VARIANT) Object bstrMergeClass,
    @Optional @MarshalAs(NativeType.VARIANT) Object nMergePosition);


  /**
   * <p>
   * Getter method for the COM property "ItemEx"
   * </p>
   * @param captionOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of typeIVWindow
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
 IVWindow itemEx(
    @MarshalAs(NativeType.VARIANT) Object captionOrIndex);


  // Properties:
}

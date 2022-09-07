package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0255-0000-0000-C000-000000000046}")
public interface IVToolbars extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(7)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * The first item in a Toolbars collection is item 0.
   * </p>
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param lIndex Mandatory int parameter.
   * @return  Returns a value of typeIVToolbar
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
 IVToolbar item(
    int lIndex);


  /**
   * @return  Returns a value of typeIVToolbar
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
 IVToolbar add();


  /**
   * @param lIndex Mandatory int parameter.
   * @return  Returns a value of typeIVToolbar
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 IVToolbar addAt(
    int lIndex);


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
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of typeIVToolbarSet
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
 

    IVToolbarSet parent();


  // Properties:
}

package com.demo.respose.utils

;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000D0729-0000-0000-C000-000000000046}")
public interface IVMSGWrap extends Com4jObject {
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

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  

    IVApplication application();


  /**
   * <p>
   * Returns visObjTypeMSGWrap (48).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short objectType();


  /**
   * <p>
   * Get/Sets the hwnd field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Getter method for the COM property "hwnd"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  int hwnd();


  /**
   * <p>
   * Get/Sets the hwnd field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Setter method for the COM property "hwnd"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(10)
  void hwnd(
    int lpi4Ret);


  /**
   * <p>
   * Get/Sets the message field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Getter method for the COM property "message"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int message();


  /**
   * <p>
   * Get/Sets the message field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Setter method for the COM property "message"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void message(
    int lpi4Ret);


  /**
   * <p>
   * Get/Sets the wParam field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Getter method for the COM property "wParam"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int wParam();


  /**
   * <p>
   * Get/Sets the wParam field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Setter method for the COM property "wParam"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  void wParam(
    int lpi4Ret);


  /**
   * <p>
   * Get/Sets the lParam field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Getter method for the COM property "lParam"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  int lParam();


  /**
   * <p>
   * Get/Sets the lParam field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Setter method for the COM property "lParam"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  void lParam(
    int lpi4Ret);


  /**
   * <p>
   * Get/Sets the time field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Getter method for the COM property "posttime"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  int posttime();


  /**
   * <p>
   * Get/Sets the time field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Setter method for the COM property "posttime"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  void posttime(
    int lpi4Ret);


  /**
   * <p>
   * Get/Sets the pt.x field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Getter method for the COM property "ptx"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  int ptx();


  /**
   * <p>
   * Get/Sets the pt.x field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Setter method for the COM property "ptx"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(20)
  void ptx(
    int lpi4Ret);


  /**
   * <p>
   * Get/Sets the pt.y field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Getter method for the COM property "pty"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  int pty();


  /**
   * <p>
   * Get/Sets the pt.y field of the MSG structure being wrapped.
   * </p>
   * <p>
   * Setter method for the COM property "pty"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(22)
  void pty(
    int lpi4Ret);


  // Properties:
}

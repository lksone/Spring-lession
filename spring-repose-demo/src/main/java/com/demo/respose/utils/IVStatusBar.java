package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0282-0000-0000-C000-000000000046}")
public interface IVStatusBar extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  String _default();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param pCaption Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  void caption(
    String pCaption);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  String caption();


  /**
   * <p>
   * Getter method for the COM property "SetID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int setID();


  /**
   * <p>
   * Getter method for the COM property "StatusBarItems"
   * </p>
   * @return  Returns a value of type IVStatusBarItems
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  

    IVStatusBarItems statusBarItems();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={IVStatusBarItems.class})
  

    IVStatusBarItem statusBarItems(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type IVStatusBars
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  

    IVStatusBars parent();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={IVStatusBars.class})
  IVStatusBar parent(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  boolean builtIn();


  /**
   * <p>
   * Setter method for the COM property "Protection"
   * </p>
   * @param pProt Mandatory short parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void protection(
    short pProt);


  /**
   * <p>
   * Getter method for the COM property "Protection"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  short protection();


  // Properties:
}

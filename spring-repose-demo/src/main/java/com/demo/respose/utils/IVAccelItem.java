package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0292-0000-0000-C000-000000000046}")
public interface IVAccelItem extends Com4jObject {
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
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short _default();


  /**
   * <p>
   * Setter method for the COM property "CmdNum"
   * </p>
   * @param pwCmd Mandatory short parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  void cmdNum(
    short pwCmd);


  /**
   * <p>
   * Getter method for the COM property "CmdNum"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  short cmdNum();


  /**
   * <p>
   * Setter method for the COM property "Key"
   * </p>
   * @param pKey Mandatory short parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void key(
    short pKey);


  /**
   * <p>
   * Getter method for the COM property "Key"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  short key();


  /**
   * <p>
   * Setter method for the COM property "Alt"
   * </p>
   * @param pAlt Mandatory short parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void alt(
    short pAlt);


  /**
   * <p>
   * Getter method for the COM property "Alt"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(14)
  short alt();


  /**
   * <p>
   * Setter method for the COM property "Shift"
   * </p>
   * @param pShift Mandatory short parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  void shift(
    short pShift);


  /**
   * <p>
   * Getter method for the COM property "Shift"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(16)
  short shift();


  /**
   * <p>
   * Setter method for the COM property "Control"
   * </p>
   * @param pControl Mandatory short parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void control(
    short pControl);


  /**
   * <p>
   * Getter method for the COM property "Control"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(18)
  short control();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of typeIVAccelItems
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
 

    IVAccelItems parent();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={IVAccelItems.class})
 IVAccelItem parent(
    int lIndex);

  /**
   * <p>
   * Setter method for the COM property "AddOnName"
   * </p>
   * @param pAddOnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  void addOnName(
    String pAddOnName);


  /**
   * <p>
   * Getter method for the COM property "AddOnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  String addOnName();


  /**
   * <p>
   * Setter method for the COM property "AddOnArgs"
   * </p>
   * @param pAddOnArgs Mandatory java.lang.String parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  void addOnArgs(
    String pAddOnArgs);


  /**
   * <p>
   * Getter method for the COM property "AddOnArgs"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  String addOnArgs();


  // Properties:
}

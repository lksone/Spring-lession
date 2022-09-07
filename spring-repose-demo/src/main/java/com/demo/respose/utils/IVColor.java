package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0716-0000-0000-C000-000000000046}")
public interface IVColor extends Com4jObject {
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
   * Getter method for the COM property "Index16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short index16();


  /**
   * <p>
   * Getter method for the COM property "Red"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(10)
  short red();


  /**
   * <p>
   * Setter method for the COM property "Red"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  void red(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Green"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
  short green();


  /**
   * <p>
   * Setter method for the COM property "Green"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  void green(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Blue"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  short blue();


  /**
   * <p>
   * Setter method for the COM property "Blue"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  void blue(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Flags"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  short flags();


  /**
   * <p>
   * Setter method for the COM property "Flags"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  void flags(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "PaletteEntry"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(18)
  @DefaultMethod
  int paletteEntry();


  /**
   * <p>
   * Setter method for the COM property "PaletteEntry"
   * </p>
   * @param lpi4Ret Mandatory int parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  void paletteEntry(
    int lpi4Ret);


  /**
   * <p>
   * Returns visObjTypeColor (29).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  int index();


  // Properties:
}

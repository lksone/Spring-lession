package com.demo.respose.utils

;

import com4j.*;

@IID("{000D071D-0000-0000-C000-000000000046}")
public interface IVHyperlink extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
  String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  void description(
    String lpbstrRet);


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
  @VTID(9)
 

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of typeIVShape
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
 IVShape shape();


  /**
   * <p>
   * Returns visObjTypeHyperlink (37).
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
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
  String address();


  /**
   * <p>
   * Setter method for the COM property "Address"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  void address(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "SubAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  String subAddress();


  /**
   * <p>
   * Setter method for the COM property "SubAddress"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  void subAddress(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "NewWindow"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  short newWindow();


  /**
   * <p>
   * Setter method for the COM property "NewWindow"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void newWindow(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ExtraInfo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  String extraInfo();


  /**
   * <p>
   * Setter method for the COM property "ExtraInfo"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(20)
  void extraInfo(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Frame"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  String frame();


  /**
   * <p>
   * Setter method for the COM property "Frame"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(22)
  void frame(
    String lpbstrRet);


  /**
   * @param favoritesTitle Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  void addToFavorites(
    @Optional @MarshalAs(NativeType.VARIANT) Object favoritesTitle);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  void follow();


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(25)
  void delete();


  /**
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(26)
  void copy();


  /**
   * @param canonicalForm Mandatory short parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(27)
  String createURL(
    short canonicalForm);


  /**
   * <p>
   * Getter method for the COM property "Row"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(28)
  short row();


  /**
   * <p>
   * Getter method for the COM property "IsDefaultLink"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(29)
  short isDefaultLink();


  /**
   * <p>
   * Setter method for the COM property "IsDefaultLink"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(30)
  void isDefaultLink(
    short lpi2Ret);


  /**
   * <p>
   * Hyperlinks's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(31)
  String name();


  /**
   * <p>
   * Hyperlinks's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(32)
  void name(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Hyperlinks's locale independent name.
   * </p>
   * <p>
   * Getter method for the COM property "NameU"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(33)
  String nameU();


  /**
   * <p>
   * Hyperlinks's locale independent name.
   * </p>
   * <p>
   * Setter method for the COM property "NameU"
   * </p>
   * @param lpLocaleIndepenentName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
  @VTID(34)
  void nameU(
    String lpLocaleIndepenentName);


  // Properties:
}

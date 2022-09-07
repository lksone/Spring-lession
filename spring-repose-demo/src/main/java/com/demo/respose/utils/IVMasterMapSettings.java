package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0745-0000-0000-C000-000000000046}")
public interface IVMasterMapSettings extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of typeIVApplication
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
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  short objectType();


  /**
   * @param stencilName Mandatory java.lang.String parameter.
   * @param masterName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void setDefaultMaster(
    String stencilName,
    String masterName);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @param stencilName Mandatory java.lang.String parameter.
   * @param masterName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  void addMapping(
    String value,
    String stencilName,
    String masterName);


  /**
   * <p>
   * Getter method for the COM property "MasterColumnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  String masterColumnName();


  /**
   * <p>
   * Setter method for the COM property "MasterColumnName"
   * </p>
   * @param pColumnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void masterColumnName(
    String pColumnName);


  /**
   * <p>
   * Getter method for the COM property "DefaultMasterStencilName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  String defaultMasterStencilName();


  /**
   * <p>
   * Getter method for the COM property "DefaultMasterName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  String defaultMasterName();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  int count();


  /**
   * @param index Mandatory int parameter.
   * @param pValue Mandatory Holder<java.lang.String> parameter.
   * @param pStencilName Mandatory Holder<java.lang.String> parameter.
   * @param pMasterName Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void getMapping(
    int index,
    Holder<String> pValue,
    Holder<String> pStencilName,
    Holder<String> pMasterName);


  // Properties:
}

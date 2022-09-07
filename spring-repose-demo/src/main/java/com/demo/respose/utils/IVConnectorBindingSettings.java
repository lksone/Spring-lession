package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0747-0000-0000-C000-000000000046}")
public interface IVConnectorBindingSettings extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "ConnectorMasterMapSettings"
   * </p>
   * @return  Returns a value of typeIVMasterMapSettings
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 IVMasterMapSettings connectorMasterMapSettings();


  /**
   * <p>
   * Setter method for the COM property "ConnectorMasterMapSettings"
   * </p>
   * @param ppMasterMapSettings MandatoryIVMasterMapSettings parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(11)
  void connectorMasterMapSettings(
   IVMasterMapSettings ppMasterMapSettings);


  /**
   * <p>
   * Getter method for the COM property "ConnectorColumnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  String connectorColumnName();


  /**
   * <p>
   * Setter method for the COM property "ConnectorColumnName"
   * </p>
   * @param pColumnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void connectorColumnName(
    String pColumnName);


  /**
   * <p>
   * Getter method for the COM property "LabelColumnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  String labelColumnName();


  /**
   * <p>
   * Setter method for the COM property "LabelColumnName"
   * </p>
   * @param pColumnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(15)
  void labelColumnName(
    String pColumnName);


  /**
   * <p>
   * Getter method for the COM property "Separator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  String separator();


  /**
   * <p>
   * Setter method for the COM property "Separator"
   * </p>
   * @param pSeparator Mandatory java.lang.String parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  void separator(
    String pSeparator);


  /**
   * <p>
   * Getter method for the COM property "ConnectorDirection"
   * </p>
   * @return  Returns a value of typeVisConnectorDirection
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
 VisConnectorDirection connectorDirection();


  /**
   * <p>
   * Setter method for the COM property "ConnectorDirection"
   * </p>
   * @param pDirection MandatoryVisConnectorDirection parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(19)
  void connectorDirection(
   VisConnectorDirection pDirection);


  // Properties:
}

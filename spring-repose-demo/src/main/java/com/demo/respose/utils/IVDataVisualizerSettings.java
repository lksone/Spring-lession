package com.demo.respose.utils

;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000D074A-0000-0000-C000-000000000046}")
public interface IVDataVisualizerSettings extends Com4jObject {
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
   * Getter method for the COM property "ShapeBindingSettings"
   * </p>
   * @return  Returns a value of typeIVShapeBindingSettings
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 IVShapeBindingSettings shapeBindingSettings();


  /**
   * <p>
   * Setter method for the COM property "ShapeBindingSettings"
   * </p>
   * @param ppShapeBindingSettings MandatoryIVShapeBindingSettings parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(11)
  void shapeBindingSettings(
   IVShapeBindingSettings ppShapeBindingSettings);


  /**
   * <p>
   * Getter method for the COM property "ConnectorBindingSettings"
   * </p>
   * @return  Returns a value of typeIVConnectorBindingSettings
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
 

    IVConnectorBindingSettings connectorBindingSettings();


  /**
   * <p>
   * Setter method for the COM property "ConnectorBindingSettings"
   * </p>
   * @param ppConnectorBindingSettings MandatoryIVConnectorBindingSettings parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void connectorBindingSettings(
   IVConnectorBindingSettings ppConnectorBindingSettings);


  /**
   * <p>
   * Getter method for the COM property "CrossFunctionalFlowchartBindingSettings"
   * </p>
   * @return  Returns a value of typeIVCrossFunctionalFlowchartBindingSettings
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
 

    IVCrossFunctionalFlowchartBindingSettings crossFunctionalFlowchartBindingSettings();


  /**
   * <p>
   * Setter method for the COM property "CrossFunctionalFlowchartBindingSettings"
   * </p>
   * @param ppCFFBindingSettings MandatoryIVCrossFunctionalFlowchartBindingSettings parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(15)
  void crossFunctionalFlowchartBindingSettings(
   IVCrossFunctionalFlowchartBindingSettings ppCFFBindingSettings);


  /**
   * <p>
   * Getter method for the COM property "LayoutSettings"
   * </p>
   * @return  Returns a value of typeIVLayoutSettings
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
 IVLayoutSettings layoutSettings();


  /**
   * <p>
   * Setter method for the COM property "LayoutSettings"
   * </p>
   * @param ppLayoutSettings MandatoryIVLayoutSettings parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  void layoutSettings(
   IVLayoutSettings ppLayoutSettings);


  // Properties:
}

package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0748-0000-0000-C000-000000000046}")
public interface IVCrossFunctionalFlowchartBindingSettings extends Com4jObject {
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
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of typeVisCrossFunctionalFlowchartOrientation
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 VisCrossFunctionalFlowchartOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param pOrientation MandatoryVisCrossFunctionalFlowchartOrientation parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(11)
  void orientation(
   VisCrossFunctionalFlowchartOrientation pOrientation);


  /**
   * <p>
   * Getter method for the COM property "SwimlaneColumnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  String swimlaneColumnName();


  /**
   * <p>
   * Setter method for the COM property "SwimlaneColumnName"
   * </p>
   * @param pColumnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void swimlaneColumnName(
    String pColumnName);


  /**
   * <p>
   * Getter method for the COM property "PhaseColumnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  String phaseColumnName();


  /**
   * <p>
   * Setter method for the COM property "PhaseColumnName"
   * </p>
   * @param pColumnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(15)
  void phaseColumnName(
    String pColumnName);


  /**
   * <p>
   * Getter method for the COM property "OrderedSwimlanes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  boolean orderedSwimlanes();


  /**
   * <p>
   * Setter method for the COM property "OrderedSwimlanes"
   * </p>
   * @param pBOrdered Mandatory boolean parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  void orderedSwimlanes(
    boolean pBOrdered);


  /**
   * <p>
   * Getter method for the COM property "OrderedPhases"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  boolean orderedPhases();


  /**
   * <p>
   * Setter method for the COM property "OrderedPhases"
   * </p>
   * @param pBOrdered Mandatory boolean parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(19)
  void orderedPhases(
    boolean pBOrdered);


  // Properties:
}

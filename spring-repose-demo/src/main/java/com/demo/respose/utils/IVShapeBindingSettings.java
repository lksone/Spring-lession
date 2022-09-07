package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0746-0000-0000-C000-000000000046}")
public interface IVShapeBindingSettings extends Com4jObject {
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
   * Getter method for the COM property "ShapeMasterMapSettings"
   * </p>
   * @return  Returns a value of typeIVMasterMapSettings
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 IVMasterMapSettings shapeMasterMapSettings();


  /**
   * <p>
   * Setter method for the COM property "ShapeMasterMapSettings"
   * </p>
   * @param ppMasterMapSettings MandatoryIVMasterMapSettings parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(11)
  void shapeMasterMapSettings(
   IVMasterMapSettings ppMasterMapSettings);


  /**
   * <p>
   * Getter method for the COM property "UniqueIdColumnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  String uniqueIdColumnName();


  /**
   * <p>
   * Setter method for the COM property "UniqueIdColumnName"
   * </p>
   * @param pColumnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void uniqueIdColumnName(
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
   * Getter method for the COM property "AlternateDescriptionColumnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  String alternateDescriptionColumnName();


  /**
   * <p>
   * Setter method for the COM property "AlternateDescriptionColumnName"
   * </p>
   * @param pColumnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  void alternateDescriptionColumnName(
    String pColumnName);


  // Properties:
}

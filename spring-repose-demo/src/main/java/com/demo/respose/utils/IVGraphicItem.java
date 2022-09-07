package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D0735-0000-0000-C000-000000000046}")
public interface IVGraphicItem extends Com4jObject {
  // Methods:
  /**
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
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type IVDocument
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type tagVisObjectTypes
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  

    tagVisObjectTypes objectType();


  /**
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int index();


  /**
   * <p>
   * Setter method for the COM property "Index"
   * </p>
   * @param index Mandatory int parameter.
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(12)
  void index(
    int index);


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(13)
  @DefaultMethod
  int id();


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  String description();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type VisGraphicItemTypes
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  

    VisGraphicItemTypes type();


  /**
   * @param field Mandatory Holder<VisGraphicField> parameter.
   * @param expression Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  void getExpression(
    Holder<VisGraphicField> field,
    Holder<String> expression);


  /**
   * @param field Mandatory VisGraphicField parameter.
   * @param expression Mandatory java.lang.String parameter.
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  void setExpression(
    VisGraphicField field,
    String expression);


  /**
   * <p>
   * Getter method for the COM property "DataGraphic"
   * </p>
   * @return  Returns a value of type IVMaster
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  IVMaster dataGraphic();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Tag"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  String tag();


  /**
   * <p>
   * Setter method for the COM property "Tag"
   * </p>
   * @param tag Mandatory java.lang.String parameter.
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(21)
  void tag(
    String tag);


  /**
   * <p>
   * Getter method for the COM property "HorizontalPosition"
   * </p>
   * @return  Returns a value of type VisGraphicPositionHorizontal
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  

    VisGraphicPositionHorizontal horizontalPosition();


  /**
   * <p>
   * Setter method for the COM property "HorizontalPosition"
   * </p>
   * @param position Mandatory VisGraphicPositionHorizontal parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  void horizontalPosition(
    VisGraphicPositionHorizontal position);


  /**
   * <p>
   * Getter method for the COM property "VerticalPosition"
   * </p>
   * @return  Returns a value of type VisGraphicPositionVertical
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  

    VisGraphicPositionVertical verticalPosition();


  /**
   * <p>
   * Setter method for the COM property "VerticalPosition"
   * </p>
   * @param position Mandatory VisGraphicPositionVertical parameter.
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(25)
  void verticalPosition(
    VisGraphicPositionVertical position);


  /**
   * <p>
   * Getter method for the COM property "UseDataGraphicPosition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  boolean useDataGraphicPosition();


  /**
   * <p>
   * Setter method for the COM property "UseDataGraphicPosition"
   * </p>
   * @param useDataGraphicPosition Mandatory boolean parameter.
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(27)
  void useDataGraphicPosition(
    boolean useDataGraphicPosition);


  // Properties:
}

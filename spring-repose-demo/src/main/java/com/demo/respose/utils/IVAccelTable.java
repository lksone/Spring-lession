package com.demo.respose.utils

;

import com4j.*;

@IID("{000D02A2-0000-0000-C000-000000000046}")
public interface IVAccelTable extends Com4jObject {
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
   * Setter method for the COM property "TableName"
   * </p>
   * @param pTableName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  void tableName(
    String pTableName);


  /**
   * <p>
   * Getter method for the COM property "TableName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  String tableName();


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
   * Getter method for the COM property "AccelItems"
   * </p>
   * @return  Returns a value of type IVAccelItems
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  IVAccelItems accelItems();


  @VTID(12)
  @ReturnValue(defaultPropertyThrough={IVAccelItems.class})
  IVAccelItem accelItems(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type IVAccelTables
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  

    IVAccelTables parent();


  @VTID(13)
  @ReturnValue(defaultPropertyThrough={IVAccelTables.class})
  IVAccelTable parent(
    int lIndex);

  // Properties:
}

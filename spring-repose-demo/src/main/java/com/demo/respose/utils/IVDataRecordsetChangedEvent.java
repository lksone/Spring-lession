package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0733-0000-0000-C000-000000000046}")
public interface IVDataRecordsetChangedEvent extends Com4jObject {
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
   * Getter method for the COM property "DataRecordset"
   * </p>
   * @return  Returns a value of typeIVDataRecordset
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 IVDataRecordset dataRecordset();


  /**
   * <p>
   * Getter method for the COM property "DataRowsAdded"
   * </p>
   * @return  Returns a value of type int[]
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int[] dataRowsAdded();


  /**
   * <p>
   * Getter method for the COM property "DataRowsDeleted"
   * </p>
   * @return  Returns a value of type int[]
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  int[] dataRowsDeleted();


  /**
   * <p>
   * Getter method for the COM property "DataColumnsAdded"
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  String[] dataColumnsAdded();


  /**
   * <p>
   * Getter method for the COM property "DataColumnsDeleted"
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  String[] dataColumnsDeleted();


  /**
   * <p>
   * Getter method for the COM property "DataColumnsChanged"
   * </p>
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  String[] dataColumnsChanged();


  // Properties:
}

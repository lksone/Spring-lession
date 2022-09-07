package com.demo.respose.utils

;

import com4j.*;

/**
 * VB-Implements-Capable undo unit interface definition. Use an object that implements this interface in AddUndoUnit calls.
 */
@IID("{000D1305-0000-0000-C000-000000000046}")
public interface IVBUndoUnit extends Com4jObject {
  // Methods:
  /**
   * @param pMgr MandatoryIVBUndoManager parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void _do(
   IVBUndoManager pMgr);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(8)
  @DefaultMethod
  String description();


  /**
   * <p>
   * Getter method for the COM property "UnitTypeCLSID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  String unitTypeCLSID();


  /**
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  void onNextAdd();


  /**
   * <p>
   * Getter method for the COM property "UnitTypeLong"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int unitTypeLong();


  /**
   * <p>
   * Size in bytes. Used to measure how much memory undo information is using.
   * </p>
   * <p>
   * Getter method for the COM property "UnitSize"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  int unitSize();


  // Properties:
}

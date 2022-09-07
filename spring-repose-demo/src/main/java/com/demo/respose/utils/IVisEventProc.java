package com.demo.respose.utils

;

import com4j.*;

/**
 * VB-Implements-Capable Visio event sink interface definition. Use an object that implements this interface as the sink argument in AddAdvise calls.
 */
@IID("{000D0728-0000-0000-C000-000000000046}")
public interface IVisEventProc extends Com4jObject {
  // Methods:
  /**
   * <p>
   * If nEventCode identifies a query event then return True from VisEventProc to cancel the operation.
   * </p>
   * @param nEventCode Mandatory short parameter.
   * @param pSourceObj Mandatory com4j.Com4jObject parameter.
   * @param nEventID Mandatory int parameter.
   * @param nEventSeqNum Mandatory int parameter.
   * @param pSubjectObj Mandatory com4j.Com4jObject parameter.
   * @param vMoreInfo Mandatory java.lang.Object parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  @ReturnValue(type=NativeType.VARIANT)
  Object visEventProc(
    short nEventCode,
    @MarshalAs(NativeType.Dispatch) Com4jObject pSourceObj,
    int nEventID,
    int nEventSeqNum,
    @MarshalAs(NativeType.Dispatch) Com4jObject pSubjectObj,
    @MarshalAs(NativeType.VARIANT) Object vMoreInfo);


  // Properties:
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * VB Undo Manager - VB classes that implement IVBUndoUnit require this for their Do method.
 */
@IID("{000D1306-0000-0000-C000-000000000046}")
public interface IVBUndoManager extends Com4jObject {
  // Methods:
  /**
   * @param pUnit Mandatory IVBUndoUnit parameter.
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void add(
    IVBUndoUnit pUnit);


  // Properties:
}

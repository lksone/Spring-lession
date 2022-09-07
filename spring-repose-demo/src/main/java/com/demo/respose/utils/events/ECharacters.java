package com.demo.respose.utils.events;

import com.demo.respose.utils.IVShape;
import com4j.DISPID;
import com4j.IID;

/**
 * Visio Characters Event Interface
 */
@IID("{000D0B0C-0000-0000-C000-000000000046}")
public abstract class ECharacters {
  // Methods:
  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(8320)
  public void textChanged(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * Interface provided to OLE embedded objects through the Visio IOleClientSite object.
 */
@IID("{000D0D11-0000-0000-C000-000000000046}")
public interface IVClientSite extends Com4jObject {
  // Methods:
  /**
   * <p>
   * The Visio Shape associated with an OLE embedded object.
   * </p>
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @VTID(3)
  IVShape shape();


  // Properties:
}

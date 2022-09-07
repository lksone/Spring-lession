package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0283-0000-0000-C000-000000000046}")
public interface IEnumVStatusBar extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<IVStatusBar> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<IVStatusBar> rgelt,
    Holder<Integer> pceltFetched);


  /**
   * @param celt Mandatory int parameter.
   */

  @VTID(4)
  void skip(
    int celt);


  /**
   */

  @VTID(5)
  void reset();


  /**
   * @return  Returns a value of type IEnumVStatusBar
   */

  @VTID(6)
  IEnumVStatusBar clone();


  // Properties:
}

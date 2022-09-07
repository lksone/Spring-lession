package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0263-0000-0000-C000-000000000046}")
public interface IEnumVToolbarSet extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<IVToolbarSet> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<IVToolbarSet> rgelt,
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
   * @return  Returns a value of type IEnumVToolbarSet
   */

  @VTID(6)
  IEnumVToolbarSet clone();


  // Properties:
}

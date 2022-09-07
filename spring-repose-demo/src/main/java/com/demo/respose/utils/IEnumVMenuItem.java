package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0213-0000-0000-C000-000000000046}")
public interface IEnumVMenuItem extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<IVMenuItem> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<IVMenuItem> rgelt,
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
   * @return  Returns a value of type IEnumVMenuItem
   */

  @VTID(6)
  IEnumVMenuItem clone();


  // Properties:
}

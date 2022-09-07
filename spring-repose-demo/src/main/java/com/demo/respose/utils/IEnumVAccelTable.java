package com.demo.respose.utils

;

import com4j.*;

@IID("{000D02A3-0000-0000-C000-000000000046}")
public interface IEnumVAccelTable extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<IVAccelTable> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<IVAccelTable> rgelt,
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
   * @return  Returns a value of type IEnumVAccelTable
   */

  @VTID(6)
  IEnumVAccelTable clone();


  // Properties:
}

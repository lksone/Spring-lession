package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0243-0000-0000-C000-000000000046}")
public interface IEnumVToolbarItem extends Com4jObject {
  // Methods:
  /**
   * @param celt Mandatory int parameter.
   * @param rgelt Mandatory Holder<IVToolbarItem> parameter.
   * @param pceltFetched Mandatory Holder<Integer> parameter.
   */

  @VTID(3)
  void next(
    int celt,
    Holder<IVToolbarItem> rgelt,
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
   * @return  Returns a value of typeIEnumVToolbarItem
   */

  @VTID(6)
 IEnumVToolbarItem clone();


  // Properties:
}

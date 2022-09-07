package com.demo.respose.utils.events;


import com.demo.respose.utils.IVCell;
import com4j.DISPID;
import com4j.IID;

/**
 * Visio Cell Event Interface
 */
@IID("{000D0B0D-0000-0000-C000-000000000046}")
public abstract class ECell {
  // Methods:
  /**
   * <p>
   * Fires after a cell's value changes.
   * </p>
   * @param cell Mandatory IVCell parameter.
   */

  @DISPID(10240)
  public void cellChanged(
    IVCell cell) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a cell's formula changes.
   * </p>
   * @param cell Mandatory IVCell parameter.
   */

  @DISPID(12288)
  public void formulaChanged(
    IVCell cell) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

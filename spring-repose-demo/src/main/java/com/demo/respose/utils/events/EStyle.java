package com.demo.respose.utils.events;


import com.demo.respose.utils.IVStyle;
import com4j.DISPID;
import com4j.IID;

/**
 * Visio Style Event Interface
 */
@IID("{000D0B06-0000-0000-C000-000000000046}")
public abstract class EStyle {
  // Methods:
  /**
   * @param style MandatoryIVStyle parameter.
   */

  @DISPID(8196)
  public void styleChanged(
   IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style MandatoryIVStyle parameter.
   */

  @DISPID(16388)
  public void beforeStyleDelete(
   IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of style? T:Yes F:No
   * </p>
   * @param style MandatoryIVStyle parameter.
   * @return  Returns a value of type void
   */

  @DISPID(300)
  public void queryCancelStyleDelete(
   IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete style operation was canceled.
   * </p>
   * @param style MandatoryIVStyle parameter.
   */

  @DISPID(301)
  public void styleDeleteCanceled(
   IVStyle style) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

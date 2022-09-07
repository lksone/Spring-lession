package com.demo.respose.utils.events;


import com.demo.respose.utils.IVDataRecordset;
import com.demo.respose.utils.IVDataRecordsetChangedEvent;
import com4j.DISPID;
import com4j.IID;

/**
 * Visio DataRecordsets Event Interface
 */
@IID("{000D0B10-0000-0000-C000-000000000046}")
public abstract class EDataRecordsets {
  // Methods:
  /**
   * @param dataRecordset MandatoryIVDataRecordset parameter.
   */

  @DISPID(32800)
  public void dataRecordsetAdded(
   IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param dataRecordset MandatoryIVDataRecordset parameter.
   */

  @DISPID(16416)
  public void beforeDataRecordsetDelete(
   IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param dataRecordsetChanged MandatoryIVDataRecordsetChangedEvent parameter.
   */

  @DISPID(8224)
  public void dataRecordsetChanged(
   IVDataRecordsetChangedEvent dataRecordsetChanged) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

package com.demo.respose.utils.events;


import com.demo.respose.utils.IVDataRecordset;
import com.demo.respose.utils.IVDataRecordsetChangedEvent;
import com4j.DISPID;
import com4j.IID;

/**
 * Visio DataRecordset Event Interface
 */
@IID("{000D0B11-0000-0000-C000-000000000046}")
public abstract class EDataRecordset {
  // Methods:
  /**
   * @param dataRecordsetChanged MandatoryIVDataRecordsetChangedEvent parameter.
   */

  @DISPID(8224)
  public void dataRecordsetChanged(
   IVDataRecordsetChangedEvent dataRecordsetChanged) {
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


  // Properties:
}

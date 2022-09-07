package com.demo.respose.utils.events;

import com.demo.respose.utils.IVCell;
import com.demo.respose.utils.IVSelection;
import com.demo.respose.utils.IVShape;
import com4j.DISPID;
import com4j.IID;

;

/**
 * Visio Shape Event Interface
 */
@IID("{000D0B0B-0000-0000-C000-000000000046}")
public abstract class EShape {
  // Methods:
  /**
   * <p>
   * Fires after a cell's value changes.
   * </p>
   * @param cell MandatoryIVCell parameter.
   */

  @DISPID(10240)
  public void cellChanged(
   IVCell cell) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(32832)
  public void shapeAdded(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection MandatoryIVSelection parameter.
   */

  @DISPID(901)
  public void beforeSelectionDelete(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(8256)
  public void shapeChanged(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection MandatoryIVSelection parameter.
   */

  @DISPID(902)
  public void selectionAdded(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(16448)
  public void beforeShapeDelete(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(8320)
  public void textChanged(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a cell's formula changes.
   * </p>
   * @param cell MandatoryIVCell parameter.
   */

  @DISPID(12288)
  public void formulaChanged(
   IVCell cell) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(802)
  public void shapeParentChanged(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(803)
  public void beforeShapeTextEdit(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(804)
  public void shapeExitedTextEdit(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of shapes? T:Yes F:No
   * </p>
   * @param selection MandatoryIVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(903)
  public void queryCancelSelectionDelete(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete shapes operation was canceled.
   * </p>
   * @param selection MandatoryIVSelection parameter.
   */

  @DISPID(904)
  public void selectionDeleteCanceled(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel ungroup operation? T:Yes F:No
   * </p>
   * @param selection MandatoryIVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(905)
  public void queryCancelUngroup(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Ungroup operation was canceled.
   * </p>
   * @param selection MandatoryIVSelection parameter.
   */

  @DISPID(906)
  public void ungroupCanceled(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel convert to group operation? T:Yes F:No
   * </p>
   * @param selection MandatoryIVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(907)
  public void queryCancelConvertToGroup(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Convert to group operation was canceled.
   * </p>
   * @param selection MandatoryIVSelection parameter.
   */

  @DISPID(908)
  public void convertToGroupCanceled(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel group operation? T:Yes F:No
   * </p>
   * @param selection MandatoryIVSelection parameter.
   * @return  Returns a value of type void
   */

  @DISPID(909)
  public void queryCancelGroup(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Group operation was canceled.
   * </p>
   * @param selection MandatoryIVSelection parameter.
   */

  @DISPID(910)
  public void groupCanceled(
   IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   */

  @DISPID(807)
  public void shapeDataGraphicChanged(
   IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   * @param dataRecordsetID Mandatory int parameter.
   * @param dataRowID Mandatory int parameter.
   */

  @DISPID(805)
  public void shapeLinkAdded(
   IVShape shape,
    int dataRecordsetID,
    int dataRowID) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape MandatoryIVShape parameter.
   * @param dataRecordsetID Mandatory int parameter.
   * @param dataRowID Mandatory int parameter.
   */

  @DISPID(806)
  public void shapeLinkDeleted(
   IVShape shape,
    int dataRecordsetID,
    int dataRowID) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

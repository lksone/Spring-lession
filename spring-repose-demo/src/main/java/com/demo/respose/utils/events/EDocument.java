package com.demo.respose.utils.events;

import com.demo.respose.utils.*;
import com4j.DISPID;
import com4j.IID;

/**
 * Visio Document Event Interface
 */
@IID("{000D0750-0000-0000-C000-000000000046}")
public abstract class EDocument {
  // Methods:
  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(2)
  public void documentOpened(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(1)
  public void documentCreated(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(3)
  public void documentSaved(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(4)
  public void documentSavedAs(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(8194)
  public void documentChanged(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(16386)
  public void beforeDocumentClose(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style MandatoryIVStyle parameter.
   */

  @DISPID(32772)
  public void styleAdded(
   IVStyle style) {
        throw new UnsupportedOperationException();
  }


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
   * @param master MandatoryIVMaster parameter.
   */

  @DISPID(32776)
  public void masterAdded(
   IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master MandatoryIVMaster parameter.
   */

  @DISPID(8200)
  public void masterChanged(
   IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master MandatoryIVMaster parameter.
   */

  @DISPID(16392)
  public void beforeMasterDelete(
   IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page MandatoryIVPage parameter.
   */

  @DISPID(32784)
  public void pageAdded(
   IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page MandatoryIVPage parameter.
   */

  @DISPID(8208)
  public void pageChanged(
   IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page MandatoryIVPage parameter.
   */

  @DISPID(16400)
  public void beforePageDelete(
   IVPage page) {
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
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(5)
  public void runModeEntered(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(6)
  public void designModeEntered(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(7)
  public void beforeDocumentSave(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(8)
  public void beforeDocumentSaveAs(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of document? T:Yes F:No
   * </p>
   * @param doc MandatoryIVDocument parameter.
   * @return  Returns a value of type void
   */

  @DISPID(9)
  public void queryCancelDocumentClose(
   IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Document close operation was canceled.
   * </p>
   * @param doc MandatoryIVDocument parameter.
   */

  @DISPID(10)
  public void documentCloseCanceled(
   IVDocument doc) {
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


  /**
   * <p>
   * Cancel delete of master? T:Yes F:No
   * </p>
   * @param master MandatoryIVMaster parameter.
   * @return  Returns a value of type void
   */

  @DISPID(400)
  public void queryCancelMasterDelete(
   IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete master operation was canceled.
   * </p>
   * @param master MandatoryIVMaster parameter.
   */

  @DISPID(401)
  public void masterDeleteCanceled(
   IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel delete of page? T:Yes F:No
   * </p>
   * @param page MandatoryIVPage parameter.
   * @return  Returns a value of type void
   */

  @DISPID(500)
  public void queryCancelPageDelete(
   IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Delete page operation was canceled.
   * </p>
   * @param page MandatoryIVPage parameter.
   */

  @DISPID(501)
  public void pageDeleteCanceled(
   IVPage page) {
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
   * @param selection Mandatory IVSelection parameter.
   */

  @DISPID(910)
  public void groupCanceled(
    IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
   */

  @DISPID(807)
  public void shapeDataGraphicChanged(
    IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param dataRecordset Mandatory IVDataRecordset parameter.
   */

  @DISPID(16416)
  public void beforeDataRecordsetDelete(
    IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param dataRecordset Mandatory IVDataRecordset parameter.
   */

  @DISPID(32800)
  public void dataRecordsetAdded(
    IVDataRecordset dataRecordset) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(11)
  public void afterRemoveHiddenInformation(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param ruleSet Mandatory IVValidationRuleSet parameter.
   */

  @DISPID(13)
  public void ruleSetValidated(
    IVValidationRuleSet ruleSet) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param coauthMergeObjects Mandatory IVCoauthMergeEvent parameter.
   */

  @DISPID(14)
  public void afterDocumentMerge(
    IVCoauthMergeEvent coauthMergeObjects) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

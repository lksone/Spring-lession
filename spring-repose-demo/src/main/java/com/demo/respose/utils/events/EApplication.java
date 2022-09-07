package com.demo.respose.utils.events;

import com.demo.respose.utils.*;
import com4j.DISPID;
import com4j.Holder;
import com4j.IID;

/**
 * Visio Application Event Interface
 */
@IID("{000D0B00-0000-0000-C000-000000000046}")
public abstract class EApplication {
  // Methods:
  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4097)
  public void appActivated(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4098)
  public void appDeactivated(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4100)
  public void appObjActivated(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4104)
  public void appObjDeactivated(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4112)
  public void beforeQuit(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4128)
  public void beforeModal(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4160)
  public void afterModal(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(32769)
  public void windowOpened(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(701)
  public void selectionChanged(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(16385)
  public void beforeWindowClosed(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(4224)
  public void windowActivated(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(702)
  public void beforeWindowSelDelete(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(703)
  public void beforeWindowPageTurn(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(704)
  public void windowTurnedToPage(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(2)
  public void documentOpened(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(1)
  public void documentCreated(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(3)
  public void documentSaved(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(4)
  public void documentSavedAs(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(8194)
  public void documentChanged(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(16386)
  public void beforeDocumentClose(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory IVStyle parameter.
   */

  @DISPID(32772)
  public void styleAdded(
    IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory IVStyle parameter.
   */

  @DISPID(8196)
  public void styleChanged(
    IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param style Mandatory IVStyle parameter.
   */

  @DISPID(16388)
  public void beforeStyleDelete(
    IVStyle style) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory IVMaster parameter.
   */

  @DISPID(32776)
  public void masterAdded(
    IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory IVMaster parameter.
   */

  @DISPID(8200)
  public void masterChanged(
    IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param master Mandatory IVMaster parameter.
   */

  @DISPID(16392)
  public void beforeMasterDelete(
    IVMaster master) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page Mandatory IVPage parameter.
   */

  @DISPID(32784)
  public void pageAdded(
    IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page Mandatory IVPage parameter.
   */

  @DISPID(8208)
  public void pageChanged(
    IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param page Mandatory IVPage parameter.
   */

  @DISPID(16400)
  public void beforePageDelete(
    IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
   */

  @DISPID(32832)
  public void shapeAdded(
    IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection Mandatory IVSelection parameter.
   */

  @DISPID(901)
  public void beforeSelectionDelete(
    IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
   */

  @DISPID(8256)
  public void shapeChanged(
    IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param selection Mandatory IVSelection parameter.
   */

  @DISPID(902)
  public void selectionAdded(
    IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
   */

  @DISPID(16448)
  public void beforeShapeDelete(
    IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
   */

  @DISPID(8320)
  public void textChanged(
    IVShape shape) {
        throw new UnsupportedOperationException();
  }


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
   * @param app Mandatory IVApplication parameter.
   * @param sequenceNum Mandatory int parameter.
   * @param contextString Mandatory java.lang.String parameter.
   */

  @DISPID(4352)
  public void markerEvent(
    IVApplication app,
    int sequenceNum,
    String contextString) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(4608)
  public void noEventsPending(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(5120)
  public void visioIsIdle(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(200)
  public void mustFlushScopeBeginning(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(201)
  public void mustFlushScopeEnded(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(5)
  public void runModeEntered(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(6)
  public void designModeEntered(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(7)
  public void beforeDocumentSave(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(8)
  public void beforeDocumentSaveAs(
    IVDocument doc) {
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


  /**
   * @param connects Mandatory IVConnects parameter.
   */

  @DISPID(33024)
  public void connectionsAdded(
    IVConnects connects) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param connects Mandatory IVConnects parameter.
   */

  @DISPID(16640)
  public void connectionsDeleted(
    IVConnects connects) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   * @param nScopeID Mandatory int parameter.
   * @param bstrDescription Mandatory java.lang.String parameter.
   */

  @DISPID(202)
  public void enterScope(
    IVApplication app,
    int nScopeID,
    String bstrDescription) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   * @param nScopeID Mandatory int parameter.
   * @param bstrDescription Mandatory java.lang.String parameter.
   * @param bErrOrCancelled Mandatory boolean parameter.
   */

  @DISPID(203)
  public void exitScope(
    IVApplication app,
    int nScopeID,
    String bstrDescription,
    boolean bErrOrCancelled) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel terminate of application? T:Yes F:No
   * </p>
   * @param app Mandatory IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(204)
  public void queryCancelQuit(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Terminate application operation was canceled.
   * </p>
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(205)
  public void quitCanceled(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after a window's size or position changes
   * </p>
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(8193)
  public void windowChanged(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Fires after scroll or zoom in a drawing window
   * </p>
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(705)
  public void viewChanged(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of window? T:Yes F:No
   * </p>
   * @param window Mandatory IVWindow parameter.
   * @return  Returns a value of type void
   */

  @DISPID(706)
  public void queryCancelWindowClose(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Window close operation was canceled.
   * </p>
   * @param window Mandatory IVWindow parameter.
   */

  @DISPID(707)
  public void windowCloseCanceled(
    IVWindow window) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel close of document? T:Yes F:No
   * </p>
   * @param doc Mandatory IVDocument parameter.
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
   * @param doc Mandatory IVDocument parameter.
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
   * @param style Mandatory IVStyle parameter.
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
   * @param style Mandatory IVStyle parameter.
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
   * @param master Mandatory IVMaster parameter.
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
   * @param master Mandatory IVMaster parameter.
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
   * @param page Mandatory IVPage parameter.
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
   * @param page Mandatory IVPage parameter.
   */

  @DISPID(501)
  public void pageDeleteCanceled(
    IVPage page) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
   */

  @DISPID(802)
  public void shapeParentChanged(
    IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
   */

  @DISPID(803)
  public void beforeShapeTextEdit(
    IVShape shape) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shape Mandatory IVShape parameter.
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
   * @param selection Mandatory IVSelection parameter.
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
   * @param selection Mandatory IVSelection parameter.
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
   * @param selection Mandatory IVSelection parameter.
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
   * @param selection Mandatory IVSelection parameter.
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
   * @param selection Mandatory IVSelection parameter.
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
   * @param selection Mandatory IVSelection parameter.
   */

  @DISPID(908)
  public void convertToGroupCanceled(
    IVSelection selection) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel suspension of application? T:Yes F:No
   * </p>
   * @param app Mandatory IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(206)
  public void queryCancelSuspend(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Suspend application operation was canceled.
   * </p>
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(207)
  public void suspendCanceled(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(208)
  public void beforeSuspend(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(209)
  public void afterResume(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keystroke message received for Addon window. True return indicates message was handled.
   * </p>
   * @param msg Mandatory IVMSGWrap parameter.
   * @return  Returns a value of type void
   */

  @DISPID(708)
  public void onKeystrokeMessageForAddon(
    IVMSGWrap msg) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousedown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(709)
  public void mouseDown(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mousemove message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(710)
  public void mouseMove(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when mouseup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param button Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(711)
  public void mouseUp(
    int button,
    int keyButtonState,
    double x,
    double y,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keydown message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(712)
  public void keyDown(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keypress message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyAscii Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(713)
  public void keyPress(
    int keyAscii,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Called when keyup message received for window. If you set CancelDefault to True then Visio will not process this message.
   * </p>
   * @param keyCode Mandatory int parameter.
   * @param keyButtonState Mandatory int parameter.
   * @param cancelDefault Mandatory Holder<Boolean> parameter.
   */

  @DISPID(714)
  public void keyUp(
    int keyCode,
    int keyButtonState,
    Holder<Boolean> cancelDefault) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel suspension of application events? T:Yes F:No
   * </p>
   * @param app Mandatory IVApplication parameter.
   * @return  Returns a value of type void
   */

  @DISPID(210)
  public void queryCancelSuspendEvents(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Suspend application events operation was canceled.
   * </p>
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(211)
  public void suspendEventsCanceled(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(212)
  public void beforeSuspendEvents(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param app Mandatory IVApplication parameter.
   */

  @DISPID(213)
  public void afterResumeEvents(
    IVApplication app) {
        throw new UnsupportedOperationException();
  }


  /**
   * <p>
   * Cancel group operation? T:Yes F:No
   * </p>
   * @param selection Mandatory IVSelection parameter.
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
   * @param dataRecordsetChanged Mandatory IVDataRecordsetChangedEvent parameter.
   */

  @DISPID(8224)
  public void dataRecordsetChanged(
    IVDataRecordsetChangedEvent dataRecordsetChanged) {
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
   * @param shape Mandatory IVShape parameter.
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
   * @param shape Mandatory IVShape parameter.
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


  /**
   * @param doc Mandatory IVDocument parameter.
   */

  @DISPID(11)
  public void afterRemoveHiddenInformation(
    IVDocument doc) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory IVRelatedShapePairEvent parameter.
   */

  @DISPID(502)
  public void containerRelationshipAdded(
    IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory IVRelatedShapePairEvent parameter.
   */

  @DISPID(503)
  public void containerRelationshipDeleted(
    IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory IVRelatedShapePairEvent parameter.
   */

  @DISPID(504)
  public void calloutRelationshipAdded(
    IVRelatedShapePairEvent shapePair) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shapePair Mandatory IVRelatedShapePairEvent parameter.
   */

  @DISPID(505)
  public void calloutRelationshipDeleted(
    IVRelatedShapePairEvent shapePair) {
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
   * @param replaceShapes Mandatory IVReplaceShapesEvent parameter.
   * @return  Returns a value of type void
   */

  @DISPID(911)
  public void queryCancelReplaceShapes(
    IVReplaceShapesEvent replaceShapes) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param replaceShapes Mandatory IVReplaceShapesEvent parameter.
   */

  @DISPID(912)
  public void replaceShapesCanceled(
    IVReplaceShapesEvent replaceShapes) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param replaceShapes Mandatory IVReplaceShapesEvent parameter.
   */

  @DISPID(913)
  public void beforeReplaceShapes(
    IVReplaceShapesEvent replaceShapes) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sel Mandatory IVSelection parameter.
   */

  @DISPID(914)
  public void afterReplaceShapes(
    IVSelection sel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

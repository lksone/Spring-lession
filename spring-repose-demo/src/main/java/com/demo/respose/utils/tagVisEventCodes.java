package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Codes of Visio events, event actions and event ids.
 * </p>
 */
public enum tagVisEventCodes implements ComEnum {
  /**
   * <p>
   * The ID no Event object can have.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visEvtIDInval(-1),
  /**
   * <p>
   * The ID no Event scope can have.
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visScopeIDInval(-1),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visEvtCodeInval(0),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visEvtCodeDocCreate(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visEvtCodeDocOpen(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visEvtCodeDocSave(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visEvtCodeDocSaveAs(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visEvtCodeDocRunning(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  visEvtCodeDocDesign(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visEvtCodeBefDocSave(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visEvtCodeBefDocSaveAs(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visEvtCodeQueryCancelDocClose(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  visEvtCodeCancelDocClose(10),
  /**
   * <p>
   * The value of this constant is 200
   * </p>
   */
  visEvtCodeBefForcedFlush(200),
  /**
   * <p>
   * The value of this constant is 201
   * </p>
   */
  visEvtCodeAfterForcedFlush(201),
  /**
   * <p>
   * The value of this constant is 202
   * </p>
   */
  visEvtCodeEnterScope(202),
  /**
   * <p>
   * The value of this constant is 203
   * </p>
   */
  visEvtCodeExitScope(203),
  /**
   * <p>
   * The value of this constant is 204
   * </p>
   */
  visEvtCodeQueryCancelQuit(204),
  /**
   * <p>
   * The value of this constant is 205
   * </p>
   */
  visEvtCodeCancelQuit(205),
  /**
   * <p>
   * The value of this constant is 206
   * </p>
   */
  visEvtCodeQueryCancelSuspend(206),
  /**
   * <p>
   * The value of this constant is 207
   * </p>
   */
  visEvtCodeCancelSuspend(207),
  /**
   * <p>
   * The value of this constant is 208
   * </p>
   */
  visEvtCodeBeforeSuspend(208),
  /**
   * <p>
   * The value of this constant is 209
   * </p>
   */
  visEvtCodeAfterResume(209),
  /**
   * <p>
   * The value of this constant is 300
   * </p>
   */
  visEvtCodeQueryCancelStyleDel(300),
  /**
   * <p>
   * The value of this constant is 301
   * </p>
   */
  visEvtCodeCancelStyleDel(301),
  /**
   * <p>
   * The value of this constant is 400
   * </p>
   */
  visEvtCodeQueryCancelMasterDel(400),
  /**
   * <p>
   * The value of this constant is 401
   * </p>
   */
  visEvtCodeCancelMasterDel(401),
  /**
   * <p>
   * The value of this constant is 500
   * </p>
   */
  visEvtCodeQueryCancelPageDel(500),
  /**
   * <p>
   * The value of this constant is 501
   * </p>
   */
  visEvtCodeCancelPageDel(501),
  /**
   * <p>
   * The value of this constant is 701
   * </p>
   */
  visEvtCodeWinSelChange(701),
  /**
   * <p>
   * The value of this constant is 702
   * </p>
   */
  visEvtCodeBefWinSelDel(702),
  /**
   * <p>
   * The value of this constant is 703
   * </p>
   */
  visEvtCodeBefWinPageTurn(703),
  /**
   * <p>
   * The value of this constant is 704
   * </p>
   */
  visEvtCodeWinPageTurn(704),
  /**
   * <p>
   * The value of this constant is 705
   * </p>
   */
  visEvtCodeViewChanged(705),
  /**
   * <p>
   * The value of this constant is 706
   * </p>
   */
  visEvtCodeQueryCancelWinClose(706),
  /**
   * <p>
   * The value of this constant is 707
   * </p>
   */
  visEvtCodeCancelWinClose(707),
  /**
   * <p>
   * The value of this constant is 708
   * </p>
   */
  visEvtCodeWinOnAddonKeyMSG(708),
  /**
   * <p>
   * The value of this constant is 801
   * </p>
   */
  visEvtCodeShapeDelete(801),
  /**
   * <p>
   * The value of this constant is 802
   * </p>
   */
  visEvtCodeShapeParentChange(802),
  /**
   * <p>
   * The value of this constant is 803
   * </p>
   */
  visEvtCodeShapeBeforeTextEdit(803),
  /**
   * <p>
   * The value of this constant is 804
   * </p>
   */
  visEvtCodeShapeExitTextEdit(804),
  /**
   * <p>
   * The value of this constant is 901
   * </p>
   */
  visEvtCodeBefSelDel(901),
  /**
   * <p>
   * The value of this constant is 902
   * </p>
   */
  visEvtCodeSelAdded(902),
  /**
   * <p>
   * The value of this constant is 903
   * </p>
   */
  visEvtCodeQueryCancelSelDel(903),
  /**
   * <p>
   * The value of this constant is 904
   * </p>
   */
  visEvtCodeCancelSelDel(904),
  /**
   * <p>
   * The value of this constant is 905
   * </p>
   */
  visEvtCodeQueryCancelUngroup(905),
  /**
   * <p>
   * The value of this constant is 906
   * </p>
   */
  visEvtCodeCancelUngroup(906),
  /**
   * <p>
   * The value of this constant is 907
   * </p>
   */
  visEvtCodeQueryCancelConvertToGroup(907),
  /**
   * <p>
   * The value of this constant is 908
   * </p>
   */
  visEvtCodeCancelConvertToGroup(908),
  /**
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  visEvtAdd(32768),
  /**
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  visEvtDel(16384),
  /**
   * <p>
   * The value of this constant is 8192
   * </p>
   */
  visEvtMod(8192),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visEvtWindow(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visEvtDoc(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visEvtStyle(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visEvtMaster(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visEvtPage(16),
  /**
   * <p>
   * Obsolete
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visEvtLayer(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visEvtShape(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visEvtText(128),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visEvtConnect(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visEvtSection(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visEvtRow(1024),
  /**
   * <p>
   * visEvtCell+visEvtMod fires when a cell's value changes.
   * </p>
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visEvtCell(2048),
  /**
   * <p>
   * visEvtFormula+visEvtMod fires when a cell's formula changes.
   * </p>
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visEvtFormula(4096),
  /**
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visEvtApp(4096),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visEvtAppActivate(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visEvtAppDeactivate(2),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visEvtObjActivate(4),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visEvtObjDeactivate(8),
  /**
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visEvtBeforeQuit(16),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visEvtBeforeModal(32),
  /**
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visEvtAfterModal(64),
  /**
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visEvtWinActivate(128),
  /**
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visEvtMarker(256),
  /**
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visEvtNonePending(512),
  /**
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visEvtIdle(1024),
  /**
   * <p>
   * Obsolete as of Visio 4.1.
   * </p>
   * <p>
   * The value of this constant is 28672
   * </p>
   */
  visEvtCode1stUser(28672),
  /**
   * <p>
   * Obsolete as of Visio 4.1.
   * </p>
   * <p>
   * The value of this constant is 32767
   * </p>
   */
  visEvtCodeLastUser(32767),
  /**
   * <p>
   * Obsolete. Use visEvtCodeDocCreate instead.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visEvtCodeCreate(1),
  /**
   * <p>
   * Obsolete. Use visEvtCodeDocOpen instead.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visEvtCodeOpen(2),
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visActCodeRunAddon(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visActCodeAdvise(2),
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visEvtIdMostRecent(0),
  /**
   * <p>
   * The value of this constant is 709
   * </p>
   */
  visEvtCodeMouseDown(709),
  /**
   * <p>
   * The value of this constant is 710
   * </p>
   */
  visEvtCodeMouseMove(710),
  /**
   * <p>
   * The value of this constant is 711
   * </p>
   */
  visEvtCodeMouseUp(711),
  /**
   * <p>
   * The value of this constant is 712
   * </p>
   */
  visEvtCodeKeyDown(712),
  /**
   * <p>
   * The value of this constant is 713
   * </p>
   */
  visEvtCodeKeyPress(713),
  /**
   * <p>
   * The value of this constant is 714
   * </p>
   */
  visEvtCodeKeyUp(714),
  /**
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visEvtDataRecordset(32),
  /**
   * <p>
   * The value of this constant is 805
   * </p>
   */
  visEvtShapeLinkAdded(805),
  /**
   * <p>
   * The value of this constant is 806
   * </p>
   */
  visEvtShapeLinkDeleted(806),
  /**
   * <p>
   * The value of this constant is 807
   * </p>
   */
  visEvtShapeDataGraphicChanged(807),
  /**
   * <p>
   * The value of this constant is 909
   * </p>
   */
  visEvtCodeQueryCancelSelGroup(909),
  /**
   * <p>
   * The value of this constant is 910
   * </p>
   */
  visEvtCodeCancelSelGroup(910),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  visEvtRemoveHiddenInformation(11),
  /**
   * <p>
   * The value of this constant is 210
   * </p>
   */
  visEvtCodeQueryCancelSuspendEvents(210),
  /**
   * <p>
   * The value of this constant is 211
   * </p>
   */
  visEvtCodeCancelSuspendEvents(211),
  /**
   * <p>
   * The value of this constant is 212
   * </p>
   */
  visEvtCodeBeforeSuspendEvents(212),
  /**
   * <p>
   * The value of this constant is 213
   * </p>
   */
  visEvtCodeAfterResumeEvents(213),
  /**
   * <p>
   * The value of this constant is 502
   * </p>
   */
  visEvtCodeContainerRelationshipAdded(502),
  /**
   * <p>
   * The value of this constant is 503
   * </p>
   */
  visEvtCodeContainerRelationshipDeleted(503),
  /**
   * <p>
   * The value of this constant is 504
   * </p>
   */
  visEvtCodeCalloutRelationshipAdded(504),
  /**
   * <p>
   * The value of this constant is 505
   * </p>
   */
  visEvtCodeCalloutRelationshipDeleted(505),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  visEvtCodeSelectionMovedToSubprocess(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  visEvtCodeRuleSetValidated(13),
  /**
   * <p>
   * The value of this constant is 911
   * </p>
   */
  visEvtCodeQueryCancelReplaceShapes(911),
  /**
   * <p>
   * The value of this constant is 912
   * </p>
   */
  visEvtCodeCancelReplaceShapes(912),
  /**
   * <p>
   * The value of this constant is 913
   * </p>
   */
  visEvtCodeBeforeReplaceShapes(913),
  /**
   * <p>
   * The value of this constant is 914
   * </p>
   */
  visEvtCodeShapesReplaced(914),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  visEvtCodeAfterCoauthMerge(14),
  ;

  private  int value;
  tagVisEventCodes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to be passed to Document.OpenEx, AddEx or SaveAsEx.
 * </p>
 */
public enum tagVisOpenSaveArgs implements ComEnum {
  /**
   * <p>
   * Causes OpenEx to open copy of document.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visOpenCopy(1),
  /**
   * <p>
   * Causes OpenEx to open document readonly.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visOpenRO(2),
  /**
   * <p>
   * Causes OpenEx to open stencil in docked window.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visOpenDocked(4),
  /**
   * <p>
   * Causes OpenEx not to put document in recently opened file list.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visOpenDontList(8),
  /**
   * <p>
   * Causes OpenEx to open document in minimized window.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visOpenMinimized(16),
  /**
   * <p>
   * Causes OpenEx to open document readwrite.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visOpenRW(32),
  /**
   * <p>
   * Causes OpenEx to open document in hidden window.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visOpenHidden(64),
  /**
   * <p>
   * Causes OpenEx to open document with macros disabled.
   * </p>
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visOpenMacrosDisabled(128),
  /**
   * <p>
   * Causes OpenEx to open document with no workspace information.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visOpenNoWorkspace(256),
  /**
   * <p>
   * Causes OpenEx to open document without displaying Auto refresh dialog.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visOpenDeclineAutoRefresh(1024),
  /**
   * <p>
   * Causes OpenEx to open a copy of the document using copy of naming
   * </p>
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visOpenCopyOfNaming(2048),
  /**
   * <p>
   * Causes AddEx to add stencil in docked window.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visAddDocked(4),
  /**
   * <p>
   * Causes AddEx to add document in minimized window.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visAddMinimized(16),
  /**
   * <p>
   * Causes AddEx to add document in hidden window.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visAddHidden(64),
  /**
   * <p>
   * Causes AddEx to add document with macros disabled.
   * </p>
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visAddMacrosDisabled(128),
  /**
   * <p>
   * Causes AddEx to add document with no workspace information.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visAddNoWorkspace(256),
  /**
   * <p>
   * Causes AddEx to create a stencil file.
   * </p>
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visAddStencil(512),
  /**
   * <p>
   * Causes AddEx to add document without displaying Auto refresh dialog.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visAddDeclineAutoRefresh(1024),
  /**
   * <p>
   * Causes SaveAsEx to save document readonly.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSaveAsRO(1),
  /**
   * <p>
   * Causes SaveAsEx to save workspace with document.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSaveAsWS(2),
  /**
   * <p>
   * Causes SaveAsEx to put document in recently opened file list.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSaveAsListInMRU(4),
  /**
   * <p>
   * Causes SaveAsEx to display the Compatibility Checker dialog.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSaveAsCheckCompatibility(8),
  /**
   * <p>
   * Synonym of VisSavePreviewMode.visSavePreviewNone
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSavePrevNone(0),
  /**
   * <p>
   * Synonym of VisSavePreviewMode.visSavePreviewDraft1st
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSavePrevDraft1st(1),
  /**
   * <p>
   * Synonym of VisSavePreviewMode.visSavePreviewDetailed1st
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSavePrevDetailed1st(2),
  /**
   * <p>
   * Synonym of VisSavePreviewMode.visSavePreviewDraftAl
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSavePrevDraftAll(4),
  /**
   * <p>
   * Synonym of VisSavePreviewMode.visSavePreviewDetailedAl
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSavePrevDetailedAll(8),
  ;

  private  int value;
  tagVisOpenSaveArgs(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

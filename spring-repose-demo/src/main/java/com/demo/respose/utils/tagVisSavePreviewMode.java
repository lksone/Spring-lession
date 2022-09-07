package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags passed to or returned by Document.SavePreviewMode.
 * </p>
 */
public enum tagVisSavePreviewMode implements ComEnum {
  /**
   * <p>
   * Document.SavePreviewMode: No preview.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visSavePreviewNone(0),
  /**
   * <p>
   * Document.SavePreviewMode: Draft quality, 1st page.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visSavePreviewDraft1st(1),
  /**
   * <p>
   * Document.SavePreviewMode: Detailed quality, 1st page.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visSavePreviewDetailed1st(2),
  /**
   * <p>
   * Obsolete as of Visio 2003: it is no longer possible to save a preview of all pages
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visSavePreviewDraftAll(4),
  /**
   * <p>
   * Obsolete as of Visio 2003: it is no longer possible to save a preview of all pages
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visSavePreviewDetailedAll(8),
  ;

  private  int value;
  tagVisSavePreviewMode(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

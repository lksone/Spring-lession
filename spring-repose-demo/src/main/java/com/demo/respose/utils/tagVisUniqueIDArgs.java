package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Action codes to be passed to Shape.UniqueID.
 * </p>
 */
public enum tagVisUniqueIDArgs {
  /**
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visGetGUID, // 0
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visGetOrMakeGUID, // 1
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDeleteGUID, // 2
  /**
   * <p>
   * Added in Visio 2013, make guid is undoable bug get is not
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visGetOrMakeGUIDWithUndo, // 3
  /**
   * <p>
   * Added in Visio 2013, delete guid is undoable
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDeleteGUIDWithUndo, // 4
}

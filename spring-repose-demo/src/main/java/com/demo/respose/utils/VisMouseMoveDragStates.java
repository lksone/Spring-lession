package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisMouseMoveDragStates {
  /**
   * <p>
   * Either not a mouse move event or mouse move without drag
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visMouseMoveDragStatesNone, // 0
  /**
   * <p>
   * Mouse move is beginning a drag state operation
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visMouseMoveDragStatesBegin, // 1
  /**
   * <p>
   * Mouse move is entering a drag state on a target window
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visMouseMoveDragStatesEnter, // 2
  /**
   * <p>
   * Mouse move is in a drag over on a target window
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visMouseMoveDragStatesOver, // 3
  /**
   * <p>
   * Mouse move is leaving a drag state from a target window
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visMouseMoveDragStatesLeave, // 4
  /**
   * <p>
   * Mouse move has entered drop state on a target window
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visMouseMoveDragStatesDrop, // 5
}

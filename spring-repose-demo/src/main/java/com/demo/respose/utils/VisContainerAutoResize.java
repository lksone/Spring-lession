package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisContainerAutoResize {
  /**
   * <p>
   * Do not automatically resize container.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visContainerAutoResizeNone, // 0
  /**
   * <p>
   * Automatically expand the container size but do not contract.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visContainerAutoResizeExpand, // 1
  /**
   * <p>
   * Automatically expand and contract the container size.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visContainerAutoResizeExpandContract, // 2
}

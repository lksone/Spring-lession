package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisConnectedShapesFlags {
  /**
   * <p>
   * Return shapes associated with incoming and outgoing connections
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visConnectedShapesAllNodes, // 0
  /**
   * <p>
   * Return shapes associated with incoming connections
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visConnectedShapesIncomingNodes, // 1
  /**
   * <p>
   * Return shapes associated with outgoing connections
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visConnectedShapesOutgoingNodes, // 2
}

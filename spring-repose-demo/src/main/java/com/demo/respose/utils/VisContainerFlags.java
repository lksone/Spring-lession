package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisContainerFlags implements ComEnum {
  /**
   * <p>
   * Include all member shapes in the container including items in nested containers
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visContainerFlagsDefault(0),
  /**
   * <p>
   * Exclude member shapes that are containers
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visContainerFlagsExcludeContainers(1),
  /**
   * <p>
   * Exclude member shapes that are connectors
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visContainerFlagsExcludeConnectors(2),
  /**
   * <p>
   * Exclude member shapes that are callouts
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visContainerFlagsExcludeCallouts(4),
  /**
   * <p>
   * Exclude member shapes that are not containers, connectors or callouts
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visContainerFlagsExcludeElements(8),
  /**
   * <p>
   * Exclude member shapes that are nested in other containers
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visContainerFlagsExcludeNested(16),
  /**
   * <p>
   * Exclude member shapes that are list members
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visContainerFlagsExcludeListMembers(32),
  ;

  private  int value;
  VisContainerFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

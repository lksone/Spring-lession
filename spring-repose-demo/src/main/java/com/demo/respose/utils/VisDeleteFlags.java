package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisDeleteFlags implements ComEnum {
  /**
   * <p>
   * Match UI behavior for delete
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visDeleteNormal(0),
  /**
   * <p>
   * Clean up connectors attached to deleted shapes
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visDeleteHealConnectors(1),
  /**
   * <p>
   * Do not clean up connectors attached to deleted shapes
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visDeleteNoHealConnectors(2),
  /**
   * <p>
   * Do not delete members of containers or list shapes being deleted
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visDeleteNoContainerMembers(4),
  /**
   * <p>
   * Do not delete associated callouts of shapes being deleted
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visDeleteNoAssociatedCallouts(8),
  ;

  private  int value;
  VisDeleteFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisRoleSelectionTypes implements ComEnum {
  /**
   * <p>
   * Connector (routeable) Shapes
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visRoleSelConnector(1),
  /**
   * <p>
   * Container Shapes
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visRoleSelContainer(2),
  /**
   * <p>
   * Callout Shapes
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visRoleSelCallout(4),
  ;

  private  int value;
  VisRoleSelectionTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

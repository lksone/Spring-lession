package com.demo.respose.utils

;

import com4j.*;

/**
 */
public enum VisDiagramServices implements ComEnum {
  /**
   * <p>
   * All diagram services
   * </p>
   * <p>
   * The value of this constant is -1
   * </p>
   */
  visServiceAll(-1),
  /**
   * <p>
   * Diagram services that exist in Visio 2010
   * </p>
   * <p>
   * The value of this constant is 7
   * </p>
   */
  visServiceVersion140(7),
  /**
   * <p>
   * No diagram services
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visServiceNone(0),
  /**
   * <p>
   * AutoSize page behaviors
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visServiceAutoSizePage(1),
  /**
   * <p>
   * Basic structure behaviors without the ability to create new relationships
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visServiceStructureBasic(2),
  /**
   * <p>
   * Full structure behaviors to match user interface
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visServiceStructureFull(4),
  /**
   * <p>
   * Diagram services that exist in Visio 2013
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visServiceVersion150(8),
  /**
   * <p>
   * Smooth transition behaviors to match user interface
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visServiceAnimations(8),
  ;

  private  int value;
  VisDiagramServices(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

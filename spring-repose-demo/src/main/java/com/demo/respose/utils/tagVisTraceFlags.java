package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Flags to use with App.TraceFlags.
 * </p>
 */
public enum tagVisTraceFlags implements ComEnum {
  /**
   * <p>
   * Flag to log code of every Visio event occurrence.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visTraceEvents(1),
  /**
   * <p>
   * Flag to log every call from Visio to an external event handler.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visTraceAdvises(2),
  /**
   * <p>
   * Flag to log every attempt by Visio to invoke an Add-On.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visTraceAddonInvokes(4),
  /**
   * <p>
   * Flag to log every attempt by Visio to invoke VBA code.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visTraceCallsToVBA(8),
  ;

  private  int value;
  tagVisTraceFlags(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

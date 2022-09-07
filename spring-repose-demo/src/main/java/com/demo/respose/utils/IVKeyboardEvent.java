package com.demo.respose.utils

;

import com4j.Com4jObject;
import com4j.DefaultMethod;
import com4j.IID;
import com4j.VTID;

/**
 * Interface to enable passing relevant info about keyboard messages through Visio automation events.
 */
@IID("{000D072B-0000-0000-C000-000000000046}")
public interface IVKeyboardEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * String representation of this object's properties.
   * </p>
   * <p>
   * Getter method for the COM property "ToString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(7)
  @DefaultMethod
  String toString_();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type IVApplication
   */

  @VTID(8)
  IVApplication application();


  /**
   * <p>
   * Returns visObjTypeKeyboardEvent (50).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type tagVisObjectTypes
   */

  @VTID(9)
  

    tagVisObjectTypes objectType();


  /**
   * <p>
   * The Visio.Window associated with this event.
   * </p>
   * <p>
   * Getter method for the COM property "Window"
   * </p>
   * @return  Returns a value of type IVWindow
   */

  @VTID(10)
  IVWindow window();


  /**
   * <p>
   * Code associated with KeyDown and KeyUp events.
   * </p>
   * <p>
   * Getter method for the COM property "KeyCode"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int keyCode();


  /**
   * <p>
   * Indicates state of mouse buttons and shift and control keys for the KeyDown or KeyUp event.
   * </p>
   * <p>
   * Getter method for the COM property "KeyButtonState"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int keyButtonState();


  /**
   * <p>
   * Character associated with KeyPress event.
   * </p>
   * <p>
   * Getter method for the COM property "KeyAscii"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int keyAscii();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @VTID(14)
  short stat();


  // Properties:
}

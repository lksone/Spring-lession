package com.demo.respose.utils

;

import com4j.*;

/**
 * Ambient properties a Visio control site provides to a control contained in a Visio Document.
 */
@IID("{000D0D10-0000-0000-C000-000000000046}")
public interface IVAmbients extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-701) //= 0xfffffd43. The runtime will prefer the VTID if present
  @VTID(7)
  int backColor();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-702) //= 0xfffffd42. The runtime will prefer the VTID if present
  @VTID(8)
  String displayName();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-703) //= 0xfffffd41. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject font();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-704) //= 0xfffffd40. The runtime will prefer the VTID if present
  @VTID(10)
  int foreColor();


  /**
   * <p>
   * Getter method for the COM property "LocaleID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-705) //= 0xfffffd3f. The runtime will prefer the VTID if present
  @VTID(11)
  int localeID();


  /**
   * <p>
   * Getter method for the COM property "MessageReflect"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-706) //= 0xfffffd3e. The runtime will prefer the VTID if present
  @VTID(12)
  boolean messageReflect();


  /**
   * <p>
   * Getter method for the COM property "ScaleUnits"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-707) //= 0xfffffd3d. The runtime will prefer the VTID if present
  @VTID(13)
  String scaleUnits();


  /**
   * <p>
   * Getter method for the COM property "TextAlign"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(-708) //= 0xfffffd3c. The runtime will prefer the VTID if present
  @VTID(14)
  short textAlign();


  /**
   * <p>
   * Getter method for the COM property "UserMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-709) //= 0xfffffd3b. The runtime will prefer the VTID if present
  @VTID(15)
  boolean userMode();


  /**
   * <p>
   * Getter method for the COM property "UIDead"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-710) //= 0xfffffd3a. The runtime will prefer the VTID if present
  @VTID(16)
  boolean uiDead();


  /**
   * <p>
   * Getter method for the COM property "ShowGrabHandles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-711) //= 0xfffffd39. The runtime will prefer the VTID if present
  @VTID(17)
  boolean showGrabHandles();


  /**
   * <p>
   * Getter method for the COM property "ShowHatching"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-712) //= 0xfffffd38. The runtime will prefer the VTID if present
  @VTID(18)
  boolean showHatching();


  /**
   * <p>
   * Getter method for the COM property "DisplayAsDefault"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-713) //= 0xfffffd37. The runtime will prefer the VTID if present
  @VTID(19)
  boolean displayAsDefault();


  /**
   * <p>
   * Getter method for the COM property "SupportsMnemonics"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-714) //= 0xfffffd36. The runtime will prefer the VTID if present
  @VTID(20)
  boolean supportsMnemonics();


  /**
   * <p>
   * Getter method for the COM property "AutoClip"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-715) //= 0xfffffd35. The runtime will prefer the VTID if present
  @VTID(21)
  boolean autoClip();


  /**
   * <p>
   * Getter method for the COM property "Appearance"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-716) //= 0xfffffd34. The runtime will prefer the VTID if present
  @VTID(22)
  int appearance();


  /**
   * <p>
   * The Visio Shape associated with an OLE embedded object.
   * </p>
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of typeIVShape
   */

  @DISPID(1610743824) //= 0x60020010. The runtime will prefer the VTID if present
  @VTID(23)
 IVShape shape();


  /**
   * <p>
   * Visio requests that the current operation be canceled.
   * </p>
   * <p>
   * Getter method for the COM property "CancelOperation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  boolean cancelOperation();


  // Properties:
}

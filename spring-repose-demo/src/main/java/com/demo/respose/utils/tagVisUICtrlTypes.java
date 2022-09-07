package com.demo.respose.utils

;

import com4j.*;

/**
 * <p>
 * Toolbar Bar constants for CtrlType property.
 * </p>
 */
public enum tagVisUICtrlTypes implements ComEnum {
  /**
   * <p>
   * Push button.
   * </p>
   * <p>
   * The value of this constant is 2
   * </p>
   */
  visCtrlTypeBUTTON(2),
  /**
   * <p>
   * Owner draw push button.
   * </p>
   * <p>
   * The value of this constant is 33
   * </p>
   */
  visCtrlTypeBUTTON_OWNERDRAW(33),
  /**
   * <p>
   * Superseded by visCtrlTypeBUTTON_OWNERDRAW.
   * </p>
   * <p>
   * The value of this constant is 33
   * </p>
   */
  visCtrlTypeOWNERDRAW_BUTTON(33),
  /**
   * <p>
   * Split button.
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visCtrlTypeSPLITBUTTON(17),
  /**
   * <p>
   * Superseded by visCtrlTypeSPLITBUTTON.
   * </p>
   * <p>
   * The value of this constant is 17
   * </p>
   */
  visCtrlTypePALETTEBUTTONNOMRU(17),
  /**
   * <p>
   * Split button, with MRU color behavior.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visCtrlTypeSPLITBUTTON_MRU_COLOR(16),
  /**
   * <p>
   * Superseded by visCtrlTypeSPLITBUTTON_MRU_COLOR.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visCtrlTypePALETTEBUTTON(16),
  /**
   * <p>
   * Superseded by visCtrlTypeSPLITBUTTON_MRU_COLOR.
   * </p>
   * <p>
   * The value of this constant is 16
   * </p>
   */
  visCtrlTypeSPINBUTTON(16),
  /**
   * <p>
   * Split button, with MRU command behavior.
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visCtrlTypeSPLITBUTTON_MRU_COMMAND(18),
  /**
   * <p>
   * Superseded by visCtrlTypeSPLITBUTTON_MRU_COMMAND.
   * </p>
   * <p>
   * The value of this constant is 18
   * </p>
   */
  visCtrlTypePALETTEBUTTONICON(18),
  /**
   * <p>
   * Edit box.
   * </p>
   * <p>
   * The value of this constant is 64
   * </p>
   */
  visCtrlTypeEDITBOX(64),
  /**
   * <p>
   * Standard combobox.
   * </p>
   * <p>
   * The value of this constant is 128
   * </p>
   */
  visCtrlTypeCOMBOBOX(128),
  /**
   * <p>
   * Sorted combobox.
   * </p>
   * <p>
   * The value of this constant is 129
   * </p>
   */
  visCtrlTypeCOMBOBOX_SORTED(129),
  /**
   * <p>
   * Dropdown combobox.
   * </p>
   * <p>
   * The value of this constant is 272
   * </p>
   */
  visCtrlTypeDROPDOWN(272),
  /**
   * <p>
   * Sorted dropdown combobox.
   * </p>
   * <p>
   * The value of this constant is 273
   * </p>
   */
  visCtrlTypeDROPDOWN_SORTED(273),
  /**
   * <p>
   * Owner draw combobox.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visCtrlTypeDROPDOWN_OWNERDRAW(256),
  /**
   * <p>
   * Superseded by visCtrlTypeDROPDOWN_OWNERDRAW.
   * </p>
   * <p>
   * The value of this constant is 256
   * </p>
   */
  visCtrlTypeCOMBODRAW(256),
  /**
   * <p>
   * Owner draw sorted combobox.
   * </p>
   * <p>
   * The value of this constant is 257
   * </p>
   */
  visCtrlTypeDROPDOWN_SORTED_OWNERDRAW(257),
  /**
   * <p>
   * Text label - not a real control
   * </p>
   * <p>
   * The value of this constant is 2048
   * </p>
   */
  visCtrlTypeLABEL(2048),
  /**
   * <p>
   * Grid of sample patterns.
   * </p>
   * <p>
   * The value of this constant is 32768
   * </p>
   */
  visCtrlTypeSWATCH(32768),
  /**
   * <p>
   * Grid of sample colors.
   * </p>
   * <p>
   * The value of this constant is 32769
   * </p>
   */
  visCtrlTypeSWATCH_COLORS(32769),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  visCtrlTypeEND(0),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  visCtrlTypeSTATE(1),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 3
   * </p>
   */
  visCtrlTypeSTATE_BUTTON(3),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  visCtrlTypeHIERBUTTON(4),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 5
   * </p>
   */
  visCtrlTypeSTATE_HIERBUTTON(5),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 8
   * </p>
   */
  visCtrlTypeDROPBUTTON(8),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 9
   * </p>
   */
  visCtrlTypeSTATE_DROPBUTTON(9),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 32
   * </p>
   */
  visCtrlTypePUSHBUTTON(32),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 512
   * </p>
   */
  visCtrlTypeLISTBOX(512),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 513
   * </p>
   */
  visCtrlTypeLISTBOXDRAW(513),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 1024
   * </p>
   */
  visCtrlTypeCOLORBOX(1024),
  /**
   * <p>
   * Obsolete as of Visio 2002.
   * </p>
   * <p>
   * The value of this constant is 4096
   * </p>
   */
  visCtrlTypeMESSAGE(4096),
  /**
   * <p>
   * Obsolete as of Visio 2000.
   * </p>
   * <p>
   * The value of this constant is 16384
   * </p>
   */
  visCtrlTypeSPACER(16384),
  ;

  private  int value;
  tagVisUICtrlTypes(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0222-0000-0000-C000-000000000046}")
public interface IVMenu extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  String _default();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param pCaption Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  void caption(
    String pCaption);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  String caption();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int index();


  /**
   * <p>
   * Setter method for the COM property "MDIWindowMenu"
   * </p>
   * @param pMDIWindowMenu Mandatory short parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void mdiWindowMenu(
    short pMDIWindowMenu);


  /**
   * <p>
   * Getter method for the COM property "MDIWindowMenu"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  short mdiWindowMenu();


  /**
   * <p>
   * Getter method for the COM property "MenuItems"
   * </p>
   * @return  Returns a value of typeIVMenuItems
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
 

    IVMenuItems menuItems();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={IVMenuItems.class})
 

    IVMenuItem menuItems(
    int lIndex);

  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of typeIVMenus
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
 

    IVMenus parent();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={IVMenus.class})
 IVMenu parent(
    int lIndex);

  /**
   * <p>
   * Setter method for the COM property "CmdNum"
   * </p>
   * @param pwCmd Mandatory short parameter.
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  void cmdNum(
    short pwCmd);


  /**
   * <p>
   * Getter method for the COM property "CmdNum"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(17)
  short cmdNum();


  /**
   * <p>
   * HelpContextID is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Setter method for the COM property "HelpContextID"
   * </p>
   * @param pHelpContextID Mandatory short parameter.
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  void helpContextID(
    short pHelpContextID);


  /**
   * <p>
   * HelpContextID is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "HelpContextID"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(19)
  short helpContextID();


  /**
   * <p>
   * IsSeparator is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "IsSeparator"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743821) //= 0x6002000d. The runtime will prefer the VTID if present
  @VTID(20)
  short isSeparator();


  /**
   * <p>
   * Getter method for the COM property "IsHierarchical"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743822) //= 0x6002000e. The runtime will prefer the VTID if present
  @VTID(21)
  short isHierarchical();


  /**
   * <p>
   * Setter method for the COM property "CntrlType"
   * </p>
   * @param pwCntrlType Mandatory short parameter.
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  void cntrlType(
    short pwCntrlType);


  /**
   * <p>
   * Getter method for the COM property "CntrlType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(23)
  short cntrlType();


  /**
   * <p>
   * CntrlID is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Setter method for the COM property "CntrlID"
   * </p>
   * @param pwCntrlID Mandatory short parameter.
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(24)
  void cntrlID(
    short pwCntrlID);


  /**
   * <p>
   * CntrlID is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "CntrlID"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743825) //= 0x60020011. The runtime will prefer the VTID if present
  @VTID(25)
  short cntrlID();


  /**
   * <p>
   * Setter method for the COM property "TypeSpecific1"
   * </p>
   * @param pwTypeSpecific Mandatory short parameter.
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(26)
  void typeSpecific1(
    short pwTypeSpecific);


  /**
   * <p>
   * Getter method for the COM property "TypeSpecific1"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743827) //= 0x60020013. The runtime will prefer the VTID if present
  @VTID(27)
  short typeSpecific1();


  /**
   * <p>
   * Priority is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param pwPriority Mandatory short parameter.
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(28)
  void priority(
    short pwPriority);


  /**
   * <p>
   * Priority is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743829) //= 0x60020015. The runtime will prefer the VTID if present
  @VTID(29)
  short priority();


  /**
   * <p>
   * Spacing is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Setter method for the COM property "Spacing"
   * </p>
   * @param pwSpacing Mandatory short parameter.
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(30)
  void spacing(
    short pwSpacing);


  /**
   * <p>
   * Spacing is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "Spacing"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743831) //= 0x60020017. The runtime will prefer the VTID if present
  @VTID(31)
  short spacing();


  /**
   * <p>
   * Setter method for the COM property "TypeSpecific2"
   * </p>
   * @param pwTypeSpecific Mandatory short parameter.
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(32)
  void typeSpecific2(
    short pwTypeSpecific);


  /**
   * <p>
   * Getter method for the COM property "TypeSpecific2"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743833) //= 0x60020019. The runtime will prefer the VTID if present
  @VTID(33)
  short typeSpecific2();


  /**
   * <p>
   * Setter method for the COM property "ActionText"
   * </p>
   * @param pActionText Mandatory java.lang.String parameter.
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(34)
  void actionText(
    String pActionText);


  /**
   * <p>
   * Getter method for the COM property "ActionText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743835) //= 0x6002001b. The runtime will prefer the VTID if present
  @VTID(35)
  String actionText();


  /**
   * <p>
   * Minihelp is obsolete as of Visio 2002.
   * </p>
   * <p>
   * Setter method for the COM property "MiniHelp"
   * </p>
   * @param pMiniHelp Mandatory java.lang.String parameter.
   */

  @DISPID(1610743837) //= 0x6002001d. The runtime will prefer the VTID if present
  @VTID(36)
  void miniHelp(
    String pMiniHelp);


  /**
   * <p>
   * Minihelp is obsolete as of Visio 2002.
   * </p>
   * <p>
   * Getter method for the COM property "MiniHelp"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743837) //= 0x6002001d. The runtime will prefer the VTID if present
  @VTID(37)
  String miniHelp();


  /**
   * <p>
   * Setter method for the COM property "AddOnName"
   * </p>
   * @param pAddOnName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743839) //= 0x6002001f. The runtime will prefer the VTID if present
  @VTID(38)
  void addOnName(
    String pAddOnName);


  /**
   * <p>
   * Getter method for the COM property "AddOnName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743839) //= 0x6002001f. The runtime will prefer the VTID if present
  @VTID(39)
  String addOnName();


  /**
   * <p>
   * Setter method for the COM property "AddOnArgs"
   * </p>
   * @param pAddOnArgs Mandatory java.lang.String parameter.
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(40)
  void addOnArgs(
    String pAddOnArgs);


  /**
   * <p>
   * Getter method for the COM property "AddOnArgs"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743841) //= 0x60020021. The runtime will prefer the VTID if present
  @VTID(41)
  String addOnArgs();


  /**
   * <p>
   * HelpFile is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Setter method for the COM property "HelpFile"
   * </p>
   * @param pHelpFile Mandatory java.lang.String parameter.
   */

  @DISPID(1610743843) //= 0x60020023. The runtime will prefer the VTID if present
  @VTID(42)
  void helpFile(
    String pHelpFile);


  /**
   * <p>
   * HelpFile is obsolete as of Visio 2000.
   * </p>
   * <p>
   * Getter method for the COM property "HelpFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743843) //= 0x60020023. The runtime will prefer the VTID if present
  @VTID(43)
  String helpFile();


  /**
   * @param iconFileName Mandatory java.lang.String parameter.
   */

  @DISPID(1610743845) //= 0x60020025. The runtime will prefer the VTID if present
  @VTID(44)
  void iconFileName(
    String iconFileName);


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743846) //= 0x60020026. The runtime will prefer the VTID if present
  @VTID(45)
  boolean builtIn();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param pbEnabled Mandatory boolean parameter.
   */

  @DISPID(1610743847) //= 0x60020027. The runtime will prefer the VTID if present
  @VTID(46)
  void enabled(
    boolean pbEnabled);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743847) //= 0x60020027. The runtime will prefer the VTID if present
  @VTID(47)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "FaceID"
   * </p>
   * @param pwFaceID Mandatory short parameter.
   */

  @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
  @VTID(48)
  void faceID(
    short pwFaceID);


  /**
   * <p>
   * Getter method for the COM property "FaceID"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
  @VTID(49)
  short faceID();


  /**
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param pwState Mandatory short parameter.
   */

  @DISPID(1610743851) //= 0x6002002b. The runtime will prefer the VTID if present
  @VTID(50)
  void state(
    short pwState);


  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743851) //= 0x6002002b. The runtime will prefer the VTID if present
  @VTID(51)
  short state();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param pwStyle Mandatory short parameter.
   */

  @DISPID(1610743853) //= 0x6002002d. The runtime will prefer the VTID if present
  @VTID(52)
  void style(
    short pwStyle);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743853) //= 0x6002002d. The runtime will prefer the VTID if present
  @VTID(53)
  short style();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pbVisible Mandatory boolean parameter.
   */

  @DISPID(1610743855) //= 0x6002002f. The runtime will prefer the VTID if present
  @VTID(54)
  void visible(
    boolean pbVisible);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743855) //= 0x6002002f. The runtime will prefer the VTID if present
  @VTID(55)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param pwWidth Mandatory short parameter.
   */

  @DISPID(1610743857) //= 0x60020031. The runtime will prefer the VTID if present
  @VTID(56)
  void width(
    short pwWidth);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743857) //= 0x60020031. The runtime will prefer the VTID if present
  @VTID(57)
  short width();


  /**
   * <p>
   * Setter method for the COM property "PaletteWidth"
   * </p>
   * @param pwWidth Mandatory short parameter.
   */

  @DISPID(1610743859) //= 0x60020033. The runtime will prefer the VTID if present
  @VTID(58)
  void paletteWidth(
    short pwWidth);


  /**
   * <p>
   * Getter method for the COM property "PaletteWidth"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743859) //= 0x60020033. The runtime will prefer the VTID if present
  @VTID(59)
  short paletteWidth();


  // Properties:
}

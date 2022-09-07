package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D0710-0000-0000-C000-000000000046}")
public interface IVWindow extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of typeIVApplication
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(7)
  @DefaultMethod
 

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Returns visObjTypeWindow (21).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(9)
  short objectType();


  /**
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(10)
  void activate();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(11)
  short type();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(12)
 

    IVDocument document();


  /**
   * <p>
   * Superseded by variant=Window.Page.
   * </p>
   * <p>
   * Getter method for the COM property "PageAsObj"
   * </p>
   * @return  Returns a value of type IVPage
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(13)
  IVPage pageAsObj();


  /**
   * <p>
   * Takes locale specific page name. Superseded by Window.Page=variant.
   * </p>
   * <p>
   * Setter method for the COM property "PageFromName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(699) //= 0x2bb. The runtime will prefer the VTID if present
  @VTID(14)
  void pageFromName(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "Zoom"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(15)
  double zoom();


  /**
   * <p>
   * Setter method for the COM property "Zoom"
   * </p>
   * @param lpr8Ret Mandatory double parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  void zoom(
    double lpr8Ret);


  /**
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(17)
  void close();


  /**
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(18)
  void selectAll();


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(19)
  void deselectAll();


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type IVSelection
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(20)
  

    IVSelection selection();


  @VTID(20)
  @ReturnValue(defaultPropertyThrough={IVSelection.class})
  IVShape selection(
    int index);

  /**
   * @param sheetObject Mandatory IVShape parameter.
   * @param selectAction Mandatory short parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(21)
  void select(
    IVShape sheetObject,
    short selectAction);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(22)
  short index();


  /**
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(23)
  void cut();


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(24)
  void copy();


  /**
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(25)
  void paste();


  /**
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(26)
  void delete();


  /**
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(27)
  void duplicate();


  /**
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(28)
  void group();


  /**
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(29)
  void union();


  /**
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(30)
  void combine();


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(31)
  void fragment();


  /**
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(32)
  void addToGroup();


  /**
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(33)
  void removeFromGroup();


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(34)
  short subType();


  /**
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(35)
  void intersect();


  /**
   */

  @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
  @VTID(36)
  void subtract();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type IVEventList
   */

  @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
  @VTID(37)
  

    IVEventList eventList();


  @VTID(37)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
  @VTID(38)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "WindowHandle"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
  @VTID(39)
  short windowHandle();


  /**
   * <p>
   * Getter method for the COM property "WindowHandle32"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
  @VTID(40)
  int windowHandle32();


  /**
   */

  @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
  @VTID(41)
  void trim();


  /**
   */

  @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
  @VTID(42)
  void join();


  /**
   * <p>
   * Getter method for the COM property "ShowRulers"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(43)
  short showRulers();


  /**
   * <p>
   * Setter method for the COM property "ShowRulers"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(34) //= 0x22. The runtime will prefer the VTID if present
  @VTID(44)
  void showRulers(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowGrid"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(45)
  short showGrid();


  /**
   * <p>
   * Setter method for the COM property "ShowGrid"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(46)
  void showGrid(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowGuides"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(47)
  short showGuides();


  /**
   * <p>
   * Setter method for the COM property "ShowGuides"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(36) //= 0x24. The runtime will prefer the VTID if present
  @VTID(48)
  void showGuides(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowConnectPoints"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(49)
  short showConnectPoints();


  /**
   * <p>
   * Setter method for the COM property "ShowConnectPoints"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(37) //= 0x25. The runtime will prefer the VTID if present
  @VTID(50)
  void showConnectPoints(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "ShowPageBreaks"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(51)
  short showPageBreaks();


  /**
   * <p>
   * Setter method for the COM property "ShowPageBreaks"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(38) //= 0x26. The runtime will prefer the VTID if present
  @VTID(52)
  void showPageBreaks(
    short lpi2Ret);


  /**
   * <p>
   * Takes locale independent page name, locale specific page name or page object. Returns page object.
   * </p>
   * <p>
   * Getter method for the COM property "Page"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(53)
  @ReturnValue(type=NativeType.VARIANT)
  Object page();


  /**
   * <p>
   * Takes locale independent page name, locale specific page name or page object. Returns page object.
   * </p>
   * <p>
   * Setter method for the COM property "Page"
   * </p>
   * @param lpobjRet Mandatory java.lang.Object parameter.
   */

  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
  @VTID(54)
  void page(
    @MarshalAs(NativeType.VARIANT) Object lpobjRet);


  /**
   * @return  Returns a value of type java.lang.String[]
   */

  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
  @VTID(55)
  String[] dockedStencils();


  /**
   * <p>
   * Getter method for the COM property "Master"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  Object master();


  /**
   * <p>
   * Show or hide the scroll bars in a drawing window.
   * </p>
   * <p>
   * Getter method for the COM property "ShowScrollBars"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(57)
  short showScrollBars();


  /**
   * <p>
   * Show or hide the scroll bars in a drawing window.
   * </p>
   * <p>
   * Setter method for the COM property "ShowScrollBars"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
  @VTID(58)
  void showScrollBars(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(59)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param pbVisible Mandatory boolean parameter.
   */

  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
  @VTID(60)
  void visible(
    boolean pbVisible);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(61)
  String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param pbstrCaption Mandatory java.lang.String parameter.
   */

  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
  @VTID(62)
  void caption(
    String pbstrCaption);


  /**
   * <p>
   * Getter method for the COM property "Windows"
   * </p>
   * @return  Returns a value of type IVWindows
   */

  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
  @VTID(63)
  

    IVWindows windows();


  @VTID(63)
  @ReturnValue(defaultPropertyThrough={IVWindows.class})
  IVWindow windows(
    short index);

  /**
   * @param nxFlags Mandatory int parameter.
   * @param nyFlags Mandatory int parameter.
   */

  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
  @VTID(64)
  void scroll(
    int nxFlags,
    int nyFlags);


  /**
   * @param x Mandatory double parameter.
   * @param y Mandatory double parameter.
   */

  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
  @VTID(65)
  void scrollViewTo(
    double x,
    double y);


  /**
   * @param pdLeft Mandatory Holder<Double> parameter.
   * @param pdTop Mandatory Holder<Double> parameter.
   * @param pdWidth Mandatory Holder<Double> parameter.
   * @param pdHeight Mandatory Holder<Double> parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(66)
  void getViewRect(
    Holder<Double> pdLeft,
    Holder<Double> pdTop,
    Holder<Double> pdWidth,
    Holder<Double> pdHeight);


  /**
   * @param dLeft Mandatory double parameter.
   * @param dTop Mandatory double parameter.
   * @param dWidth Mandatory double parameter.
   * @param dHeight Mandatory double parameter.
   */

  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
  @VTID(67)
  void setViewRect(
    double dLeft,
    double dTop,
    double dWidth,
    double dHeight);


  /**
   * @param pnLeft Mandatory Holder<Integer> parameter.
   * @param pnTop Mandatory Holder<Integer> parameter.
   * @param pnWidth Mandatory Holder<Integer> parameter.
   * @param pnHeight Mandatory Holder<Integer> parameter.
   */

  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
  @VTID(68)
  void getWindowRect(
    Holder<Integer> pnLeft,
    Holder<Integer> pnTop,
    Holder<Integer> pnWidth,
    Holder<Integer> pnHeight);


  /**
   * @param nLeft Mandatory int parameter.
   * @param nTop Mandatory int parameter.
   * @param nWidth Mandatory int parameter.
   * @param nHeight Mandatory int parameter.
   */

  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
  @VTID(69)
  void setWindowRect(
    int nLeft,
    int nTop,
    int nWidth,
    int nHeight);


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(70)
  int windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param pnState Mandatory int parameter.
   */

  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
  @VTID(71)
  void windowState(
    int pnState);


  /**
   * <p>
   * Getter method for the COM property "ViewFit"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(72)
  int viewFit();


  /**
   * <p>
   * Setter method for the COM property "ViewFit"
   * </p>
   * @param pnFit Mandatory int parameter.
   */

  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
  @VTID(73)
  void viewFit(
    int pnFit);


  /**
   * <p>
   * Getter method for the COM property "IsEditingText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(74)
  boolean isEditingText();


  /**
   * <p>
   * Getter method for the COM property "IsEditingOLE"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(75)
  boolean isEditingOLE();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type IVWindows
   */

  @DISPID(56) //= 0x38. The runtime will prefer the VTID if present
  @VTID(76)
  IVWindows parent();


  @VTID(76)
  @ReturnValue(defaultPropertyThrough={IVWindows.class})
  IVWindow parent(
    short index);

  /**
   * <p>
   * Getter method for the COM property "MasterShortcut"
   * </p>
   * @return  Returns a value of type IVMasterShortcut
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(77)
  IVMasterShortcut masterShortcut();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
  @VTID(78)
  int id();


  /**
   * <p>
   * Getter method for the COM property "ParentWindow"
   * </p>
   * @return  Returns a value of type IVWindow
   */

  @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
  @VTID(79)
  IVWindow parentWindow();


  /**
   * <p>
   * Getter method for the COM property "MergeID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743881) //= 0x60020049. The runtime will prefer the VTID if present
  @VTID(80)
  String mergeID();


  /**
   * <p>
   * Getter method for the COM property "MergeClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(81)
  String mergeClass();


  /**
   * <p>
   * Getter method for the COM property "MergePosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(82)
  int mergePosition();


  /**
   * <p>
   * Enables or disables the Edit command for stencil windows. Set to False to prevent unintentional stencil edits.
   * </p>
   * <p>
   * Getter method for the COM property "AllowEditing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(83)
  boolean allowEditing();


  /**
   * <p>
   * Enables or disables the Edit command for stencil windows. Set to False to prevent unintentional stencil edits.
   * </p>
   * <p>
   * Setter method for the COM property "AllowEditing"
   * </p>
   * @param pbAllowEditing Mandatory boolean parameter.
   */

  @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
  @VTID(84)
  void allowEditing(
    boolean pbAllowEditing);


  /**
   * <p>
   * Get or set the width of the page tab control in a drawing window. Value is a percentage of the drawing window width, from 0 to 100. Assigning -1 means use default.
   * </p>
   * <p>
   * Getter method for the COM property "PageTabWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
  @VTID(85)
  double pageTabWidth();


  /**
   * <p>
   * Get or set the width of the page tab control in a drawing window. Value is a percentage of the drawing window width, from 0 to 100. Assigning -1 means use default.
   * </p>
   * <p>
   * Setter method for the COM property "PageTabWidth"
   * </p>
   * @param pdWidth Mandatory double parameter.
   */

  @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
  @VTID(86)
  void pageTabWidth(
    double pdWidth);


  /**
   * <p>
   * Show or hide the page tab control in a drawing window.
   * </p>
   * <p>
   * Getter method for the COM property "ShowPageTabs"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
  @VTID(87)
  boolean showPageTabs();


  /**
   * <p>
   * Show or hide the page tab control in a drawing window.
   * </p>
   * <p>
   * Setter method for the COM property "ShowPageTabs"
   * </p>
   * @param pbShow Mandatory boolean parameter.
   */

  @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
  @VTID(88)
  void showPageTabs(
    boolean pbShow);


  /**
   * <p>
   * Setter method for the COM property "MergeID"
   * </p>
   * @param pbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(1610743881) //= 0x60020049. The runtime will prefer the VTID if present
  @VTID(89)
  void mergeID(
    String pbstrRet);


  /**
   * <p>
   * Setter method for the COM property "MergeClass"
   * </p>
   * @param pbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
  @VTID(90)
  void mergeClass(
    String pbstrRet);


  /**
   * <p>
   * Setter method for the COM property "MergePosition"
   * </p>
   * @param pnRet Mandatory int parameter.
   */

  @DISPID(1610743883) //= 0x6002004b. The runtime will prefer the VTID if present
  @VTID(91)
  void mergePosition(
    int pnRet);


  /**
   * <p>
   * Getter method for the COM property "InPlace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743893) //= 0x60020055. The runtime will prefer the VTID if present
  @VTID(92)
  boolean inPlace();


  /**
   * <p>
   * MergeCaption is used for the tab when the window is merged with other windows.
   * </p>
   * <p>
   * Getter method for the COM property "MergeCaption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743894) //= 0x60020056. The runtime will prefer the VTID if present
  @VTID(93)
  String mergeCaption();


  /**
   * <p>
   * MergeCaption is used for the tab when the window is merged with other windows.
   * </p>
   * <p>
   * Setter method for the COM property "MergeCaption"
   * </p>
   * @param pbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(1610743894) //= 0x60020056. The runtime will prefer the VTID if present
  @VTID(94)
  void mergeCaption(
    String pbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Icon"
   * </p>
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610743896) //= 0x60020058. The runtime will prefer the VTID if present
  @VTID(95)
  Holder<com4j.stdole.IPictureDisp> icon();


  /**
   * <p>
   * Setter method for the COM property "Icon"
   * </p>
   * @param ppPictureDisp Mandatory Holder<com4j.stdole.IPictureDisp> parameter.
   */

  @DISPID(1610743896) //= 0x60020058. The runtime will prefer the VTID if present
  @VTID(96)
  void icon(
    Holder<com4j.stdole.IPictureDisp> ppPictureDisp);


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(1610743898) //= 0x6002005a. The runtime will prefer the VTID if present
  @VTID(97)
  IVShape shape();


  /**
   * <p>
   * Getter method for the COM property "SelectedCell"
   * </p>
   * @return  Returns a value of type IVCell
   */

  @DISPID(1610743899) //= 0x6002005b. The runtime will prefer the VTID if present
  @VTID(98)
  IVCell selectedCell();


  /**
   * @return  Returns a value of type IVWindow
   */

  @DISPID(1610743900) //= 0x6002005c. The runtime will prefer the VTID if present
  @VTID(99)
  IVWindow newWindow();


  /**
   * <p>
   * Getter method for the COM property "BackgroundColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
  @VTID(100)
  int backgroundColor();


  /**
   * <p>
   * Setter method for the COM property "BackgroundColor"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
  @VTID(101)
  void backgroundColor(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "BackgroundColorGradient"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743903) //= 0x6002005f. The runtime will prefer the VTID if present
  @VTID(102)
  int backgroundColorGradient();


  /**
   * <p>
   * Setter method for the COM property "BackgroundColorGradient"
   * </p>
   * @param pColor Mandatory int parameter.
   */

  @DISPID(1610743903) //= 0x6002005f. The runtime will prefer the VTID if present
  @VTID(103)
  void backgroundColorGradient(
    int pColor);


  /**
   * <p>
   * Getter method for the COM property "ShowPageOutline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743905) //= 0x60020061. The runtime will prefer the VTID if present
  @VTID(104)
  boolean showPageOutline();


  /**
   * <p>
   * Setter method for the COM property "ShowPageOutline"
   * </p>
   * @param show Mandatory boolean parameter.
   */

  @DISPID(1610743905) //= 0x60020061. The runtime will prefer the VTID if present
  @VTID(105)
  void showPageOutline(
    boolean show);


  /**
   * <p>
   * Getter method for the COM property "ScrollLock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743907) //= 0x60020063. The runtime will prefer the VTID if present
  @VTID(106)
  boolean scrollLock();


  /**
   * <p>
   * Setter method for the COM property "ScrollLock"
   * </p>
   * @param lock Mandatory boolean parameter.
   */

  @DISPID(1610743907) //= 0x60020063. The runtime will prefer the VTID if present
  @VTID(107)
  void scrollLock(
    boolean lock);


  /**
   * <p>
   * Getter method for the COM property "ZoomLock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743909) //= 0x60020065. The runtime will prefer the VTID if present
  @VTID(108)
  boolean zoomLock();


  /**
   * <p>
   * Setter method for the COM property "ZoomLock"
   * </p>
   * @param lock Mandatory boolean parameter.
   */

  @DISPID(1610743909) //= 0x60020065. The runtime will prefer the VTID if present
  @VTID(109)
  void zoomLock(
    boolean lock);


  /**
   * <p>
   * Getter method for the COM property "ZoomBehavior"
   * </p>
   * @return  Returns a value of type tagVisZoomBehavior
   */

  @DISPID(1610743911) //= 0x60020067. The runtime will prefer the VTID if present
  @VTID(110)
  tagVisZoomBehavior zoomBehavior();


  /**
   * <p>
   * Setter method for the COM property "ZoomBehavior"
   * </p>
   * @param pnZoomBehavior Mandatory tagVisZoomBehavior parameter.
   */

  @DISPID(1610743911) //= 0x60020067. The runtime will prefer the VTID if present
  @VTID(111)
  void zoomBehavior(
    tagVisZoomBehavior pnZoomBehavior);


  /**
   * <p>
   * Getter method for the COM property "SelectedMasters"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject[]
   */

  @DISPID(1610743913) //= 0x60020069. The runtime will prefer the VTID if present
  @VTID(112)
  Com4jObject[] selectedMasters();


  /**
   * <p>
   * Getter method for the COM property "SelectedText"
   * </p>
   * @return  Returns a value of type IVCharacters
   */

  @DISPID(1610743914) //= 0x6002006a. The runtime will prefer the VTID if present
  @VTID(113)
  IVCharacters selectedText();


  /**
   * <p>
   * Setter method for the COM property "SelectedText"
   * </p>
   * @param ppObjReturn Mandatory IVCharacters parameter.
   */

  @DISPID(1610743914) //= 0x6002006a. The runtime will prefer the VTID if present
  @VTID(114)
  void selectedText(
    IVCharacters ppObjReturn);


  /**
   * <p>
   * Getter method for the COM property "ReviewerMarkupVisible"
   * </p>
   * @param reviewerID Optional parameter. Default value is -1
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743916) //= 0x6002006c. The runtime will prefer the VTID if present
  @VTID(115)
  boolean reviewerMarkupVisible(
    @Optional @DefaultValue("-1") int reviewerID);


  /**
   * <p>
   * Setter method for the COM property "ReviewerMarkupVisible"
   * </p>
   * @param reviewerID Optional parameter. Default value is -1
   * @param viewStatus Mandatory boolean parameter.
   */

  @DISPID(1610743916) //= 0x6002006c. The runtime will prefer the VTID if present
  @VTID(116)
  void reviewerMarkupVisible(
    @Optional @DefaultValue("-1") int reviewerID,
    boolean viewStatus);


  /**
   * <p>
   * Setter method for the COM property "Selection"
   * </p>
   * @param lpdispRet Mandatory IVSelection parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(117)
  void selection(
    IVSelection lpdispRet);


  /**
   * <p>
   * Getter method for the COM property "SelectedDataRecordset"
   * </p>
   * @return  Returns a value of type IVDataRecordset
   */

  @DISPID(1610743919) //= 0x6002006f. The runtime will prefer the VTID if present
  @VTID(118)
  IVDataRecordset selectedDataRecordset();


  /**
   * <p>
   * Setter method for the COM property "SelectedDataRecordset"
   * </p>
   * @param dataRecordset Mandatory IVDataRecordset parameter.
   */

  @DISPID(1610743919) //= 0x6002006f. The runtime will prefer the VTID if present
  @VTID(119)
  void selectedDataRecordset(
    IVDataRecordset dataRecordset);


  /**
   * <p>
   * Getter method for the COM property "SelectedDataRowID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743921) //= 0x60020071. The runtime will prefer the VTID if present
  @VTID(120)
  int selectedDataRowID();


  /**
   * <p>
   * Setter method for the COM property "SelectedDataRowID"
   * </p>
   * @param dataRowID Mandatory int parameter.
   */

  @DISPID(1610743921) //= 0x60020071. The runtime will prefer the VTID if present
  @VTID(121)
  void selectedDataRowID(
    int dataRowID);


  /**
   * <p>
   * Getter method for the COM property "SelectionForDragCopy"
   * </p>
   * @return  Returns a value of type IVSelection
   */

  @DISPID(1610743923) //= 0x60020073. The runtime will prefer the VTID if present
  @VTID(122)
  IVSelection selectionForDragCopy();


  @VTID(122)
  @ReturnValue(defaultPropertyThrough={IVSelection.class})
  IVShape selectionForDragCopy(
    int index);

  /**
   * <p>
   * Setter method for the COM property "SelectedValidationIssue"
   * </p>
   * @param pIssue Mandatory IVValidationIssue parameter.
   */

  @DISPID(1610743924) //= 0x60020074. The runtime will prefer the VTID if present
  @VTID(123)
  void selectedValidationIssue(
    IVValidationIssue pIssue);


  /**
   * <p>
   * Getter method for the COM property "SelectedValidationIssue"
   * </p>
   * @return  Returns a value of type IVValidationIssue
   */

  @DISPID(1610743924) //= 0x60020074. The runtime will prefer the VTID if present
  @VTID(124)
  IVValidationIssue selectedValidationIssue();


  /**
   * @param sheetObject Mandatory IVShape parameter.
   * @param flags Mandatory VisCenterViewFlags parameter.
   */

  @DISPID(1610743926) //= 0x60020076. The runtime will prefer the VTID if present
  @VTID(125)
  void centerViewOnShape(
    IVShape sheetObject,
    VisCenterViewFlags flags);


  // Properties:
}

package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D0707-0000-0000-C000-000000000046}")
public interface IVMaster extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type IVDocument
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(7)
  

    IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "Prompt"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(8)
  String prompt();


  /**
   * <p>
   * Setter method for the COM property "Prompt"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(9)
  void prompt(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "AlignName"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(10)
  short alignName();


  /**
   * <p>
   * Setter method for the COM property "AlignName"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(11)
  void alignName(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "IconSize"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(12)
  short iconSize();


  /**
   * <p>
   * Setter method for the COM property "IconSize"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(13)
  void iconSize(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "IconUpdate"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(14)
  short iconUpdate();


  /**
   * <p>
   * Setter method for the COM property "IconUpdate"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(15)
  void iconUpdate(
    short lpi2Ret);


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type IVApplication
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(16)
  

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(17)
  short stat();


  /**
   * <p>
   * Returns visObjTypeMaster (12).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(18)
  short objectType();


  /**
   * <p>
   * Master's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(19)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Master's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lpLocaleSpecificName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  void name(
    String lpLocaleSpecificName);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type IVShapes
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(21)
  

    IVShapes shapes();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={IVShapes.class})
  IVShape shapes(
    @MarshalAs(NativeType.VARIANT) Object nameUIDOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  short index();


  /**
   * <p>
   * Getter method for the COM property "OneD"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  short oneD();


  /**
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(24)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "UniqueID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(25)
  String uniqueID();


  /**
   * <p>
   * Getter method for the COM property "Layers"
   * </p>
   * @return  Returns a value of type IVLayers
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(26)
  IVLayers layers();


  @VTID(26)
  @ReturnValue(defaultPropertyThrough={IVLayers.class})
  IVLayer layers(
    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

  /**
   * <p>
   * Getter method for the COM property "PageSheet"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(27)
  IVShape pageSheet();


  /**
   * @param objectToDrop Mandatory com4j.Com4jObject parameter.
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   * @return  Returns a value of type IVShape
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(28)
  IVShape drop(
    Com4jObject objectToDrop,
    double xPos,
    double yPos);


  /**
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(29)
  void centerDrawing();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type IVEventList
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(30)
  

    IVEventList eventList();


  @VTID(30)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(31)
  short persistsEvents();


  /**
   * @param xBegin Mandatory double parameter.
   * @param yBegin Mandatory double parameter.
   * @param xEnd Mandatory double parameter.
   * @param yEnd Mandatory double parameter.
   * @return  Returns a value of type IVShape
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(32)
  IVShape drawLine(
    double xBegin,
    double yBegin,
    double xEnd,
    double yEnd);


  /**
   * @param x1 Mandatory double parameter.
   * @param y1 Mandatory double parameter.
   * @param x2 Mandatory double parameter.
   * @param y2 Mandatory double parameter.
   * @return  Returns a value of type IVShape
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(33)
  IVShape drawRectangle(
    double x1,
    double y1,
    double x2,
    double y2);


  /**
   * @param x1 Mandatory double parameter.
   * @param y1 Mandatory double parameter.
   * @param x2 Mandatory double parameter.
   * @param y2 Mandatory double parameter.
   * @return  Returns a value of type IVShape
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(34)
  IVShape drawOval(
    double x1,
    double y1,
    double x2,
    double y2);


        /**
         * @param fileName Mandatory java.lang.String parameter.
         * @return  Returns a value of type IVShape
         */

        @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
        @VTID(38)
        IVShape _import(
          String fileName);


        /**
         * @param fileName Mandatory java.lang.String parameter.
         */

        @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
        @VTID(39)
        void export(
          String fileName);


        /**
         * @param fileName Mandatory java.lang.String parameter.
         * @param flags Mandatory short parameter.
         * @return  Returns a value of type IVShape
         */

        @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
        @VTID(40)
        IVShape insertFromFile(
          String fileName,
          short flags);


        /**
         * @param classOrProgID Mandatory java.lang.String parameter.
         * @param flags Mandatory short parameter.
         * @return  Returns a value of type IVShape
         */

        @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
        @VTID(41)
        IVShape insertObject(
          String classOrProgID,
          short flags);


        /**
         * @return  Returns a value of type IVWindow
         */

        @DISPID(30) //= 0x1e. The runtime will prefer the VTID if present
        @VTID(42)
        

    IVWindow openDrawWindow();


        /**
         * @return  Returns a value of type IVWindow
         */

        @DISPID(31) //= 0x1f. The runtime will prefer the VTID if present
        @VTID(43)
        IVWindow openIconWindow();


        /**
         * @return  Returns a value of type IVMaster
         */

        @DISPID(32) //= 0x20. The runtime will prefer the VTID if present
        @VTID(44)
        IVMaster open();


        /**
         */

        @DISPID(33) //= 0x21. The runtime will prefer the VTID if present
        @VTID(45)
        void close();


                  /**
                   * <p>
                   * Getter method for the COM property "Connects"
                   * </p>
                   * @return  Returns a value of type IVConnects
                   */

                  @DISPID(39) //= 0x27. The runtime will prefer the VTID if present
                  @VTID(51)
                  IVConnects connects();


                  @VTID(51)
                  @ReturnValue(defaultPropertyThrough={IVConnects.class})
                  IVConnect connects(
                    int index);

                  /**
                   * @param fileName Mandatory java.lang.String parameter.
                   */

                  @DISPID(40) //= 0x28. The runtime will prefer the VTID if present
                  @VTID(52)
                  void importIcon(
                    String fileName);


                  /**
                   * @param fileName Mandatory java.lang.String parameter.
                   * @param flags Mandatory short parameter.
                   */

                  @DISPID(41) //= 0x29. The runtime will prefer the VTID if present
                  @VTID(53)
                  void exportIconTransparentAsBlack(
                    String fileName,
                    short flags);


                  /**
                   */

                  @DISPID(42) //= 0x2a. The runtime will prefer the VTID if present
                  @VTID(54)
                  void layout();


                  /**
                   * @param flags Mandatory short parameter.
                   * @param lpr8Left Mandatory Holder<Double> parameter.
                   * @param lpr8Bottom Mandatory Holder<Double> parameter.
                   * @param lpr8Right Mandatory Holder<Double> parameter.
                   * @param lpr8Top Mandatory Holder<Double> parameter.
                   */

                  @DISPID(43) //= 0x2b. The runtime will prefer the VTID if present
                  @VTID(55)
                  void boundingBox(
                    short flags,
                    Holder<Double> lpr8Left,
                    Holder<Double> lpr8Bottom,
                    Holder<Double> lpr8Right,
                    Holder<Double> lpr8Top);


                  /**
                   * <p>
                   * Getter method for the COM property "ID16"
                   * </p>
                   * @return  Returns a value of type short
                   */

                  @DISPID(44) //= 0x2c. The runtime will prefer the VTID if present
                  @VTID(56)
                  short iD16();


                  /**
                   * <p>
                   * Getter method for the COM property "OLEObjects"
                   * </p>
                   * @return  Returns a value of type IVOLEObjects
                   */

                  @DISPID(45) //= 0x2d. The runtime will prefer the VTID if present
                  @VTID(57)
                  IVOLEObjects oleObjects();


                  @VTID(57)
                  @ReturnValue(defaultPropertyThrough={IVOLEObjects.class})
                  IVOLEObject oleObjects(
                    @MarshalAs(NativeType.VARIANT) Object nameOrIndex);

                  /**
                   * <p>
                   * Getter method for the COM property "PatternFlags"
                   * </p>
                   * @return  Returns a value of type short
                   */

                  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
                  @VTID(58)
                  short patternFlags();


                  /**
                   * <p>
                   * Setter method for the COM property "PatternFlags"
                   * </p>
                   * @param lpi2Ret Mandatory short parameter.
                   */

                  @DISPID(46) //= 0x2e. The runtime will prefer the VTID if present
                  @VTID(59)
                  void patternFlags(
                    short lpi2Ret);


                  /**
                   * <p>
                   * Getter method for the COM property "MatchByName"
                   * </p>
                   * @return  Returns a value of type short
                   */

                  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
                  @VTID(60)
                  short matchByName();


                  /**
                   * <p>
                   * Setter method for the COM property "MatchByName"
                   * </p>
                   * @param lpi2Ret Mandatory short parameter.
                   */

                  @DISPID(47) //= 0x2f. The runtime will prefer the VTID if present
                  @VTID(61)
                  void matchByName(
                    short lpi2Ret);


                  /**
                   * <p>
                   * Getter method for the COM property "ID"
                   * </p>
                   * @return  Returns a value of type int
                   */

                  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
                  @VTID(62)
                  int id();


                  /**
                   * <p>
                   * Getter method for the COM property "Hidden"
                   * </p>
                   * @return  Returns a value of type short
                   */

                  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
                  @VTID(63)
                  short hidden();


                  /**
                   * <p>
                   * Setter method for the COM property "Hidden"
                   * </p>
                   * @param lpi2Ret Mandatory short parameter.
                   */

                  @DISPID(49) //= 0x31. The runtime will prefer the VTID if present
                  @VTID(64)
                  void hidden(
                    short lpi2Ret);


                  /**
                   * <p>
                   * Getter method for the COM property "BaseID"
                   * </p>
                   * @return  Returns a value of type java.lang.String
                   */

                  @DISPID(50) //= 0x32. The runtime will prefer the VTID if present
                  @VTID(65)
                  String baseID();


                  /**
                   * <p>
                   * Getter method for the COM property "NewBaseID"
                   * </p>
                   * @return  Returns a value of type java.lang.String
                   */

                  @DISPID(51) //= 0x33. The runtime will prefer the VTID if present
                  @VTID(66)
                  String newBaseID();


                  /**
                   * <p>
                   * Getter method for the COM property "SpatialSearch"
                   * </p>
                   * @param x Mandatory double parameter.
                   * @param y Mandatory double parameter.
                   * @param relation Mandatory short parameter.
                   * @param tolerance Mandatory double parameter.
                   * @param flags Mandatory short parameter.
                   * @return  Returns a value of type IVSelection
                   */

                  @DISPID(52) //= 0x34. The runtime will prefer the VTID if present
                  @VTID(67)
                  IVSelection spatialSearch(
                    double x,
                    double y,
                    short relation,
                    double tolerance,
                    short flags);


                  /**
                   * @return  Returns a value of type IVMasterShortcut
                   */

                  @DISPID(53) //= 0x35. The runtime will prefer the VTID if present
                  @VTID(68)
                  IVMasterShortcut createShortcut();


                  /**
                   * <p>
                   * Master's locale independent name.
                   * </p>
                   * <p>
                   * Getter method for the COM property "NameU"
                   * </p>
                   * @return  Returns a value of type java.lang.String
                   */

                  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
                  @VTID(69)
                  String nameU();


                  /**
                   * <p>
                   * Master's locale independent name.
                   * </p>
                   * <p>
                   * Setter method for the COM property "NameU"
                   * </p>
                   * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
                   */

                  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
                  @VTID(70)
                  void nameU(
                    String lpLocaleIndependentName);


                        /**
                         * @param fileName Mandatory java.lang.String parameter.
                         * @param flags Mandatory short parameter.
                         * @param transparentRGB Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(58) //= 0x3a. The runtime will prefer the VTID if present
                        @VTID(74)
                        void exportIcon(
                          String fileName,
                          short flags,
                          @Optional @MarshalAs(NativeType.VARIANT) Object transparentRGB);


                        /**
                         * <p>
                         * Getter method for the COM property "IndexInStencil"
                         * </p>
                         * @return  Returns a value of type short
                         */

                        @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
                        @VTID(75)
                        short indexInStencil();


                        /**
                         * <p>
                         * Getter method for the COM property "Picture"
                         * </p>
                         * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
                         */

                        @DISPID(1610743877) //= 0x60020045. The runtime will prefer the VTID if present
                        @VTID(76)
                        Holder<com4j.stdole.IPictureDisp> picture();


                        /**
                         * <p>
                         * Getter method for the COM property "Icon"
                         * </p>
                         * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
                         */

                        @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
                        @VTID(77)
                        Holder<com4j.stdole.IPictureDisp> icon();


                        /**
                         * <p>
                         * Setter method for the COM property "Icon"
                         * </p>
                         * @param ppPictureDisp Mandatory Holder<com4j.stdole.IPictureDisp> parameter.
                         */

                        @DISPID(1610743878) //= 0x60020046. The runtime will prefer the VTID if present
                        @VTID(78)
                        void icon(
                          Holder<com4j.stdole.IPictureDisp> ppPictureDisp);


                        /**
                         * <p>
                         * Returns the open for edit Master that was originally copied from this Master. If there is no open for edit Master associated with this Master, returns Nothing.
                         * </p>
                         * <p>
                         * Getter method for the COM property "EditCopy"
                         * </p>
                         * @return  Returns a value of type IVMaster
                         */

                        @DISPID(1610743880) //= 0x60020048. The runtime will prefer the VTID if present
                        @VTID(79)
                        IVMaster editCopy();


                        /**
                         * <p>
                         * Returns the original Master that produced this open Master. If this Master is not an open EditCopy of another Master, returns Nothing.
                         * </p>
                         * <p>
                         * Getter method for the COM property "Original"
                         * </p>
                         * @return  Returns a value of type IVMaster
                         */

                        @DISPID(1610743881) //= 0x60020049. The runtime will prefer the VTID if present
                        @VTID(80)
                        IVMaster original();


                        /**
                         * <p>
                         * If Original is not Nothing, this returns whether any changes have been made to this Master since it was opened. Always False when Original is Nothing.
                         * </p>
                         * <p>
                         * Getter method for the COM property "IsChanged"
                         * </p>
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743882) //= 0x6002004a. The runtime will prefer the VTID if present
                        @VTID(81)
                        boolean isChanged();


                        /**
                         * <p>
                         * Setter method for the COM property "IndexInStencil"
                         * </p>
                         * @param lpi2Ret Mandatory short parameter.
                         */

                        @DISPID(59) //= 0x3b. The runtime will prefer the VTID if present
                        @VTID(82)
                        void indexInStencil(
                          short lpi2Ret);


                        /**
                         */

                        @DISPID(1610743884) //= 0x6002004c. The runtime will prefer the VTID if present
                        @VTID(83)
                        void resizeToFitContents();


                        /**
                         * @param flags Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743885) //= 0x6002004d. The runtime will prefer the VTID if present
                        @VTID(84)
                        void paste(
                          @Optional @MarshalAs(NativeType.VARIANT) Object flags);


                        /**
                         * @param format Mandatory int parameter.
                         * @param link Optional parameter. Default value is com4j.Variant.getMissing()
                         * @param displayAsIcon Optional parameter. Default value is com4j.Variant.getMissing()
                         */

                        @DISPID(1610743886) //= 0x6002004e. The runtime will prefer the VTID if present
                        @VTID(85)
                        void pasteSpecial(
                          int format,
                          @Optional @MarshalAs(NativeType.VARIANT) Object link,
                          @Optional @MarshalAs(NativeType.VARIANT) Object displayAsIcon);


                        /**
                         * @param selType Mandatory VisSelectionTypes parameter.
                         * @param iterationMode Optional parameter. Default value is 256
                         * @param data Optional parameter. Default value is com4j.Variant.getMissing()
                         * @return  Returns a value of type IVSelection
                         */

                        @DISPID(1610743887) //= 0x6002004f. The runtime will prefer the VTID if present
                        @VTID(86)
                        IVSelection createSelection(
                          VisSelectionTypes selType,
                          @Optional @DefaultValue("256") tagVisSelectMode iterationMode,
                          @Optional @MarshalAs(NativeType.VARIANT) Object data);


                        /**
                         * @param type Mandatory short parameter.
                         * @param xPos Mandatory double parameter.
                         * @param yPos Mandatory double parameter.
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743888) //= 0x60020050. The runtime will prefer the VTID if present
                        @VTID(87)
                        IVShape addGuide(
                          short type,
                          double xPos,
                          double yPos);


                        /**
                         * @param xBegin Mandatory double parameter.
                         * @param yBegin Mandatory double parameter.
                         * @param xEnd Mandatory double parameter.
                         * @param yEnd Mandatory double parameter.
                         * @param xControl Mandatory double parameter.
                         * @param yControl Mandatory double parameter.
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743889) //= 0x60020051. The runtime will prefer the VTID if present
                        @VTID(88)
                        IVShape drawArcByThreePoints(
                          double xBegin,
                          double yBegin,
                          double xEnd,
                          double yEnd,
                          double xControl,
                          double yControl);


                        /**
                         * @param xBegin Mandatory double parameter.
                         * @param yBegin Mandatory double parameter.
                         * @param xEnd Mandatory double parameter.
                         * @param yEnd Mandatory double parameter.
                         * @param sweepFlag Mandatory VisArcSweepFlags parameter.
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743890) //= 0x60020052. The runtime will prefer the VTID if present
                        @VTID(89)
                        IVShape drawQuarterArc(
                          double xBegin,
                          double yBegin,
                          double xEnd,
                          double yEnd,
                          VisArcSweepFlags sweepFlag);


                        /**
                         * @param xCenter Mandatory double parameter.
                         * @param yCenter Mandatory double parameter.
                         * @param radius Mandatory double parameter.
                         * @param startAngle Optional parameter. Default value is 0.0
                         * @param endAngle Optional parameter. Default value is 3.1415927410125732
                         * @return  Returns a value of type IVShape
                         */

                        @DISPID(1610743891) //= 0x60020053. The runtime will prefer the VTID if present
                        @VTID(90)
                        IVShape drawCircularArc(
                          double xCenter,
                          double yCenter,
                          double radius,
                          @Optional @DefaultValue("0") double startAngle,
                          @Optional @DefaultValue("3.14159274101257") double endAngle);


                        /**
                         * <p>
                         * Getter method for the COM property "Type"
                         * </p>
                         * @return  Returns a value of type VisMasterTypes
                         */

                        @DISPID(1610743892) //= 0x60020054. The runtime will prefer the VTID if present
                        @VTID(91)
                        VisMasterTypes type();


                        /**
                         * <p>
                         * Getter method for the COM property "DataGraphicHidden"
                         * </p>
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743893) //= 0x60020055. The runtime will prefer the VTID if present
                        @VTID(92)
                        boolean dataGraphicHidden();


                        /**
                         * <p>
                         * Setter method for the COM property "DataGraphicHidden"
                         * </p>
                         * @param hidden Mandatory boolean parameter.
                         */

                        @DISPID(1610743893) //= 0x60020055. The runtime will prefer the VTID if present
                        @VTID(93)
                        void dataGraphicHidden(
                          boolean hidden);


                        /**
                         * <p>
                         * Getter method for the COM property "DataGraphicHidesText"
                         * </p>
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
                        @VTID(94)
                        boolean dataGraphicHidesText();


                        /**
                         * <p>
                         * Setter method for the COM property "DataGraphicHidesText"
                         * </p>
                         * @param hideText Mandatory boolean parameter.
                         */

                        @DISPID(1610743895) //= 0x60020057. The runtime will prefer the VTID if present
                        @VTID(95)
                        void dataGraphicHidesText(
                          boolean hideText);


                        /**
                         * <p>
                         * Getter method for the COM property "DataGraphicShowBorder"
                         * </p>
                         * @return  Returns a value of type boolean
                         */

                        @DISPID(1610743897) //= 0x60020059. The runtime will prefer the VTID if present
                        @VTID(96)
                        boolean dataGraphicShowBorder();


                        /**
                         * <p>
                         * Setter method for the COM property "DataGraphicShowBorder"
                         * </p>
                         * @param showBorder Mandatory boolean parameter.
                         */

                        @DISPID(1610743897) //= 0x60020059. The runtime will prefer the VTID if present
                        @VTID(97)
                        void dataGraphicShowBorder(
                          boolean showBorder);


                        /**
                         * <p>
                         * Getter method for the COM property "DataGraphicHorizontalPosition"
                         * </p>
                         * @return  Returns a value of type VisGraphicPositionHorizontal
                         */

                        @DISPID(1610743899) //= 0x6002005b. The runtime will prefer the VTID if present
                        @VTID(98)
                        VisGraphicPositionHorizontal dataGraphicHorizontalPosition();


                        /**
                         * <p>
                         * Setter method for the COM property "DataGraphicHorizontalPosition"
                         * </p>
                         * @param position Mandatory VisGraphicPositionHorizontal parameter.
                         */

                        @DISPID(1610743899) //= 0x6002005b. The runtime will prefer the VTID if present
                        @VTID(99)
                        void dataGraphicHorizontalPosition(
                          VisGraphicPositionHorizontal position);


                        /**
                         * <p>
                         * Getter method for the COM property "DataGraphicVerticalPosition"
                         * </p>
                         * @return  Returns a value of type VisGraphicPositionVertical
                         */

                        @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
                        @VTID(100)
                        VisGraphicPositionVertical dataGraphicVerticalPosition();


                        /**
                         * <p>
                         * Setter method for the COM property "DataGraphicVerticalPosition"
                         * </p>
                         * @param position Mandatory VisGraphicPositionVertical parameter.
                         */

                        @DISPID(1610743901) //= 0x6002005d. The runtime will prefer the VTID if present
                        @VTID(101)
                        void dataGraphicVerticalPosition(
                          VisGraphicPositionVertical position);


                        /**
                         * <p>
                         * Getter method for the COM property "GraphicItems"
                         * </p>
                         * @return  Returns a value of type IVGraphicItems
                         */

                        @DISPID(1610743903) //= 0x6002005f. The runtime will prefer the VTID if present
                        @VTID(102)
                        IVGraphicItems graphicItems();


                        @VTID(102)
                        @ReturnValue(defaultPropertyThrough={IVGraphicItems.class})
                        IVGraphicItem graphicItems(
                          int index);

                        /**
                         */

                        @DISPID(1610743904) //= 0x60020060. The runtime will prefer the VTID if present
                        @VTID(103)
                        void dataGraphicDelete();


                        /**
                         * @param xPos Mandatory double parameter.
                         * @param yPos Mandatory double parameter.
                         * @param flags Mandatory int parameter.
                         */

                        @DISPID(1610743905) //= 0x60020061. The runtime will prefer the VTID if present
                        @VTID(104)
                        void pasteToLocation(
                          double xPos,
                          double yPos,
                          int flags);


                        /**
                         * @param flags Mandatory short parameter.
                         * @param lpr8Left Mandatory Holder<Double> parameter.
                         * @param lpr8Bottom Mandatory Holder<Double> parameter.
                         * @param lpr8Right Mandatory Holder<Double> parameter.
                         * @param lpr8Top Mandatory Holder<Double> parameter.
                         */

                        @DISPID(1610743906) //= 0x60020062. The runtime will prefer the VTID if present
                        @VTID(105)
                        void visualBoundingBox(
                          short flags,
                          Holder<Double> lpr8Left,
                          Holder<Double> lpr8Bottom,
                          Holder<Double> lpr8Right,
                          Holder<Double> lpr8Top);


                        /**
                         * <p>
                         * Getter method for the COM property "Title"
                         * </p>
                         * @return  Returns a value of type java.lang.String
                         */

                        @DISPID(1610743907) //= 0x60020063. The runtime will prefer the VTID if present
                        @VTID(106)
                        String title();


                        /**
                         * <p>
                         * Setter method for the COM property "Title"
                         * </p>
                         * @param pTitle Mandatory java.lang.String parameter.
                         */

                        @DISPID(1610743907) //= 0x60020063. The runtime will prefer the VTID if present
                        @VTID(107)
                        void title(
                          String pTitle);


                        /**
                         * <p>
                         * Getter method for the COM property "AlternativeText"
                         * </p>
                         * @return  Returns a value of type java.lang.String
                         */

                        @DISPID(1610743909) //= 0x60020065. The runtime will prefer the VTID if present
                        @VTID(108)
                        String alternativeText();


                        /**
                         * <p>
                         * Setter method for the COM property "AlternativeText"
                         * </p>
                         * @param pAlternativeText Mandatory java.lang.String parameter.
                         */

                        @DISPID(1610743909) //= 0x60020065. The runtime will prefer the VTID if present
                        @VTID(109)
                        void alternativeText(
                          String pAlternativeText);


                        // Properties:
                      }

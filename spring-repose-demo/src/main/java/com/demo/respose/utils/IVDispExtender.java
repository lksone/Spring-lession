package com.demo.respose.utils

;

import com4j.*;

/**
 * Dispatch interface of extensions Visio gives to a control contained in a Visio Document.
 */
@IID("{00020400-0000-0000-C000-000000000046}")
public interface IVDispExtender extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(-2147418112)
  @PropGet
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112)
  @PropPut
  void name(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   */

  @DISPID(-802)
  @PropGet
  Com4jObject object();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(-2147418104)
  @PropGet
  Com4jObject parent();


  /**
   */

  @DISPID(-801)
  void delete();


  /**
   */

  @DISPID(-804)
  void index();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   */

  @DISPID(-2147417856)
  @PropGet
  IVShape shape();


  /**
   */

  @DISPID(-2147417811)
  void voidGroup();


  /**
   */

  @DISPID(-2147417810)
  void bringForward();


  /**
   */

  @DISPID(-2147417809)
  void bringToFront();


  /**
   */

  @DISPID(-2147417808)
  void convertToGroup();


  /**
   */

  @DISPID(-2147417804)
  void sendBackward();


  /**
   */

  @DISPID(-2147417803)
  void sendToBack();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   */

  @DISPID(-2147417812)
  @PropGet
  IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ShapeParent"
   * </p>
   */

  @DISPID(-2147417800)
  @PropGet
  Com4jObject shapeParent();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(-2147417855)
  @PropGet
  IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Master"
   * </p>
   */

  @DISPID(-2147417835)
  @PropGet
  IVMaster master();


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @param localeSpecificCellName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417843)
  @PropGet
  IVCell cells(
    String localeSpecificCellName);


  /**
   * <p>
   * Getter method for the COM property "CellsSRC"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param column Mandatory short parameter.
   */

  @DISPID(-2147417842)
  @PropGet
  IVCell cellsSRC(
    short section,
    short row,
    short column);


  /**
   * <p>
   * Getter method for the COM property "Data1"
   * </p>
   */

  @DISPID(-2147417841)
  @PropGet
  String data1();


  /**
   * <p>
   * Setter method for the COM property "Data1"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417841)
  @PropPut
  void data1(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "Data2"
   * </p>
   */

  @DISPID(-2147417840)
  @PropGet
  String data2();


  /**
   * <p>
   * Setter method for the COM property "Data2"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417840)
  @PropPut
  void data2(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "Data3"
   * </p>
   */

  @DISPID(-2147417839)
  @PropGet
  String data3();


  /**
   * <p>
   * Setter method for the COM property "Data3"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417839)
  @PropPut
  void data3(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "Help"
   * </p>
   */

  @DISPID(-2147417838)
  @PropGet
  String help();


  /**
   * <p>
   * Setter method for the COM property "Help"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417838)
  @PropPut
  void help(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "NameID"
   * </p>
   */

  @DISPID(-2147417852)
  @PropGet
  String nameID();


  /**
   */

  @DISPID(-2147417847)
  void shapeCopy();


  /**
   */

  @DISPID(-2147417846)
  void shapeCut();


  /**
   */

  @DISPID(-2147417845)
  void shapeDelete();


  /**
   */

  @DISPID(-2147417844)
  void voidShapeDuplicate();


  /**
   * <p>
   * Getter method for the COM property "RowCount"
   * </p>
   * @param section Mandatory short parameter.
   */

  @DISPID(-2147417832)
  @PropGet
  short rowCount(
    short section);


  /**
   * @param section Mandatory short parameter.
   */

  @DISPID(-2147417831)
  short addSection(
    short section);


  /**
   * @param section Mandatory short parameter.
   */

  @DISPID(-2147417830)
  void deleteSection(
    short section);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param rowTag Mandatory short parameter.
   */

  @DISPID(-2147417829)
  short addRow(
    short section,
    short row,
    short rowTag);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   */

  @DISPID(-2147417828)
  void deleteRow(
    short section,
    short row);


  /**
   * <p>
   * Getter method for the COM property "RowsCellCount"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   */

  @DISPID(-2147417827)
  @PropGet
  short rowsCellCount(
    short section,
    short row);


  /**
   * <p>
   * Getter method for the COM property "RowType"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   */

  @DISPID(-2147417826)
  @PropGet
  short rowType(
    short section,
    short row);


  /**
   * <p>
   * Setter method for the COM property "RowType"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param rhs Mandatory short parameter.
   */

  @DISPID(-2147417826)
  @PropPut
  void rowType(
    short section,
    short row,
    short rhs);


  /**
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   */

  @DISPID(-2147417825)
  void setCenter(
    double xPos,
    double yPos);


  /**
   * <p>
   * Getter method for the COM property "Connects"
   * </p>
   */

  @DISPID(-2147417822)
  @PropGet
  IVConnects connects();


  /**
   * <p>
   * Getter method for the COM property "ShapeIndex16"
   * </p>
   */

  @DISPID(-2147417821)
  @PropGet
  short shapeIndex16();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   */

  @DISPID(-2147417820)
  @PropGet
  String style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417820)
  @PropPut
  void style(
    String rhs);


  /**
   * <p>
   * Setter method for the COM property "StyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417816)
  @PropPut
  void styleKeepFmt(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "LineStyle"
   * </p>
   */

  @DISPID(-2147417819)
  @PropGet
  String lineStyle();


  /**
   * <p>
   * Setter method for the COM property "LineStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417819)
  @PropPut
  void lineStyle(
    String rhs);


  /**
   * <p>
   * Setter method for the COM property "LineStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417815)
  @PropPut
  void lineStyleKeepFmt(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "FillStyle"
   * </p>
   */

  @DISPID(-2147417818)
  @PropGet
  String fillStyle();


  /**
   * <p>
   * Setter method for the COM property "FillStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417818)
  @PropPut
  void fillStyle(
    String rhs);


  /**
   * <p>
   * Setter method for the COM property "FillStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417814)
  @PropPut
  void fillStyleKeepFmt(
    String rhs);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417799)
  void export(
    String fileName);


  /**
   * <p>
   * Getter method for the COM property "UniqueID"
   * </p>
   * @param fUniqueID Mandatory short parameter.
   */

  @DISPID(-2147417795)
  @PropGet
  String uniqueID(
    short fUniqueID);


  /**
   * <p>
   * Getter method for the COM property "ContainingPage"
   * </p>
   */

  @DISPID(-2147417794)
  @PropGet
  IVPage containingPage();


  /**
   * <p>
   * Getter method for the COM property "ContainingMaster"
   * </p>
   */

  @DISPID(-2147417793)
  @PropGet
  IVMaster containingMaster();


  /**
   * <p>
   * Getter method for the COM property "ContainingShape"
   * </p>
   */

  @DISPID(-2147417792)
  @PropGet
  IVShape containingShape();


  /**
   * <p>
   * Getter method for the COM property "SectionExists"
   * </p>
   * @param section Mandatory short parameter.
   * @param fExistsLocally Mandatory short parameter.
   */

  @DISPID(-2147417791)
  @PropGet
  short sectionExists(
    short section,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "RowExists"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param fExistsLocally Mandatory short parameter.
   */

  @DISPID(-2147417790)
  @PropGet
  short rowExists(
    short section,
    short row,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "CellExists"
   * </p>
   * @param localeSpecificCellName Mandatory java.lang.String parameter.
   * @param fExistsLocally Mandatory short parameter.
   */

  @DISPID(-2147417789)
  @PropGet
  short cellExists(
    String localeSpecificCellName,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "CellsSRCExists"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param column Mandatory short parameter.
   * @param fExistsLocally Mandatory short parameter.
   */

  @DISPID(-2147417788)
  @PropGet
  short cellsSRCExists(
    short section,
    short row,
    short column,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "LayerCount"
   * </p>
   */

  @DISPID(-2147417787)
  @PropGet
  short layerCount();


  /**
   * <p>
   * Getter method for the COM property "Layer"
   * </p>
   * @param index Mandatory short parameter.
   */

  @DISPID(-2147417786)
  @PropGet
  IVLayer layer(
    short index);


  /**
   * @param section Mandatory short parameter.
   * @param rowName Mandatory java.lang.String parameter.
   * @param rowTag Mandatory short parameter.
   */

  @DISPID(-2147417785)
  short addNamedRow(
    short section,
    String rowName,
    short rowTag);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param rowTag Mandatory short parameter.
   * @param rowCount Mandatory short parameter.
   */

  @DISPID(-2147417784)
  short addRows(
    short section,
    short row,
    short rowTag,
    short rowCount);


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   */

  @DISPID(-2147417783)
  @PropGet
  IVEventList eventList();


  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   */

  @DISPID(-2147417782)
  @PropGet
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "ClassID"
   * </p>
   */

  @DISPID(-2147417770)
  @PropGet
  String classID();


  /**
   * <p>
   * Getter method for the COM property "ShapeObject"
   * </p>
   */

  @DISPID(-2147417768)
  @PropGet
  Com4jObject shapeObject();


  /**
   */

  @DISPID(-2147417766)
  IVWindow openSheetWindow();


  /**
   * <p>
   * Getter method for the COM property "ShapeID16"
   * </p>
   */

  @DISPID(-2147417765)
  @PropGet
  short shapeID16();


          /**
           * <p>
           * Getter method for the COM property "FromConnects"
           * </p>
           */

          @DISPID(-2147417759)
          @PropGet
          IVConnects fromConnects();


          /**
           * @param flags Mandatory short parameter.
           * @param lpr8Left Mandatory Holder<Double> parameter.
           * @param lpr8Bottom Mandatory Holder<Double> parameter.
           * @param lpr8Right Mandatory Holder<Double> parameter.
           * @param lpr8Top Mandatory Holder<Double> parameter.
           */

          @DISPID(-2147417757)
          void boundingBox(
            short flags,
            Holder<Double> lpr8Left,
            Holder<Double> lpr8Bottom,
            Holder<Double> lpr8Right,
            Holder<Double> lpr8Top);


          /**
           * @param xPos Mandatory double parameter.
           * @param yPos Mandatory double parameter.
           * @param tolerance Mandatory double parameter.
           */

          @DISPID(-2147417756)
          short hitTest(
            double xPos,
            double yPos,
            double tolerance);


          /**
           * <p>
           * Getter method for the COM property "Hyperlink"
           * </p>
           */

          @DISPID(-2147417755)
          @PropGet
          IVHyperlink hyperlink();


          /**
           * <p>
           * Getter method for the COM property "ProgID"
           * </p>
           */

          @DISPID(-2147417754)
          @PropGet
          String progID();


          /**
           * <p>
           * Getter method for the COM property "ObjectIsInherited"
           * </p>
           */

          @DISPID(-2147417753)
          @PropGet
          short objectIsInherited();


          /**
           * <p>
           * Getter method for the COM property "ShapeID"
           * </p>
           */

          @DISPID(-2147417749)
          @PropGet
          int shapeID();


          /**
           * <p>
           * Getter method for the COM property "ShapeIndex"
           * </p>
           */

          @DISPID(-2147417748)
          @PropGet
          int shapeIndex();


          /**
           * <p>
           * Returns the created group shape
           * </p>
           */

          @DISPID(-2147417726)
          IVShape group();


          /**
           * <p>
           * Returns the duplicated shape
           * </p>
           */

          @DISPID(-2147417725)
          IVShape shapeDuplicate();


          /**
           * @param flags Mandatory short parameter.
           * @param lpr8Left Mandatory Holder<Double> parameter.
           * @param lpr8Bottom Mandatory Holder<Double> parameter.
           * @param lpr8Right Mandatory Holder<Double> parameter.
           * @param lpr8Top Mandatory Holder<Double> parameter.
           */

          @DISPID(-2147417724)
          void visualBoundingBox(
            short flags,
            Holder<Double> lpr8Left,
            Holder<Double> lpr8Bottom,
            Holder<Double> lpr8Right,
            Holder<Double> lpr8Top);


          // Properties:
        }

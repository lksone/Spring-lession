package com.demo.respose.utils

;

import com4j.*;

/**
 * Dual interface of extensions Visio gives to a control contained in a Visio Document.
 */
@IID("{000D0D0E-0000-0000-C000-000000000046}")
public interface IVExtender extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(7)
  String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(-2147418112) //= 0x80010000. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
    String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-802) //= 0xfffffcde. The runtime will prefer the VTID if present
  @VTID(9)
  Com4jObject object();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147418104) //= 0x80010008. The runtime will prefer the VTID if present
  @VTID(10)
  Com4jObject parent();


  /**
   */

  @DISPID(-801) //= 0xfffffcdf. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   */

  @DISPID(-804) //= 0xfffffcdc. The runtime will prefer the VTID if present
  @VTID(12)
  void index();


  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(-2147417856) //= 0x80010100. The runtime will prefer the VTID if present
  @VTID(13)
  IVShape shape();


  /**
   */

  @DISPID(-2147417811) //= 0x8001012d. The runtime will prefer the VTID if present
  @VTID(14)
  void voidGroup();


  /**
   */

  @DISPID(-2147417810) //= 0x8001012e. The runtime will prefer the VTID if present
  @VTID(15)
  void bringForward();


  /**
   */

  @DISPID(-2147417809) //= 0x8001012f. The runtime will prefer the VTID if present
  @VTID(16)
  void bringToFront();


  /**
   */

  @DISPID(-2147417808) //= 0x80010130. The runtime will prefer the VTID if present
  @VTID(17)
  void convertToGroup();


  /**
   */

  @DISPID(-2147417804) //= 0x80010134. The runtime will prefer the VTID if present
  @VTID(18)
  void sendBackward();


  /**
   */

  @DISPID(-2147417803) //= 0x80010135. The runtime will prefer the VTID if present
  @VTID(19)
  void sendToBack();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type IVDocument
   */

  @DISPID(-2147417812) //= 0x8001012c. The runtime will prefer the VTID if present
  @VTID(20)
  IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ShapeParent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417800) //= 0x80010138. The runtime will prefer the VTID if present
  @VTID(21)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject shapeParent();


  /**
   * <p>
   * Returns Visio Application instance hosting the object.
   * </p>
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type IVApplication
   */

  @DISPID(-2147417855) //= 0x80010101. The runtime will prefer the VTID if present
  @VTID(22)
  

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Master"
   * </p>
   * @return  Returns a value of type IVMaster
   */

  @DISPID(-2147417835) //= 0x80010115. The runtime will prefer the VTID if present
  @VTID(23)
  IVMaster master();


  /**
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @param localeSpecificCellName Mandatory java.lang.String parameter.
   * @return  Returns a value of type IVCell
   */

  @DISPID(-2147417843) //= 0x8001010d. The runtime will prefer the VTID if present
  @VTID(24)
  IVCell cells(
    String localeSpecificCellName);


  /**
   * <p>
   * Getter method for the COM property "CellsSRC"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param column Mandatory short parameter.
   * @return  Returns a value of type IVCell
   */

  @DISPID(-2147417842) //= 0x8001010e. The runtime will prefer the VTID if present
  @VTID(25)
  IVCell cellsSRC(
    short section,
    short row,
    short column);


  /**
   * <p>
   * Getter method for the COM property "Data1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417841) //= 0x8001010f. The runtime will prefer the VTID if present
  @VTID(26)
  String data1();


  /**
   * <p>
   * Setter method for the COM property "Data1"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417841) //= 0x8001010f. The runtime will prefer the VTID if present
  @VTID(27)
  void data1(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Data2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417840) //= 0x80010110. The runtime will prefer the VTID if present
  @VTID(28)
  String data2();


  /**
   * <p>
   * Setter method for the COM property "Data2"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417840) //= 0x80010110. The runtime will prefer the VTID if present
  @VTID(29)
  void data2(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Data3"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417839) //= 0x80010111. The runtime will prefer the VTID if present
  @VTID(30)
  String data3();


  /**
   * <p>
   * Setter method for the COM property "Data3"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417839) //= 0x80010111. The runtime will prefer the VTID if present
  @VTID(31)
  void data3(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "Help"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417838) //= 0x80010112. The runtime will prefer the VTID if present
  @VTID(32)
  String help();


  /**
   * <p>
   * Setter method for the COM property "Help"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417838) //= 0x80010112. The runtime will prefer the VTID if present
  @VTID(33)
  void help(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "NameID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417852) //= 0x80010104. The runtime will prefer the VTID if present
  @VTID(34)
  String nameID();


  /**
   */

  @DISPID(-2147417847) //= 0x80010109. The runtime will prefer the VTID if present
  @VTID(35)
  void shapeCopy();


  /**
   */

  @DISPID(-2147417846) //= 0x8001010a. The runtime will prefer the VTID if present
  @VTID(36)
  void shapeCut();


  /**
   */

  @DISPID(-2147417845) //= 0x8001010b. The runtime will prefer the VTID if present
  @VTID(37)
  void shapeDelete();


  /**
   */

  @DISPID(-2147417844) //= 0x8001010c. The runtime will prefer the VTID if present
  @VTID(38)
  void voidShapeDuplicate();


  /**
   * <p>
   * Getter method for the COM property "RowCount"
   * </p>
   * @param section Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417832) //= 0x80010118. The runtime will prefer the VTID if present
  @VTID(39)
  short rowCount(
    short section);


  /**
   * @param section Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417831) //= 0x80010119. The runtime will prefer the VTID if present
  @VTID(40)
  short addSection(
    short section);


  /**
   * @param section Mandatory short parameter.
   */

  @DISPID(-2147417830) //= 0x8001011a. The runtime will prefer the VTID if present
  @VTID(41)
  void deleteSection(
    short section);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param rowTag Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417829) //= 0x8001011b. The runtime will prefer the VTID if present
  @VTID(42)
  short addRow(
    short section,
    short row,
    short rowTag);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   */

  @DISPID(-2147417828) //= 0x8001011c. The runtime will prefer the VTID if present
  @VTID(43)
  void deleteRow(
    short section,
    short row);


  /**
   * <p>
   * Getter method for the COM property "RowsCellCount"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417827) //= 0x8001011d. The runtime will prefer the VTID if present
  @VTID(44)
  short rowsCellCount(
    short section,
    short row);


  /**
   * <p>
   * Getter method for the COM property "RowType"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417826) //= 0x8001011e. The runtime will prefer the VTID if present
  @VTID(45)
  short rowType(
    short section,
    short row);


  /**
   * <p>
   * Setter method for the COM property "RowType"
   * </p>
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(-2147417826) //= 0x8001011e. The runtime will prefer the VTID if present
  @VTID(46)
  void rowType(
    short section,
    short row,
    short lpi2Ret);


  /**
   * @param xPos Mandatory double parameter.
   * @param yPos Mandatory double parameter.
   */

  @DISPID(-2147417825) //= 0x8001011f. The runtime will prefer the VTID if present
  @VTID(47)
  void setCenter(
    double xPos,
    double yPos);


  /**
   * <p>
   * Getter method for the COM property "Connects"
   * </p>
   * @return  Returns a value of type IVConnects
   */

  @DISPID(-2147417822) //= 0x80010122. The runtime will prefer the VTID if present
  @VTID(48)
  IVConnects connects();


  @VTID(48)
  @ReturnValue(defaultPropertyThrough={IVConnects.class})
  IVConnect connects(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ShapeIndex16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(-2147417821) //= 0x80010123. The runtime will prefer the VTID if present
  @VTID(49)
  short shapeIndex16();


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417820) //= 0x80010124. The runtime will prefer the VTID if present
  @VTID(50)
  String style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417820) //= 0x80010124. The runtime will prefer the VTID if present
  @VTID(51)
  void style(
    String lpbstrRet);


  /**
   * <p>
   * Setter method for the COM property "StyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417816) //= 0x80010128. The runtime will prefer the VTID if present
  @VTID(52)
  void styleKeepFmt(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "LineStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417819) //= 0x80010125. The runtime will prefer the VTID if present
  @VTID(53)
  String lineStyle();


  /**
   * <p>
   * Setter method for the COM property "LineStyle"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417819) //= 0x80010125. The runtime will prefer the VTID if present
  @VTID(54)
  void lineStyle(
    String lpbstrRet);


  /**
   * <p>
   * Setter method for the COM property "LineStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417815) //= 0x80010129. The runtime will prefer the VTID if present
  @VTID(55)
  void lineStyleKeepFmt(
    String rhs);


  /**
   * <p>
   * Getter method for the COM property "FillStyle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417818) //= 0x80010126. The runtime will prefer the VTID if present
  @VTID(56)
  String fillStyle();


  /**
   * <p>
   * Setter method for the COM property "FillStyle"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417818) //= 0x80010126. The runtime will prefer the VTID if present
  @VTID(57)
  void fillStyle(
    String lpbstrRet);


  /**
   * <p>
   * Setter method for the COM property "FillStyleKeepFmt"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417814) //= 0x8001012a. The runtime will prefer the VTID if present
  @VTID(58)
  void fillStyleKeepFmt(
    String rhs);


  /**
   * @param fileName Mandatory java.lang.String parameter.
   */

  @DISPID(-2147417799) //= 0x80010139. The runtime will prefer the VTID if present
  @VTID(59)
  void export(
    String fileName);


  /**
   * <p>
   * Getter method for the COM property "UniqueID"
   * </p>
   * @param fUniqueID Mandatory short parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417795) //= 0x8001013d. The runtime will prefer the VTID if present
  @VTID(60)
  String uniqueID(
    short fUniqueID);


  /**
   * <p>
   * Getter method for the COM property "ContainingPage"
   * </p>
   * @return  Returns a value of type IVPage
   */

  @DISPID(-2147417794) //= 0x8001013e. The runtime will prefer the VTID if present
  @VTID(61)
  IVPage containingPage();


  /**
   * <p>
   * Getter method for the COM property "ContainingMaster"
   * </p>
   * @return  Returns a value of type IVMaster
   */

  @DISPID(-2147417793) //= 0x8001013f. The runtime will prefer the VTID if present
  @VTID(62)
  IVMaster containingMaster();


  /**
   * <p>
   * Getter method for the COM property "ContainingShape"
   * </p>
   * @return  Returns a value of type IVShape
   */

  @DISPID(-2147417792) //= 0x80010140. The runtime will prefer the VTID if present
  @VTID(63)
  IVShape containingShape();


  /**
   * <p>
   * Getter method for the COM property "SectionExists"
   * </p>
   * @param section Mandatory short parameter.
   * @param fExistsLocally Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417791) //= 0x80010141. The runtime will prefer the VTID if present
  @VTID(64)
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
   * @return  Returns a value of type short
   */

  @DISPID(-2147417790) //= 0x80010142. The runtime will prefer the VTID if present
  @VTID(65)
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
   * @return  Returns a value of type short
   */

  @DISPID(-2147417789) //= 0x80010143. The runtime will prefer the VTID if present
  @VTID(66)
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
   * @return  Returns a value of type short
   */

  @DISPID(-2147417788) //= 0x80010144. The runtime will prefer the VTID if present
  @VTID(67)
  short cellsSRCExists(
    short section,
    short row,
    short column,
    short fExistsLocally);


  /**
   * <p>
   * Getter method for the COM property "LayerCount"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(-2147417787) //= 0x80010145. The runtime will prefer the VTID if present
  @VTID(68)
  short layerCount();


  /**
   * <p>
   * Getter method for the COM property "Layer"
   * </p>
   * @param index Mandatory short parameter.
   * @return  Returns a value of type IVLayer
   */

  @DISPID(-2147417786) //= 0x80010146. The runtime will prefer the VTID if present
  @VTID(69)
  IVLayer layer(
    short index);


  /**
   * @param section Mandatory short parameter.
   * @param rowName Mandatory java.lang.String parameter.
   * @param rowTag Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417785) //= 0x80010147. The runtime will prefer the VTID if present
  @VTID(70)
  short addNamedRow(
    short section,
    String rowName,
    short rowTag);


  /**
   * @param section Mandatory short parameter.
   * @param row Mandatory short parameter.
   * @param rowTag Mandatory short parameter.
   * @param rowCount Mandatory short parameter.
   * @return  Returns a value of type short
   */

  @DISPID(-2147417784) //= 0x80010148. The runtime will prefer the VTID if present
  @VTID(71)
  short addRows(
    short section,
    short row,
    short rowTag,
    short rowCount);


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of type IVEventList
   */

  @DISPID(-2147417783) //= 0x80010149. The runtime will prefer the VTID if present
  @VTID(72)
  

    IVEventList eventList();


  @VTID(72)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
  IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "PersistsEvents"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(-2147417782) //= 0x8001014a. The runtime will prefer the VTID if present
  @VTID(73)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "ClassID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147417770) //= 0x80010156. The runtime will prefer the VTID if present
  @VTID(74)
  String classID();


  /**
   * <p>
   * Getter method for the COM property "ShapeObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(-2147417768) //= 0x80010158. The runtime will prefer the VTID if present
  @VTID(75)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject shapeObject();


  /**
   * @return  Returns a value of type IVWindow
   */

  @DISPID(-2147417766) //= 0x8001015a. The runtime will prefer the VTID if present
  @VTID(76)
  IVWindow openSheetWindow();


  /**
   * <p>
   * Getter method for the COM property "ShapeID16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(-2147417765) //= 0x8001015b. The runtime will prefer the VTID if present
  @VTID(77)
  short shapeID16();


          /**
           * <p>
           * Getter method for the COM property "FromConnects"
           * </p>
           * @return  Returns a value of type IVConnects
           */

          @DISPID(-2147417759) //= 0x80010161. The runtime will prefer the VTID if present
          @VTID(82)
          IVConnects fromConnects();


          @VTID(82)
          @ReturnValue(defaultPropertyThrough={IVConnects.class})
          IVConnect fromConnects(
            int index);

          /**
           * @param flags Mandatory short parameter.
           * @param lpr8Left Mandatory Holder<Double> parameter.
           * @param lpr8Bottom Mandatory Holder<Double> parameter.
           * @param lpr8Right Mandatory Holder<Double> parameter.
           * @param lpr8Top Mandatory Holder<Double> parameter.
           */

          @DISPID(-2147417757) //= 0x80010163. The runtime will prefer the VTID if present
          @VTID(83)
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
           * @return  Returns a value of type short
           */

          @DISPID(-2147417756) //= 0x80010164. The runtime will prefer the VTID if present
          @VTID(84)
          short hitTest(
            double xPos,
            double yPos,
            double tolerance);


          /**
           * <p>
           * Getter method for the COM property "Hyperlink"
           * </p>
           * @return  Returns a value of type IVHyperlink
           */

          @DISPID(-2147417755) //= 0x80010165. The runtime will prefer the VTID if present
          @VTID(85)
          

    IVHyperlink hyperlink();


          /**
           * <p>
           * Getter method for the COM property "ProgID"
           * </p>
           * @return  Returns a value of type java.lang.String
           */

          @DISPID(-2147417754) //= 0x80010166. The runtime will prefer the VTID if present
          @VTID(86)
          String progID();


          /**
           * <p>
           * Getter method for the COM property "ObjectIsInherited"
           * </p>
           * @return  Returns a value of type short
           */

          @DISPID(-2147417753) //= 0x80010167. The runtime will prefer the VTID if present
          @VTID(87)
          short objectIsInherited();


          /**
           * <p>
           * Getter method for the COM property "ShapeID"
           * </p>
           * @return  Returns a value of type int
           */

          @DISPID(-2147417749) //= 0x8001016b. The runtime will prefer the VTID if present
          @VTID(88)
          int shapeID();


          /**
           * <p>
           * Getter method for the COM property "ShapeIndex"
           * </p>
           * @return  Returns a value of type int
           */

          @DISPID(-2147417748) //= 0x8001016c. The runtime will prefer the VTID if present
          @VTID(89)
          int shapeIndex();


          /**
           * <p>
           * Returns the created group shape
           * </p>
           * @return  Returns a value of type IVShape
           */

          @DISPID(-2147417726) //= 0x80010182. The runtime will prefer the VTID if present
          @VTID(90)
          IVShape group();


          /**
           * <p>
           * Returns the duplicated shape
           * </p>
           * @return  Returns a value of type IVShape
           */

          @DISPID(-2147417725) //= 0x80010183. The runtime will prefer the VTID if present
          @VTID(91)
          IVShape shapeDuplicate();


          /**
           * @param flags Mandatory short parameter.
           * @param lpr8Left Mandatory Holder<Double> parameter.
           * @param lpr8Bottom Mandatory Holder<Double> parameter.
           * @param lpr8Right Mandatory Holder<Double> parameter.
           * @param lpr8Top Mandatory Holder<Double> parameter.
           */

          @DISPID(-2147417724) //= 0x80010184. The runtime will prefer the VTID if present
          @VTID(92)
          void visualBoundingBox(
            short flags,
            Holder<Double> lpr8Left,
            Holder<Double> lpr8Bottom,
            Holder<Double> lpr8Right,
            Holder<Double> lpr8Top);


          // Properties:
        }

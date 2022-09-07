package com.demo.respose.utils

;

import com4j.*;

@IID("{000D070E-0000-0000-C000-000000000046}")
public interface IVStyle extends Com4jObject {
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

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(7)
 

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Returns visObjTypeStyle (19).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  short objectType();


  /**
   * <p>
   * Style's locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  String name();


  /**
   * <p>
   * Style's locale specific name.
   * </p>
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param localeSpecificCellName Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void name(
    String localeSpecificCellName);


  /**
   * <p>
   * Getter method for the COM property "Index16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  short index16();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(13)
 

    IVDocument document();


  /**
   * <p>
   * Locale specific name of style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "BasedOn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(14)
  String basedOn();


  /**
   * <p>
   * Locale specific name of style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "BasedOn"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(15)
  void basedOn(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of text style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "TextBasedOn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(16)
  String textBasedOn();


  /**
   * <p>
   * Locale specific name of text style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "TextBasedOn"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(17)
  void textBasedOn(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of line style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "LineBasedOn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(18)
  String lineBasedOn();


  /**
   * <p>
   * Locale specific name of line style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "LineBasedOn"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  void lineBasedOn(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Locale specific name of fill style applied to this shape.
   * </p>
   * <p>
   * Getter method for the COM property "FillBasedOn"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(20)
  String fillBasedOn();


  /**
   * <p>
   * Locale specific name of fill style applied to this shape.
   * </p>
   * <p>
   * Setter method for the COM property "FillBasedOn"
   * </p>
   * @param lpLocaleSpecificStyleName Mandatory java.lang.String parameter.
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(21)
  void fillBasedOn(
    String lpLocaleSpecificStyleName);


  /**
   * <p>
   * Getter method for the COM property "IncludesText"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(22)
  short includesText();


  /**
   * <p>
   * Setter method for the COM property "IncludesText"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(23)
  void includesText(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "IncludesLine"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(24)
  short includesLine();


  /**
   * <p>
   * Setter method for the COM property "IncludesLine"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(25)
  void includesLine(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "IncludesFill"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(26)
  short includesFill();


  /**
   * <p>
   * Setter method for the COM property "IncludesFill"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(27)
  void includesFill(
    short lpi2Ret);


  /**
   * <p>
   * Returns cell of this style with given locale specific name.
   * </p>
   * <p>
   * Getter method for the COM property "Cells"
   * </p>
   * @param localeSpecificCellName Mandatory java.lang.String parameter.
   * @return  Returns a value of typeIVCell
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(28)
 IVCell cells(
    String localeSpecificCellName);


  /**
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(29)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of typeIVEventList
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
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

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(31)
  short persistsEvents();


  /**
   * <p>
   * Getter method for the COM property "ID16"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(32)
  short iD16();


          /**
           * <p>
           * Getter method for the COM property "ID"
           * </p>
           * @return  Returns a value of type int
           */

          @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
          @VTID(37)
          int id();


          /**
           * <p>
           * Getter method for the COM property "Index"
           * </p>
           * @return  Returns a value of type int
           */

          @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
          @VTID(38)
          int index();


          /**
           * <p>
           * Getter method for the COM property "Section"
           * </p>
           * @param index Mandatory short parameter.
           * @return  Returns a value of typeIVSection
           */

          @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
          @VTID(39)
         

    IVSection section(
            short index);


          /**
           * <p>
           * Getter method for the COM property "Hidden"
           * </p>
           * @return  Returns a value of type short
           */

          @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
          @VTID(40)
          short hidden();


          /**
           * <p>
           * Setter method for the COM property "Hidden"
           * </p>
           * @param lpi2Ret Mandatory short parameter.
           */

          @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
          @VTID(41)
          void hidden(
            short lpi2Ret);


          /**
           * <p>
           * Style's locale independent name.
           * </p>
           * <p>
           * Getter method for the COM property "NameU"
           * </p>
           * @return  Returns a value of type java.lang.String
           */

          @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
          @VTID(42)
          String nameU();


          /**
           * <p>
           * Style's locale independent name.
           * </p>
           * <p>
           * Setter method for the COM property "NameU"
           * </p>
           * @param lpLocaleIndependentName Mandatory java.lang.String parameter.
           */

          @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
          @VTID(43)
          void nameU(
            String lpLocaleIndependentName);


          /**
           * <p>
           * Returns cell of this style with given locale independent name.
           * </p>
           * <p>
           * Getter method for the COM property "CellsU"
           * </p>
           * @param localeIndependentCellName Mandatory java.lang.String parameter.
           * @return  Returns a value of typeIVCell
           */

          @DISPID(27) //= 0x1b. The runtime will prefer the VTID if present
          @VTID(44)
         IVCell cellsU(
            String localeIndependentCellName);


          /**
           * <p>
           * Returns whether this style has cell with given locale specific name.
           * </p>
           * <p>
           * Getter method for the COM property "CellExists"
           * </p>
           * @param localeSpecificCellName Mandatory java.lang.String parameter.
           * @param fExistsLocally Mandatory short parameter.
           * @return  Returns a value of type short
           */

          @DISPID(28) //= 0x1c. The runtime will prefer the VTID if present
          @VTID(45)
          short cellExists(
            String localeSpecificCellName,
            short fExistsLocally);


          /**
           * <p>
           * Returns whether this shape has cell with given locale independent name.
           * </p>
           * <p>
           * Getter method for the COM property "CellExistsU"
           * </p>
           * @param localeIndependentCellName Mandatory java.lang.String parameter.
           * @param fExistsLocally Mandatory short parameter.
           * @return  Returns a value of type short
           */

          @DISPID(29) //= 0x1d. The runtime will prefer the VTID if present
          @VTID(46)
          short cellExistsU(
            String localeIndependentCellName,
            short fExistsLocally);


            /**
             * <p>
             * Getter method for the COM property "CellsSRC"
             * </p>
             * @param section Mandatory short parameter.
             * @param row Mandatory short parameter.
             * @param column Mandatory short parameter.
             * @return  Returns a value of type IVCell
             */

            @DISPID(1610743849) //= 0x60020029. The runtime will prefer the VTID if present
            @VTID(48)
            IVCell cellsSRC(
              short section,
              short row,
              short column);


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

            @DISPID(1610743850) //= 0x6002002a. The runtime will prefer the VTID if present
            @VTID(49)
            short cellsSRCExists(
              short section,
              short row,
              short column,
              short fExistsLocally);


            // Properties:
          }

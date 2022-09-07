package com.demo.respose.utils

;

import com4j.*;

@IID("{000D071A-0000-0000-C000-000000000046}")
public interface IVEvent extends Com4jObject {
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

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
 

    IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "EventList"
   * </p>
   * @return  Returns a value of typeIVEventList
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
 

    IVEventList eventList();


  @VTID(8)
  @ReturnValue(defaultPropertyThrough={IVEventList.class})
 IVEvent eventList(
    short index);

  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  short index();


  /**
   * <p>
   * Getter method for the COM property "Event"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(10)
  @DefaultMethod
  short event();


  /**
   * <p>
   * Setter method for the COM property "Event"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  void event(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Action"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(12)
  short action();


  /**
   * <p>
   * Setter method for the COM property "Action"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  void action(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Target"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(14)
  String target();


  /**
   * <p>
   * Setter method for the COM property "Target"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(15)
  void target(
    String lpbstrRet);


  /**
   * <p>
   * Getter method for the COM property "TargetArgs"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(16)
  String targetArgs();


  /**
   * <p>
   * Setter method for the COM property "TargetArgs"
   * </p>
   * @param lpbstrRet Mandatory java.lang.String parameter.
   */

  @DISPID(6) //= 0x6. The runtime will prefer the VTID if present
  @VTID(17)
  void targetArgs(
    String lpbstrRet);


  /**
   * @param contextString Mandatory java.lang.String parameter.
   */

  @DISPID(7) //= 0x7. The runtime will prefer the VTID if present
  @VTID(18)
  void trigger(
    String contextString);


  /**
   */

  @DISPID(8) //= 0x8. The runtime will prefer the VTID if present
  @VTID(19)
  void delete();


  /**
   * <p>
   * Returns visObjTypeEvent (33).
   * </p>
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(9) //= 0x9. The runtime will prefer the VTID if present
  @VTID(20)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(21)
  int id();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(22)
  short enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(23)
  void enabled(
    short lpi2Ret);


  /**
   * <p>
   * Getter method for the COM property "Persistable"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(24)
  short persistable();


  /**
   * <p>
   * Getter method for the COM property "Persistent"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(25)
  short persistent();


  /**
   * <p>
   * Setter method for the COM property "Persistent"
   * </p>
   * @param lpi2Ret Mandatory short parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(26)
  void persistent(
    short lpi2Ret);


  /**
   * @return  Returns a value of type int[]
   */

  @DISPID(1610743828) //= 0x60020014. The runtime will prefer the VTID if present
  @VTID(27)
  int[] getFilterObjects();


    /**
     * @return  Returns a value of type int[]
     */

    @DISPID(1610743830) //= 0x60020016. The runtime will prefer the VTID if present
    @VTID(29)
    int[] getFilterCommands();


      /**
       * @return  Returns a value of type short[]
       */

      @DISPID(1610743832) //= 0x60020018. The runtime will prefer the VTID if present
      @VTID(31)
      short[] getFilterSRC();


        /**
         * @return  Returns a value of type int[]
         */

        @DISPID(1610743834) //= 0x6002001a. The runtime will prefer the VTID if present
        @VTID(33)
        int[] getFilterActions();


          // Properties:
        }

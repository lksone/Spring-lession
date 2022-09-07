package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0741-0000-0000-C000-000000000046}")
public interface IVReplaceShapesEvent extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of typeIVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
 IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "ReplacementMaster"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  Com4jObject replacementMaster();


  /**
   * <p>
   * Getter method for the COM property "SelectionSource"
   * </p>
   * @return  Returns a value of typeIVSelection
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
 IVSelection selectionSource();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={IVSelection.class})
 IVShape selectionSource(
    int index);

  /**
   * <p>
   * Getter method for the COM property "ReplaceFlags"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int replaceFlags();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  short stat();


  // Properties:
}

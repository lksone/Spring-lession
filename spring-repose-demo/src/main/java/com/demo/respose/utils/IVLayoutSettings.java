package com.demo.respose.utils

;

import com4j.Com4jObject;
import com4j.DISPID;
import com4j.IID;
import com4j.VTID;

@IID("{000D0749-0000-0000-C000-000000000046}")
public interface IVLayoutSettings extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type IVApplication
   */

  @DISPID(1610743808) //= 0x60020000. The runtime will prefer the VTID if present
  @VTID(7)
  IVApplication application();


  /**
   * <p>
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "Algo"
   * </p>
   * @return  Returns a value of type VisLayoutAlgorithm
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  

    VisLayoutAlgorithm algo();


  /**
   * <p>
   * Setter method for the COM property "Algo"
   * </p>
   * @param pAlgo Mandatory VisLayoutAlgorithm parameter.
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(11)
  void algo(
    VisLayoutAlgorithm pAlgo);


  // Properties:
}

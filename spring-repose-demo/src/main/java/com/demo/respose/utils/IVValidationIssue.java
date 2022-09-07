package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0740-0000-0000-C000-000000000046}")
public interface IVValidationIssue extends Com4jObject {
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
   * Getter method for the COM property "Stat"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743809) //= 0x60020001. The runtime will prefer the VTID if present
  @VTID(8)
  short stat();


  /**
   * <p>
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of typeIVDocument
   */

  @DISPID(1610743810) //= 0x60020002. The runtime will prefer the VTID if present
  @VTID(9)
 IVDocument document();


  /**
   * <p>
   * Getter method for the COM property "ObjectType"
   * </p>
   * @return  Returns a value of type short
   */

  @DISPID(1610743811) //= 0x60020003. The runtime will prefer the VTID if present
  @VTID(10)
  short objectType();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int id();


  /**
   * <p>
   * Getter method for the COM property "TargetPage"
   * </p>
   * @return  Returns a value of typeIVPage
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
 IVPage targetPage();


  /**
   * <p>
   * Getter method for the COM property "TargetPageID"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  int targetPageID();


  /**
   * <p>
   * Getter method for the COM property "TargetShape"
   * </p>
   * @return  Returns a value of typeIVShape
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
 IVShape targetShape();


  /**
   * <p>
   * Getter method for the COM property "Ignored"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(15)
  @DefaultMethod
  boolean ignored();


  /**
   * <p>
   * Setter method for the COM property "Ignored"
   * </p>
   * @param isIgnored Mandatory boolean parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(16)
  @DefaultMethod
  void ignored(
    boolean isIgnored);


  /**
   * <p>
   * Getter method for the COM property "Rule"
   * </p>
   * @return  Returns a value of typeIVValidationRule
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
 IVValidationRule rule();


  /**
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  void delete();


  // Properties:
}

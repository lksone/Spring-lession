package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0744-0000-0000-C000-000000000046}")
public interface IVComment extends Com4jObject {
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
   * Getter method for the COM property "AssociatedObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  Com4jObject associatedObject();


  /**
   * <p>
   * Getter method for the COM property "CreateDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Date createDate();


  /**
   * <p>
   * Getter method for the COM property "EditDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Date editDate();


  /**
   * <p>
   * Getter method for the COM property "Collapsed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  boolean collapsed();


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
  String text();


  /**
   * <p>
   * Getter method for the COM property "AuthorName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  String authorName();


  /**
   * <p>
   * Getter method for the COM property "AuthorSipAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743818) //= 0x6002000a. The runtime will prefer the VTID if present
  @VTID(17)
  String authorSipAddress();


  /**
   * <p>
   * Getter method for the COM property "AuthorSMTPAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743819) //= 0x6002000b. The runtime will prefer the VTID if present
  @VTID(18)
  String authorSMTPAddress();


  /**
   * <p>
   * Getter method for the COM property "AuthorInitials"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610743820) //= 0x6002000c. The runtime will prefer the VTID if present
  @VTID(19)
  String authorInitials();


  /**
   * <p>
   * Setter method for the COM property "Collapsed"
   * </p>
   * @param pCollapsed Mandatory boolean parameter.
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(20)
  void collapsed(
    boolean pCollapsed);


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(21)
  void text(
    String pbstr);


  /**
   */

  @DISPID(1610743823) //= 0x6002000f. The runtime will prefer the VTID if present
  @VTID(22)
  void delete();


  // Properties:
}

package com.demo.respose.utils

;

import com4j.*;

@IID("{000D0739-0000-0000-C000-000000000046}")
public interface IVServerPublishOptions extends Com4jObject {
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
   * Getter method for the COM property "IsPublishedPage"
   * </p>
   * @param pageName Mandatory java.lang.String parameter.
   * @param flags MandatoryVisLangFlags parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isPublishedPage(
    String pageName,
   VisLangFlags flags);


  /**
   * @param pageName Mandatory java.lang.String parameter.
   * @param flags MandatoryVisLangFlags parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  void includePage(
    String pageName,
   VisLangFlags flags);


  /**
   * @param pageName Mandatory java.lang.String parameter.
   * @param flags MandatoryVisLangFlags parameter.
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
  void excludePage(
    String pageName,
   VisLangFlags flags);


          // Properties:
        }

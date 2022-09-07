package com.demo.respose.utils

;

import com4j.*;

@IID("{000D073B-0000-0000-C000-000000000046}")
public interface IVValidationRuleSets extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param nameUOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of typeIVValidationRuleSet
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
 IVValidationRuleSet item(
    @MarshalAs(NativeType.VARIANT) Object nameUOrIndex);


  /**
   * <p>
   * Getter method for the COM property "ItemFromID"
   * </p>
   * @param ruleID Mandatory int parameter.
   * @return  Returns a value of typeIVValidationRuleSet
   */

  @DISPID(1610743814) //= 0x60020006. The runtime will prefer the VTID if present
  @VTID(13)
 IVValidationRuleSet itemFromID(
    int ruleID);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param nameU Mandatory java.lang.String parameter.
   * @return  Returns a value of typeIVValidationRuleSet
   */

  @DISPID(1610743816) //= 0x60020008. The runtime will prefer the VTID if present
  @VTID(15)
 IVValidationRuleSet add(
    String nameU);


  /**
   * @param ruleSet MandatoryIVValidationRuleSet parameter.
   * @param nameU Optional parameter. Default value is ""
   * @return  Returns a value of typeIVValidationRuleSet
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
 IVValidationRuleSet addCopy(
   IVValidationRuleSet ruleSet,
    @Optional @DefaultValue("") String nameU);


  // Properties:
}

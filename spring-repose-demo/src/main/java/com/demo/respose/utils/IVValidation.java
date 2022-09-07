package com.demo.respose.utils

;

import com.*;
import com4j.*;

@IID("{000D073A-0000-0000-C000-000000000046}")
public interface IVValidation extends Com4jObject {
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
   * Getter method for the COM property "Document"
   * </p>
   * @return  Returns a value of type IVDocument
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
   * Getter method for the COM property "LastValidatedDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(1610743812) //= 0x60020004. The runtime will prefer the VTID if present
  @VTID(11)
  java.util.Date lastValidatedDate();


  /**
   * <p>
   * Getter method for the COM property "ShowIgnoredIssues"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(12)
  boolean showIgnoredIssues();


  /**
   * <p>
   * Setter method for the COM property "ShowIgnoredIssues"
   * </p>
   * @param isShown Mandatory boolean parameter.
   */

  @DISPID(1610743813) //= 0x60020005. The runtime will prefer the VTID if present
  @VTID(13)
  void showIgnoredIssues(
    boolean isShown);


  /**
   * <p>
   * Getter method for the COM property "RuleSets"
   * </p>
   * @return  Returns a value of type IVValidationRuleSets
   */

  @DISPID(1610743815) //= 0x60020007. The runtime will prefer the VTID if present
  @VTID(14)
  

    IVValidationRuleSets ruleSets();


  @VTID(14)
  @ReturnValue(defaultPropertyThrough={IVValidationRuleSets.class})
  

    IVValidationRuleSet ruleSets(
    @MarshalAs(NativeType.VARIANT) Object nameUOrIndex);

  /**
   * <p>
   * Getter method for the COM property "Issues"
   * </p>
   * @return  Returns a value of type IVValidationIssues
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(15)
  @DefaultMethod
  

    IVValidationIssues issues();


  @VTID(15)
  @ReturnValue(defaultPropertyThrough={IVValidationIssues.class})
  

    IVValidationIssue issues(
    int index);

  /**
   * @param ruleSet Optional parameter. Default value is unprintable.
   * @param flags Optional parameter. Default value is 0
   */

  @DISPID(1610743817) //= 0x60020009. The runtime will prefer the VTID if present
  @VTID(16)
  void validate(
    @Optional IVValidationRuleSet ruleSet,
    @Optional VisValidationFlags flags);


  // Properties:
}

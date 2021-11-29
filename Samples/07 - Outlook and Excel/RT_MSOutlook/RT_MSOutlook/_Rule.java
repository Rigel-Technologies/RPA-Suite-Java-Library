package RT_MSOutlook  ;

import com4j.*;

@IID("{000630CD-0000-0000-C000-000000000046}")
public interface _Rule extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  RT_MSOutlook._Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  RT_MSOutlook.OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  RT_MSOutlook._NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(12)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "ExecutionOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64267) //= 0xfb0b. The runtime will prefer the VTID if present
  @VTID(13)
  int executionOrder();


  /**
   * <p>
   * Setter method for the COM property "ExecutionOrder"
   * </p>
   * @param executionOrder Mandatory int parameter.
   */

  @DISPID(64267) //= 0xfb0b. The runtime will prefer the VTID if present
  @VTID(14)
  void executionOrder(
    int executionOrder);


  /**
   * <p>
   * Getter method for the COM property "RuleType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlRuleType
   */

  @DISPID(64268) //= 0xfb0c. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.OlRuleType ruleType();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(16)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(17)
  void enabled(
    boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "IsLocalRule"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64269) //= 0xfb0d. The runtime will prefer the VTID if present
  @VTID(18)
  boolean isLocalRule();


  /**
   * @param showProgress Optional parameter. Default value is com4j.Variant.getMissing()
   * @param folder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param includeSubfolders Optional parameter. Default value is com4j.Variant.getMissing()
   * @param ruleExecuteOption Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(64270) //= 0xfb0e. The runtime will prefer the VTID if present
  @VTID(19)
  void execute(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showProgress,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object folder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object includeSubfolders,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object ruleExecuteOption);


  /**
   * <p>
   * Getter method for the COM property "Actions"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleActions
   */

  @DISPID(64272) //= 0xfb10. The runtime will prefer the VTID if present
  @VTID(20)
  RT_MSOutlook._RuleActions actions();


  /**
   * <p>
   * Getter method for the COM property "Conditions"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleConditions
   */

  @DISPID(64297) //= 0xfb29. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook._RuleConditions conditions();


  /**
   * <p>
   * Getter method for the COM property "Exceptions"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleConditions
   */

  @DISPID(64307) //= 0xfb33. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook._RuleConditions exceptions();


  // Properties:
}

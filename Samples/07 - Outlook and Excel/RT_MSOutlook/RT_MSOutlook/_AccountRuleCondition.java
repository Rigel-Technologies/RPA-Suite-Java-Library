package RT_MSOutlook  ;

import com4j.*;

@IID("{000630DB-0000-0000-C000-000000000046}")
public interface _AccountRuleCondition extends Com4jObject {
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
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(12)
  void enabled(
    boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "ConditionType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlRuleConditionType
   */

  @DISPID(64298) //= 0xfb2a. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.OlRuleConditionType conditionType();


  /**
   * <p>
   * Getter method for the COM property "Account"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Account
   */

  @DISPID(64209) //= 0xfad1. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook._Account account();


  /**
   * <p>
   * Setter method for the COM property "Account"
   * </p>
   * @param account Mandatory RT_MSOutlook._Account parameter.
   */

  @DISPID(64209) //= 0xfad1. The runtime will prefer the VTID if present
  @VTID(15)
  void account(
    RT_MSOutlook._Account account);


  // Properties:
}

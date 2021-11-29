package RT_MSOutlook  ;

import com4j.*;

@IID("{000630D6-0000-0000-C000-000000000046}")
public interface _MarkAsTaskRuleAction extends Com4jObject {
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
   * Getter method for the COM property "ActionType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlRuleActionType
   */

  @DISPID(64271) //= 0xfb0f. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.OlRuleActionType actionType();


  /**
   * <p>
   * Getter method for the COM property "FlagTo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64292) //= 0xfb24. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String flagTo();


  /**
   * <p>
   * Setter method for the COM property "FlagTo"
   * </p>
   * @param flagTo Mandatory java.lang.String parameter.
   */

  @DISPID(64292) //= 0xfb24. The runtime will prefer the VTID if present
  @VTID(15)
  void flagTo(
    java.lang.String flagTo);


  /**
   * <p>
   * Getter method for the COM property "MarkInterval"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlMarkInterval
   */

  @DISPID(64293) //= 0xfb25. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook.OlMarkInterval markInterval();


  /**
   * <p>
   * Setter method for the COM property "MarkInterval"
   * </p>
   * @param markInterval Mandatory RT_MSOutlook.OlMarkInterval parameter.
   */

  @DISPID(64293) //= 0xfb25. The runtime will prefer the VTID if present
  @VTID(17)
  void markInterval(
    RT_MSOutlook.OlMarkInterval markInterval);


  // Properties:
}

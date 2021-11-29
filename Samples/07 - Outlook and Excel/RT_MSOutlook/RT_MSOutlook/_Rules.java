package RT_MSOutlook  ;

import com4j.*;

@IID("{000630CC-0000-0000-C000-000000000046}")
public interface _Rules extends Com4jObject {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RT_MSOutlook._Rule
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._Rule item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param ruleType Mandatory RT_MSOutlook.OlRuleType parameter.
   * @return  Returns a value of type RT_MSOutlook._Rule
   */

  @DISPID(64266) //= 0xfb0a. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook._Rule create(
    java.lang.String name,
    RT_MSOutlook.OlRuleType ruleType);


  /**
   * @param showProgress Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(14)
  void save(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showProgress);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(82) //= 0x52. The runtime will prefer the VTID if present
  @VTID(15)
  void remove(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "IsRssRulesProcessingEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64533) //= 0xfc15. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isRssRulesProcessingEnabled();


  /**
   * <p>
   * Setter method for the COM property "IsRssRulesProcessingEnabled"
   * </p>
   * @param isRssRulesProcessingEnabled Mandatory boolean parameter.
   */

  @DISPID(64533) //= 0xfc15. The runtime will prefer the VTID if present
  @VTID(17)
  void isRssRulesProcessingEnabled(
    boolean isRssRulesProcessingEnabled);


  // Properties:
}

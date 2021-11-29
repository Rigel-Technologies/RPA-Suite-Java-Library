package RT_MSOutlook  ;

import com4j.*;

@IID("{00063073-0000-0000-C000-000000000046}")
public interface OutlookBarGroup extends Com4jObject {
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

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Shortcuts"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._OutlookBarShortcuts
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook._OutlookBarShortcuts shortcuts();


  /**
   * <p>
   * Getter method for the COM property "ViewType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlOutlookBarViewType
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook.OlOutlookBarViewType viewType();


  /**
   * <p>
   * Setter method for the COM property "ViewType"
   * </p>
   * @param viewType Mandatory RT_MSOutlook.OlOutlookBarViewType parameter.
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(15)
  void viewType(
    RT_MSOutlook.OlOutlookBarViewType viewType);


  // Properties:
}

package RT_MSOutlook  ;

import com4j.*;

@IID("{000630F0-0000-0000-C000-000000000046}")
public interface _NavigationGroup extends Com4jObject {
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
   * Getter method for the COM property "GroupType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlGroupType
   */

  @DISPID(64448) //= 0xfbc0. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.OlGroupType groupType();


  /**
   * <p>
   * Getter method for the COM property "NavigationFolders"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._NavigationFolders
   */

  @DISPID(64449) //= 0xfbc1. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._NavigationFolders navigationFolders();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(14)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64455) //= 0xfbc7. The runtime will prefer the VTID if present
  @VTID(15)
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param position Mandatory int parameter.
   */

  @DISPID(64455) //= 0xfbc7. The runtime will prefer the VTID if present
  @VTID(16)
  void position(
    int position);


  // Properties:
}

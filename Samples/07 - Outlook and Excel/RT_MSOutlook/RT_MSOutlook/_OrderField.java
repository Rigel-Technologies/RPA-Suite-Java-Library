package RT_MSOutlook  ;

import com4j.*;

@IID("{0006309B-0000-0000-C000-000000000046}")
public interface _OrderField extends Com4jObject {
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
   * Getter method for the COM property "ViewXMLSchemaName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String viewXMLSchemaName();


  /**
   * <p>
   * Getter method for the COM property "IsDescending"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64394) //= 0xfb8a. The runtime will prefer the VTID if present
  @VTID(12)
  boolean isDescending();


  /**
   * <p>
   * Setter method for the COM property "IsDescending"
   * </p>
   * @param isDescending Mandatory boolean parameter.
   */

  @DISPID(64394) //= 0xfb8a. The runtime will prefer the VTID if present
  @VTID(13)
  void isDescending(
    boolean isDescending);


  // Properties:
}

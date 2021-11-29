package RT_MSOutlook  ;

import com4j.*;

@IID("{000630FD-0000-0000-C000-000000000046}")
public interface _TimeZone extends Com4jObject {
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
   * Getter method for the COM property "DaylightDesignation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64555) //= 0xfc2b. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String daylightDesignation();


  /**
   * <p>
   * Getter method for the COM property "StandardDesignation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64556) //= 0xfc2c. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String standardDesignation();


  /**
   * <p>
   * Getter method for the COM property "Bias"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64545) //= 0xfc21. The runtime will prefer the VTID if present
  @VTID(14)
  int bias();


  /**
   * <p>
   * Getter method for the COM property "StandardBias"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64546) //= 0xfc22. The runtime will prefer the VTID if present
  @VTID(15)
  int standardBias();


  /**
   * <p>
   * Getter method for the COM property "DaylightBias"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64547) //= 0xfc23. The runtime will prefer the VTID if present
  @VTID(16)
  int daylightBias();


  /**
   * <p>
   * Getter method for the COM property "StandardDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64548) //= 0xfc24. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Date standardDate();


  /**
   * <p>
   * Getter method for the COM property "DaylightDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64549) //= 0xfc25. The runtime will prefer the VTID if present
  @VTID(18)
  java.util.Date daylightDate();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64562) //= 0xfc32. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String id();


  // Properties:
}

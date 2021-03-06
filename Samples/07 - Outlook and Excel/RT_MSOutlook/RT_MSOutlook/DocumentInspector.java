package RT_MSOutlook  ;

import com4j.*;

@IID("{000C0393-0000-0000-C000-000000000046}")
public interface DocumentInspector extends RT_MSOutlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String description();


  /**
   * @param status Mandatory Holder<RT_MSOutlook.MsoDocInspectorStatus> parameter.
   * @param results Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  void inspect(
    Holder<RT_MSOutlook.MsoDocInspectorStatus> status,
    Holder<java.lang.String> results);


  /**
   * @param status Mandatory Holder<RT_MSOutlook.MsoDocInspectorStatus> parameter.
   * @param results Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(12)
  void fix(
    Holder<RT_MSOutlook.MsoDocInspectorStatus> status,
    Holder<java.lang.String> results);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(4) //= 0x4. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}

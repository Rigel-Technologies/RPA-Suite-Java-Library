package RT_MSOutlook  ;

import com4j.*;

@IID("{0006308D-0000-0000-C000-000000000046}")
public interface _Views extends Com4jObject,Iterable<Com4jObject> {
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
   * @return  Returns a value of type RT_MSOutlook.View
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  RT_MSOutlook.View item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param viewType Mandatory RT_MSOutlook.OlViewType parameter.
   * @param saveOption Optional parameter. Default value is 0
   * @return  Returns a value of type RT_MSOutlook.View
   */

  @DISPID(95) //= 0x5f. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.View add(
    java.lang.String name,
    RT_MSOutlook.OlViewType viewType,
    @Optional RT_MSOutlook.OlViewSaveOption saveOption);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(84) //= 0x54. The runtime will prefer the VTID if present
  @VTID(14)
  void remove(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

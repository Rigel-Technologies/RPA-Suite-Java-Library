package RT_MSOutlook  ;

import com4j.*;

@IID("{000C0316-0000-0000-C000-000000000046}")
public interface GroupShapes extends RT_MSOutlook._IMsoDispObj,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RT_MSOutlook.Shape
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(11)
  @DefaultMethod
  RT_MSOutlook.Shape item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RT_MSOutlook.ShapeRange
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.ShapeRange range(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}

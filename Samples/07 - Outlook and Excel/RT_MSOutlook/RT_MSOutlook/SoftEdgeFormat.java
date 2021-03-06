package RT_MSOutlook  ;

import com4j.*;

@IID("{000C03BC-0000-0000-C000-000000000046}")
public interface SoftEdgeFormat extends RT_MSOutlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoSoftEdgeType
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  RT_MSOutlook.MsoSoftEdgeType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory RT_MSOutlook.MsoSoftEdgeType parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  void type(
    RT_MSOutlook.MsoSoftEdgeType type);


  /**
   * <p>
   * Getter method for the COM property "Radius"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(11)
  float radius();


  /**
   * <p>
   * Setter method for the COM property "Radius"
   * </p>
   * @param radius Mandatory float parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(12)
  void radius(
    float radius);


  // Properties:
}

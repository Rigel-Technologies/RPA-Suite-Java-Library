package RT_MSOutlook  ;

import com4j.*;

@IID("{000C0367-0000-0000-C000-000000000046}")
public interface SearchScope extends RT_MSOutlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoSearchIn
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(9)
  @DefaultMethod
  RT_MSOutlook.MsoSearchIn type();


  /**
   * <p>
   * Getter method for the COM property "ScopeFolder"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.ScopeFolder
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(10)
  RT_MSOutlook.ScopeFolder scopeFolder();


  // Properties:
}

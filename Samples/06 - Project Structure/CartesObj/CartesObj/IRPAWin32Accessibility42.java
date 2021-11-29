package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAAccessibility42 Object
 */
@IID("{E4BB1982-9769-4907-8E34-E78A7026260E}")
public interface IRPAWin32Accessibility42 extends CartesObj.IRPAWin32Accessibility {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Safe"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(86)
  int safe();


  // Properties:
}

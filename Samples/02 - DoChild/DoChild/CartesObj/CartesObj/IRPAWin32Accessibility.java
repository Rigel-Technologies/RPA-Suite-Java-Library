package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32Accessibility Object
 */
@IID("{11F1C76E-9E12-4EEE-9BB4-61E799EB9A8B}")
public interface IRPAWin32Accessibility extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "OffScreen"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  int offScreen();


  // Properties:
}

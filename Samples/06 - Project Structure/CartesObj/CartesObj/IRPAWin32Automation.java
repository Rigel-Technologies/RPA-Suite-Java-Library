package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32Automation Object
 */
@IID("{A3E0E0C8-E79E-4303-B659-CCD32A421A49}")
public interface IRPAWin32Automation extends CartesObj.IRPAWin32Component {
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


  /**
   * <p>
   * Getter method for the COM property "HandleNative"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  int handleNative();


  // Properties:
}

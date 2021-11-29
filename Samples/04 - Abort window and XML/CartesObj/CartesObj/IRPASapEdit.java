package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapEdit Object
 */
@IID("{485E5BE4-87BA-4EF2-975F-62BBD7C6799F}")
public interface IRPASapEdit extends CartesObj.IRPASapControl {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Safe"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(33)
  int safe();


  // Properties:
}

package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapButton Object
 */
@IID("{9313B760-EF01-4D96-9C91-DAD6A7CBD9BA}")
public interface IRPASapButton extends CartesObj.IRPASapControl {
  // Methods:
  /**
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(33)
  void click();


  // Properties:
}

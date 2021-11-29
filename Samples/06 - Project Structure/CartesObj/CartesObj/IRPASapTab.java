package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapTab Object
 */
@IID("{DA6A208B-BE7B-4BC4-BAE3-C25B7E693DCD}")
public interface IRPASapTab extends CartesObj.IRPASapControl {
  // Methods:
  /**
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(33)
  void click();


  // Properties:
}

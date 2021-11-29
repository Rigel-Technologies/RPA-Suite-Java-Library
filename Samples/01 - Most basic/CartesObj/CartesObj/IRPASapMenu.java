package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapMenu Object
 */
@IID("{3D561729-44D8-4692-8973-5B178AA7ACC0}")
public interface IRPASapMenu extends CartesObj.IRPASapControl {
  // Methods:
  /**
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(33)
  void click();


  // Properties:
}

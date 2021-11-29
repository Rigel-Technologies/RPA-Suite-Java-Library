package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapShell Object
 */
@IID("{AD391CAB-DE76-48F3-A461-470D34C3D081}")
public interface IRPASapShell extends CartesObj.IRPASapWin32 {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(601) //= 0x259. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String subType();


  // Properties:
}

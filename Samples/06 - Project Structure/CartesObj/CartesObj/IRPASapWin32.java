package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapWin32 Object
 */
@IID("{EF1672E2-023A-4284-B773-029970BF7553}")
public interface IRPASapWin32 extends CartesObj.IRPASapControl {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(33)
  int handle();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(34)
  int visible();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String winClass();


  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(504) //= 0x1f8. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String doWindows(
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  // Properties:
}

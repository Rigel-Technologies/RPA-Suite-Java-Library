package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapComponent Object
 */
@IID("{9EFA3012-83C0-4117-9379-5F74182C3F3B}")
public interface IRPASapComponent extends CartesObj.IRPAComponent {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String classCode();


  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String runMethod(
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  // Properties:
}

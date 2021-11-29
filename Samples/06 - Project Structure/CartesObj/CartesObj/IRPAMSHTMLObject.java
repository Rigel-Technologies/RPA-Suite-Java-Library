package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLObject Object
 */
@IID("{2B9B727D-A80B-4A2B-99FE-36C0F417F2BA}")
public interface IRPAMSHTMLObject extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String clsid();


  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String runMethod(
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  // Properties:
}

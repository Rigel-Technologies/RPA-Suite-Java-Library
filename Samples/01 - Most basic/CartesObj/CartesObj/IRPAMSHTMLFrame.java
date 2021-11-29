package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLFrame Object
 */
@IID("{56B3A4B8-287B-4C79-B4A1-46964E2AC7DC}")
public interface IRPAMSHTMLFrame extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Downloaded"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  int downloaded();


  /**
   * @param script Mandatory java.lang.String parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(39)
  void runScript(
    java.lang.String script);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String src();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String state();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String title();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String url();


  /**
   * @param seconds Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(44)
  int wait_(
    int seconds);


  // Properties:
}

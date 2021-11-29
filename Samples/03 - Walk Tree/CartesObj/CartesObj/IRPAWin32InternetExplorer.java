package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32InternetExplorer Object
 */
@IID("{AE054971-5FF1-4FD9-AC42-2D1BA26789F7}")
public interface IRPAWin32InternetExplorer extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Downloaded"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  int downloaded();


  /**
   * @param script Mandatory java.lang.String parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  void runScript(
    java.lang.String script);


  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(87)
  java.lang.String state();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(88)
  java.lang.String title();


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(89)
  java.lang.String url();


  /**
   * @param seconds Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(90)
  int wait_(
    int seconds);


  // Properties:
}

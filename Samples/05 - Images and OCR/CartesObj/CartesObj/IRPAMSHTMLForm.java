package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLForm Object
 */
@IID("{C6C994E0-BCA3-4912-AE8D-198B52A48A36}")
public interface IRPAMSHTMLForm extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String action();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String encoding();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String method();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String name();


  /**
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(42)
  void reset();


  /**
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(43)
  void submit();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String target();


  // Properties:
}

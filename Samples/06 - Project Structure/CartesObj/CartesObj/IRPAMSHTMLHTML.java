package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLHTML Object
 */
@IID("{F86CC137-03F5-4B84-ACBA-DDF0CD7FD3FE}")
public interface IRPAMSHTMLHTML extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String domain();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String title();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String url();


  // Properties:
}

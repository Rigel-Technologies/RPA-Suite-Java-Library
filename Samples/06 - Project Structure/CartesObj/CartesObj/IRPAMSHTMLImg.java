package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLImg Object
 */
@IID("{EDD7C55D-81B6-4B22-B64D-BE27AAFAC2FE}")
public interface IRPAMSHTMLImg extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String name();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String src();


  // Properties:
}

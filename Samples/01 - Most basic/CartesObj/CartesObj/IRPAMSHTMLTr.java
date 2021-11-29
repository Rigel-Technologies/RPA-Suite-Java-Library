package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLTr Object
 */
@IID("{D7D6EA57-2C32-499C-948E-370A93ADBB45}")
public interface IRPAMSHTMLTr extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  int columns();


  // Properties:
}

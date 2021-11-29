package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAJava32Interfaces Object
 */
@IID("{A30A40B5-69C4-4AB0-A028-01FA92A2FAE3}")
public interface IRPAJava32Interfaces extends CartesObj.IRPAJava32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String value();


  // Properties:
}

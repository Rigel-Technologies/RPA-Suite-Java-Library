package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAJava32Check Object
 */
@IID("{51163FF8-880B-43D7-B6A5-8C6BB67F9C2E}")
public interface IRPAJava32Check extends CartesObj.IRPAJava32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Checked"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(43)
  int checked();


  /**
   * <p>
   * Setter method for the COM property "Checked"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(44)
  void checked(
    int value);


  // Properties:
}

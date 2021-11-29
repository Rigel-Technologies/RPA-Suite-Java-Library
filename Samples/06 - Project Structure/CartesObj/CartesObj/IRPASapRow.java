package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapRow Object
 */
@IID("{BA227C71-9D75-45F1-A472-DF14E5A5F713}")
public interface IRPASapRow extends CartesObj.IRPASapComponent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(22)
  int selected();


  /**
   * <p>
   * Setter method for the COM property "Selected"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(23)
  void selected(
    int value);


  // Properties:
}

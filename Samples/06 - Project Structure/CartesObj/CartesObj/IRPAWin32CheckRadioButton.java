package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32CheckRadioButton Object
 */
@IID("{3E8C4F8C-D230-4A85-8DBE-3A5E26149DC6}")
public interface IRPAWin32CheckRadioButton extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Checked"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  int checked();


  /**
   * <p>
   * Setter method for the COM property "Checked"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(86)
  void checked(
    int value);


  // Properties:
}

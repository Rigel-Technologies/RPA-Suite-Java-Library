package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32Listbox32 Object
 */
@IID("{037A243E-9D86-42B7-8F77-CAB94F686BF4}")
public interface IRPAWin32Listbox32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Multiselect"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  int multiselect();


  /**
   * <p>
   * Getter method for the COM property "Option"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  java.lang.String option(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Options"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(87)
  int options();


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(88)
  int selected(
    int index);


  /**
   * <p>
   * Setter method for the COM property "Selected"
   * </p>
   * @param index Mandatory int parameter.
   * @param value Mandatory int parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(89)
  void selected(
    int index,
    int value);


  // Properties:
}

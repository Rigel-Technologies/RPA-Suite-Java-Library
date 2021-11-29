package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32Combobox32 Object
 */
@IID("{2F6CD47A-BC92-4BB9-B8DD-38C13D5B8B33}")
public interface IRPAWin32Combobox32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Displayed"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  int displayed();


  /**
   * <p>
   * Setter method for the COM property "Displayed"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(86)
  void displayed(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Option"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(87)
  java.lang.String option(
    int index);


  /**
   * @param option Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(88)
  int position(
    java.lang.String option);


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(89)
  int selected();


  /**
   * <p>
   * Setter method for the COM property "Selected"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(90)
  void selected(
    int value);


  // Properties:
}

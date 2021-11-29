package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32TabControl32 Object
 */
@IID("{E275FFD6-2E83-4165-8E0C-41868BDE1985}")
public interface IRPAWin32TabControl32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  int selection();


  /**
   * <p>
   * Setter method for the COM property "Selection"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(86)
  void selection(
    int value);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(87)
  int tabs();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(88)
  java.lang.String title(
    int index);


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param index Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(89)
  void title(
    int index,
    java.lang.String value);


  // Properties:
}

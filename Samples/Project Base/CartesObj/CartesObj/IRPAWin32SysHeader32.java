package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32SysHeader32 Object
 */
@IID("{11299188-6BAA-4215-8A16-C401E663EAC6}")
public interface IRPAWin32SysHeader32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  void clickItem(
    int index);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  void doubleClickItem(
    int index);


  /**
   * @param title Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(87)
  int findAnIndex(
    java.lang.String title);


  /**
   * <p>
   * Getter method for the COM property "Sections"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(88)
  int sections();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(89)
  java.lang.String title(
    int index);


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param index Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(90)
  void title(
    int index,
    java.lang.String value);


  // Properties:
}

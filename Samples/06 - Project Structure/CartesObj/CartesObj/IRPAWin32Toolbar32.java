package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32Toolbar32 Object
 */
@IID("{D0B07446-ED4D-4F13-A181-A32BF42B03DA}")
public interface IRPAWin32Toolbar32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  int button_x();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  int button_y();


  /**
   * @param idCommand Mandatory int parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(87)
  void clickByCommand(
    int idCommand);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(88)
  void clickByIndex(
    int index);


  /**
   * @param idCommnand Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(89)
  int findAnIndex(
    int idCommnand);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(90)
  int idCommand(
    int index);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(91)
  int items();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(92)
  java.lang.String state(
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(93)
  java.lang.String style(
    int index);


  /**
   * @param idCommand Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(94)
  java.lang.String title(
    int idCommand);


  // Properties:
}

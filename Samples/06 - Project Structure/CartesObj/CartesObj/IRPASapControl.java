package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapControl Object
 */
@IID("{3D96D1C2-F503-44D9-9494-3ED329F20CC4}")
public interface IRPASapControl extends CartesObj.IRPASapComponent {
  // Methods:
  /**
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(22)
  void focus();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(23)
  int height();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String iconName();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String id();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String name();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String toolTip();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(29)
  void value(
    java.lang.String value);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(30)
  int width();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(31)
  int x();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(32)
  int y();


  // Properties:
}

package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32TreeView32 Object
 */
@IID("{F92E3409-357B-4019-82F2-7808981EE9F8}")
public interface IRPAWin32TreeView32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  void collapse();


  /**
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  void expand();


  /**
   * <p>
   * Getter method for the COM property "Expanded"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(87)
  int expanded();


  /**
   * <p>
   * Setter method for the COM property "Expanded"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(88)
  void expanded(
    int value);


  /**
   * @param title Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(89)
  int find(
    java.lang.String title);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(90)
  int items();


  /**
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(91)
  void next();


  /**
   * <p>
   * Getter method for the COM property "Node"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(92)
  java.lang.String node();


  /**
   * <p>
   * Setter method for the COM property "Node"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(93)
  void node(
    java.lang.String value);


  /**
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(94)
  void root();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(95)
  java.lang.String selected();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(96)
  int selected_Visible();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(97)
  int selected_Height();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(412) //= 0x19c. The runtime will prefer the VTID if present
  @VTID(98)
  int selected_Width();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(413) //= 0x19d. The runtime will prefer the VTID if present
  @VTID(99)
  int selected_X();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(414) //= 0x19e. The runtime will prefer the VTID if present
  @VTID(100)
  int selected_Y();


  // Properties:
}

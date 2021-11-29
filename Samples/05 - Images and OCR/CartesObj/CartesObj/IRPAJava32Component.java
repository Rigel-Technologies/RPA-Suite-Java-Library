package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAJava32Component Object
 */
@IID("{9F21C788-A22E-4FF4-B707-EE4F35019C8C}")
public interface IRPAJava32Component extends CartesObj.IRPAComponent {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String accesibleFlags();


  /**
   * @return  Returns a value of type CartesObj.IRPAParameters
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(21)
  CartesObj.IRPAParameters actions();


  /**
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(22)
  void click();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(23)
  void clickon(
    int x,
    int y);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String description();


  /**
   * @param action Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String doAction(
    java.lang.String action);


  /**
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(26)
  void doubleclick();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(27)
  void doubleclickon(
    int x,
    int y);


  /**
   * <p>
   * Getter method for the COM property "enabled"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(28)
  int enabled();


  /**
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(29)
  void focus();


  /**
   * <p>
   * Getter method for the COM property "focused"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(30)
  int focused();


  /**
   * <p>
   * Getter method for the COM property "height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(31)
  int height();


  /**
   * @param action Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(32)
  int isAction(
    java.lang.String action);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "OffScreen"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(34)
  int offScreen();


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(35)
  int selected();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String state();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(318) //= 0x13e. The runtime will prefer the VTID if present
  @VTID(37)
  int visible();


  /**
   * <p>
   * Getter method for the COM property "width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(319) //= 0x13f. The runtime will prefer the VTID if present
  @VTID(38)
  int width();


  /**
   * <p>
   * Getter method for the COM property "x"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(320) //= 0x140. The runtime will prefer the VTID if present
  @VTID(39)
  int x();


  /**
   * <p>
   * Getter method for the COM property "y"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(321) //= 0x141. The runtime will prefer the VTID if present
  @VTID(40)
  int y();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(322) //= 0x142. The runtime will prefer the VTID if present
  @VTID(41)
  int pid();


  /**
   * <p>
   * Getter method for the COM property "DPIAwareness"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(323) //= 0x143. The runtime will prefer the VTID if present
  @VTID(42)
  int dpiAwareness();


  // Properties:
}

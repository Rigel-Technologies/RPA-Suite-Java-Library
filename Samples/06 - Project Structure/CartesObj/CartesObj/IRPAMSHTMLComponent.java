package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLComponent Object
 */
@IID("{B09E5EB2-A6C4-43B2-81F9-D322B5E68EC2}")
public interface IRPAMSHTMLComponent extends CartesObj.IRPAComponent {
  // Methods:
  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String doBrowser(
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(21)
  void click();


  /**
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(22)
  void clickOnBrowser(
    int movemouse);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param movemouse Mandatory int parameter.
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(23)
  void clickOnBrowserOn(
    int x,
    int y,
    int movemouse);


  /**
   * @param eventName Mandatory java.lang.String parameter.
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(24)
  void event(
    java.lang.String eventName);


  /**
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(25)
  void focus();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(26)
  int height();


  /**
   * @param pixels Mandatory int parameter.
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(27)
  void horizontalScroll(
    int pixels);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String id();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String innerHTML();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(30)
  int onClick();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String outerHTML();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(33)
  void value(
    java.lang.String value);


  /**
   * @param pixels Mandatory int parameter.
   */

  @DISPID(314) //= 0x13a. The runtime will prefer the VTID if present
  @VTID(34)
  void verticalScroll(
    int pixels);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(315) //= 0x13b. The runtime will prefer the VTID if present
  @VTID(35)
  int width();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(316) //= 0x13c. The runtime will prefer the VTID if present
  @VTID(36)
  int x();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(317) //= 0x13d. The runtime will prefer the VTID if present
  @VTID(37)
  int y();


  // Properties:
}

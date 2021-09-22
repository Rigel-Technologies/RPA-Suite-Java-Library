package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLInputText Object
 */
@IID("{5D8B39C8-8D50-436A-8C1C-C2BA2DE5896C}")
public interface IRPAMSHTMLInputText extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "enabled"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  int enabled();


  /**
   * <p>
   * Setter method for the COM property "enabled"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(39)
  void enabled(
    int value);


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(40)
  int readOnly();


  /**
   * <p>
   * Setter method for the COM property "ReadOnly"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(41)
  void readOnly(
    int value);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String name();


  /**
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(43)
  void typeFromClipboard(
    java.lang.String value);


  /**
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(44)
  void typeWord(
    java.lang.String value);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(45)
  void typeFromClipboardCheck(
    java.lang.String value,
    int checkvalue);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(46)
  void typeWordCheck(
    java.lang.String value,
    int checkvalue);


  /**
   * <p>
   * Getter method for the COM property "Safe"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(47)
  int safe();


  // Properties:
}

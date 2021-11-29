package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAJava32Edit Object
 */
@IID("{9F469C32-F598-435C-A676-BDAA570C5C17}")
public interface IRPAJava32Edit extends CartesObj.IRPAJava32Component {
  // Methods:
  /**
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(43)
  void typeFromClipboard(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(45)
  void value(
    java.lang.String value);


  /**
   * @param value Mandatory java.lang.String parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(46)
  void typeWord(
    java.lang.String value,
    int checkvalue);


  /**
   * <p>
   * Getter method for the COM property "Safe"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(47)
  int safe();


  // Properties:
}

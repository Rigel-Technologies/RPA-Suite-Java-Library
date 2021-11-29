package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAJava32Combobox Object
 */
@IID("{4D6F4602-3F49-4DA4-9695-C79AFD44C536}")
public interface IRPAJava32Combobox extends CartesObj.IRPAJava32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Option"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String option(
    int index);


  /**
   * <p>
   * Getter method for the COM property "Options"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(44)
  int options();


  /**
   * <p>
   * Getter method for the COM property "Selection"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(45)
  int selection();


  /**
   * <p>
   * Setter method for the COM property "Selection"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(46)
  void selection(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(48)
  void value(
    java.lang.String value);


  // Properties:
}

package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLCheckbox Object
 */
@IID("{21B59EB4-1A02-4142-AD6A-1BC085379D2C}")
public interface IRPAMSHTMLCheckbox extends CartesObj.IRPAMSHTMLComponent {
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
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(41)
  int readOnly();


  /**
   * <p>
   * Setter method for the COM property "ReadOnly"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(42)
  void readOnly(
    int value);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String text();


  // Properties:
}

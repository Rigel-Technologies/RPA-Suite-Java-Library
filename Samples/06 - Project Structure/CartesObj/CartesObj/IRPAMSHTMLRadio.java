package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLRadio Object
 */
@IID("{ADE22D00-4ADD-47BB-87FB-12444456B7FA}")
public interface IRPAMSHTMLRadio extends CartesObj.IRPAMSHTMLComponent {
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
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String text();


  // Properties:
}

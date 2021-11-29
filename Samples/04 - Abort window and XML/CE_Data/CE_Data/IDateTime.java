package CE_Data  ;

import com4j.*;

/**
 * Dispatch interface for DateTime Object
 */
@IID("{1D801508-E87F-41E9-969F-27E92CA81F7B}")
public interface IDateTime extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @param mask Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String text(
    java.lang.String mask);


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param mask Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void text(
    java.lang.String mask,
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "value"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  double value();


  /**
   * <p>
   * Setter method for the COM property "value"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(10)
  void value(
    double value);


  /**
   * <p>
   * Getter method for the COM property "AsString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String asString();


  /**
   * <p>
   * Setter method for the COM property "AsString"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(12)
  void asString(
    java.lang.String value);


  // Properties:
}

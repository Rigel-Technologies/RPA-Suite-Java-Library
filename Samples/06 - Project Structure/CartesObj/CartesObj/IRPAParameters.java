package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAParameters Object
 */
@IID("{D124A02B-6386-4DDD-BF72-C1A92EEE807B}")
public interface IRPAParameters extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void clear();


  /**
   * @param value Mandatory CartesObj.IRPAParameters parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void takevalue(
    CartesObj.IRPAParameters value);


  /**
   * <p>
   * Getter method for the COM property "item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String item(
    int index);


  /**
   * <p>
   * Setter method for the COM property "item"
   * </p>
   * @param index Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  void item(
    int index,
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "items"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  int items();


  /**
   * <p>
   * Getter method for the COM property "itemAsInteger"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  int itemAsInteger(
    int index);


  /**
   * <p>
   * Setter method for the COM property "itemAsInteger"
   * </p>
   * @param index Mandatory int parameter.
   * @param value Mandatory int parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  void itemAsInteger(
    int index,
    int value);


  // Properties:
}

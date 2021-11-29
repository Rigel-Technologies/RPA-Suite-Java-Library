package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapTree Object
 */
@IID("{ECBA32AD-7445-46AB-9635-D77149899675}")
public interface IRPASapTree extends CartesObj.IRPASapWin32 {
  // Methods:
  /**
   */

  @DISPID(601) //= 0x259. The runtime will prefer the VTID if present
  @VTID(37)
  void click();


  /**
   */

  @DISPID(602) //= 0x25a. The runtime will prefer the VTID if present
  @VTID(38)
  void collapse();


  /**
   */

  @DISPID(603) //= 0x25b. The runtime will prefer the VTID if present
  @VTID(39)
  void expand();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(604) //= 0x25c. The runtime will prefer the VTID if present
  @VTID(40)
  int next();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(605) //= 0x25d. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String node();


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(606) //= 0x25e. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String path();


  /**
   * <p>
   * Setter method for the COM property "Path"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(606) //= 0x25e. The runtime will prefer the VTID if present
  @VTID(43)
  void path(
    java.lang.String value);


  /**
   */

  @DISPID(607) //= 0x25f. The runtime will prefer the VTID if present
  @VTID(44)
  void root();


  // Properties:
}

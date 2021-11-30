package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAComponent Object
 */
@IID("{544B600C-7CA2-462B-AB36-F66D6BF67010}")
public interface IRPAComponent extends Com4jObject {
  // Methods:
  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String execute(
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * <p>
   * Getter method for the COM property "descendants"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int descendants();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type CartesObj.IRPAComponent
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  CartesObj.IRPAComponent child(
    int index);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String api();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String wrapper();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String componentClass();


  /**
   * @param timeout Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  int componentexist(
    int timeout);


  /**
   * @param timeout Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  int waitforcomponent(
    int timeout);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String route();


  /**
   * @param route Mandatory java.lang.String parameter.
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String dochild(
    java.lang.String route,
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String doroot(
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * @return  Returns a value of type CartesObj.IRPAComponent
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  CartesObj.IRPAComponent getComponentRoot();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String activeXClass();


  // Properties:
}

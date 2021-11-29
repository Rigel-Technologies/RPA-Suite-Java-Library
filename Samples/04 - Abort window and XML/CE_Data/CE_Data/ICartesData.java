package CE_Data  ;

import com4j.*;

/**
 * Dispatch interface for CartesData Object
 */
@IID("{1D2D1DCB-06AD-4AE2-9EFC-BA0E05337374}")
public interface ICartesData extends Com4jObject {
  // Methods:
  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String getProperty(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void setProperty(
    java.lang.String name,
    java.lang.String value);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String getRoute();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String properties();


  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String execute(
    java.lang.String method,
    java.lang.String parameters);


  /**
   * @param router Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  void getRouter(
    Holder<java.lang.String> router);


  /**
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  void objectClass(
    Holder<java.lang.String> resultado);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  int getDescendants();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type CE_Data.ICartesData
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  CE_Data.ICartesData descendant(
    int index);


  /**
   * @return  Returns a value of type CE_Data.ICartesData
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  CE_Data.ICartesData getParent();


  // Properties:
}

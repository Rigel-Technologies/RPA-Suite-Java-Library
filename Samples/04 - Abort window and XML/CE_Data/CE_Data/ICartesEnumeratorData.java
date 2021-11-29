package CE_Data  ;

import com4j.*;

/**
 * Dispatch interface for CartesEnumeratorData Object
 */
@IID("{71CA562D-5CA5-41A5-895B-90DCF62A711D}")
public interface ICartesEnumeratorData extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void resetCache();


  /**
   * @param router Mandatory java.lang.String parameter.
   * @return  Returns a value of type CE_Data.ICartesData
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  CE_Data.ICartesData locateRoot(
    java.lang.String router);


  /**
   * @param router Mandatory java.lang.String parameter.
   * @return  Returns a value of type CE_Data.ICartesData
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  CE_Data.ICartesData locateControl(
    java.lang.String router);


  /**
   * @param sid Mandatory java.lang.String parameter.
   * @param router Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int editRouter(
    java.lang.String sid,
    Holder<java.lang.String> router);


  /**
   * @param command Mandatory java.lang.String parameter.
   * @param parameters Mandatory java.lang.String parameter.
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  int doCommand(
    java.lang.String command,
    java.lang.String parameters,
    Holder<java.lang.String> resultado);


  // Properties:
}

package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAJava32Table Object
 */
@IID("{3C9A3915-4976-4DE9-8B98-5263AE35AD7C}")
public interface IRPAJava32Table extends CartesObj.IRPAJava32Component {
  // Methods:
  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(43)
  int columnByName(
    java.lang.String name);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(44)
  int columns();


  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String doCell(
    int row,
    int column,
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * @param column Mandatory int parameter.
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String doColumn(
    int column,
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(47)
  int rows();


  // Properties:
}

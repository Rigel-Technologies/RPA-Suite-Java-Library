package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32GridGXWND Object
 */
@IID("{8321F395-0876-4CE3-B25C-261EC3D33A00}")
public interface IRPAWin32GridGXWND extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Cell"
   * </p>
   * @param column Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  java.lang.String cell(
    int column);


  /**
   * <p>
   * Setter method for the COM property "Cell"
   * </p>
   * @param column Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(86)
  void cell(
    int column,
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(87)
  int columns();


  /**
   * @param column Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(88)
  int find(
    int column,
    java.lang.String value);


  /**
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(89)
  void first();


  /**
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(90)
  void last();


  /**
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(91)
  void next();


  /**
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(92)
  void prior();


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(93)
  void select(
    int index);


  // Properties:
}

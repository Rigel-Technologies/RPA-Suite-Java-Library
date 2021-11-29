package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32ListView32 Object
 */
@IID("{3C24993C-8905-4B24-A91C-4A0BF9C5D8E7}")
public interface IRPAWin32ListView32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Cell"
   * </p>
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  java.lang.String cell(
    int row,
    int column);


  /**
   * <p>
   * Setter method for the COM property "Cell"
   * </p>
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(86)
  void cell(
    int row,
    int column,
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(87)
  int columns();


  /**
   * @param substr Mandatory java.lang.String parameter.
   * @param column Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(88)
  int find(
    java.lang.String substr,
    int column);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(89)
  int rows();


  /**
   * @param row Mandatory int parameter.
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(90)
  void selectRow(
    int row);


  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(91)
  void selectColumn(
    int row,
    int column);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(92)
  int selected_X();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(93)
  int selected_Y();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(410) //= 0x19a. The runtime will prefer the VTID if present
  @VTID(94)
  int selection();


  /**
   * @param row Mandatory int parameter.
   */

  @DISPID(411) //= 0x19b. The runtime will prefer the VTID if present
  @VTID(95)
  void unselect(
    int row);


  // Properties:
}

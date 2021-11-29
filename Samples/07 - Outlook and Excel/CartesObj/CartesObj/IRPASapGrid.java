package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapGrid Object
 */
@IID("{03519CDF-B370-47B7-975C-49AB445EFECC}")
public interface IRPASapGrid extends CartesObj.IRPASapWin32 {
  // Methods:
  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(601) //= 0x259. The runtime will prefer the VTID if present
  @VTID(37)
  int buttonChecked(
    java.lang.String id);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(602) //= 0x25a. The runtime will prefer the VTID if present
  @VTID(38)
  int buttonEnabled(
    java.lang.String id);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(603) //= 0x25b. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String buttonId(
    int index);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(604) //= 0x25c. The runtime will prefer the VTID if present
  @VTID(40)
  int buttonPosition(
    java.lang.String id);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(605) //= 0x25d. The runtime will prefer the VTID if present
  @VTID(41)
  int buttons();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(606) //= 0x25e. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String buttonType(
    java.lang.String id);


  /**
   * <p>
   * Getter method for the COM property "Cell"
   * </p>
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(607) //= 0x25f. The runtime will prefer the VTID if present
  @VTID(43)
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

  @DISPID(607) //= 0x25f. The runtime will prefer the VTID if present
  @VTID(44)
  void cell(
    int row,
    int column,
    java.lang.String value);


  /**
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(608) //= 0x260. The runtime will prefer the VTID if present
  @VTID(45)
  void clickId(
    java.lang.String id);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param menuPosition Mandatory int parameter.
   */

  @DISPID(609) //= 0x261. The runtime will prefer the VTID if present
  @VTID(46)
  void clickOption(
    java.lang.String id,
    int menuPosition);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param menuTitle Mandatory java.lang.String parameter.
   */

  @DISPID(610) //= 0x262. The runtime will prefer the VTID if present
  @VTID(47)
  void clickmenu(
    java.lang.String id,
    java.lang.String menuTitle);


  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   */

  @DISPID(611) //= 0x263. The runtime will prefer the VTID if present
  @VTID(48)
  void clickCell(
    int row,
    int column);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(612) //= 0x264. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String columnId(
    int index);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(613) //= 0x265. The runtime will prefer the VTID if present
  @VTID(50)
  int columnPosition(
    java.lang.String id);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(614) //= 0x266. The runtime will prefer the VTID if present
  @VTID(51)
  int columns();


  /**
   * <p>
   * Getter method for the COM property "ColumnSelected"
   * </p>
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(615) //= 0x267. The runtime will prefer the VTID if present
  @VTID(52)
  int columnSelected(
    java.lang.String id);


  /**
   * <p>
   * Setter method for the COM property "ColumnSelected"
   * </p>
   * @param id Mandatory java.lang.String parameter.
   * @param value Mandatory int parameter.
   */

  @DISPID(615) //= 0x267. The runtime will prefer the VTID if present
  @VTID(53)
  void columnSelected(
    java.lang.String id,
    int value);


  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   */

  @DISPID(616) //= 0x268. The runtime will prefer the VTID if present
  @VTID(54)
  void doubleclick(
    int row,
    int column);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(617) //= 0x269. The runtime will prefer the VTID if present
  @VTID(55)
  int rows();


  // Properties:
}

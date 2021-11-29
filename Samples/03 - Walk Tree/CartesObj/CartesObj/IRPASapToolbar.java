package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapToolbar Object
 */
@IID("{3725DCEC-B356-4C27-8456-4C691585D036}")
public interface IRPASapToolbar extends CartesObj.IRPASapWin32 {
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
   * @param id Mandatory java.lang.String parameter.
   */

  @DISPID(607) //= 0x25f. The runtime will prefer the VTID if present
  @VTID(43)
  void clickId(
    java.lang.String id);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param menuPosition Mandatory int parameter.
   */

  @DISPID(608) //= 0x260. The runtime will prefer the VTID if present
  @VTID(44)
  void clickOption(
    java.lang.String id,
    int menuPosition);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param menuTitle Mandatory java.lang.String parameter.
   */

  @DISPID(609) //= 0x261. The runtime will prefer the VTID if present
  @VTID(45)
  void clickmenu(
    java.lang.String id,
    java.lang.String menuTitle);


  // Properties:
}

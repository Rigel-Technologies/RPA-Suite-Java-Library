package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPADeveloper Object
 */
@IID("{2967E971-C478-4347-8670-1B08F14651ED}")
public interface IRPADeveloper extends Com4jObject {
  // Methods:
  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void loadfromfile(
    java.lang.String filename);


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void savetofile(
    java.lang.String filename);


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "description"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  void description(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "initialscript"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String initialscript();


  /**
   * <p>
   * Setter method for the COM property "initialscript"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(14)
  void initialscript(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String id();


  /**
   * <p>
   * Getter method for the COM property "filename"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String filename();


  /**
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  void clear();


  /**
   * <p>
   * Getter method for the COM property "variables"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  int variables();


  /**
   * <p>
   * Getter method for the COM property "variable"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type CartesObj.IRPAVariable
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(19)
  CartesObj.IRPAVariable variable(
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type CartesObj.IRPAVariable
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(20)
  CartesObj.IRPAVariable variablebyname(
    java.lang.String name);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(21)
  int newvariable(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "APIs"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(22)
  int apIs();


  /**
   * <p>
   * Getter method for the COM property "api"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String api(
    int index);


  /**
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(24)
  void reset();


  /**
   * @param topic Mandatory java.lang.String parameter.
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(25)
  void help(
    java.lang.String topic);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(26)
  void deletevariable(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "trace"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(27)
  int trace();


  /**
   * <p>
   * Setter method for the COM property "trace"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(28)
  void trace(
    int value);


  /**
   * <p>
   * Getter method for the COM property "RigelURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String rigelURL();


  /**
   * <p>
   * Getter method for the COM property "ForumURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String forumURL();


  /**
   * @param command Mandatory java.lang.String parameter.
   * @param parameters Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String doCommand(
    java.lang.String command,
    java.lang.String parameters);


  // Properties:
}

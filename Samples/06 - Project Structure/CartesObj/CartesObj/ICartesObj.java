package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for CartesObj Object
 */
@IID("{59F9E2FD-D946-440F-8B60-88B0FC8FB334}")
public interface ICartesObj extends Com4jObject {
  // Methods:
  /**
   * @param script Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String execute(
    java.lang.String script);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String lastError();


  /**
   * <p>
   * Getter method for the COM property "Abort"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int abort();


  /**
   * <p>
   * Setter method for the COM property "Abort"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  void abort(
    int value);


  /**
   * @param variablename Mandatory java.lang.String parameter.
   * @return  Returns a value of type CartesObj.IRPAComponent
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  CartesObj.IRPAComponent component(
    java.lang.String variablename);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  int open(
    java.lang.String filename);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  int merge(
    java.lang.String filename);


  /**
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(14)
  void close();


  /**
   * @param programfile Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(15)
  void run(
    java.lang.String programfile);


  /**
   * @param api Mandatory java.lang.String parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(16)
  void reset(
    java.lang.String api);


  /**
   * @param start Mandatory java.util.Date parameter.
   * @param typify Mandatory java.lang.String parameter.
   * @param data Mandatory java.lang.String parameter.
   * @param screenShot Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(17)
  int registerIteration(
    java.util.Date start,
    java.lang.String typify,
    java.lang.String data,
    int screenShot);


  /**
   * @param message Mandatory java.lang.String parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(18)
  void balloon(
    java.lang.String message);


  /**
   * @param message Mandatory java.lang.String parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(19)
  void forensic(
    java.lang.String message);


  /**
   * <p>
   * The function sends a request to the swarm to delay the current process. If the swarm accepts, the function returns 1, otherwise it returns 0.
   * </p>
   * @param minutes Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(20)
  int swarmdelay(
    int minutes);


  /**
   * <p>
   * The function sends a request to the swarm to delay the running process for the minutes set from the "RPA Center". If the swarm accepts, the function returns 1, otherwise it returns 0.
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(21)
  int swarmdelaydefault();


  /**
   * <p>
   * Instances of this class allow you to work with the RPA Suite credential stack.
   * </p>
   * @return  Returns a value of type CartesObj.ICredentialStack
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(22)
  CartesObj.ICredentialStack credential();


  // Properties:
  
  
  /**
   * @param variablename Mandatory java.lang.String parameter.
   * @return  Returns a value of type CartesObj.IRPAComponent
   */

  @DISPID(216) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  CartesObj.IRPAWin32Edit32 componentWin32(
    java.lang.String variablename);

  
}

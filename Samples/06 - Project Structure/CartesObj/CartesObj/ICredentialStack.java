package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for CredentialStack Object
 */
@IID("{A5A5BED7-AA2A-48D9-A95D-B57D71696C99}")
public interface ICredentialStack extends Com4jObject {
  // Methods:
  /**
   * <p>
   * If a credential is available for the "code" application, the method loads it into the instance and returns true. Otherwise the method returns false.
   * </p>
   * @param code Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int tryLock(
    java.lang.String code);


  /**
   * <p>
   * The method loads credentials in the instance for the "code" application. If no credentials are available, the method throws an exception.
   * </p>
   * @param code Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void lock(
    java.lang.String code);


  /**
   * <p>
   * The method returns the credentials to the stack. The credentials are free to be used by another robot.
   * </p>
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  void unLock();


  /**
   * @param component Mandatory CartesObj.IRPAComponent parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  void write(
    CartesObj.IRPAComponent component);


  /**
   * <p>
   * The method returns the application "code".
   * </p>
   * <p>
   * Getter method for the COM property "code"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String code();


  /**
   * <p>
   * The method returns the command to open the application to which to apply the credentials.
   * </p>
   * <p>
   * Getter method for the COM property "Executable"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String executable();


  /**
   * <p>
   * The method returns the user to login.
   * </p>
   * <p>
   * Getter method for the COM property "User"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String user();


  /**
   * <p>
   * The method returns the password.
   * </p>
   * <p>
   * Getter method for the COM property "Password"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String password();


  // Properties:
}

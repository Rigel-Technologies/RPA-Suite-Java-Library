package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPADataString Object
 */
@IID("{AB2E3BC8-8EDD-48DA-9836-F26456F2A113}")
public interface IRPADataString extends CartesObj.IRPAData {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(21)
  void value(
    java.lang.String value);


  /**
   * @param kind Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(22)
  void showDialog(
    java.lang.String kind,
    CartesObj.IRPAParameters parameters);


  /**
   * @param aborttext Mandatory java.lang.String parameter.
   * @param farawell Mandatory java.lang.String parameter.
   * @param buttontext Mandatory java.lang.String parameter.
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(23)
  void showAbortDialog(
    java.lang.String aborttext,
    java.lang.String farawell,
    java.lang.String buttontext);


  // Properties:
}

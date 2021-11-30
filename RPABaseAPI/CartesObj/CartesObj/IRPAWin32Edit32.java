package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32Edit32 Object
 */
@IID("{88B6F18D-0606-4652-B3C2-007ADCA6E5CA}")
public interface IRPAWin32Edit32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  void typeValue(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Safe"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  int safe();


  // Properties:
}

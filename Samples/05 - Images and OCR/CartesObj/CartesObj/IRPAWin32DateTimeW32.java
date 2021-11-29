package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAWin32DateTimeW32 Object
 */
@IID("{2CBFE73A-BA4F-4501-AFC6-DD6CEA3993BA}")
public interface IRPAWin32DateTimeW32 extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * @param format Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  void formatDateTime(
    java.lang.String format);


  /**
   * @param format Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  void assignFormatDateTime(
    java.lang.String format,
    java.lang.String value);


  // Properties:
}

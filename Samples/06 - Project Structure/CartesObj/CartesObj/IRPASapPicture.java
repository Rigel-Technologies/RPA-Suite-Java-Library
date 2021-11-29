package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapPicture Object
 */
@IID("{7A138BFD-BD27-459C-A0AF-C83A0612D9E4}")
public interface IRPASapPicture extends CartesObj.IRPASapWin32 {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(601) //= 0x259. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String url();


  // Properties:
}

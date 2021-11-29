package RTExcelObj  ;

import com4j.*;

@IID("{000CDB0A-0000-0000-C000-000000000046}")
public interface ICustomXMLPartsEvents extends Com4jObject {
  // Methods:
  /**
   * @param newPart Mandatory RTExcelObj._CustomXMLPart parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void partAfterAdd(
    RTExcelObj._CustomXMLPart newPart);


  /**
   * @param oldPart Mandatory RTExcelObj._CustomXMLPart parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void partBeforeDelete(
    RTExcelObj._CustomXMLPart oldPart);


  /**
   * @param part Mandatory RTExcelObj._CustomXMLPart parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void partAfterLoad(
    RTExcelObj._CustomXMLPart part);


  // Properties:
}

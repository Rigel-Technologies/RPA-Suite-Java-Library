package RT_MSOutlook  ;

import com4j.*;

@IID("{000CDB0A-0000-0000-C000-000000000046}")
public interface ICustomXMLPartsEvents extends Com4jObject {
  // Methods:
  /**
   * @param newPart Mandatory RT_MSOutlook._CustomXMLPart parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void partAfterAdd(
    RT_MSOutlook._CustomXMLPart newPart);


  /**
   * @param oldPart Mandatory RT_MSOutlook._CustomXMLPart parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void partBeforeDelete(
    RT_MSOutlook._CustomXMLPart oldPart);


  /**
   * @param part Mandatory RT_MSOutlook._CustomXMLPart parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void partAfterLoad(
    RT_MSOutlook._CustomXMLPart part);


  // Properties:
}

package RT_MSOutlook  ;

import com4j.*;

@IID("{000CDB06-0000-0000-C000-000000000046}")
public interface ICustomXMLPartEvents extends Com4jObject {
  // Methods:
  /**
   * @param newNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void nodeAfterInsert(
    RT_MSOutlook.CustomXMLNode newNode,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param oldParentNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void nodeAfterDelete(
    RT_MSOutlook.CustomXMLNode oldNode,
    RT_MSOutlook.CustomXMLNode oldParentNode,
    RT_MSOutlook.CustomXMLNode oldNextSibling,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param newNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void nodeAfterReplace(
    RT_MSOutlook.CustomXMLNode oldNode,
    RT_MSOutlook.CustomXMLNode newNode,
    boolean inUndoRedo);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{000CDB06-0000-0000-C000-000000000046}")
public interface ICustomXMLPartEvents extends Com4jObject {
  // Methods:
  /**
   * @param newNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(7)
  void nodeAfterInsert(
    RTExcelObj.CustomXMLNode newNode,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param oldParentNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(8)
  void nodeAfterDelete(
    RTExcelObj.CustomXMLNode oldNode,
    RTExcelObj.CustomXMLNode oldParentNode,
    RTExcelObj.CustomXMLNode oldNextSibling,
    boolean inUndoRedo);


  /**
   * @param oldNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param newNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(9)
  void nodeAfterReplace(
    RTExcelObj.CustomXMLNode oldNode,
    RTExcelObj.CustomXMLNode newNode,
    boolean inUndoRedo);


  // Properties:
}

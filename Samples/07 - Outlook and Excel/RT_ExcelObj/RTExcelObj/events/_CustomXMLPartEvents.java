package RTExcelObj.events;

import com4j.*;

@IID("{000CDB07-0000-0000-C000-000000000046}")
public abstract class _CustomXMLPartEvents {
  // Methods:
  /**
   * @param newNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1)
  public void nodeAfterInsert(
    RTExcelObj.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param oldParentNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2)
  public void nodeAfterDelete(
    RTExcelObj.CustomXMLNode oldNode,
    RTExcelObj.CustomXMLNode oldParentNode,
    RTExcelObj.CustomXMLNode oldNextSibling,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param newNode Mandatory RTExcelObj.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3)
  public void nodeAfterReplace(
    RTExcelObj.CustomXMLNode oldNode,
    RTExcelObj.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

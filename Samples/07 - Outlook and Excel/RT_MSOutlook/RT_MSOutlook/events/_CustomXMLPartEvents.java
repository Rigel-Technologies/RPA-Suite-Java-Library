package RT_MSOutlook.events;

import com4j.*;

@IID("{000CDB07-0000-0000-C000-000000000046}")
public abstract class _CustomXMLPartEvents {
  // Methods:
  /**
   * @param newNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(1)
  public void nodeAfterInsert(
    RT_MSOutlook.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param oldParentNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param oldNextSibling Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(2)
  public void nodeAfterDelete(
    RT_MSOutlook.CustomXMLNode oldNode,
    RT_MSOutlook.CustomXMLNode oldParentNode,
    RT_MSOutlook.CustomXMLNode oldNextSibling,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param oldNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param newNode Mandatory RT_MSOutlook.CustomXMLNode parameter.
   * @param inUndoRedo Mandatory boolean parameter.
   */

  @DISPID(3)
  public void nodeAfterReplace(
    RT_MSOutlook.CustomXMLNode oldNode,
    RT_MSOutlook.CustomXMLNode newNode,
    boolean inUndoRedo) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

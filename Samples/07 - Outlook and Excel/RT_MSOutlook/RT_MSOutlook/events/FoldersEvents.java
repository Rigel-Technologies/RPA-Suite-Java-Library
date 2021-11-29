package RT_MSOutlook.events;

import com4j.*;

@IID("{00063076-0000-0000-C000-000000000046}")
public abstract class FoldersEvents {
  // Methods:
  /**
   * @param folder Mandatory RT_MSOutlook.MAPIFolder parameter.
   */

  @DISPID(61441)
  public void folderAdd(
    RT_MSOutlook.MAPIFolder folder) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param folder Mandatory RT_MSOutlook.MAPIFolder parameter.
   */

  @DISPID(61442)
  public void folderChange(
    RT_MSOutlook.MAPIFolder folder) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(61443)
  public void folderRemove() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

package RT_MSOutlook.events;

import com4j.*;

@IID("{000630F7-0000-0000-C000-000000000046}")
public abstract class MAPIFolderEvents_12 {
  // Methods:
  /**
   * @param moveTo Mandatory RT_MSOutlook.MAPIFolder parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64424)
  public void beforeFolderMove(
    RT_MSOutlook.MAPIFolder moveTo,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param moveTo Mandatory RT_MSOutlook.MAPIFolder parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64425)
  public void beforeItemMove(
    com4j.Com4jObject item,
    RT_MSOutlook.MAPIFolder moveTo,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

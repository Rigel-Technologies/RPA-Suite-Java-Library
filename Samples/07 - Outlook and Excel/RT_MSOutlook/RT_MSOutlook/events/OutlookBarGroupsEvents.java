package RT_MSOutlook.events;

import com4j.*;

@IID("{0006307B-0000-0000-C000-000000000046}")
public abstract class OutlookBarGroupsEvents {
  // Methods:
  /**
   * @param newGroup Mandatory RT_MSOutlook.OutlookBarGroup parameter.
   */

  @DISPID(61441)
  public void groupAdd(
    RT_MSOutlook.OutlookBarGroup newGroup) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void beforeGroupAdd(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param group Mandatory RT_MSOutlook.OutlookBarGroup parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61443)
  public void beforeGroupRemove(
    RT_MSOutlook.OutlookBarGroup group,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

package RT_MSOutlook.events;

import com4j.*;

@IID("{0006307A-0000-0000-C000-000000000046}")
public abstract class OutlookBarPaneEvents {
  // Methods:
  /**
   * @param shortcut Mandatory RT_MSOutlook.OutlookBarShortcut parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61441)
  public void beforeNavigate(
    RT_MSOutlook.OutlookBarShortcut shortcut,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param toGroup Mandatory RT_MSOutlook.OutlookBarGroup parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void beforeGroupSwitch(
    RT_MSOutlook.OutlookBarGroup toGroup,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

package RT_MSOutlook.events;

import com4j.*;

@IID("{0006307C-0000-0000-C000-000000000046}")
public abstract class OutlookBarShortcutsEvents {
  // Methods:
  /**
   * @param newShortcut Mandatory RT_MSOutlook.OutlookBarShortcut parameter.
   */

  @DISPID(61441)
  public void shortcutAdd(
    RT_MSOutlook.OutlookBarShortcut newShortcut) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61442)
  public void beforeShortcutAdd(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param shortcut Mandatory RT_MSOutlook.OutlookBarShortcut parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(61443)
  public void beforeShortcutRemove(
    RT_MSOutlook.OutlookBarShortcut shortcut,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

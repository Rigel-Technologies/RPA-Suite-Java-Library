package RT_MSOutlook.events;

import com4j.*;

@IID("{000630B2-0000-0000-C000-000000000046}")
public abstract class ReminderCollectionEvents {
  // Methods:
  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(64147)
  public void beforeReminderShow(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory RT_MSOutlook._Reminder parameter.
   */

  @DISPID(64148)
  public void reminderAdd(
    RT_MSOutlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory RT_MSOutlook._Reminder parameter.
   */

  @DISPID(64149)
  public void reminderChange(
    RT_MSOutlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory RT_MSOutlook._Reminder parameter.
   */

  @DISPID(64150)
  public void reminderFire(
    RT_MSOutlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(64151)
  public void reminderRemove() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param reminderObject Mandatory RT_MSOutlook._Reminder parameter.
   */

  @DISPID(64152)
  public void snooze(
    RT_MSOutlook._Reminder reminderObject) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

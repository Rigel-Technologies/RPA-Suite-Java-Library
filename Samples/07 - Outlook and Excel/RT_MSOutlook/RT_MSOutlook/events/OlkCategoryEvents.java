package RT_MSOutlook.events;

import com4j.*;

@IID("{000672F5-0000-0000-C000-000000000046}")
public abstract class OlkCategoryEvents {
  // Methods:
  /**
   */

  @DISPID(-600)
  public void click() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(-601)
  public void doubleClick() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param button Mandatory RT_MSOutlook.OlMouseButton parameter.
   * @param shift Mandatory RT_MSOutlook.OlShiftState parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(-605)
  public void mouseDown(
    RT_MSOutlook.OlMouseButton button,
    RT_MSOutlook.OlShiftState shift,
    float x,
    float y) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param button Mandatory RT_MSOutlook.OlMouseButton parameter.
   * @param shift Mandatory RT_MSOutlook.OlShiftState parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(-606)
  public void mouseMove(
    RT_MSOutlook.OlMouseButton button,
    RT_MSOutlook.OlShiftState shift,
    float x,
    float y) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param button Mandatory RT_MSOutlook.OlMouseButton parameter.
   * @param shift Mandatory RT_MSOutlook.OlShiftState parameter.
   * @param x Mandatory float parameter.
   * @param y Mandatory float parameter.
   */

  @DISPID(-607)
  public void mouseUp(
    RT_MSOutlook.OlMouseButton button,
    RT_MSOutlook.OlShiftState shift,
    float x,
    float y) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(-2147384830)
  public void enter() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(-2147384829)
  public void exit(
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param keyCode Mandatory Holder<Integer> parameter.
   * @param shift Mandatory RT_MSOutlook.OlShiftState parameter.
   */

  @DISPID(-602)
  public void keyDown(
    Holder<Integer> keyCode,
    RT_MSOutlook.OlShiftState shift) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param keyAscii Mandatory Holder<Integer> parameter.
   */

  @DISPID(-603)
  public void keyPress(
    Holder<Integer> keyAscii) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param keyCode Mandatory Holder<Integer> parameter.
   * @param shift Mandatory RT_MSOutlook.OlShiftState parameter.
   */

  @DISPID(-604)
  public void keyUp(
    Holder<Integer> keyCode,
    RT_MSOutlook.OlShiftState shift) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(2)
  public void change() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

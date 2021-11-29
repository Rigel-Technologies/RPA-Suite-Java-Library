package RT_MSOutlook  ;

import com4j.*;

/**
 */
public enum OlFormatSmartFrom implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatSmartFromFromTo(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  olFormatSmartFromFromOnly(2),
  ;

  private final int value;
  OlFormatSmartFrom(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

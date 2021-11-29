package RT_MSOutlook  ;

import com4j.*;

/**
 */
public enum OlTimeStyle implements ComEnum {
  /**
   * <p>
   * TimeOnly
   * </p>
   * <p>
   * The value of this constant is 0
   * </p>
   */
  olTimeStyleTimeOnly(0),
  /**
   * <p>
   * TimeDuration
   * </p>
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olTimeStyleTimeDuration(1),
  /**
   * <p>
   * ShortDuration
   * </p>
   * <p>
   * The value of this constant is 4
   * </p>
   */
  olTimeStyleShortDuration(4),
  ;

  private final int value;
  OlTimeStyle(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

package RT_MSOutlook  ;

import com4j.*;

/**
 */
public enum OlFormatText implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  olFormatTextText(1),
  ;

  private final int value;
  OlFormatText(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}

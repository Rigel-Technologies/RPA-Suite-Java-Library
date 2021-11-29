package RT_MSOutlook  ;

import com4j.*;

@IID("{000C1721-0000-0000-C000-000000000046}")
public interface IMsoErrorBars extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(8)
  java.lang.String name();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(9)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.IMsoBorder
   */

  @VTID(10)
  RT_MSOutlook.IMsoBorder border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "EndStyle"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.XlEndStyleCap
   */

  @VTID(13)
  RT_MSOutlook.XlEndStyleCap endStyle();


  /**
   * <p>
   * Setter method for the COM property "EndStyle"
   * </p>
   * @param rhs Mandatory RT_MSOutlook.XlEndStyleCap parameter.
   */

  @VTID(14)
  void endStyle(
    RT_MSOutlook.XlEndStyleCap rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.IMsoChartFormat
   */

  @VTID(15)
  RT_MSOutlook.IMsoChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int creator();


  // Properties:
}

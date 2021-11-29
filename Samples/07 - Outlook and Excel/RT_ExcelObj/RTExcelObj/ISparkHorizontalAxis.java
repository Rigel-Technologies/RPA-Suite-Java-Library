package RTExcelObj  ;

import com4j.*;

@IID("{000244BB-0001-0000-C000-000000000046}")
public interface ISparkHorizontalAxis extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Axis"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkColor
   */

  @VTID(10)
  RTExcelObj.SparkColor axis();


  /**
   * <p>
   * Getter method for the COM property "IsDateAxis"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean isDateAxis();


  /**
   * <p>
   * Getter method for the COM property "RightToLeftPlotOrder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean rightToLeftPlotOrder();


  /**
   * <p>
   * Setter method for the COM property "RightToLeftPlotOrder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void rightToLeftPlotOrder(
    boolean rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{000244BA-0001-0000-C000-000000000046}")
public interface ISparkAxes extends Com4jObject {
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
   * Getter method for the COM property "Vertical"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkVerticalAxis
   */

  @VTID(10)
  RTExcelObj.SparkVerticalAxis vertical();


  /**
   * <p>
   * Getter method for the COM property "Horizontal"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkHorizontalAxis
   */

  @VTID(11)
  RTExcelObj.SparkHorizontalAxis horizontal();


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{000244B8-0001-0000-C000-000000000046}")
public interface ISparkPoints extends Com4jObject {
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
   * Getter method for the COM property "Negative"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkColor
   */

  @VTID(10)
  RTExcelObj.SparkColor negative();


  /**
   * <p>
   * Getter method for the COM property "Markers"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkColor
   */

  @VTID(11)
  RTExcelObj.SparkColor markers();


  /**
   * <p>
   * Getter method for the COM property "Highpoint"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkColor
   */

  @VTID(12)
  RTExcelObj.SparkColor highpoint();


  /**
   * <p>
   * Getter method for the COM property "Lowpoint"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkColor
   */

  @VTID(13)
  RTExcelObj.SparkColor lowpoint();


  /**
   * <p>
   * Getter method for the COM property "Firstpoint"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkColor
   */

  @VTID(14)
  RTExcelObj.SparkColor firstpoint();


  /**
   * <p>
   * Getter method for the COM property "Lastpoint"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkColor
   */

  @VTID(15)
  RTExcelObj.SparkColor lastpoint();


  // Properties:
}

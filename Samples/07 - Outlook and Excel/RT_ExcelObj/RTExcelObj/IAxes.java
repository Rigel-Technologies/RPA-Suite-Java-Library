package RTExcelObj  ;

import com4j.*;

@IID("{0002085B-0001-0000-C000-000000000046}")
public interface IAxes extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int count();


  /**
   * @param type Mandatory RTExcelObj.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type RTExcelObj.Axis
   */

  @VTID(11)
  RTExcelObj.Axis item(
    RTExcelObj.XlAxisType type,
    @Optional @DefaultValue("1") RTExcelObj.XlAxisGroup axisGroup);


  /**
   */

  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param type Mandatory RTExcelObj.XlAxisType parameter.
   * @param axisGroup Optional parameter. Default value is 1
   * @return  Returns a value of type RTExcelObj.Axis
   */

  @VTID(13)
  @DefaultMethod
  RTExcelObj.Axis _Default(
    RTExcelObj.XlAxisType type,
    @Optional @DefaultValue("1") RTExcelObj.XlAxisGroup axisGroup);


  // Properties:
}

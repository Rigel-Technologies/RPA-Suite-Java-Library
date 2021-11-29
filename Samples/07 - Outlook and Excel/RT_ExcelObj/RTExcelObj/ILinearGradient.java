package RTExcelObj  ;

import com4j.*;

@IID("{000244AF-0001-0000-C000-000000000046}")
public interface ILinearGradient extends Com4jObject {
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
   * Getter method for the COM property "ColorStops"
   * </p>
   * @return  Returns a value of type RTExcelObj.ColorStops
   */

  @VTID(10)
  RTExcelObj.ColorStops colorStops();


  /**
   * <p>
   * Getter method for the COM property "Degree"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(11)
  double degree();


  /**
   * <p>
   * Setter method for the COM property "Degree"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(12)
  void degree(
    double rhs);


  // Properties:
}

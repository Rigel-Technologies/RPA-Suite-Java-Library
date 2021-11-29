package RTExcelObj  ;

import com4j.*;

@IID("{000244B0-0001-0000-C000-000000000046}")
public interface IRectangularGradient extends Com4jObject {
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
   * Getter method for the COM property "RectangleTop"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(11)
  double rectangleTop();


  /**
   * <p>
   * Setter method for the COM property "RectangleTop"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(12)
  void rectangleTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RectangleBottom"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(13)
  double rectangleBottom();


  /**
   * <p>
   * Setter method for the COM property "RectangleBottom"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(14)
  void rectangleBottom(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RectangleLeft"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(15)
  double rectangleLeft();


  /**
   * <p>
   * Setter method for the COM property "RectangleLeft"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(16)
  void rectangleLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "RectangleRight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(17)
  double rectangleRight();


  /**
   * <p>
   * Setter method for the COM property "RectangleRight"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(18)
  void rectangleRight(
    double rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{000208CB-0001-0000-C000-000000000046}")
public interface IPlotArea extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String name();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   * @return  Returns a value of type RTExcelObj.Border
   */

  @VTID(12)
  RTExcelObj.Border border();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object clearFormats();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(14)
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(15)
  void height(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type RTExcelObj.Interior
   */

  @VTID(16)
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type RTExcelObj.ChartFillFormat
   */

  @VTID(17)
  RTExcelObj.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(18)
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(19)
  void left(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(20)
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(21)
  void top(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(22)
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(23)
  void width(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "_InsideLeft"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(24)
  double _InsideLeft();


  /**
   * <p>
   * Getter method for the COM property "_InsideTop"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(25)
  double _InsideTop();


  /**
   * <p>
   * Getter method for the COM property "_InsideWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(26)
  double _InsideWidth();


  /**
   * <p>
   * Getter method for the COM property "_InsideHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(27)
  double _InsideHeight();


  /**
   * <p>
   * Getter method for the COM property "InsideLeft"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(28)
  double insideLeft();


  /**
   * <p>
   * Setter method for the COM property "InsideLeft"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(29)
  void insideLeft(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InsideTop"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(30)
  double insideTop();


  /**
   * <p>
   * Setter method for the COM property "InsideTop"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(31)
  void insideTop(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InsideWidth"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(32)
  double insideWidth();


  /**
   * <p>
   * Setter method for the COM property "InsideWidth"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(33)
  void insideWidth(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "InsideHeight"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(34)
  double insideHeight();


  /**
   * <p>
   * Setter method for the COM property "InsideHeight"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(35)
  void insideHeight(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlChartElementPosition
   */

  @VTID(36)
  RTExcelObj.XlChartElementPosition position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlChartElementPosition parameter.
   */

  @VTID(37)
  void position(
    RTExcelObj.XlChartElementPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type RTExcelObj.ChartFormat
   */

  @VTID(38)
  RTExcelObj.ChartFormat format();


  // Properties:
}

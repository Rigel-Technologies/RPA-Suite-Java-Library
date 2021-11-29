package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ProtectedViewWindow extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   */

  @DISPID(139)
  @PropGet
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139)
  @PropPut
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableResize"
   * </p>
   */

  @DISPID(1192)
  @PropGet
  boolean enableResize();


  /**
   * <p>
   * Setter method for the COM property "EnableResize"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1192)
  @PropPut
  void enableResize(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(123)
  @PropPut
  void height(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  double left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(127)
  @PropPut
  void left(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(126)
  @PropPut
  void top(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  double width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(122)
  @PropPut
  void width(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void visible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(721)
  @PropGet
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "SourcePath"
   * </p>
   */

  @DISPID(2993)
  @PropGet
  java.lang.String sourcePath();


  /**
   * <p>
   * Getter method for the COM property "WindowState"
   * </p>
   */

  @DISPID(396)
  @PropGet
  RTExcelObj.XlProtectedViewWindowState windowState();


  /**
   * <p>
   * Setter method for the COM property "WindowState"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlProtectedViewWindowState parameter.
   */

  @DISPID(396)
  @PropPut
  void windowState(
    RTExcelObj.XlProtectedViewWindowState rhs);


  /**
   * <p>
   * Getter method for the COM property "Workbook"
   * </p>
   */

  @DISPID(752)
  @PropGet
  RTExcelObj._Workbook workbook();


  /**
   */

  @DISPID(304)
  void activate();


  /**
   */

  @DISPID(277)
  boolean close();


  /**
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param updateLinks Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(562)
  RTExcelObj._Workbook edit(
    @Optional java.lang.Object writeResPassword,
    @Optional java.lang.Object updateLinks);


  // Properties:
}

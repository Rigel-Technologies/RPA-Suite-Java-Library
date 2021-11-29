package RTExcelObj  ;

import com4j.*;

@IID("{000244B7-0001-0000-C000-000000000046}")
public interface ISparklineGroup extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Sparkline
   */

  @VTID(11)
  RTExcelObj.Sparkline item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(13)
  RTExcelObj.Range location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory RTExcelObj.Range parameter.
   */

  @VTID(14)
  void location(
    RTExcelObj.Range rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(15)
  java.lang.String sourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(16)
  void sourceData(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DateRange"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  java.lang.String dateRange();


  /**
   * <p>
   * Setter method for the COM property "DateRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(18)
  void dateRange(
    java.lang.String rhs);


  /**
   * @param location Mandatory RTExcelObj.Range parameter.
   */

  @VTID(19)
  void modifyLocation(
    RTExcelObj.Range location);


  /**
   * @param sourceData Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void modifySourceData(
    java.lang.String sourceData);


  /**
   * @param location Mandatory RTExcelObj.Range parameter.
   * @param sourceData Mandatory java.lang.String parameter.
   */

  @VTID(21)
  void modify(
    RTExcelObj.Range location,
    java.lang.String sourceData);


  /**
   * @param dateRange Mandatory java.lang.String parameter.
   */

  @VTID(22)
  void modifyDateRange(
    java.lang.String dateRange);


  /**
   */

  @VTID(23)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSparkType
   */

  @VTID(24)
  RTExcelObj.XlSparkType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSparkType parameter.
   */

  @VTID(25)
  void type(
    RTExcelObj.XlSparkType rhs);


  /**
   * <p>
   * Getter method for the COM property "SeriesColor"
   * </p>
   * @return  Returns a value of type RTExcelObj.FormatColor
   */

  @VTID(26)
  RTExcelObj.FormatColor seriesColor();


  /**
   * <p>
   * Getter method for the COM property "Points"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkPoints
   */

  @VTID(27)
  RTExcelObj.SparkPoints points();


  /**
   * <p>
   * Getter method for the COM property "Axes"
   * </p>
   * @return  Returns a value of type RTExcelObj.SparkAxes
   */

  @VTID(28)
  RTExcelObj.SparkAxes axes();


  /**
   * <p>
   * Getter method for the COM property "DisplayBlanksAs"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlDisplayBlanksAs
   */

  @VTID(29)
  RTExcelObj.XlDisplayBlanksAs displayBlanksAs();


  /**
   * <p>
   * Setter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDisplayBlanksAs parameter.
   */

  @VTID(30)
  void displayBlanksAs(
    RTExcelObj.XlDisplayBlanksAs rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean displayHidden();


  /**
   * <p>
   * Setter method for the COM property "DisplayHidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void displayHidden(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LineWeight"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object lineWeight();


  /**
   * <p>
   * Setter method for the COM property "LineWeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(34)
  void lineWeight(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotBy"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSparklineRowCol
   */

  @VTID(35)
  RTExcelObj.XlSparklineRowCol plotBy();


  /**
   * <p>
   * Setter method for the COM property "PlotBy"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSparklineRowCol parameter.
   */

  @VTID(36)
  void plotBy(
    RTExcelObj.XlSparklineRowCol rhs);


  // Properties:
}

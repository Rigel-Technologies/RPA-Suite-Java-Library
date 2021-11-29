package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SparklineGroup extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  RTExcelObj.Sparkline item(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   */

  @DISPID(1397)
  @PropGet
  RTExcelObj.Range location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(1397)
  @PropPut
  void location(
    RTExcelObj.Range rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   */

  @DISPID(686)
  @PropGet
  java.lang.String sourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(686)
  @PropPut
  void sourceData(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DateRange"
   * </p>
   */

  @DISPID(2948)
  @PropGet
  java.lang.String dateRange();


  /**
   * <p>
   * Setter method for the COM property "DateRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2948)
  @PropPut
  void dateRange(
    java.lang.String rhs);


  /**
   * @param location Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(2949)
  void modifyLocation(
    RTExcelObj.Range location);


  /**
   * @param sourceData Mandatory java.lang.String parameter.
   */

  @DISPID(2950)
  void modifySourceData(
    java.lang.String sourceData);


  /**
   * @param location Mandatory RTExcelObj.Range parameter.
   * @param sourceData Mandatory java.lang.String parameter.
   */

  @DISPID(1581)
  void modify(
    RTExcelObj.Range location,
    java.lang.String sourceData);


  /**
   * @param dateRange Mandatory java.lang.String parameter.
   */

  @DISPID(2951)
  void modifyDateRange(
    java.lang.String dateRange);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlSparkType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSparkType parameter.
   */

  @DISPID(108)
  @PropPut
  void type(
    RTExcelObj.XlSparkType rhs);


  /**
   * <p>
   * Getter method for the COM property "SeriesColor"
   * </p>
   */

  @DISPID(2952)
  @PropGet
  RTExcelObj.FormatColor seriesColor();


  /**
   * <p>
   * Getter method for the COM property "Points"
   * </p>
   */

  @DISPID(70)
  @PropGet
  RTExcelObj.SparkPoints points();


  /**
   * <p>
   * Getter method for the COM property "Axes"
   * </p>
   */

  @DISPID(23)
  @PropGet
  RTExcelObj.SparkAxes axes();


  /**
   * <p>
   * Getter method for the COM property "DisplayBlanksAs"
   * </p>
   */

  @DISPID(93)
  @PropGet
  RTExcelObj.XlDisplayBlanksAs displayBlanksAs();


  /**
   * <p>
   * Setter method for the COM property "DisplayBlanksAs"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDisplayBlanksAs parameter.
   */

  @DISPID(93)
  @PropPut
  void displayBlanksAs(
    RTExcelObj.XlDisplayBlanksAs rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHidden"
   * </p>
   */

  @DISPID(2953)
  @PropGet
  boolean displayHidden();


  /**
   * <p>
   * Setter method for the COM property "DisplayHidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2953)
  @PropPut
  void displayHidden(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LineWeight"
   * </p>
   */

  @DISPID(2954)
  @PropGet
  java.lang.Object lineWeight();


  /**
   * <p>
   * Setter method for the COM property "LineWeight"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2954)
  @PropPut
  void lineWeight(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotBy"
   * </p>
   */

  @DISPID(202)
  @PropGet
  RTExcelObj.XlSparklineRowCol plotBy();


  /**
   * <p>
   * Setter method for the COM property "PlotBy"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSparklineRowCol parameter.
   */

  @DISPID(202)
  @PropPut
  void plotBy(
    RTExcelObj.XlSparklineRowCol rhs);


  // Properties:
}

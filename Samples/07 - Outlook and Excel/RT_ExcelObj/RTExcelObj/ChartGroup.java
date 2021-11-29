package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ChartGroup extends Com4jObject {
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
   * Getter method for the COM property "AxisGroup"
   * </p>
   */

  @DISPID(47)
  @PropGet
  RTExcelObj.XlAxisGroup axisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAxisGroup parameter.
   */

  @DISPID(47)
  @PropPut
  void axisGroup(
    RTExcelObj.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "DoughnutHoleSize"
   * </p>
   */

  @DISPID(1126)
  @PropGet
  int doughnutHoleSize();


  /**
   * <p>
   * Setter method for the COM property "DoughnutHoleSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1126)
  @PropPut
  void doughnutHoleSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DownBars"
   * </p>
   */

  @DISPID(141)
  @PropGet
  RTExcelObj.DownBars downBars();


  /**
   * <p>
   * Getter method for the COM property "DropLines"
   * </p>
   */

  @DISPID(142)
  @PropGet
  RTExcelObj.DropLines dropLines();


  /**
   * <p>
   * Getter method for the COM property "FirstSliceAngle"
   * </p>
   */

  @DISPID(63)
  @PropGet
  int firstSliceAngle();


  /**
   * <p>
   * Setter method for the COM property "FirstSliceAngle"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(63)
  @PropPut
  void firstSliceAngle(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GapWidth"
   * </p>
   */

  @DISPID(51)
  @PropGet
  int gapWidth();


  /**
   * <p>
   * Setter method for the COM property "GapWidth"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(51)
  @PropPut
  void gapWidth(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDropLines"
   * </p>
   */

  @DISPID(61)
  @PropGet
  boolean hasDropLines();


  /**
   * <p>
   * Setter method for the COM property "HasDropLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(61)
  @PropPut
  void hasDropLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasHiLoLines"
   * </p>
   */

  @DISPID(62)
  @PropGet
  boolean hasHiLoLines();


  /**
   * <p>
   * Setter method for the COM property "HasHiLoLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(62)
  @PropPut
  void hasHiLoLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasRadarAxisLabels"
   * </p>
   */

  @DISPID(64)
  @PropGet
  boolean hasRadarAxisLabels();


  /**
   * <p>
   * Setter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(64)
  @PropPut
  void hasRadarAxisLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasSeriesLines"
   * </p>
   */

  @DISPID(65)
  @PropGet
  boolean hasSeriesLines();


  /**
   * <p>
   * Setter method for the COM property "HasSeriesLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(65)
  @PropPut
  void hasSeriesLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasUpDownBars"
   * </p>
   */

  @DISPID(66)
  @PropGet
  boolean hasUpDownBars();


  /**
   * <p>
   * Setter method for the COM property "HasUpDownBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(66)
  @PropPut
  void hasUpDownBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiLoLines"
   * </p>
   */

  @DISPID(143)
  @PropGet
  RTExcelObj.HiLoLines hiLoLines();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int index();


  /**
   * <p>
   * Getter method for the COM property "Overlap"
   * </p>
   */

  @DISPID(56)
  @PropGet
  int overlap();


  /**
   * <p>
   * Setter method for the COM property "Overlap"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(56)
  @PropPut
  void overlap(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RadarAxisLabels"
   * </p>
   */

  @DISPID(144)
  @PropGet
  RTExcelObj.TickLabels radarAxisLabels();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(68)
  com4j.Com4jObject seriesCollection(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "SeriesLines"
   * </p>
   */

  @DISPID(145)
  @PropGet
  RTExcelObj.SeriesLines seriesLines();


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   */

  @DISPID(109)
  @PropGet
  int subType();


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(109)
  @PropPut
  void subType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(108)
  @PropPut
  void type(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "UpBars"
   * </p>
   */

  @DISPID(140)
  @PropGet
  RTExcelObj.UpBars upBars();


  /**
   * <p>
   * Getter method for the COM property "VaryByCategories"
   * </p>
   */

  @DISPID(60)
  @PropGet
  boolean varyByCategories();


  /**
   * <p>
   * Setter method for the COM property "VaryByCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(60)
  @PropPut
  void varyByCategories(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SizeRepresents"
   * </p>
   */

  @DISPID(1652)
  @PropGet
  RTExcelObj.XlSizeRepresents sizeRepresents();


  /**
   * <p>
   * Setter method for the COM property "SizeRepresents"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSizeRepresents parameter.
   */

  @DISPID(1652)
  @PropPut
  void sizeRepresents(
    RTExcelObj.XlSizeRepresents rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleScale"
   * </p>
   */

  @DISPID(1653)
  @PropGet
  int bubbleScale();


  /**
   * <p>
   * Setter method for the COM property "BubbleScale"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1653)
  @PropPut
  void bubbleScale(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowNegativeBubbles"
   * </p>
   */

  @DISPID(1654)
  @PropGet
  boolean showNegativeBubbles();


  /**
   * <p>
   * Setter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1654)
  @PropPut
  void showNegativeBubbles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitType"
   * </p>
   */

  @DISPID(1655)
  @PropGet
  RTExcelObj.XlChartSplitType splitType();


  /**
   * <p>
   * Setter method for the COM property "SplitType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlChartSplitType parameter.
   */

  @DISPID(1655)
  @PropPut
  void splitType(
    RTExcelObj.XlChartSplitType rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitValue"
   * </p>
   */

  @DISPID(1656)
  @PropGet
  java.lang.Object splitValue();


  /**
   * <p>
   * Setter method for the COM property "SplitValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1656)
  @PropPut
  void splitValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SecondPlotSize"
   * </p>
   */

  @DISPID(1657)
  @PropGet
  int secondPlotSize();


  /**
   * <p>
   * Setter method for the COM property "SecondPlotSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1657)
  @PropPut
  void secondPlotSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DShading"
   * </p>
   */

  @DISPID(1658)
  @PropGet
  boolean has3DShading();


  /**
   * <p>
   * Setter method for the COM property "Has3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1658)
  @PropPut
  void has3DShading(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3081)
  com4j.Com4jObject fullCategoryCollection(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3082)
  com4j.Com4jObject categoryCollection(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "BinsType"
   * </p>
   */

  @DISPID(3177)
  @PropGet
  RTExcelObj.XlBinsType binsType();


  /**
   * <p>
   * Setter method for the COM property "BinsType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlBinsType parameter.
   */

  @DISPID(3177)
  @PropPut
  void binsType(
    RTExcelObj.XlBinsType rhs);


  /**
   * <p>
   * Getter method for the COM property "BinWidthValue"
   * </p>
   */

  @DISPID(3178)
  @PropGet
  double binWidthValue();


  /**
   * <p>
   * Setter method for the COM property "BinWidthValue"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(3178)
  @PropPut
  void binWidthValue(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsCountValue"
   * </p>
   */

  @DISPID(3179)
  @PropGet
  int binsCountValue();


  /**
   * <p>
   * Setter method for the COM property "BinsCountValue"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(3179)
  @PropPut
  void binsCountValue(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsOverflowEnabled"
   * </p>
   */

  @DISPID(3180)
  @PropGet
  boolean binsOverflowEnabled();


  /**
   * <p>
   * Setter method for the COM property "BinsOverflowEnabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3180)
  @PropPut
  void binsOverflowEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsOverflowValue"
   * </p>
   */

  @DISPID(3181)
  @PropGet
  double binsOverflowValue();


  /**
   * <p>
   * Setter method for the COM property "BinsOverflowValue"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(3181)
  @PropPut
  void binsOverflowValue(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsUnderflowEnabled"
   * </p>
   */

  @DISPID(3182)
  @PropGet
  boolean binsUnderflowEnabled();


  /**
   * <p>
   * Setter method for the COM property "BinsUnderflowEnabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3182)
  @PropPut
  void binsUnderflowEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsUnderflowValue"
   * </p>
   */

  @DISPID(3183)
  @PropGet
  double binsUnderflowValue();


  /**
   * <p>
   * Setter method for the COM property "BinsUnderflowValue"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(3183)
  @PropPut
  void binsUnderflowValue(
    double rhs);


  // Properties:
}

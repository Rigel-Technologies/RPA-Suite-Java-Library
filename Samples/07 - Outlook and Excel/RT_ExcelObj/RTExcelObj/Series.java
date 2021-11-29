package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Series extends Com4jObject {
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
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(151)
  java.lang.Object _ApplyDataLabels(
    @Optional @DefaultValue("2") RTExcelObj.XlDataLabelsType type,
    @Optional java.lang.Object legendKey,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object hasLeaderLines);


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
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  RTExcelObj.Border border();


  /**
   */

  @DISPID(112)
  java.lang.Object clearFormats();


  /**
   */

  @DISPID(551)
  java.lang.Object copy();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(157)
  com4j.Com4jObject dataLabels(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   * @param direction Mandatory RTExcelObj.XlErrorBarDirection parameter.
   * @param include Mandatory RTExcelObj.XlErrorBarInclude parameter.
   * @param type Mandatory RTExcelObj.XlErrorBarType parameter.
   * @param amount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param minusValues Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(152)
  java.lang.Object errorBar(
    RTExcelObj.XlErrorBarDirection direction,
    RTExcelObj.XlErrorBarInclude include,
    RTExcelObj.XlErrorBarType type,
    @Optional java.lang.Object amount,
    @Optional java.lang.Object minusValues);


  /**
   * <p>
   * Getter method for the COM property "ErrorBars"
   * </p>
   */

  @DISPID(159)
  @PropGet
  RTExcelObj.ErrorBars errorBars();


  /**
   * <p>
   * Getter method for the COM property "Explosion"
   * </p>
   */

  @DISPID(182)
  @PropGet
  int explosion();


  /**
   * <p>
   * Setter method for the COM property "Explosion"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(182)
  @PropPut
  void explosion(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   */

  @DISPID(261)
  @PropGet
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(261)
  @PropPut
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaLocal"
   * </p>
   */

  @DISPID(263)
  @PropGet
  java.lang.String formulaLocal();


  /**
   * <p>
   * Setter method for the COM property "FormulaLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(263)
  @PropPut
  void formulaLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1"
   * </p>
   */

  @DISPID(264)
  @PropGet
  java.lang.String formulaR1C1();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(264)
  @PropPut
  void formulaR1C1(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FormulaR1C1Local"
   * </p>
   */

  @DISPID(265)
  @PropGet
  java.lang.String formulaR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "FormulaR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(265)
  @PropPut
  void formulaR1C1Local(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDataLabels"
   * </p>
   */

  @DISPID(78)
  @PropGet
  boolean hasDataLabels();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(78)
  @PropPut
  void hasDataLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasErrorBars"
   * </p>
   */

  @DISPID(160)
  @PropGet
  boolean hasErrorBars();


  /**
   * <p>
   * Setter method for the COM property "HasErrorBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(160)
  @PropPut
  void hasErrorBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   */

  @DISPID(1663)
  @PropGet
  RTExcelObj.ChartFillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "InvertIfNegative"
   * </p>
   */

  @DISPID(132)
  @PropGet
  boolean invertIfNegative();


  /**
   * <p>
   * Setter method for the COM property "InvertIfNegative"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(132)
  @PropPut
  void invertIfNegative(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColor"
   * </p>
   */

  @DISPID(73)
  @PropGet
  int markerBackgroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(73)
  @PropPut
  void markerBackgroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   */

  @DISPID(74)
  @PropGet
  RTExcelObj.XlColorIndex markerBackgroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerBackgroundColorIndex"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlColorIndex parameter.
   */

  @DISPID(74)
  @PropPut
  void markerBackgroundColorIndex(
    RTExcelObj.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColor"
   * </p>
   */

  @DISPID(75)
  @PropGet
  int markerForegroundColor();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(75)
  @PropPut
  void markerForegroundColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   */

  @DISPID(76)
  @PropGet
  RTExcelObj.XlColorIndex markerForegroundColorIndex();


  /**
   * <p>
   * Setter method for the COM property "MarkerForegroundColorIndex"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlColorIndex parameter.
   */

  @DISPID(76)
  @PropPut
  void markerForegroundColorIndex(
    RTExcelObj.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerSize"
   * </p>
   */

  @DISPID(231)
  @PropGet
  int markerSize();


  /**
   * <p>
   * Setter method for the COM property "MarkerSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(231)
  @PropPut
  void markerSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MarkerStyle"
   * </p>
   */

  @DISPID(72)
  @PropGet
  RTExcelObj.XlMarkerStyle markerStyle();


  /**
   * <p>
   * Setter method for the COM property "MarkerStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlMarkerStyle parameter.
   */

  @DISPID(72)
  @PropPut
  void markerStyle(
    RTExcelObj.XlMarkerStyle rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   */

  @DISPID(211)
  java.lang.Object paste();


  /**
   * <p>
   * Getter method for the COM property "PictureType"
   * </p>
   */

  @DISPID(161)
  @PropGet
  RTExcelObj.XlChartPictureType pictureType();


  /**
   * <p>
   * Setter method for the COM property "PictureType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlChartPictureType parameter.
   */

  @DISPID(161)
  @PropPut
  void pictureType(
    RTExcelObj.XlChartPictureType rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit"
   * </p>
   */

  @DISPID(162)
  @PropGet
  int pictureUnit();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(162)
  @PropPut
  void pictureUnit(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PlotOrder"
   * </p>
   */

  @DISPID(228)
  @PropGet
  int plotOrder();


  /**
   * <p>
   * Setter method for the COM property "PlotOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(228)
  @PropPut
  void plotOrder(
    int rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(70)
  com4j.Com4jObject points(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(235)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "Smooth"
   * </p>
   */

  @DISPID(163)
  @PropGet
  boolean smooth();


  /**
   * <p>
   * Setter method for the COM property "Smooth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(163)
  @PropPut
  void smooth(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(154)
  com4j.Com4jObject trendlines(
    @Optional java.lang.Object index);


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
   * Getter method for the COM property "ChartType"
   * </p>
   */

  @DISPID(1400)
  @PropGet
  RTExcelObj.XlChartType chartType();


  /**
   * <p>
   * Setter method for the COM property "ChartType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlChartType parameter.
   */

  @DISPID(1400)
  @PropPut
  void chartType(
    RTExcelObj.XlChartType rhs);


  /**
   * @param chartType Mandatory RTExcelObj.XlChartType parameter.
   */

  @DISPID(1401)
  void applyCustomType(
    RTExcelObj.XlChartType chartType);


  /**
   * <p>
   * Getter method for the COM property "Values"
   * </p>
   */

  @DISPID(164)
  @PropGet
  java.lang.Object values();


  /**
   * <p>
   * Setter method for the COM property "Values"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(164)
  @PropPut
  void values(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "XValues"
   * </p>
   */

  @DISPID(1111)
  @PropGet
  java.lang.Object xValues();


  /**
   * <p>
   * Setter method for the COM property "XValues"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1111)
  @PropPut
  void xValues(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleSizes"
   * </p>
   */

  @DISPID(1664)
  @PropGet
  java.lang.Object bubbleSizes();


  /**
   * <p>
   * Setter method for the COM property "BubbleSizes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1664)
  @PropPut
  void bubbleSizes(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BarShape"
   * </p>
   */

  @DISPID(1403)
  @PropGet
  RTExcelObj.XlBarShape barShape();


  /**
   * <p>
   * Setter method for the COM property "BarShape"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlBarShape parameter.
   */

  @DISPID(1403)
  @PropPut
  void barShape(
    RTExcelObj.XlBarShape rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToSides"
   * </p>
   */

  @DISPID(1659)
  @PropGet
  boolean applyPictToSides();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToSides"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1659)
  @PropPut
  void applyPictToSides(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToFront"
   * </p>
   */

  @DISPID(1660)
  @PropGet
  boolean applyPictToFront();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToFront"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1660)
  @PropPut
  void applyPictToFront(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ApplyPictToEnd"
   * </p>
   */

  @DISPID(1661)
  @PropGet
  boolean applyPictToEnd();


  /**
   * <p>
   * Setter method for the COM property "ApplyPictToEnd"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1661)
  @PropPut
  void applyPictToEnd(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DEffect"
   * </p>
   */

  @DISPID(1665)
  @PropGet
  boolean has3DEffect();


  /**
   * <p>
   * Setter method for the COM property "Has3DEffect"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1665)
  @PropPut
  void has3DEffect(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   */

  @DISPID(103)
  @PropGet
  boolean shadow();


  /**
   * <p>
   * Setter method for the COM property "Shadow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(103)
  @PropPut
  void shadow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasLeaderLines"
   * </p>
   */

  @DISPID(1394)
  @PropGet
  boolean hasLeaderLines();


  /**
   * <p>
   * Setter method for the COM property "HasLeaderLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1394)
  @PropPut
  void hasLeaderLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LeaderLines"
   * </p>
   */

  @DISPID(1666)
  @PropGet
  RTExcelObj.LeaderLines leaderLines();


  /**
   * @param type Optional parameter. Default value is 2
   * @param legendKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoText Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasLeaderLines Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showSeriesName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showCategoryName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showPercentage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showBubbleSize Optional parameter. Default value is com4j.Variant.getMissing()
   * @param separator Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1922)
  java.lang.Object applyDataLabels(
    @Optional @DefaultValue("2") RTExcelObj.XlDataLabelsType type,
    @Optional java.lang.Object legendKey,
    @Optional java.lang.Object autoText,
    @Optional java.lang.Object hasLeaderLines,
    @Optional java.lang.Object showSeriesName,
    @Optional java.lang.Object showCategoryName,
    @Optional java.lang.Object showValue,
    @Optional java.lang.Object showPercentage,
    @Optional java.lang.Object showBubbleSize,
    @Optional java.lang.Object separator);


  /**
   * <p>
   * Getter method for the COM property "PictureUnit2"
   * </p>
   */

  @DISPID(2649)
  @PropGet
  double pictureUnit2();


  /**
   * <p>
   * Setter method for the COM property "PictureUnit2"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2649)
  @PropPut
  void pictureUnit2(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   */

  @DISPID(116)
  @PropGet
  RTExcelObj.ChartFormat format();


  /**
   * <p>
   * Getter method for the COM property "PlotColorIndex"
   * </p>
   */

  @DISPID(2915)
  @PropGet
  int plotColorIndex();


  /**
   * <p>
   * Getter method for the COM property "InvertColor"
   * </p>
   */

  @DISPID(2916)
  @PropGet
  int invertColor();


  /**
   * <p>
   * Setter method for the COM property "InvertColor"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2916)
  @PropPut
  void invertColor(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "InvertColorIndex"
   * </p>
   */

  @DISPID(2917)
  @PropGet
  int invertColorIndex();


  /**
   * <p>
   * Setter method for the COM property "InvertColorIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2917)
  @PropPut
  void invertColorIndex(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "IsFiltered"
   * </p>
   */

  @DISPID(3083)
  @PropGet
  boolean isFiltered();


  /**
   * <p>
   * Setter method for the COM property "IsFiltered"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3083)
  @PropPut
  void isFiltered(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ParentDataLabelOption"
   * </p>
   */

  @DISPID(3185)
  @PropGet
  RTExcelObj.XlParentDataLabelOptions parentDataLabelOption();


  /**
   * <p>
   * Setter method for the COM property "ParentDataLabelOption"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlParentDataLabelOptions parameter.
   */

  @DISPID(3185)
  @PropPut
  void parentDataLabelOption(
    RTExcelObj.XlParentDataLabelOptions rhs);


  /**
   * <p>
   * Getter method for the COM property "QuartileCalculationInclusiveMedian"
   * </p>
   */

  @DISPID(3186)
  @PropGet
  boolean quartileCalculationInclusiveMedian();


  /**
   * <p>
   * Setter method for the COM property "QuartileCalculationInclusiveMedian"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3186)
  @PropPut
  void quartileCalculationInclusiveMedian(
    boolean rhs);


  // Properties:
}

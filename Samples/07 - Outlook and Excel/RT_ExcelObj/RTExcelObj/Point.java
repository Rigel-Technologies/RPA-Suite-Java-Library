package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Point extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "DataLabel"
   * </p>
   */

  @DISPID(158)
  @PropGet
  RTExcelObj.DataLabel dataLabel();


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


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
   * Getter method for the COM property "HasDataLabel"
   * </p>
   */

  @DISPID(77)
  @PropGet
  boolean hasDataLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDataLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(77)
  @PropPut
  void hasDataLabel(
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
   */

  @DISPID(235)
  java.lang.Object select();


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
   * Getter method for the COM property "SecondaryPlot"
   * </p>
   */

  @DISPID(1662)
  @PropGet
  boolean secondaryPlot();


  /**
   * <p>
   * Setter method for the COM property "SecondaryPlot"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1662)
  @PropPut
  void secondaryPlot(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   */

  @DISPID(1663)
  @PropGet
  RTExcelObj.ChartFillFormat fill();


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
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double height();


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
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double top();


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
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * @param loc Mandatory RTExcelObj.XlPieSliceLocation parameter.
   * @param index Optional parameter. Default value is 2
   */

  @DISPID(2913)
  double pieSliceLocation(
    RTExcelObj.XlPieSliceLocation loc,
    @Optional @DefaultValue("2") RTExcelObj.XlPieSliceIndex index);


  /**
   * <p>
   * Getter method for the COM property "IsTotal"
   * </p>
   */

  @DISPID(3184)
  @PropGet
  boolean isTotal();


  /**
   * <p>
   * Setter method for the COM property "IsTotal"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3184)
  @PropPut
  void isTotal(
    boolean rhs);


  // Properties:
}

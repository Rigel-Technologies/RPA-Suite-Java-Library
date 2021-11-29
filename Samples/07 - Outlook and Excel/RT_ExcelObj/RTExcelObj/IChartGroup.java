package RTExcelObj  ;

import com4j.*;

@IID("{00020859-0001-0000-C000-000000000046}")
public interface IChartGroup extends Com4jObject {
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
   * Getter method for the COM property "AxisGroup"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlAxisGroup
   */

  @VTID(10)
  RTExcelObj.XlAxisGroup axisGroup();


  /**
   * <p>
   * Setter method for the COM property "AxisGroup"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAxisGroup parameter.
   */

  @VTID(11)
  void axisGroup(
    RTExcelObj.XlAxisGroup rhs);


  /**
   * <p>
   * Getter method for the COM property "DoughnutHoleSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int doughnutHoleSize();


  /**
   * <p>
   * Setter method for the COM property "DoughnutHoleSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void doughnutHoleSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "DownBars"
   * </p>
   * @return  Returns a value of type RTExcelObj.DownBars
   */

  @VTID(14)
  RTExcelObj.DownBars downBars();


  /**
   * <p>
   * Getter method for the COM property "DropLines"
   * </p>
   * @return  Returns a value of type RTExcelObj.DropLines
   */

  @VTID(15)
  RTExcelObj.DropLines dropLines();


  /**
   * <p>
   * Getter method for the COM property "FirstSliceAngle"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int firstSliceAngle();


  /**
   * <p>
   * Setter method for the COM property "FirstSliceAngle"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(17)
  void firstSliceAngle(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "GapWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(18)
  int gapWidth();


  /**
   * <p>
   * Setter method for the COM property "GapWidth"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(19)
  void gapWidth(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDropLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean hasDropLines();


  /**
   * <p>
   * Setter method for the COM property "HasDropLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void hasDropLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasHiLoLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean hasHiLoLines();


  /**
   * <p>
   * Setter method for the COM property "HasHiLoLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void hasHiLoLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean hasRadarAxisLabels();


  /**
   * <p>
   * Setter method for the COM property "HasRadarAxisLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void hasRadarAxisLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasSeriesLines"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean hasSeriesLines();


  /**
   * <p>
   * Setter method for the COM property "HasSeriesLines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void hasSeriesLines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasUpDownBars"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean hasUpDownBars();


  /**
   * <p>
   * Setter method for the COM property "HasUpDownBars"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void hasUpDownBars(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiLoLines"
   * </p>
   * @return  Returns a value of type RTExcelObj.HiLoLines
   */

  @VTID(30)
  RTExcelObj.HiLoLines hiLoLines();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(31)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Overlap"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int overlap();


  /**
   * <p>
   * Setter method for the COM property "Overlap"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void overlap(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RadarAxisLabels"
   * </p>
   * @return  Returns a value of type RTExcelObj.TickLabels
   */

  @VTID(34)
  RTExcelObj.TickLabels radarAxisLabels();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(35)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject seriesCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "SeriesLines"
   * </p>
   * @return  Returns a value of type RTExcelObj.SeriesLines
   */

  @VTID(36)
  RTExcelObj.SeriesLines seriesLines();


  /**
   * <p>
   * Getter method for the COM property "SubType"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(37)
  int subType();


  /**
   * <p>
   * Setter method for the COM property "SubType"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(38)
  void subType(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(39)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(40)
  void type(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "UpBars"
   * </p>
   * @return  Returns a value of type RTExcelObj.UpBars
   */

  @VTID(41)
  RTExcelObj.UpBars upBars();


  /**
   * <p>
   * Getter method for the COM property "VaryByCategories"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(42)
  boolean varyByCategories();


  /**
   * <p>
   * Setter method for the COM property "VaryByCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(43)
  void varyByCategories(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SizeRepresents"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSizeRepresents
   */

  @VTID(44)
  RTExcelObj.XlSizeRepresents sizeRepresents();


  /**
   * <p>
   * Setter method for the COM property "SizeRepresents"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSizeRepresents parameter.
   */

  @VTID(45)
  void sizeRepresents(
    RTExcelObj.XlSizeRepresents rhs);


  /**
   * <p>
   * Getter method for the COM property "BubbleScale"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(46)
  int bubbleScale();


  /**
   * <p>
   * Setter method for the COM property "BubbleScale"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(47)
  void bubbleScale(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean showNegativeBubbles();


  /**
   * <p>
   * Setter method for the COM property "ShowNegativeBubbles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void showNegativeBubbles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlChartSplitType
   */

  @VTID(50)
  RTExcelObj.XlChartSplitType splitType();


  /**
   * <p>
   * Setter method for the COM property "SplitType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlChartSplitType parameter.
   */

  @VTID(51)
  void splitType(
    RTExcelObj.XlChartSplitType rhs);


  /**
   * <p>
   * Getter method for the COM property "SplitValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(52)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object splitValue();


  /**
   * <p>
   * Setter method for the COM property "SplitValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(53)
  void splitValue(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SecondPlotSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(54)
  int secondPlotSize();


  /**
   * <p>
   * Setter method for the COM property "SecondPlotSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(55)
  void secondPlotSize(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Has3DShading"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(56)
  boolean has3DShading();


  /**
   * <p>
   * Setter method for the COM property "Has3DShading"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(57)
  void has3DShading(
    boolean rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(58)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject fullCategoryCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(59)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject categoryCollection(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "BinsType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlBinsType
   */

  @VTID(60)
  RTExcelObj.XlBinsType binsType();


  /**
   * <p>
   * Setter method for the COM property "BinsType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlBinsType parameter.
   */

  @VTID(61)
  void binsType(
    RTExcelObj.XlBinsType rhs);


  /**
   * <p>
   * Getter method for the COM property "BinWidthValue"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(62)
  double binWidthValue();


  /**
   * <p>
   * Setter method for the COM property "BinWidthValue"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(63)
  void binWidthValue(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsCountValue"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(64)
  int binsCountValue();


  /**
   * <p>
   * Setter method for the COM property "BinsCountValue"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(65)
  void binsCountValue(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsOverflowEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(66)
  boolean binsOverflowEnabled();


  /**
   * <p>
   * Setter method for the COM property "BinsOverflowEnabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(67)
  void binsOverflowEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsOverflowValue"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(68)
  double binsOverflowValue();


  /**
   * <p>
   * Setter method for the COM property "BinsOverflowValue"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(69)
  void binsOverflowValue(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsUnderflowEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(70)
  boolean binsUnderflowEnabled();


  /**
   * <p>
   * Setter method for the COM property "BinsUnderflowEnabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(71)
  void binsUnderflowEnabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BinsUnderflowValue"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(72)
  double binsUnderflowValue();


  /**
   * <p>
   * Setter method for the COM property "BinsUnderflowValue"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @VTID(73)
  void binsUnderflowValue(
    double rhs);


  // Properties:
}

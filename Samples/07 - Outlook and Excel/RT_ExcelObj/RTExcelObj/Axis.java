package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Axis extends Com4jObject {
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
   * Getter method for the COM property "AxisBetweenCategories"
   * </p>
   */

  @DISPID(45)
  @PropGet
  boolean axisBetweenCategories();


  /**
   * <p>
   * Setter method for the COM property "AxisBetweenCategories"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(45)
  @PropPut
  void axisBetweenCategories(
    boolean rhs);


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
   * Getter method for the COM property "AxisTitle"
   * </p>
   */

  @DISPID(82)
  @PropGet
  RTExcelObj.AxisTitle axisTitle();


  /**
   * <p>
   * Getter method for the COM property "Border"
   * </p>
   */

  @DISPID(128)
  @PropGet
  RTExcelObj.Border border();


  /**
   * <p>
   * Getter method for the COM property "CategoryNames"
   * </p>
   */

  @DISPID(156)
  @PropGet
  java.lang.Object categoryNames();


  /**
   * <p>
   * Setter method for the COM property "CategoryNames"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(156)
  @PropPut
  void categoryNames(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Crosses"
   * </p>
   */

  @DISPID(42)
  @PropGet
  RTExcelObj.XlAxisCrosses crosses();


  /**
   * <p>
   * Setter method for the COM property "Crosses"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAxisCrosses parameter.
   */

  @DISPID(42)
  @PropPut
  void crosses(
    RTExcelObj.XlAxisCrosses rhs);


  /**
   * <p>
   * Getter method for the COM property "CrossesAt"
   * </p>
   */

  @DISPID(43)
  @PropGet
  double crossesAt();


  /**
   * <p>
   * Setter method for the COM property "CrossesAt"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(43)
  @PropPut
  void crossesAt(
    double rhs);


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "HasMajorGridlines"
   * </p>
   */

  @DISPID(24)
  @PropGet
  boolean hasMajorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMajorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(24)
  @PropPut
  void hasMajorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasMinorGridlines"
   * </p>
   */

  @DISPID(25)
  @PropGet
  boolean hasMinorGridlines();


  /**
   * <p>
   * Setter method for the COM property "HasMinorGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(25)
  @PropPut
  void hasMinorGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasTitle"
   * </p>
   */

  @DISPID(54)
  @PropGet
  boolean hasTitle();


  /**
   * <p>
   * Setter method for the COM property "HasTitle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(54)
  @PropPut
  void hasTitle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorGridlines"
   * </p>
   */

  @DISPID(89)
  @PropGet
  RTExcelObj.GridLines majorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MajorTickMark"
   * </p>
   */

  @DISPID(26)
  @PropGet
  RTExcelObj.XlTickMark majorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MajorTickMark"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTickMark parameter.
   */

  @DISPID(26)
  @PropPut
  void majorTickMark(
    RTExcelObj.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnit"
   * </p>
   */

  @DISPID(37)
  @PropGet
  double majorUnit();


  /**
   * <p>
   * Setter method for the COM property "MajorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(37)
  @PropPut
  void majorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitIsAuto"
   * </p>
   */

  @DISPID(38)
  @PropGet
  boolean majorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(38)
  @PropPut
  void majorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScale"
   * </p>
   */

  @DISPID(35)
  @PropGet
  double maximumScale();


  /**
   * <p>
   * Setter method for the COM property "MaximumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(35)
  @PropPut
  void maximumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MaximumScaleIsAuto"
   * </p>
   */

  @DISPID(36)
  @PropGet
  boolean maximumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MaximumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(36)
  @PropPut
  void maximumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScale"
   * </p>
   */

  @DISPID(33)
  @PropGet
  double minimumScale();


  /**
   * <p>
   * Setter method for the COM property "MinimumScale"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(33)
  @PropPut
  void minimumScale(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinimumScaleIsAuto"
   * </p>
   */

  @DISPID(34)
  @PropGet
  boolean minimumScaleIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinimumScaleIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(34)
  @PropPut
  void minimumScaleIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorGridlines"
   * </p>
   */

  @DISPID(90)
  @PropGet
  RTExcelObj.GridLines minorGridlines();


  /**
   * <p>
   * Getter method for the COM property "MinorTickMark"
   * </p>
   */

  @DISPID(27)
  @PropGet
  RTExcelObj.XlTickMark minorTickMark();


  /**
   * <p>
   * Setter method for the COM property "MinorTickMark"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTickMark parameter.
   */

  @DISPID(27)
  @PropPut
  void minorTickMark(
    RTExcelObj.XlTickMark rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnit"
   * </p>
   */

  @DISPID(39)
  @PropGet
  double minorUnit();


  /**
   * <p>
   * Setter method for the COM property "MinorUnit"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(39)
  @PropPut
  void minorUnit(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitIsAuto"
   * </p>
   */

  @DISPID(40)
  @PropGet
  boolean minorUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(40)
  @PropPut
  void minorUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ReversePlotOrder"
   * </p>
   */

  @DISPID(44)
  @PropGet
  boolean reversePlotOrder();


  /**
   * <p>
   * Setter method for the COM property "ReversePlotOrder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(44)
  @PropPut
  void reversePlotOrder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ScaleType"
   * </p>
   */

  @DISPID(41)
  @PropGet
  RTExcelObj.XlScaleType scaleType();


  /**
   * <p>
   * Setter method for the COM property "ScaleType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlScaleType parameter.
   */

  @DISPID(41)
  @PropPut
  void scaleType(
    RTExcelObj.XlScaleType rhs);


  /**
   */

  @DISPID(235)
  java.lang.Object select();


  /**
   * <p>
   * Getter method for the COM property "TickLabelPosition"
   * </p>
   */

  @DISPID(28)
  @PropGet
  RTExcelObj.XlTickLabelPosition tickLabelPosition();


  /**
   * <p>
   * Setter method for the COM property "TickLabelPosition"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTickLabelPosition parameter.
   */

  @DISPID(28)
  @PropPut
  void tickLabelPosition(
    RTExcelObj.XlTickLabelPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabels"
   * </p>
   */

  @DISPID(91)
  @PropGet
  RTExcelObj.TickLabels tickLabels();


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacing"
   * </p>
   */

  @DISPID(29)
  @PropGet
  int tickLabelSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(29)
  @PropPut
  void tickLabelSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TickMarkSpacing"
   * </p>
   */

  @DISPID(31)
  @PropGet
  int tickMarkSpacing();


  /**
   * <p>
   * Setter method for the COM property "TickMarkSpacing"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(31)
  @PropPut
  void tickMarkSpacing(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlAxisType type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAxisType parameter.
   */

  @DISPID(108)
  @PropPut
  void type(
    RTExcelObj.XlAxisType rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnit"
   * </p>
   */

  @DISPID(1647)
  @PropGet
  RTExcelObj.XlTimeUnit baseUnit();


  /**
   * <p>
   * Setter method for the COM property "BaseUnit"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTimeUnit parameter.
   */

  @DISPID(1647)
  @PropPut
  void baseUnit(
    RTExcelObj.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseUnitIsAuto"
   * </p>
   */

  @DISPID(1648)
  @PropGet
  boolean baseUnitIsAuto();


  /**
   * <p>
   * Setter method for the COM property "BaseUnitIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1648)
  @PropPut
  void baseUnitIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MajorUnitScale"
   * </p>
   */

  @DISPID(1649)
  @PropGet
  RTExcelObj.XlTimeUnit majorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MajorUnitScale"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTimeUnit parameter.
   */

  @DISPID(1649)
  @PropPut
  void majorUnitScale(
    RTExcelObj.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "MinorUnitScale"
   * </p>
   */

  @DISPID(1650)
  @PropGet
  RTExcelObj.XlTimeUnit minorUnitScale();


  /**
   * <p>
   * Setter method for the COM property "MinorUnitScale"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTimeUnit parameter.
   */

  @DISPID(1650)
  @PropPut
  void minorUnitScale(
    RTExcelObj.XlTimeUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "CategoryType"
   * </p>
   */

  @DISPID(1651)
  @PropGet
  RTExcelObj.XlCategoryType categoryType();


  /**
   * <p>
   * Setter method for the COM property "CategoryType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCategoryType parameter.
   */

  @DISPID(1651)
  @PropPut
  void categoryType(
    RTExcelObj.XlCategoryType rhs);


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
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  double top();


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
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  double height();


  /**
   * <p>
   * Getter method for the COM property "DisplayUnit"
   * </p>
   */

  @DISPID(1886)
  @PropGet
  RTExcelObj.XlDisplayUnit displayUnit();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnit"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDisplayUnit parameter.
   */

  @DISPID(1886)
  @PropPut
  void displayUnit(
    RTExcelObj.XlDisplayUnit rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitCustom"
   * </p>
   */

  @DISPID(1887)
  @PropGet
  double displayUnitCustom();


  /**
   * <p>
   * Setter method for the COM property "DisplayUnitCustom"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1887)
  @PropPut
  void displayUnitCustom(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "HasDisplayUnitLabel"
   * </p>
   */

  @DISPID(1888)
  @PropGet
  boolean hasDisplayUnitLabel();


  /**
   * <p>
   * Setter method for the COM property "HasDisplayUnitLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1888)
  @PropPut
  void hasDisplayUnitLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayUnitLabel"
   * </p>
   */

  @DISPID(1889)
  @PropGet
  RTExcelObj.DisplayUnitLabel displayUnitLabel();


  /**
   * <p>
   * Getter method for the COM property "LogBase"
   * </p>
   */

  @DISPID(2646)
  @PropGet
  double logBase();


  /**
   * <p>
   * Setter method for the COM property "LogBase"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(2646)
  @PropPut
  void logBase(
    double rhs);


  /**
   * <p>
   * Getter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   */

  @DISPID(2647)
  @PropGet
  boolean tickLabelSpacingIsAuto();


  /**
   * <p>
   * Setter method for the COM property "TickLabelSpacingIsAuto"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2647)
  @PropPut
  void tickLabelSpacingIsAuto(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   */

  @DISPID(116)
  @PropGet
  RTExcelObj.ChartFormat format();


  // Properties:
}

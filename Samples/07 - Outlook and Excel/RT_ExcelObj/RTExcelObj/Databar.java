package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Databar extends Com4jObject {
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
   * Getter method for the COM property "Priority"
   * </p>
   */

  @DISPID(985)
  @PropGet
  int priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(985)
  @PropPut
  void priority(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "StopIfTrue"
   * </p>
   */

  @DISPID(2625)
  @PropGet
  boolean stopIfTrue();


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   */

  @DISPID(2626)
  @PropGet
  RTExcelObj.Range appliesTo();


  /**
   * <p>
   * Getter method for the COM property "MinPoint"
   * </p>
   */

  @DISPID(2718)
  @PropGet
  RTExcelObj.ConditionValue minPoint();


  /**
   * <p>
   * Getter method for the COM property "MaxPoint"
   * </p>
   */

  @DISPID(2719)
  @PropGet
  RTExcelObj.ConditionValue maxPoint();


  /**
   * <p>
   * Getter method for the COM property "PercentMin"
   * </p>
   */

  @DISPID(2720)
  @PropGet
  int percentMin();


  /**
   * <p>
   * Setter method for the COM property "PercentMin"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2720)
  @PropPut
  void percentMin(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PercentMax"
   * </p>
   */

  @DISPID(2721)
  @PropGet
  int percentMax();


  /**
   * <p>
   * Setter method for the COM property "PercentMax"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2721)
  @PropPut
  void percentMax(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarColor"
   * </p>
   */

  @DISPID(2722)
  @PropGet
  com4j.Com4jObject barColor();


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   */

  @DISPID(2024)
  @PropGet
  boolean showValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2024)
  @PropPut
  void showValue(
    boolean rhs);


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
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int type();


  /**
   */

  @DISPID(2629)
  void setFirstPriority();


  /**
   */

  @DISPID(2630)
  void setLastPriority();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(2627)
  void modifyAppliesToRange(
    RTExcelObj.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   */

  @DISPID(2631)
  @PropGet
  boolean ptCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   */

  @DISPID(2615)
  @PropGet
  RTExcelObj.XlPivotConditionScope scopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotConditionScope parameter.
   */

  @DISPID(2615)
  @PropPut
  void scopeType(
    RTExcelObj.XlPivotConditionScope rhs);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   */

  @DISPID(168)
  @PropGet
  int direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(168)
  @PropPut
  void direction(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarFillType"
   * </p>
   */

  @DISPID(2941)
  @PropGet
  RTExcelObj.XlDataBarFillType barFillType();


  /**
   * <p>
   * Setter method for the COM property "BarFillType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarFillType parameter.
   */

  @DISPID(2941)
  @PropPut
  void barFillType(
    RTExcelObj.XlDataBarFillType rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisPosition"
   * </p>
   */

  @DISPID(2942)
  @PropGet
  RTExcelObj.XlDataBarAxisPosition axisPosition();


  /**
   * <p>
   * Setter method for the COM property "AxisPosition"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarAxisPosition parameter.
   */

  @DISPID(2942)
  @PropPut
  void axisPosition(
    RTExcelObj.XlDataBarAxisPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisColor"
   * </p>
   */

  @DISPID(2943)
  @PropGet
  com4j.Com4jObject axisColor();


  /**
   * <p>
   * Getter method for the COM property "BarBorder"
   * </p>
   */

  @DISPID(2944)
  @PropGet
  RTExcelObj.DataBarBorder barBorder();


  /**
   * <p>
   * Getter method for the COM property "NegativeBarFormat"
   * </p>
   */

  @DISPID(2945)
  @PropGet
  RTExcelObj.NegativeBarFormat negativeBarFormat();


  // Properties:
}

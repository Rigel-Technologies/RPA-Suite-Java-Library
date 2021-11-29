package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Top10 extends Com4jObject {
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
   * Setter method for the COM property "StopIfTrue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2625)
  @PropPut
  void stopIfTrue(
    boolean rhs);


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
   * Getter method for the COM property "TopBottom"
   * </p>
   */

  @DISPID(2728)
  @PropGet
  RTExcelObj.XlTopBottom topBottom();


  /**
   * <p>
   * Setter method for the COM property "TopBottom"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTopBottom parameter.
   */

  @DISPID(2728)
  @PropPut
  void topBottom(
    RTExcelObj.XlTopBottom rhs);


  /**
   * <p>
   * Getter method for the COM property "Rank"
   * </p>
   */

  @DISPID(1290)
  @PropGet
  int rank();


  /**
   * <p>
   * Setter method for the COM property "Rank"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1290)
  @PropPut
  void rank(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Percent"
   * </p>
   */

  @DISPID(2729)
  @PropGet
  boolean percent();


  /**
   * <p>
   * Setter method for the COM property "Percent"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2729)
  @PropPut
  void percent(
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
   * Getter method for the COM property "Borders"
   * </p>
   */

  @DISPID(435)
  @PropGet
  RTExcelObj.Borders borders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  RTExcelObj.Font font();


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
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  java.lang.Object numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(193)
  @PropPut
  void numberFormat(
    java.lang.Object rhs);


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
   * Getter method for the COM property "CalcFor"
   * </p>
   */

  @DISPID(2730)
  @PropGet
  RTExcelObj.XlCalcFor calcFor();


  /**
   * <p>
   * Setter method for the COM property "CalcFor"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCalcFor parameter.
   */

  @DISPID(2730)
  @PropPut
  void calcFor(
    RTExcelObj.XlCalcFor rhs);


  // Properties:
}

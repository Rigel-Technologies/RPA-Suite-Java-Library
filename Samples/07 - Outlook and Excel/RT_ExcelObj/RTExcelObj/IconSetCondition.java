package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface IconSetCondition extends Com4jObject {
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
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  int type();


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
   * <p>
   * Getter method for the COM property "ReverseOrder"
   * </p>
   */

  @DISPID(2723)
  @PropGet
  boolean reverseOrder();


  /**
   * <p>
   * Setter method for the COM property "ReverseOrder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2723)
  @PropPut
  void reverseOrder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PercentileValues"
   * </p>
   */

  @DISPID(2724)
  @PropGet
  boolean percentileValues();


  /**
   * <p>
   * Setter method for the COM property "PercentileValues"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2724)
  @PropPut
  void percentileValues(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowIconOnly"
   * </p>
   */

  @DISPID(2725)
  @PropGet
  boolean showIconOnly();


  /**
   * <p>
   * Setter method for the COM property "ShowIconOnly"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2725)
  @PropPut
  void showIconOnly(
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
   * Getter method for the COM property "IconSet"
   * </p>
   */

  @DISPID(2726)
  @PropGet
  java.lang.Object iconSet();


  /**
   * <p>
   * Setter method for the COM property "IconSet"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2726)
  @PropPut
  void iconSet(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "IconCriteria"
   * </p>
   */

  @DISPID(2727)
  @PropGet
  RTExcelObj.IconCriteria iconCriteria();


  // Properties:
}

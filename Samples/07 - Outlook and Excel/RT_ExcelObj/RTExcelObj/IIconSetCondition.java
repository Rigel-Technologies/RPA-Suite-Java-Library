package RTExcelObj  ;

import com4j.*;

@IID("{00024497-0001-0000-C000-000000000046}")
public interface IIconSetCondition extends Com4jObject {
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
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(11)
  void priority(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "StopIfTrue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean stopIfTrue();


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(13)
  RTExcelObj.Range appliesTo();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int type();


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @VTID(15)
  void modifyAppliesToRange(
    RTExcelObj.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean ptCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotConditionScope
   */

  @VTID(17)
  RTExcelObj.XlPivotConditionScope scopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotConditionScope parameter.
   */

  @VTID(18)
  void scopeType(
    RTExcelObj.XlPivotConditionScope rhs);


  /**
   */

  @VTID(19)
  void setFirstPriority();


  /**
   */

  @VTID(20)
  void setLastPriority();


  /**
   */

  @VTID(21)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "ReverseOrder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean reverseOrder();


  /**
   * <p>
   * Setter method for the COM property "ReverseOrder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void reverseOrder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PercentileValues"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean percentileValues();


  /**
   * <p>
   * Setter method for the COM property "PercentileValues"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void percentileValues(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowIconOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean showIconOnly();


  /**
   * <p>
   * Setter method for the COM property "ShowIconOnly"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void showIconOnly(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(28)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(29)
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IconSet"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(30)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object iconSet();


  /**
   * <p>
   * Setter method for the COM property "IconSet"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(31)
  void iconSet(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "IconCriteria"
   * </p>
   * @return  Returns a value of type RTExcelObj.IconCriteria
   */

  @VTID(32)
  RTExcelObj.IconCriteria iconCriteria();


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00024496-0001-0000-C000-000000000046}")
public interface IDatabar extends Com4jObject {
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
   * Getter method for the COM property "MinPoint"
   * </p>
   * @return  Returns a value of type RTExcelObj.ConditionValue
   */

  @VTID(14)
  RTExcelObj.ConditionValue minPoint();


  /**
   * <p>
   * Getter method for the COM property "MaxPoint"
   * </p>
   * @return  Returns a value of type RTExcelObj.ConditionValue
   */

  @VTID(15)
  RTExcelObj.ConditionValue maxPoint();


  /**
   * <p>
   * Getter method for the COM property "PercentMin"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int percentMin();


  /**
   * <p>
   * Setter method for the COM property "PercentMin"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(17)
  void percentMin(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PercentMax"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(18)
  int percentMax();


  /**
   * <p>
   * Setter method for the COM property "PercentMax"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(19)
  void percentMax(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarColor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject barColor();


  /**
   * <p>
   * Getter method for the COM property "ShowValue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean showValue();


  /**
   * <p>
   * Setter method for the COM property "ShowValue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void showValue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(25)
  int type();


  /**
   */

  @VTID(26)
  void setFirstPriority();


  /**
   */

  @VTID(27)
  void setLastPriority();


  /**
   */

  @VTID(28)
  void delete();


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @VTID(29)
  void modifyAppliesToRange(
    RTExcelObj.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean ptCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotConditionScope
   */

  @VTID(31)
  RTExcelObj.XlPivotConditionScope scopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotConditionScope parameter.
   */

  @VTID(32)
  void scopeType(
    RTExcelObj.XlPivotConditionScope rhs);


  /**
   * <p>
   * Getter method for the COM property "Direction"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(33)
  int direction();


  /**
   * <p>
   * Setter method for the COM property "Direction"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(34)
  void direction(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "BarFillType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlDataBarFillType
   */

  @VTID(35)
  RTExcelObj.XlDataBarFillType barFillType();


  /**
   * <p>
   * Setter method for the COM property "BarFillType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarFillType parameter.
   */

  @VTID(36)
  void barFillType(
    RTExcelObj.XlDataBarFillType rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisPosition"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlDataBarAxisPosition
   */

  @VTID(37)
  RTExcelObj.XlDataBarAxisPosition axisPosition();


  /**
   * <p>
   * Setter method for the COM property "AxisPosition"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarAxisPosition parameter.
   */

  @VTID(38)
  void axisPosition(
    RTExcelObj.XlDataBarAxisPosition rhs);


  /**
   * <p>
   * Getter method for the COM property "AxisColor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(39)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject axisColor();


  /**
   * <p>
   * Getter method for the COM property "BarBorder"
   * </p>
   * @return  Returns a value of type RTExcelObj.DataBarBorder
   */

  @VTID(40)
  RTExcelObj.DataBarBorder barBorder();


  /**
   * <p>
   * Getter method for the COM property "NegativeBarFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.NegativeBarFormat
   */

  @VTID(41)
  RTExcelObj.NegativeBarFormat negativeBarFormat();


  // Properties:
}

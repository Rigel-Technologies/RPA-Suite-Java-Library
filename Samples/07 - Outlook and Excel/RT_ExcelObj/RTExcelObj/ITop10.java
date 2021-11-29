package RTExcelObj  ;

import com4j.*;

@IID("{0002449D-0001-0000-C000-000000000046}")
public interface ITop10 extends Com4jObject {
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
   * Setter method for the COM property "StopIfTrue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void stopIfTrue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(14)
  RTExcelObj.Range appliesTo();


  /**
   * <p>
   * Getter method for the COM property "TopBottom"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTopBottom
   */

  @VTID(15)
  RTExcelObj.XlTopBottom topBottom();


  /**
   * <p>
   * Setter method for the COM property "TopBottom"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTopBottom parameter.
   */

  @VTID(16)
  void topBottom(
    RTExcelObj.XlTopBottom rhs);


  /**
   * <p>
   * Getter method for the COM property "Rank"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int rank();


  /**
   * <p>
   * Setter method for the COM property "Rank"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(18)
  void rank(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Percent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean percent();


  /**
   * <p>
   * Setter method for the COM property "Percent"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(20)
  void percent(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type RTExcelObj.Interior
   */

  @VTID(21)
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type RTExcelObj.Borders
   */

  @VTID(22)
  RTExcelObj.Borders borders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type RTExcelObj.Font
   */

  @VTID(23)
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(24)
  int type();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(25)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(26)
  void numberFormat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @VTID(27)
  void setFirstPriority();


  /**
   */

  @VTID(28)
  void setLastPriority();


  /**
   */

  @VTID(29)
  void delete();


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @VTID(30)
  void modifyAppliesToRange(
    RTExcelObj.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean ptCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotConditionScope
   */

  @VTID(32)
  RTExcelObj.XlPivotConditionScope scopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotConditionScope parameter.
   */

  @VTID(33)
  void scopeType(
    RTExcelObj.XlPivotConditionScope rhs);


  /**
   * <p>
   * Getter method for the COM property "CalcFor"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCalcFor
   */

  @VTID(34)
  RTExcelObj.XlCalcFor calcFor();


  /**
   * <p>
   * Setter method for the COM property "CalcFor"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCalcFor parameter.
   */

  @VTID(35)
  void calcFor(
    RTExcelObj.XlCalcFor rhs);


  // Properties:
}

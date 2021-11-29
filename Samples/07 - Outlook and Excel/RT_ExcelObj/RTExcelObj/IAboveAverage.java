package RTExcelObj  ;

import com4j.*;

@IID("{0002449E-0001-0000-C000-000000000046}")
public interface IAboveAverage extends Com4jObject {
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
   * Getter method for the COM property "AboveBelow"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlAboveBelow
   */

  @VTID(15)
  RTExcelObj.XlAboveBelow aboveBelow();


  /**
   * <p>
   * Setter method for the COM property "AboveBelow"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAboveBelow parameter.
   */

  @VTID(16)
  void aboveBelow(
    RTExcelObj.XlAboveBelow rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type RTExcelObj.Interior
   */

  @VTID(17)
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type RTExcelObj.Borders
   */

  @VTID(18)
  RTExcelObj.Borders borders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type RTExcelObj.Font
   */

  @VTID(19)
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(20)
  int type();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(22)
  void numberFormat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   */

  @VTID(23)
  void setFirstPriority();


  /**
   */

  @VTID(24)
  void setLastPriority();


  /**
   */

  @VTID(25)
  void delete();


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @VTID(26)
  void modifyAppliesToRange(
    RTExcelObj.Range range);


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(27)
  boolean ptCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotConditionScope
   */

  @VTID(28)
  RTExcelObj.XlPivotConditionScope scopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotConditionScope parameter.
   */

  @VTID(29)
  void scopeType(
    RTExcelObj.XlPivotConditionScope rhs);


  /**
   * <p>
   * Getter method for the COM property "CalcFor"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCalcFor
   */

  @VTID(30)
  RTExcelObj.XlCalcFor calcFor();


  /**
   * <p>
   * Setter method for the COM property "CalcFor"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCalcFor parameter.
   */

  @VTID(31)
  void calcFor(
    RTExcelObj.XlCalcFor rhs);


  /**
   * <p>
   * Getter method for the COM property "NumStdDev"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int numStdDev();


  /**
   * <p>
   * Setter method for the COM property "NumStdDev"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void numStdDev(
    int rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00024425-0001-0000-C000-000000000046}")
public interface IFormatCondition extends Com4jObject {
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
   * @param type Mandatory RTExcelObj.XlFormatConditionType parameter.
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(10)
  void _Modify(
    RTExcelObj.XlFormatConditionType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object operator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula2);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int type();


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int operator();


  /**
   * <p>
   * Getter method for the COM property "Formula1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String formula1();


  /**
   * <p>
   * Getter method for the COM property "Formula2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String formula2();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type RTExcelObj.Interior
   */

  @VTID(15)
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type RTExcelObj.Borders
   */

  @VTID(16)
  RTExcelObj.Borders borders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type RTExcelObj.Font
   */

  @VTID(17)
  RTExcelObj.Font font();


  /**
   */

  @VTID(18)
  void delete();


  /**
   * @param type Mandatory RTExcelObj.XlFormatConditionType parameter.
   * @param operator Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param formula2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param string Optional parameter. Default value is com4j.Variant.getMissing()
   * @param operator2 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(19)
  void modify(
    RTExcelObj.XlFormatConditionType type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object operator,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object formula2,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object string,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object operator2);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(20)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(21)
  void text(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextOperator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlContainsOperator
   */

  @VTID(22)
  RTExcelObj.XlContainsOperator textOperator();


  /**
   * <p>
   * Setter method for the COM property "TextOperator"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlContainsOperator parameter.
   */

  @VTID(23)
  void textOperator(
    RTExcelObj.XlContainsOperator rhs);


  /**
   * <p>
   * Getter method for the COM property "DateOperator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTimePeriods
   */

  @VTID(24)
  RTExcelObj.XlTimePeriods dateOperator();


  /**
   * <p>
   * Setter method for the COM property "DateOperator"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTimePeriods parameter.
   */

  @VTID(25)
  void dateOperator(
    RTExcelObj.XlTimePeriods rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(26)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(27)
  void numberFormat(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(28)
  int priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(29)
  void priority(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "StopIfTrue"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean stopIfTrue();


  /**
   * <p>
   * Setter method for the COM property "StopIfTrue"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void stopIfTrue(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AppliesTo"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(32)
  RTExcelObj.Range appliesTo();


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @VTID(33)
  void modifyAppliesToRange(
    RTExcelObj.Range range);


  /**
   */

  @VTID(34)
  void setFirstPriority();


  /**
   */

  @VTID(35)
  void setLastPriority();


  /**
   * <p>
   * Getter method for the COM property "PTCondition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean ptCondition();


  /**
   * <p>
   * Getter method for the COM property "ScopeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotConditionScope
   */

  @VTID(37)
  RTExcelObj.XlPivotConditionScope scopeType();


  /**
   * <p>
   * Setter method for the COM property "ScopeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotConditionScope parameter.
   */

  @VTID(38)
  void scopeType(
    RTExcelObj.XlPivotConditionScope rhs);


  // Properties:
}

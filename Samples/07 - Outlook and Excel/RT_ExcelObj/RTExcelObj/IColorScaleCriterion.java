package RTExcelObj  ;

import com4j.*;

@IID("{00024495-0001-0000-C000-000000000046}")
public interface IColorScaleCriterion extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(7)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlConditionValueTypes
   */

  @VTID(8)
  RTExcelObj.XlConditionValueTypes type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlConditionValueTypes parameter.
   */

  @VTID(9)
  void type(
    RTExcelObj.XlConditionValueTypes rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(11)
  void value(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormatColor"
   * </p>
   * @return  Returns a value of type RTExcelObj.FormatColor
   */

  @VTID(12)
  RTExcelObj.FormatColor formatColor();


  // Properties:
}

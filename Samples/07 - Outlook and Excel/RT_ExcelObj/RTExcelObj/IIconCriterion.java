package RTExcelObj  ;

import com4j.*;

@IID("{00024499-0001-0000-C000-000000000046}")
public interface IIconCriterion extends Com4jObject {
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
   * Getter method for the COM property "Operator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int operator();


  /**
   * <p>
   * Setter method for the COM property "Operator"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void operator(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Icon"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlIcon
   */

  @VTID(14)
  RTExcelObj.XlIcon icon();


  /**
   * <p>
   * Setter method for the COM property "Icon"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlIcon parameter.
   */

  @VTID(15)
  void icon(
    RTExcelObj.XlIcon rhs);


  // Properties:
}

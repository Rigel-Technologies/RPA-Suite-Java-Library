package RTExcelObj  ;

import com4j.*;

@IID("{00024434-0001-0000-C000-000000000046}")
public interface IFilter extends Com4jObject {
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
   * Getter method for the COM property "On"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean on();


  /**
   * <p>
   * Getter method for the COM property "Criteria1"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object criteria1();


  /**
   * <p>
   * Getter method for the COM property "_Operator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlAutoFilterOperator
   */

  @VTID(12)
  RTExcelObj.XlAutoFilterOperator _Operator();


  /**
   * <p>
   * Getter method for the COM property "Criteria2"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object criteria2();


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlAutoFilterOperator
   */

  @VTID(14)
  RTExcelObj.XlAutoFilterOperator operator();


  /**
   * <p>
   * Setter method for the COM property "Operator"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAutoFilterOperator parameter.
   */

  @VTID(15)
  void operator(
    RTExcelObj.XlAutoFilterOperator rhs);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int count();


  // Properties:
}

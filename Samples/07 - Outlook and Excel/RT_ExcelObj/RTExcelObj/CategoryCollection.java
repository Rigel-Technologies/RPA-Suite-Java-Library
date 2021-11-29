package RTExcelObj  ;

import com4j.*;

@IID("{000C1734-0000-0000-C000-000000000046}")
public interface CategoryCollection extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(7)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(8)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.IMsoCategory
   */

  @VTID(9)
  RTExcelObj.IMsoCategory item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int creator();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.IMsoCategory
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.IMsoCategory _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}

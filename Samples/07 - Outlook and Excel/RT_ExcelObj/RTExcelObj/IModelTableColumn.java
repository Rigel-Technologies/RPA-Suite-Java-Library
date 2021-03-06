package RTExcelObj  ;

import com4j.*;

@IID("{000244D5-0001-0000-C000-000000000046}")
public interface IModelTableColumn extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "DataType"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int dataType();


  /**
   * @param newName Mandatory java.lang.String parameter.
   */

  @VTID(12)
  void dummy1(
    java.lang.String newName);


  // Properties:
}

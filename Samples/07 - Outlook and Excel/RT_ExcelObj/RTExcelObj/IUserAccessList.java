package RTExcelObj  ;

import com4j.*;

@IID("{0002446C-0001-0000-C000-000000000046}")
public interface IUserAccessList extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(7)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.UserAccess
   */

  @VTID(8)
  RTExcelObj.UserAccess item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param allowEdit Mandatory boolean parameter.
   * @return  Returns a value of type RTExcelObj.UserAccess
   */

  @VTID(9)
  RTExcelObj.UserAccess add(
    java.lang.String name,
    boolean allowEdit);


  /**
   */

  @VTID(10)
  void deleteAll();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.UserAccess
   */

  @VTID(11)
  @DefaultMethod
  RTExcelObj.UserAccess _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(12)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

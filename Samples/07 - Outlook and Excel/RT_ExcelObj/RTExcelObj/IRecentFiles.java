package RTExcelObj  ;

import com4j.*;

@IID("{00024406-0001-0000-C000-000000000046}")
public interface IRecentFiles extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Maximum"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int maximum();


  /**
   * <p>
   * Setter method for the COM property "Maximum"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(11)
  void maximum(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.RecentFile
   */

  @VTID(13)
  RTExcelObj.RecentFile item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.RecentFile
   */

  @VTID(14)
  @DefaultMethod
  RTExcelObj.RecentFile _Default(
    int index);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type RTExcelObj.RecentFile
   */

  @VTID(15)
  RTExcelObj.RecentFile add(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(16)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

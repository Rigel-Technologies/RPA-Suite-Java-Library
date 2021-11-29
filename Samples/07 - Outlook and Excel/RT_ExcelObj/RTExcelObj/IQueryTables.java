package RTExcelObj  ;

import com4j.*;

@IID("{00024429-0001-0000-C000-000000000046}")
public interface IQueryTables extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int count();


  /**
   * @param connection Mandatory java.lang.Object parameter.
   * @param destination Mandatory RTExcelObj.Range parameter.
   * @param sql Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj._QueryTable
   */

  @VTID(11)
  RTExcelObj._QueryTable add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object connection,
    RTExcelObj.Range destination,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object sql);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj._QueryTable
   */

  @VTID(12)
  RTExcelObj._QueryTable item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj._QueryTable
   */

  @VTID(13)
  @DefaultMethod
  RTExcelObj._QueryTable _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

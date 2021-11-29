package RTExcelObj  ;

import com4j.*;

@IID("{000244B5-0001-0000-C000-000000000046}")
public interface IAddIns2 extends Com4jObject,Iterable<Com4jObject> {
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
   * @param filename Mandatory java.lang.String parameter.
   * @param copyFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.AddIn
   */

  @VTID(10)
  RTExcelObj.AddIn add(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copyFile);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.AddIn
   */

  @VTID(12)
  RTExcelObj.AddIn item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.AddIn
   */

  @VTID(14)
  @DefaultMethod
  RTExcelObj.AddIn _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  // Properties:
}

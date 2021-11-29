package RTExcelObj  ;

import com4j.*;

@IID("{0002442B-0001-0000-C000-000000000046}")
public interface IParameters extends Com4jObject,Iterable<Com4jObject> {
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
   * @param name Mandatory java.lang.String parameter.
   * @param iDataType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Parameter
   */

  @VTID(10)
  RTExcelObj.Parameter add(
    java.lang.String name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object iDataType);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Parameter
   */

  @VTID(12)
  RTExcelObj.Parameter item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Parameter
   */

  @VTID(13)
  @DefaultMethod
  RTExcelObj.Parameter _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(14)
  void delete();


  /**
   */

  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

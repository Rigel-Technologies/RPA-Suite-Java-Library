package RTExcelObj  ;

import com4j.*;

@IID("{000244C3-0001-0000-C000-000000000046}")
public interface ISlicerCaches extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.SlicerCache
   */

  @VTID(11)
  RTExcelObj.SlicerCache item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.SlicerCache
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.SlicerCache _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param sourceField Mandatory java.lang.Object parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.SlicerCache
   */

  @VTID(14)
  RTExcelObj.SlicerCache add(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @MarshalAs(NativeType.VARIANT) java.lang.Object sourceField,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param sourceField Mandatory java.lang.Object parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param slicerCacheType Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.SlicerCache
   */

  @VTID(15)
  RTExcelObj.SlicerCache add2(
    @MarshalAs(NativeType.VARIANT) java.lang.Object source,
    @MarshalAs(NativeType.VARIANT) java.lang.Object sourceField,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object slicerCacheType);


  // Properties:
}

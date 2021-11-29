package RTExcelObj  ;

import com4j.*;

@IID("{000244C5-0001-0000-C000-000000000046}")
public interface ISlicerCacheLevels extends Com4jObject,Iterable<Com4jObject> {
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
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.SlicerCacheLevel
   */

  @VTID(11)
  RTExcelObj.SlicerCacheLevel item(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object level);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param level Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.SlicerCacheLevel
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.SlicerCacheLevel _Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object level);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

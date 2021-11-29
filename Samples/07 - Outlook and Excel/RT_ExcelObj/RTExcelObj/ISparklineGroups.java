package RTExcelObj  ;

import com4j.*;

@IID("{000244B6-0001-0000-C000-000000000046}")
public interface ISparklineGroups extends Com4jObject,Iterable<Com4jObject> {
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
   * @param type Mandatory RTExcelObj.XlSparkType parameter.
   * @param sourceData Mandatory java.lang.String parameter.
   * @return  Returns a value of type RTExcelObj.SparklineGroup
   */

  @VTID(10)
  RTExcelObj.SparklineGroup add(
    RTExcelObj.XlSparkType type,
    java.lang.String sourceData);


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
   * @return  Returns a value of type RTExcelObj.SparklineGroup
   */

  @VTID(12)
  RTExcelObj.SparklineGroup item(
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
   * @return  Returns a value of type RTExcelObj.SparklineGroup
   */

  @VTID(14)
  @DefaultMethod
  RTExcelObj.SparklineGroup _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(15)
  void clear();


  /**
   */

  @VTID(16)
  void clearGroups();


  /**
   * @param location Mandatory RTExcelObj.Range parameter.
   */

  @VTID(17)
  void group(
    RTExcelObj.Range location);


  /**
   */

  @VTID(18)
  void ungroup();


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00024486-0001-0000-C000-000000000046}")
public interface IConnections extends Com4jObject,Iterable<Com4jObject> {
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
   * @param filename Mandatory java.lang.String parameter.
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(11)
  RTExcelObj.WorkbookConnection _AddFromFile(
    java.lang.String filename);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param connectionString Mandatory java.lang.Object parameter.
   * @param commandText Mandatory java.lang.Object parameter.
   * @param lCmdtype Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(12)
  RTExcelObj.WorkbookConnection add(
    java.lang.String name,
    java.lang.String description,
    @MarshalAs(NativeType.VARIANT) java.lang.Object connectionString,
    @MarshalAs(NativeType.VARIANT) java.lang.Object commandText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lCmdtype);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(13)
  RTExcelObj.WorkbookConnection item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(14)
  @DefaultMethod
  RTExcelObj.WorkbookConnection _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(15)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param name Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param connectionString Mandatory java.lang.Object parameter.
   * @param commandText Mandatory java.lang.Object parameter.
   * @param lCmdtype Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createModelConnection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param importRelationships Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(16)
  RTExcelObj.WorkbookConnection add2(
    java.lang.String name,
    java.lang.String description,
    @MarshalAs(NativeType.VARIANT) java.lang.Object connectionString,
    @MarshalAs(NativeType.VARIANT) java.lang.Object commandText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object lCmdtype,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createModelConnection,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object importRelationships);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param createModelConnection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param importRelationships Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(17)
  RTExcelObj.WorkbookConnection addFromFile(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createModelConnection,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object importRelationships);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Connections extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(2700)
  RTExcelObj.WorkbookConnection _AddFromFile(
    java.lang.String filename);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param connectionString Mandatory java.lang.Object parameter.
   * @param commandText Mandatory java.lang.Object parameter.
   * @param lCmdtype Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  RTExcelObj.WorkbookConnection add(
    java.lang.String name,
    java.lang.String description,
    java.lang.Object connectionString,
    java.lang.Object commandText,
    @Optional java.lang.Object lCmdtype);


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  RTExcelObj.WorkbookConnection item(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  RTExcelObj.WorkbookConnection _Default(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param name Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param connectionString Mandatory java.lang.Object parameter.
   * @param commandText Mandatory java.lang.Object parameter.
   * @param lCmdtype Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createModelConnection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param importRelationships Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3054)
  RTExcelObj.WorkbookConnection add2(
    java.lang.String name,
    java.lang.String description,
    java.lang.Object connectionString,
    java.lang.Object commandText,
    @Optional java.lang.Object lCmdtype,
    @Optional java.lang.Object createModelConnection,
    @Optional java.lang.Object importRelationships);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param createModelConnection Optional parameter. Default value is com4j.Variant.getMissing()
   * @param importRelationships Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3107)
  RTExcelObj.WorkbookConnection addFromFile(
    java.lang.String filename,
    @Optional java.lang.Object createModelConnection,
    @Optional java.lang.Object importRelationships);


  // Properties:
}

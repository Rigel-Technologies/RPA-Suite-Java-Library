package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotCaches extends Com4jObject,Iterable<Com4jObject> {
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
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  RTExcelObj.PivotCache item(
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
  RTExcelObj.PivotCache _Default(
    java.lang.Object index);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param sourceType Mandatory RTExcelObj.XlPivotTableSourceType parameter.
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  RTExcelObj.PivotCache add(
    RTExcelObj.XlPivotTableSourceType sourceType,
    @Optional java.lang.Object sourceData);


  /**
   * @param sourceType Mandatory RTExcelObj.XlPivotTableSourceType parameter.
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param version Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1896)
  RTExcelObj.PivotCache create(
    RTExcelObj.XlPivotTableSourceType sourceType,
    @Optional java.lang.Object sourceData,
    @Optional java.lang.Object version);


  // Properties:
}

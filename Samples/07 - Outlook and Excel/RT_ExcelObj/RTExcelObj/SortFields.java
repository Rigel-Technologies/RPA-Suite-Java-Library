package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SortFields extends Com4jObject,Iterable<Com4jObject> {
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
   * @param key Mandatory RTExcelObj.Range parameter.
   * @param sortOn Optional parameter. Default value is com4j.Variant.getMissing()
   * @param order Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dataOption Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  RTExcelObj.SortField add(
    RTExcelObj.Range key,
    @Optional java.lang.Object sortOn,
    @Optional java.lang.Object order,
    @Optional java.lang.Object customOrder,
    @Optional java.lang.Object dataOption);


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  RTExcelObj.SortField item(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   */

  @DISPID(111)
  void clear();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  RTExcelObj.SortField _Default(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

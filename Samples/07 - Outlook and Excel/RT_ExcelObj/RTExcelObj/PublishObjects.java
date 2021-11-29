package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PublishObjects extends Com4jObject,Iterable<Com4jObject> {
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
   * @param sourceType Mandatory RTExcelObj.XlSourceType parameter.
   * @param filename Mandatory java.lang.String parameter.
   * @param sheet Optional parameter. Default value is com4j.Variant.getMissing()
   * @param source Optional parameter. Default value is com4j.Variant.getMissing()
   * @param htmlType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param divID Optional parameter. Default value is com4j.Variant.getMissing()
   * @param title Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  RTExcelObj.PublishObject add(
    RTExcelObj.XlSourceType sourceType,
    java.lang.String filename,
    @Optional java.lang.Object sheet,
    @Optional java.lang.Object source,
    @Optional java.lang.Object htmlType,
    @Optional java.lang.Object divID,
    @Optional java.lang.Object title);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  RTExcelObj.PublishObject item(
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
  RTExcelObj.PublishObject _Default(
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
   */

  @DISPID(117)
  void delete();


  /**
   */

  @DISPID(1895)
  void publish();


  // Properties:
}

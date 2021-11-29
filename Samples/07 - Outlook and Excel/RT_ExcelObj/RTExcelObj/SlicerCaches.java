package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SlicerCaches extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  RTExcelObj.SlicerCache item(
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
  RTExcelObj.SlicerCache _Default(
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
   * @param source Mandatory java.lang.Object parameter.
   * @param sourceField Mandatory java.lang.Object parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  RTExcelObj.SlicerCache add(
    java.lang.Object source,
    java.lang.Object sourceField,
    @Optional java.lang.Object name);


  /**
   * @param source Mandatory java.lang.Object parameter.
   * @param sourceField Mandatory java.lang.Object parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param slicerCacheType Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3054)
  RTExcelObj.SlicerCache add2(
    java.lang.Object source,
    java.lang.Object sourceField,
    @Optional java.lang.Object name,
    @Optional java.lang.Object slicerCacheType);


  // Properties:
}

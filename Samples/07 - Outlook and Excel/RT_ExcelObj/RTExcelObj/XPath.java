package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface XPath extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "Map"
   * </p>
   */

  @DISPID(2262)
  @PropGet
  RTExcelObj.XmlMap map();


  /**
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param xPath Mandatory java.lang.String parameter.
   * @param selectionNamespace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param repeating Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2358)
  void setValue(
    RTExcelObj.XmlMap map,
    java.lang.String xPath,
    @Optional java.lang.Object selectionNamespace,
    @Optional java.lang.Object repeating);


  /**
   */

  @DISPID(111)
  void clear();


  /**
   * <p>
   * Getter method for the COM property "Repeating"
   * </p>
   */

  @DISPID(2360)
  @PropGet
  boolean repeating();


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface XmlDataBinding extends Com4jObject {
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
   */

  @DISPID(1417)
  RTExcelObj.XlXmlImportResult refresh();


  /**
   * @param url Mandatory java.lang.String parameter.
   */

  @DISPID(2329)
  void loadSettings(
    java.lang.String url);


  /**
   */

  @DISPID(2330)
  void clearSettings();


  /**
   * <p>
   * Getter method for the COM property "SourceUrl"
   * </p>
   */

  @DISPID(2331)
  @PropGet
  java.lang.String sourceUrl();


  // Properties:
}

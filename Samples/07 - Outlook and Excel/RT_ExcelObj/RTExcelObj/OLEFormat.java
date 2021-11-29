package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface OLEFormat extends Com4jObject {
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
   */

  @DISPID(304)
  void activate();


  /**
   * <p>
   * Getter method for the COM property "Object"
   * </p>
   */

  @DISPID(1049)
  @PropGet
  com4j.Com4jObject object();


  /**
   * <p>
   * Getter method for the COM property "progID"
   * </p>
   */

  @DISPID(1523)
  @PropGet
  java.lang.String progID();


  /**
   * @param verb Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(606)
  void verb(
    @Optional java.lang.Object verb);


  // Properties:
}

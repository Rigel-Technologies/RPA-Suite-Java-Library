package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface CustomView extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "PrintSettings"
   * </p>
   */

  @DISPID(1577)
  @PropGet
  boolean printSettings();


  /**
   * <p>
   * Getter method for the COM property "RowColSettings"
   * </p>
   */

  @DISPID(1578)
  @PropGet
  boolean rowColSettings();


  /**
   */

  @DISPID(496)
  void show();


  /**
   */

  @DISPID(117)
  void delete();


  // Properties:
}

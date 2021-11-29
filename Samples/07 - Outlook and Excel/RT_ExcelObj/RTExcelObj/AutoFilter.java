package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AutoFilter extends Com4jObject {
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
   * Getter method for the COM property "Range"
   * </p>
   */

  @DISPID(197)
  @PropGet
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "Filters"
   * </p>
   */

  @DISPID(1617)
  @PropGet
  RTExcelObj.Filters filters();


  /**
   * <p>
   * Getter method for the COM property "FilterMode"
   * </p>
   */

  @DISPID(800)
  @PropGet
  boolean filterMode();


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   */

  @DISPID(880)
  @PropGet
  RTExcelObj.Sort sort();


  /**
   */

  @DISPID(2640)
  void applyFilter();


  /**
   */

  @DISPID(794)
  void showAllData();


  // Properties:
}

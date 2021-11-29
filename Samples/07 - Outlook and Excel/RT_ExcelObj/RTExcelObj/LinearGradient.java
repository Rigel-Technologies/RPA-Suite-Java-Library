package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface LinearGradient extends Com4jObject {
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
   * Getter method for the COM property "ColorStops"
   * </p>
   */

  @DISPID(2761)
  @PropGet
  RTExcelObj.ColorStops colorStops();


  /**
   * <p>
   * Getter method for the COM property "Degree"
   * </p>
   */

  @DISPID(1623)
  @PropGet
  double degree();


  /**
   * <p>
   * Setter method for the COM property "Degree"
   * </p>
   * @param rhs Mandatory double parameter.
   */

  @DISPID(1623)
  @PropPut
  void degree(
    double rhs);


  // Properties:
}

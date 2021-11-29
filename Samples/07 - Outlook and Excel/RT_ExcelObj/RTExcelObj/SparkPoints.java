package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SparkPoints extends Com4jObject {
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
   * Getter method for the COM property "Negative"
   * </p>
   */

  @DISPID(2955)
  @PropGet
  RTExcelObj.SparkColor negative();


  /**
   * <p>
   * Getter method for the COM property "Markers"
   * </p>
   */

  @DISPID(2956)
  @PropGet
  RTExcelObj.SparkColor markers();


  /**
   * <p>
   * Getter method for the COM property "Highpoint"
   * </p>
   */

  @DISPID(2957)
  @PropGet
  RTExcelObj.SparkColor highpoint();


  /**
   * <p>
   * Getter method for the COM property "Lowpoint"
   * </p>
   */

  @DISPID(2958)
  @PropGet
  RTExcelObj.SparkColor lowpoint();


  /**
   * <p>
   * Getter method for the COM property "Firstpoint"
   * </p>
   */

  @DISPID(2959)
  @PropGet
  RTExcelObj.SparkColor firstpoint();


  /**
   * <p>
   * Getter method for the COM property "Lastpoint"
   * </p>
   */

  @DISPID(2960)
  @PropGet
  RTExcelObj.SparkColor lastpoint();


  // Properties:
}

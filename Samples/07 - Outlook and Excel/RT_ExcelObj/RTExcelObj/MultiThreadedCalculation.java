package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface MultiThreadedCalculation extends Com4jObject {
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
   * Getter method for the COM property "Enabled"
   * </p>
   */

  @DISPID(600)
  @PropGet
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(600)
  @PropPut
  void enabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ThreadMode"
   * </p>
   */

  @DISPID(2766)
  @PropGet
  RTExcelObj.XlThreadMode threadMode();


  /**
   * <p>
   * Setter method for the COM property "ThreadMode"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlThreadMode parameter.
   */

  @DISPID(2766)
  @PropPut
  void threadMode(
    RTExcelObj.XlThreadMode rhs);


  /**
   * <p>
   * Getter method for the COM property "ThreadCount"
   * </p>
   */

  @DISPID(2767)
  @PropGet
  int threadCount();


  /**
   * <p>
   * Setter method for the COM property "ThreadCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2767)
  @PropPut
  void threadCount(
    int rhs);


  // Properties:
}

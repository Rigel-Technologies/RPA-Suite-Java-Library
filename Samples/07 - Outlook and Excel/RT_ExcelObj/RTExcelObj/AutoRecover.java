package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AutoRecover extends Com4jObject {
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
   * Getter method for the COM property "Time"
   * </p>
   */

  @DISPID(394)
  @PropGet
  int time();


  /**
   * <p>
   * Setter method for the COM property "Time"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(394)
  @PropPut
  void time(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   */

  @DISPID(291)
  @PropGet
  java.lang.String path();


  /**
   * <p>
   * Setter method for the COM property "Path"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(291)
  @PropPut
  void path(
    java.lang.String rhs);


  // Properties:
}

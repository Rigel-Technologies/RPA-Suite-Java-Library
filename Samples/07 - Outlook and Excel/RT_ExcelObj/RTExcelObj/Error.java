package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Error extends Com4jObject {
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
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  boolean value();


  /**
   * <p>
   * Getter method for the COM property "Ignore"
   * </p>
   */

  @DISPID(2210)
  @PropGet
  boolean ignore();


  /**
   * <p>
   * Setter method for the COM property "Ignore"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2210)
  @PropPut
  void ignore(
    boolean rhs);


  // Properties:
}

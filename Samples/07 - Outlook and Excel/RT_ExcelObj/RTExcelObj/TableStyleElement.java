package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TableStyleElement extends Com4jObject {
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
   * Getter method for the COM property "HasFormat"
   * </p>
   */

  @DISPID(2735)
  @PropGet
  boolean hasFormat();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   */

  @DISPID(435)
  @PropGet
  RTExcelObj.Borders borders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "StripeSize"
   * </p>
   */

  @DISPID(2736)
  @PropGet
  int stripeSize();


  /**
   * <p>
   * Setter method for the COM property "StripeSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2736)
  @PropPut
  void stripeSize(
    int rhs);


  /**
   */

  @DISPID(111)
  void clear();


  // Properties:
}

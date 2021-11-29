package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ModelFormatCurrency extends Com4jObject {
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
   * Getter method for the COM property "Symbol"
   * </p>
   */

  @DISPID(3200)
  @PropGet
  java.lang.String symbol();


  /**
   * <p>
   * Setter method for the COM property "Symbol"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(3200)
  @PropPut
  void symbol(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DecimalPlaces"
   * </p>
   */

  @DISPID(2349)
  @PropGet
  int decimalPlaces();


  /**
   * <p>
   * Setter method for the COM property "DecimalPlaces"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2349)
  @PropPut
  void decimalPlaces(
    int rhs);


  // Properties:
}

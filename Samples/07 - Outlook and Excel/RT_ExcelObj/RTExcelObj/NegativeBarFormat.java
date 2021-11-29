package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface NegativeBarFormat extends Com4jObject {
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
   * Getter method for the COM property "ColorType"
   * </p>
   */

  @DISPID(2195)
  @PropGet
  RTExcelObj.XlDataBarNegativeColorType colorType();


  /**
   * <p>
   * Setter method for the COM property "ColorType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarNegativeColorType parameter.
   */

  @DISPID(2195)
  @PropPut
  void colorType(
    RTExcelObj.XlDataBarNegativeColorType rhs);


  /**
   * <p>
   * Getter method for the COM property "BorderColorType"
   * </p>
   */

  @DISPID(2969)
  @PropGet
  RTExcelObj.XlDataBarNegativeColorType borderColorType();


  /**
   * <p>
   * Setter method for the COM property "BorderColorType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarNegativeColorType parameter.
   */

  @DISPID(2969)
  @PropPut
  void borderColorType(
    RTExcelObj.XlDataBarNegativeColorType rhs);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   */

  @DISPID(99)
  @PropGet
  com4j.Com4jObject color();


  /**
   * <p>
   * Getter method for the COM property "BorderColor"
   * </p>
   */

  @DISPID(2970)
  @PropGet
  com4j.Com4jObject borderColor();


  // Properties:
}

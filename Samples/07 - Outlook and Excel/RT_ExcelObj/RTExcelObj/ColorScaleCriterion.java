package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ColorScaleCriterion extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int index();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlConditionValueTypes type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlConditionValueTypes parameter.
   */

  @DISPID(108)
  @PropPut
  void type(
    RTExcelObj.XlConditionValueTypes rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.Object value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(6)
  @PropPut
  void value(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "FormatColor"
   * </p>
   */

  @DISPID(2717)
  @PropGet
  RTExcelObj.FormatColor formatColor();


  // Properties:
}

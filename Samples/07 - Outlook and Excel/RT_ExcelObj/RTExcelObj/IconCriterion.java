package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface IconCriterion extends Com4jObject {
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
   * Getter method for the COM property "Operator"
   * </p>
   */

  @DISPID(797)
  @PropGet
  int operator();


  /**
   * <p>
   * Setter method for the COM property "Operator"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(797)
  @PropPut
  void operator(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Icon"
   * </p>
   */

  @DISPID(2747)
  @PropGet
  RTExcelObj.XlIcon icon();


  /**
   * <p>
   * Setter method for the COM property "Icon"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlIcon parameter.
   */

  @DISPID(2747)
  @PropPut
  void icon(
    RTExcelObj.XlIcon rhs);


  // Properties:
}

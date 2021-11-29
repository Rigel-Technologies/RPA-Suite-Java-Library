package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Filter extends Com4jObject {
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
   * Getter method for the COM property "On"
   * </p>
   */

  @DISPID(1618)
  @PropGet
  boolean on();


  /**
   * <p>
   * Getter method for the COM property "Criteria1"
   * </p>
   */

  @DISPID(796)
  @PropGet
  java.lang.Object criteria1();


  /**
   * <p>
   * Getter method for the COM property "_Operator"
   * </p>
   */

  @DISPID(2641)
  @PropGet
  RTExcelObj.XlAutoFilterOperator _Operator();


  /**
   * <p>
   * Getter method for the COM property "Criteria2"
   * </p>
   */

  @DISPID(798)
  @PropGet
  java.lang.Object criteria2();


  /**
   * <p>
   * Getter method for the COM property "Operator"
   * </p>
   */

  @DISPID(797)
  @PropGet
  RTExcelObj.XlAutoFilterOperator operator();


  /**
   * <p>
   * Setter method for the COM property "Operator"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAutoFilterOperator parameter.
   */

  @DISPID(797)
  @PropPut
  void operator(
    RTExcelObj.XlAutoFilterOperator rhs);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  // Properties:
}

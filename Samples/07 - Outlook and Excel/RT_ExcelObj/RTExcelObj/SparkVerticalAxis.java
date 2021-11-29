package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SparkVerticalAxis extends Com4jObject {
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
   * Getter method for the COM property "MinScaleType"
   * </p>
   */

  @DISPID(2965)
  @PropGet
  RTExcelObj.XlSparkScale minScaleType();


  /**
   * <p>
   * Setter method for the COM property "MinScaleType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSparkScale parameter.
   */

  @DISPID(2965)
  @PropPut
  void minScaleType(
    RTExcelObj.XlSparkScale rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomMinScaleValue"
   * </p>
   */

  @DISPID(2966)
  @PropGet
  java.lang.Object customMinScaleValue();


  /**
   * <p>
   * Setter method for the COM property "CustomMinScaleValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2966)
  @PropPut
  void customMinScaleValue(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "MaxScaleType"
   * </p>
   */

  @DISPID(2967)
  @PropGet
  RTExcelObj.XlSparkScale maxScaleType();


  /**
   * <p>
   * Setter method for the COM property "MaxScaleType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSparkScale parameter.
   */

  @DISPID(2967)
  @PropPut
  void maxScaleType(
    RTExcelObj.XlSparkScale rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomMaxScaleValue"
   * </p>
   */

  @DISPID(2968)
  @PropGet
  java.lang.Object customMaxScaleValue();


  /**
   * <p>
   * Setter method for the COM property "CustomMaxScaleValue"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2968)
  @PropPut
  void customMaxScaleValue(
    java.lang.Object rhs);


  // Properties:
}

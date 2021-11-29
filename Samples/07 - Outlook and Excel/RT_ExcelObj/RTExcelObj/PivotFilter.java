package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotFilter extends Com4jObject {
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
   * Getter method for the COM property "Order"
   * </p>
   */

  @DISPID(192)
  @PropGet
  int order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(192)
  @PropPut
  void order(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "FilterType"
   * </p>
   */

  @DISPID(2686)
  @PropGet
  RTExcelObj.XlPivotFilterType filterType();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   */

  @DISPID(218)
  @PropGet
  java.lang.String description();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   */

  @DISPID(2312)
  @PropGet
  boolean active();


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   */

  @DISPID(731)
  @PropGet
  RTExcelObj.PivotField pivotField();


  /**
   * <p>
   * Getter method for the COM property "DataField"
   * </p>
   */

  @DISPID(2091)
  @PropGet
  RTExcelObj.PivotField dataField();


  /**
   * <p>
   * Getter method for the COM property "DataCubeField"
   * </p>
   */

  @DISPID(2687)
  @PropGet
  RTExcelObj.CubeField dataCubeField();


  /**
   * <p>
   * Getter method for the COM property "Value1"
   * </p>
   */

  @DISPID(2688)
  @PropGet
  java.lang.Object value1();


  /**
   * <p>
   * Getter method for the COM property "Value2"
   * </p>
   */

  @DISPID(1388)
  @PropGet
  java.lang.Object value2();


  /**
   * <p>
   * Getter method for the COM property "MemberPropertyField"
   * </p>
   */

  @DISPID(2689)
  @PropGet
  RTExcelObj.PivotField memberPropertyField();


  /**
   * <p>
   * Getter method for the COM property "IsMemberPropertyFilter"
   * </p>
   */

  @DISPID(2690)
  @PropGet
  boolean isMemberPropertyFilter();


  /**
   * <p>
   * Getter method for the COM property "WholeDayFilter"
   * </p>
   */

  @DISPID(3099)
  @PropGet
  boolean wholeDayFilter();


  /**
   * <p>
   * Setter method for the COM property "WholeDayFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3099)
  @PropPut
  void wholeDayFilter(
    boolean rhs);


  // Properties:
}

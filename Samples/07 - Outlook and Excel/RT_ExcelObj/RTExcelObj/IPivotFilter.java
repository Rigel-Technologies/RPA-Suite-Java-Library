package RTExcelObj  ;

import com4j.*;

@IID("{00024483-0001-0000-C000-000000000046}")
public interface IPivotFilter extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(11)
  void order(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "FilterType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotFilterType
   */

  @VTID(12)
  RTExcelObj.XlPivotFilterType filterType();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String description();


  /**
   */

  @VTID(15)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean active();


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(17)
  RTExcelObj.PivotField pivotField();


  /**
   * <p>
   * Getter method for the COM property "DataField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(18)
  RTExcelObj.PivotField dataField();


  /**
   * <p>
   * Getter method for the COM property "DataCubeField"
   * </p>
   * @return  Returns a value of type RTExcelObj.CubeField
   */

  @VTID(19)
  RTExcelObj.CubeField dataCubeField();


  /**
   * <p>
   * Getter method for the COM property "Value1"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value1();


  /**
   * <p>
   * Getter method for the COM property "Value2"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value2();


  /**
   * <p>
   * Getter method for the COM property "MemberPropertyField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(22)
  RTExcelObj.PivotField memberPropertyField();


  /**
   * <p>
   * Getter method for the COM property "IsMemberPropertyFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean isMemberPropertyFilter();


  /**
   * <p>
   * Getter method for the COM property "WholeDayFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean wholeDayFilter();


  /**
   * <p>
   * Setter method for the COM property "WholeDayFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void wholeDayFilter(
    boolean rhs);


  // Properties:
}

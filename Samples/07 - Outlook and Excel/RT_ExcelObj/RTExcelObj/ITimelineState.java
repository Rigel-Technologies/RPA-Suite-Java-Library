package RTExcelObj  ;

import com4j.*;

@IID("{000244DF-0001-0000-C000-000000000046}")
public interface ITimelineState extends Com4jObject {
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
   * Getter method for the COM property "StartDate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object startDate();


  /**
   * <p>
   * Getter method for the COM property "EndDate"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object endDate();


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
   * Getter method for the COM property "FilterValue1"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object filterValue1();


  /**
   * <p>
   * Getter method for the COM property "FilterValue2"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object filterValue2();


  /**
   * <p>
   * Getter method for the COM property "SingleRangeFilterState"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean singleRangeFilterState();


  /**
   * @param startDate Mandatory java.lang.Object parameter.
   * @param endDate Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.XlFilterStatus
   */

  @VTID(16)
  RTExcelObj.XlFilterStatus setFilterDateRange(
    @MarshalAs(NativeType.VARIANT) java.lang.Object startDate,
    @MarshalAs(NativeType.VARIANT) java.lang.Object endDate);


  // Properties:
}

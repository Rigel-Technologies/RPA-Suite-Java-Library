package RTExcelObj  ;

import com4j.*;

@IID("{00024432-0001-0000-C000-000000000046}")
public interface IAutoFilter extends Com4jObject {
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
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(10)
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "Filters"
   * </p>
   * @return  Returns a value of type RTExcelObj.Filters
   */

  @VTID(11)
  RTExcelObj.Filters filters();


  /**
   * <p>
   * Getter method for the COM property "FilterMode"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean filterMode();


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sort
   */

  @VTID(13)
  RTExcelObj.Sort sort();


  /**
   */

  @VTID(14)
  void applyFilter();


  /**
   */

  @VTID(15)
  void showAllData();


  // Properties:
}

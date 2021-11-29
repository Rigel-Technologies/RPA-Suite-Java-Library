package RTExcelObj  ;

import com4j.*;

@IID("{000244C6-0001-0000-C000-000000000046}")
public interface ISlicerCacheLevel extends Com4jObject {
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
   * Getter method for the COM property "SlicerItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerItems
   */

  @VTID(10)
  RTExcelObj.SlicerItems slicerItems();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Ordinal"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int ordinal();


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
   * Getter method for the COM property "CrossFilterType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSlicerCrossFilterType
   */

  @VTID(14)
  RTExcelObj.XlSlicerCrossFilterType crossFilterType();


  /**
   * <p>
   * Setter method for the COM property "CrossFilterType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSlicerCrossFilterType parameter.
   */

  @VTID(15)
  void crossFilterType(
    RTExcelObj.XlSlicerCrossFilterType rhs);


  /**
   * <p>
   * Getter method for the COM property "SortItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSlicerSort
   */

  @VTID(16)
  RTExcelObj.XlSlicerSort sortItems();


  /**
   * <p>
   * Setter method for the COM property "SortItems"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSlicerSort parameter.
   */

  @VTID(17)
  void sortItems(
    RTExcelObj.XlSlicerSort rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItemsList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object visibleSlicerItemsList();


  // Properties:
}

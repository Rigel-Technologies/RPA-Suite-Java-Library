package RTExcelObj  ;

import com4j.*;

@IID("{000244C4-0001-0000-C000-000000000046}")
public interface ISlicerCache extends Com4jObject {
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
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int index();


  /**
   * <p>
   * Getter method for the COM property "OLAP"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean olap();


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotTableSourceType
   */

  @VTID(12)
  RTExcelObj.XlPivotTableSourceType sourceType();


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(13)
  RTExcelObj.WorkbookConnection workbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Slicers"
   * </p>
   * @return  Returns a value of type RTExcelObj.Slicers
   */

  @VTID(14)
  RTExcelObj.Slicers slicers();


  /**
   * <p>
   * Getter method for the COM property "PivotTables"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerPivotTables
   */

  @VTID(15)
  RTExcelObj.SlicerPivotTables pivotTables();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheLevels"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerCacheLevels
   */

  @VTID(16)
  RTExcelObj.SlicerCacheLevels slicerCacheLevels();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(18)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerItems
   */

  @VTID(19)
  RTExcelObj.SlicerItems visibleSlicerItems();


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItemsList"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(20)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object visibleSlicerItemsList();


  /**
   * <p>
   * Setter method for the COM property "VisibleSlicerItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(21)
  void visibleSlicerItemsList(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SlicerItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.SlicerItems
   */

  @VTID(22)
  RTExcelObj.SlicerItems slicerItems();


  /**
   * <p>
   * Getter method for the COM property "CrossFilterType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSlicerCrossFilterType
   */

  @VTID(23)
  RTExcelObj.XlSlicerCrossFilterType crossFilterType();


  /**
   * <p>
   * Setter method for the COM property "CrossFilterType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSlicerCrossFilterType parameter.
   */

  @VTID(24)
  void crossFilterType(
    RTExcelObj.XlSlicerCrossFilterType rhs);


  /**
   * <p>
   * Getter method for the COM property "SortItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSlicerSort
   */

  @VTID(25)
  RTExcelObj.XlSlicerSort sortItems();


  /**
   * <p>
   * Setter method for the COM property "SortItems"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSlicerSort parameter.
   */

  @VTID(26)
  void sortItems(
    RTExcelObj.XlSlicerSort rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(27)
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "SortUsingCustomLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean sortUsingCustomLists();


  /**
   * <p>
   * Setter method for the COM property "SortUsingCustomLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void sortUsingCustomLists(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAllItems"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean showAllItems();


  /**
   * <p>
   * Setter method for the COM property "ShowAllItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void showAllItems(
    boolean rhs);


  /**
   */

  @VTID(32)
  void clearManualFilter();


  /**
   */

  @VTID(33)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "TimelineState"
   * </p>
   * @return  Returns a value of type RTExcelObj.TimelineState
   */

  @VTID(34)
  RTExcelObj.TimelineState timelineState();


  /**
   */

  @VTID(35)
  void clearAllFilters();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSlicerCacheType
   */

  @VTID(36)
  RTExcelObj.XlSlicerCacheType slicerCacheType();


  /**
   * <p>
   * Getter method for the COM property "FilterCleared"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(37)
  boolean filterCleared();


  /**
   * <p>
   * Getter method for the COM property "List"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(38)
  boolean list();


  /**
   * <p>
   * Getter method for the COM property "RequireManualUpdate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(39)
  boolean requireManualUpdate();


  /**
   * <p>
   * Setter method for the COM property "RequireManualUpdate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(40)
  void requireManualUpdate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ListObject"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListObject
   */

  @VTID(41)
  RTExcelObj.ListObject listObject();


  /**
   */

  @VTID(42)
  void clearDateFilter();


  // Properties:
}

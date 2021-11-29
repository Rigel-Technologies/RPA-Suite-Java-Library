package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SlicerCache extends Com4jObject {
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
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int index();


  /**
   * <p>
   * Getter method for the COM property "OLAP"
   * </p>
   */

  @DISPID(2077)
  @PropGet
  boolean olap();


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   */

  @DISPID(685)
  @PropGet
  RTExcelObj.XlPivotTableSourceType sourceType();


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   */

  @DISPID(2544)
  @PropGet
  RTExcelObj.WorkbookConnection workbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Slicers"
   * </p>
   */

  @DISPID(2881)
  @PropGet
  RTExcelObj.Slicers slicers();


  /**
   * <p>
   * Getter method for the COM property "PivotTables"
   * </p>
   */

  @DISPID(690)
  @PropGet
  RTExcelObj.SlicerPivotTables pivotTables();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheLevels"
   * </p>
   */

  @DISPID(2974)
  @PropGet
  RTExcelObj.SlicerCacheLevels slicerCacheLevels();


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
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItems"
   * </p>
   */

  @DISPID(2975)
  @PropGet
  RTExcelObj.SlicerItems visibleSlicerItems();


  /**
   * <p>
   * Getter method for the COM property "VisibleSlicerItemsList"
   * </p>
   */

  @DISPID(2976)
  @PropGet
  java.lang.Object visibleSlicerItemsList();


  /**
   * <p>
   * Setter method for the COM property "VisibleSlicerItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2976)
  @PropPut
  void visibleSlicerItemsList(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SlicerItems"
   * </p>
   */

  @DISPID(2977)
  @PropGet
  RTExcelObj.SlicerItems slicerItems();


  /**
   * <p>
   * Getter method for the COM property "CrossFilterType"
   * </p>
   */

  @DISPID(2978)
  @PropGet
  RTExcelObj.XlSlicerCrossFilterType crossFilterType();


  /**
   * <p>
   * Setter method for the COM property "CrossFilterType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSlicerCrossFilterType parameter.
   */

  @DISPID(2978)
  @PropPut
  void crossFilterType(
    RTExcelObj.XlSlicerCrossFilterType rhs);


  /**
   * <p>
   * Getter method for the COM property "SortItems"
   * </p>
   */

  @DISPID(2979)
  @PropGet
  RTExcelObj.XlSlicerSort sortItems();


  /**
   * <p>
   * Setter method for the COM property "SortItems"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSlicerSort parameter.
   */

  @DISPID(2979)
  @PropPut
  void sortItems(
    RTExcelObj.XlSlicerSort rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(721)
  @PropGet
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "SortUsingCustomLists"
   * </p>
   */

  @DISPID(2574)
  @PropGet
  boolean sortUsingCustomLists();


  /**
   * <p>
   * Setter method for the COM property "SortUsingCustomLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2574)
  @PropPut
  void sortUsingCustomLists(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowAllItems"
   * </p>
   */

  @DISPID(452)
  @PropGet
  boolean showAllItems();


  /**
   * <p>
   * Setter method for the COM property "ShowAllItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(452)
  @PropPut
  void showAllItems(
    boolean rhs);


  /**
   */

  @DISPID(2594)
  void clearManualFilter();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "TimelineState"
   * </p>
   */

  @DISPID(3112)
  @PropGet
  RTExcelObj.TimelineState timelineState();


  /**
   */

  @DISPID(2561)
  void clearAllFilters();


  /**
   * <p>
   * Getter method for the COM property "SlicerCacheType"
   * </p>
   */

  @DISPID(3111)
  @PropGet
  RTExcelObj.XlSlicerCacheType slicerCacheType();


  /**
   * <p>
   * Getter method for the COM property "FilterCleared"
   * </p>
   */

  @DISPID(3113)
  @PropGet
  boolean filterCleared();


  /**
   * <p>
   * Getter method for the COM property "List"
   * </p>
   */

  @DISPID(861)
  @PropGet
  boolean list();


  /**
   * <p>
   * Getter method for the COM property "RequireManualUpdate"
   * </p>
   */

  @DISPID(3114)
  @PropGet
  boolean requireManualUpdate();


  /**
   * <p>
   * Setter method for the COM property "RequireManualUpdate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3114)
  @PropPut
  void requireManualUpdate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ListObject"
   * </p>
   */

  @DISPID(2257)
  @PropGet
  RTExcelObj.ListObject listObject();


  /**
   */

  @DISPID(3115)
  void clearDateFilter();


  // Properties:
}

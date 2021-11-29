package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SlicerCacheLevel extends Com4jObject {
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
   * Getter method for the COM property "SlicerItems"
   * </p>
   */

  @DISPID(2977)
  @PropGet
  RTExcelObj.SlicerItems slicerItems();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * <p>
   * Getter method for the COM property "Ordinal"
   * </p>
   */

  @DISPID(2981)
  @PropGet
  int ordinal();


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
   * Getter method for the COM property "VisibleSlicerItemsList"
   * </p>
   */

  @DISPID(2976)
  @PropGet
  java.lang.Object visibleSlicerItemsList();


  // Properties:
}

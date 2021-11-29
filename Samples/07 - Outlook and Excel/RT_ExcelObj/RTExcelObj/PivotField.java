package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotField extends Com4jObject {
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
   * Getter method for the COM property "Calculation"
   * </p>
   */

  @DISPID(316)
  @PropGet
  RTExcelObj.XlPivotFieldCalculation calculation();


  /**
   * <p>
   * Setter method for the COM property "Calculation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotFieldCalculation parameter.
   */

  @DISPID(316)
  @PropPut
  void calculation(
    RTExcelObj.XlPivotFieldCalculation rhs);


  /**
   * <p>
   * Getter method for the COM property "ChildField"
   * </p>
   */

  @DISPID(736)
  @PropGet
  RTExcelObj.PivotField childField();


  /**
   * <p>
   * Getter method for the COM property "ChildItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(730)
  @PropGet
  java.lang.Object childItems(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "CurrentPage"
   * </p>
   */

  @DISPID(738)
  @PropGet
  java.lang.Object currentPage();


  /**
   * <p>
   * Setter method for the COM property "CurrentPage"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(738)
  @PropPut
  void currentPage(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DataRange"
   * </p>
   */

  @DISPID(720)
  @PropGet
  RTExcelObj.Range dataRange();


  /**
   * <p>
   * Getter method for the COM property "DataType"
   * </p>
   */

  @DISPID(722)
  @PropGet
  RTExcelObj.XlPivotFieldDataType dataType();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void _Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Function"
   * </p>
   */

  @DISPID(899)
  @PropGet
  RTExcelObj.XlConsolidationFunction function();


  /**
   * <p>
   * Setter method for the COM property "Function"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlConsolidationFunction parameter.
   */

  @DISPID(899)
  @PropPut
  void function(
    RTExcelObj.XlConsolidationFunction rhs);


  /**
   * <p>
   * Getter method for the COM property "GroupLevel"
   * </p>
   */

  @DISPID(723)
  @PropGet
  java.lang.Object groupLevel();


  /**
   * <p>
   * Getter method for the COM property "HiddenItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(728)
  @PropGet
  java.lang.Object hiddenItems(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "LabelRange"
   * </p>
   */

  @DISPID(719)
  @PropGet
  RTExcelObj.Range labelRange();


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
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  java.lang.String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(193)
  @PropPut
  void numberFormat(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  RTExcelObj.XlPivotFieldOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPivotFieldOrientation parameter.
   */

  @DISPID(134)
  @PropPut
  void orientation(
    RTExcelObj.XlPivotFieldOrientation rhs);


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
   * <p>
   * Getter method for the COM property "ParentField"
   * </p>
   */

  @DISPID(732)
  @PropGet
  RTExcelObj.PivotField parentField();


  /**
   * <p>
   * Getter method for the COM property "ParentItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(729)
  @PropGet
  java.lang.Object parentItems(
    @Optional java.lang.Object index);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(737)
  java.lang.Object pivotItems(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   */

  @DISPID(133)
  @PropGet
  java.lang.Object position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(133)
  @PropPut
  void position(
    java.lang.Object rhs);


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
   * Getter method for the COM property "Subtotals"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(733)
  @PropGet
  java.lang.Object subtotals(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "Subtotals"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(733)
  @PropPut
  void subtotals(
    @Optional java.lang.Object index,
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseField"
   * </p>
   */

  @DISPID(734)
  @PropGet
  java.lang.Object baseField();


  /**
   * <p>
   * Setter method for the COM property "BaseField"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(734)
  @PropPut
  void baseField(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "BaseItem"
   * </p>
   */

  @DISPID(735)
  @PropGet
  java.lang.Object baseItem();


  /**
   * <p>
   * Setter method for the COM property "BaseItem"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(735)
  @PropPut
  void baseItem(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TotalLevels"
   * </p>
   */

  @DISPID(724)
  @PropGet
  java.lang.Object totalLevels();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(6)
  @PropPut
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(727)
  @PropGet
  java.lang.Object visibleItems(
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(1507)
  RTExcelObj.CalculatedItems calculatedItems();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "DragToColumn"
   * </p>
   */

  @DISPID(1508)
  @PropGet
  boolean dragToColumn();


  /**
   * <p>
   * Setter method for the COM property "DragToColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1508)
  @PropPut
  void dragToColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToHide"
   * </p>
   */

  @DISPID(1509)
  @PropGet
  boolean dragToHide();


  /**
   * <p>
   * Setter method for the COM property "DragToHide"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1509)
  @PropPut
  void dragToHide(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToPage"
   * </p>
   */

  @DISPID(1510)
  @PropGet
  boolean dragToPage();


  /**
   * <p>
   * Setter method for the COM property "DragToPage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1510)
  @PropPut
  void dragToPage(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToRow"
   * </p>
   */

  @DISPID(1511)
  @PropGet
  boolean dragToRow();


  /**
   * <p>
   * Setter method for the COM property "DragToRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1511)
  @PropPut
  void dragToRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DragToData"
   * </p>
   */

  @DISPID(1844)
  @PropGet
  boolean dragToData();


  /**
   * <p>
   * Setter method for the COM property "DragToData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1844)
  @PropPut
  void dragToData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   */

  @DISPID(261)
  @PropGet
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(261)
  @PropPut
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IsCalculated"
   * </p>
   */

  @DISPID(1512)
  @PropGet
  boolean isCalculated();


  /**
   * <p>
   * Getter method for the COM property "MemoryUsed"
   * </p>
   */

  @DISPID(372)
  @PropGet
  int memoryUsed();


  /**
   * <p>
   * Getter method for the COM property "ServerBased"
   * </p>
   */

  @DISPID(1513)
  @PropGet
  boolean serverBased();


  /**
   * <p>
   * Setter method for the COM property "ServerBased"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1513)
  @PropPut
  void serverBased(
    boolean rhs);


  /**
   * @param order Mandatory int parameter.
   * @param field Mandatory java.lang.String parameter.
   */

  @DISPID(2579)
  void _AutoSort(
    int order,
    java.lang.String field);


  /**
   * @param type Mandatory int parameter.
   * @param range Mandatory int parameter.
   * @param count Mandatory int parameter.
   * @param field Mandatory java.lang.String parameter.
   */

  @DISPID(1515)
  void autoShow(
    int type,
    int range,
    int count,
    java.lang.String field);


  /**
   * <p>
   * Getter method for the COM property "AutoSortOrder"
   * </p>
   */

  @DISPID(1516)
  @PropGet
  int autoSortOrder();


  /**
   * <p>
   * Getter method for the COM property "AutoSortField"
   * </p>
   */

  @DISPID(1517)
  @PropGet
  java.lang.String autoSortField();


  /**
   * <p>
   * Getter method for the COM property "AutoShowType"
   * </p>
   */

  @DISPID(1518)
  @PropGet
  int autoShowType();


  /**
   * <p>
   * Getter method for the COM property "AutoShowRange"
   * </p>
   */

  @DISPID(1519)
  @PropGet
  int autoShowRange();


  /**
   * <p>
   * Getter method for the COM property "AutoShowCount"
   * </p>
   */

  @DISPID(1520)
  @PropGet
  int autoShowCount();


  /**
   * <p>
   * Getter method for the COM property "AutoShowField"
   * </p>
   */

  @DISPID(1521)
  @PropGet
  java.lang.String autoShowField();


  /**
   * <p>
   * Getter method for the COM property "LayoutBlankLine"
   * </p>
   */

  @DISPID(1845)
  @PropGet
  boolean layoutBlankLine();


  /**
   * <p>
   * Setter method for the COM property "LayoutBlankLine"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1845)
  @PropPut
  void layoutBlankLine(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutSubtotalLocation"
   * </p>
   */

  @DISPID(1846)
  @PropGet
  RTExcelObj.XlSubtototalLocationType layoutSubtotalLocation();


  /**
   * <p>
   * Setter method for the COM property "LayoutSubtotalLocation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSubtototalLocationType parameter.
   */

  @DISPID(1846)
  @PropPut
  void layoutSubtotalLocation(
    RTExcelObj.XlSubtototalLocationType rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutPageBreak"
   * </p>
   */

  @DISPID(1847)
  @PropGet
  boolean layoutPageBreak();


  /**
   * <p>
   * Setter method for the COM property "LayoutPageBreak"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1847)
  @PropPut
  void layoutPageBreak(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutForm"
   * </p>
   */

  @DISPID(1848)
  @PropGet
  RTExcelObj.XlLayoutFormType layoutForm();


  /**
   * <p>
   * Setter method for the COM property "LayoutForm"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlLayoutFormType parameter.
   */

  @DISPID(1848)
  @PropPut
  void layoutForm(
    RTExcelObj.XlLayoutFormType rhs);


  /**
   * <p>
   * Getter method for the COM property "SubtotalName"
   * </p>
   */

  @DISPID(1849)
  @PropGet
  java.lang.String subtotalName();


  /**
   * <p>
   * Setter method for the COM property "SubtotalName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1849)
  @PropPut
  void subtotalName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   */

  @DISPID(139)
  @PropGet
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139)
  @PropPut
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DrilledDown"
   * </p>
   */

  @DISPID(1850)
  @PropGet
  boolean drilledDown();


  /**
   * <p>
   * Setter method for the COM property "DrilledDown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1850)
  @PropPut
  void drilledDown(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CubeField"
   * </p>
   */

  @DISPID(1851)
  @PropGet
  RTExcelObj.CubeField cubeField();


  /**
   * <p>
   * Getter method for the COM property "CurrentPageName"
   * </p>
   */

  @DISPID(1852)
  @PropGet
  java.lang.String currentPageName();


  /**
   * <p>
   * Setter method for the COM property "CurrentPageName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1852)
  @PropPut
  void currentPageName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFormula"
   * </p>
   */

  @DISPID(2084)
  @PropGet
  java.lang.String standardFormula();


  /**
   * <p>
   * Setter method for the COM property "StandardFormula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2084)
  @PropPut
  void standardFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "HiddenItemsList"
   * </p>
   */

  @DISPID(2139)
  @PropGet
  java.lang.Object hiddenItemsList();


  /**
   * <p>
   * Setter method for the COM property "HiddenItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2139)
  @PropPut
  void hiddenItemsList(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DatabaseSort"
   * </p>
   */

  @DISPID(2140)
  @PropGet
  boolean databaseSort();


  /**
   * <p>
   * Setter method for the COM property "DatabaseSort"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2140)
  @PropPut
  void databaseSort(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IsMemberProperty"
   * </p>
   */

  @DISPID(2141)
  @PropGet
  boolean isMemberProperty();


  /**
   * <p>
   * Getter method for the COM property "PropertyParentField"
   * </p>
   */

  @DISPID(2142)
  @PropGet
  RTExcelObj.PivotField propertyParentField();


  /**
   * <p>
   * Getter method for the COM property "PropertyOrder"
   * </p>
   */

  @DISPID(2143)
  @PropGet
  int propertyOrder();


  /**
   * <p>
   * Setter method for the COM property "PropertyOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2143)
  @PropPut
  void propertyOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableItemSelection"
   * </p>
   */

  @DISPID(2144)
  @PropGet
  boolean enableItemSelection();


  /**
   * <p>
   * Setter method for the COM property "EnableItemSelection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2144)
  @PropPut
  void enableItemSelection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CurrentPageList"
   * </p>
   */

  @DISPID(2145)
  @PropGet
  java.lang.Object currentPageList();


  /**
   * <p>
   * Setter method for the COM property "CurrentPageList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2145)
  @PropPut
  void currentPageList(
    java.lang.Object rhs);


  /**
   * @param item Mandatory java.lang.String parameter.
   * @param clearList Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2146)
  void addPageItem(
    java.lang.String item,
    @Optional java.lang.Object clearList);


  /**
   * <p>
   * Getter method for the COM property "Hidden"
   * </p>
   */

  @DISPID(268)
  @PropGet
  boolean hidden();


  /**
   * <p>
   * Setter method for the COM property "Hidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(268)
  @PropPut
  void hidden(
    boolean rhs);


  /**
   * @param field Mandatory java.lang.String parameter.
   */

  @DISPID(2580)
  void drillTo(
    java.lang.String field);


  /**
   * <p>
   * Getter method for the COM property "UseMemberPropertyAsCaption"
   * </p>
   */

  @DISPID(2581)
  @PropGet
  boolean useMemberPropertyAsCaption();


  /**
   * <p>
   * Setter method for the COM property "UseMemberPropertyAsCaption"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2581)
  @PropPut
  void useMemberPropertyAsCaption(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MemberPropertyCaption"
   * </p>
   */

  @DISPID(2582)
  @PropGet
  java.lang.String memberPropertyCaption();


  /**
   * <p>
   * Setter method for the COM property "MemberPropertyCaption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2582)
  @PropPut
  void memberPropertyCaption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayAsTooltip"
   * </p>
   */

  @DISPID(2583)
  @PropGet
  boolean displayAsTooltip();


  /**
   * <p>
   * Setter method for the COM property "DisplayAsTooltip"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2583)
  @PropPut
  void displayAsTooltip(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayInReport"
   * </p>
   */

  @DISPID(2584)
  @PropGet
  boolean displayInReport();


  /**
   * <p>
   * Setter method for the COM property "DisplayInReport"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2584)
  @PropPut
  void displayInReport(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayAsCaption"
   * </p>
   */

  @DISPID(2585)
  @PropGet
  boolean displayAsCaption();


  /**
   * <p>
   * Getter method for the COM property "LayoutCompactRow"
   * </p>
   */

  @DISPID(2586)
  @PropGet
  boolean layoutCompactRow();


  /**
   * <p>
   * Setter method for the COM property "LayoutCompactRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2586)
  @PropPut
  void layoutCompactRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeNewItemsInFilter"
   * </p>
   */

  @DISPID(2587)
  @PropGet
  boolean includeNewItemsInFilter();


  /**
   * <p>
   * Setter method for the COM property "IncludeNewItemsInFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2587)
  @PropPut
  void includeNewItemsInFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisibleItemsList"
   * </p>
   */

  @DISPID(2588)
  @PropGet
  java.lang.Object visibleItemsList();


  /**
   * <p>
   * Setter method for the COM property "VisibleItemsList"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2588)
  @PropPut
  void visibleItemsList(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PivotFilters"
   * </p>
   */

  @DISPID(2589)
  @PropGet
  RTExcelObj.PivotFilters pivotFilters();


  /**
   * <p>
   * Getter method for the COM property "AutoSortPivotLine"
   * </p>
   */

  @DISPID(2590)
  @PropGet
  RTExcelObj.PivotLine autoSortPivotLine();


  /**
   * <p>
   * Getter method for the COM property "AutoSortCustomSubtotal"
   * </p>
   */

  @DISPID(2591)
  @PropGet
  int autoSortCustomSubtotal();


  /**
   * <p>
   * Getter method for the COM property "ShowingInAxis"
   * </p>
   */

  @DISPID(2592)
  @PropGet
  boolean showingInAxis();


  /**
   * <p>
   * Getter method for the COM property "EnableMultiplePageItems"
   * </p>
   */

  @DISPID(2184)
  @PropGet
  boolean enableMultiplePageItems();


  /**
   * <p>
   * Setter method for the COM property "EnableMultiplePageItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2184)
  @PropPut
  void enableMultiplePageItems(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AllItemsVisible"
   * </p>
   */

  @DISPID(2593)
  @PropGet
  boolean allItemsVisible();


  /**
   */

  @DISPID(2594)
  void clearManualFilter();


  /**
   */

  @DISPID(2561)
  void clearAllFilters();


  /**
   */

  @DISPID(2595)
  void clearValueFilters();


  /**
   */

  @DISPID(2596)
  void clearLabelFilters();


  /**
   * @param order Mandatory int parameter.
   * @param field Mandatory java.lang.String parameter.
   * @param pivotLine Optional parameter. Default value is com4j.Variant.getMissing()
   * @param customSubtotal Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1514)
  void autoSort(
    int order,
    java.lang.String field,
    @Optional java.lang.Object pivotLine,
    @Optional java.lang.Object customSubtotal);


  /**
   * <p>
   * Getter method for the COM property "SourceCaption"
   * </p>
   */

  @DISPID(2599)
  @PropGet
  java.lang.String sourceCaption();


  /**
   * <p>
   * Getter method for the COM property "ShowDetail"
   * </p>
   */

  @DISPID(585)
  @PropGet
  boolean showDetail();


  /**
   * <p>
   * Setter method for the COM property "ShowDetail"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(585)
  @PropPut
  void showDetail(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RepeatLabels"
   * </p>
   */

  @DISPID(2885)
  @PropGet
  boolean repeatLabels();


  /**
   * <p>
   * Setter method for the COM property "RepeatLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2885)
  @PropPut
  void repeatLabels(
    boolean rhs);


  /**
   */

  @DISPID(3165)
  void autoGroup();


  // Properties:
}

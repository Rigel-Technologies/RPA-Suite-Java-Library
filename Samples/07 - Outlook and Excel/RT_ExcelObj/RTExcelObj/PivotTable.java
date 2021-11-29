package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotTable extends Com4jObject {
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
   * @param rowFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFields Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToTable Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(708)
  java.lang.Object addFields(
    @Optional java.lang.Object rowFields,
    @Optional java.lang.Object columnFields,
    @Optional java.lang.Object pageFields,
    @Optional java.lang.Object addToTable);


  /**
   * <p>
   * Getter method for the COM property "ColumnFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(713)
  @PropGet
  com4j.Com4jObject columnFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "ColumnGrand"
   * </p>
   */

  @DISPID(694)
  @PropGet
  boolean columnGrand();


  /**
   * <p>
   * Setter method for the COM property "ColumnGrand"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(694)
  @PropPut
  void columnGrand(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ColumnRange"
   * </p>
   */

  @DISPID(702)
  @PropGet
  RTExcelObj.Range columnRange();


  /**
   * @param pageField Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(706)
  java.lang.Object showPages(
    @Optional java.lang.Object pageField);


  /**
   * <p>
   * Getter method for the COM property "DataBodyRange"
   * </p>
   */

  @DISPID(705)
  @PropGet
  RTExcelObj.Range dataBodyRange();


  /**
   * <p>
   * Getter method for the COM property "DataFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(715)
  @PropGet
  com4j.Com4jObject dataFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "DataLabelRange"
   * </p>
   */

  @DISPID(704)
  @PropGet
  RTExcelObj.Range dataLabelRange();


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
   * Getter method for the COM property "HasAutoFormat"
   * </p>
   */

  @DISPID(695)
  @PropGet
  boolean hasAutoFormat();


  /**
   * <p>
   * Setter method for the COM property "HasAutoFormat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(695)
  @PropPut
  void hasAutoFormat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HiddenFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(711)
  @PropGet
  com4j.Com4jObject hiddenFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "InnerDetail"
   * </p>
   */

  @DISPID(698)
  @PropGet
  java.lang.String innerDetail();


  /**
   * <p>
   * Setter method for the COM property "InnerDetail"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(698)
  @PropPut
  void innerDetail(
    java.lang.String rhs);


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
   * Getter method for the COM property "PageFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(714)
  @PropGet
  com4j.Com4jObject pageFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "PageRange"
   * </p>
   */

  @DISPID(703)
  @PropGet
  RTExcelObj.Range pageRange();


  /**
   * <p>
   * Getter method for the COM property "PageRangeCells"
   * </p>
   */

  @DISPID(1482)
  @PropGet
  RTExcelObj.Range pageRangeCells();


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(718)
  com4j.Com4jObject pivotFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RefreshDate"
   * </p>
   */

  @DISPID(696)
  @PropGet
  java.util.Date refreshDate();


  /**
   * <p>
   * Getter method for the COM property "RefreshName"
   * </p>
   */

  @DISPID(697)
  @PropGet
  java.lang.String refreshName();


  /**
   */

  @DISPID(717)
  boolean refreshTable();


  /**
   * <p>
   * Getter method for the COM property "RowFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(712)
  @PropGet
  com4j.Com4jObject rowFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "RowGrand"
   * </p>
   */

  @DISPID(693)
  @PropGet
  boolean rowGrand();


  /**
   * <p>
   * Setter method for the COM property "RowGrand"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(693)
  @PropPut
  void rowGrand(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RowRange"
   * </p>
   */

  @DISPID(701)
  @PropGet
  RTExcelObj.Range rowRange();


  /**
   * <p>
   * Getter method for the COM property "SaveData"
   * </p>
   */

  @DISPID(692)
  @PropGet
  boolean saveData();


  /**
   * <p>
   * Setter method for the COM property "SaveData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(692)
  @PropPut
  void saveData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   */

  @DISPID(686)
  @PropGet
  java.lang.Object sourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(686)
  @PropPut
  void sourceData(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TableRange1"
   * </p>
   */

  @DISPID(699)
  @PropGet
  RTExcelObj.Range tableRange1();


  /**
   * <p>
   * Getter method for the COM property "TableRange2"
   * </p>
   */

  @DISPID(700)
  @PropGet
  RTExcelObj.Range tableRange2();


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
   * Getter method for the COM property "VisibleFields"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(710)
  @PropGet
  com4j.Com4jObject visibleFields(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "CacheIndex"
   * </p>
   */

  @DISPID(1483)
  @PropGet
  int cacheIndex();


  /**
   * <p>
   * Setter method for the COM property "CacheIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1483)
  @PropPut
  void cacheIndex(
    int rhs);


  /**
   */

  @DISPID(1484)
  RTExcelObj.CalculatedFields calculatedFields();


  /**
   * <p>
   * Getter method for the COM property "DisplayErrorString"
   * </p>
   */

  @DISPID(1485)
  @PropGet
  boolean displayErrorString();


  /**
   * <p>
   * Setter method for the COM property "DisplayErrorString"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1485)
  @PropPut
  void displayErrorString(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayNullString"
   * </p>
   */

  @DISPID(1486)
  @PropGet
  boolean displayNullString();


  /**
   * <p>
   * Setter method for the COM property "DisplayNullString"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1486)
  @PropPut
  void displayNullString(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableDrilldown"
   * </p>
   */

  @DISPID(1487)
  @PropGet
  boolean enableDrilldown();


  /**
   * <p>
   * Setter method for the COM property "EnableDrilldown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1487)
  @PropPut
  void enableDrilldown(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableFieldDialog"
   * </p>
   */

  @DISPID(1488)
  @PropGet
  boolean enableFieldDialog();


  /**
   * <p>
   * Setter method for the COM property "EnableFieldDialog"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1488)
  @PropPut
  void enableFieldDialog(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableWizard"
   * </p>
   */

  @DISPID(1489)
  @PropGet
  boolean enableWizard();


  /**
   * <p>
   * Setter method for the COM property "EnableWizard"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1489)
  @PropPut
  void enableWizard(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ErrorString"
   * </p>
   */

  @DISPID(1490)
  @PropGet
  java.lang.String errorString();


  /**
   * <p>
   * Setter method for the COM property "ErrorString"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1490)
  @PropPut
  void errorString(
    java.lang.String rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(1491)
  double getData(
    java.lang.String name);


  /**
   */

  @DISPID(1492)
  void listFormulas();


  /**
   * <p>
   * Getter method for the COM property "ManualUpdate"
   * </p>
   */

  @DISPID(1493)
  @PropGet
  boolean manualUpdate();


  /**
   * <p>
   * Setter method for the COM property "ManualUpdate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1493)
  @PropPut
  void manualUpdate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MergeLabels"
   * </p>
   */

  @DISPID(1494)
  @PropGet
  boolean mergeLabels();


  /**
   * <p>
   * Setter method for the COM property "MergeLabels"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1494)
  @PropPut
  void mergeLabels(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NullString"
   * </p>
   */

  @DISPID(1495)
  @PropGet
  java.lang.String nullString();


  /**
   * <p>
   * Setter method for the COM property "NullString"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1495)
  @PropPut
  void nullString(
    java.lang.String rhs);


  /**
   */

  @DISPID(1496)
  RTExcelObj.PivotCache pivotCache();


  /**
   * <p>
   * Getter method for the COM property "PivotFormulas"
   * </p>
   */

  @DISPID(1497)
  @PropGet
  RTExcelObj.PivotFormulas pivotFormulas();


  /**
   * @param sourceType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param sourceData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableDestination Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableName Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rowGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnGrand Optional parameter. Default value is com4j.Variant.getMissing()
   * @param saveData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hasAutoFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param autoPage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param reserved Optional parameter. Default value is com4j.Variant.getMissing()
   * @param backgroundQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @param optimizeCache Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pageFieldWrapCount Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readData Optional parameter. Default value is com4j.Variant.getMissing()
   * @param connection Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(684)
  void pivotTableWizard(
    @Optional java.lang.Object sourceType,
    @Optional java.lang.Object sourceData,
    @Optional java.lang.Object tableDestination,
    @Optional java.lang.Object tableName,
    @Optional java.lang.Object rowGrand,
    @Optional java.lang.Object columnGrand,
    @Optional java.lang.Object saveData,
    @Optional java.lang.Object hasAutoFormat,
    @Optional java.lang.Object autoPage,
    @Optional java.lang.Object reserved,
    @Optional java.lang.Object backgroundQuery,
    @Optional java.lang.Object optimizeCache,
    @Optional java.lang.Object pageFieldOrder,
    @Optional java.lang.Object pageFieldWrapCount,
    @Optional java.lang.Object readData,
    @Optional java.lang.Object connection);


  /**
   * <p>
   * Getter method for the COM property "SubtotalHiddenPageItems"
   * </p>
   */

  @DISPID(1498)
  @PropGet
  boolean subtotalHiddenPageItems();


  /**
   * <p>
   * Setter method for the COM property "SubtotalHiddenPageItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1498)
  @PropPut
  void subtotalHiddenPageItems(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldOrder"
   * </p>
   */

  @DISPID(1429)
  @PropGet
  int pageFieldOrder();


  /**
   * <p>
   * Setter method for the COM property "PageFieldOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1429)
  @PropPut
  void pageFieldOrder(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldStyle"
   * </p>
   */

  @DISPID(1499)
  @PropGet
  java.lang.String pageFieldStyle();


  /**
   * <p>
   * Setter method for the COM property "PageFieldStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1499)
  @PropPut
  void pageFieldStyle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageFieldWrapCount"
   * </p>
   */

  @DISPID(1430)
  @PropGet
  int pageFieldWrapCount();


  /**
   * <p>
   * Setter method for the COM property "PageFieldWrapCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1430)
  @PropPut
  void pageFieldWrapCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveFormatting"
   * </p>
   */

  @DISPID(1500)
  @PropGet
  boolean preserveFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1500)
  @PropPut
  void preserveFormatting(
    boolean rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   */

  @DISPID(2087)
  void _PivotSelect(
    java.lang.String name,
    @Optional @DefaultValue("0") RTExcelObj.XlPTSelectionMode mode);


  /**
   * <p>
   * Getter method for the COM property "PivotSelection"
   * </p>
   */

  @DISPID(1502)
  @PropGet
  java.lang.String pivotSelection();


  /**
   * <p>
   * Setter method for the COM property "PivotSelection"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1502)
  @PropPut
  void pivotSelection(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SelectionMode"
   * </p>
   */

  @DISPID(1503)
  @PropGet
  RTExcelObj.XlPTSelectionMode selectionMode();


  /**
   * <p>
   * Setter method for the COM property "SelectionMode"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPTSelectionMode parameter.
   */

  @DISPID(1503)
  @PropPut
  void selectionMode(
    RTExcelObj.XlPTSelectionMode rhs);


  /**
   * <p>
   * Getter method for the COM property "TableStyle"
   * </p>
   */

  @DISPID(1504)
  @PropGet
  java.lang.String tableStyle();


  /**
   * <p>
   * Setter method for the COM property "TableStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1504)
  @PropPut
  void tableStyle(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Tag"
   * </p>
   */

  @DISPID(1505)
  @PropGet
  java.lang.String tag();


  /**
   * <p>
   * Setter method for the COM property "Tag"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1505)
  @PropPut
  void tag(
    java.lang.String rhs);


  /**
   */

  @DISPID(680)
  void update();


  /**
   * <p>
   * Getter method for the COM property "VacatedStyle"
   * </p>
   */

  @DISPID(1506)
  @PropGet
  java.lang.String vacatedStyle();


  /**
   * <p>
   * Setter method for the COM property "VacatedStyle"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1506)
  @PropPut
  void vacatedStyle(
    java.lang.String rhs);


  /**
   * @param format Mandatory RTExcelObj.XlPivotFormatType parameter.
   */

  @DISPID(116)
  void format(
    RTExcelObj.XlPivotFormatType format);


  /**
   * <p>
   * Getter method for the COM property "PrintTitles"
   * </p>
   */

  @DISPID(1838)
  @PropGet
  boolean printTitles();


  /**
   * <p>
   * Setter method for the COM property "PrintTitles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1838)
  @PropPut
  void printTitles(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CubeFields"
   * </p>
   */

  @DISPID(1839)
  @PropGet
  RTExcelObj.CubeFields cubeFields();


  /**
   * <p>
   * Getter method for the COM property "GrandTotalName"
   * </p>
   */

  @DISPID(1840)
  @PropGet
  java.lang.String grandTotalName();


  /**
   * <p>
   * Setter method for the COM property "GrandTotalName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1840)
  @PropPut
  void grandTotalName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SmallGrid"
   * </p>
   */

  @DISPID(1841)
  @PropGet
  boolean smallGrid();


  /**
   * <p>
   * Setter method for the COM property "SmallGrid"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1841)
  @PropPut
  void smallGrid(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RepeatItemsOnEachPrintedPage"
   * </p>
   */

  @DISPID(1842)
  @PropGet
  boolean repeatItemsOnEachPrintedPage();


  /**
   * <p>
   * Setter method for the COM property "RepeatItemsOnEachPrintedPage"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1842)
  @PropPut
  void repeatItemsOnEachPrintedPage(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TotalsAnnotation"
   * </p>
   */

  @DISPID(1843)
  @PropGet
  boolean totalsAnnotation();


  /**
   * <p>
   * Setter method for the COM property "TotalsAnnotation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1843)
  @PropPut
  void totalsAnnotation(
    boolean rhs);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param mode Optional parameter. Default value is 0
   * @param useStandardName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1501)
  void pivotSelect(
    java.lang.String name,
    @Optional @DefaultValue("0") RTExcelObj.XlPTSelectionMode mode,
    @Optional java.lang.Object useStandardName);


  /**
   * <p>
   * Getter method for the COM property "PivotSelectionStandard"
   * </p>
   */

  @DISPID(2089)
  @PropGet
  java.lang.String pivotSelectionStandard();


  /**
   * <p>
   * Setter method for the COM property "PivotSelectionStandard"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2089)
  @PropPut
  void pivotSelectionStandard(
    java.lang.String rhs);


  /**
   * @param dataField Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param field14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param item14 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2090)
  RTExcelObj.Range getPivotData(
    @Optional java.lang.Object dataField,
    @Optional java.lang.Object field1,
    @Optional java.lang.Object item1,
    @Optional java.lang.Object field2,
    @Optional java.lang.Object item2,
    @Optional java.lang.Object field3,
    @Optional java.lang.Object item3,
    @Optional java.lang.Object field4,
    @Optional java.lang.Object item4,
    @Optional java.lang.Object field5,
    @Optional java.lang.Object item5,
    @Optional java.lang.Object field6,
    @Optional java.lang.Object item6,
    @Optional java.lang.Object field7,
    @Optional java.lang.Object item7,
    @Optional java.lang.Object field8,
    @Optional java.lang.Object item8,
    @Optional java.lang.Object field9,
    @Optional java.lang.Object item9,
    @Optional java.lang.Object field10,
    @Optional java.lang.Object item10,
    @Optional java.lang.Object field11,
    @Optional java.lang.Object item11,
    @Optional java.lang.Object field12,
    @Optional java.lang.Object item12,
    @Optional java.lang.Object field13,
    @Optional java.lang.Object item13,
    @Optional java.lang.Object field14,
    @Optional java.lang.Object item14);


  /**
   * <p>
   * Getter method for the COM property "DataPivotField"
   * </p>
   */

  @DISPID(2120)
  @PropGet
  RTExcelObj.PivotField dataPivotField();


  /**
   * <p>
   * Getter method for the COM property "EnableDataValueEditing"
   * </p>
   */

  @DISPID(2121)
  @PropGet
  boolean enableDataValueEditing();


  /**
   * <p>
   * Setter method for the COM property "EnableDataValueEditing"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2121)
  @PropPut
  void enableDataValueEditing(
    boolean rhs);


  /**
   * @param field Mandatory com4j.Com4jObject parameter.
   * @param caption Optional parameter. Default value is com4j.Variant.getMissing()
   * @param function Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2122)
  RTExcelObj.PivotField addDataField(
    com4j.Com4jObject field,
    @Optional java.lang.Object caption,
    @Optional java.lang.Object function);


  /**
   * <p>
   * Getter method for the COM property "MDX"
   * </p>
   */

  @DISPID(2123)
  @PropGet
  java.lang.String mdx();


  /**
   * <p>
   * Getter method for the COM property "ViewCalculatedMembers"
   * </p>
   */

  @DISPID(2124)
  @PropGet
  boolean viewCalculatedMembers();


  /**
   * <p>
   * Setter method for the COM property "ViewCalculatedMembers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2124)
  @PropPut
  void viewCalculatedMembers(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CalculatedMembers"
   * </p>
   */

  @DISPID(2125)
  @PropGet
  RTExcelObj.CalculatedMembers calculatedMembers();


  /**
   * <p>
   * Getter method for the COM property "DisplayImmediateItems"
   * </p>
   */

  @DISPID(2126)
  @PropGet
  boolean displayImmediateItems();


  /**
   * <p>
   * Setter method for the COM property "DisplayImmediateItems"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2126)
  @PropPut
  void displayImmediateItems(
    boolean rhs);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg5 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg6 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg7 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg8 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg9 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg10 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg11 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg12 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg13 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg14 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg15 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg16 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg17 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg18 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg19 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg20 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg21 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg22 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg23 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg24 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg25 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg26 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg27 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg28 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg29 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg30 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2127)
  java.lang.Object dummy15(
    java.lang.Object arg1,
    @Optional java.lang.Object arg2,
    @Optional java.lang.Object arg3,
    @Optional java.lang.Object arg4,
    @Optional java.lang.Object arg5,
    @Optional java.lang.Object arg6,
    @Optional java.lang.Object arg7,
    @Optional java.lang.Object arg8,
    @Optional java.lang.Object arg9,
    @Optional java.lang.Object arg10,
    @Optional java.lang.Object arg11,
    @Optional java.lang.Object arg12,
    @Optional java.lang.Object arg13,
    @Optional java.lang.Object arg14,
    @Optional java.lang.Object arg15,
    @Optional java.lang.Object arg16,
    @Optional java.lang.Object arg17,
    @Optional java.lang.Object arg18,
    @Optional java.lang.Object arg19,
    @Optional java.lang.Object arg20,
    @Optional java.lang.Object arg21,
    @Optional java.lang.Object arg22,
    @Optional java.lang.Object arg23,
    @Optional java.lang.Object arg24,
    @Optional java.lang.Object arg25,
    @Optional java.lang.Object arg26,
    @Optional java.lang.Object arg27,
    @Optional java.lang.Object arg28,
    @Optional java.lang.Object arg29,
    @Optional java.lang.Object arg30);


  /**
   * <p>
   * Getter method for the COM property "EnableFieldList"
   * </p>
   */

  @DISPID(2128)
  @PropGet
  boolean enableFieldList();


  /**
   * <p>
   * Setter method for the COM property "EnableFieldList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2128)
  @PropPut
  void enableFieldList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "VisualTotals"
   * </p>
   */

  @DISPID(2129)
  @PropGet
  boolean visualTotals();


  /**
   * <p>
   * Setter method for the COM property "VisualTotals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2129)
  @PropPut
  void visualTotals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowPageMultipleItemLabel"
   * </p>
   */

  @DISPID(2130)
  @PropGet
  boolean showPageMultipleItemLabel();


  /**
   * <p>
   * Setter method for the COM property "ShowPageMultipleItemLabel"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2130)
  @PropPut
  void showPageMultipleItemLabel(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   */

  @DISPID(392)
  @PropGet
  RTExcelObj.XlPivotTableVersionList version();


  /**
   * @param file Mandatory java.lang.String parameter.
   * @param measures Optional parameter. Default value is com4j.Variant.getMissing()
   * @param levels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param members Optional parameter. Default value is com4j.Variant.getMissing()
   * @param properties Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2131)
  java.lang.String createCubeFile(
    java.lang.String file,
    @Optional java.lang.Object measures,
    @Optional java.lang.Object levels,
    @Optional java.lang.Object members,
    @Optional java.lang.Object properties);


  /**
   * <p>
   * Getter method for the COM property "DisplayEmptyRow"
   * </p>
   */

  @DISPID(2136)
  @PropGet
  boolean displayEmptyRow();


  /**
   * <p>
   * Setter method for the COM property "DisplayEmptyRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2136)
  @PropPut
  void displayEmptyRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayEmptyColumn"
   * </p>
   */

  @DISPID(2137)
  @PropGet
  boolean displayEmptyColumn();


  /**
   * <p>
   * Setter method for the COM property "DisplayEmptyColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2137)
  @PropPut
  void displayEmptyColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowCellBackgroundFromOLAP"
   * </p>
   */

  @DISPID(2138)
  @PropGet
  boolean showCellBackgroundFromOLAP();


  /**
   * <p>
   * Setter method for the COM property "ShowCellBackgroundFromOLAP"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2138)
  @PropPut
  void showCellBackgroundFromOLAP(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PivotColumnAxis"
   * </p>
   */

  @DISPID(2546)
  @PropGet
  RTExcelObj.PivotAxis pivotColumnAxis();


  /**
   * <p>
   * Getter method for the COM property "PivotRowAxis"
   * </p>
   */

  @DISPID(2547)
  @PropGet
  RTExcelObj.PivotAxis pivotRowAxis();


  /**
   * <p>
   * Getter method for the COM property "ShowDrillIndicators"
   * </p>
   */

  @DISPID(2548)
  @PropGet
  boolean showDrillIndicators();


  /**
   * <p>
   * Setter method for the COM property "ShowDrillIndicators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2548)
  @PropPut
  void showDrillIndicators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintDrillIndicators"
   * </p>
   */

  @DISPID(2549)
  @PropGet
  boolean printDrillIndicators();


  /**
   * <p>
   * Setter method for the COM property "PrintDrillIndicators"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2549)
  @PropPut
  void printDrillIndicators(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayMemberPropertyTooltips"
   * </p>
   */

  @DISPID(2550)
  @PropGet
  boolean displayMemberPropertyTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayMemberPropertyTooltips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2550)
  @PropPut
  void displayMemberPropertyTooltips(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayContextTooltips"
   * </p>
   */

  @DISPID(2551)
  @PropGet
  boolean displayContextTooltips();


  /**
   * <p>
   * Setter method for the COM property "DisplayContextTooltips"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2551)
  @PropPut
  void displayContextTooltips(
    boolean rhs);


  /**
   */

  @DISPID(2552)
  void clearTable();


  /**
   * <p>
   * Getter method for the COM property "CompactRowIndent"
   * </p>
   */

  @DISPID(2553)
  @PropGet
  int compactRowIndent();


  /**
   * <p>
   * Setter method for the COM property "CompactRowIndent"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2553)
  @PropPut
  void compactRowIndent(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LayoutRowDefault"
   * </p>
   */

  @DISPID(2554)
  @PropGet
  RTExcelObj.XlLayoutRowType layoutRowDefault();


  /**
   * <p>
   * Setter method for the COM property "LayoutRowDefault"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlLayoutRowType parameter.
   */

  @DISPID(2554)
  @PropPut
  void layoutRowDefault(
    RTExcelObj.XlLayoutRowType rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFieldCaptions"
   * </p>
   */

  @DISPID(2555)
  @PropGet
  boolean displayFieldCaptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayFieldCaptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2555)
  @PropPut
  void displayFieldCaptions(
    boolean rhs);


  /**
   * @param rowLayout Mandatory RTExcelObj.XlLayoutRowType parameter.
   */

  @DISPID(2556)
  void rowAxisLayout(
    RTExcelObj.XlLayoutRowType rowLayout);


  /**
   * @param location Mandatory RTExcelObj.XlSubtototalLocationType parameter.
   */

  @DISPID(2558)
  void subtotalLocation(
    RTExcelObj.XlSubtototalLocationType location);


  /**
   * <p>
   * Getter method for the COM property "ActiveFilters"
   * </p>
   */

  @DISPID(2559)
  @PropGet
  RTExcelObj.PivotFilters activeFilters();


  /**
   * <p>
   * Getter method for the COM property "InGridDropZones"
   * </p>
   */

  @DISPID(2560)
  @PropGet
  boolean inGridDropZones();


  /**
   * <p>
   * Setter method for the COM property "InGridDropZones"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2560)
  @PropPut
  void inGridDropZones(
    boolean rhs);


  /**
   */

  @DISPID(2561)
  void clearAllFilters();


  /**
   * <p>
   * Getter method for the COM property "TableStyle2"
   * </p>
   */

  @DISPID(2562)
  @PropGet
  java.lang.Object tableStyle2();


  /**
   * <p>
   * Setter method for the COM property "TableStyle2"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2562)
  @PropPut
  void tableStyle2(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   */

  @DISPID(2563)
  @PropGet
  boolean showTableStyleLastColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2563)
  @PropPut
  void showTableStyleLastColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   */

  @DISPID(2564)
  @PropGet
  boolean showTableStyleRowStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2564)
  @PropPut
  void showTableStyleRowStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   */

  @DISPID(2565)
  @PropGet
  boolean showTableStyleColumnStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2565)
  @PropPut
  void showTableStyleColumnStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleRowHeaders"
   * </p>
   */

  @DISPID(2566)
  @PropGet
  boolean showTableStyleRowHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2566)
  @PropPut
  void showTableStyleRowHeaders(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnHeaders"
   * </p>
   */

  @DISPID(2567)
  @PropGet
  boolean showTableStyleColumnHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2567)
  @PropPut
  void showTableStyleColumnHeaders(
    boolean rhs);


  /**
   * @param convertFilters Mandatory boolean parameter.
   */

  @DISPID(2568)
  void convertToFormulas(
    boolean convertFilters);


  /**
   * <p>
   * Getter method for the COM property "AllowMultipleFilters"
   * </p>
   */

  @DISPID(2570)
  @PropGet
  boolean allowMultipleFilters();


  /**
   * <p>
   * Setter method for the COM property "AllowMultipleFilters"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2570)
  @PropPut
  void allowMultipleFilters(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CompactLayoutRowHeader"
   * </p>
   */

  @DISPID(2571)
  @PropGet
  java.lang.String compactLayoutRowHeader();


  /**
   * <p>
   * Setter method for the COM property "CompactLayoutRowHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2571)
  @PropPut
  void compactLayoutRowHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CompactLayoutColumnHeader"
   * </p>
   */

  @DISPID(2572)
  @PropGet
  java.lang.String compactLayoutColumnHeader();


  /**
   * <p>
   * Setter method for the COM property "CompactLayoutColumnHeader"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2572)
  @PropPut
  void compactLayoutColumnHeader(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "FieldListSortAscending"
   * </p>
   */

  @DISPID(2573)
  @PropGet
  boolean fieldListSortAscending();


  /**
   * <p>
   * Setter method for the COM property "FieldListSortAscending"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2573)
  @PropPut
  void fieldListSortAscending(
    boolean rhs);


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
   * @param conn Mandatory RTExcelObj.WorkbookConnection parameter.
   */

  @DISPID(2575)
  void changeConnection(
    RTExcelObj.WorkbookConnection conn);


  /**
   * @param pivotCache Mandatory java.lang.Object parameter.
   */

  @DISPID(2577)
  void changePivotCache(
    java.lang.Object pivotCache);


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   */

  @DISPID(1397)
  @PropGet
  java.lang.String location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1397)
  @PropPut
  void location(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableWriteback"
   * </p>
   */

  @DISPID(2872)
  @PropGet
  boolean enableWriteback();


  /**
   * <p>
   * Setter method for the COM property "EnableWriteback"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2872)
  @PropPut
  void enableWriteback(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Allocation"
   * </p>
   */

  @DISPID(2873)
  @PropGet
  RTExcelObj.XlAllocation allocation();


  /**
   * <p>
   * Setter method for the COM property "Allocation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAllocation parameter.
   */

  @DISPID(2873)
  @PropPut
  void allocation(
    RTExcelObj.XlAllocation rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationValue"
   * </p>
   */

  @DISPID(2874)
  @PropGet
  RTExcelObj.XlAllocationValue allocationValue();


  /**
   * <p>
   * Setter method for the COM property "AllocationValue"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAllocationValue parameter.
   */

  @DISPID(2874)
  @PropPut
  void allocationValue(
    RTExcelObj.XlAllocationValue rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationMethod"
   * </p>
   */

  @DISPID(2875)
  @PropGet
  RTExcelObj.XlAllocationMethod allocationMethod();


  /**
   * <p>
   * Setter method for the COM property "AllocationMethod"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlAllocationMethod parameter.
   */

  @DISPID(2875)
  @PropPut
  void allocationMethod(
    RTExcelObj.XlAllocationMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "AllocationWeightExpression"
   * </p>
   */

  @DISPID(2876)
  @PropGet
  java.lang.String allocationWeightExpression();


  /**
   * <p>
   * Setter method for the COM property "AllocationWeightExpression"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2876)
  @PropPut
  void allocationWeightExpression(
    java.lang.String rhs);


  /**
   */

  @DISPID(2855)
  void allocateChanges();


  /**
   */

  @DISPID(2877)
  void commitChanges();


  /**
   */

  @DISPID(2856)
  void discardChanges();


  /**
   */

  @DISPID(2878)
  void refreshDataSourceValues();


  /**
   * @param repeat Mandatory RTExcelObj.XlPivotFieldRepeatLabels parameter.
   */

  @DISPID(2879)
  void repeatAllLabels(
    RTExcelObj.XlPivotFieldRepeatLabels repeat);


  /**
   * <p>
   * Getter method for the COM property "ChangeList"
   * </p>
   */

  @DISPID(2880)
  @PropGet
  RTExcelObj.PivotTableChangeList changeList();


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
   * Getter method for the COM property "AlternativeText"
   * </p>
   */

  @DISPID(1891)
  @PropGet
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1891)
  @PropPut
  void alternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   */

  @DISPID(273)
  @PropGet
  java.lang.String summary();


  /**
   * <p>
   * Setter method for the COM property "Summary"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(273)
  @PropPut
  void summary(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "VisualTotalsForSets"
   * </p>
   */

  @DISPID(2882)
  @PropGet
  boolean visualTotalsForSets();


  /**
   * <p>
   * Setter method for the COM property "VisualTotalsForSets"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2882)
  @PropPut
  void visualTotalsForSets(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowValuesRow"
   * </p>
   */

  @DISPID(2883)
  @PropGet
  boolean showValuesRow();


  /**
   * <p>
   * Setter method for the COM property "ShowValuesRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2883)
  @PropPut
  void showValuesRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CalculatedMembersInFilters"
   * </p>
   */

  @DISPID(2884)
  @PropGet
  boolean calculatedMembersInFilters();


  /**
   * <p>
   * Setter method for the COM property "CalculatedMembersInFilters"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2884)
  @PropPut
  void calculatedMembersInFilters(
    boolean rhs);


  /**
   * @param rowline Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnline Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3064)
  RTExcelObj.PivotValueCell pivotValueCell(
    @Optional java.lang.Object rowline,
    @Optional java.lang.Object columnline);


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
   * Getter method for the COM property "PivotChart"
   * </p>
   */

  @DISPID(3067)
  @PropGet
  RTExcelObj.Shape pivotChart();


  /**
   * @param pivotItem Mandatory RTExcelObj.PivotItem parameter.
   * @param pivotLine Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3068)
  void drillDown(
    RTExcelObj.PivotItem pivotItem,
    @Optional java.lang.Object pivotLine);


  /**
   * @param pivotItem Mandatory RTExcelObj.PivotItem parameter.
   * @param pivotLine Optional parameter. Default value is com4j.Variant.getMissing()
   * @param levelUniqueName Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(3069)
  void drillUp(
    RTExcelObj.PivotItem pivotItem,
    @Optional java.lang.Object pivotLine,
    @Optional java.lang.Object levelUniqueName);


  /**
   * @param pivotItem Mandatory RTExcelObj.PivotItem parameter.
   * @param cubeField Mandatory RTExcelObj.CubeField parameter.
   * @param pivotLine Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2580)
  void drillTo(
    RTExcelObj.PivotItem pivotItem,
    RTExcelObj.CubeField cubeField,
    @Optional java.lang.Object pivotLine);


  /**
   * @param arg1 Mandatory java.lang.Object parameter.
   * @param arg2 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg3 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param arg4 Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1783)
  java.lang.Object dummy2(
    java.lang.Object arg1,
    @Optional java.lang.Object arg2,
    @Optional java.lang.Object arg3,
    @Optional java.lang.Object arg4);


  // Properties:
}

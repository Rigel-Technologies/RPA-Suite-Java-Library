package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ListObject extends Com4jObject {
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
   */

  @DISPID(117)
  void delete();


  /**
   * @param target Mandatory java.lang.Object parameter.
   * @param linkSource Mandatory boolean parameter.
   */

  @DISPID(1895)
  java.lang.String publish(
    java.lang.Object target,
    boolean linkSource);


  /**
   */

  @DISPID(1417)
  void refresh();


  /**
   */

  @DISPID(2308)
  void unlink();


  /**
   */

  @DISPID(2309)
  void unlist();


  /**
   * @param iConflictType Optional parameter. Default value is 0
   */

  @DISPID(2310)
  void updateChanges(
    @Optional @DefaultValue("0") RTExcelObj.XlListConflict iConflictType);


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(256)
  void resize(
    RTExcelObj.Range range);


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
   * Getter method for the COM property "Active"
   * </p>
   */

  @DISPID(2312)
  @PropGet
  boolean active();


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
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   */

  @DISPID(1774)
  @PropGet
  boolean displayRightToLeft();


  /**
   * <p>
   * Getter method for the COM property "HeaderRowRange"
   * </p>
   */

  @DISPID(2313)
  @PropGet
  RTExcelObj.Range headerRowRange();


  /**
   * <p>
   * Getter method for the COM property "InsertRowRange"
   * </p>
   */

  @DISPID(2314)
  @PropGet
  RTExcelObj.Range insertRowRange();


  /**
   * <p>
   * Getter method for the COM property "ListColumns"
   * </p>
   */

  @DISPID(2315)
  @PropGet
  RTExcelObj.ListColumns listColumns();


  /**
   * <p>
   * Getter method for the COM property "ListRows"
   * </p>
   */

  @DISPID(2316)
  @PropGet
  RTExcelObj.ListRows listRows();


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
   * Getter method for the COM property "QueryTable"
   * </p>
   */

  @DISPID(1386)
  @PropGet
  RTExcelObj._QueryTable queryTable();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   */

  @DISPID(197)
  @PropGet
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "ShowAutoFilter"
   * </p>
   */

  @DISPID(2317)
  @PropGet
  boolean showAutoFilter();


  /**
   * <p>
   * Setter method for the COM property "ShowAutoFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2317)
  @PropPut
  void showAutoFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTotals"
   * </p>
   */

  @DISPID(2318)
  @PropGet
  boolean showTotals();


  /**
   * <p>
   * Setter method for the COM property "ShowTotals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2318)
  @PropPut
  void showTotals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   */

  @DISPID(685)
  @PropGet
  RTExcelObj.XlListObjectSourceType sourceType();


  /**
   * <p>
   * Getter method for the COM property "TotalsRowRange"
   * </p>
   */

  @DISPID(2319)
  @PropGet
  RTExcelObj.Range totalsRowRange();


  /**
   * <p>
   * Getter method for the COM property "SharePointURL"
   * </p>
   */

  @DISPID(2320)
  @PropGet
  java.lang.String sharePointURL();


  /**
   * <p>
   * Getter method for the COM property "XmlMap"
   * </p>
   */

  @DISPID(2253)
  @PropGet
  RTExcelObj.XmlMap xmlMap();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   */

  @DISPID(2677)
  @PropGet
  java.lang.String displayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2677)
  @PropPut
  void displayName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowHeaders"
   * </p>
   */

  @DISPID(2678)
  @PropGet
  boolean showHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2678)
  @PropPut
  void showHeaders(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilter"
   * </p>
   */

  @DISPID(793)
  @PropGet
  RTExcelObj.AutoFilter autoFilter();


  /**
   * <p>
   * Getter method for the COM property "TableStyle"
   * </p>
   */

  @DISPID(1504)
  @PropGet
  java.lang.Object tableStyle();


  /**
   * <p>
   * Setter method for the COM property "TableStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1504)
  @PropPut
  void tableStyle(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   */

  @DISPID(2679)
  @PropGet
  boolean showTableStyleFirstColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2679)
  @PropPut
  void showTableStyleFirstColumn(
    boolean rhs);


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
   * Getter method for the COM property "Sort"
   * </p>
   */

  @DISPID(880)
  @PropGet
  RTExcelObj.Sort sort();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   */

  @DISPID(910)
  @PropGet
  java.lang.String comment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(910)
  @PropPut
  void comment(
    java.lang.String rhs);


  /**
   */

  @DISPID(2680)
  void exportToVisio();


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
   * Getter method for the COM property "TableObject"
   * </p>
   */

  @DISPID(3095)
  @PropGet
  RTExcelObj.TableObject tableObject();


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
   * Getter method for the COM property "ShowAutoFilterDropDown"
   * </p>
   */

  @DISPID(3096)
  @PropGet
  boolean showAutoFilterDropDown();


  /**
   * <p>
   * Setter method for the COM property "ShowAutoFilterDropDown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3096)
  @PropPut
  void showAutoFilterDropDown(
    boolean rhs);


  // Properties:
}

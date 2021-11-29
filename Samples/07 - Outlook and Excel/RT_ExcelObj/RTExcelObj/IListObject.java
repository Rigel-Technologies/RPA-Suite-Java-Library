package RTExcelObj  ;

import com4j.*;

@IID("{00024471-0001-0000-C000-000000000046}")
public interface IListObject extends Com4jObject {
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
   */

  @VTID(10)
  void delete();


  /**
   * @param target Mandatory java.lang.Object parameter.
   * @param linkSource Mandatory boolean parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String publish(
    @MarshalAs(NativeType.VARIANT) java.lang.Object target,
    boolean linkSource);


  /**
   */

  @VTID(12)
  void refresh();


  /**
   */

  @VTID(13)
  void unlink();


  /**
   */

  @VTID(14)
  void unlist();


  /**
   * @param iConflictType Optional parameter. Default value is 0
   */

  @VTID(15)
  void updateChanges(
    @Optional @DefaultValue("0") RTExcelObj.XlListConflict iConflictType);


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @VTID(16)
  void resize(
    RTExcelObj.Range range);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Active"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean active();


  /**
   * <p>
   * Getter method for the COM property "DataBodyRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(19)
  RTExcelObj.Range dataBodyRange();


  /**
   * <p>
   * Getter method for the COM property "DisplayRightToLeft"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean displayRightToLeft();


  /**
   * <p>
   * Getter method for the COM property "HeaderRowRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(21)
  RTExcelObj.Range headerRowRange();


  /**
   * <p>
   * Getter method for the COM property "InsertRowRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(22)
  RTExcelObj.Range insertRowRange();


  /**
   * <p>
   * Getter method for the COM property "ListColumns"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListColumns
   */

  @VTID(23)
  RTExcelObj.ListColumns listColumns();


  /**
   * <p>
   * Getter method for the COM property "ListRows"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListRows
   */

  @VTID(24)
  RTExcelObj.ListRows listRows();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "QueryTable"
   * </p>
   * @return  Returns a value of type RTExcelObj._QueryTable
   */

  @VTID(27)
  RTExcelObj._QueryTable queryTable();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(28)
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "ShowAutoFilter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean showAutoFilter();


  /**
   * <p>
   * Setter method for the COM property "ShowAutoFilter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(30)
  void showAutoFilter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTotals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean showTotals();


  /**
   * <p>
   * Setter method for the COM property "ShowTotals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void showTotals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlListObjectSourceType
   */

  @VTID(33)
  RTExcelObj.XlListObjectSourceType sourceType();


  /**
   * <p>
   * Getter method for the COM property "TotalsRowRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(34)
  RTExcelObj.Range totalsRowRange();


  /**
   * <p>
   * Getter method for the COM property "SharePointURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(35)
  java.lang.String sharePointURL();


  /**
   * <p>
   * Getter method for the COM property "XmlMap"
   * </p>
   * @return  Returns a value of type RTExcelObj.XmlMap
   */

  @VTID(36)
  RTExcelObj.XmlMap xmlMap();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(37)
  java.lang.String displayName();


  /**
   * <p>
   * Setter method for the COM property "DisplayName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(38)
  void displayName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowHeaders"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(39)
  boolean showHeaders();


  /**
   * <p>
   * Setter method for the COM property "ShowHeaders"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(40)
  void showHeaders(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFilter"
   * </p>
   * @return  Returns a value of type RTExcelObj.AutoFilter
   */

  @VTID(41)
  RTExcelObj.AutoFilter autoFilter();


  /**
   * <p>
   * Getter method for the COM property "TableStyle"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object tableStyle();


  /**
   * <p>
   * Setter method for the COM property "TableStyle"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(43)
  void tableStyle(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(44)
  boolean showTableStyleFirstColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleFirstColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(45)
  void showTableStyleFirstColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(46)
  boolean showTableStyleLastColumn();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleLastColumn"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(47)
  void showTableStyleLastColumn(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean showTableStyleRowStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleRowStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void showTableStyleRowStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean showTableStyleColumnStripes();


  /**
   * <p>
   * Setter method for the COM property "ShowTableStyleColumnStripes"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(51)
  void showTableStyleColumnStripes(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sort
   */

  @VTID(52)
  RTExcelObj.Sort sort();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(53)
  java.lang.String comment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(54)
  void comment(
    java.lang.String rhs);


  /**
   */

  @VTID(55)
  void exportToVisio();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(56)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(57)
  void alternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Summary"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(58)
  java.lang.String summary();


  /**
   * <p>
   * Setter method for the COM property "Summary"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(59)
  void summary(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TableObject"
   * </p>
   * @return  Returns a value of type RTExcelObj.TableObject
   */

  @VTID(60)
  RTExcelObj.TableObject tableObject();


  /**
   * <p>
   * Getter method for the COM property "Slicers"
   * </p>
   * @return  Returns a value of type RTExcelObj.Slicers
   */

  @VTID(61)
  RTExcelObj.Slicers slicers();


  /**
   * <p>
   * Getter method for the COM property "ShowAutoFilterDropDown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(62)
  boolean showAutoFilterDropDown();


  /**
   * <p>
   * Setter method for the COM property "ShowAutoFilterDropDown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(63)
  void showAutoFilterDropDown(
    boolean rhs);


  // Properties:
}

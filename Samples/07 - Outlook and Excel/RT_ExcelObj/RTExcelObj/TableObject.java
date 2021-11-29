package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TableObject extends Com4jObject {
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
   * Getter method for the COM property "RowNumbers"
   * </p>
   */

  @DISPID(1585)
  @PropGet
  boolean rowNumbers();


  /**
   * <p>
   * Setter method for the COM property "RowNumbers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1585)
  @PropPut
  void rowNumbers(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FetchedRowOverflow"
   * </p>
   */

  @DISPID(1588)
  @PropGet
  boolean fetchedRowOverflow();


  /**
   * <p>
   * Getter method for the COM property "RefreshStyle"
   * </p>
   */

  @DISPID(1590)
  @PropGet
  RTExcelObj.XlCellInsertionMode refreshStyle();


  /**
   * <p>
   * Setter method for the COM property "RefreshStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCellInsertionMode parameter.
   */

  @DISPID(1590)
  @PropPut
  void refreshStyle(
    RTExcelObj.XlCellInsertionMode rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableRefresh"
   * </p>
   */

  @DISPID(1477)
  @PropGet
  boolean enableRefresh();


  /**
   * <p>
   * Setter method for the COM property "EnableRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1477)
  @PropPut
  void enableRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Destination"
   * </p>
   */

  @DISPID(681)
  @PropGet
  RTExcelObj.Range destination();


  /**
   * <p>
   * Getter method for the COM property "ResultRange"
   * </p>
   */

  @DISPID(1592)
  @PropGet
  RTExcelObj.Range resultRange();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   */

  @DISPID(1417)
  boolean refresh();


  /**
   * <p>
   * Getter method for the COM property "EnableEditing"
   * </p>
   */

  @DISPID(1595)
  @PropGet
  boolean enableEditing();


  /**
   * <p>
   * Setter method for the COM property "EnableEditing"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1595)
  @PropPut
  void enableEditing(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveColumnInfo"
   * </p>
   */

  @DISPID(1867)
  @PropGet
  boolean preserveColumnInfo();


  /**
   * <p>
   * Setter method for the COM property "PreserveColumnInfo"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1867)
  @PropPut
  void preserveColumnInfo(
    boolean rhs);


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
   * <p>
   * Getter method for the COM property "AdjustColumnWidth"
   * </p>
   */

  @DISPID(1868)
  @PropGet
  boolean adjustColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "AdjustColumnWidth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1868)
  @PropPut
  void adjustColumnWidth(
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
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   */

  @DISPID(2544)
  @PropGet
  RTExcelObj.WorkbookConnection workbookConnection();


  // Properties:
}

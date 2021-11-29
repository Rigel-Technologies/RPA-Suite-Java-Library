package RTExcelObj  ;

import com4j.*;

@IID("{000244CE-0001-0000-C000-000000000046}")
public interface ITableObject extends Com4jObject {
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
   * Getter method for the COM property "RowNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean rowNumbers();


  /**
   * <p>
   * Setter method for the COM property "RowNumbers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void rowNumbers(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FetchedRowOverflow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean fetchedRowOverflow();


  /**
   * <p>
   * Getter method for the COM property "RefreshStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCellInsertionMode
   */

  @VTID(13)
  RTExcelObj.XlCellInsertionMode refreshStyle();


  /**
   * <p>
   * Setter method for the COM property "RefreshStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCellInsertionMode parameter.
   */

  @VTID(14)
  void refreshStyle(
    RTExcelObj.XlCellInsertionMode rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean enableRefresh();


  /**
   * <p>
   * Setter method for the COM property "EnableRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void enableRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Destination"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(17)
  RTExcelObj.Range destination();


  /**
   * <p>
   * Getter method for the COM property "ResultRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(18)
  RTExcelObj.Range resultRange();


  /**
   */

  @VTID(19)
  void delete();


  /**
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean refresh();


  /**
   * <p>
   * Getter method for the COM property "EnableEditing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean enableEditing();


  /**
   * <p>
   * Setter method for the COM property "EnableEditing"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void enableEditing(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveColumnInfo"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean preserveColumnInfo();


  /**
   * <p>
   * Setter method for the COM property "PreserveColumnInfo"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(24)
  void preserveColumnInfo(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(25)
  boolean preserveFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(26)
  void preserveFormatting(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AdjustColumnWidth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(27)
  boolean adjustColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "AdjustColumnWidth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(28)
  void adjustColumnWidth(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ListObject"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListObject
   */

  @VTID(29)
  RTExcelObj.ListObject listObject();


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(30)
  RTExcelObj.WorkbookConnection workbookConnection();


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00024485-0001-0000-C000-000000000046}")
public interface IWorkbookConnection extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(11)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(13)
  void description(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  @DefaultMethod
  void _Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlConnectionType
   */

  @VTID(16)
  RTExcelObj.XlConnectionType type();


  /**
   * <p>
   * Getter method for the COM property "OLEDBConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.OLEDBConnection
   */

  @VTID(17)
  RTExcelObj.OLEDBConnection oledbConnection();


  /**
   * <p>
   * Getter method for the COM property "ODBCConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.ODBCConnection
   */

  @VTID(18)
  RTExcelObj.ODBCConnection odbcConnection();


  /**
   * <p>
   * Getter method for the COM property "Ranges"
   * </p>
   * @return  Returns a value of type RTExcelObj.Ranges
   */

  @VTID(19)
  RTExcelObj.Ranges ranges();


  /**
   */

  @VTID(20)
  void delete();


  /**
   */

  @VTID(21)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "ModelConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelConnection
   */

  @VTID(22)
  RTExcelObj.ModelConnection modelConnection();


  /**
   * <p>
   * Getter method for the COM property "WorksheetDataConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorksheetDataConnection
   */

  @VTID(23)
  RTExcelObj.WorksheetDataConnection worksheetDataConnection();


  /**
   * <p>
   * Getter method for the COM property "RefreshWithRefreshAll"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean refreshWithRefreshAll();


  /**
   * <p>
   * Setter method for the COM property "RefreshWithRefreshAll"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void refreshWithRefreshAll(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextConnection
   */

  @VTID(26)
  RTExcelObj.TextConnection textConnection();


  /**
   * <p>
   * Getter method for the COM property "DataFeedConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.DataFeedConnection
   */

  @VTID(27)
  RTExcelObj.DataFeedConnection dataFeedConnection();


  /**
   * <p>
   * Getter method for the COM property "InModel"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean inModel();


  /**
   * <p>
   * Getter method for the COM property "ModelTables"
   * </p>
   * @return  Returns a value of type RTExcelObj.ModelTables
   */

  @VTID(29)
  RTExcelObj.ModelTables modelTables();


  // Properties:
}

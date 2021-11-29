package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface WorkbookConnection extends Com4jObject {
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
   * Getter method for the COM property "Description"
   * </p>
   */

  @DISPID(218)
  @PropGet
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(218)
  @PropPut
  void description(
    java.lang.String rhs);


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
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlConnectionType type();


  /**
   * <p>
   * Getter method for the COM property "OLEDBConnection"
   * </p>
   */

  @DISPID(2697)
  @PropGet
  RTExcelObj.OLEDBConnection oledbConnection();


  /**
   * <p>
   * Getter method for the COM property "ODBCConnection"
   * </p>
   */

  @DISPID(2698)
  @PropGet
  RTExcelObj.ODBCConnection odbcConnection();


  /**
   * <p>
   * Getter method for the COM property "Ranges"
   * </p>
   */

  @DISPID(2699)
  @PropGet
  RTExcelObj.Ranges ranges();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   */

  @DISPID(1417)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "ModelConnection"
   * </p>
   */

  @DISPID(3100)
  @PropGet
  RTExcelObj.ModelConnection modelConnection();


  /**
   * <p>
   * Getter method for the COM property "WorksheetDataConnection"
   * </p>
   */

  @DISPID(3101)
  @PropGet
  RTExcelObj.WorksheetDataConnection worksheetDataConnection();


  /**
   * <p>
   * Getter method for the COM property "RefreshWithRefreshAll"
   * </p>
   */

  @DISPID(3102)
  @PropGet
  boolean refreshWithRefreshAll();


  /**
   * <p>
   * Setter method for the COM property "RefreshWithRefreshAll"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3102)
  @PropPut
  void refreshWithRefreshAll(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextConnection"
   * </p>
   */

  @DISPID(3103)
  @PropGet
  RTExcelObj.TextConnection textConnection();


  /**
   * <p>
   * Getter method for the COM property "DataFeedConnection"
   * </p>
   */

  @DISPID(3104)
  @PropGet
  RTExcelObj.DataFeedConnection dataFeedConnection();


  /**
   * <p>
   * Getter method for the COM property "InModel"
   * </p>
   */

  @DISPID(3105)
  @PropGet
  boolean inModel();


  /**
   * <p>
   * Getter method for the COM property "ModelTables"
   * </p>
   */

  @DISPID(3106)
  @PropGet
  RTExcelObj.ModelTables modelTables();


  // Properties:
}

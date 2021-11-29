package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface OLEDBConnection extends Com4jObject {
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
   * Getter method for the COM property "ADOConnection"
   * </p>
   */

  @DISPID(2074)
  @PropGet
  com4j.Com4jObject adoConnection();


  /**
   * <p>
   * Getter method for the COM property "BackgroundQuery"
   * </p>
   */

  @DISPID(1427)
  @PropGet
  boolean backgroundQuery();


  /**
   * <p>
   * Setter method for the COM property "BackgroundQuery"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1427)
  @PropPut
  void backgroundQuery(
    boolean rhs);


  /**
   */

  @DISPID(1589)
  void cancelRefresh();


  /**
   * <p>
   * Getter method for the COM property "CommandText"
   * </p>
   */

  @DISPID(1829)
  @PropGet
  java.lang.Object commandText();


  /**
   * <p>
   * Setter method for the COM property "CommandText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1829)
  @PropPut
  void commandText(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandType"
   * </p>
   */

  @DISPID(1830)
  @PropGet
  RTExcelObj.XlCmdType commandType();


  /**
   * <p>
   * Setter method for the COM property "CommandType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCmdType parameter.
   */

  @DISPID(1830)
  @PropPut
  void commandType(
    RTExcelObj.XlCmdType rhs);


  /**
   * <p>
   * Getter method for the COM property "Connection"
   * </p>
   */

  @DISPID(1432)
  @PropGet
  java.lang.Object connection();


  /**
   * <p>
   * Setter method for the COM property "Connection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1432)
  @PropPut
  void connection(
    java.lang.Object rhs);


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
   * Getter method for the COM property "LocalConnection"
   * </p>
   */

  @DISPID(1835)
  @PropGet
  java.lang.Object localConnection();


  /**
   * <p>
   * Setter method for the COM property "LocalConnection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1835)
  @PropPut
  void localConnection(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "MaintainConnection"
   * </p>
   */

  @DISPID(1832)
  @PropGet
  boolean maintainConnection();


  /**
   * <p>
   * Setter method for the COM property "MaintainConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1832)
  @PropPut
  void maintainConnection(
    boolean rhs);


  /**
   */

  @DISPID(2076)
  void makeConnection();


  /**
   */

  @DISPID(1417)
  void refresh();


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
   * Getter method for the COM property "Refreshing"
   * </p>
   */

  @DISPID(1587)
  @PropGet
  boolean refreshing();


  /**
   * <p>
   * Getter method for the COM property "RefreshOnFileOpen"
   * </p>
   */

  @DISPID(1479)
  @PropGet
  boolean refreshOnFileOpen();


  /**
   * <p>
   * Setter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1479)
  @PropPut
  void refreshOnFileOpen(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RefreshPeriod"
   * </p>
   */

  @DISPID(1833)
  @PropGet
  int refreshPeriod();


  /**
   * <p>
   * Setter method for the COM property "RefreshPeriod"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1833)
  @PropPut
  void refreshPeriod(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RobustConnect"
   * </p>
   */

  @DISPID(2081)
  @PropGet
  RTExcelObj.XlRobustConnect robustConnect();


  /**
   * <p>
   * Setter method for the COM property "RobustConnect"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlRobustConnect parameter.
   */

  @DISPID(2081)
  @PropPut
  void robustConnect(
    RTExcelObj.XlRobustConnect rhs);


  /**
   * @param odcFileName Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keywords Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(2082)
  void saveAsODC(
    java.lang.String odcFileName,
    @Optional java.lang.Object description,
    @Optional java.lang.Object keywords);


  /**
   * <p>
   * Getter method for the COM property "SavePassword"
   * </p>
   */

  @DISPID(1481)
  @PropGet
  boolean savePassword();


  /**
   * <p>
   * Setter method for the COM property "SavePassword"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1481)
  @PropPut
  void savePassword(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceConnectionFile"
   * </p>
   */

  @DISPID(2079)
  @PropGet
  java.lang.String sourceConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "SourceConnectionFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2079)
  @PropPut
  void sourceConnectionFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceDataFile"
   * </p>
   */

  @DISPID(2080)
  @PropGet
  java.lang.String sourceDataFile();


  /**
   * <p>
   * Setter method for the COM property "SourceDataFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2080)
  @PropPut
  void sourceDataFile(
    java.lang.String rhs);


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
   * Getter method for the COM property "UseLocalConnection"
   * </p>
   */

  @DISPID(1837)
  @PropGet
  boolean useLocalConnection();


  /**
   * <p>
   * Setter method for the COM property "UseLocalConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1837)
  @PropPut
  void useLocalConnection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MaxDrillthroughRecords"
   * </p>
   */

  @DISPID(2703)
  @PropGet
  int maxDrillthroughRecords();


  /**
   * <p>
   * Setter method for the COM property "MaxDrillthroughRecords"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2703)
  @PropPut
  void maxDrillthroughRecords(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "IsConnected"
   * </p>
   */

  @DISPID(2075)
  @PropGet
  boolean isConnected();


  /**
   * <p>
   * Getter method for the COM property "ServerCredentialsMethod"
   * </p>
   */

  @DISPID(2704)
  @PropGet
  RTExcelObj.XlCredentialsMethod serverCredentialsMethod();


  /**
   * <p>
   * Setter method for the COM property "ServerCredentialsMethod"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCredentialsMethod parameter.
   */

  @DISPID(2704)
  @PropPut
  void serverCredentialsMethod(
    RTExcelObj.XlCredentialsMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerSSOApplicationID"
   * </p>
   */

  @DISPID(2705)
  @PropGet
  java.lang.String serverSSOApplicationID();


  /**
   * <p>
   * Setter method for the COM property "ServerSSOApplicationID"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2705)
  @PropPut
  void serverSSOApplicationID(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   */

  @DISPID(2706)
  @PropGet
  boolean alwaysUseConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2706)
  @PropPut
  void alwaysUseConnectionFile(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerFillColor"
   * </p>
   */

  @DISPID(2707)
  @PropGet
  boolean serverFillColor();


  /**
   * <p>
   * Setter method for the COM property "ServerFillColor"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2707)
  @PropPut
  void serverFillColor(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerFontStyle"
   * </p>
   */

  @DISPID(2708)
  @PropGet
  boolean serverFontStyle();


  /**
   * <p>
   * Setter method for the COM property "ServerFontStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2708)
  @PropPut
  void serverFontStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerNumberFormat"
   * </p>
   */

  @DISPID(2709)
  @PropGet
  boolean serverNumberFormat();


  /**
   * <p>
   * Setter method for the COM property "ServerNumberFormat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2709)
  @PropPut
  void serverNumberFormat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerTextColor"
   * </p>
   */

  @DISPID(2710)
  @PropGet
  boolean serverTextColor();


  /**
   * <p>
   * Setter method for the COM property "ServerTextColor"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2710)
  @PropPut
  void serverTextColor(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RetrieveInOfficeUILang"
   * </p>
   */

  @DISPID(2711)
  @PropGet
  boolean retrieveInOfficeUILang();


  /**
   * <p>
   * Setter method for the COM property "RetrieveInOfficeUILang"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2711)
  @PropPut
  void retrieveInOfficeUILang(
    boolean rhs);


  /**
   */

  @DISPID(2939)
  void reconnect();


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
   * Getter method for the COM property "LocaleID"
   * </p>
   */

  @DISPID(2940)
  @PropGet
  int localeID();


  /**
   * <p>
   * Setter method for the COM property "LocaleID"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2940)
  @PropPut
  void localeID(
    int rhs);


  // Properties:
}

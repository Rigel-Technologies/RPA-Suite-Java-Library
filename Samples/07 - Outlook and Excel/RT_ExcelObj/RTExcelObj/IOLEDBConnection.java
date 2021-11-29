package RTExcelObj  ;

import com4j.*;

@IID("{0002448D-0001-0000-C000-000000000046}")
public interface IOLEDBConnection extends Com4jObject {
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
   * Getter method for the COM property "ADOConnection"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject adoConnection();


  /**
   * <p>
   * Getter method for the COM property "BackgroundQuery"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean backgroundQuery();


  /**
   * <p>
   * Setter method for the COM property "BackgroundQuery"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(12)
  void backgroundQuery(
    boolean rhs);


  /**
   */

  @VTID(13)
  void cancelRefresh();


  /**
   * <p>
   * Getter method for the COM property "CommandText"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object commandText();


  /**
   * <p>
   * Setter method for the COM property "CommandText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(15)
  void commandText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCmdType
   */

  @VTID(16)
  RTExcelObj.XlCmdType commandType();


  /**
   * <p>
   * Setter method for the COM property "CommandType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCmdType parameter.
   */

  @VTID(17)
  void commandType(
    RTExcelObj.XlCmdType rhs);


  /**
   * <p>
   * Getter method for the COM property "Connection"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object connection();


  /**
   * <p>
   * Setter method for the COM property "Connection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(19)
  void connection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean enableRefresh();


  /**
   * <p>
   * Setter method for the COM property "EnableRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void enableRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LocalConnection"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object localConnection();


  /**
   * <p>
   * Setter method for the COM property "LocalConnection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(23)
  void localConnection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "MaintainConnection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean maintainConnection();


  /**
   * <p>
   * Setter method for the COM property "MaintainConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void maintainConnection(
    boolean rhs);


  /**
   */

  @VTID(26)
  void makeConnection();


  /**
   */

  @VTID(27)
  void refresh();


  /**
   * <p>
   * Getter method for the COM property "RefreshDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @VTID(28)
  java.util.Date refreshDate();


  /**
   * <p>
   * Getter method for the COM property "Refreshing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean refreshing();


  /**
   * <p>
   * Getter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean refreshOnFileOpen();


  /**
   * <p>
   * Setter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void refreshOnFileOpen(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RefreshPeriod"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int refreshPeriod();


  /**
   * <p>
   * Setter method for the COM property "RefreshPeriod"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void refreshPeriod(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RobustConnect"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlRobustConnect
   */

  @VTID(34)
  RTExcelObj.XlRobustConnect robustConnect();


  /**
   * <p>
   * Setter method for the COM property "RobustConnect"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlRobustConnect parameter.
   */

  @VTID(35)
  void robustConnect(
    RTExcelObj.XlRobustConnect rhs);


  /**
   * @param odcFileName Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keywords Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(36)
  void saveAsODC(
    java.lang.String odcFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keywords);


  /**
   * <p>
   * Getter method for the COM property "SavePassword"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(37)
  boolean savePassword();


  /**
   * <p>
   * Setter method for the COM property "SavePassword"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(38)
  void savePassword(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceConnectionFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(39)
  java.lang.String sourceConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "SourceConnectionFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(40)
  void sourceConnectionFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceDataFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(41)
  java.lang.String sourceDataFile();


  /**
   * <p>
   * Setter method for the COM property "SourceDataFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(42)
  void sourceDataFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OLAP"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(43)
  boolean olap();


  /**
   * <p>
   * Getter method for the COM property "UseLocalConnection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(44)
  boolean useLocalConnection();


  /**
   * <p>
   * Setter method for the COM property "UseLocalConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(45)
  void useLocalConnection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MaxDrillthroughRecords"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(46)
  int maxDrillthroughRecords();


  /**
   * <p>
   * Setter method for the COM property "MaxDrillthroughRecords"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(47)
  void maxDrillthroughRecords(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "IsConnected"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean isConnected();


  /**
   * <p>
   * Getter method for the COM property "ServerCredentialsMethod"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCredentialsMethod
   */

  @VTID(49)
  RTExcelObj.XlCredentialsMethod serverCredentialsMethod();


  /**
   * <p>
   * Setter method for the COM property "ServerCredentialsMethod"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCredentialsMethod parameter.
   */

  @VTID(50)
  void serverCredentialsMethod(
    RTExcelObj.XlCredentialsMethod rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerSSOApplicationID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(51)
  java.lang.String serverSSOApplicationID();


  /**
   * <p>
   * Setter method for the COM property "ServerSSOApplicationID"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(52)
  void serverSSOApplicationID(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(53)
  boolean alwaysUseConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "AlwaysUseConnectionFile"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(54)
  void alwaysUseConnectionFile(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerFillColor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(55)
  boolean serverFillColor();


  /**
   * <p>
   * Setter method for the COM property "ServerFillColor"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(56)
  void serverFillColor(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerFontStyle"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(57)
  boolean serverFontStyle();


  /**
   * <p>
   * Setter method for the COM property "ServerFontStyle"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(58)
  void serverFontStyle(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerNumberFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(59)
  boolean serverNumberFormat();


  /**
   * <p>
   * Setter method for the COM property "ServerNumberFormat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(60)
  void serverNumberFormat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ServerTextColor"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(61)
  boolean serverTextColor();


  /**
   * <p>
   * Setter method for the COM property "ServerTextColor"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(62)
  void serverTextColor(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RetrieveInOfficeUILang"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(63)
  boolean retrieveInOfficeUILang();


  /**
   * <p>
   * Setter method for the COM property "RetrieveInOfficeUILang"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(64)
  void retrieveInOfficeUILang(
    boolean rhs);


  /**
   */

  @VTID(65)
  void reconnect();


  /**
   * <p>
   * Getter method for the COM property "CalculatedMembers"
   * </p>
   * @return  Returns a value of type RTExcelObj.CalculatedMembers
   */

  @VTID(66)
  RTExcelObj.CalculatedMembers calculatedMembers();


  /**
   * <p>
   * Getter method for the COM property "LocaleID"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(67)
  int localeID();


  /**
   * <p>
   * Setter method for the COM property "LocaleID"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(68)
  void localeID(
    int rhs);


  // Properties:
}

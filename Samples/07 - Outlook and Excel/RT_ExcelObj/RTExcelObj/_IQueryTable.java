package RTExcelObj  ;

import com4j.*;

@IID("{00024428-0001-0000-C000-000000000046}")
public interface _IQueryTable extends Com4jObject {
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
   * Getter method for the COM property "FieldNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean fieldNames();


  /**
   * <p>
   * Setter method for the COM property "FieldNames"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void fieldNames(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RowNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean rowNumbers();


  /**
   * <p>
   * Setter method for the COM property "RowNumbers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void rowNumbers(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FillAdjacentFormulas"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean fillAdjacentFormulas();


  /**
   * <p>
   * Setter method for the COM property "FillAdjacentFormulas"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void fillAdjacentFormulas(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HasAutoFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean hasAutoFormat();


  /**
   * <p>
   * Setter method for the COM property "HasAutoFormat"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void hasAutoFormat(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean refreshOnFileOpen();


  /**
   * <p>
   * Setter method for the COM property "RefreshOnFileOpen"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void refreshOnFileOpen(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Refreshing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean refreshing();


  /**
   * <p>
   * Getter method for the COM property "FetchedRowOverflow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean fetchedRowOverflow();


  /**
   * <p>
   * Getter method for the COM property "BackgroundQuery"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean backgroundQuery();


  /**
   * <p>
   * Setter method for the COM property "BackgroundQuery"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void backgroundQuery(
    boolean rhs);


  /**
   */

  @VTID(26)
  void cancelRefresh();


  /**
   * <p>
   * Getter method for the COM property "RefreshStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCellInsertionMode
   */

  @VTID(27)
  RTExcelObj.XlCellInsertionMode refreshStyle();


  /**
   * <p>
   * Setter method for the COM property "RefreshStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCellInsertionMode parameter.
   */

  @VTID(28)
  void refreshStyle(
    RTExcelObj.XlCellInsertionMode rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean enableRefresh();


  /**
   * <p>
   * Setter method for the COM property "EnableRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(30)
  void enableRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SavePassword"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean savePassword();


  /**
   * <p>
   * Setter method for the COM property "SavePassword"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void savePassword(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Destination"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(33)
  RTExcelObj.Range destination();


  /**
   * <p>
   * Getter method for the COM property "Connection"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(34)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object connection();


  /**
   * <p>
   * Setter method for the COM property "Connection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(35)
  void connection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Sql"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(36)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sql();


  /**
   * <p>
   * Setter method for the COM property "Sql"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(37)
  void sql(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PostText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(38)
  java.lang.String postText();


  /**
   * <p>
   * Setter method for the COM property "PostText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(39)
  void postText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ResultRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(40)
  RTExcelObj.Range resultRange();


  /**
   */

  @VTID(41)
  void delete();


  /**
   * @param backgroundQuery Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type boolean
   */

  @VTID(42)
  boolean refresh(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object backgroundQuery);


  /**
   * <p>
   * Getter method for the COM property "Parameters"
   * </p>
   * @return  Returns a value of type RTExcelObj.Parameters
   */

  @VTID(43)
  RTExcelObj.Parameters parameters();


  /**
   * <p>
   * Getter method for the COM property "Recordset"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject recordset();


  /**
   * <p>
   * Setter method for the COM property "Recordset"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @VTID(45)
  void recordset(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject rhs);


  /**
   * <p>
   * Getter method for the COM property "SaveData"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(46)
  boolean saveData();


  /**
   * <p>
   * Setter method for the COM property "SaveData"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(47)
  void saveData(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TablesOnlyFromHTML"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(48)
  boolean tablesOnlyFromHTML();


  /**
   * <p>
   * Setter method for the COM property "TablesOnlyFromHTML"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(49)
  void tablesOnlyFromHTML(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EnableEditing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(50)
  boolean enableEditing();


  /**
   * <p>
   * Setter method for the COM property "EnableEditing"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(51)
  void enableEditing(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFilePlatform"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(52)
  int textFilePlatform();


  /**
   * <p>
   * Setter method for the COM property "TextFilePlatform"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(53)
  void textFilePlatform(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileStartRow"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(54)
  int textFileStartRow();


  /**
   * <p>
   * Setter method for the COM property "TextFileStartRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(55)
  void textFileStartRow(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileParseType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTextParsingType
   */

  @VTID(56)
  RTExcelObj.XlTextParsingType textFileParseType();


  /**
   * <p>
   * Setter method for the COM property "TextFileParseType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextParsingType parameter.
   */

  @VTID(57)
  void textFileParseType(
    RTExcelObj.XlTextParsingType rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTextQualifier"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTextQualifier
   */

  @VTID(58)
  RTExcelObj.XlTextQualifier textFileTextQualifier();


  /**
   * <p>
   * Setter method for the COM property "TextFileTextQualifier"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextQualifier parameter.
   */

  @VTID(59)
  void textFileTextQualifier(
    RTExcelObj.XlTextQualifier rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileConsecutiveDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(60)
  boolean textFileConsecutiveDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileConsecutiveDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(61)
  void textFileConsecutiveDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTabDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(62)
  boolean textFileTabDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileTabDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(63)
  void textFileTabDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileSemicolonDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(64)
  boolean textFileSemicolonDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileSemicolonDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(65)
  void textFileSemicolonDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileCommaDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(66)
  boolean textFileCommaDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileCommaDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(67)
  void textFileCommaDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileSpaceDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(68)
  boolean textFileSpaceDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileSpaceDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(69)
  void textFileSpaceDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileOtherDelimiter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(70)
  java.lang.String textFileOtherDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileOtherDelimiter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(71)
  void textFileOtherDelimiter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileColumnDataTypes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(72)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textFileColumnDataTypes();


  /**
   * <p>
   * Setter method for the COM property "TextFileColumnDataTypes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(73)
  void textFileColumnDataTypes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileFixedColumnWidths"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(74)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textFileFixedColumnWidths();


  /**
   * <p>
   * Setter method for the COM property "TextFileFixedColumnWidths"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(75)
  void textFileFixedColumnWidths(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveColumnInfo"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(76)
  boolean preserveColumnInfo();


  /**
   * <p>
   * Setter method for the COM property "PreserveColumnInfo"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(77)
  void preserveColumnInfo(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "PreserveFormatting"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(78)
  boolean preserveFormatting();


  /**
   * <p>
   * Setter method for the COM property "PreserveFormatting"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(79)
  void preserveFormatting(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AdjustColumnWidth"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(80)
  boolean adjustColumnWidth();


  /**
   * <p>
   * Setter method for the COM property "AdjustColumnWidth"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(81)
  void adjustColumnWidth(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandText"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(82)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object commandText();


  /**
   * <p>
   * Setter method for the COM property "CommandText"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(83)
  void commandText(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "CommandType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCmdType
   */

  @VTID(84)
  RTExcelObj.XlCmdType commandType();


  /**
   * <p>
   * Setter method for the COM property "CommandType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlCmdType parameter.
   */

  @VTID(85)
  void commandType(
    RTExcelObj.XlCmdType rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFilePromptOnRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(86)
  boolean textFilePromptOnRefresh();


  /**
   * <p>
   * Setter method for the COM property "TextFilePromptOnRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(87)
  void textFilePromptOnRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "QueryType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlQueryType
   */

  @VTID(88)
  RTExcelObj.XlQueryType queryType();


  /**
   * <p>
   * Getter method for the COM property "MaintainConnection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(89)
  boolean maintainConnection();


  /**
   * <p>
   * Setter method for the COM property "MaintainConnection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(90)
  void maintainConnection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileDecimalSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(91)
  java.lang.String textFileDecimalSeparator();


  /**
   * <p>
   * Setter method for the COM property "TextFileDecimalSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(92)
  void textFileDecimalSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileThousandsSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(93)
  java.lang.String textFileThousandsSeparator();


  /**
   * <p>
   * Setter method for the COM property "TextFileThousandsSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(94)
  void textFileThousandsSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RefreshPeriod"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(95)
  int refreshPeriod();


  /**
   * <p>
   * Setter method for the COM property "RefreshPeriod"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(96)
  void refreshPeriod(
    int rhs);


  /**
   */

  @VTID(97)
  void resetTimer();


  /**
   * <p>
   * Getter method for the COM property "WebSelectionType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlWebSelectionType
   */

  @VTID(98)
  RTExcelObj.XlWebSelectionType webSelectionType();


  /**
   * <p>
   * Setter method for the COM property "WebSelectionType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlWebSelectionType parameter.
   */

  @VTID(99)
  void webSelectionType(
    RTExcelObj.XlWebSelectionType rhs);


  /**
   * <p>
   * Getter method for the COM property "WebFormatting"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlWebFormatting
   */

  @VTID(100)
  RTExcelObj.XlWebFormatting webFormatting();


  /**
   * <p>
   * Setter method for the COM property "WebFormatting"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlWebFormatting parameter.
   */

  @VTID(101)
  void webFormatting(
    RTExcelObj.XlWebFormatting rhs);


  /**
   * <p>
   * Getter method for the COM property "WebTables"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(102)
  java.lang.String webTables();


  /**
   * <p>
   * Setter method for the COM property "WebTables"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(103)
  void webTables(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "WebPreFormattedTextToColumns"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(104)
  boolean webPreFormattedTextToColumns();


  /**
   * <p>
   * Setter method for the COM property "WebPreFormattedTextToColumns"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(105)
  void webPreFormattedTextToColumns(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebSingleBlockTextImport"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(106)
  boolean webSingleBlockTextImport();


  /**
   * <p>
   * Setter method for the COM property "WebSingleBlockTextImport"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(107)
  void webSingleBlockTextImport(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebDisableDateRecognition"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(108)
  boolean webDisableDateRecognition();


  /**
   * <p>
   * Setter method for the COM property "WebDisableDateRecognition"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(109)
  void webDisableDateRecognition(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebConsecutiveDelimitersAsOne"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(110)
  boolean webConsecutiveDelimitersAsOne();


  /**
   * <p>
   * Setter method for the COM property "WebConsecutiveDelimitersAsOne"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(111)
  void webConsecutiveDelimitersAsOne(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebDisableRedirections"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(112)
  boolean webDisableRedirections();


  /**
   * <p>
   * Setter method for the COM property "WebDisableRedirections"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(113)
  void webDisableRedirections(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EditWebPage"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(114)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object editWebPage();


  /**
   * <p>
   * Setter method for the COM property "EditWebPage"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(115)
  void editWebPage(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceConnectionFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(116)
  java.lang.String sourceConnectionFile();


  /**
   * <p>
   * Setter method for the COM property "SourceConnectionFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(117)
  void sourceConnectionFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceDataFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(118)
  java.lang.String sourceDataFile();


  /**
   * <p>
   * Setter method for the COM property "SourceDataFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(119)
  void sourceDataFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RobustConnect"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlRobustConnect
   */

  @VTID(120)
  RTExcelObj.XlRobustConnect robustConnect();


  /**
   * <p>
   * Setter method for the COM property "RobustConnect"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlRobustConnect parameter.
   */

  @VTID(121)
  void robustConnect(
    RTExcelObj.XlRobustConnect rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTrailingMinusNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(122)
  boolean textFileTrailingMinusNumbers();


  /**
   * <p>
   * Setter method for the COM property "TextFileTrailingMinusNumbers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(123)
  void textFileTrailingMinusNumbers(
    boolean rhs);


  /**
   * @param odcFileName Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @param keywords Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(124)
  void saveAsODC(
    java.lang.String odcFileName,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object keywords);


  /**
   * <p>
   * Getter method for the COM property "ListObject"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListObject
   */

  @VTID(125)
  RTExcelObj.ListObject listObject();


  /**
   * <p>
   * Getter method for the COM property "TextFileVisualLayout"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTextVisualLayoutType
   */

  @VTID(126)
  RTExcelObj.XlTextVisualLayoutType textFileVisualLayout();


  /**
   * <p>
   * Setter method for the COM property "TextFileVisualLayout"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextVisualLayoutType parameter.
   */

  @VTID(127)
  void textFileVisualLayout(
    RTExcelObj.XlTextVisualLayoutType rhs);


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   * @return  Returns a value of type RTExcelObj.WorkbookConnection
   */

  @VTID(128)
  RTExcelObj.WorkbookConnection workbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   * @return  Returns a value of type RTExcelObj.Sort
   */

  @VTID(129)
  RTExcelObj.Sort sort();


  // Properties:
}

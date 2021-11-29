package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _QueryTable extends Com4jObject {
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
   * Getter method for the COM property "FieldNames"
   * </p>
   */

  @DISPID(1584)
  @PropGet
  boolean fieldNames();


  /**
   * <p>
   * Setter method for the COM property "FieldNames"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1584)
  @PropPut
  void fieldNames(
    boolean rhs);


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
   * Getter method for the COM property "FillAdjacentFormulas"
   * </p>
   */

  @DISPID(1586)
  @PropGet
  boolean fillAdjacentFormulas();


  /**
   * <p>
   * Setter method for the COM property "FillAdjacentFormulas"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1586)
  @PropPut
  void fillAdjacentFormulas(
    boolean rhs);


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
   * Getter method for the COM property "Refreshing"
   * </p>
   */

  @DISPID(1587)
  @PropGet
  boolean refreshing();


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
   * Getter method for the COM property "Destination"
   * </p>
   */

  @DISPID(681)
  @PropGet
  RTExcelObj.Range destination();


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
   * Getter method for the COM property "Sql"
   * </p>
   */

  @DISPID(1480)
  @PropGet
  java.lang.Object sql();


  /**
   * <p>
   * Setter method for the COM property "Sql"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1480)
  @PropPut
  void sql(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "PostText"
   * </p>
   */

  @DISPID(1591)
  @PropGet
  java.lang.String postText();


  /**
   * <p>
   * Setter method for the COM property "PostText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1591)
  @PropPut
  void postText(
    java.lang.String rhs);


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
   * @param backgroundQuery Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1417)
  boolean refresh(
    @Optional java.lang.Object backgroundQuery);


  /**
   * <p>
   * Getter method for the COM property "Parameters"
   * </p>
   */

  @DISPID(1593)
  @PropGet
  RTExcelObj.Parameters parameters();


  /**
   * <p>
   * Getter method for the COM property "Recordset"
   * </p>
   */

  @DISPID(1165)
  @PropGet
  com4j.Com4jObject recordset();


  /**
   * <p>
   * Setter method for the COM property "Recordset"
   * </p>
   * @param rhs Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1165)
  @PropPut
  void recordset(
    com4j.Com4jObject rhs);


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
   * Getter method for the COM property "TablesOnlyFromHTML"
   * </p>
   */

  @DISPID(1594)
  @PropGet
  boolean tablesOnlyFromHTML();


  /**
   * <p>
   * Setter method for the COM property "TablesOnlyFromHTML"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1594)
  @PropPut
  void tablesOnlyFromHTML(
    boolean rhs);


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
   * Getter method for the COM property "TextFilePlatform"
   * </p>
   */

  @DISPID(1855)
  @PropGet
  int textFilePlatform();


  /**
   * <p>
   * Setter method for the COM property "TextFilePlatform"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1855)
  @PropPut
  void textFilePlatform(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileStartRow"
   * </p>
   */

  @DISPID(1856)
  @PropGet
  int textFileStartRow();


  /**
   * <p>
   * Setter method for the COM property "TextFileStartRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(1856)
  @PropPut
  void textFileStartRow(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileParseType"
   * </p>
   */

  @DISPID(1857)
  @PropGet
  RTExcelObj.XlTextParsingType textFileParseType();


  /**
   * <p>
   * Setter method for the COM property "TextFileParseType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextParsingType parameter.
   */

  @DISPID(1857)
  @PropPut
  void textFileParseType(
    RTExcelObj.XlTextParsingType rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTextQualifier"
   * </p>
   */

  @DISPID(1858)
  @PropGet
  RTExcelObj.XlTextQualifier textFileTextQualifier();


  /**
   * <p>
   * Setter method for the COM property "TextFileTextQualifier"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextQualifier parameter.
   */

  @DISPID(1858)
  @PropPut
  void textFileTextQualifier(
    RTExcelObj.XlTextQualifier rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileConsecutiveDelimiter"
   * </p>
   */

  @DISPID(1859)
  @PropGet
  boolean textFileConsecutiveDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileConsecutiveDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1859)
  @PropPut
  void textFileConsecutiveDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTabDelimiter"
   * </p>
   */

  @DISPID(1860)
  @PropGet
  boolean textFileTabDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileTabDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1860)
  @PropPut
  void textFileTabDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileSemicolonDelimiter"
   * </p>
   */

  @DISPID(1861)
  @PropGet
  boolean textFileSemicolonDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileSemicolonDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1861)
  @PropPut
  void textFileSemicolonDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileCommaDelimiter"
   * </p>
   */

  @DISPID(1862)
  @PropGet
  boolean textFileCommaDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileCommaDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1862)
  @PropPut
  void textFileCommaDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileSpaceDelimiter"
   * </p>
   */

  @DISPID(1863)
  @PropGet
  boolean textFileSpaceDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileSpaceDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1863)
  @PropPut
  void textFileSpaceDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileOtherDelimiter"
   * </p>
   */

  @DISPID(1864)
  @PropGet
  java.lang.String textFileOtherDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileOtherDelimiter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1864)
  @PropPut
  void textFileOtherDelimiter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileColumnDataTypes"
   * </p>
   */

  @DISPID(1865)
  @PropGet
  java.lang.Object textFileColumnDataTypes();


  /**
   * <p>
   * Setter method for the COM property "TextFileColumnDataTypes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1865)
  @PropPut
  void textFileColumnDataTypes(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileFixedColumnWidths"
   * </p>
   */

  @DISPID(1866)
  @PropGet
  java.lang.Object textFileFixedColumnWidths();


  /**
   * <p>
   * Setter method for the COM property "TextFileFixedColumnWidths"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1866)
  @PropPut
  void textFileFixedColumnWidths(
    java.lang.Object rhs);


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
   * Getter method for the COM property "TextFilePromptOnRefresh"
   * </p>
   */

  @DISPID(1869)
  @PropGet
  boolean textFilePromptOnRefresh();


  /**
   * <p>
   * Setter method for the COM property "TextFilePromptOnRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1869)
  @PropPut
  void textFilePromptOnRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "QueryType"
   * </p>
   */

  @DISPID(1831)
  @PropGet
  RTExcelObj.XlQueryType queryType();


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
   * <p>
   * Getter method for the COM property "TextFileDecimalSeparator"
   * </p>
   */

  @DISPID(1870)
  @PropGet
  java.lang.String textFileDecimalSeparator();


  /**
   * <p>
   * Setter method for the COM property "TextFileDecimalSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1870)
  @PropPut
  void textFileDecimalSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileThousandsSeparator"
   * </p>
   */

  @DISPID(1871)
  @PropGet
  java.lang.String textFileThousandsSeparator();


  /**
   * <p>
   * Setter method for the COM property "TextFileThousandsSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1871)
  @PropPut
  void textFileThousandsSeparator(
    java.lang.String rhs);


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
   */

  @DISPID(1834)
  void resetTimer();


  /**
   * <p>
   * Getter method for the COM property "WebSelectionType"
   * </p>
   */

  @DISPID(1872)
  @PropGet
  RTExcelObj.XlWebSelectionType webSelectionType();


  /**
   * <p>
   * Setter method for the COM property "WebSelectionType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlWebSelectionType parameter.
   */

  @DISPID(1872)
  @PropPut
  void webSelectionType(
    RTExcelObj.XlWebSelectionType rhs);


  /**
   * <p>
   * Getter method for the COM property "WebFormatting"
   * </p>
   */

  @DISPID(1873)
  @PropGet
  RTExcelObj.XlWebFormatting webFormatting();


  /**
   * <p>
   * Setter method for the COM property "WebFormatting"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlWebFormatting parameter.
   */

  @DISPID(1873)
  @PropPut
  void webFormatting(
    RTExcelObj.XlWebFormatting rhs);


  /**
   * <p>
   * Getter method for the COM property "WebTables"
   * </p>
   */

  @DISPID(1874)
  @PropGet
  java.lang.String webTables();


  /**
   * <p>
   * Setter method for the COM property "WebTables"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1874)
  @PropPut
  void webTables(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "WebPreFormattedTextToColumns"
   * </p>
   */

  @DISPID(1875)
  @PropGet
  boolean webPreFormattedTextToColumns();


  /**
   * <p>
   * Setter method for the COM property "WebPreFormattedTextToColumns"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1875)
  @PropPut
  void webPreFormattedTextToColumns(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebSingleBlockTextImport"
   * </p>
   */

  @DISPID(1876)
  @PropGet
  boolean webSingleBlockTextImport();


  /**
   * <p>
   * Setter method for the COM property "WebSingleBlockTextImport"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1876)
  @PropPut
  void webSingleBlockTextImport(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebDisableDateRecognition"
   * </p>
   */

  @DISPID(1877)
  @PropGet
  boolean webDisableDateRecognition();


  /**
   * <p>
   * Setter method for the COM property "WebDisableDateRecognition"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1877)
  @PropPut
  void webDisableDateRecognition(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebConsecutiveDelimitersAsOne"
   * </p>
   */

  @DISPID(1878)
  @PropGet
  boolean webConsecutiveDelimitersAsOne();


  /**
   * <p>
   * Setter method for the COM property "WebConsecutiveDelimitersAsOne"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1878)
  @PropPut
  void webConsecutiveDelimitersAsOne(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "WebDisableRedirections"
   * </p>
   */

  @DISPID(2162)
  @PropGet
  boolean webDisableRedirections();


  /**
   * <p>
   * Setter method for the COM property "WebDisableRedirections"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2162)
  @PropPut
  void webDisableRedirections(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EditWebPage"
   * </p>
   */

  @DISPID(2163)
  @PropGet
  java.lang.Object editWebPage();


  /**
   * <p>
   * Setter method for the COM property "EditWebPage"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2163)
  @PropPut
  void editWebPage(
    java.lang.Object rhs);


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
   * <p>
   * Getter method for the COM property "TextFileTrailingMinusNumbers"
   * </p>
   */

  @DISPID(2164)
  @PropGet
  boolean textFileTrailingMinusNumbers();


  /**
   * <p>
   * Setter method for the COM property "TextFileTrailingMinusNumbers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2164)
  @PropPut
  void textFileTrailingMinusNumbers(
    boolean rhs);


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
   * Getter method for the COM property "ListObject"
   * </p>
   */

  @DISPID(2257)
  @PropGet
  RTExcelObj.ListObject listObject();


  /**
   * <p>
   * Getter method for the COM property "TextFileVisualLayout"
   * </p>
   */

  @DISPID(2245)
  @PropGet
  RTExcelObj.XlTextVisualLayoutType textFileVisualLayout();


  /**
   * <p>
   * Setter method for the COM property "TextFileVisualLayout"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextVisualLayoutType parameter.
   */

  @DISPID(2245)
  @PropPut
  void textFileVisualLayout(
    RTExcelObj.XlTextVisualLayoutType rhs);


  /**
   * <p>
   * Getter method for the COM property "WorkbookConnection"
   * </p>
   */

  @DISPID(2544)
  @PropGet
  RTExcelObj.WorkbookConnection workbookConnection();


  /**
   * <p>
   * Getter method for the COM property "Sort"
   * </p>
   */

  @DISPID(880)
  @PropGet
  RTExcelObj.Sort sort();


  // Properties:
}

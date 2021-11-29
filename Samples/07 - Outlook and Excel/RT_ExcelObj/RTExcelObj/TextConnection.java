package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface TextConnection extends Com4jObject {
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
   * Getter method for the COM property "TextFileHeaderRow"
   * </p>
   */

  @DISPID(3118)
  @PropGet
  boolean textFileHeaderRow();


  /**
   * <p>
   * Setter method for the COM property "TextFileHeaderRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3118)
  @PropPut
  void textFileHeaderRow(
    boolean rhs);


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
   * Getter method for the COM property "TextFilePlatform"
   * </p>
   */

  @DISPID(1855)
  @PropGet
  RTExcelObj.XlPlatform textFilePlatform();


  /**
   * <p>
   * Setter method for the COM property "TextFilePlatform"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPlatform parameter.
   */

  @DISPID(1855)
  @PropPut
  void textFilePlatform(
    RTExcelObj.XlPlatform rhs);


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


  // Properties:
}

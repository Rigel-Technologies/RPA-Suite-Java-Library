package RTExcelObj  ;

import com4j.*;

@IID("{000244D3-0001-0000-C000-000000000046}")
public interface ITextConnection extends Com4jObject {
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
   * Getter method for the COM property "Connection"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object connection();


  /**
   * <p>
   * Setter method for the COM property "Connection"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(11)
  void connection(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileHeaderRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean textFileHeaderRow();


  /**
   * <p>
   * Setter method for the COM property "TextFileHeaderRow"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(13)
  void textFileHeaderRow(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileColumnDataTypes"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textFileColumnDataTypes();


  /**
   * <p>
   * Setter method for the COM property "TextFileColumnDataTypes"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(15)
  void textFileColumnDataTypes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileCommaDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean textFileCommaDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileCommaDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void textFileCommaDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileConsecutiveDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean textFileConsecutiveDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileConsecutiveDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void textFileConsecutiveDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileDecimalSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(20)
  java.lang.String textFileDecimalSeparator();


  /**
   * <p>
   * Setter method for the COM property "TextFileDecimalSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(21)
  void textFileDecimalSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileFixedColumnWidths"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(22)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object textFileFixedColumnWidths();


  /**
   * <p>
   * Setter method for the COM property "TextFileFixedColumnWidths"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(23)
  void textFileFixedColumnWidths(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileOtherDelimiter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String textFileOtherDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileOtherDelimiter"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void textFileOtherDelimiter(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileParseType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTextParsingType
   */

  @VTID(26)
  RTExcelObj.XlTextParsingType textFileParseType();


  /**
   * <p>
   * Setter method for the COM property "TextFileParseType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextParsingType parameter.
   */

  @VTID(27)
  void textFileParseType(
    RTExcelObj.XlTextParsingType rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFilePlatform"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPlatform
   */

  @VTID(28)
  RTExcelObj.XlPlatform textFilePlatform();


  /**
   * <p>
   * Setter method for the COM property "TextFilePlatform"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPlatform parameter.
   */

  @VTID(29)
  void textFilePlatform(
    RTExcelObj.XlPlatform rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFilePromptOnRefresh"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean textFilePromptOnRefresh();


  /**
   * <p>
   * Setter method for the COM property "TextFilePromptOnRefresh"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void textFilePromptOnRefresh(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileSemicolonDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean textFileSemicolonDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileSemicolonDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(33)
  void textFileSemicolonDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileSpaceDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean textFileSpaceDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileSpaceDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(35)
  void textFileSpaceDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileStartRow"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(36)
  int textFileStartRow();


  /**
   * <p>
   * Setter method for the COM property "TextFileStartRow"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(37)
  void textFileStartRow(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTabDelimiter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(38)
  boolean textFileTabDelimiter();


  /**
   * <p>
   * Setter method for the COM property "TextFileTabDelimiter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(39)
  void textFileTabDelimiter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTextQualifier"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTextQualifier
   */

  @VTID(40)
  RTExcelObj.XlTextQualifier textFileTextQualifier();


  /**
   * <p>
   * Setter method for the COM property "TextFileTextQualifier"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextQualifier parameter.
   */

  @VTID(41)
  void textFileTextQualifier(
    RTExcelObj.XlTextQualifier rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileThousandsSeparator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(42)
  java.lang.String textFileThousandsSeparator();


  /**
   * <p>
   * Setter method for the COM property "TextFileThousandsSeparator"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(43)
  void textFileThousandsSeparator(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileTrailingMinusNumbers"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(44)
  boolean textFileTrailingMinusNumbers();


  /**
   * <p>
   * Setter method for the COM property "TextFileTrailingMinusNumbers"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(45)
  void textFileTrailingMinusNumbers(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFileVisualLayout"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTextVisualLayoutType
   */

  @VTID(46)
  RTExcelObj.XlTextVisualLayoutType textFileVisualLayout();


  /**
   * <p>
   * Setter method for the COM property "TextFileVisualLayout"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTextVisualLayoutType parameter.
   */

  @VTID(47)
  void textFileVisualLayout(
    RTExcelObj.XlTextVisualLayoutType rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{0002445B-0001-0000-C000-000000000046}")
public interface IErrorCheckingOptions extends Com4jObject {
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
   * Getter method for the COM property "BackgroundChecking"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean backgroundChecking();


  /**
   * <p>
   * Setter method for the COM property "BackgroundChecking"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void backgroundChecking(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IndicatorColorIndex"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlColorIndex
   */

  @VTID(12)
  RTExcelObj.XlColorIndex indicatorColorIndex();


  /**
   * <p>
   * Setter method for the COM property "IndicatorColorIndex"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlColorIndex parameter.
   */

  @VTID(13)
  void indicatorColorIndex(
    RTExcelObj.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "EvaluateToError"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean evaluateToError();


  /**
   * <p>
   * Setter method for the COM property "EvaluateToError"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(15)
  void evaluateToError(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextDate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean textDate();


  /**
   * <p>
   * Setter method for the COM property "TextDate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void textDate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberAsText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean numberAsText();


  /**
   * <p>
   * Setter method for the COM property "NumberAsText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void numberAsText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "InconsistentFormula"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean inconsistentFormula();


  /**
   * <p>
   * Setter method for the COM property "InconsistentFormula"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void inconsistentFormula(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "OmittedCells"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean omittedCells();


  /**
   * <p>
   * Setter method for the COM property "OmittedCells"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void omittedCells(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UnlockedFormulaCells"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean unlockedFormulaCells();


  /**
   * <p>
   * Setter method for the COM property "UnlockedFormulaCells"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void unlockedFormulaCells(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EmptyCellReferences"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean emptyCellReferences();


  /**
   * <p>
   * Setter method for the COM property "EmptyCellReferences"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void emptyCellReferences(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ListDataValidation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean listDataValidation();


  /**
   * <p>
   * Setter method for the COM property "ListDataValidation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void listDataValidation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "InconsistentTableFormula"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean inconsistentTableFormula();


  /**
   * <p>
   * Setter method for the COM property "InconsistentTableFormula"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void inconsistentTableFormula(
    boolean rhs);


  // Properties:
}

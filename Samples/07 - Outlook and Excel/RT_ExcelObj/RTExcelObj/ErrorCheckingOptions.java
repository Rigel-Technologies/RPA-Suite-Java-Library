package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ErrorCheckingOptions extends Com4jObject {
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
   * Getter method for the COM property "BackgroundChecking"
   * </p>
   */

  @DISPID(2201)
  @PropGet
  boolean backgroundChecking();


  /**
   * <p>
   * Setter method for the COM property "BackgroundChecking"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2201)
  @PropPut
  void backgroundChecking(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IndicatorColorIndex"
   * </p>
   */

  @DISPID(2202)
  @PropGet
  RTExcelObj.XlColorIndex indicatorColorIndex();


  /**
   * <p>
   * Setter method for the COM property "IndicatorColorIndex"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlColorIndex parameter.
   */

  @DISPID(2202)
  @PropPut
  void indicatorColorIndex(
    RTExcelObj.XlColorIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "EvaluateToError"
   * </p>
   */

  @DISPID(2203)
  @PropGet
  boolean evaluateToError();


  /**
   * <p>
   * Setter method for the COM property "EvaluateToError"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2203)
  @PropPut
  void evaluateToError(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextDate"
   * </p>
   */

  @DISPID(2204)
  @PropGet
  boolean textDate();


  /**
   * <p>
   * Setter method for the COM property "TextDate"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2204)
  @PropPut
  void textDate(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberAsText"
   * </p>
   */

  @DISPID(2205)
  @PropGet
  boolean numberAsText();


  /**
   * <p>
   * Setter method for the COM property "NumberAsText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2205)
  @PropPut
  void numberAsText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "InconsistentFormula"
   * </p>
   */

  @DISPID(2206)
  @PropGet
  boolean inconsistentFormula();


  /**
   * <p>
   * Setter method for the COM property "InconsistentFormula"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2206)
  @PropPut
  void inconsistentFormula(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "OmittedCells"
   * </p>
   */

  @DISPID(2207)
  @PropGet
  boolean omittedCells();


  /**
   * <p>
   * Setter method for the COM property "OmittedCells"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2207)
  @PropPut
  void omittedCells(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "UnlockedFormulaCells"
   * </p>
   */

  @DISPID(2208)
  @PropGet
  boolean unlockedFormulaCells();


  /**
   * <p>
   * Setter method for the COM property "UnlockedFormulaCells"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2208)
  @PropPut
  void unlockedFormulaCells(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "EmptyCellReferences"
   * </p>
   */

  @DISPID(2209)
  @PropGet
  boolean emptyCellReferences();


  /**
   * <p>
   * Setter method for the COM property "EmptyCellReferences"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2209)
  @PropPut
  void emptyCellReferences(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ListDataValidation"
   * </p>
   */

  @DISPID(2296)
  @PropGet
  boolean listDataValidation();


  /**
   * <p>
   * Setter method for the COM property "ListDataValidation"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2296)
  @PropPut
  void listDataValidation(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "InconsistentTableFormula"
   * </p>
   */

  @DISPID(2675)
  @PropGet
  boolean inconsistentTableFormula();


  /**
   * <p>
   * Setter method for the COM property "InconsistentTableFormula"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2675)
  @PropPut
  void inconsistentTableFormula(
    boolean rhs);


  // Properties:
}

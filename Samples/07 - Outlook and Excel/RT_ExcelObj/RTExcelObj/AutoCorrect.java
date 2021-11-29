package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface AutoCorrect extends Com4jObject {
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
   * @param what Mandatory java.lang.String parameter.
   * @param replacement Mandatory java.lang.String parameter.
   */

  @DISPID(1146)
  java.lang.Object addReplacement(
    java.lang.String what,
    java.lang.String replacement);


  /**
   * <p>
   * Getter method for the COM property "CapitalizeNamesOfDays"
   * </p>
   */

  @DISPID(1150)
  @PropGet
  boolean capitalizeNamesOfDays();


  /**
   * <p>
   * Setter method for the COM property "CapitalizeNamesOfDays"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1150)
  @PropPut
  void capitalizeNamesOfDays(
    boolean rhs);


  /**
   * @param what Mandatory java.lang.String parameter.
   */

  @DISPID(1147)
  java.lang.Object deleteReplacement(
    java.lang.String what);


  /**
   * <p>
   * Getter method for the COM property "ReplacementList"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(1151)
  @PropGet
  java.lang.Object replacementList(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "ReplacementList"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(1151)
  @PropPut
  void replacementList(
    @Optional java.lang.Object index,
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ReplaceText"
   * </p>
   */

  @DISPID(1148)
  @PropGet
  boolean replaceText();


  /**
   * <p>
   * Setter method for the COM property "ReplaceText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1148)
  @PropPut
  void replaceText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TwoInitialCapitals"
   * </p>
   */

  @DISPID(1149)
  @PropGet
  boolean twoInitialCapitals();


  /**
   * <p>
   * Setter method for the COM property "TwoInitialCapitals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1149)
  @PropPut
  void twoInitialCapitals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CorrectSentenceCap"
   * </p>
   */

  @DISPID(1619)
  @PropGet
  boolean correctSentenceCap();


  /**
   * <p>
   * Setter method for the COM property "CorrectSentenceCap"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1619)
  @PropPut
  void correctSentenceCap(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CorrectCapsLock"
   * </p>
   */

  @DISPID(1620)
  @PropGet
  boolean correctCapsLock();


  /**
   * <p>
   * Setter method for the COM property "CorrectCapsLock"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1620)
  @PropPut
  void correctCapsLock(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   */

  @DISPID(1926)
  @PropGet
  boolean displayAutoCorrectOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1926)
  @PropPut
  void displayAutoCorrectOptions(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoExpandListRange"
   * </p>
   */

  @DISPID(2294)
  @PropGet
  boolean autoExpandListRange();


  /**
   * <p>
   * Setter method for the COM property "AutoExpandListRange"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2294)
  @PropPut
  void autoExpandListRange(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFillFormulasInLists"
   * </p>
   */

  @DISPID(2642)
  @PropGet
  boolean autoFillFormulasInLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFillFormulasInLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2642)
  @PropPut
  void autoFillFormulasInLists(
    boolean rhs);


  // Properties:
}

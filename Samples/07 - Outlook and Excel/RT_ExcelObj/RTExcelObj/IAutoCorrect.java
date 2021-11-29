package RTExcelObj  ;

import com4j.*;

@IID("{000208D4-0001-0000-C000-000000000046}")
public interface IAutoCorrect extends Com4jObject {
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
   * @param what Mandatory java.lang.String parameter.
   * @param replacement Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object addReplacement(
    java.lang.String what,
    java.lang.String replacement);


  /**
   * <p>
   * Getter method for the COM property "CapitalizeNamesOfDays"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean capitalizeNamesOfDays();


  /**
   * <p>
   * Setter method for the COM property "CapitalizeNamesOfDays"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(12)
  void capitalizeNamesOfDays(
    boolean rhs);


  /**
   * @param what Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object deleteReplacement(
    java.lang.String what);


  /**
   * <p>
   * Getter method for the COM property "ReplacementList"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object replacementList(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Setter method for the COM property "ReplacementList"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(15)
  void replacementList(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ReplaceText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean replaceText();


  /**
   * <p>
   * Setter method for the COM property "ReplaceText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void replaceText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TwoInitialCapitals"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean twoInitialCapitals();


  /**
   * <p>
   * Setter method for the COM property "TwoInitialCapitals"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(19)
  void twoInitialCapitals(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CorrectSentenceCap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean correctSentenceCap();


  /**
   * <p>
   * Setter method for the COM property "CorrectSentenceCap"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void correctSentenceCap(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CorrectCapsLock"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean correctCapsLock();


  /**
   * <p>
   * Setter method for the COM property "CorrectCapsLock"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void correctCapsLock(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean displayAutoCorrectOptions();


  /**
   * <p>
   * Setter method for the COM property "DisplayAutoCorrectOptions"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void displayAutoCorrectOptions(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoExpandListRange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean autoExpandListRange();


  /**
   * <p>
   * Setter method for the COM property "AutoExpandListRange"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void autoExpandListRange(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFillFormulasInLists"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean autoFillFormulasInLists();


  /**
   * <p>
   * Setter method for the COM property "AutoFillFormulasInLists"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void autoFillFormulasInLists(
    boolean rhs);


  // Properties:
}

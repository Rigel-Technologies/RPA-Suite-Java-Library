package RTExcelObj  ;

import com4j.*;

@IID("{00024465-0001-0000-C000-000000000046}")
public interface ISpellingOptions extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DictLang"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(7)
  int dictLang();


  /**
   * <p>
   * Setter method for the COM property "DictLang"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(8)
  void dictLang(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "UserDict"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(9)
  java.lang.String userDict();


  /**
   * <p>
   * Setter method for the COM property "UserDict"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(10)
  void userDict(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IgnoreCaps"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean ignoreCaps();


  /**
   * <p>
   * Setter method for the COM property "IgnoreCaps"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(12)
  void ignoreCaps(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SuggestMainOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(13)
  boolean suggestMainOnly();


  /**
   * <p>
   * Setter method for the COM property "SuggestMainOnly"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(14)
  void suggestMainOnly(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IgnoreMixedDigits"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean ignoreMixedDigits();


  /**
   * <p>
   * Setter method for the COM property "IgnoreMixedDigits"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void ignoreMixedDigits(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IgnoreFileNames"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean ignoreFileNames();


  /**
   * <p>
   * Setter method for the COM property "IgnoreFileNames"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void ignoreFileNames(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GermanPostReform"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean germanPostReform();


  /**
   * <p>
   * Setter method for the COM property "GermanPostReform"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(20)
  void germanPostReform(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "KoreanCombineAux"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean koreanCombineAux();


  /**
   * <p>
   * Setter method for the COM property "KoreanCombineAux"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void koreanCombineAux(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "KoreanUseAutoChangeList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(23)
  boolean koreanUseAutoChangeList();


  /**
   * <p>
   * Setter method for the COM property "KoreanUseAutoChangeList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(24)
  void koreanUseAutoChangeList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "KoreanProcessCompound"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(25)
  boolean koreanProcessCompound();


  /**
   * <p>
   * Setter method for the COM property "KoreanProcessCompound"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(26)
  void koreanProcessCompound(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HebrewModes"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlHebrewModes
   */

  @VTID(27)
  RTExcelObj.XlHebrewModes hebrewModes();


  /**
   * <p>
   * Setter method for the COM property "HebrewModes"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlHebrewModes parameter.
   */

  @VTID(28)
  void hebrewModes(
    RTExcelObj.XlHebrewModes rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicModes"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlArabicModes
   */

  @VTID(29)
  RTExcelObj.XlArabicModes arabicModes();


  /**
   * <p>
   * Setter method for the COM property "ArabicModes"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlArabicModes parameter.
   */

  @VTID(30)
  void arabicModes(
    RTExcelObj.XlArabicModes rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicStrictAlefHamza"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean arabicStrictAlefHamza();


  /**
   * <p>
   * Setter method for the COM property "ArabicStrictAlefHamza"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void arabicStrictAlefHamza(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicStrictFinalYaa"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(33)
  boolean arabicStrictFinalYaa();


  /**
   * <p>
   * Setter method for the COM property "ArabicStrictFinalYaa"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(34)
  void arabicStrictFinalYaa(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicStrictTaaMarboota"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(35)
  boolean arabicStrictTaaMarboota();


  /**
   * <p>
   * Setter method for the COM property "ArabicStrictTaaMarboota"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(36)
  void arabicStrictTaaMarboota(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RussianStrictE"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(37)
  boolean russianStrictE();


  /**
   * <p>
   * Setter method for the COM property "RussianStrictE"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(38)
  void russianStrictE(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SpanishModes"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSpanishModes
   */

  @VTID(39)
  RTExcelObj.XlSpanishModes spanishModes();


  /**
   * <p>
   * Setter method for the COM property "SpanishModes"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSpanishModes parameter.
   */

  @VTID(40)
  void spanishModes(
    RTExcelObj.XlSpanishModes rhs);


  /**
   * <p>
   * Getter method for the COM property "PortugalReform"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPortugueseReform
   */

  @VTID(41)
  RTExcelObj.XlPortugueseReform portugalReform();


  /**
   * <p>
   * Setter method for the COM property "PortugalReform"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPortugueseReform parameter.
   */

  @VTID(42)
  void portugalReform(
    RTExcelObj.XlPortugueseReform rhs);


  /**
   * <p>
   * Getter method for the COM property "BrazilReform"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPortugueseReform
   */

  @VTID(43)
  RTExcelObj.XlPortugueseReform brazilReform();


  /**
   * <p>
   * Setter method for the COM property "BrazilReform"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPortugueseReform parameter.
   */

  @VTID(44)
  void brazilReform(
    RTExcelObj.XlPortugueseReform rhs);


  // Properties:
}

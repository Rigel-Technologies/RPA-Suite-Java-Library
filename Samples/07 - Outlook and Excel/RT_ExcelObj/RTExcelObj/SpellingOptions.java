package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SpellingOptions extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "DictLang"
   * </p>
   */

  @DISPID(2220)
  @PropGet
  int dictLang();


  /**
   * <p>
   * Setter method for the COM property "DictLang"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2220)
  @PropPut
  void dictLang(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "UserDict"
   * </p>
   */

  @DISPID(2221)
  @PropGet
  java.lang.String userDict();


  /**
   * <p>
   * Setter method for the COM property "UserDict"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2221)
  @PropPut
  void userDict(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "IgnoreCaps"
   * </p>
   */

  @DISPID(2222)
  @PropGet
  boolean ignoreCaps();


  /**
   * <p>
   * Setter method for the COM property "IgnoreCaps"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2222)
  @PropPut
  void ignoreCaps(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SuggestMainOnly"
   * </p>
   */

  @DISPID(2223)
  @PropGet
  boolean suggestMainOnly();


  /**
   * <p>
   * Setter method for the COM property "SuggestMainOnly"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2223)
  @PropPut
  void suggestMainOnly(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IgnoreMixedDigits"
   * </p>
   */

  @DISPID(2224)
  @PropGet
  boolean ignoreMixedDigits();


  /**
   * <p>
   * Setter method for the COM property "IgnoreMixedDigits"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2224)
  @PropPut
  void ignoreMixedDigits(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IgnoreFileNames"
   * </p>
   */

  @DISPID(2225)
  @PropGet
  boolean ignoreFileNames();


  /**
   * <p>
   * Setter method for the COM property "IgnoreFileNames"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2225)
  @PropPut
  void ignoreFileNames(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "GermanPostReform"
   * </p>
   */

  @DISPID(2226)
  @PropGet
  boolean germanPostReform();


  /**
   * <p>
   * Setter method for the COM property "GermanPostReform"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2226)
  @PropPut
  void germanPostReform(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "KoreanCombineAux"
   * </p>
   */

  @DISPID(2227)
  @PropGet
  boolean koreanCombineAux();


  /**
   * <p>
   * Setter method for the COM property "KoreanCombineAux"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2227)
  @PropPut
  void koreanCombineAux(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "KoreanUseAutoChangeList"
   * </p>
   */

  @DISPID(2228)
  @PropGet
  boolean koreanUseAutoChangeList();


  /**
   * <p>
   * Setter method for the COM property "KoreanUseAutoChangeList"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2228)
  @PropPut
  void koreanUseAutoChangeList(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "KoreanProcessCompound"
   * </p>
   */

  @DISPID(2229)
  @PropGet
  boolean koreanProcessCompound();


  /**
   * <p>
   * Setter method for the COM property "KoreanProcessCompound"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2229)
  @PropPut
  void koreanProcessCompound(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HebrewModes"
   * </p>
   */

  @DISPID(2230)
  @PropGet
  RTExcelObj.XlHebrewModes hebrewModes();


  /**
   * <p>
   * Setter method for the COM property "HebrewModes"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlHebrewModes parameter.
   */

  @DISPID(2230)
  @PropPut
  void hebrewModes(
    RTExcelObj.XlHebrewModes rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicModes"
   * </p>
   */

  @DISPID(2231)
  @PropGet
  RTExcelObj.XlArabicModes arabicModes();


  /**
   * <p>
   * Setter method for the COM property "ArabicModes"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlArabicModes parameter.
   */

  @DISPID(2231)
  @PropPut
  void arabicModes(
    RTExcelObj.XlArabicModes rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicStrictAlefHamza"
   * </p>
   */

  @DISPID(2932)
  @PropGet
  boolean arabicStrictAlefHamza();


  /**
   * <p>
   * Setter method for the COM property "ArabicStrictAlefHamza"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2932)
  @PropPut
  void arabicStrictAlefHamza(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicStrictFinalYaa"
   * </p>
   */

  @DISPID(2933)
  @PropGet
  boolean arabicStrictFinalYaa();


  /**
   * <p>
   * Setter method for the COM property "ArabicStrictFinalYaa"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2933)
  @PropPut
  void arabicStrictFinalYaa(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ArabicStrictTaaMarboota"
   * </p>
   */

  @DISPID(2934)
  @PropGet
  boolean arabicStrictTaaMarboota();


  /**
   * <p>
   * Setter method for the COM property "ArabicStrictTaaMarboota"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2934)
  @PropPut
  void arabicStrictTaaMarboota(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "RussianStrictE"
   * </p>
   */

  @DISPID(2935)
  @PropGet
  boolean russianStrictE();


  /**
   * <p>
   * Setter method for the COM property "RussianStrictE"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2935)
  @PropPut
  void russianStrictE(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SpanishModes"
   * </p>
   */

  @DISPID(2936)
  @PropGet
  RTExcelObj.XlSpanishModes spanishModes();


  /**
   * <p>
   * Setter method for the COM property "SpanishModes"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSpanishModes parameter.
   */

  @DISPID(2936)
  @PropPut
  void spanishModes(
    RTExcelObj.XlSpanishModes rhs);


  /**
   * <p>
   * Getter method for the COM property "PortugalReform"
   * </p>
   */

  @DISPID(2937)
  @PropGet
  RTExcelObj.XlPortugueseReform portugalReform();


  /**
   * <p>
   * Setter method for the COM property "PortugalReform"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPortugueseReform parameter.
   */

  @DISPID(2937)
  @PropPut
  void portugalReform(
    RTExcelObj.XlPortugueseReform rhs);


  /**
   * <p>
   * Getter method for the COM property "BrazilReform"
   * </p>
   */

  @DISPID(2938)
  @PropGet
  RTExcelObj.XlPortugueseReform brazilReform();


  /**
   * <p>
   * Setter method for the COM property "BrazilReform"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPortugueseReform parameter.
   */

  @DISPID(2938)
  @PropPut
  void brazilReform(
    RTExcelObj.XlPortugueseReform rhs);


  // Properties:
}

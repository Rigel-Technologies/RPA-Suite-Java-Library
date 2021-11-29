package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Style extends Com4jObject {
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
   * Getter method for the COM property "AddIndent"
   * </p>
   */

  @DISPID(1063)
  @PropGet
  boolean addIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1063)
  @PropPut
  void addIndent(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   */

  @DISPID(553)
  @PropGet
  boolean builtIn();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   */

  @DISPID(435)
  @PropGet
  RTExcelObj.Borders borders();


  /**
   */

  @DISPID(117)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   */

  @DISPID(146)
  @PropGet
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "FormulaHidden"
   * </p>
   */

  @DISPID(262)
  @PropGet
  boolean formulaHidden();


  /**
   * <p>
   * Setter method for the COM property "FormulaHidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(262)
  @PropPut
  void formulaHidden(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   */

  @DISPID(136)
  @PropGet
  RTExcelObj.XlHAlign horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlHAlign parameter.
   */

  @DISPID(136)
  @PropPut
  void horizontalAlignment(
    RTExcelObj.XlHAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeAlignment"
   * </p>
   */

  @DISPID(413)
  @PropGet
  boolean includeAlignment();


  /**
   * <p>
   * Setter method for the COM property "IncludeAlignment"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(413)
  @PropPut
  void includeAlignment(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeBorder"
   * </p>
   */

  @DISPID(414)
  @PropGet
  boolean includeBorder();


  /**
   * <p>
   * Setter method for the COM property "IncludeBorder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(414)
  @PropPut
  void includeBorder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeFont"
   * </p>
   */

  @DISPID(415)
  @PropGet
  boolean includeFont();


  /**
   * <p>
   * Setter method for the COM property "IncludeFont"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(415)
  @PropPut
  void includeFont(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeNumber"
   * </p>
   */

  @DISPID(416)
  @PropGet
  boolean includeNumber();


  /**
   * <p>
   * Setter method for the COM property "IncludeNumber"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(416)
  @PropPut
  void includeNumber(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludePatterns"
   * </p>
   */

  @DISPID(417)
  @PropGet
  boolean includePatterns();


  /**
   * <p>
   * Setter method for the COM property "IncludePatterns"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(417)
  @PropPut
  void includePatterns(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeProtection"
   * </p>
   */

  @DISPID(418)
  @PropGet
  boolean includeProtection();


  /**
   * <p>
   * Setter method for the COM property "IncludeProtection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(418)
  @PropPut
  void includeProtection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   */

  @DISPID(201)
  @PropGet
  int indentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(201)
  @PropPut
  void indentLevel(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   */

  @DISPID(129)
  @PropGet
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   */

  @DISPID(269)
  @PropGet
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(269)
  @PropPut
  void locked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MergeCells"
   * </p>
   */

  @DISPID(208)
  @PropGet
  java.lang.Object mergeCells();


  /**
   * <p>
   * Setter method for the COM property "MergeCells"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(208)
  @PropPut
  void mergeCells(
    java.lang.Object rhs);


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
   * Getter method for the COM property "NameLocal"
   * </p>
   */

  @DISPID(937)
  @PropGet
  java.lang.String nameLocal();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  java.lang.String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(193)
  @PropPut
  void numberFormat(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   */

  @DISPID(1097)
  @PropGet
  java.lang.String numberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1097)
  @PropPut
  void numberFormatLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   */

  @DISPID(134)
  @PropGet
  RTExcelObj.XlOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlOrientation parameter.
   */

  @DISPID(134)
  @PropPut
  void orientation(
    RTExcelObj.XlOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "ShrinkToFit"
   * </p>
   */

  @DISPID(209)
  @PropGet
  boolean shrinkToFit();


  /**
   * <p>
   * Setter method for the COM property "ShrinkToFit"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(209)
  @PropPut
  void shrinkToFit(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.String value();


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   */

  @DISPID(137)
  @PropGet
  RTExcelObj.XlVAlign verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlVAlign parameter.
   */

  @DISPID(137)
  @PropPut
  void verticalAlignment(
    RTExcelObj.XlVAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "WrapText"
   * </p>
   */

  @DISPID(276)
  @PropGet
  boolean wrapText();


  /**
   * <p>
   * Setter method for the COM property "WrapText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(276)
  @PropPut
  void wrapText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   */

  @DISPID(975)
  @PropGet
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(975)
  @PropPut
  void readingOrder(
    int rhs);


  // Properties:
}

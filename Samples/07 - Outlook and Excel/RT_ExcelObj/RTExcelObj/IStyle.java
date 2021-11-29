package RTExcelObj  ;

import com4j.*;

@IID("{00020852-0001-0000-C000-000000000046}")
public interface IStyle extends Com4jObject {
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
   * Getter method for the COM property "AddIndent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean addIndent();


  /**
   * <p>
   * Setter method for the COM property "AddIndent"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void addIndent(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(12)
  boolean builtIn();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type RTExcelObj.Borders
   */

  @VTID(13)
  RTExcelObj.Borders borders();


  /**
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object delete();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type RTExcelObj.Font
   */

  @VTID(15)
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "FormulaHidden"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(16)
  boolean formulaHidden();


  /**
   * <p>
   * Setter method for the COM property "FormulaHidden"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(17)
  void formulaHidden(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalAlignment"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlHAlign
   */

  @VTID(18)
  RTExcelObj.XlHAlign horizontalAlignment();


  /**
   * <p>
   * Setter method for the COM property "HorizontalAlignment"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlHAlign parameter.
   */

  @VTID(19)
  void horizontalAlignment(
    RTExcelObj.XlHAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeAlignment"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean includeAlignment();


  /**
   * <p>
   * Setter method for the COM property "IncludeAlignment"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void includeAlignment(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeBorder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean includeBorder();


  /**
   * <p>
   * Setter method for the COM property "IncludeBorder"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void includeBorder(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeFont"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean includeFont();


  /**
   * <p>
   * Setter method for the COM property "IncludeFont"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(25)
  void includeFont(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeNumber"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean includeNumber();


  /**
   * <p>
   * Setter method for the COM property "IncludeNumber"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void includeNumber(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludePatterns"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean includePatterns();


  /**
   * <p>
   * Setter method for the COM property "IncludePatterns"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void includePatterns(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IncludeProtection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(30)
  boolean includeProtection();


  /**
   * <p>
   * Setter method for the COM property "IncludeProtection"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(31)
  void includeProtection(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "IndentLevel"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int indentLevel();


  /**
   * <p>
   * Setter method for the COM property "IndentLevel"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void indentLevel(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type RTExcelObj.Interior
   */

  @VTID(34)
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(35)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(36)
  void locked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MergeCells"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(37)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object mergeCells();


  /**
   * <p>
   * Setter method for the COM property "MergeCells"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(38)
  void mergeCells(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(39)
  java.lang.String name(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "NameLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(40)
  java.lang.String nameLocal();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(41)
  java.lang.String numberFormat();


  /**
   * <p>
   * Setter method for the COM property "NumberFormat"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(42)
  void numberFormat(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "NumberFormatLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(43)
  java.lang.String numberFormatLocal();


  /**
   * <p>
   * Setter method for the COM property "NumberFormatLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(44)
  void numberFormatLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Orientation"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlOrientation
   */

  @VTID(45)
  RTExcelObj.XlOrientation orientation();


  /**
   * <p>
   * Setter method for the COM property "Orientation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlOrientation parameter.
   */

  @VTID(46)
  void orientation(
    RTExcelObj.XlOrientation rhs);


  /**
   * <p>
   * Getter method for the COM property "ShrinkToFit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(47)
  boolean shrinkToFit();


  /**
   * <p>
   * Setter method for the COM property "ShrinkToFit"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(48)
  void shrinkToFit(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(49)
  java.lang.String value(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "VerticalAlignment"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlVAlign
   */

  @VTID(50)
  RTExcelObj.XlVAlign verticalAlignment();


  /**
   * <p>
   * Setter method for the COM property "VerticalAlignment"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlVAlign parameter.
   */

  @VTID(51)
  void verticalAlignment(
    RTExcelObj.XlVAlign rhs);


  /**
   * <p>
   * Getter method for the COM property "WrapText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(52)
  boolean wrapText();


  /**
   * <p>
   * Setter method for the COM property "WrapText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(53)
  void wrapText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(54)
  @DefaultMethod
  java.lang.String _Default(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ReadingOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(55)
  int readingOrder();


  /**
   * <p>
   * Setter method for the COM property "ReadingOrder"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(56)
  void readingOrder(
    int rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Name extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int index();


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   */

  @DISPID(934)
  @PropGet
  java.lang.String category();


  /**
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(934)
  @PropPut
  void category(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CategoryLocal"
   * </p>
   */

  @DISPID(935)
  @PropGet
  java.lang.String categoryLocal();


  /**
   * <p>
   * Setter method for the COM property "CategoryLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(935)
  @PropPut
  void categoryLocal(
    java.lang.String rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "MacroType"
   * </p>
   */

  @DISPID(936)
  @PropGet
  RTExcelObj.XlXLMMacroType macroType();


  /**
   * <p>
   * Setter method for the COM property "MacroType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlXLMMacroType parameter.
   */

  @DISPID(936)
  @PropPut
  void macroType(
    RTExcelObj.XlXLMMacroType rhs);


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
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersTo"
   * </p>
   */

  @DISPID(938)
  @PropGet
  java.lang.Object refersTo();


  /**
   * <p>
   * Setter method for the COM property "RefersTo"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(938)
  @PropPut
  void refersTo(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShortcutKey"
   * </p>
   */

  @DISPID(597)
  @PropGet
  java.lang.String shortcutKey();


  /**
   * <p>
   * Setter method for the COM property "ShortcutKey"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(597)
  @PropPut
  void shortcutKey(
    java.lang.String rhs);


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
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(6)
  @PropPut
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void visible(
    boolean rhs);


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
   * Setter method for the COM property "NameLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(937)
  @PropPut
  void nameLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToLocal"
   * </p>
   */

  @DISPID(939)
  @PropGet
  java.lang.Object refersToLocal();


  /**
   * <p>
   * Setter method for the COM property "RefersToLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(939)
  @PropPut
  void refersToLocal(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToR1C1"
   * </p>
   */

  @DISPID(940)
  @PropGet
  java.lang.Object refersToR1C1();


  /**
   * <p>
   * Setter method for the COM property "RefersToR1C1"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(940)
  @PropPut
  void refersToR1C1(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToR1C1Local"
   * </p>
   */

  @DISPID(941)
  @PropGet
  java.lang.Object refersToR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "RefersToR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(941)
  @PropPut
  void refersToR1C1Local(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToRange"
   * </p>
   */

  @DISPID(1160)
  @PropGet
  RTExcelObj.Range refersToRange();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   */

  @DISPID(910)
  @PropGet
  java.lang.String comment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(910)
  @PropPut
  void comment(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "WorkbookParameter"
   * </p>
   */

  @DISPID(2607)
  @PropGet
  boolean workbookParameter();


  /**
   * <p>
   * Setter method for the COM property "WorkbookParameter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2607)
  @PropPut
  void workbookParameter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ValidWorkbookParameter"
   * </p>
   */

  @DISPID(2608)
  @PropGet
  boolean validWorkbookParameter();


  // Properties:
}

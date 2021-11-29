package RTExcelObj  ;

import com4j.*;

@IID("{000208B9-0001-0000-C000-000000000046}")
public interface IName extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Category"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String category(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "Category"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(13)
  void category(
    @LCID int lcidIn,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "CategoryLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String categoryLocal();


  /**
   * <p>
   * Setter method for the COM property "CategoryLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void categoryLocal(
    java.lang.String rhs);


  /**
   */

  @VTID(16)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "MacroType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlXLMMacroType
   */

  @VTID(17)
  RTExcelObj.XlXLMMacroType macroType();


  /**
   * <p>
   * Setter method for the COM property "MacroType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlXLMMacroType parameter.
   */

  @VTID(18)
  void macroType(
    RTExcelObj.XlXLMMacroType rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String name(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void name(
    @LCID int lcidIn,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersTo"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object refersTo(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "RefersTo"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(22)
  void refersTo(
    @LCID int lcidIn,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "ShortcutKey"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String shortcutKey();


  /**
   * <p>
   * Setter method for the COM property "ShortcutKey"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
  void shortcutKey(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(27)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(28)
  void visible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "NameLocal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(29)
  java.lang.String nameLocal();


  /**
   * <p>
   * Setter method for the COM property "NameLocal"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(30)
  void nameLocal(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToLocal"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(31)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object refersToLocal();


  /**
   * <p>
   * Setter method for the COM property "RefersToLocal"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(32)
  void refersToLocal(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToR1C1"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(33)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object refersToR1C1(
    @LCID int lcidIn);


  /**
   * <p>
   * Setter method for the COM property "RefersToR1C1"
   * </p>
   * @param lcidIn Mandatory int parameter.
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(34)
  void refersToR1C1(
    @LCID int lcidIn,
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToR1C1Local"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(35)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object refersToR1C1Local();


  /**
   * <p>
   * Setter method for the COM property "RefersToR1C1Local"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(36)
  void refersToR1C1Local(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "RefersToRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(37)
  RTExcelObj.Range refersToRange();


  /**
   * <p>
   * Getter method for the COM property "Comment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(38)
  java.lang.String comment();


  /**
   * <p>
   * Setter method for the COM property "Comment"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(39)
  void comment(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "WorkbookParameter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(40)
  boolean workbookParameter();


  /**
   * <p>
   * Setter method for the COM property "WorkbookParameter"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(41)
  void workbookParameter(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "ValidWorkbookParameter"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(42)
  boolean validWorkbookParameter();


  // Properties:
}

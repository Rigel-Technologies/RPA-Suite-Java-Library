package RTExcelObj  ;

import com4j.*;

@IID("{0002085C-0001-0000-C000-000000000046}")
public interface IToolbar extends Com4jObject {
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
   * Getter method for the COM property "BuiltIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean builtIn();


  /**
   */

  @VTID(11)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void height(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(15)
  void left(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(16)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(18)
  void position(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Protection"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlToolbarProtection
   */

  @VTID(19)
  RTExcelObj.XlToolbarProtection protection();


  /**
   * <p>
   * Setter method for the COM property "Protection"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlToolbarProtection parameter.
   */

  @VTID(20)
  void protection(
    RTExcelObj.XlToolbarProtection rhs);


  /**
   */

  @VTID(21)
  void reset();


  /**
   * <p>
   * Getter method for the COM property "ToolbarButtons"
   * </p>
   * @return  Returns a value of type RTExcelObj.ToolbarButtons
   */

  @VTID(22)
  RTExcelObj.ToolbarButtons toolbarButtons();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(23)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(24)
  void top(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(25)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(26)
  void visible(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(27)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(28)
  void width(
    int rhs);


  // Properties:
}

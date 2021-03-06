package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Toolbar extends Com4jObject {
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
   * Getter method for the COM property "BuiltIn"
   * </p>
   */

  @DISPID(553)
  @PropGet
  boolean builtIn();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(123)
  @PropPut
  void height(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   */

  @DISPID(127)
  @PropGet
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(127)
  @PropPut
  void left(
    int rhs);


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
   * Getter method for the COM property "Position"
   * </p>
   */

  @DISPID(133)
  @PropGet
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(133)
  @PropPut
  void position(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Protection"
   * </p>
   */

  @DISPID(176)
  @PropGet
  RTExcelObj.XlToolbarProtection protection();


  /**
   * <p>
   * Setter method for the COM property "Protection"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlToolbarProtection parameter.
   */

  @DISPID(176)
  @PropPut
  void protection(
    RTExcelObj.XlToolbarProtection rhs);


  /**
   */

  @DISPID(555)
  void reset();


  /**
   * <p>
   * Getter method for the COM property "ToolbarButtons"
   * </p>
   */

  @DISPID(964)
  @PropGet
  RTExcelObj.ToolbarButtons toolbarButtons();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   */

  @DISPID(126)
  @PropGet
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(126)
  @PropPut
  void top(
    int rhs);


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
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(122)
  @PropPut
  void width(
    int rhs);


  // Properties:
}

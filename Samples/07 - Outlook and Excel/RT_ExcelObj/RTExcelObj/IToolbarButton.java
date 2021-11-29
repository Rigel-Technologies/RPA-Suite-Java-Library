package RTExcelObj  ;

import com4j.*;

@IID("{0002085E-0001-0000-C000-000000000046}")
public interface IToolbarButton extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "BuiltInFace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean builtInFace();


  /**
   * <p>
   * Setter method for the COM property "BuiltInFace"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(12)
  void builtInFace(
    boolean rhs);


  /**
   * @param toolbar Mandatory RTExcelObj.Toolbar parameter.
   * @param before Mandatory int parameter.
   */

  @VTID(13)
  void copy(
    RTExcelObj.Toolbar toolbar,
    int before);


  /**
   */

  @VTID(14)
  void copyFace();


  /**
   */

  @VTID(15)
  void delete();


  /**
   */

  @VTID(16)
  void edit();


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void enabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "HelpContextID"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(19)
  int helpContextID();


  /**
   * <p>
   * Setter method for the COM property "HelpContextID"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(20)
  void helpContextID(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "HelpFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(21)
  java.lang.String helpFile();


  /**
   * <p>
   * Setter method for the COM property "HelpFile"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(22)
  void helpFile(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(23)
  int id();


  /**
   * <p>
   * Getter method for the COM property "IsGap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(24)
  boolean isGap();


  /**
   * @param toolbar Mandatory RTExcelObj.Toolbar parameter.
   * @param before Mandatory int parameter.
   */

  @VTID(25)
  void move(
    RTExcelObj.Toolbar toolbar,
    int before);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(27)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(28)
  java.lang.String onAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(29)
  void onAction(
    java.lang.String rhs);


  /**
   */

  @VTID(30)
  void pasteFace();


  /**
   * <p>
   * Getter method for the COM property "Pushed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(31)
  boolean pushed();


  /**
   * <p>
   * Setter method for the COM property "Pushed"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(32)
  void pushed(
    boolean rhs);


  /**
   */

  @VTID(33)
  void reset();


  /**
   * <p>
   * Getter method for the COM property "StatusBar"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(34)
  java.lang.String statusBar();


  /**
   * <p>
   * Setter method for the COM property "StatusBar"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(35)
  void statusBar(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(36)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(37)
  void width(
    int rhs);


  // Properties:
}

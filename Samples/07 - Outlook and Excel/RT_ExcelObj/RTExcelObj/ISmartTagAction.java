package RTExcelObj  ;

import com4j.*;

@IID("{0002445E-0001-0000-C000-000000000046}")
public interface ISmartTagAction extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String name();


  /**
   */

  @VTID(11)
  void execute();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSmartTagControlType
   */

  @VTID(13)
  RTExcelObj.XlSmartTagControlType type();


  /**
   * <p>
   * Getter method for the COM property "PresentInPane"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean presentInPane();


  /**
   * <p>
   * Getter method for the COM property "ExpandHelp"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean expandHelp();


  /**
   * <p>
   * Setter method for the COM property "ExpandHelp"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void expandHelp(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CheckboxState"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(17)
  boolean checkboxState();


  /**
   * <p>
   * Setter method for the COM property "CheckboxState"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(18)
  void checkboxState(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextboxText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String textboxText();


  /**
   * <p>
   * Setter method for the COM property "TextboxText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void textboxText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListSelection"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(21)
  int listSelection();


  /**
   * <p>
   * Setter method for the COM property "ListSelection"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(22)
  void listSelection(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RadioGroupSelection"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(23)
  int radioGroupSelection();


  /**
   * <p>
   * Setter method for the COM property "RadioGroupSelection"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(24)
  void radioGroupSelection(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ActiveXControl"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(25)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject activeXControl();


  // Properties:
}

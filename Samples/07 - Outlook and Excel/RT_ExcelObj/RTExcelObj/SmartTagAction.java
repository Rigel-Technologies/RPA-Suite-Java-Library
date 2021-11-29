package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SmartTagAction extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   */

  @DISPID(2211)
  void execute();


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
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlSmartTagControlType type();


  /**
   * <p>
   * Getter method for the COM property "PresentInPane"
   * </p>
   */

  @DISPID(2297)
  @PropGet
  boolean presentInPane();


  /**
   * <p>
   * Getter method for the COM property "ExpandHelp"
   * </p>
   */

  @DISPID(2298)
  @PropGet
  boolean expandHelp();


  /**
   * <p>
   * Setter method for the COM property "ExpandHelp"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2298)
  @PropPut
  void expandHelp(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "CheckboxState"
   * </p>
   */

  @DISPID(2299)
  @PropGet
  boolean checkboxState();


  /**
   * <p>
   * Setter method for the COM property "CheckboxState"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2299)
  @PropPut
  void checkboxState(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TextboxText"
   * </p>
   */

  @DISPID(2300)
  @PropGet
  java.lang.String textboxText();


  /**
   * <p>
   * Setter method for the COM property "TextboxText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2300)
  @PropPut
  void textboxText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListSelection"
   * </p>
   */

  @DISPID(2301)
  @PropGet
  int listSelection();


  /**
   * <p>
   * Setter method for the COM property "ListSelection"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2301)
  @PropPut
  void listSelection(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "RadioGroupSelection"
   * </p>
   */

  @DISPID(2302)
  @PropGet
  int radioGroupSelection();


  /**
   * <p>
   * Setter method for the COM property "RadioGroupSelection"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(2302)
  @PropPut
  void radioGroupSelection(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ActiveXControl"
   * </p>
   */

  @DISPID(2303)
  @PropGet
  com4j.Com4jObject activeXControl();


  // Properties:
}

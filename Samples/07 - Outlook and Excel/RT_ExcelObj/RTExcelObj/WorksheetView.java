package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface WorksheetView extends Com4jObject {
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
   * Getter method for the COM property "Sheet"
   * </p>
   */

  @DISPID(751)
  @PropGet
  com4j.Com4jObject sheet();


  /**
   * <p>
   * Getter method for the COM property "DisplayGridlines"
   * </p>
   */

  @DISPID(645)
  @PropGet
  boolean displayGridlines();


  /**
   * <p>
   * Setter method for the COM property "DisplayGridlines"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(645)
  @PropPut
  void displayGridlines(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayFormulas"
   * </p>
   */

  @DISPID(644)
  @PropGet
  boolean displayFormulas();


  /**
   * <p>
   * Setter method for the COM property "DisplayFormulas"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(644)
  @PropPut
  void displayFormulas(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayHeadings"
   * </p>
   */

  @DISPID(646)
  @PropGet
  boolean displayHeadings();


  /**
   * <p>
   * Setter method for the COM property "DisplayHeadings"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(646)
  @PropPut
  void displayHeadings(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayOutline"
   * </p>
   */

  @DISPID(647)
  @PropGet
  boolean displayOutline();


  /**
   * <p>
   * Setter method for the COM property "DisplayOutline"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(647)
  @PropPut
  void displayOutline(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DisplayZeros"
   * </p>
   */

  @DISPID(649)
  @PropGet
  boolean displayZeros();


  /**
   * <p>
   * Setter method for the COM property "DisplayZeros"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(649)
  @PropPut
  void displayZeros(
    boolean rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Diagram extends Com4jObject {
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
   * Getter method for the COM property "Nodes"
   * </p>
   */

  @DISPID(1701)
  @PropGet
  RTExcelObj.DiagramNodes nodes();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.MsoDiagramType type();


  /**
   * <p>
   * Getter method for the COM property "AutoLayout"
   * </p>
   */

  @DISPID(2243)
  @PropGet
  RTExcelObj.MsoTriState autoLayout();


  /**
   * <p>
   * Setter method for the COM property "AutoLayout"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @DISPID(2243)
  @PropPut
  void autoLayout(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Reverse"
   * </p>
   */

  @DISPID(2244)
  @PropGet
  RTExcelObj.MsoTriState reverse();


  /**
   * <p>
   * Setter method for the COM property "Reverse"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @DISPID(2244)
  @PropPut
  void reverse(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFormat"
   * </p>
   */

  @DISPID(114)
  @PropGet
  RTExcelObj.MsoTriState autoFormat();


  /**
   * <p>
   * Setter method for the COM property "AutoFormat"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @DISPID(114)
  @PropPut
  void autoFormat(
    RTExcelObj.MsoTriState rhs);


  /**
   * @param type Mandatory RTExcelObj.MsoDiagramType parameter.
   */

  @DISPID(1046)
  void convert(
    RTExcelObj.MsoDiagramType type);


  /**
   */

  @DISPID(2304)
  void fitText();


  // Properties:
}

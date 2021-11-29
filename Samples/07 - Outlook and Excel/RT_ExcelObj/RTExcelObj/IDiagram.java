package RTExcelObj  ;

import com4j.*;

@IID("{0002446F-0001-0000-C000-000000000046}")
public interface IDiagram extends Com4jObject {
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
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type RTExcelObj.DiagramNodes
   */

  @VTID(10)
  RTExcelObj.DiagramNodes nodes();


  @VTID(10)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.DiagramNodes.class})
  RTExcelObj.DiagramNode nodes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoDiagramType
   */

  @VTID(11)
  RTExcelObj.MsoDiagramType type();


  /**
   * <p>
   * Getter method for the COM property "AutoLayout"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(12)
  RTExcelObj.MsoTriState autoLayout();


  /**
   * <p>
   * Setter method for the COM property "AutoLayout"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(13)
  void autoLayout(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Reverse"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(14)
  RTExcelObj.MsoTriState reverse();


  /**
   * <p>
   * Setter method for the COM property "Reverse"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(15)
  void reverse(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "AutoFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(16)
  RTExcelObj.MsoTriState autoFormat();


  /**
   * <p>
   * Setter method for the COM property "AutoFormat"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(17)
  void autoFormat(
    RTExcelObj.MsoTriState rhs);


  /**
   * @param type Mandatory RTExcelObj.MsoDiagramType parameter.
   */

  @VTID(18)
  void convert(
    RTExcelObj.MsoDiagramType type);


  /**
   */

  @VTID(19)
  void fitText();


  // Properties:
}

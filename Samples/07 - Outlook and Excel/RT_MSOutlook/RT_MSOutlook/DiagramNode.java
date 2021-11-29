package RT_MSOutlook  ;

import com4j.*;

@IID("{000C0370-0000-0000-C000-000000000046}")
public interface DiagramNode extends RT_MSOutlook._IMsoDispObj {
  // Methods:
  /**
   * @param pos Optional parameter. Default value is 2
   * @param nodeType Optional parameter. Default value is 1
   * @return  Returns a value of type RT_MSOutlook.DiagramNode
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(9)
  RT_MSOutlook.DiagramNode addNode(
    @Optional @DefaultValue("2") RT_MSOutlook.MsoRelativeNodePosition pos,
    @Optional @DefaultValue("1") RT_MSOutlook.MsoDiagramNodeType nodeType);


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(10)
  void delete();


  /**
   * @param targetNode Mandatory RT_MSOutlook.DiagramNode parameter.
   * @param pos Mandatory RT_MSOutlook.MsoRelativeNodePosition parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(11)
  void moveNode(
    RT_MSOutlook.DiagramNode targetNode,
    RT_MSOutlook.MsoRelativeNodePosition pos);


  /**
   * @param targetNode Mandatory RT_MSOutlook.DiagramNode parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(12)
  void replaceNode(
    RT_MSOutlook.DiagramNode targetNode);


  /**
   * @param targetNode Mandatory RT_MSOutlook.DiagramNode parameter.
   * @param swapChildren Optional parameter. Default value is false
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(13)
  void swapNode(
    RT_MSOutlook.DiagramNode targetNode,
    @Optional @DefaultValue("-1") boolean swapChildren);


  /**
   * @param copyChildren Mandatory boolean parameter.
   * @param targetNode Mandatory RT_MSOutlook.DiagramNode parameter.
   * @param pos Optional parameter. Default value is 2
   * @return  Returns a value of type RT_MSOutlook.DiagramNode
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook.DiagramNode cloneNode(
    boolean copyChildren,
    RT_MSOutlook.DiagramNode targetNode,
    @Optional @DefaultValue("2") RT_MSOutlook.MsoRelativeNodePosition pos);


  /**
   * @param receivingNode Mandatory RT_MSOutlook.DiagramNode parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(15)
  void transferChildren(
    RT_MSOutlook.DiagramNode receivingNode);


  /**
   * @return  Returns a value of type RT_MSOutlook.DiagramNode
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook.DiagramNode nextNode();


  /**
   * @return  Returns a value of type RT_MSOutlook.DiagramNode
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook.DiagramNode prevNode();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Children"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.DiagramNodeChildren
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook.DiagramNodeChildren children();


  @VTID(19)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook.DiagramNodeChildren.class})
  RT_MSOutlook.DiagramNode children(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Shape"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Shape
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(20)
  RT_MSOutlook.Shape shape();


  /**
   * <p>
   * Getter method for the COM property "Root"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.DiagramNode
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook.DiagramNode root();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.IMsoDiagram
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook.IMsoDiagram diagram();


  /**
   * <p>
   * Getter method for the COM property "Layout"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoOrgChartLayoutType
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.MsoOrgChartLayoutType layout();


  /**
   * <p>
   * Setter method for the COM property "Layout"
   * </p>
   * @param type Mandatory RT_MSOutlook.MsoOrgChartLayoutType parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(24)
  void layout(
    RT_MSOutlook.MsoOrgChartLayoutType type);


  /**
   * <p>
   * Getter method for the COM property "TextShape"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Shape
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook.Shape textShape();


  // Properties:
}

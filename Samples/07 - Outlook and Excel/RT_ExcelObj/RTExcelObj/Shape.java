package RTExcelObj  ;

import com4j.*;

@IID("{000C031C-0000-0000-C000-000000000046}")
public interface Shape extends RTExcelObj._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(10)
  void apply();


  /**
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void delete();


  /**
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(12)
  RTExcelObj.Shape duplicate();


  /**
   * @param flipCmd Mandatory RTExcelObj.MsoFlipCmd parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(13)
  void flip(
    RTExcelObj.MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(14)
  void incrementLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(15)
  void incrementRotation(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(16)
  void incrementTop(
    float increment);


  /**
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(17)
  void pickUp();


  /**
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(18)
  void rerouteConnections();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory RTExcelObj.MsoTriState parameter.
   * @param fScale Optional parameter. Default value is 0
   */

  @DISPID(19) //= 0x13. The runtime will prefer the VTID if present
  @VTID(19)
  void scaleHeight(
    float factor,
    RTExcelObj.MsoTriState relativeToOriginalSize,
    @Optional @DefaultValue("0") RTExcelObj.MsoScaleFrom fScale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory RTExcelObj.MsoTriState parameter.
   * @param fScale Optional parameter. Default value is 0
   */

  @DISPID(20) //= 0x14. The runtime will prefer the VTID if present
  @VTID(20)
  void scaleWidth(
    float factor,
    RTExcelObj.MsoTriState relativeToOriginalSize,
    @Optional @DefaultValue("0") RTExcelObj.MsoScaleFrom fScale);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(21)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(22)
  void setShapesDefaultProperties();


  /**
   * @return  Returns a value of type RTExcelObj.ShapeRange
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(23)
  RTExcelObj.ShapeRange ungroup();


  @VTID(23)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.ShapeRange.class})
  RTExcelObj.Shape ungroup(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * @param zOrderCmd Mandatory RTExcelObj.MsoZOrderCmd parameter.
   */

  @DISPID(24) //= 0x18. The runtime will prefer the VTID if present
  @VTID(24)
  void zOrder(
    RTExcelObj.MsoZOrderCmd zOrderCmd);


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type RTExcelObj.Adjustments
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(25)
  RTExcelObj.Adjustments adjustments();


  @VTID(25)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.Adjustments.class})
  float adjustments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoAutoShapeType
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(26)
  RTExcelObj.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param autoShapeType Mandatory RTExcelObj.MsoAutoShapeType parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(27)
  void autoShapeType(
    RTExcelObj.MsoAutoShapeType autoShapeType);


  /**
   * <p>
   * Getter method for the COM property "BlackWhiteMode"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoBlackWhiteMode
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(28)
  RTExcelObj.MsoBlackWhiteMode blackWhiteMode();


  /**
   * <p>
   * Setter method for the COM property "BlackWhiteMode"
   * </p>
   * @param blackWhiteMode Mandatory RTExcelObj.MsoBlackWhiteMode parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(29)
  void blackWhiteMode(
    RTExcelObj.MsoBlackWhiteMode blackWhiteMode);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   * @return  Returns a value of type RTExcelObj.CalloutFormat
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(30)
  RTExcelObj.CalloutFormat callout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(31)
  int connectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(32)
  RTExcelObj.MsoTriState connector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.ConnectorFormat
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(33)
  RTExcelObj.ConnectorFormat connectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type RTExcelObj.FillFormat
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(34)
  RTExcelObj.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.GroupShapes
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(35)
  RTExcelObj.GroupShapes groupItems();


  @VTID(35)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.GroupShapes.class})
  RTExcelObj.Shape groupItems(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(36)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory float parameter.
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(37)
  void height(
    float height);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(38)
  RTExcelObj.MsoTriState horizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(39)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(40)
  void left(
    float left);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type RTExcelObj.LineFormat
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(41)
  RTExcelObj.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(42)
  RTExcelObj.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param lockAspectRatio Mandatory RTExcelObj.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(43)
  void lockAspectRatio(
    RTExcelObj.MsoTriState lockAspectRatio);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(45)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type RTExcelObj.ShapeNodes
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(46)
  RTExcelObj.ShapeNodes nodes();


  @VTID(46)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.ShapeNodes.class})
  RTExcelObj.ShapeNode nodes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(47)
  float rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rotation Mandatory float parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(48)
  void rotation(
    float rotation);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.PictureFormat
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(49)
  RTExcelObj.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type RTExcelObj.ShadowFormat
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(50)
  RTExcelObj.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextEffectFormat
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(51)
  RTExcelObj.TextEffectFormat textEffect();


  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextFrame
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(52)
  RTExcelObj.TextFrame textFrame();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type RTExcelObj.ThreeDFormat
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(53)
  RTExcelObj.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(54)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(55)
  void top(
    float top);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoShapeType
   */

  @DISPID(124) //= 0x7c. The runtime will prefer the VTID if present
  @VTID(56)
  RTExcelObj.MsoShapeType type();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(125) //= 0x7d. The runtime will prefer the VTID if present
  @VTID(57)
  RTExcelObj.MsoTriState verticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(126) //= 0x7e. The runtime will prefer the VTID if present
  @VTID(58)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(59)
  RTExcelObj.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory RTExcelObj.MsoTriState parameter.
   */

  @DISPID(127) //= 0x7f. The runtime will prefer the VTID if present
  @VTID(60)
  void visible(
    RTExcelObj.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(61)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory float parameter.
   */

  @DISPID(128) //= 0x80. The runtime will prefer the VTID if present
  @VTID(62)
  void width(
    float width);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(129) //= 0x81. The runtime will prefer the VTID if present
  @VTID(63)
  int zOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type RTExcelObj.Script
   */

  @DISPID(130) //= 0x82. The runtime will prefer the VTID if present
  @VTID(64)
  RTExcelObj.Script script();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(65)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param alternativeText Mandatory java.lang.String parameter.
   */

  @DISPID(131) //= 0x83. The runtime will prefer the VTID if present
  @VTID(66)
  void alternativeText(
    java.lang.String alternativeText);


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(132) //= 0x84. The runtime will prefer the VTID if present
  @VTID(67)
  RTExcelObj.MsoTriState hasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type RTExcelObj.IMsoDiagram
   */

  @DISPID(133) //= 0x85. The runtime will prefer the VTID if present
  @VTID(68)
  RTExcelObj.IMsoDiagram diagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(134) //= 0x86. The runtime will prefer the VTID if present
  @VTID(69)
  RTExcelObj.MsoTriState hasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   * @return  Returns a value of type RTExcelObj.DiagramNode
   */

  @DISPID(135) //= 0x87. The runtime will prefer the VTID if present
  @VTID(70)
  RTExcelObj.DiagramNode diagramNode();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(136) //= 0x88. The runtime will prefer the VTID if present
  @VTID(71)
  RTExcelObj.MsoTriState child();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(72)
  RTExcelObj.Shape parentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.CanvasShapes
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(73)
  RTExcelObj.CanvasShapes canvasItems();


  @VTID(73)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.CanvasShapes.class})
  RTExcelObj.Shape canvasItems(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(74)
  int id();


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(140) //= 0x8c. The runtime will prefer the VTID if present
  @VTID(75)
  void canvasCropLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(141) //= 0x8d. The runtime will prefer the VTID if present
  @VTID(76)
  void canvasCropTop(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(142) //= 0x8e. The runtime will prefer the VTID if present
  @VTID(77)
  void canvasCropRight(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @DISPID(143) //= 0x8f. The runtime will prefer the VTID if present
  @VTID(78)
  void canvasCropBottom(
    float increment);


  /**
   * <p>
   * Setter method for the COM property "RTF"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(144) //= 0x90. The runtime will prefer the VTID if present
  @VTID(79)
  void rtf(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextFrame2
   */

  @DISPID(145) //= 0x91. The runtime will prefer the VTID if present
  @VTID(80)
  RTExcelObj.TextFrame2 textFrame2();


  /**
   */

  @DISPID(146) //= 0x92. The runtime will prefer the VTID if present
  @VTID(81)
  void cut();


  /**
   */

  @DISPID(147) //= 0x93. The runtime will prefer the VTID if present
  @VTID(82)
  void copy();


  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(83)
  RTExcelObj.MsoTriState hasChart();


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   * @return  Returns a value of type RTExcelObj.IMsoChart
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(84)
  RTExcelObj.IMsoChart chart();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoShapeStyleIndex
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(85)
  RTExcelObj.MsoShapeStyleIndex shapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param shapeStyle Mandatory RTExcelObj.MsoShapeStyleIndex parameter.
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(86)
  void shapeStyle(
    RTExcelObj.MsoShapeStyleIndex shapeStyle);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoBackgroundStyleIndex
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(87)
  RTExcelObj.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param backgroundStyle Mandatory RTExcelObj.MsoBackgroundStyleIndex parameter.
   */

  @DISPID(151) //= 0x97. The runtime will prefer the VTID if present
  @VTID(88)
  void backgroundStyle(
    RTExcelObj.MsoBackgroundStyleIndex backgroundStyle);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type RTExcelObj.SoftEdgeFormat
   */

  @DISPID(152) //= 0x98. The runtime will prefer the VTID if present
  @VTID(89)
  RTExcelObj.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type RTExcelObj.GlowFormat
   */

  @DISPID(153) //= 0x99. The runtime will prefer the VTID if present
  @VTID(90)
  RTExcelObj.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type RTExcelObj.ReflectionFormat
   */

  @DISPID(154) //= 0x9a. The runtime will prefer the VTID if present
  @VTID(91)
  RTExcelObj.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "HasSmartArt"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @DISPID(155) //= 0x9b. The runtime will prefer the VTID if present
  @VTID(92)
  RTExcelObj.MsoTriState hasSmartArt();


  /**
   * <p>
   * Getter method for the COM property "SmartArt"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartArt
   */

  @DISPID(156) //= 0x9c. The runtime will prefer the VTID if present
  @VTID(93)
  RTExcelObj.SmartArt smartArt();


  /**
   * @param layout Mandatory RTExcelObj.SmartArtLayout parameter.
   */

  @DISPID(157) //= 0x9d. The runtime will prefer the VTID if present
  @VTID(94)
  void convertTextToSmartArt(
    RTExcelObj.SmartArtLayout layout);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(95)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(158) //= 0x9e. The runtime will prefer the VTID if present
  @VTID(96)
  void title(
    java.lang.String title);


  // Properties:
}

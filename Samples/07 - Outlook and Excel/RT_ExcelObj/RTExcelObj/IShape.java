package RTExcelObj  ;

import com4j.*;

@IID("{00024439-0001-0000-C000-000000000046}")
public interface IShape extends Com4jObject {
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
   */

  @VTID(10)
  void apply();


  /**
   */

  @VTID(11)
  void delete();


  /**
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(12)
  RTExcelObj.Shape duplicate();


  /**
   * @param flipCmd Mandatory RTExcelObj.MsoFlipCmd parameter.
   */

  @VTID(13)
  void flip(
    RTExcelObj.MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(14)
  void incrementLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(15)
  void incrementRotation(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(16)
  void incrementTop(
    float increment);


  /**
   */

  @VTID(17)
  void pickUp();


  /**
   */

  @VTID(18)
  void rerouteConnections();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory RTExcelObj.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(19)
  void scaleHeight(
    float factor,
    RTExcelObj.MsoTriState relativeToOriginalSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory RTExcelObj.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(20)
  void scaleWidth(
    float factor,
    RTExcelObj.MsoTriState relativeToOriginalSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scale);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(21)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   */

  @VTID(22)
  void setShapesDefaultProperties();


  /**
   * @return  Returns a value of type RTExcelObj.ShapeRange
   */

  @VTID(23)
  RTExcelObj.ShapeRange ungroup();


  /**
   * @param zOrderCmd Mandatory RTExcelObj.MsoZOrderCmd parameter.
   */

  @VTID(24)
  void zOrder(
    RTExcelObj.MsoZOrderCmd zOrderCmd);


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type RTExcelObj.Adjustments
   */

  @VTID(25)
  RTExcelObj.Adjustments adjustments();


  @VTID(25)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.Adjustments.class})
  float adjustments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextFrame
   */

  @VTID(26)
  RTExcelObj.TextFrame textFrame();


  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoAutoShapeType
   */

  @VTID(27)
  RTExcelObj.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoAutoShapeType parameter.
   */

  @VTID(28)
  void autoShapeType(
    RTExcelObj.MsoAutoShapeType rhs);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   * @return  Returns a value of type RTExcelObj.CalloutFormat
   */

  @VTID(29)
  RTExcelObj.CalloutFormat callout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(30)
  int connectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(31)
  RTExcelObj.MsoTriState connector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.ConnectorFormat
   */

  @VTID(32)
  RTExcelObj.ConnectorFormat connectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type RTExcelObj.FillFormat
   */

  @VTID(33)
  RTExcelObj.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.GroupShapes
   */

  @VTID(34)
  RTExcelObj.GroupShapes groupItems();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(35)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(36)
  void height(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(37)
  RTExcelObj.MsoTriState horizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(38)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(39)
  void left(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type RTExcelObj.LineFormat
   */

  @VTID(40)
  RTExcelObj.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(41)
  RTExcelObj.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(42)
  void lockAspectRatio(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(43)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(44)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type RTExcelObj.ShapeNodes
   */

  @VTID(45)
  RTExcelObj.ShapeNodes nodes();


  @VTID(45)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.ShapeNodes.class})
  RTExcelObj.ShapeNode nodes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(46)
  float rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(47)
  void rotation(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.PictureFormat
   */

  @VTID(48)
  RTExcelObj.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type RTExcelObj.ShadowFormat
   */

  @VTID(49)
  RTExcelObj.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextEffectFormat
   */

  @VTID(50)
  RTExcelObj.TextEffectFormat textEffect();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type RTExcelObj.ThreeDFormat
   */

  @VTID(51)
  RTExcelObj.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(52)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(53)
  void top(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoShapeType
   */

  @VTID(54)
  RTExcelObj.MsoShapeType type();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(55)
  RTExcelObj.MsoTriState verticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(56)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(57)
  RTExcelObj.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(58)
  void visible(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(59)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(60)
  void width(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(61)
  int zOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "Hyperlink"
   * </p>
   * @return  Returns a value of type RTExcelObj.Hyperlink
   */

  @VTID(62)
  RTExcelObj.Hyperlink hyperlink();


  /**
   * <p>
   * Getter method for the COM property "BlackWhiteMode"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoBlackWhiteMode
   */

  @VTID(63)
  RTExcelObj.MsoBlackWhiteMode blackWhiteMode();


  /**
   * <p>
   * Setter method for the COM property "BlackWhiteMode"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoBlackWhiteMode parameter.
   */

  @VTID(64)
  void blackWhiteMode(
    RTExcelObj.MsoBlackWhiteMode rhs);


  /**
   * <p>
   * Getter method for the COM property "DrawingObject"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(65)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject drawingObject();


  /**
   * <p>
   * Getter method for the COM property "OnAction"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(66)
  java.lang.String onAction();


  /**
   * <p>
   * Setter method for the COM property "OnAction"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(67)
  void onAction(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(68)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(69)
  void locked(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "TopLeftCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(70)
  RTExcelObj.Range topLeftCell();


  /**
   * <p>
   * Getter method for the COM property "BottomRightCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(71)
  RTExcelObj.Range bottomRightCell();


  /**
   * <p>
   * Getter method for the COM property "Placement"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPlacement
   */

  @VTID(72)
  RTExcelObj.XlPlacement placement();


  /**
   * <p>
   * Setter method for the COM property "Placement"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPlacement parameter.
   */

  @VTID(73)
  void placement(
    RTExcelObj.XlPlacement rhs);


  /**
   */

  @VTID(74)
  void copy();


  /**
   */

  @VTID(75)
  void cut();


  /**
   * @param appearance Optional parameter. Default value is com4j.Variant.getMissing()
   * @param format Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(76)
  void copyPicture(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object appearance,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object format);


  /**
   * <p>
   * Getter method for the COM property "ControlFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.ControlFormat
   */

  @VTID(77)
  RTExcelObj.ControlFormat controlFormat();


  /**
   * <p>
   * Getter method for the COM property "LinkFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.LinkFormat
   */

  @VTID(78)
  RTExcelObj.LinkFormat linkFormat();


  /**
   * <p>
   * Getter method for the COM property "OLEFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.OLEFormat
   */

  @VTID(79)
  RTExcelObj.OLEFormat oleFormat();


  /**
   * <p>
   * Getter method for the COM property "FormControlType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlFormControl
   */

  @VTID(80)
  RTExcelObj.XlFormControl formControlType();


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(81)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(82)
  void alternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Script"
   * </p>
   * @return  Returns a value of type RTExcelObj.Script
   */

  @VTID(83)
  RTExcelObj.Script script();


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   * @return  Returns a value of type RTExcelObj.DiagramNode
   */

  @VTID(84)
  RTExcelObj.DiagramNode diagramNode();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(85)
  RTExcelObj.MsoTriState hasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type RTExcelObj.Diagram
   */

  @VTID(86)
  RTExcelObj.Diagram diagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(87)
  RTExcelObj.MsoTriState hasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(88)
  RTExcelObj.MsoTriState child();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(89)
  RTExcelObj.Shape parentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.CanvasShapes
   */

  @VTID(90)
  RTExcelObj.CanvasShapes canvasItems();


  @VTID(90)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.CanvasShapes.class})
  RTExcelObj.Shape canvasItems(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(91)
  int id();


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(92)
  void canvasCropLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(93)
  void canvasCropTop(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(94)
  void canvasCropRight(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(95)
  void canvasCropBottom(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   * @return  Returns a value of type RTExcelObj._Chart
   */

  @VTID(96)
  RTExcelObj._Chart chart();


  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(97)
  RTExcelObj.MsoTriState hasChart();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextFrame2
   */

  @VTID(98)
  RTExcelObj.TextFrame2 textFrame2();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoShapeStyleIndex
   */

  @VTID(99)
  RTExcelObj.MsoShapeStyleIndex shapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoShapeStyleIndex parameter.
   */

  @VTID(100)
  void shapeStyle(
    RTExcelObj.MsoShapeStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoBackgroundStyleIndex
   */

  @VTID(101)
  RTExcelObj.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoBackgroundStyleIndex parameter.
   */

  @VTID(102)
  void backgroundStyle(
    RTExcelObj.MsoBackgroundStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type RTExcelObj.SoftEdgeFormat
   */

  @VTID(103)
  RTExcelObj.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type RTExcelObj.GlowFormat
   */

  @VTID(104)
  RTExcelObj.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type RTExcelObj.ReflectionFormat
   */

  @VTID(105)
  RTExcelObj.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "HasSmartArt"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(106)
  RTExcelObj.MsoTriState hasSmartArt();


  /**
   * <p>
   * Getter method for the COM property "SmartArt"
   * </p>
   * @return  Returns a value of type RTExcelObj.SmartArt
   */

  @VTID(107)
  RTExcelObj.SmartArt smartArt();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(108)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(109)
  void title(
    java.lang.String rhs);


  // Properties:
}

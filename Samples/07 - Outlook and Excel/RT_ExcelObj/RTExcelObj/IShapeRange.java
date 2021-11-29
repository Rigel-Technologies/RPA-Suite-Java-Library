package RTExcelObj  ;

import com4j.*;

@IID("{0002443B-0001-0000-C000-000000000046}")
public interface IShapeRange extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(11)
  RTExcelObj.Shape item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.Shape _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param alignCmd Mandatory RTExcelObj.MsoAlignCmd parameter.
   * @param relativeTo Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(14)
  void align(
    RTExcelObj.MsoAlignCmd alignCmd,
    RTExcelObj.MsoTriState relativeTo);


  /**
   */

  @VTID(15)
  void apply();


  /**
   */

  @VTID(16)
  void delete();


  /**
   * @param distributeCmd Mandatory RTExcelObj.MsoDistributeCmd parameter.
   * @param relativeTo Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(17)
  void distribute(
    RTExcelObj.MsoDistributeCmd distributeCmd,
    RTExcelObj.MsoTriState relativeTo);


  /**
   * @return  Returns a value of type RTExcelObj.ShapeRange
   */

  @VTID(18)
  RTExcelObj.ShapeRange duplicate();


  /**
   * @param flipCmd Mandatory RTExcelObj.MsoFlipCmd parameter.
   */

  @VTID(19)
  void flip(
    RTExcelObj.MsoFlipCmd flipCmd);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(20)
  void incrementLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(21)
  void incrementRotation(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(22)
  void incrementTop(
    float increment);


  /**
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(23)
  RTExcelObj.Shape group();


  /**
   */

  @VTID(24)
  void pickUp();


  /**
   */

  @VTID(25)
  void rerouteConnections();


  /**
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(26)
  RTExcelObj.Shape regroup();


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory RTExcelObj.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(27)
  void scaleHeight(
    float factor,
    RTExcelObj.MsoTriState relativeToOriginalSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scale);


  /**
   * @param factor Mandatory float parameter.
   * @param relativeToOriginalSize Mandatory RTExcelObj.MsoTriState parameter.
   * @param scale Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(28)
  void scaleWidth(
    float factor,
    RTExcelObj.MsoTriState relativeToOriginalSize,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scale);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(29)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace);


  /**
   */

  @VTID(30)
  void setShapesDefaultProperties();


  /**
   * @return  Returns a value of type RTExcelObj.ShapeRange
   */

  @VTID(31)
  RTExcelObj.ShapeRange ungroup();


  /**
   * @param zOrderCmd Mandatory RTExcelObj.MsoZOrderCmd parameter.
   */

  @VTID(32)
  void zOrder(
    RTExcelObj.MsoZOrderCmd zOrderCmd);


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type RTExcelObj.Adjustments
   */

  @VTID(33)
  RTExcelObj.Adjustments adjustments();


  @VTID(33)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.Adjustments.class})
  float adjustments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TextFrame"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextFrame
   */

  @VTID(34)
  RTExcelObj.TextFrame textFrame();


  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoAutoShapeType
   */

  @VTID(35)
  RTExcelObj.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoAutoShapeType parameter.
   */

  @VTID(36)
  void autoShapeType(
    RTExcelObj.MsoAutoShapeType rhs);


  /**
   * <p>
   * Getter method for the COM property "Callout"
   * </p>
   * @return  Returns a value of type RTExcelObj.CalloutFormat
   */

  @VTID(37)
  RTExcelObj.CalloutFormat callout();


  /**
   * <p>
   * Getter method for the COM property "ConnectionSiteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(38)
  int connectionSiteCount();


  /**
   * <p>
   * Getter method for the COM property "Connector"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(39)
  RTExcelObj.MsoTriState connector();


  /**
   * <p>
   * Getter method for the COM property "ConnectorFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.ConnectorFormat
   */

  @VTID(40)
  RTExcelObj.ConnectorFormat connectorFormat();


  /**
   * <p>
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type RTExcelObj.FillFormat
   */

  @VTID(41)
  RTExcelObj.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "GroupItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.GroupShapes
   */

  @VTID(42)
  RTExcelObj.GroupShapes groupItems();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(43)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(44)
  void height(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "HorizontalFlip"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(45)
  RTExcelObj.MsoTriState horizontalFlip();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(46)
  float left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(47)
  void left(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type RTExcelObj.LineFormat
   */

  @VTID(48)
  RTExcelObj.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(49)
  RTExcelObj.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(50)
  void lockAspectRatio(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(51)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(52)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Nodes"
   * </p>
   * @return  Returns a value of type RTExcelObj.ShapeNodes
   */

  @VTID(53)
  RTExcelObj.ShapeNodes nodes();


  @VTID(53)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.ShapeNodes.class})
  RTExcelObj.ShapeNode nodes(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Rotation"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(54)
  float rotation();


  /**
   * <p>
   * Setter method for the COM property "Rotation"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(55)
  void rotation(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.PictureFormat
   */

  @VTID(56)
  RTExcelObj.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type RTExcelObj.ShadowFormat
   */

  @VTID(57)
  RTExcelObj.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "TextEffect"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextEffectFormat
   */

  @VTID(58)
  RTExcelObj.TextEffectFormat textEffect();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type RTExcelObj.ThreeDFormat
   */

  @VTID(59)
  RTExcelObj.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(60)
  float top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(61)
  void top(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoShapeType
   */

  @VTID(62)
  RTExcelObj.MsoShapeType type();


  /**
   * <p>
   * Getter method for the COM property "VerticalFlip"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(63)
  RTExcelObj.MsoTriState verticalFlip();


  /**
   * <p>
   * Getter method for the COM property "Vertices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(64)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object vertices();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(65)
  RTExcelObj.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(66)
  void visible(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(67)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(68)
  void width(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "ZOrderPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(69)
  int zOrderPosition();


  /**
   * <p>
   * Getter method for the COM property "BlackWhiteMode"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoBlackWhiteMode
   */

  @VTID(70)
  RTExcelObj.MsoBlackWhiteMode blackWhiteMode();


  /**
   * <p>
   * Setter method for the COM property "BlackWhiteMode"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoBlackWhiteMode parameter.
   */

  @VTID(71)
  void blackWhiteMode(
    RTExcelObj.MsoBlackWhiteMode rhs);


  /**
   * <p>
   * Getter method for the COM property "AlternativeText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(72)
  java.lang.String alternativeText();


  /**
   * <p>
   * Setter method for the COM property "AlternativeText"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(73)
  void alternativeText(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DiagramNode"
   * </p>
   * @return  Returns a value of type RTExcelObj.DiagramNode
   */

  @VTID(74)
  RTExcelObj.DiagramNode diagramNode();


  /**
   * <p>
   * Getter method for the COM property "HasDiagramNode"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(75)
  RTExcelObj.MsoTriState hasDiagramNode();


  /**
   * <p>
   * Getter method for the COM property "Diagram"
   * </p>
   * @return  Returns a value of type RTExcelObj.Diagram
   */

  @VTID(76)
  RTExcelObj.Diagram diagram();


  /**
   * <p>
   * Getter method for the COM property "HasDiagram"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(77)
  RTExcelObj.MsoTriState hasDiagram();


  /**
   * <p>
   * Getter method for the COM property "Child"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(78)
  RTExcelObj.MsoTriState child();


  /**
   * <p>
   * Getter method for the COM property "ParentGroup"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shape
   */

  @VTID(79)
  RTExcelObj.Shape parentGroup();


  /**
   * <p>
   * Getter method for the COM property "CanvasItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.CanvasShapes
   */

  @VTID(80)
  RTExcelObj.CanvasShapes canvasItems();


  @VTID(80)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.CanvasShapes.class})
  RTExcelObj.Shape canvasItems(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(81)
  int id();


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(82)
  void canvasCropLeft(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(83)
  void canvasCropTop(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(84)
  void canvasCropRight(
    float increment);


  /**
   * @param increment Mandatory float parameter.
   */

  @VTID(85)
  void canvasCropBottom(
    float increment);


  /**
   * <p>
   * Getter method for the COM property "Chart"
   * </p>
   * @return  Returns a value of type RTExcelObj._Chart
   */

  @VTID(86)
  RTExcelObj._Chart chart();


  /**
   * <p>
   * Getter method for the COM property "HasChart"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(87)
  RTExcelObj.MsoTriState hasChart();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextFrame2
   */

  @VTID(88)
  RTExcelObj.TextFrame2 textFrame2();


  /**
   * <p>
   * Getter method for the COM property "ShapeStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoShapeStyleIndex
   */

  @VTID(89)
  RTExcelObj.MsoShapeStyleIndex shapeStyle();


  /**
   * <p>
   * Setter method for the COM property "ShapeStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoShapeStyleIndex parameter.
   */

  @VTID(90)
  void shapeStyle(
    RTExcelObj.MsoShapeStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "BackgroundStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoBackgroundStyleIndex
   */

  @VTID(91)
  RTExcelObj.MsoBackgroundStyleIndex backgroundStyle();


  /**
   * <p>
   * Setter method for the COM property "BackgroundStyle"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoBackgroundStyleIndex parameter.
   */

  @VTID(92)
  void backgroundStyle(
    RTExcelObj.MsoBackgroundStyleIndex rhs);


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type RTExcelObj.SoftEdgeFormat
   */

  @VTID(93)
  RTExcelObj.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type RTExcelObj.GlowFormat
   */

  @VTID(94)
  RTExcelObj.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Reflection"
   * </p>
   * @return  Returns a value of type RTExcelObj.ReflectionFormat
   */

  @VTID(95)
  RTExcelObj.ReflectionFormat reflection();


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(96)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(97)
  void title(
    java.lang.String rhs);


  // Properties:
}

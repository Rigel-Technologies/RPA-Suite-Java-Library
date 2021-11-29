package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ChartFormat extends Com4jObject {
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
   * Getter method for the COM property "Fill"
   * </p>
   */

  @DISPID(1663)
  @PropGet
  RTExcelObj.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   */

  @DISPID(2663)
  @PropGet
  RTExcelObj.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   */

  @DISPID(817)
  @PropGet
  RTExcelObj.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   */

  @DISPID(1631)
  @PropGet
  RTExcelObj.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   */

  @DISPID(103)
  @PropGet
  RTExcelObj.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   */

  @DISPID(2662)
  @PropGet
  RTExcelObj.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   */

  @DISPID(2659)
  @PropGet
  RTExcelObj.TextFrame2 textFrame2();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   */

  @DISPID(1703)
  @PropGet
  RTExcelObj.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   */

  @DISPID(1691)
  @PropGet
  RTExcelObj.Adjustments adjustments();


  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   */

  @DISPID(1693)
  @PropGet
  RTExcelObj.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoAutoShapeType parameter.
   */

  @DISPID(1693)
  @PropPut
  void autoShapeType(
    RTExcelObj.MsoAutoShapeType rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{000244B2-0001-0000-C000-000000000046}")
public interface IChartFormat extends Com4jObject {
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
   * Getter method for the COM property "Fill"
   * </p>
   * @return  Returns a value of type RTExcelObj.FillFormat
   */

  @VTID(10)
  RTExcelObj.FillFormat fill();


  /**
   * <p>
   * Getter method for the COM property "Glow"
   * </p>
   * @return  Returns a value of type RTExcelObj.GlowFormat
   */

  @VTID(11)
  RTExcelObj.GlowFormat glow();


  /**
   * <p>
   * Getter method for the COM property "Line"
   * </p>
   * @return  Returns a value of type RTExcelObj.LineFormat
   */

  @VTID(12)
  RTExcelObj.LineFormat line();


  /**
   * <p>
   * Getter method for the COM property "PictureFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.PictureFormat
   */

  @VTID(13)
  RTExcelObj.PictureFormat pictureFormat();


  /**
   * <p>
   * Getter method for the COM property "Shadow"
   * </p>
   * @return  Returns a value of type RTExcelObj.ShadowFormat
   */

  @VTID(14)
  RTExcelObj.ShadowFormat shadow();


  /**
   * <p>
   * Getter method for the COM property "SoftEdge"
   * </p>
   * @return  Returns a value of type RTExcelObj.SoftEdgeFormat
   */

  @VTID(15)
  RTExcelObj.SoftEdgeFormat softEdge();


  /**
   * <p>
   * Getter method for the COM property "TextFrame2"
   * </p>
   * @return  Returns a value of type RTExcelObj.TextFrame2
   */

  @VTID(16)
  RTExcelObj.TextFrame2 textFrame2();


  /**
   * <p>
   * Getter method for the COM property "ThreeD"
   * </p>
   * @return  Returns a value of type RTExcelObj.ThreeDFormat
   */

  @VTID(17)
  RTExcelObj.ThreeDFormat threeD();


  /**
   * <p>
   * Getter method for the COM property "Adjustments"
   * </p>
   * @return  Returns a value of type RTExcelObj.Adjustments
   */

  @VTID(18)
  RTExcelObj.Adjustments adjustments();


  @VTID(18)
  @ReturnValue(defaultPropertyThrough={RTExcelObj.Adjustments.class})
  float adjustments(
    int index);

  /**
   * <p>
   * Getter method for the COM property "AutoShapeType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoAutoShapeType
   */

  @VTID(19)
  RTExcelObj.MsoAutoShapeType autoShapeType();


  /**
   * <p>
   * Setter method for the COM property "AutoShapeType"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoAutoShapeType parameter.
   */

  @VTID(20)
  void autoShapeType(
    RTExcelObj.MsoAutoShapeType rhs);


  // Properties:
}

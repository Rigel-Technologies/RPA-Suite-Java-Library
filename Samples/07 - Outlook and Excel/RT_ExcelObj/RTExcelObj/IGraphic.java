package RTExcelObj  ;

import com4j.*;

@IID("{00024459-0001-0000-C000-000000000046}")
public interface IGraphic extends Com4jObject {
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
   * Getter method for the COM property "Brightness"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(10)
  float brightness();


  /**
   * <p>
   * Setter method for the COM property "Brightness"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(11)
  void brightness(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "ColorType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoPictureColorType
   */

  @VTID(12)
  RTExcelObj.MsoPictureColorType colorType();


  /**
   * <p>
   * Setter method for the COM property "ColorType"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoPictureColorType parameter.
   */

  @VTID(13)
  void colorType(
    RTExcelObj.MsoPictureColorType rhs);


  /**
   * <p>
   * Getter method for the COM property "Contrast"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(14)
  float contrast();


  /**
   * <p>
   * Setter method for the COM property "Contrast"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(15)
  void contrast(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropBottom"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(16)
  float cropBottom();


  /**
   * <p>
   * Setter method for the COM property "CropBottom"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(17)
  void cropBottom(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropLeft"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(18)
  float cropLeft();


  /**
   * <p>
   * Setter method for the COM property "CropLeft"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(19)
  void cropLeft(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropRight"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(20)
  float cropRight();


  /**
   * <p>
   * Setter method for the COM property "CropRight"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(21)
  void cropRight(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropTop"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(22)
  float cropTop();


  /**
   * <p>
   * Setter method for the COM property "CropTop"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(23)
  void cropTop(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Filename"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String filename();


  /**
   * <p>
   * Setter method for the COM property "Filename"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void filename(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(26)
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(27)
  void height(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(28)
  RTExcelObj.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(29)
  void lockAspectRatio(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(30)
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @VTID(31)
  void width(
    float rhs);


  // Properties:
}

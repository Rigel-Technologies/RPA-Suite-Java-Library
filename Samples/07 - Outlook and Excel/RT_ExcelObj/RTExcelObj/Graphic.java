package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Graphic extends Com4jObject {
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
   * Getter method for the COM property "Brightness"
   * </p>
   */

  @DISPID(2194)
  @PropGet
  float brightness();


  /**
   * <p>
   * Setter method for the COM property "Brightness"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(2194)
  @PropPut
  void brightness(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "ColorType"
   * </p>
   */

  @DISPID(2195)
  @PropGet
  RTExcelObj.MsoPictureColorType colorType();


  /**
   * <p>
   * Setter method for the COM property "ColorType"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoPictureColorType parameter.
   */

  @DISPID(2195)
  @PropPut
  void colorType(
    RTExcelObj.MsoPictureColorType rhs);


  /**
   * <p>
   * Getter method for the COM property "Contrast"
   * </p>
   */

  @DISPID(2196)
  @PropGet
  float contrast();


  /**
   * <p>
   * Setter method for the COM property "Contrast"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(2196)
  @PropPut
  void contrast(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropBottom"
   * </p>
   */

  @DISPID(2197)
  @PropGet
  float cropBottom();


  /**
   * <p>
   * Setter method for the COM property "CropBottom"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(2197)
  @PropPut
  void cropBottom(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropLeft"
   * </p>
   */

  @DISPID(2198)
  @PropGet
  float cropLeft();


  /**
   * <p>
   * Setter method for the COM property "CropLeft"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(2198)
  @PropPut
  void cropLeft(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropRight"
   * </p>
   */

  @DISPID(2199)
  @PropGet
  float cropRight();


  /**
   * <p>
   * Setter method for the COM property "CropRight"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(2199)
  @PropPut
  void cropRight(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "CropTop"
   * </p>
   */

  @DISPID(2200)
  @PropGet
  float cropTop();


  /**
   * <p>
   * Setter method for the COM property "CropTop"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(2200)
  @PropPut
  void cropTop(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "Filename"
   * </p>
   */

  @DISPID(1415)
  @PropGet
  java.lang.String filename();


  /**
   * <p>
   * Setter method for the COM property "Filename"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1415)
  @PropPut
  void filename(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   */

  @DISPID(123)
  @PropGet
  float height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(123)
  @PropPut
  void height(
    float rhs);


  /**
   * <p>
   * Getter method for the COM property "LockAspectRatio"
   * </p>
   */

  @DISPID(1700)
  @PropGet
  RTExcelObj.MsoTriState lockAspectRatio();


  /**
   * <p>
   * Setter method for the COM property "LockAspectRatio"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @DISPID(1700)
  @PropPut
  void lockAspectRatio(
    RTExcelObj.MsoTriState rhs);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   */

  @DISPID(122)
  @PropGet
  float width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param rhs Mandatory float parameter.
   */

  @DISPID(122)
  @PropPut
  void width(
    float rhs);


  // Properties:
}

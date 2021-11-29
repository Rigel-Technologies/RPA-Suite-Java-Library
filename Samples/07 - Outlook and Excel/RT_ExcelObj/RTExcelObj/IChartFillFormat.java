package RTExcelObj  ;

import com4j.*;

@IID("{00024435-0001-0000-C000-000000000046}")
public interface IChartFillFormat extends Com4jObject {
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
   * @param style Mandatory RTExcelObj.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @VTID(10)
  void oneColorGradient(
    RTExcelObj.MsoGradientStyle style,
    int variant,
    float degree);


  /**
   * @param style Mandatory RTExcelObj.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @VTID(11)
  void twoColorGradient(
    RTExcelObj.MsoGradientStyle style,
    int variant);


  /**
   * @param presetTexture Mandatory RTExcelObj.MsoPresetTexture parameter.
   */

  @VTID(12)
  void presetTextured(
    RTExcelObj.MsoPresetTexture presetTexture);


  /**
   */

  @VTID(13)
  void solid();


  /**
   * @param pattern Mandatory RTExcelObj.MsoPatternType parameter.
   */

  @VTID(14)
  void patterned(
    RTExcelObj.MsoPatternType pattern);


  /**
   * @param pictureFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param pictureStackUnit Optional parameter. Default value is com4j.Variant.getMissing()
   * @param picturePlacement Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(15)
  void userPicture(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object pictureStackUnit,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object picturePlacement);


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @VTID(16)
  void userTextured(
    java.lang.String textureFile);


  /**
   * @param style Mandatory RTExcelObj.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory RTExcelObj.MsoPresetGradientType parameter.
   */

  @VTID(17)
  void presetGradient(
    RTExcelObj.MsoGradientStyle style,
    int variant,
    RTExcelObj.MsoPresetGradientType presetGradientType);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type RTExcelObj.ChartColorFormat
   */

  @VTID(18)
  RTExcelObj.ChartColorFormat backColor();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type RTExcelObj.ChartColorFormat
   */

  @VTID(19)
  RTExcelObj.ChartColorFormat foreColor();


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoGradientColorType
   */

  @VTID(20)
  RTExcelObj.MsoGradientColorType gradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   * @return  Returns a value of type float
   */

  @VTID(21)
  float gradientDegree();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoGradientStyle
   */

  @VTID(22)
  RTExcelObj.MsoGradientStyle gradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(23)
  int gradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoPatternType
   */

  @VTID(24)
  RTExcelObj.MsoPatternType pattern();


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoPresetGradientType
   */

  @VTID(25)
  RTExcelObj.MsoPresetGradientType presetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoPresetTexture
   */

  @VTID(26)
  RTExcelObj.MsoPresetTexture presetTexture();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(27)
  java.lang.String textureName();


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTextureType
   */

  @VTID(28)
  RTExcelObj.MsoTextureType textureType();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoFillType
   */

  @VTID(29)
  RTExcelObj.MsoFillType type();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type RTExcelObj.MsoTriState
   */

  @VTID(30)
  RTExcelObj.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory RTExcelObj.MsoTriState parameter.
   */

  @VTID(31)
  void visible(
    RTExcelObj.MsoTriState rhs);


  // Properties:
}

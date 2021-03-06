package RT_MSOutlook  ;

import com4j.*;

@IID("{000C0314-0000-0000-C000-000000000046}")
public interface FillFormat extends RT_MSOutlook._IMsoDispObj {
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
  void background();


  /**
   * @param style Mandatory RT_MSOutlook.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param degree Mandatory float parameter.
   */

  @DISPID(11) //= 0xb. The runtime will prefer the VTID if present
  @VTID(11)
  void oneColorGradient(
    RT_MSOutlook.MsoGradientStyle style,
    int variant,
    float degree);


  /**
   * @param pattern Mandatory RT_MSOutlook.MsoPatternType parameter.
   */

  @DISPID(12) //= 0xc. The runtime will prefer the VTID if present
  @VTID(12)
  void patterned(
    RT_MSOutlook.MsoPatternType pattern);


  /**
   * @param style Mandatory RT_MSOutlook.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   * @param presetGradientType Mandatory RT_MSOutlook.MsoPresetGradientType parameter.
   */

  @DISPID(13) //= 0xd. The runtime will prefer the VTID if present
  @VTID(13)
  void presetGradient(
    RT_MSOutlook.MsoGradientStyle style,
    int variant,
    RT_MSOutlook.MsoPresetGradientType presetGradientType);


  /**
   * @param presetTexture Mandatory RT_MSOutlook.MsoPresetTexture parameter.
   */

  @DISPID(14) //= 0xe. The runtime will prefer the VTID if present
  @VTID(14)
  void presetTextured(
    RT_MSOutlook.MsoPresetTexture presetTexture);


  /**
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(15)
  void solid();


  /**
   * @param style Mandatory RT_MSOutlook.MsoGradientStyle parameter.
   * @param variant Mandatory int parameter.
   */

  @DISPID(16) //= 0x10. The runtime will prefer the VTID if present
  @VTID(16)
  void twoColorGradient(
    RT_MSOutlook.MsoGradientStyle style,
    int variant);


  /**
   * @param pictureFile Mandatory java.lang.String parameter.
   */

  @DISPID(17) //= 0x11. The runtime will prefer the VTID if present
  @VTID(17)
  void userPicture(
    java.lang.String pictureFile);


  /**
   * @param textureFile Mandatory java.lang.String parameter.
   */

  @DISPID(18) //= 0x12. The runtime will prefer the VTID if present
  @VTID(18)
  void userTextured(
    java.lang.String textureFile);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.ColorFormat
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook.ColorFormat backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory RT_MSOutlook.ColorFormat parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(20)
  void backColor(
    RT_MSOutlook.ColorFormat backColor);


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.ColorFormat
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook.ColorFormat foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory RT_MSOutlook.ColorFormat parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  void foreColor(
    RT_MSOutlook.ColorFormat foreColor);


  /**
   * <p>
   * Getter method for the COM property "GradientColorType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoGradientColorType
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.MsoGradientColorType gradientColorType();


  /**
   * <p>
   * Getter method for the COM property "GradientDegree"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(24)
  float gradientDegree();


  /**
   * <p>
   * Getter method for the COM property "GradientStyle"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoGradientStyle
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook.MsoGradientStyle gradientStyle();


  /**
   * <p>
   * Getter method for the COM property "GradientVariant"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(26)
  int gradientVariant();


  /**
   * <p>
   * Getter method for the COM property "Pattern"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoPatternType
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(27)
  RT_MSOutlook.MsoPatternType pattern();


  /**
   * <p>
   * Getter method for the COM property "PresetGradientType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoPresetGradientType
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(28)
  RT_MSOutlook.MsoPresetGradientType presetGradientType();


  /**
   * <p>
   * Getter method for the COM property "PresetTexture"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoPresetTexture
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(29)
  RT_MSOutlook.MsoPresetTexture presetTexture();


  /**
   * <p>
   * Getter method for the COM property "TextureName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String textureName();


  /**
   * <p>
   * Getter method for the COM property "TextureType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoTextureType
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(31)
  RT_MSOutlook.MsoTextureType textureType();


  /**
   * <p>
   * Getter method for the COM property "Transparency"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(32)
  float transparency();


  /**
   * <p>
   * Setter method for the COM property "Transparency"
   * </p>
   * @param transparency Mandatory float parameter.
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(33)
  void transparency(
    float transparency);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoFillType
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(34)
  RT_MSOutlook.MsoFillType type();


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoTriState
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(35)
  RT_MSOutlook.MsoTriState visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param visible Mandatory RT_MSOutlook.MsoTriState parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(36)
  void visible(
    RT_MSOutlook.MsoTriState visible);


  /**
   * <p>
   * Getter method for the COM property "GradientStops"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.GradientStops
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(37)
  RT_MSOutlook.GradientStops gradientStops();


  @VTID(37)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook.GradientStops.class})
  RT_MSOutlook.GradientStop gradientStops(
    int index);

  /**
   * <p>
   * Getter method for the COM property "TextureOffsetX"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(38)
  float textureOffsetX();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetX"
   * </p>
   * @param textureOffsetX Mandatory float parameter.
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(39)
  void textureOffsetX(
    float textureOffsetX);


  /**
   * <p>
   * Getter method for the COM property "TextureOffsetY"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(40)
  float textureOffsetY();


  /**
   * <p>
   * Setter method for the COM property "TextureOffsetY"
   * </p>
   * @param textureOffsetY Mandatory float parameter.
   */

  @DISPID(116) //= 0x74. The runtime will prefer the VTID if present
  @VTID(41)
  void textureOffsetY(
    float textureOffsetY);


  /**
   * <p>
   * Getter method for the COM property "TextureAlignment"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoTextureAlignment
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(42)
  RT_MSOutlook.MsoTextureAlignment textureAlignment();


  /**
   * <p>
   * Setter method for the COM property "TextureAlignment"
   * </p>
   * @param textureAlignment Mandatory RT_MSOutlook.MsoTextureAlignment parameter.
   */

  @DISPID(117) //= 0x75. The runtime will prefer the VTID if present
  @VTID(43)
  void textureAlignment(
    RT_MSOutlook.MsoTextureAlignment textureAlignment);


  /**
   * <p>
   * Getter method for the COM property "TextureHorizontalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(44)
  float textureHorizontalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureHorizontalScale"
   * </p>
   * @param horizontalScale Mandatory float parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(45)
  void textureHorizontalScale(
    float horizontalScale);


  /**
   * <p>
   * Getter method for the COM property "TextureVerticalScale"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(46)
  float textureVerticalScale();


  /**
   * <p>
   * Setter method for the COM property "TextureVerticalScale"
   * </p>
   * @param verticalScale Mandatory float parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(47)
  void textureVerticalScale(
    float verticalScale);


  /**
   * <p>
   * Getter method for the COM property "TextureTile"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoTriState
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(48)
  RT_MSOutlook.MsoTriState textureTile();


  /**
   * <p>
   * Setter method for the COM property "TextureTile"
   * </p>
   * @param textureTile Mandatory RT_MSOutlook.MsoTriState parameter.
   */

  @DISPID(120) //= 0x78. The runtime will prefer the VTID if present
  @VTID(49)
  void textureTile(
    RT_MSOutlook.MsoTriState textureTile);


  /**
   * <p>
   * Getter method for the COM property "RotateWithObject"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoTriState
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(50)
  RT_MSOutlook.MsoTriState rotateWithObject();


  /**
   * <p>
   * Setter method for the COM property "RotateWithObject"
   * </p>
   * @param rotateWithObject Mandatory RT_MSOutlook.MsoTriState parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(51)
  void rotateWithObject(
    RT_MSOutlook.MsoTriState rotateWithObject);


  /**
   * <p>
   * Getter method for the COM property "PictureEffects"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.PictureEffects
   */

  @DISPID(122) //= 0x7a. The runtime will prefer the VTID if present
  @VTID(52)
  RT_MSOutlook.PictureEffects pictureEffects();


  @VTID(52)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook.PictureEffects.class})
  RT_MSOutlook.PictureEffect pictureEffects(
    int index);

  /**
   * <p>
   * Getter method for the COM property "GradientAngle"
   * </p>
   * @return  Returns a value of type float
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(53)
  float gradientAngle();


  /**
   * <p>
   * Setter method for the COM property "GradientAngle"
   * </p>
   * @param gradientAngle Mandatory float parameter.
   */

  @DISPID(123) //= 0x7b. The runtime will prefer the VTID if present
  @VTID(54)
  void gradientAngle(
    float gradientAngle);


  // Properties:
}

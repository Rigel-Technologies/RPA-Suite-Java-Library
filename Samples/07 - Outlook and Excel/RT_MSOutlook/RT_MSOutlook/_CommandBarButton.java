package RT_MSOutlook  ;

import com4j.*;

@IID("{000C030E-0000-0000-C000-000000000046}")
public interface _CommandBarButton extends RT_MSOutlook.CommandBarControl {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BuiltInFace"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(83)
  boolean builtInFace();


  /**
   * <p>
   * Setter method for the COM property "BuiltInFace"
   * </p>
   * @param pvarfBuiltIn Mandatory boolean parameter.
   */

  @DISPID(1610940416) //= 0x60050000. The runtime will prefer the VTID if present
  @VTID(84)
  void builtInFace(
    boolean pvarfBuiltIn);


  /**
   */

  @DISPID(1610940418) //= 0x60050002. The runtime will prefer the VTID if present
  @VTID(85)
  void copyFace();


  /**
   * <p>
   * Getter method for the COM property "FaceId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(86)
  int faceId();


  /**
   * <p>
   * Setter method for the COM property "FaceId"
   * </p>
   * @param pid Mandatory int parameter.
   */

  @DISPID(1610940419) //= 0x60050003. The runtime will prefer the VTID if present
  @VTID(87)
  void faceId(
    int pid);


  /**
   */

  @DISPID(1610940421) //= 0x60050005. The runtime will prefer the VTID if present
  @VTID(88)
  void pasteFace();


  /**
   * <p>
   * Getter method for the COM property "ShortcutText"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(89)
  java.lang.String shortcutText();


  /**
   * <p>
   * Setter method for the COM property "ShortcutText"
   * </p>
   * @param pbstrText Mandatory java.lang.String parameter.
   */

  @DISPID(1610940422) //= 0x60050006. The runtime will prefer the VTID if present
  @VTID(90)
  void shortcutText(
    java.lang.String pbstrText);


  /**
   * <p>
   * Getter method for the COM property "State"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoButtonState
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(91)
  RT_MSOutlook.MsoButtonState state();


  /**
   * <p>
   * Setter method for the COM property "State"
   * </p>
   * @param pstate Mandatory RT_MSOutlook.MsoButtonState parameter.
   */

  @DISPID(1610940424) //= 0x60050008. The runtime will prefer the VTID if present
  @VTID(92)
  void state(
    RT_MSOutlook.MsoButtonState pstate);


  /**
   * <p>
   * Getter method for the COM property "Style"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoButtonStyle
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(93)
  RT_MSOutlook.MsoButtonStyle style();


  /**
   * <p>
   * Setter method for the COM property "Style"
   * </p>
   * @param pstyle Mandatory RT_MSOutlook.MsoButtonStyle parameter.
   */

  @DISPID(1610940426) //= 0x6005000a. The runtime will prefer the VTID if present
  @VTID(94)
  void style(
    RT_MSOutlook.MsoButtonStyle pstyle);


  /**
   * <p>
   * Getter method for the COM property "HyperlinkType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoCommandBarButtonHyperlinkType
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(95)
  RT_MSOutlook.MsoCommandBarButtonHyperlinkType hyperlinkType();


  /**
   * <p>
   * Setter method for the COM property "HyperlinkType"
   * </p>
   * @param phlType Mandatory RT_MSOutlook.MsoCommandBarButtonHyperlinkType parameter.
   */

  @DISPID(1610940428) //= 0x6005000c. The runtime will prefer the VTID if present
  @VTID(96)
  void hyperlinkType(
    RT_MSOutlook.MsoCommandBarButtonHyperlinkType phlType);


  /**
   * <p>
   * Getter method for the COM property "Picture"
   * </p>
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(97)
  Holder<com4j.stdole.IPictureDisp> picture();


  /**
   * <p>
   * Setter method for the COM property "Picture"
   * </p>
   * @param ppdispPicture Mandatory Holder<com4j.stdole.IPictureDisp> parameter.
   */

  @DISPID(1610940430) //= 0x6005000e. The runtime will prefer the VTID if present
  @VTID(98)
  void picture(
    Holder<com4j.stdole.IPictureDisp> ppdispPicture);


  /**
   * <p>
   * Getter method for the COM property "Mask"
   * </p>
   * @return  Returns a value of type Holder<com4j.stdole.IPictureDisp>
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(99)
  Holder<com4j.stdole.IPictureDisp> mask();


  /**
   * <p>
   * Setter method for the COM property "Mask"
   * </p>
   * @param ppipictdispMask Mandatory Holder<com4j.stdole.IPictureDisp> parameter.
   */

  @DISPID(1610940432) //= 0x60050010. The runtime will prefer the VTID if present
  @VTID(100)
  void mask(
    Holder<com4j.stdole.IPictureDisp> ppipictdispMask);


  /**
   * <p>
   * Getter method for the COM property "InstanceIdPtr"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(1610940434) //= 0x60050012. The runtime will prefer the VTID if present
  @VTID(101)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object instanceIdPtr();


  // Properties:
}

package RT_MSOutlook  ;

import com4j.*;

@IID("{000C0324-0000-0000-C000-000000000046}")
public interface Balloon extends RT_MSOutlook._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809344) //= 0x60030000. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Checkboxes"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809345) //= 0x60030001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject checkboxes();


  /**
   * <p>
   * Getter method for the COM property "Labels"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(1610809346) //= 0x60030002. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject labels();


  /**
   * <p>
   * Setter method for the COM property "BalloonType"
   * </p>
   * @param pbty Mandatory RT_MSOutlook.MsoBalloonType parameter.
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(12)
  void balloonType(
    RT_MSOutlook.MsoBalloonType pbty);


  /**
   * <p>
   * Getter method for the COM property "BalloonType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoBalloonType
   */

  @DISPID(1610809347) //= 0x60030003. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.MsoBalloonType balloonType();


  /**
   * <p>
   * Setter method for the COM property "Icon"
   * </p>
   * @param picn Mandatory RT_MSOutlook.MsoIconType parameter.
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(14)
  void icon(
    RT_MSOutlook.MsoIconType picn);


  /**
   * <p>
   * Getter method for the COM property "Icon"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoIconType
   */

  @DISPID(1610809349) //= 0x60030005. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.MsoIconType icon();


  /**
   * <p>
   * Setter method for the COM property "Heading"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(16)
  void heading(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Heading"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809351) //= 0x60030007. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String heading();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(18)
  void text(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809353) //= 0x60030009. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Mode"
   * </p>
   * @param pmd Mandatory RT_MSOutlook.MsoModeType parameter.
   */

  @DISPID(1610809355) //= 0x6003000b. The runtime will prefer the VTID if present
  @VTID(20)
  void mode(
    RT_MSOutlook.MsoModeType pmd);


  /**
   * <p>
   * Getter method for the COM property "Mode"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoModeType
   */

  @DISPID(1610809355) //= 0x6003000b. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook.MsoModeType mode();


  /**
   * <p>
   * Setter method for the COM property "Animation"
   * </p>
   * @param pfca Mandatory RT_MSOutlook.MsoAnimationType parameter.
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(22)
  void animation(
    RT_MSOutlook.MsoAnimationType pfca);


  /**
   * <p>
   * Getter method for the COM property "Animation"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoAnimationType
   */

  @DISPID(1610809357) //= 0x6003000d. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.MsoAnimationType animation();


  /**
   * <p>
   * Setter method for the COM property "Button"
   * </p>
   * @param psbs Mandatory RT_MSOutlook.MsoButtonSetType parameter.
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(24)
  void button(
    RT_MSOutlook.MsoButtonSetType psbs);


  /**
   * <p>
   * Getter method for the COM property "Button"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoButtonSetType
   */

  @DISPID(1610809359) //= 0x6003000f. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook.MsoButtonSetType button();


  /**
   * <p>
   * Setter method for the COM property "Callback"
   * </p>
   * @param pbstr Mandatory java.lang.String parameter.
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(26)
  void callback(
    java.lang.String pbstr);


  /**
   * <p>
   * Getter method for the COM property "Callback"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809361) //= 0x60030011. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String callback();


  /**
   * <p>
   * Setter method for the COM property "Private"
   * </p>
   * @param plPrivate Mandatory int parameter.
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(28)
  void _private(
    int plPrivate);


  /**
   * <p>
   * Getter method for the COM property "Private"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(1610809363) //= 0x60030013. The runtime will prefer the VTID if present
  @VTID(29)
  int _private();


  /**
   * @param left Mandatory int parameter.
   * @param top Mandatory int parameter.
   * @param right Mandatory int parameter.
   * @param bottom Mandatory int parameter.
   */

  @DISPID(1610809365) //= 0x60030015. The runtime will prefer the VTID if present
  @VTID(30)
  void setAvoidRectangle(
    int left,
    int top,
    int right,
    int bottom);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(1610809366) //= 0x60030016. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String name();


  /**
   * @return  Returns a value of type RT_MSOutlook.MsoBalloonButtonType
   */

  @DISPID(1610809367) //= 0x60030017. The runtime will prefer the VTID if present
  @VTID(32)
  RT_MSOutlook.MsoBalloonButtonType show();


  /**
   */

  @DISPID(1610809368) //= 0x60030018. The runtime will prefer the VTID if present
  @VTID(33)
  void close();


  // Properties:
}
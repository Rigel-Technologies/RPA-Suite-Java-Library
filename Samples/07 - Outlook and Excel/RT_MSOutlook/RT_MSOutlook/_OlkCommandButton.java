package RT_MSOutlook  ;

import com4j.*;
import com4j.stdole.IFontDisp;
import com4j.stdole.IPictureDisp;

@IID("{000672DB-0000-0000-C000-000000000046}")
public interface _OlkCommandButton extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Accelerator"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-543) //= 0xfffffde1. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String accelerator();


  /**
   * <p>
   * Setter method for the COM property "Accelerator"
   * </p>
   * @param acceleratorChar Mandatory java.lang.String parameter.
   */

  @DISPID(-543) //= 0xfffffde1. The runtime will prefer the VTID if present
  @VTID(8)
  void accelerator(
    java.lang.String acceleratorChar);


  /**
   * <p>
   * Getter method for the COM property "AutoSize"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-500) //= 0xfffffe0c. The runtime will prefer the VTID if present
  @VTID(9)
  boolean autoSize();


  /**
   * <p>
   * Setter method for the COM property "AutoSize"
   * </p>
   * @param autoSize Mandatory boolean parameter.
   */

  @DISPID(-500) //= 0xfffffe0c. The runtime will prefer the VTID if present
  @VTID(10)
  void autoSize(
    boolean autoSize);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-518) //= 0xfffffdfa. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param caption Mandatory java.lang.String parameter.
   */

  @DISPID(-518) //= 0xfffffdfa. The runtime will prefer the VTID if present
  @VTID(12)
  void caption(
    java.lang.String caption);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(13)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(14)
  void enabled(
    boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type IFontDisp
   */

  @DISPID(-512) //= 0xfffffe00. The runtime will prefer the VTID if present
  @VTID(15)
  IFontDisp font();


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(16)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(17)
  void mouseIcon(
    IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(18)
  RT_MSOutlook.OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory RT_MSOutlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(19)
  void mousePointer(
    RT_MSOutlook.OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "WordWrap"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-536) //= 0xfffffde8. The runtime will prefer the VTID if present
  @VTID(20)
  boolean wordWrap();


  /**
   * <p>
   * Setter method for the COM property "WordWrap"
   * </p>
   * @param wordWrap Mandatory boolean parameter.
   */

  @DISPID(-536) //= 0xfffffde8. The runtime will prefer the VTID if present
  @VTID(21)
  void wordWrap(
    boolean wordWrap);


  /**
   * <p>
   * Getter method for the COM property "TextAlign"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlTextAlign
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook.OlTextAlign textAlign();


  /**
   * <p>
   * Setter method for the COM property "TextAlign"
   * </p>
   * @param textAlign Mandatory RT_MSOutlook.OlTextAlign parameter.
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(23)
  void textAlign(
    RT_MSOutlook.OlTextAlign textAlign);


  /**
   * <p>
   * Getter method for the COM property "Picture"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-523) //= 0xfffffdf5. The runtime will prefer the VTID if present
  @VTID(24)
  IPictureDisp picture();


  /**
   * <p>
   * Setter method for the COM property "Picture"
   * </p>
   * @param picture Mandatory IPictureDisp parameter.
   */

  @DISPID(-523) //= 0xfffffdf5. The runtime will prefer the VTID if present
  @VTID(25)
  void picture(
    IPictureDisp picture);


  /**
   * <p>
   * Getter method for the COM property "PictureAlignment"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlPictureAlignment
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(26)
  RT_MSOutlook.OlPictureAlignment pictureAlignment();


  /**
   * <p>
   * Setter method for the COM property "PictureAlignment"
   * </p>
   * @param pictureAlignment Mandatory RT_MSOutlook.OlPictureAlignment parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(27)
  void pictureAlignment(
    RT_MSOutlook.OlPictureAlignment pictureAlignment);


  /**
   * <p>
   * Getter method for the COM property "DisplayDropArrow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64544) //= 0xfc20. The runtime will prefer the VTID if present
  @VTID(28)
  boolean displayDropArrow();


  /**
   * <p>
   * Setter method for the COM property "DisplayDropArrow"
   * </p>
   * @param displayDropArrow Mandatory boolean parameter.
   */

  @DISPID(64544) //= 0xfc20. The runtime will prefer the VTID if present
  @VTID(29)
  void displayDropArrow(
    boolean displayDropArrow);


  // Properties:
}

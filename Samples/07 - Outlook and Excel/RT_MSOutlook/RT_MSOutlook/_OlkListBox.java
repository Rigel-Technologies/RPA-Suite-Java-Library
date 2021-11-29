package RT_MSOutlook  ;

import com4j.*;
import com4j.stdole.IFontDisp;
import com4j.stdole.IPictureDisp;

@IID("{000672DF-0000-0000-C000-000000000046}")
public interface _OlkListBox extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "BorderStyle"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlBorderStyle
   */

  @DISPID(-504) //= 0xfffffe08. The runtime will prefer the VTID if present
  @VTID(7)
  RT_MSOutlook.OlBorderStyle borderStyle();


  /**
   * <p>
   * Setter method for the COM property "BorderStyle"
   * </p>
   * @param borderStyle Mandatory RT_MSOutlook.OlBorderStyle parameter.
   */

  @DISPID(-504) //= 0xfffffe08. The runtime will prefer the VTID if present
  @VTID(8)
  void borderStyle(
    RT_MSOutlook.OlBorderStyle borderStyle);


  /**
   * <p>
   * Getter method for the COM property "BackColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(9)
  int backColor();


  /**
   * <p>
   * Setter method for the COM property "BackColor"
   * </p>
   * @param backColor Mandatory int parameter.
   */

  @DISPID(-501) //= 0xfffffe0b. The runtime will prefer the VTID if present
  @VTID(10)
  void backColor(
    int backColor);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(11)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(-514) //= 0xfffffdfe. The runtime will prefer the VTID if present
  @VTID(12)
  void enabled(
    boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type IFontDisp
   */

  @DISPID(-512) //= 0xfffffe00. The runtime will prefer the VTID if present
  @VTID(13)
  IFontDisp font();


  /**
   * <p>
   * Getter method for the COM property "ForeColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(14)
  int foreColor();


  /**
   * <p>
   * Setter method for the COM property "ForeColor"
   * </p>
   * @param foreColor Mandatory int parameter.
   */

  @DISPID(-513) //= 0xfffffdff. The runtime will prefer the VTID if present
  @VTID(15)
  void foreColor(
    int foreColor);


  /**
   * <p>
   * Getter method for the COM property "Locked"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(16)
  boolean locked();


  /**
   * <p>
   * Setter method for the COM property "Locked"
   * </p>
   * @param locked Mandatory boolean parameter.
   */

  @DISPID(10) //= 0xa. The runtime will prefer the VTID if present
  @VTID(17)
  void locked(
    boolean locked);


  /**
   * <p>
   * Getter method for the COM property "MatchEntry"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlMatchEntry
   */

  @DISPID(504) //= 0x1f8. The runtime will prefer the VTID if present
  @VTID(18)
  RT_MSOutlook.OlMatchEntry matchEntry();


  /**
   * <p>
   * Setter method for the COM property "MatchEntry"
   * </p>
   * @param matchEntry Mandatory RT_MSOutlook.OlMatchEntry parameter.
   */

  @DISPID(504) //= 0x1f8. The runtime will prefer the VTID if present
  @VTID(19)
  void matchEntry(
    RT_MSOutlook.OlMatchEntry matchEntry);


  /**
   * <p>
   * Getter method for the COM property "MouseIcon"
   * </p>
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(20)
  IPictureDisp mouseIcon();


  /**
   * <p>
   * Setter method for the COM property "MouseIcon"
   * </p>
   * @param mouseIcon Mandatory IPictureDisp parameter.
   */

  @DISPID(-522) //= 0xfffffdf6. The runtime will prefer the VTID if present
  @VTID(21)
  void mouseIcon(
    IPictureDisp mouseIcon);


  /**
   * <p>
   * Getter method for the COM property "MousePointer"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlMousePointer
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook.OlMousePointer mousePointer();


  /**
   * <p>
   * Setter method for the COM property "MousePointer"
   * </p>
   * @param mousePointer Mandatory RT_MSOutlook.OlMousePointer parameter.
   */

  @DISPID(-521) //= 0xfffffdf7. The runtime will prefer the VTID if present
  @VTID(23)
  void mousePointer(
    RT_MSOutlook.OlMousePointer mousePointer);


  /**
   * <p>
   * Getter method for the COM property "MultiSelect"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlMultiSelect
   */

  @DISPID(-532) //= 0xfffffdec. The runtime will prefer the VTID if present
  @VTID(24)
  RT_MSOutlook.OlMultiSelect multiSelect();


  /**
   * <p>
   * Setter method for the COM property "MultiSelect"
   * </p>
   * @param multiSelect Mandatory RT_MSOutlook.OlMultiSelect parameter.
   */

  @DISPID(-532) //= 0xfffffdec. The runtime will prefer the VTID if present
  @VTID(25)
  void multiSelect(
    RT_MSOutlook.OlMultiSelect multiSelect);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-517) //= 0xfffffdfb. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param text Mandatory java.lang.String parameter.
   */

  @DISPID(-517) //= 0xfffffdfb. The runtime will prefer the VTID if present
  @VTID(27)
  void text(
    java.lang.String text);


  /**
   * <p>
   * Getter method for the COM property "TextAlign"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlTextAlign
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(28)
  RT_MSOutlook.OlTextAlign textAlign();


  /**
   * <p>
   * Setter method for the COM property "TextAlign"
   * </p>
   * @param textAlign Mandatory RT_MSOutlook.OlTextAlign parameter.
   */

  @DISPID(10004) //= 0x2714. The runtime will prefer the VTID if present
  @VTID(29)
  void textAlign(
    RT_MSOutlook.OlTextAlign textAlign);


  /**
   * <p>
   * Getter method for the COM property "TopIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(611) //= 0x263. The runtime will prefer the VTID if present
  @VTID(30)
  int topIndex();


  /**
   * <p>
   * Setter method for the COM property "TopIndex"
   * </p>
   * @param topIndex Mandatory int parameter.
   */

  @DISPID(611) //= 0x263. The runtime will prefer the VTID if present
  @VTID(31)
  void topIndex(
    int topIndex);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(32)
  @DefaultMethod
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(33)
  @DefaultMethod
  void value(
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "ListIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-526) //= 0xfffffdf2. The runtime will prefer the VTID if present
  @VTID(34)
  int listIndex();


  /**
   * <p>
   * Setter method for the COM property "ListIndex"
   * </p>
   * @param listIndex Mandatory int parameter.
   */

  @DISPID(-526) //= 0xfffffdf2. The runtime will prefer the VTID if present
  @VTID(35)
  void listIndex(
    int listIndex);


  /**
   * <p>
   * Getter method for the COM property "ListCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-531) //= 0xfffffded. The runtime will prefer the VTID if present
  @VTID(36)
  int listCount();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8457) //= 0x2109. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String getItem(
    int index);


  /**
   * @param index Mandatory int parameter.
   * @param item Mandatory java.lang.String parameter.
   */

  @DISPID(64478) //= 0xfbde. The runtime will prefer the VTID if present
  @VTID(38)
  void setItem(
    int index,
    java.lang.String item);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(64479) //= 0xfbdf. The runtime will prefer the VTID if present
  @VTID(39)
  boolean getSelected(
    int index);


  /**
   * @param index Mandatory int parameter.
   * @param selected Mandatory boolean parameter.
   */

  @DISPID(64480) //= 0xfbe0. The runtime will prefer the VTID if present
  @VTID(40)
  void setSelected(
    int index,
    boolean selected);


  /**
   */

  @DISPID(22) //= 0x16. The runtime will prefer the VTID if present
  @VTID(41)
  void copy();


  /**
   */

  @DISPID(-554) //= 0xfffffdd6. The runtime will prefer the VTID if present
  @VTID(42)
  void clear();


  /**
   * @param itemText Mandatory java.lang.String parameter.
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(-553) //= 0xfffffdd7. The runtime will prefer the VTID if present
  @VTID(43)
  void addItem(
    java.lang.String itemText,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(-555) //= 0xfffffdd5. The runtime will prefer the VTID if present
  @VTID(44)
  void removeItem(
    int index);


  // Properties:
}

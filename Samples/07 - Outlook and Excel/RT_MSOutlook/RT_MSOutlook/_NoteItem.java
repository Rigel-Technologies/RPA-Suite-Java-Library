package RT_MSOutlook  ;

import com4j.*;

@IID("{00063025-0000-0000-C000-000000000046}")
public interface _NoteItem extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Application
   */

  @DISPID(61440) //= 0xf000. The runtime will prefer the VTID if present
  @VTID(7)
  RT_MSOutlook._Application application();


  /**
   * <p>
   * Getter method for the COM property "Class"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlObjectClass
   */

  @DISPID(61450) //= 0xf00a. The runtime will prefer the VTID if present
  @VTID(8)
  RT_MSOutlook.OlObjectClass _class();


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._NameSpace
   */

  @DISPID(61451) //= 0xf00b. The runtime will prefer the VTID if present
  @VTID(9)
  RT_MSOutlook._NameSpace session();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61441) //= 0xf001. The runtime will prefer the VTID if present
  @VTID(10)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Body"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String body();


  /**
   * <p>
   * Setter method for the COM property "Body"
   * </p>
   * @param body Mandatory java.lang.String parameter.
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(12)
  void body(
    java.lang.String body);


  /**
   * <p>
   * Getter method for the COM property "Categories"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(36865) //= 0x9001. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String categories();


  /**
   * <p>
   * Setter method for the COM property "Categories"
   * </p>
   * @param categories Mandatory java.lang.String parameter.
   */

  @DISPID(36865) //= 0x9001. The runtime will prefer the VTID if present
  @VTID(14)
  void categories(
    java.lang.String categories);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlNoteColor
   */

  @DISPID(35584) //= 0x8b00. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.OlNoteColor color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param color Mandatory RT_MSOutlook.OlNoteColor parameter.
   */

  @DISPID(35584) //= 0x8b00. The runtime will prefer the VTID if present
  @VTID(16)
  void color(
    RT_MSOutlook.OlNoteColor color);


  /**
   * <p>
   * Getter method for the COM property "CreationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12295) //= 0x3007. The runtime will prefer the VTID if present
  @VTID(17)
  java.util.Date creationTime();


  /**
   * <p>
   * Getter method for the COM property "EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String entryID();


  /**
   * <p>
   * Getter method for the COM property "GetInspector"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Inspector
   */

  @DISPID(61502) //= 0xf03e. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook._Inspector getInspector();


  /**
   * <p>
   * Getter method for the COM property "Height"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(35587) //= 0x8b03. The runtime will prefer the VTID if present
  @VTID(20)
  int height();


  /**
   * <p>
   * Setter method for the COM property "Height"
   * </p>
   * @param height Mandatory int parameter.
   */

  @DISPID(35587) //= 0x8b03. The runtime will prefer the VTID if present
  @VTID(21)
  void height(
    int height);


  /**
   * <p>
   * Getter method for the COM property "LastModificationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12296) //= 0x3008. The runtime will prefer the VTID if present
  @VTID(22)
  java.util.Date lastModificationTime();


  /**
   * <p>
   * Getter method for the COM property "Left"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(35588) //= 0x8b04. The runtime will prefer the VTID if present
  @VTID(23)
  int left();


  /**
   * <p>
   * Setter method for the COM property "Left"
   * </p>
   * @param left Mandatory int parameter.
   */

  @DISPID(35588) //= 0x8b04. The runtime will prefer the VTID if present
  @VTID(24)
  void left(
    int left);


  /**
   * <p>
   * Getter method for the COM property "MessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String messageClass();


  /**
   * <p>
   * Setter method for the COM property "MessageClass"
   * </p>
   * @param messageClass Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(26)
  void messageClass(
    java.lang.String messageClass);


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61603) //= 0xf0a3. The runtime will prefer the VTID if present
  @VTID(27)
  boolean saved();


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3592) //= 0xe08. The runtime will prefer the VTID if present
  @VTID(28)
  int size();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(63392) //= 0xf7a0. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String subject();


  /**
   * <p>
   * Getter method for the COM property "Top"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(35589) //= 0x8b05. The runtime will prefer the VTID if present
  @VTID(30)
  int top();


  /**
   * <p>
   * Setter method for the COM property "Top"
   * </p>
   * @param top Mandatory int parameter.
   */

  @DISPID(35589) //= 0x8b05. The runtime will prefer the VTID if present
  @VTID(31)
  void top(
    int top);


  /**
   * <p>
   * Getter method for the COM property "Width"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(35586) //= 0x8b02. The runtime will prefer the VTID if present
  @VTID(32)
  int width();


  /**
   * <p>
   * Setter method for the COM property "Width"
   * </p>
   * @param width Mandatory int parameter.
   */

  @DISPID(35586) //= 0x8b02. The runtime will prefer the VTID if present
  @VTID(33)
  void width(
    int width);


  /**
   * @param saveMode Mandatory RT_MSOutlook.OlInspectorClose parameter.
   */

  @DISPID(61475) //= 0xf023. The runtime will prefer the VTID if present
  @VTID(34)
  void close(
    RT_MSOutlook.OlInspectorClose saveMode);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61490) //= 0xf032. The runtime will prefer the VTID if present
  @VTID(35)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject copy();


  /**
   */

  @DISPID(61514) //= 0xf04a. The runtime will prefer the VTID if present
  @VTID(36)
  void delete();


  /**
   * @param modal Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61606) //= 0xf0a6. The runtime will prefer the VTID if present
  @VTID(37)
  void display(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object modal);


  /**
   * @param destFldr Mandatory RT_MSOutlook.MAPIFolder parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61492) //= 0xf034. The runtime will prefer the VTID if present
  @VTID(38)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject move(
    RT_MSOutlook.MAPIFolder destFldr);


  /**
   */

  @DISPID(61491) //= 0xf033. The runtime will prefer the VTID if present
  @VTID(39)
  void printOut();


  /**
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(40)
  void save();


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61521) //= 0xf051. The runtime will prefer the VTID if present
  @VTID(41)
  void saveAs(
    java.lang.String path,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type);


  /**
   * <p>
   * Getter method for the COM property "Links"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Links
   */

  @DISPID(62469) //= 0xf405. The runtime will prefer the VTID if present
  @VTID(42)
  RT_MSOutlook.Links links();


  /**
   * <p>
   * Getter method for the COM property "DownloadState"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlDownloadState
   */

  @DISPID(64077) //= 0xfa4d. The runtime will prefer the VTID if present
  @VTID(43)
  RT_MSOutlook.OlDownloadState downloadState();


  /**
   * <p>
   * Getter method for the COM property "ItemProperties"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.ItemProperties
   */

  @DISPID(64009) //= 0xfa09. The runtime will prefer the VTID if present
  @VTID(44)
  RT_MSOutlook.ItemProperties itemProperties();


  @VTID(44)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook.ItemProperties.class})
  RT_MSOutlook.ItemProperty itemProperties(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MarkForDownload"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlRemoteStatus
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(45)
  RT_MSOutlook.OlRemoteStatus markForDownload();


  /**
   * <p>
   * Setter method for the COM property "MarkForDownload"
   * </p>
   * @param markForDownload Mandatory RT_MSOutlook.OlRemoteStatus parameter.
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(46)
  void markForDownload(
    RT_MSOutlook.OlRemoteStatus markForDownload);


  /**
   * <p>
   * Getter method for the COM property "IsConflict"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64164) //= 0xfaa4. The runtime will prefer the VTID if present
  @VTID(47)
  boolean isConflict();


  /**
   * <p>
   * Getter method for the COM property "AutoResolvedWinner"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64186) //= 0xfaba. The runtime will prefer the VTID if present
  @VTID(48)
  boolean autoResolvedWinner();


  /**
   * <p>
   * Getter method for the COM property "Conflicts"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Conflicts
   */

  @DISPID(64187) //= 0xfabb. The runtime will prefer the VTID if present
  @VTID(49)
  RT_MSOutlook.Conflicts conflicts();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(50)
  RT_MSOutlook._PropertyAccessor propertyAccessor();


  // Properties:
}

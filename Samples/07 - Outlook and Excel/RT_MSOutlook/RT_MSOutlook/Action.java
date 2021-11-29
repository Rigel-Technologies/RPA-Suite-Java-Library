package RT_MSOutlook  ;

import com4j.*;

@IID("{00063043-0000-0000-C000-000000000046}")
public interface Action extends Com4jObject {
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
   * Getter method for the COM property "CopyLike"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlActionCopyLike
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.OlActionCopyLike copyLike();


  /**
   * <p>
   * Setter method for the COM property "CopyLike"
   * </p>
   * @param copyLike Mandatory RT_MSOutlook.OlActionCopyLike parameter.
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(12)
  void copyLike(
    RT_MSOutlook.OlActionCopyLike copyLike);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(13)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param enabled Mandatory boolean parameter.
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(14)
  void enabled(
    boolean enabled);


  /**
   * <p>
   * Getter method for the COM property "MessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String messageClass();


  /**
   * <p>
   * Setter method for the COM property "MessageClass"
   * </p>
   * @param messageClass Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(16)
  void messageClass(
    java.lang.String messageClass);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(18)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Prefix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String prefix();


  /**
   * <p>
   * Setter method for the COM property "Prefix"
   * </p>
   * @param prefix Mandatory java.lang.String parameter.
   */

  @DISPID(61) //= 0x3d. The runtime will prefer the VTID if present
  @VTID(20)
  void prefix(
    java.lang.String prefix);


  /**
   * <p>
   * Getter method for the COM property "ReplyStyle"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlActionReplyStyle
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook.OlActionReplyStyle replyStyle();


  /**
   * <p>
   * Setter method for the COM property "ReplyStyle"
   * </p>
   * @param replyStyle Mandatory RT_MSOutlook.OlActionReplyStyle parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(22)
  void replyStyle(
    RT_MSOutlook.OlActionReplyStyle replyStyle);


  /**
   * <p>
   * Getter method for the COM property "ResponseStyle"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlActionResponseStyle
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.OlActionResponseStyle responseStyle();


  /**
   * <p>
   * Setter method for the COM property "ResponseStyle"
   * </p>
   * @param responseStyle Mandatory RT_MSOutlook.OlActionResponseStyle parameter.
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(24)
  void responseStyle(
    RT_MSOutlook.OlActionResponseStyle responseStyle);


  /**
   * <p>
   * Getter method for the COM property "ShowOn"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlActionShowOn
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook.OlActionShowOn showOn();


  /**
   * <p>
   * Setter method for the COM property "ShowOn"
   * </p>
   * @param showOn Mandatory RT_MSOutlook.OlActionShowOn parameter.
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(26)
  void showOn(
    RT_MSOutlook.OlActionShowOn showOn);


  /**
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(27)
  void delete();


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject execute();


  // Properties:
}

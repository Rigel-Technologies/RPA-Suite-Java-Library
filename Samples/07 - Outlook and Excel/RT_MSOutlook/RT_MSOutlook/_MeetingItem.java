package RT_MSOutlook  ;

import com4j.*;

@IID("{00063062-0000-0000-C000-000000000046}")
public interface _MeetingItem extends Com4jObject {
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
   * Getter method for the COM property "Actions"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Actions
   */

  @DISPID(63511) //= 0xf817. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.Actions actions();


  /**
   * <p>
   * Getter method for the COM property "Attachments"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Attachments
   */

  @DISPID(63509) //= 0xf815. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook.Attachments attachments();


  /**
   * <p>
   * Getter method for the COM property "BillingInformation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34101) //= 0x8535. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String billingInformation();


  /**
   * <p>
   * Setter method for the COM property "BillingInformation"
   * </p>
   * @param billingInformation Mandatory java.lang.String parameter.
   */

  @DISPID(34101) //= 0x8535. The runtime will prefer the VTID if present
  @VTID(14)
  void billingInformation(
    java.lang.String billingInformation);


  /**
   * <p>
   * Getter method for the COM property "Body"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String body();


  /**
   * <p>
   * Setter method for the COM property "Body"
   * </p>
   * @param body Mandatory java.lang.String parameter.
   */

  @DISPID(37120) //= 0x9100. The runtime will prefer the VTID if present
  @VTID(16)
  void body(
    java.lang.String body);


  /**
   * <p>
   * Getter method for the COM property "Categories"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(36865) //= 0x9001. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String categories();


  /**
   * <p>
   * Setter method for the COM property "Categories"
   * </p>
   * @param categories Mandatory java.lang.String parameter.
   */

  @DISPID(36865) //= 0x9001. The runtime will prefer the VTID if present
  @VTID(18)
  void categories(
    java.lang.String categories);


  /**
   * <p>
   * Getter method for the COM property "Companies"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34107) //= 0x853b. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String companies();


  /**
   * <p>
   * Setter method for the COM property "Companies"
   * </p>
   * @param companies Mandatory java.lang.String parameter.
   */

  @DISPID(34107) //= 0x853b. The runtime will prefer the VTID if present
  @VTID(20)
  void companies(
    java.lang.String companies);


  /**
   * <p>
   * Getter method for the COM property "ConversationIndex"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64192) //= 0xfac0. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String conversationIndex();


  /**
   * <p>
   * Getter method for the COM property "ConversationTopic"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String conversationTopic();


  /**
   * <p>
   * Getter method for the COM property "CreationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12295) //= 0x3007. The runtime will prefer the VTID if present
  @VTID(23)
  java.util.Date creationTime();


  /**
   * <p>
   * Getter method for the COM property "EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String entryID();


  /**
   * <p>
   * Getter method for the COM property "FormDescription"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.FormDescription
   */

  @DISPID(61589) //= 0xf095. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook.FormDescription formDescription();


  /**
   * <p>
   * Getter method for the COM property "GetInspector"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Inspector
   */

  @DISPID(61502) //= 0xf03e. The runtime will prefer the VTID if present
  @VTID(26)
  RT_MSOutlook._Inspector getInspector();


  /**
   * <p>
   * Getter method for the COM property "Importance"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlImportance
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(27)
  RT_MSOutlook.OlImportance importance();


  /**
   * <p>
   * Setter method for the COM property "Importance"
   * </p>
   * @param importance Mandatory RT_MSOutlook.OlImportance parameter.
   */

  @DISPID(23) //= 0x17. The runtime will prefer the VTID if present
  @VTID(28)
  void importance(
    RT_MSOutlook.OlImportance importance);


  /**
   * <p>
   * Getter method for the COM property "LastModificationTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(12296) //= 0x3008. The runtime will prefer the VTID if present
  @VTID(29)
  java.util.Date lastModificationTime();


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(30)
  com4j.Com4jObject mapiobject();


  /**
   * <p>
   * Getter method for the COM property "MessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String messageClass();


  /**
   * <p>
   * Setter method for the COM property "MessageClass"
   * </p>
   * @param messageClass Mandatory java.lang.String parameter.
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(32)
  void messageClass(
    java.lang.String messageClass);


  /**
   * <p>
   * Getter method for the COM property "Mileage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34100) //= 0x8534. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String mileage();


  /**
   * <p>
   * Setter method for the COM property "Mileage"
   * </p>
   * @param mileage Mandatory java.lang.String parameter.
   */

  @DISPID(34100) //= 0x8534. The runtime will prefer the VTID if present
  @VTID(34)
  void mileage(
    java.lang.String mileage);


  /**
   * <p>
   * Getter method for the COM property "NoAging"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34062) //= 0x850e. The runtime will prefer the VTID if present
  @VTID(35)
  boolean noAging();


  /**
   * <p>
   * Setter method for the COM property "NoAging"
   * </p>
   * @param noAging Mandatory boolean parameter.
   */

  @DISPID(34062) //= 0x850e. The runtime will prefer the VTID if present
  @VTID(36)
  void noAging(
    boolean noAging);


  /**
   * <p>
   * Getter method for the COM property "OutlookInternalVersion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(34130) //= 0x8552. The runtime will prefer the VTID if present
  @VTID(37)
  int outlookInternalVersion();


  /**
   * <p>
   * Getter method for the COM property "OutlookVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34132) //= 0x8554. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String outlookVersion();


  /**
   * <p>
   * Getter method for the COM property "Saved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61603) //= 0xf0a3. The runtime will prefer the VTID if present
  @VTID(39)
  boolean saved();


  /**
   * <p>
   * Getter method for the COM property "Sensitivity"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlSensitivity
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(40)
  RT_MSOutlook.OlSensitivity sensitivity();


  /**
   * <p>
   * Setter method for the COM property "Sensitivity"
   * </p>
   * @param sensitivity Mandatory RT_MSOutlook.OlSensitivity parameter.
   */

  @DISPID(54) //= 0x36. The runtime will prefer the VTID if present
  @VTID(41)
  void sensitivity(
    RT_MSOutlook.OlSensitivity sensitivity);


  /**
   * <p>
   * Getter method for the COM property "Size"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3592) //= 0xe08. The runtime will prefer the VTID if present
  @VTID(42)
  int size();


  /**
   * <p>
   * Getter method for the COM property "Subject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String subject();


  /**
   * <p>
   * Setter method for the COM property "Subject"
   * </p>
   * @param subject Mandatory java.lang.String parameter.
   */

  @DISPID(55) //= 0x37. The runtime will prefer the VTID if present
  @VTID(44)
  void subject(
    java.lang.String subject);


  /**
   * <p>
   * Getter method for the COM property "UnRead"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(61468) //= 0xf01c. The runtime will prefer the VTID if present
  @VTID(45)
  boolean unRead();


  /**
   * <p>
   * Setter method for the COM property "UnRead"
   * </p>
   * @param unRead Mandatory boolean parameter.
   */

  @DISPID(61468) //= 0xf01c. The runtime will prefer the VTID if present
  @VTID(46)
  void unRead(
    boolean unRead);


  /**
   * <p>
   * Getter method for the COM property "UserProperties"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.UserProperties
   */

  @DISPID(63510) //= 0xf816. The runtime will prefer the VTID if present
  @VTID(47)
  RT_MSOutlook.UserProperties userProperties();


  /**
   * @param saveMode Mandatory RT_MSOutlook.OlInspectorClose parameter.
   */

  @DISPID(61475) //= 0xf023. The runtime will prefer the VTID if present
  @VTID(48)
  void close(
    RT_MSOutlook.OlInspectorClose saveMode);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61490) //= 0xf032. The runtime will prefer the VTID if present
  @VTID(49)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject copy();


  /**
   */

  @DISPID(61514) //= 0xf04a. The runtime will prefer the VTID if present
  @VTID(50)
  void delete();


  /**
   * @param modal Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61606) //= 0xf0a6. The runtime will prefer the VTID if present
  @VTID(51)
  void display(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object modal);


  /**
   * @param destFldr Mandatory RT_MSOutlook.MAPIFolder parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61492) //= 0xf034. The runtime will prefer the VTID if present
  @VTID(52)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject move(
    RT_MSOutlook.MAPIFolder destFldr);


  /**
   */

  @DISPID(61491) //= 0xf033. The runtime will prefer the VTID if present
  @VTID(53)
  void printOut();


  /**
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(54)
  void save();


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(61521) //= 0xf051. The runtime will prefer the VTID if present
  @VTID(55)
  void saveAs(
    java.lang.String path,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type);


  /**
   * <p>
   * Getter method for the COM property "AutoForwarded"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(56)
  boolean autoForwarded();


  /**
   * <p>
   * Setter method for the COM property "AutoForwarded"
   * </p>
   * @param autoForwarded Mandatory boolean parameter.
   */

  @DISPID(5) //= 0x5. The runtime will prefer the VTID if present
  @VTID(57)
  void autoForwarded(
    boolean autoForwarded);


  /**
   * <p>
   * Getter method for the COM property "DeferredDeliveryTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(58)
  java.util.Date deferredDeliveryTime();


  /**
   * <p>
   * Setter method for the COM property "DeferredDeliveryTime"
   * </p>
   * @param deferredDeliveryTime Mandatory java.util.Date parameter.
   */

  @DISPID(15) //= 0xf. The runtime will prefer the VTID if present
  @VTID(59)
  void deferredDeliveryTime(
    java.util.Date deferredDeliveryTime);


  /**
   * <p>
   * Getter method for the COM property "DeleteAfterSubmit"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(3585) //= 0xe01. The runtime will prefer the VTID if present
  @VTID(60)
  boolean deleteAfterSubmit();


  /**
   * <p>
   * Setter method for the COM property "DeleteAfterSubmit"
   * </p>
   * @param deleteAfterSubmit Mandatory boolean parameter.
   */

  @DISPID(3585) //= 0xe01. The runtime will prefer the VTID if present
  @VTID(61)
  void deleteAfterSubmit(
    boolean deleteAfterSubmit);


  /**
   * <p>
   * Getter method for the COM property "ExpiryTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(62)
  java.util.Date expiryTime();


  /**
   * <p>
   * Setter method for the COM property "ExpiryTime"
   * </p>
   * @param expiryTime Mandatory java.util.Date parameter.
   */

  @DISPID(21) //= 0x15. The runtime will prefer the VTID if present
  @VTID(63)
  void expiryTime(
    java.util.Date expiryTime);


  /**
   * <p>
   * Getter method for the COM property "FlagDueBy"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(64)
  java.util.Date flagDueBy();


  /**
   * <p>
   * Setter method for the COM property "FlagDueBy"
   * </p>
   * @param flagDueBy Mandatory java.util.Date parameter.
   */

  @DISPID(48) //= 0x30. The runtime will prefer the VTID if present
  @VTID(65)
  void flagDueBy(
    java.util.Date flagDueBy);


  /**
   * <p>
   * Getter method for the COM property "FlagRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34096) //= 0x8530. The runtime will prefer the VTID if present
  @VTID(66)
  java.lang.String flagRequest();


  /**
   * <p>
   * Setter method for the COM property "FlagRequest"
   * </p>
   * @param flagRequest Mandatory java.lang.String parameter.
   */

  @DISPID(34096) //= 0x8530. The runtime will prefer the VTID if present
  @VTID(67)
  void flagRequest(
    java.lang.String flagRequest);


  /**
   * <p>
   * Getter method for the COM property "FlagStatus"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlFlagStatus
   */

  @DISPID(4240) //= 0x1090. The runtime will prefer the VTID if present
  @VTID(68)
  RT_MSOutlook.OlFlagStatus flagStatus();


  /**
   * <p>
   * Setter method for the COM property "FlagStatus"
   * </p>
   * @param flagStatus Mandatory RT_MSOutlook.OlFlagStatus parameter.
   */

  @DISPID(4240) //= 0x1090. The runtime will prefer the VTID if present
  @VTID(69)
  void flagStatus(
    RT_MSOutlook.OlFlagStatus flagStatus);


  /**
   * <p>
   * Getter method for the COM property "OriginatorDeliveryReportRequested"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(70)
  boolean originatorDeliveryReportRequested();


  /**
   * <p>
   * Setter method for the COM property "OriginatorDeliveryReportRequested"
   * </p>
   * @param originatorDeliveryReportRequested Mandatory boolean parameter.
   */

  @DISPID(35) //= 0x23. The runtime will prefer the VTID if present
  @VTID(71)
  void originatorDeliveryReportRequested(
    boolean originatorDeliveryReportRequested);


  /**
   * <p>
   * Getter method for the COM property "ReceivedTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(3590) //= 0xe06. The runtime will prefer the VTID if present
  @VTID(72)
  java.util.Date receivedTime();


  /**
   * <p>
   * Setter method for the COM property "ReceivedTime"
   * </p>
   * @param receivedTime Mandatory java.util.Date parameter.
   */

  @DISPID(3590) //= 0xe06. The runtime will prefer the VTID if present
  @VTID(73)
  void receivedTime(
    java.util.Date receivedTime);


  /**
   * <p>
   * Getter method for the COM property "Recipients"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Recipients
   */

  @DISPID(63508) //= 0xf814. The runtime will prefer the VTID if present
  @VTID(74)
  RT_MSOutlook.Recipients recipients();


  /**
   * <p>
   * Getter method for the COM property "ReminderSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(75)
  boolean reminderSet();


  /**
   * <p>
   * Setter method for the COM property "ReminderSet"
   * </p>
   * @param reminderSet Mandatory boolean parameter.
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(76)
  void reminderSet(
    boolean reminderSet);


  /**
   * <p>
   * Getter method for the COM property "ReminderTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(34050) //= 0x8502. The runtime will prefer the VTID if present
  @VTID(77)
  java.util.Date reminderTime();


  /**
   * <p>
   * Setter method for the COM property "ReminderTime"
   * </p>
   * @param reminderTime Mandatory java.util.Date parameter.
   */

  @DISPID(34050) //= 0x8502. The runtime will prefer the VTID if present
  @VTID(78)
  void reminderTime(
    java.util.Date reminderTime);


  /**
   * <p>
   * Getter method for the COM property "ReplyRecipients"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Recipients
   */

  @DISPID(61459) //= 0xf013. The runtime will prefer the VTID if present
  @VTID(79)
  RT_MSOutlook.Recipients replyRecipients();


  /**
   * <p>
   * Getter method for the COM property "SaveSentMessageFolder"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(62465) //= 0xf401. The runtime will prefer the VTID if present
  @VTID(80)
  RT_MSOutlook.MAPIFolder saveSentMessageFolder();


  /**
   * <p>
   * Setter method for the COM property "SaveSentMessageFolder"
   * </p>
   * @param saveSentMessageFolder Mandatory RT_MSOutlook.MAPIFolder parameter.
   */

  @DISPID(62465) //= 0xf401. The runtime will prefer the VTID if present
  @VTID(81)
  void saveSentMessageFolder(
    RT_MSOutlook.MAPIFolder saveSentMessageFolder);


  /**
   * <p>
   * Getter method for the COM property "SenderName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3098) //= 0xc1a. The runtime will prefer the VTID if present
  @VTID(82)
  java.lang.String senderName();


  /**
   * <p>
   * Getter method for the COM property "Sent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(62466) //= 0xf402. The runtime will prefer the VTID if present
  @VTID(83)
  boolean sent();


  /**
   * <p>
   * Getter method for the COM property "SentOn"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(57) //= 0x39. The runtime will prefer the VTID if present
  @VTID(84)
  java.util.Date sentOn();


  /**
   * <p>
   * Getter method for the COM property "Submitted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(62467) //= 0xf403. The runtime will prefer the VTID if present
  @VTID(85)
  boolean submitted();


  /**
   * @return  Returns a value of type RT_MSOutlook._MeetingItem
   */

  @DISPID(63507) //= 0xf813. The runtime will prefer the VTID if present
  @VTID(86)
  RT_MSOutlook._MeetingItem forward();


  /**
   * @param addToCalendar Mandatory boolean parameter.
   * @return  Returns a value of type RT_MSOutlook._AppointmentItem
   */

  @DISPID(63328) //= 0xf760. The runtime will prefer the VTID if present
  @VTID(87)
  RT_MSOutlook._AppointmentItem getAssociatedAppointment(
    boolean addToCalendar);


  /**
   * @return  Returns a value of type RT_MSOutlook._MailItem
   */

  @DISPID(63504) //= 0xf810. The runtime will prefer the VTID if present
  @VTID(88)
  RT_MSOutlook._MailItem reply();


  /**
   * @return  Returns a value of type RT_MSOutlook._MailItem
   */

  @DISPID(63505) //= 0xf811. The runtime will prefer the VTID if present
  @VTID(89)
  RT_MSOutlook._MailItem replyAll();


  /**
   */

  @DISPID(61557) //= 0xf075. The runtime will prefer the VTID if present
  @VTID(90)
  void send();


  /**
   * <p>
   * Getter method for the COM property "Links"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Links
   */

  @DISPID(62469) //= 0xf405. The runtime will prefer the VTID if present
  @VTID(91)
  RT_MSOutlook.Links links();


  /**
   * <p>
   * Getter method for the COM property "DownloadState"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlDownloadState
   */

  @DISPID(64077) //= 0xfa4d. The runtime will prefer the VTID if present
  @VTID(92)
  RT_MSOutlook.OlDownloadState downloadState();


  /**
   */

  @DISPID(64011) //= 0xfa0b. The runtime will prefer the VTID if present
  @VTID(93)
  void showCategoriesDialog();


  /**
   * <p>
   * Getter method for the COM property "ItemProperties"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.ItemProperties
   */

  @DISPID(64009) //= 0xfa09. The runtime will prefer the VTID if present
  @VTID(94)
  RT_MSOutlook.ItemProperties itemProperties();


  @VTID(94)
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
  @VTID(95)
  RT_MSOutlook.OlRemoteStatus markForDownload();


  /**
   * <p>
   * Setter method for the COM property "MarkForDownload"
   * </p>
   * @param markForDownload Mandatory RT_MSOutlook.OlRemoteStatus parameter.
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(96)
  void markForDownload(
    RT_MSOutlook.OlRemoteStatus markForDownload);


  /**
   * <p>
   * Getter method for the COM property "IsConflict"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64164) //= 0xfaa4. The runtime will prefer the VTID if present
  @VTID(97)
  boolean isConflict();


  /**
   * <p>
   * Getter method for the COM property "MeetingWorkspaceURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(33289) //= 0x8209. The runtime will prefer the VTID if present
  @VTID(98)
  java.lang.String meetingWorkspaceURL();


  /**
   * <p>
   * Getter method for the COM property "FlagIcon"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlFlagIcon
   */

  @DISPID(64204) //= 0xfacc. The runtime will prefer the VTID if present
  @VTID(99)
  RT_MSOutlook.OlFlagIcon flagIcon();


  /**
   * <p>
   * Setter method for the COM property "FlagIcon"
   * </p>
   * @param flagIcon Mandatory RT_MSOutlook.OlFlagIcon parameter.
   */

  @DISPID(64204) //= 0xfacc. The runtime will prefer the VTID if present
  @VTID(100)
  void flagIcon(
    RT_MSOutlook.OlFlagIcon flagIcon);


  /**
   * <p>
   * Getter method for the COM property "AutoResolvedWinner"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64186) //= 0xfaba. The runtime will prefer the VTID if present
  @VTID(101)
  boolean autoResolvedWinner();


  /**
   * <p>
   * Getter method for the COM property "Conflicts"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Conflicts
   */

  @DISPID(64187) //= 0xfabb. The runtime will prefer the VTID if present
  @VTID(102)
  RT_MSOutlook.Conflicts conflicts();


  /**
   * <p>
   * Getter method for the COM property "SenderEmailAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3103) //= 0xc1f. The runtime will prefer the VTID if present
  @VTID(103)
  java.lang.String senderEmailAddress();


  /**
   * <p>
   * Getter method for the COM property "SenderEmailType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(3102) //= 0xc1e. The runtime will prefer the VTID if present
  @VTID(104)
  java.lang.String senderEmailType();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(105)
  RT_MSOutlook._PropertyAccessor propertyAccessor();


  /**
   * @return  Returns a value of type RT_MSOutlook._Conversation
   */

  @DISPID(64596) //= 0xfc54. The runtime will prefer the VTID if present
  @VTID(106)
  RT_MSOutlook._Conversation getConversation();


  /**
   * <p>
   * Getter method for the COM property "ConversationID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64629) //= 0xfc75. The runtime will prefer the VTID if present
  @VTID(107)
  java.lang.String conversationID();


  /**
   * <p>
   * Getter method for the COM property "SendUsingAccount"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Account
   */

  @DISPID(64209) //= 0xfad1. The runtime will prefer the VTID if present
  @VTID(108)
  RT_MSOutlook._Account sendUsingAccount();


  /**
   * <p>
   * Setter method for the COM property "SendUsingAccount"
   * </p>
   * @param sendUsingAccount Mandatory RT_MSOutlook._Account parameter.
   */

  @DISPID(64209) //= 0xfad1. The runtime will prefer the VTID if present
  @VTID(109)
  void sendUsingAccount(
    RT_MSOutlook._Account sendUsingAccount);


  /**
   * <p>
   * Getter method for the COM property "IsLatestVersion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64642) //= 0xfc82. The runtime will prefer the VTID if present
  @VTID(110)
  boolean isLatestVersion();


  /**
   * <p>
   * Getter method for the COM property "RTFBody"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(111)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rtfBody();


  /**
   * <p>
   * Setter method for the COM property "RTFBody"
   * </p>
   * @param rtfBody Mandatory java.lang.Object parameter.
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(112)
  void rtfBody(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rtfBody);


  /**
   * <p>
   * Getter method for the COM property "RetentionExpirationDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64650) //= 0xfc8a. The runtime will prefer the VTID if present
  @VTID(113)
  java.util.Date retentionExpirationDate();


  /**
   * <p>
   * Getter method for the COM property "RetentionPolicyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64651) //= 0xfc8b. The runtime will prefer the VTID if present
  @VTID(114)
  java.lang.String retentionPolicyName();


  // Properties:
}

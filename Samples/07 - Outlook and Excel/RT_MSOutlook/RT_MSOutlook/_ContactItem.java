package RT_MSOutlook  ;

import com4j.*;

@IID("{00063021-0000-0000-C000-000000000046}")
public interface _ContactItem extends Com4jObject {
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
   * Getter method for the COM property "Account"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14848) //= 0x3a00. The runtime will prefer the VTID if present
  @VTID(56)
  java.lang.String account();


  /**
   * <p>
   * Setter method for the COM property "Account"
   * </p>
   * @param account Mandatory java.lang.String parameter.
   */

  @DISPID(14848) //= 0x3a00. The runtime will prefer the VTID if present
  @VTID(57)
  void account(
    java.lang.String account);


  /**
   * <p>
   * Getter method for the COM property "Anniversary"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(14913) //= 0x3a41. The runtime will prefer the VTID if present
  @VTID(58)
  java.util.Date anniversary();


  /**
   * <p>
   * Setter method for the COM property "Anniversary"
   * </p>
   * @param anniversary Mandatory java.util.Date parameter.
   */

  @DISPID(14913) //= 0x3a41. The runtime will prefer the VTID if present
  @VTID(59)
  void anniversary(
    java.util.Date anniversary);


  /**
   * <p>
   * Getter method for the COM property "AssistantName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14896) //= 0x3a30. The runtime will prefer the VTID if present
  @VTID(60)
  java.lang.String assistantName();


  /**
   * <p>
   * Setter method for the COM property "AssistantName"
   * </p>
   * @param assistantName Mandatory java.lang.String parameter.
   */

  @DISPID(14896) //= 0x3a30. The runtime will prefer the VTID if present
  @VTID(61)
  void assistantName(
    java.lang.String assistantName);


  /**
   * <p>
   * Getter method for the COM property "AssistantTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14894) //= 0x3a2e. The runtime will prefer the VTID if present
  @VTID(62)
  java.lang.String assistantTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "AssistantTelephoneNumber"
   * </p>
   * @param assistantTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14894) //= 0x3a2e. The runtime will prefer the VTID if present
  @VTID(63)
  void assistantTelephoneNumber(
    java.lang.String assistantTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "Birthday"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(14914) //= 0x3a42. The runtime will prefer the VTID if present
  @VTID(64)
  java.util.Date birthday();


  /**
   * <p>
   * Setter method for the COM property "Birthday"
   * </p>
   * @param birthday Mandatory java.util.Date parameter.
   */

  @DISPID(14914) //= 0x3a42. The runtime will prefer the VTID if present
  @VTID(65)
  void birthday(
    java.util.Date birthday);


  /**
   * <p>
   * Getter method for the COM property "Business2TelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14875) //= 0x3a1b. The runtime will prefer the VTID if present
  @VTID(66)
  java.lang.String business2TelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "Business2TelephoneNumber"
   * </p>
   * @param business2TelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14875) //= 0x3a1b. The runtime will prefer the VTID if present
  @VTID(67)
  void business2TelephoneNumber(
    java.lang.String business2TelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "BusinessAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32795) //= 0x801b. The runtime will prefer the VTID if present
  @VTID(68)
  java.lang.String businessAddress();


  /**
   * <p>
   * Setter method for the COM property "BusinessAddress"
   * </p>
   * @param businessAddress Mandatory java.lang.String parameter.
   */

  @DISPID(32795) //= 0x801b. The runtime will prefer the VTID if present
  @VTID(69)
  void businessAddress(
    java.lang.String businessAddress);


  /**
   * <p>
   * Getter method for the COM property "BusinessAddressCity"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32838) //= 0x8046. The runtime will prefer the VTID if present
  @VTID(70)
  java.lang.String businessAddressCity();


  /**
   * <p>
   * Setter method for the COM property "BusinessAddressCity"
   * </p>
   * @param businessAddressCity Mandatory java.lang.String parameter.
   */

  @DISPID(32838) //= 0x8046. The runtime will prefer the VTID if present
  @VTID(71)
  void businessAddressCity(
    java.lang.String businessAddressCity);


  /**
   * <p>
   * Getter method for the COM property "BusinessAddressCountry"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32841) //= 0x8049. The runtime will prefer the VTID if present
  @VTID(72)
  java.lang.String businessAddressCountry();


  /**
   * <p>
   * Setter method for the COM property "BusinessAddressCountry"
   * </p>
   * @param businessAddressCountry Mandatory java.lang.String parameter.
   */

  @DISPID(32841) //= 0x8049. The runtime will prefer the VTID if present
  @VTID(73)
  void businessAddressCountry(
    java.lang.String businessAddressCountry);


  /**
   * <p>
   * Getter method for the COM property "BusinessAddressPostalCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32840) //= 0x8048. The runtime will prefer the VTID if present
  @VTID(74)
  java.lang.String businessAddressPostalCode();


  /**
   * <p>
   * Setter method for the COM property "BusinessAddressPostalCode"
   * </p>
   * @param businessAddressPostalCode Mandatory java.lang.String parameter.
   */

  @DISPID(32840) //= 0x8048. The runtime will prefer the VTID if present
  @VTID(75)
  void businessAddressPostalCode(
    java.lang.String businessAddressPostalCode);


  /**
   * <p>
   * Getter method for the COM property "BusinessAddressPostOfficeBox"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32842) //= 0x804a. The runtime will prefer the VTID if present
  @VTID(76)
  java.lang.String businessAddressPostOfficeBox();


  /**
   * <p>
   * Setter method for the COM property "BusinessAddressPostOfficeBox"
   * </p>
   * @param businessAddressPostOfficeBox Mandatory java.lang.String parameter.
   */

  @DISPID(32842) //= 0x804a. The runtime will prefer the VTID if present
  @VTID(77)
  void businessAddressPostOfficeBox(
    java.lang.String businessAddressPostOfficeBox);


  /**
   * <p>
   * Getter method for the COM property "BusinessAddressState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32839) //= 0x8047. The runtime will prefer the VTID if present
  @VTID(78)
  java.lang.String businessAddressState();


  /**
   * <p>
   * Setter method for the COM property "BusinessAddressState"
   * </p>
   * @param businessAddressState Mandatory java.lang.String parameter.
   */

  @DISPID(32839) //= 0x8047. The runtime will prefer the VTID if present
  @VTID(79)
  void businessAddressState(
    java.lang.String businessAddressState);


  /**
   * <p>
   * Getter method for the COM property "BusinessAddressStreet"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32837) //= 0x8045. The runtime will prefer the VTID if present
  @VTID(80)
  java.lang.String businessAddressStreet();


  /**
   * <p>
   * Setter method for the COM property "BusinessAddressStreet"
   * </p>
   * @param businessAddressStreet Mandatory java.lang.String parameter.
   */

  @DISPID(32837) //= 0x8045. The runtime will prefer the VTID if present
  @VTID(81)
  void businessAddressStreet(
    java.lang.String businessAddressStreet);


  /**
   * <p>
   * Getter method for the COM property "BusinessFaxNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14884) //= 0x3a24. The runtime will prefer the VTID if present
  @VTID(82)
  java.lang.String businessFaxNumber();


  /**
   * <p>
   * Setter method for the COM property "BusinessFaxNumber"
   * </p>
   * @param businessFaxNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14884) //= 0x3a24. The runtime will prefer the VTID if present
  @VTID(83)
  void businessFaxNumber(
    java.lang.String businessFaxNumber);


  /**
   * <p>
   * Getter method for the COM property "BusinessHomePage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14929) //= 0x3a51. The runtime will prefer the VTID if present
  @VTID(84)
  java.lang.String businessHomePage();


  /**
   * <p>
   * Setter method for the COM property "BusinessHomePage"
   * </p>
   * @param businessHomePage Mandatory java.lang.String parameter.
   */

  @DISPID(14929) //= 0x3a51. The runtime will prefer the VTID if present
  @VTID(85)
  void businessHomePage(
    java.lang.String businessHomePage);


  /**
   * <p>
   * Getter method for the COM property "BusinessTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14856) //= 0x3a08. The runtime will prefer the VTID if present
  @VTID(86)
  java.lang.String businessTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "BusinessTelephoneNumber"
   * </p>
   * @param businessTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14856) //= 0x3a08. The runtime will prefer the VTID if present
  @VTID(87)
  void businessTelephoneNumber(
    java.lang.String businessTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "CallbackTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14850) //= 0x3a02. The runtime will prefer the VTID if present
  @VTID(88)
  java.lang.String callbackTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "CallbackTelephoneNumber"
   * </p>
   * @param callbackTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14850) //= 0x3a02. The runtime will prefer the VTID if present
  @VTID(89)
  void callbackTelephoneNumber(
    java.lang.String callbackTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "CarTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14878) //= 0x3a1e. The runtime will prefer the VTID if present
  @VTID(90)
  java.lang.String carTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "CarTelephoneNumber"
   * </p>
   * @param carTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14878) //= 0x3a1e. The runtime will prefer the VTID if present
  @VTID(91)
  void carTelephoneNumber(
    java.lang.String carTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "Children"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32780) //= 0x800c. The runtime will prefer the VTID if present
  @VTID(92)
  java.lang.String children();


  /**
   * <p>
   * Setter method for the COM property "Children"
   * </p>
   * @param children Mandatory java.lang.String parameter.
   */

  @DISPID(32780) //= 0x800c. The runtime will prefer the VTID if present
  @VTID(93)
  void children(
    java.lang.String children);


  /**
   * <p>
   * Getter method for the COM property "CompanyAndFullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32792) //= 0x8018. The runtime will prefer the VTID if present
  @VTID(94)
  java.lang.String companyAndFullName();


  /**
   * <p>
   * Getter method for the COM property "CompanyLastFirstNoSpace"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32818) //= 0x8032. The runtime will prefer the VTID if present
  @VTID(95)
  java.lang.String companyLastFirstNoSpace();


  /**
   * <p>
   * Getter method for the COM property "CompanyLastFirstSpaceOnly"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32819) //= 0x8033. The runtime will prefer the VTID if present
  @VTID(96)
  java.lang.String companyLastFirstSpaceOnly();


  /**
   * <p>
   * Getter method for the COM property "CompanyMainTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14935) //= 0x3a57. The runtime will prefer the VTID if present
  @VTID(97)
  java.lang.String companyMainTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "CompanyMainTelephoneNumber"
   * </p>
   * @param companyMainTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14935) //= 0x3a57. The runtime will prefer the VTID if present
  @VTID(98)
  void companyMainTelephoneNumber(
    java.lang.String companyMainTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "CompanyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14870) //= 0x3a16. The runtime will prefer the VTID if present
  @VTID(99)
  java.lang.String companyName();


  /**
   * <p>
   * Setter method for the COM property "CompanyName"
   * </p>
   * @param companyName Mandatory java.lang.String parameter.
   */

  @DISPID(14870) //= 0x3a16. The runtime will prefer the VTID if present
  @VTID(100)
  void companyName(
    java.lang.String companyName);


  /**
   * <p>
   * Getter method for the COM property "ComputerNetworkName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14921) //= 0x3a49. The runtime will prefer the VTID if present
  @VTID(101)
  java.lang.String computerNetworkName();


  /**
   * <p>
   * Setter method for the COM property "ComputerNetworkName"
   * </p>
   * @param computerNetworkName Mandatory java.lang.String parameter.
   */

  @DISPID(14921) //= 0x3a49. The runtime will prefer the VTID if present
  @VTID(102)
  void computerNetworkName(
    java.lang.String computerNetworkName);


  /**
   * <p>
   * Getter method for the COM property "CustomerID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14922) //= 0x3a4a. The runtime will prefer the VTID if present
  @VTID(103)
  java.lang.String customerID();


  /**
   * <p>
   * Setter method for the COM property "CustomerID"
   * </p>
   * @param customerID Mandatory java.lang.String parameter.
   */

  @DISPID(14922) //= 0x3a4a. The runtime will prefer the VTID if present
  @VTID(104)
  void customerID(
    java.lang.String customerID);


  /**
   * <p>
   * Getter method for the COM property "Department"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14872) //= 0x3a18. The runtime will prefer the VTID if present
  @VTID(105)
  java.lang.String department();


  /**
   * <p>
   * Setter method for the COM property "Department"
   * </p>
   * @param department Mandatory java.lang.String parameter.
   */

  @DISPID(14872) //= 0x3a18. The runtime will prefer the VTID if present
  @VTID(106)
  void department(
    java.lang.String department);


  /**
   * <p>
   * Getter method for the COM property "Email1Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32899) //= 0x8083. The runtime will prefer the VTID if present
  @VTID(107)
  java.lang.String email1Address();


  /**
   * <p>
   * Setter method for the COM property "Email1Address"
   * </p>
   * @param email1Address Mandatory java.lang.String parameter.
   */

  @DISPID(32899) //= 0x8083. The runtime will prefer the VTID if present
  @VTID(108)
  void email1Address(
    java.lang.String email1Address);


  /**
   * <p>
   * Getter method for the COM property "Email1AddressType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32898) //= 0x8082. The runtime will prefer the VTID if present
  @VTID(109)
  java.lang.String email1AddressType();


  /**
   * <p>
   * Setter method for the COM property "Email1AddressType"
   * </p>
   * @param email1AddressType Mandatory java.lang.String parameter.
   */

  @DISPID(32898) //= 0x8082. The runtime will prefer the VTID if present
  @VTID(110)
  void email1AddressType(
    java.lang.String email1AddressType);


  /**
   * <p>
   * Getter method for the COM property "Email1DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32896) //= 0x8080. The runtime will prefer the VTID if present
  @VTID(111)
  java.lang.String email1DisplayName();


  /**
   * <p>
   * Getter method for the COM property "Email1EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32901) //= 0x8085. The runtime will prefer the VTID if present
  @VTID(112)
  java.lang.String email1EntryID();


  /**
   * <p>
   * Getter method for the COM property "Email2Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32915) //= 0x8093. The runtime will prefer the VTID if present
  @VTID(113)
  java.lang.String email2Address();


  /**
   * <p>
   * Setter method for the COM property "Email2Address"
   * </p>
   * @param email2Address Mandatory java.lang.String parameter.
   */

  @DISPID(32915) //= 0x8093. The runtime will prefer the VTID if present
  @VTID(114)
  void email2Address(
    java.lang.String email2Address);


  /**
   * <p>
   * Getter method for the COM property "Email2AddressType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32914) //= 0x8092. The runtime will prefer the VTID if present
  @VTID(115)
  java.lang.String email2AddressType();


  /**
   * <p>
   * Setter method for the COM property "Email2AddressType"
   * </p>
   * @param email2AddressType Mandatory java.lang.String parameter.
   */

  @DISPID(32914) //= 0x8092. The runtime will prefer the VTID if present
  @VTID(116)
  void email2AddressType(
    java.lang.String email2AddressType);


  /**
   * <p>
   * Getter method for the COM property "Email2DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32912) //= 0x8090. The runtime will prefer the VTID if present
  @VTID(117)
  java.lang.String email2DisplayName();


  /**
   * <p>
   * Getter method for the COM property "Email2EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32917) //= 0x8095. The runtime will prefer the VTID if present
  @VTID(118)
  java.lang.String email2EntryID();


  /**
   * <p>
   * Getter method for the COM property "Email3Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32931) //= 0x80a3. The runtime will prefer the VTID if present
  @VTID(119)
  java.lang.String email3Address();


  /**
   * <p>
   * Setter method for the COM property "Email3Address"
   * </p>
   * @param email3Address Mandatory java.lang.String parameter.
   */

  @DISPID(32931) //= 0x80a3. The runtime will prefer the VTID if present
  @VTID(120)
  void email3Address(
    java.lang.String email3Address);


  /**
   * <p>
   * Getter method for the COM property "Email3AddressType"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32930) //= 0x80a2. The runtime will prefer the VTID if present
  @VTID(121)
  java.lang.String email3AddressType();


  /**
   * <p>
   * Setter method for the COM property "Email3AddressType"
   * </p>
   * @param email3AddressType Mandatory java.lang.String parameter.
   */

  @DISPID(32930) //= 0x80a2. The runtime will prefer the VTID if present
  @VTID(122)
  void email3AddressType(
    java.lang.String email3AddressType);


  /**
   * <p>
   * Getter method for the COM property "Email3DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32928) //= 0x80a0. The runtime will prefer the VTID if present
  @VTID(123)
  java.lang.String email3DisplayName();


  /**
   * <p>
   * Getter method for the COM property "Email3EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32933) //= 0x80a5. The runtime will prefer the VTID if present
  @VTID(124)
  java.lang.String email3EntryID();


  /**
   * <p>
   * Getter method for the COM property "FileAs"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32773) //= 0x8005. The runtime will prefer the VTID if present
  @VTID(125)
  java.lang.String fileAs();


  /**
   * <p>
   * Setter method for the COM property "FileAs"
   * </p>
   * @param fileAs Mandatory java.lang.String parameter.
   */

  @DISPID(32773) //= 0x8005. The runtime will prefer the VTID if present
  @VTID(126)
  void fileAs(
    java.lang.String fileAs);


  /**
   * <p>
   * Getter method for the COM property "FirstName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14854) //= 0x3a06. The runtime will prefer the VTID if present
  @VTID(127)
  java.lang.String firstName();


  /**
   * <p>
   * Setter method for the COM property "FirstName"
   * </p>
   * @param firstName Mandatory java.lang.String parameter.
   */

  @DISPID(14854) //= 0x3a06. The runtime will prefer the VTID if present
  @VTID(128)
  void firstName(
    java.lang.String firstName);


  /**
   * <p>
   * Getter method for the COM property "FTPSite"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14924) //= 0x3a4c. The runtime will prefer the VTID if present
  @VTID(129)
  java.lang.String ftpSite();


  /**
   * <p>
   * Setter method for the COM property "FTPSite"
   * </p>
   * @param ftpSite Mandatory java.lang.String parameter.
   */

  @DISPID(14924) //= 0x3a4c. The runtime will prefer the VTID if present
  @VTID(130)
  void ftpSite(
    java.lang.String ftpSite);


  /**
   * <p>
   * Getter method for the COM property "FullName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(131)
  java.lang.String fullName();


  /**
   * <p>
   * Setter method for the COM property "FullName"
   * </p>
   * @param fullName Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(132)
  void fullName(
    java.lang.String fullName);


  /**
   * <p>
   * Getter method for the COM property "FullNameAndCompany"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32793) //= 0x8019. The runtime will prefer the VTID if present
  @VTID(133)
  java.lang.String fullNameAndCompany();


  /**
   * <p>
   * Getter method for the COM property "Gender"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlGender
   */

  @DISPID(14925) //= 0x3a4d. The runtime will prefer the VTID if present
  @VTID(134)
  RT_MSOutlook.OlGender gender();


  /**
   * <p>
   * Setter method for the COM property "Gender"
   * </p>
   * @param gender Mandatory RT_MSOutlook.OlGender parameter.
   */

  @DISPID(14925) //= 0x3a4d. The runtime will prefer the VTID if present
  @VTID(135)
  void gender(
    RT_MSOutlook.OlGender gender);


  /**
   * <p>
   * Getter method for the COM property "GovernmentIDNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14855) //= 0x3a07. The runtime will prefer the VTID if present
  @VTID(136)
  java.lang.String governmentIDNumber();


  /**
   * <p>
   * Setter method for the COM property "GovernmentIDNumber"
   * </p>
   * @param governmentIDNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14855) //= 0x3a07. The runtime will prefer the VTID if present
  @VTID(137)
  void governmentIDNumber(
    java.lang.String governmentIDNumber);


  /**
   * <p>
   * Getter method for the COM property "Hobby"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14915) //= 0x3a43. The runtime will prefer the VTID if present
  @VTID(138)
  java.lang.String hobby();


  /**
   * <p>
   * Setter method for the COM property "Hobby"
   * </p>
   * @param hobby Mandatory java.lang.String parameter.
   */

  @DISPID(14915) //= 0x3a43. The runtime will prefer the VTID if present
  @VTID(139)
  void hobby(
    java.lang.String hobby);


  /**
   * <p>
   * Getter method for the COM property "Home2TelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14895) //= 0x3a2f. The runtime will prefer the VTID if present
  @VTID(140)
  java.lang.String home2TelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "Home2TelephoneNumber"
   * </p>
   * @param home2TelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14895) //= 0x3a2f. The runtime will prefer the VTID if present
  @VTID(141)
  void home2TelephoneNumber(
    java.lang.String home2TelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "HomeAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32794) //= 0x801a. The runtime will prefer the VTID if present
  @VTID(142)
  java.lang.String homeAddress();


  /**
   * <p>
   * Setter method for the COM property "HomeAddress"
   * </p>
   * @param homeAddress Mandatory java.lang.String parameter.
   */

  @DISPID(32794) //= 0x801a. The runtime will prefer the VTID if present
  @VTID(143)
  void homeAddress(
    java.lang.String homeAddress);


  /**
   * <p>
   * Getter method for the COM property "HomeAddressCity"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14937) //= 0x3a59. The runtime will prefer the VTID if present
  @VTID(144)
  java.lang.String homeAddressCity();


  /**
   * <p>
   * Setter method for the COM property "HomeAddressCity"
   * </p>
   * @param homeAddressCity Mandatory java.lang.String parameter.
   */

  @DISPID(14937) //= 0x3a59. The runtime will prefer the VTID if present
  @VTID(145)
  void homeAddressCity(
    java.lang.String homeAddressCity);


  /**
   * <p>
   * Getter method for the COM property "HomeAddressCountry"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14938) //= 0x3a5a. The runtime will prefer the VTID if present
  @VTID(146)
  java.lang.String homeAddressCountry();


  /**
   * <p>
   * Setter method for the COM property "HomeAddressCountry"
   * </p>
   * @param homeAddressCountry Mandatory java.lang.String parameter.
   */

  @DISPID(14938) //= 0x3a5a. The runtime will prefer the VTID if present
  @VTID(147)
  void homeAddressCountry(
    java.lang.String homeAddressCountry);


  /**
   * <p>
   * Getter method for the COM property "HomeAddressPostalCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14939) //= 0x3a5b. The runtime will prefer the VTID if present
  @VTID(148)
  java.lang.String homeAddressPostalCode();


  /**
   * <p>
   * Setter method for the COM property "HomeAddressPostalCode"
   * </p>
   * @param homeAddressPostalCode Mandatory java.lang.String parameter.
   */

  @DISPID(14939) //= 0x3a5b. The runtime will prefer the VTID if present
  @VTID(149)
  void homeAddressPostalCode(
    java.lang.String homeAddressPostalCode);


  /**
   * <p>
   * Getter method for the COM property "HomeAddressPostOfficeBox"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14942) //= 0x3a5e. The runtime will prefer the VTID if present
  @VTID(150)
  java.lang.String homeAddressPostOfficeBox();


  /**
   * <p>
   * Setter method for the COM property "HomeAddressPostOfficeBox"
   * </p>
   * @param homeAddressPostOfficeBox Mandatory java.lang.String parameter.
   */

  @DISPID(14942) //= 0x3a5e. The runtime will prefer the VTID if present
  @VTID(151)
  void homeAddressPostOfficeBox(
    java.lang.String homeAddressPostOfficeBox);


  /**
   * <p>
   * Getter method for the COM property "HomeAddressState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14940) //= 0x3a5c. The runtime will prefer the VTID if present
  @VTID(152)
  java.lang.String homeAddressState();


  /**
   * <p>
   * Setter method for the COM property "HomeAddressState"
   * </p>
   * @param homeAddressState Mandatory java.lang.String parameter.
   */

  @DISPID(14940) //= 0x3a5c. The runtime will prefer the VTID if present
  @VTID(153)
  void homeAddressState(
    java.lang.String homeAddressState);


  /**
   * <p>
   * Getter method for the COM property "HomeAddressStreet"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14941) //= 0x3a5d. The runtime will prefer the VTID if present
  @VTID(154)
  java.lang.String homeAddressStreet();


  /**
   * <p>
   * Setter method for the COM property "HomeAddressStreet"
   * </p>
   * @param homeAddressStreet Mandatory java.lang.String parameter.
   */

  @DISPID(14941) //= 0x3a5d. The runtime will prefer the VTID if present
  @VTID(155)
  void homeAddressStreet(
    java.lang.String homeAddressStreet);


  /**
   * <p>
   * Getter method for the COM property "HomeFaxNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14885) //= 0x3a25. The runtime will prefer the VTID if present
  @VTID(156)
  java.lang.String homeFaxNumber();


  /**
   * <p>
   * Setter method for the COM property "HomeFaxNumber"
   * </p>
   * @param homeFaxNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14885) //= 0x3a25. The runtime will prefer the VTID if present
  @VTID(157)
  void homeFaxNumber(
    java.lang.String homeFaxNumber);


  /**
   * <p>
   * Getter method for the COM property "HomeTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14857) //= 0x3a09. The runtime will prefer the VTID if present
  @VTID(158)
  java.lang.String homeTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "HomeTelephoneNumber"
   * </p>
   * @param homeTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14857) //= 0x3a09. The runtime will prefer the VTID if present
  @VTID(159)
  void homeTelephoneNumber(
    java.lang.String homeTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "Initials"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14858) //= 0x3a0a. The runtime will prefer the VTID if present
  @VTID(160)
  java.lang.String initials();


  /**
   * <p>
   * Setter method for the COM property "Initials"
   * </p>
   * @param initials Mandatory java.lang.String parameter.
   */

  @DISPID(14858) //= 0x3a0a. The runtime will prefer the VTID if present
  @VTID(161)
  void initials(
    java.lang.String initials);


  /**
   * <p>
   * Getter method for the COM property "InternetFreeBusyAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32984) //= 0x80d8. The runtime will prefer the VTID if present
  @VTID(162)
  java.lang.String internetFreeBusyAddress();


  /**
   * <p>
   * Setter method for the COM property "InternetFreeBusyAddress"
   * </p>
   * @param internetFreeBusyAddress Mandatory java.lang.String parameter.
   */

  @DISPID(32984) //= 0x80d8. The runtime will prefer the VTID if present
  @VTID(163)
  void internetFreeBusyAddress(
    java.lang.String internetFreeBusyAddress);


  /**
   * <p>
   * Getter method for the COM property "ISDNNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14893) //= 0x3a2d. The runtime will prefer the VTID if present
  @VTID(164)
  java.lang.String isdnNumber();


  /**
   * <p>
   * Setter method for the COM property "ISDNNumber"
   * </p>
   * @param isdnNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14893) //= 0x3a2d. The runtime will prefer the VTID if present
  @VTID(165)
  void isdnNumber(
    java.lang.String isdnNumber);


  /**
   * <p>
   * Getter method for the COM property "JobTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14871) //= 0x3a17. The runtime will prefer the VTID if present
  @VTID(166)
  java.lang.String jobTitle();


  /**
   * <p>
   * Setter method for the COM property "JobTitle"
   * </p>
   * @param jobTitle Mandatory java.lang.String parameter.
   */

  @DISPID(14871) //= 0x3a17. The runtime will prefer the VTID if present
  @VTID(167)
  void jobTitle(
    java.lang.String jobTitle);


  /**
   * <p>
   * Getter method for the COM property "Journal"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(32805) //= 0x8025. The runtime will prefer the VTID if present
  @VTID(168)
  boolean journal();


  /**
   * <p>
   * Setter method for the COM property "Journal"
   * </p>
   * @param journal Mandatory boolean parameter.
   */

  @DISPID(32805) //= 0x8025. The runtime will prefer the VTID if present
  @VTID(169)
  void journal(
    boolean journal);


  /**
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14860) //= 0x3a0c. The runtime will prefer the VTID if present
  @VTID(170)
  java.lang.String language();


  /**
   * <p>
   * Setter method for the COM property "Language"
   * </p>
   * @param language Mandatory java.lang.String parameter.
   */

  @DISPID(14860) //= 0x3a0c. The runtime will prefer the VTID if present
  @VTID(171)
  void language(
    java.lang.String language);


  /**
   * <p>
   * Getter method for the COM property "LastFirstAndSuffix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32822) //= 0x8036. The runtime will prefer the VTID if present
  @VTID(172)
  java.lang.String lastFirstAndSuffix();


  /**
   * <p>
   * Getter method for the COM property "LastFirstNoSpace"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32816) //= 0x8030. The runtime will prefer the VTID if present
  @VTID(173)
  java.lang.String lastFirstNoSpace();


  /**
   * <p>
   * Getter method for the COM property "LastFirstNoSpaceCompany"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32820) //= 0x8034. The runtime will prefer the VTID if present
  @VTID(174)
  java.lang.String lastFirstNoSpaceCompany();


  /**
   * <p>
   * Getter method for the COM property "LastFirstSpaceOnly"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32817) //= 0x8031. The runtime will prefer the VTID if present
  @VTID(175)
  java.lang.String lastFirstSpaceOnly();


  /**
   * <p>
   * Getter method for the COM property "LastFirstSpaceOnlyCompany"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32821) //= 0x8035. The runtime will prefer the VTID if present
  @VTID(176)
  java.lang.String lastFirstSpaceOnlyCompany();


  /**
   * <p>
   * Getter method for the COM property "LastName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14865) //= 0x3a11. The runtime will prefer the VTID if present
  @VTID(177)
  java.lang.String lastName();


  /**
   * <p>
   * Setter method for the COM property "LastName"
   * </p>
   * @param lastName Mandatory java.lang.String parameter.
   */

  @DISPID(14865) //= 0x3a11. The runtime will prefer the VTID if present
  @VTID(178)
  void lastName(
    java.lang.String lastName);


  /**
   * <p>
   * Getter method for the COM property "LastNameAndFirstName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32791) //= 0x8017. The runtime will prefer the VTID if present
  @VTID(179)
  java.lang.String lastNameAndFirstName();


  /**
   * <p>
   * Getter method for the COM property "MailingAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14869) //= 0x3a15. The runtime will prefer the VTID if present
  @VTID(180)
  java.lang.String mailingAddress();


  /**
   * <p>
   * Setter method for the COM property "MailingAddress"
   * </p>
   * @param mailingAddress Mandatory java.lang.String parameter.
   */

  @DISPID(14869) //= 0x3a15. The runtime will prefer the VTID if present
  @VTID(181)
  void mailingAddress(
    java.lang.String mailingAddress);


  /**
   * <p>
   * Getter method for the COM property "MailingAddressCity"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14887) //= 0x3a27. The runtime will prefer the VTID if present
  @VTID(182)
  java.lang.String mailingAddressCity();


  /**
   * <p>
   * Setter method for the COM property "MailingAddressCity"
   * </p>
   * @param mailingAddressCity Mandatory java.lang.String parameter.
   */

  @DISPID(14887) //= 0x3a27. The runtime will prefer the VTID if present
  @VTID(183)
  void mailingAddressCity(
    java.lang.String mailingAddressCity);


  /**
   * <p>
   * Getter method for the COM property "MailingAddressCountry"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14886) //= 0x3a26. The runtime will prefer the VTID if present
  @VTID(184)
  java.lang.String mailingAddressCountry();


  /**
   * <p>
   * Setter method for the COM property "MailingAddressCountry"
   * </p>
   * @param mailingAddressCountry Mandatory java.lang.String parameter.
   */

  @DISPID(14886) //= 0x3a26. The runtime will prefer the VTID if present
  @VTID(185)
  void mailingAddressCountry(
    java.lang.String mailingAddressCountry);


  /**
   * <p>
   * Getter method for the COM property "MailingAddressPostalCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14890) //= 0x3a2a. The runtime will prefer the VTID if present
  @VTID(186)
  java.lang.String mailingAddressPostalCode();


  /**
   * <p>
   * Setter method for the COM property "MailingAddressPostalCode"
   * </p>
   * @param mailingAddressPostalCode Mandatory java.lang.String parameter.
   */

  @DISPID(14890) //= 0x3a2a. The runtime will prefer the VTID if present
  @VTID(187)
  void mailingAddressPostalCode(
    java.lang.String mailingAddressPostalCode);


  /**
   * <p>
   * Getter method for the COM property "MailingAddressPostOfficeBox"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14891) //= 0x3a2b. The runtime will prefer the VTID if present
  @VTID(188)
  java.lang.String mailingAddressPostOfficeBox();


  /**
   * <p>
   * Setter method for the COM property "MailingAddressPostOfficeBox"
   * </p>
   * @param mailingAddressPostOfficeBox Mandatory java.lang.String parameter.
   */

  @DISPID(14891) //= 0x3a2b. The runtime will prefer the VTID if present
  @VTID(189)
  void mailingAddressPostOfficeBox(
    java.lang.String mailingAddressPostOfficeBox);


  /**
   * <p>
   * Getter method for the COM property "MailingAddressState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14888) //= 0x3a28. The runtime will prefer the VTID if present
  @VTID(190)
  java.lang.String mailingAddressState();


  /**
   * <p>
   * Setter method for the COM property "MailingAddressState"
   * </p>
   * @param mailingAddressState Mandatory java.lang.String parameter.
   */

  @DISPID(14888) //= 0x3a28. The runtime will prefer the VTID if present
  @VTID(191)
  void mailingAddressState(
    java.lang.String mailingAddressState);


  /**
   * <p>
   * Getter method for the COM property "MailingAddressStreet"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14889) //= 0x3a29. The runtime will prefer the VTID if present
  @VTID(192)
  java.lang.String mailingAddressStreet();


  /**
   * <p>
   * Setter method for the COM property "MailingAddressStreet"
   * </p>
   * @param mailingAddressStreet Mandatory java.lang.String parameter.
   */

  @DISPID(14889) //= 0x3a29. The runtime will prefer the VTID if present
  @VTID(193)
  void mailingAddressStreet(
    java.lang.String mailingAddressStreet);


  /**
   * <p>
   * Getter method for the COM property "ManagerName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14926) //= 0x3a4e. The runtime will prefer the VTID if present
  @VTID(194)
  java.lang.String managerName();


  /**
   * <p>
   * Setter method for the COM property "ManagerName"
   * </p>
   * @param managerName Mandatory java.lang.String parameter.
   */

  @DISPID(14926) //= 0x3a4e. The runtime will prefer the VTID if present
  @VTID(195)
  void managerName(
    java.lang.String managerName);


  /**
   * <p>
   * Getter method for the COM property "MiddleName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14916) //= 0x3a44. The runtime will prefer the VTID if present
  @VTID(196)
  java.lang.String middleName();


  /**
   * <p>
   * Setter method for the COM property "MiddleName"
   * </p>
   * @param middleName Mandatory java.lang.String parameter.
   */

  @DISPID(14916) //= 0x3a44. The runtime will prefer the VTID if present
  @VTID(197)
  void middleName(
    java.lang.String middleName);


  /**
   * <p>
   * Getter method for the COM property "MobileTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14876) //= 0x3a1c. The runtime will prefer the VTID if present
  @VTID(198)
  java.lang.String mobileTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "MobileTelephoneNumber"
   * </p>
   * @param mobileTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14876) //= 0x3a1c. The runtime will prefer the VTID if present
  @VTID(199)
  void mobileTelephoneNumber(
    java.lang.String mobileTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "NetMeetingAlias"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32863) //= 0x805f. The runtime will prefer the VTID if present
  @VTID(200)
  java.lang.String netMeetingAlias();


  /**
   * <p>
   * Setter method for the COM property "NetMeetingAlias"
   * </p>
   * @param netMeetingAlias Mandatory java.lang.String parameter.
   */

  @DISPID(32863) //= 0x805f. The runtime will prefer the VTID if present
  @VTID(201)
  void netMeetingAlias(
    java.lang.String netMeetingAlias);


  /**
   * <p>
   * Getter method for the COM property "NetMeetingServer"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32864) //= 0x8060. The runtime will prefer the VTID if present
  @VTID(202)
  java.lang.String netMeetingServer();


  /**
   * <p>
   * Setter method for the COM property "NetMeetingServer"
   * </p>
   * @param netMeetingServer Mandatory java.lang.String parameter.
   */

  @DISPID(32864) //= 0x8060. The runtime will prefer the VTID if present
  @VTID(203)
  void netMeetingServer(
    java.lang.String netMeetingServer);


  /**
   * <p>
   * Getter method for the COM property "NickName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14927) //= 0x3a4f. The runtime will prefer the VTID if present
  @VTID(204)
  java.lang.String nickName();


  /**
   * <p>
   * Setter method for the COM property "NickName"
   * </p>
   * @param nickName Mandatory java.lang.String parameter.
   */

  @DISPID(14927) //= 0x3a4f. The runtime will prefer the VTID if present
  @VTID(205)
  void nickName(
    java.lang.String nickName);


  /**
   * <p>
   * Getter method for the COM property "OfficeLocation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14873) //= 0x3a19. The runtime will prefer the VTID if present
  @VTID(206)
  java.lang.String officeLocation();


  /**
   * <p>
   * Setter method for the COM property "OfficeLocation"
   * </p>
   * @param officeLocation Mandatory java.lang.String parameter.
   */

  @DISPID(14873) //= 0x3a19. The runtime will prefer the VTID if present
  @VTID(207)
  void officeLocation(
    java.lang.String officeLocation);


  /**
   * <p>
   * Getter method for the COM property "OrganizationalIDNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14864) //= 0x3a10. The runtime will prefer the VTID if present
  @VTID(208)
  java.lang.String organizationalIDNumber();


  /**
   * <p>
   * Setter method for the COM property "OrganizationalIDNumber"
   * </p>
   * @param organizationalIDNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14864) //= 0x3a10. The runtime will prefer the VTID if present
  @VTID(209)
  void organizationalIDNumber(
    java.lang.String organizationalIDNumber);


  /**
   * <p>
   * Getter method for the COM property "OtherAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32796) //= 0x801c. The runtime will prefer the VTID if present
  @VTID(210)
  java.lang.String otherAddress();


  /**
   * <p>
   * Setter method for the COM property "OtherAddress"
   * </p>
   * @param otherAddress Mandatory java.lang.String parameter.
   */

  @DISPID(32796) //= 0x801c. The runtime will prefer the VTID if present
  @VTID(211)
  void otherAddress(
    java.lang.String otherAddress);


  /**
   * <p>
   * Getter method for the COM property "OtherAddressCity"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14943) //= 0x3a5f. The runtime will prefer the VTID if present
  @VTID(212)
  java.lang.String otherAddressCity();


  /**
   * <p>
   * Setter method for the COM property "OtherAddressCity"
   * </p>
   * @param otherAddressCity Mandatory java.lang.String parameter.
   */

  @DISPID(14943) //= 0x3a5f. The runtime will prefer the VTID if present
  @VTID(213)
  void otherAddressCity(
    java.lang.String otherAddressCity);


  /**
   * <p>
   * Getter method for the COM property "OtherAddressCountry"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14944) //= 0x3a60. The runtime will prefer the VTID if present
  @VTID(214)
  java.lang.String otherAddressCountry();


  /**
   * <p>
   * Setter method for the COM property "OtherAddressCountry"
   * </p>
   * @param otherAddressCountry Mandatory java.lang.String parameter.
   */

  @DISPID(14944) //= 0x3a60. The runtime will prefer the VTID if present
  @VTID(215)
  void otherAddressCountry(
    java.lang.String otherAddressCountry);


  /**
   * <p>
   * Getter method for the COM property "OtherAddressPostalCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14945) //= 0x3a61. The runtime will prefer the VTID if present
  @VTID(216)
  java.lang.String otherAddressPostalCode();


  /**
   * <p>
   * Setter method for the COM property "OtherAddressPostalCode"
   * </p>
   * @param otherAddressPostalCode Mandatory java.lang.String parameter.
   */

  @DISPID(14945) //= 0x3a61. The runtime will prefer the VTID if present
  @VTID(217)
  void otherAddressPostalCode(
    java.lang.String otherAddressPostalCode);


  /**
   * <p>
   * Getter method for the COM property "OtherAddressPostOfficeBox"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14948) //= 0x3a64. The runtime will prefer the VTID if present
  @VTID(218)
  java.lang.String otherAddressPostOfficeBox();


  /**
   * <p>
   * Setter method for the COM property "OtherAddressPostOfficeBox"
   * </p>
   * @param otherAddressPostOfficeBox Mandatory java.lang.String parameter.
   */

  @DISPID(14948) //= 0x3a64. The runtime will prefer the VTID if present
  @VTID(219)
  void otherAddressPostOfficeBox(
    java.lang.String otherAddressPostOfficeBox);


  /**
   * <p>
   * Getter method for the COM property "OtherAddressState"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14946) //= 0x3a62. The runtime will prefer the VTID if present
  @VTID(220)
  java.lang.String otherAddressState();


  /**
   * <p>
   * Setter method for the COM property "OtherAddressState"
   * </p>
   * @param otherAddressState Mandatory java.lang.String parameter.
   */

  @DISPID(14946) //= 0x3a62. The runtime will prefer the VTID if present
  @VTID(221)
  void otherAddressState(
    java.lang.String otherAddressState);


  /**
   * <p>
   * Getter method for the COM property "OtherAddressStreet"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14947) //= 0x3a63. The runtime will prefer the VTID if present
  @VTID(222)
  java.lang.String otherAddressStreet();


  /**
   * <p>
   * Setter method for the COM property "OtherAddressStreet"
   * </p>
   * @param otherAddressStreet Mandatory java.lang.String parameter.
   */

  @DISPID(14947) //= 0x3a63. The runtime will prefer the VTID if present
  @VTID(223)
  void otherAddressStreet(
    java.lang.String otherAddressStreet);


  /**
   * <p>
   * Getter method for the COM property "OtherFaxNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14883) //= 0x3a23. The runtime will prefer the VTID if present
  @VTID(224)
  java.lang.String otherFaxNumber();


  /**
   * <p>
   * Setter method for the COM property "OtherFaxNumber"
   * </p>
   * @param otherFaxNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14883) //= 0x3a23. The runtime will prefer the VTID if present
  @VTID(225)
  void otherFaxNumber(
    java.lang.String otherFaxNumber);


  /**
   * <p>
   * Getter method for the COM property "OtherTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14879) //= 0x3a1f. The runtime will prefer the VTID if present
  @VTID(226)
  java.lang.String otherTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "OtherTelephoneNumber"
   * </p>
   * @param otherTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14879) //= 0x3a1f. The runtime will prefer the VTID if present
  @VTID(227)
  void otherTelephoneNumber(
    java.lang.String otherTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "PagerNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14881) //= 0x3a21. The runtime will prefer the VTID if present
  @VTID(228)
  java.lang.String pagerNumber();


  /**
   * <p>
   * Setter method for the COM property "PagerNumber"
   * </p>
   * @param pagerNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14881) //= 0x3a21. The runtime will prefer the VTID if present
  @VTID(229)
  void pagerNumber(
    java.lang.String pagerNumber);


  /**
   * <p>
   * Getter method for the COM property "PersonalHomePage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14928) //= 0x3a50. The runtime will prefer the VTID if present
  @VTID(230)
  java.lang.String personalHomePage();


  /**
   * <p>
   * Setter method for the COM property "PersonalHomePage"
   * </p>
   * @param personalHomePage Mandatory java.lang.String parameter.
   */

  @DISPID(14928) //= 0x3a50. The runtime will prefer the VTID if present
  @VTID(231)
  void personalHomePage(
    java.lang.String personalHomePage);


  /**
   * <p>
   * Getter method for the COM property "PrimaryTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14874) //= 0x3a1a. The runtime will prefer the VTID if present
  @VTID(232)
  java.lang.String primaryTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "PrimaryTelephoneNumber"
   * </p>
   * @param primaryTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14874) //= 0x3a1a. The runtime will prefer the VTID if present
  @VTID(233)
  void primaryTelephoneNumber(
    java.lang.String primaryTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "Profession"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14918) //= 0x3a46. The runtime will prefer the VTID if present
  @VTID(234)
  java.lang.String profession();


  /**
   * <p>
   * Setter method for the COM property "Profession"
   * </p>
   * @param profession Mandatory java.lang.String parameter.
   */

  @DISPID(14918) //= 0x3a46. The runtime will prefer the VTID if present
  @VTID(235)
  void profession(
    java.lang.String profession);


  /**
   * <p>
   * Getter method for the COM property "RadioTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14877) //= 0x3a1d. The runtime will prefer the VTID if present
  @VTID(236)
  java.lang.String radioTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "RadioTelephoneNumber"
   * </p>
   * @param radioTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14877) //= 0x3a1d. The runtime will prefer the VTID if present
  @VTID(237)
  void radioTelephoneNumber(
    java.lang.String radioTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "ReferredBy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14919) //= 0x3a47. The runtime will prefer the VTID if present
  @VTID(238)
  java.lang.String referredBy();


  /**
   * <p>
   * Setter method for the COM property "ReferredBy"
   * </p>
   * @param referredBy Mandatory java.lang.String parameter.
   */

  @DISPID(14919) //= 0x3a47. The runtime will prefer the VTID if present
  @VTID(239)
  void referredBy(
    java.lang.String referredBy);


  /**
   * <p>
   * Getter method for the COM property "SelectedMailingAddress"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlMailingAddress
   */

  @DISPID(32802) //= 0x8022. The runtime will prefer the VTID if present
  @VTID(240)
  RT_MSOutlook.OlMailingAddress selectedMailingAddress();


  /**
   * <p>
   * Setter method for the COM property "SelectedMailingAddress"
   * </p>
   * @param selectedMailingAddress Mandatory RT_MSOutlook.OlMailingAddress parameter.
   */

  @DISPID(32802) //= 0x8022. The runtime will prefer the VTID if present
  @VTID(241)
  void selectedMailingAddress(
    RT_MSOutlook.OlMailingAddress selectedMailingAddress);


  /**
   * <p>
   * Getter method for the COM property "Spouse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14920) //= 0x3a48. The runtime will prefer the VTID if present
  @VTID(242)
  java.lang.String spouse();


  /**
   * <p>
   * Setter method for the COM property "Spouse"
   * </p>
   * @param spouse Mandatory java.lang.String parameter.
   */

  @DISPID(14920) //= 0x3a48. The runtime will prefer the VTID if present
  @VTID(243)
  void spouse(
    java.lang.String spouse);


  /**
   * <p>
   * Getter method for the COM property "Suffix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14853) //= 0x3a05. The runtime will prefer the VTID if present
  @VTID(244)
  java.lang.String suffix();


  /**
   * <p>
   * Setter method for the COM property "Suffix"
   * </p>
   * @param suffix Mandatory java.lang.String parameter.
   */

  @DISPID(14853) //= 0x3a05. The runtime will prefer the VTID if present
  @VTID(245)
  void suffix(
    java.lang.String suffix);


  /**
   * <p>
   * Getter method for the COM property "TelexNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14892) //= 0x3a2c. The runtime will prefer the VTID if present
  @VTID(246)
  java.lang.String telexNumber();


  /**
   * <p>
   * Setter method for the COM property "TelexNumber"
   * </p>
   * @param telexNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14892) //= 0x3a2c. The runtime will prefer the VTID if present
  @VTID(247)
  void telexNumber(
    java.lang.String telexNumber);


  /**
   * <p>
   * Getter method for the COM property "Title"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14917) //= 0x3a45. The runtime will prefer the VTID if present
  @VTID(248)
  java.lang.String title();


  /**
   * <p>
   * Setter method for the COM property "Title"
   * </p>
   * @param title Mandatory java.lang.String parameter.
   */

  @DISPID(14917) //= 0x3a45. The runtime will prefer the VTID if present
  @VTID(249)
  void title(
    java.lang.String title);


  /**
   * <p>
   * Getter method for the COM property "TTYTDDTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14923) //= 0x3a4b. The runtime will prefer the VTID if present
  @VTID(250)
  java.lang.String ttytddTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "TTYTDDTelephoneNumber"
   * </p>
   * @param ttytddTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14923) //= 0x3a4b. The runtime will prefer the VTID if present
  @VTID(251)
  void ttytddTelephoneNumber(
    java.lang.String ttytddTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "User1"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32847) //= 0x804f. The runtime will prefer the VTID if present
  @VTID(252)
  java.lang.String user1();


  /**
   * <p>
   * Setter method for the COM property "User1"
   * </p>
   * @param user1 Mandatory java.lang.String parameter.
   */

  @DISPID(32847) //= 0x804f. The runtime will prefer the VTID if present
  @VTID(253)
  void user1(
    java.lang.String user1);


  /**
   * <p>
   * Getter method for the COM property "User2"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32848) //= 0x8050. The runtime will prefer the VTID if present
  @VTID(254)
  java.lang.String user2();


  /**
   * <p>
   * Setter method for the COM property "User2"
   * </p>
   * @param user2 Mandatory java.lang.String parameter.
   */

  @DISPID(32848) //= 0x8050. The runtime will prefer the VTID if present
  @VTID(255)
  void user2(
    java.lang.String user2);


  /**
   * <p>
   * Getter method for the COM property "User3"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32849) //= 0x8051. The runtime will prefer the VTID if present
  @VTID(256)
  java.lang.String user3();


  /**
   * <p>
   * Setter method for the COM property "User3"
   * </p>
   * @param user3 Mandatory java.lang.String parameter.
   */

  @DISPID(32849) //= 0x8051. The runtime will prefer the VTID if present
  @VTID(257)
  void user3(
    java.lang.String user3);


  /**
   * <p>
   * Getter method for the COM property "User4"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32850) //= 0x8052. The runtime will prefer the VTID if present
  @VTID(258)
  java.lang.String user4();


  /**
   * <p>
   * Setter method for the COM property "User4"
   * </p>
   * @param user4 Mandatory java.lang.String parameter.
   */

  @DISPID(32850) //= 0x8052. The runtime will prefer the VTID if present
  @VTID(259)
  void user4(
    java.lang.String user4);


  /**
   * <p>
   * Getter method for the COM property "UserCertificate"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32790) //= 0x8016. The runtime will prefer the VTID if present
  @VTID(260)
  java.lang.String userCertificate();


  /**
   * <p>
   * Setter method for the COM property "UserCertificate"
   * </p>
   * @param userCertificate Mandatory java.lang.String parameter.
   */

  @DISPID(32790) //= 0x8016. The runtime will prefer the VTID if present
  @VTID(261)
  void userCertificate(
    java.lang.String userCertificate);


  /**
   * <p>
   * Getter method for the COM property "WebPage"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32811) //= 0x802b. The runtime will prefer the VTID if present
  @VTID(262)
  java.lang.String webPage();


  /**
   * <p>
   * Setter method for the COM property "WebPage"
   * </p>
   * @param webPage Mandatory java.lang.String parameter.
   */

  @DISPID(32811) //= 0x802b. The runtime will prefer the VTID if present
  @VTID(263)
  void webPage(
    java.lang.String webPage);


  /**
   * <p>
   * Getter method for the COM property "YomiCompanyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32814) //= 0x802e. The runtime will prefer the VTID if present
  @VTID(264)
  java.lang.String yomiCompanyName();


  /**
   * <p>
   * Setter method for the COM property "YomiCompanyName"
   * </p>
   * @param yomiCompanyName Mandatory java.lang.String parameter.
   */

  @DISPID(32814) //= 0x802e. The runtime will prefer the VTID if present
  @VTID(265)
  void yomiCompanyName(
    java.lang.String yomiCompanyName);


  /**
   * <p>
   * Getter method for the COM property "YomiFirstName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32812) //= 0x802c. The runtime will prefer the VTID if present
  @VTID(266)
  java.lang.String yomiFirstName();


  /**
   * <p>
   * Setter method for the COM property "YomiFirstName"
   * </p>
   * @param yomiFirstName Mandatory java.lang.String parameter.
   */

  @DISPID(32812) //= 0x802c. The runtime will prefer the VTID if present
  @VTID(267)
  void yomiFirstName(
    java.lang.String yomiFirstName);


  /**
   * <p>
   * Getter method for the COM property "YomiLastName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32813) //= 0x802d. The runtime will prefer the VTID if present
  @VTID(268)
  java.lang.String yomiLastName();


  /**
   * <p>
   * Setter method for the COM property "YomiLastName"
   * </p>
   * @param yomiLastName Mandatory java.lang.String parameter.
   */

  @DISPID(32813) //= 0x802d. The runtime will prefer the VTID if present
  @VTID(269)
  void yomiLastName(
    java.lang.String yomiLastName);


  /**
   * @return  Returns a value of type RT_MSOutlook._MailItem
   */

  @DISPID(63649) //= 0xf8a1. The runtime will prefer the VTID if present
  @VTID(270)
  RT_MSOutlook._MailItem forwardAsVcard();


  /**
   * <p>
   * Getter method for the COM property "Links"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Links
   */

  @DISPID(62469) //= 0xf405. The runtime will prefer the VTID if present
  @VTID(271)
  RT_MSOutlook.Links links();


  /**
   * <p>
   * Getter method for the COM property "ItemProperties"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.ItemProperties
   */

  @DISPID(64009) //= 0xfa09. The runtime will prefer the VTID if present
  @VTID(272)
  RT_MSOutlook.ItemProperties itemProperties();


  @VTID(272)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook.ItemProperties.class})
  RT_MSOutlook.ItemProperty itemProperties(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "LastFirstNoSpaceAndSuffix"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32824) //= 0x8038. The runtime will prefer the VTID if present
  @VTID(273)
  java.lang.String lastFirstNoSpaceAndSuffix();


  /**
   * <p>
   * Getter method for the COM property "DownloadState"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlDownloadState
   */

  @DISPID(64077) //= 0xfa4d. The runtime will prefer the VTID if present
  @VTID(274)
  RT_MSOutlook.OlDownloadState downloadState();


  /**
   */

  @DISPID(64011) //= 0xfa0b. The runtime will prefer the VTID if present
  @VTID(275)
  void showCategoriesDialog();


  /**
   * <p>
   * Getter method for the COM property "IMAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32866) //= 0x8062. The runtime will prefer the VTID if present
  @VTID(276)
  java.lang.String imAddress();


  /**
   * <p>
   * Setter method for the COM property "IMAddress"
   * </p>
   * @param imAddress Mandatory java.lang.String parameter.
   */

  @DISPID(32866) //= 0x8062. The runtime will prefer the VTID if present
  @VTID(277)
  void imAddress(
    java.lang.String imAddress);


  /**
   * <p>
   * Getter method for the COM property "MarkForDownload"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlRemoteStatus
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(278)
  RT_MSOutlook.OlRemoteStatus markForDownload();


  /**
   * <p>
   * Setter method for the COM property "MarkForDownload"
   * </p>
   * @param markForDownload Mandatory RT_MSOutlook.OlRemoteStatus parameter.
   */

  @DISPID(34161) //= 0x8571. The runtime will prefer the VTID if present
  @VTID(279)
  void markForDownload(
    RT_MSOutlook.OlRemoteStatus markForDownload);


  /**
   * <p>
   * Setter method for the COM property "Email1DisplayName"
   * </p>
   * @param email1DisplayName Mandatory java.lang.String parameter.
   */

  @DISPID(32896) //= 0x8080. The runtime will prefer the VTID if present
  @VTID(280)
  void email1DisplayName(
    java.lang.String email1DisplayName);


  /**
   * <p>
   * Setter method for the COM property "Email2DisplayName"
   * </p>
   * @param email2DisplayName Mandatory java.lang.String parameter.
   */

  @DISPID(32912) //= 0x8090. The runtime will prefer the VTID if present
  @VTID(281)
  void email2DisplayName(
    java.lang.String email2DisplayName);


  /**
   * <p>
   * Setter method for the COM property "Email3DisplayName"
   * </p>
   * @param email3DisplayName Mandatory java.lang.String parameter.
   */

  @DISPID(32928) //= 0x80a0. The runtime will prefer the VTID if present
  @VTID(282)
  void email3DisplayName(
    java.lang.String email3DisplayName);


  /**
   * <p>
   * Getter method for the COM property "IsConflict"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64164) //= 0xfaa4. The runtime will prefer the VTID if present
  @VTID(283)
  boolean isConflict();


  /**
   * <p>
   * Getter method for the COM property "AutoResolvedWinner"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64186) //= 0xfaba. The runtime will prefer the VTID if present
  @VTID(284)
  boolean autoResolvedWinner();


  /**
   * <p>
   * Getter method for the COM property "Conflicts"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Conflicts
   */

  @DISPID(64187) //= 0xfabb. The runtime will prefer the VTID if present
  @VTID(285)
  RT_MSOutlook.Conflicts conflicts();


  /**
   * @param path Mandatory java.lang.String parameter.
   */

  @DISPID(64189) //= 0xfabd. The runtime will prefer the VTID if present
  @VTID(286)
  void addPicture(
    java.lang.String path);


  /**
   */

  @DISPID(64190) //= 0xfabe. The runtime will prefer the VTID if present
  @VTID(287)
  void removePicture();


  /**
   * <p>
   * Getter method for the COM property "HasPicture"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64191) //= 0xfabf. The runtime will prefer the VTID if present
  @VTID(288)
  boolean hasPicture();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(289)
  RT_MSOutlook._PropertyAccessor propertyAccessor();


  /**
   * @return  Returns a value of type RT_MSOutlook._MailItem
   */

  @DISPID(64404) //= 0xfb94. The runtime will prefer the VTID if present
  @VTID(290)
  RT_MSOutlook._MailItem forwardAsBusinessCard();


  /**
   */

  @DISPID(64405) //= 0xfb95. The runtime will prefer the VTID if present
  @VTID(291)
  void showBusinessCardEditor();


  /**
   * @param path Mandatory java.lang.String parameter.
   */

  @DISPID(64407) //= 0xfb97. The runtime will prefer the VTID if present
  @VTID(292)
  void saveBusinessCardImage(
    java.lang.String path);


  /**
   * @param phoneNumber Mandatory RT_MSOutlook.OlContactPhoneNumber parameter.
   */

  @DISPID(64471) //= 0xfbd7. The runtime will prefer the VTID if present
  @VTID(293)
  void showCheckPhoneDialog(
    RT_MSOutlook.OlContactPhoneNumber phoneNumber);


  /**
   * <p>
   * Getter method for the COM property "TaskSubject"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64543) //= 0xfc1f. The runtime will prefer the VTID if present
  @VTID(294)
  java.lang.String taskSubject();


  /**
   * <p>
   * Setter method for the COM property "TaskSubject"
   * </p>
   * @param taskSubject Mandatory java.lang.String parameter.
   */

  @DISPID(64543) //= 0xfc1f. The runtime will prefer the VTID if present
  @VTID(295)
  void taskSubject(
    java.lang.String taskSubject);


  /**
   * <p>
   * Getter method for the COM property "TaskDueDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33029) //= 0x8105. The runtime will prefer the VTID if present
  @VTID(296)
  java.util.Date taskDueDate();


  /**
   * <p>
   * Setter method for the COM property "TaskDueDate"
   * </p>
   * @param taskDueDate Mandatory java.util.Date parameter.
   */

  @DISPID(33029) //= 0x8105. The runtime will prefer the VTID if present
  @VTID(297)
  void taskDueDate(
    java.util.Date taskDueDate);


  /**
   * <p>
   * Getter method for the COM property "TaskStartDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33028) //= 0x8104. The runtime will prefer the VTID if present
  @VTID(298)
  java.util.Date taskStartDate();


  /**
   * <p>
   * Setter method for the COM property "TaskStartDate"
   * </p>
   * @param taskStartDate Mandatory java.util.Date parameter.
   */

  @DISPID(33028) //= 0x8104. The runtime will prefer the VTID if present
  @VTID(299)
  void taskStartDate(
    java.util.Date taskStartDate);


  /**
   * <p>
   * Getter method for the COM property "TaskCompletedDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(33039) //= 0x810f. The runtime will prefer the VTID if present
  @VTID(300)
  java.util.Date taskCompletedDate();


  /**
   * <p>
   * Setter method for the COM property "TaskCompletedDate"
   * </p>
   * @param taskCompletedDate Mandatory java.util.Date parameter.
   */

  @DISPID(33039) //= 0x810f. The runtime will prefer the VTID if present
  @VTID(301)
  void taskCompletedDate(
    java.util.Date taskCompletedDate);


  /**
   * <p>
   * Getter method for the COM property "ToDoTaskOrdinal"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(34208) //= 0x85a0. The runtime will prefer the VTID if present
  @VTID(302)
  java.util.Date toDoTaskOrdinal();


  /**
   * <p>
   * Setter method for the COM property "ToDoTaskOrdinal"
   * </p>
   * @param toDoTaskOrdinal Mandatory java.util.Date parameter.
   */

  @DISPID(34208) //= 0x85a0. The runtime will prefer the VTID if present
  @VTID(303)
  void toDoTaskOrdinal(
    java.util.Date toDoTaskOrdinal);


  /**
   * <p>
   * Getter method for the COM property "ReminderOverrideDefault"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34076) //= 0x851c. The runtime will prefer the VTID if present
  @VTID(304)
  boolean reminderOverrideDefault();


  /**
   * <p>
   * Setter method for the COM property "ReminderOverrideDefault"
   * </p>
   * @param reminderOverrideDefault Mandatory boolean parameter.
   */

  @DISPID(34076) //= 0x851c. The runtime will prefer the VTID if present
  @VTID(305)
  void reminderOverrideDefault(
    boolean reminderOverrideDefault);


  /**
   * <p>
   * Getter method for the COM property "ReminderPlaySound"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34078) //= 0x851e. The runtime will prefer the VTID if present
  @VTID(306)
  boolean reminderPlaySound();


  /**
   * <p>
   * Setter method for the COM property "ReminderPlaySound"
   * </p>
   * @param reminderPlaySound Mandatory boolean parameter.
   */

  @DISPID(34078) //= 0x851e. The runtime will prefer the VTID if present
  @VTID(307)
  void reminderPlaySound(
    boolean reminderPlaySound);


  /**
   * <p>
   * Getter method for the COM property "ReminderSet"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(308)
  boolean reminderSet();


  /**
   * <p>
   * Setter method for the COM property "ReminderSet"
   * </p>
   * @param reminderSet Mandatory boolean parameter.
   */

  @DISPID(34051) //= 0x8503. The runtime will prefer the VTID if present
  @VTID(309)
  void reminderSet(
    boolean reminderSet);


  /**
   * <p>
   * Getter method for the COM property "ReminderSoundFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(34079) //= 0x851f. The runtime will prefer the VTID if present
  @VTID(310)
  java.lang.String reminderSoundFile();


  /**
   * <p>
   * Setter method for the COM property "ReminderSoundFile"
   * </p>
   * @param reminderSoundFile Mandatory java.lang.String parameter.
   */

  @DISPID(34079) //= 0x851f. The runtime will prefer the VTID if present
  @VTID(311)
  void reminderSoundFile(
    java.lang.String reminderSoundFile);


  /**
   * <p>
   * Getter method for the COM property "ReminderTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(34050) //= 0x8502. The runtime will prefer the VTID if present
  @VTID(312)
  java.util.Date reminderTime();


  /**
   * <p>
   * Setter method for the COM property "ReminderTime"
   * </p>
   * @param reminderTime Mandatory java.util.Date parameter.
   */

  @DISPID(34050) //= 0x8502. The runtime will prefer the VTID if present
  @VTID(313)
  void reminderTime(
    java.util.Date reminderTime);


  /**
   * @param markInterval Mandatory RT_MSOutlook.OlMarkInterval parameter.
   */

  @DISPID(64510) //= 0xfbfe. The runtime will prefer the VTID if present
  @VTID(314)
  void markAsTask(
    RT_MSOutlook.OlMarkInterval markInterval);


  /**
   */

  @DISPID(64521) //= 0xfc09. The runtime will prefer the VTID if present
  @VTID(315)
  void clearTaskFlag();


  /**
   * <p>
   * Getter method for the COM property "IsMarkedAsTask"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64522) //= 0xfc0a. The runtime will prefer the VTID if present
  @VTID(316)
  boolean isMarkedAsTask();


  /**
   * <p>
   * Getter method for the COM property "BusinessCardLayoutXml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64525) //= 0xfc0d. The runtime will prefer the VTID if present
  @VTID(317)
  java.lang.String businessCardLayoutXml();


  /**
   * <p>
   * Setter method for the COM property "BusinessCardLayoutXml"
   * </p>
   * @param businessCardLayoutXml Mandatory java.lang.String parameter.
   */

  @DISPID(64525) //= 0xfc0d. The runtime will prefer the VTID if present
  @VTID(318)
  void businessCardLayoutXml(
    java.lang.String businessCardLayoutXml);


  /**
   */

  @DISPID(64526) //= 0xfc0e. The runtime will prefer the VTID if present
  @VTID(319)
  void resetBusinessCard();


  /**
   * @param path Mandatory java.lang.String parameter.
   */

  @DISPID(64527) //= 0xfc0f. The runtime will prefer the VTID if present
  @VTID(320)
  void addBusinessCardLogoPicture(
    java.lang.String path);


  /**
   * <p>
   * Getter method for the COM property "BusinessCardType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlBusinessCardType
   */

  @DISPID(64528) //= 0xfc10. The runtime will prefer the VTID if present
  @VTID(321)
  RT_MSOutlook.OlBusinessCardType businessCardType();


  /**
   * @return  Returns a value of type RT_MSOutlook._Conversation
   */

  @DISPID(64596) //= 0xfc54. The runtime will prefer the VTID if present
  @VTID(322)
  RT_MSOutlook._Conversation getConversation();


  /**
   * <p>
   * Getter method for the COM property "ConversationID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64629) //= 0xfc75. The runtime will prefer the VTID if present
  @VTID(323)
  java.lang.String conversationID();


  /**
   * <p>
   * Getter method for the COM property "RTFBody"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(324)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object rtfBody();


  /**
   * <p>
   * Setter method for the COM property "RTFBody"
   * </p>
   * @param rtfBody Mandatory java.lang.Object parameter.
   */

  @DISPID(64644) //= 0xfc84. The runtime will prefer the VTID if present
  @VTID(325)
  void rtfBody(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rtfBody);


  /**
   */

  @DISPID(64657) //= 0xfc91. The runtime will prefer the VTID if present
  @VTID(326)
  void showCheckFullNameDialog();


  /**
   * @param mailingAddress Mandatory RT_MSOutlook.OlMailingAddress parameter.
   */

  @DISPID(64656) //= 0xfc90. The runtime will prefer the VTID if present
  @VTID(327)
  void showCheckAddressDialog(
    RT_MSOutlook.OlMailingAddress mailingAddress);


  // Properties:
}

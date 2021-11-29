package RT_MSOutlook  ;

import com4j.*;
import com4j.stdole.IPictureDisp;

@IID("{000630C9-0000-0000-C000-000000000046}")
public interface _ExchangeUser extends Com4jObject {
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
   * Getter method for the COM property "Address"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12291) //= 0x3003. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String address();


  /**
   * <p>
   * Setter method for the COM property "Address"
   * </p>
   * @param address Mandatory java.lang.String parameter.
   */

  @DISPID(12291) //= 0x3003. The runtime will prefer the VTID if present
  @VTID(12)
  void address(
    java.lang.String address);


  /**
   * <p>
   * Getter method for the COM property "DisplayType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlDisplayType
   */

  @DISPID(14592) //= 0x3900. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.OlDisplayType displayType();


  /**
   * <p>
   * Getter method for the COM property "ID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String id();


  /**
   * <p>
   * Getter method for the COM property "Manager"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.AddressEntry
   */

  @DISPID(771) //= 0x303. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.AddressEntry manager();


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(16)
  com4j.Com4jObject mapiobject();


  /**
   * <p>
   * Setter method for the COM property "MAPIOBJECT"
   * </p>
   * @param mapiobject Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(17)
  void mapiobject(
    com4j.Com4jObject mapiobject);


  /**
   * <p>
   * Getter method for the COM property "Members"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.AddressEntries
   */

  @DISPID(772) //= 0x304. The runtime will prefer the VTID if present
  @VTID(18)
  RT_MSOutlook.AddressEntries members();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(20)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12290) //= 0x3002. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory java.lang.String parameter.
   */

  @DISPID(12290) //= 0x3002. The runtime will prefer the VTID if present
  @VTID(22)
  void type(
    java.lang.String type);


  /**
   */

  @DISPID(770) //= 0x302. The runtime will prefer the VTID if present
  @VTID(23)
  void delete();


  /**
   * @param hWnd Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(769) //= 0x301. The runtime will prefer the VTID if present
  @VTID(24)
  void details(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hWnd);


  /**
   * @param start Mandatory java.util.Date parameter.
   * @param minPerChar Mandatory int parameter.
   * @param completeFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(774) //= 0x306. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String getFreeBusy(
    java.util.Date start,
    int minPerChar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object completeFormat);


  /**
   * @param makePermanent Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refresh Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(768) //= 0x300. The runtime will prefer the VTID if present
  @VTID(26)
  void update(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object makePermanent,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refresh);


  /**
   */

  @DISPID(775) //= 0x307. The runtime will prefer the VTID if present
  @VTID(27)
  void updateFreeBusy();


  /**
   * @return  Returns a value of type RT_MSOutlook._ContactItem
   */

  @DISPID(64240) //= 0xfaf0. The runtime will prefer the VTID if present
  @VTID(28)
  RT_MSOutlook._ContactItem getContact();


  /**
   * @return  Returns a value of type RT_MSOutlook._ExchangeUser
   */

  @DISPID(64241) //= 0xfaf1. The runtime will prefer the VTID if present
  @VTID(29)
  RT_MSOutlook._ExchangeUser getExchangeUser();


  /**
   * <p>
   * Getter method for the COM property "AddressEntryUserType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlAddressEntryUserType
   */

  @DISPID(64242) //= 0xfaf2. The runtime will prefer the VTID if present
  @VTID(30)
  RT_MSOutlook.OlAddressEntryUserType addressEntryUserType();


  /**
   * @return  Returns a value of type RT_MSOutlook._ExchangeDistributionList
   */

  @DISPID(64239) //= 0xfaef. The runtime will prefer the VTID if present
  @VTID(31)
  RT_MSOutlook._ExchangeDistributionList getExchangeDistributionList();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(32)
  RT_MSOutlook._PropertyAccessor propertyAccessor();


  /**
   * @return  Returns a value of type RT_MSOutlook.AddressEntries
   */

  @DISPID(64243) //= 0xfaf3. The runtime will prefer the VTID if present
  @VTID(33)
  RT_MSOutlook.AddressEntries getDirectReports();


  /**
   * @return  Returns a value of type RT_MSOutlook.AddressEntries
   */

  @DISPID(64244) //= 0xfaf4. The runtime will prefer the VTID if present
  @VTID(34)
  RT_MSOutlook.AddressEntries getMemberOfList();


  /**
   * <p>
   * Getter method for the COM property "Alias"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14848) //= 0x3a00. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String alias();


  /**
   * <p>
   * Getter method for the COM property "AssistantName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14896) //= 0x3a30. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String assistantName();


  /**
   * <p>
   * Setter method for the COM property "AssistantName"
   * </p>
   * @param assistantName Mandatory java.lang.String parameter.
   */

  @DISPID(14896) //= 0x3a30. The runtime will prefer the VTID if present
  @VTID(37)
  void assistantName(
    java.lang.String assistantName);


  /**
   * <p>
   * Getter method for the COM property "BusinessTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14856) //= 0x3a08. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String businessTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "BusinessTelephoneNumber"
   * </p>
   * @param businessTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14856) //= 0x3a08. The runtime will prefer the VTID if present
  @VTID(39)
  void businessTelephoneNumber(
    java.lang.String businessTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "City"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14887) //= 0x3a27. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String city();


  /**
   * <p>
   * Setter method for the COM property "City"
   * </p>
   * @param city Mandatory java.lang.String parameter.
   */

  @DISPID(14887) //= 0x3a27. The runtime will prefer the VTID if present
  @VTID(41)
  void city(
    java.lang.String city);


  /**
   * <p>
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String comments();


  /**
   * <p>
   * Setter method for the COM property "Comments"
   * </p>
   * @param comments Mandatory java.lang.String parameter.
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(43)
  void comments(
    java.lang.String comments);


  /**
   * <p>
   * Getter method for the COM property "CompanyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14870) //= 0x3a16. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String companyName();


  /**
   * <p>
   * Setter method for the COM property "CompanyName"
   * </p>
   * @param companyName Mandatory java.lang.String parameter.
   */

  @DISPID(14870) //= 0x3a16. The runtime will prefer the VTID if present
  @VTID(45)
  void companyName(
    java.lang.String companyName);


  /**
   * <p>
   * Getter method for the COM property "Department"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14872) //= 0x3a18. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String department();


  /**
   * <p>
   * Setter method for the COM property "Department"
   * </p>
   * @param department Mandatory java.lang.String parameter.
   */

  @DISPID(14872) //= 0x3a18. The runtime will prefer the VTID if present
  @VTID(47)
  void department(
    java.lang.String department);


  /**
   * <p>
   * Getter method for the COM property "FirstName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14854) //= 0x3a06. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String firstName();


  /**
   * <p>
   * Setter method for the COM property "FirstName"
   * </p>
   * @param firstName Mandatory java.lang.String parameter.
   */

  @DISPID(14854) //= 0x3a06. The runtime will prefer the VTID if present
  @VTID(49)
  void firstName(
    java.lang.String firstName);


  /**
   * <p>
   * Getter method for the COM property "JobTitle"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14871) //= 0x3a17. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String jobTitle();


  /**
   * <p>
   * Setter method for the COM property "JobTitle"
   * </p>
   * @param jobTitle Mandatory java.lang.String parameter.
   */

  @DISPID(14871) //= 0x3a17. The runtime will prefer the VTID if present
  @VTID(51)
  void jobTitle(
    java.lang.String jobTitle);


  /**
   * <p>
   * Getter method for the COM property "LastName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14865) //= 0x3a11. The runtime will prefer the VTID if present
  @VTID(52)
  java.lang.String lastName();


  /**
   * <p>
   * Setter method for the COM property "LastName"
   * </p>
   * @param lastName Mandatory java.lang.String parameter.
   */

  @DISPID(14865) //= 0x3a11. The runtime will prefer the VTID if present
  @VTID(53)
  void lastName(
    java.lang.String lastName);


  /**
   * <p>
   * Getter method for the COM property "MobileTelephoneNumber"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14876) //= 0x3a1c. The runtime will prefer the VTID if present
  @VTID(54)
  java.lang.String mobileTelephoneNumber();


  /**
   * <p>
   * Setter method for the COM property "MobileTelephoneNumber"
   * </p>
   * @param mobileTelephoneNumber Mandatory java.lang.String parameter.
   */

  @DISPID(14876) //= 0x3a1c. The runtime will prefer the VTID if present
  @VTID(55)
  void mobileTelephoneNumber(
    java.lang.String mobileTelephoneNumber);


  /**
   * <p>
   * Getter method for the COM property "OfficeLocation"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14873) //= 0x3a19. The runtime will prefer the VTID if present
  @VTID(56)
  java.lang.String officeLocation();


  /**
   * <p>
   * Setter method for the COM property "OfficeLocation"
   * </p>
   * @param officeLocation Mandatory java.lang.String parameter.
   */

  @DISPID(14873) //= 0x3a19. The runtime will prefer the VTID if present
  @VTID(57)
  void officeLocation(
    java.lang.String officeLocation);


  /**
   * <p>
   * Getter method for the COM property "PostalCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14890) //= 0x3a2a. The runtime will prefer the VTID if present
  @VTID(58)
  java.lang.String postalCode();


  /**
   * <p>
   * Setter method for the COM property "PostalCode"
   * </p>
   * @param postalCode Mandatory java.lang.String parameter.
   */

  @DISPID(14890) //= 0x3a2a. The runtime will prefer the VTID if present
  @VTID(59)
  void postalCode(
    java.lang.String postalCode);


  /**
   * <p>
   * Getter method for the COM property "PrimarySmtpAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64245) //= 0xfaf5. The runtime will prefer the VTID if present
  @VTID(60)
  java.lang.String primarySmtpAddress();


  /**
   * <p>
   * Getter method for the COM property "StateOrProvince"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14888) //= 0x3a28. The runtime will prefer the VTID if present
  @VTID(61)
  java.lang.String stateOrProvince();


  /**
   * <p>
   * Setter method for the COM property "StateOrProvince"
   * </p>
   * @param stateOrProvince Mandatory java.lang.String parameter.
   */

  @DISPID(14888) //= 0x3a28. The runtime will prefer the VTID if present
  @VTID(62)
  void stateOrProvince(
    java.lang.String stateOrProvince);


  /**
   * <p>
   * Getter method for the COM property "StreetAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(14889) //= 0x3a29. The runtime will prefer the VTID if present
  @VTID(63)
  java.lang.String streetAddress();


  /**
   * <p>
   * Setter method for the COM property "StreetAddress"
   * </p>
   * @param streetAddress Mandatory java.lang.String parameter.
   */

  @DISPID(14889) //= 0x3a29. The runtime will prefer the VTID if present
  @VTID(64)
  void streetAddress(
    java.lang.String streetAddress);


  /**
   * @return  Returns a value of type RT_MSOutlook._ExchangeUser
   */

  @DISPID(64249) //= 0xfaf9. The runtime will prefer the VTID if present
  @VTID(65)
  RT_MSOutlook._ExchangeUser getExchangeUserManager();


  /**
   * <p>
   * Getter method for the COM property "YomiCompanyName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32814) //= 0x802e. The runtime will prefer the VTID if present
  @VTID(66)
  java.lang.String yomiCompanyName();


  /**
   * <p>
   * Setter method for the COM property "YomiCompanyName"
   * </p>
   * @param yomiCompanyName Mandatory java.lang.String parameter.
   */

  @DISPID(32814) //= 0x802e. The runtime will prefer the VTID if present
  @VTID(67)
  void yomiCompanyName(
    java.lang.String yomiCompanyName);


  /**
   * <p>
   * Getter method for the COM property "YomiFirstName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32812) //= 0x802c. The runtime will prefer the VTID if present
  @VTID(68)
  java.lang.String yomiFirstName();


  /**
   * <p>
   * Setter method for the COM property "YomiFirstName"
   * </p>
   * @param yomiFirstName Mandatory java.lang.String parameter.
   */

  @DISPID(32812) //= 0x802c. The runtime will prefer the VTID if present
  @VTID(69)
  void yomiFirstName(
    java.lang.String yomiFirstName);


  /**
   * <p>
   * Getter method for the COM property "YomiLastName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(32813) //= 0x802d. The runtime will prefer the VTID if present
  @VTID(70)
  java.lang.String yomiLastName();


  /**
   * <p>
   * Setter method for the COM property "YomiLastName"
   * </p>
   * @param yomiLastName Mandatory java.lang.String parameter.
   */

  @DISPID(32813) //= 0x802d. The runtime will prefer the VTID if present
  @VTID(71)
  void yomiLastName(
    java.lang.String yomiLastName);


  /**
   * <p>
   * Getter method for the COM property "YomiDisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64487) //= 0xfbe7. The runtime will prefer the VTID if present
  @VTID(72)
  java.lang.String yomiDisplayName();


  /**
   * <p>
   * Setter method for the COM property "YomiDisplayName"
   * </p>
   * @param yomiDisplayName Mandatory java.lang.String parameter.
   */

  @DISPID(64487) //= 0xfbe7. The runtime will prefer the VTID if present
  @VTID(73)
  void yomiDisplayName(
    java.lang.String yomiDisplayName);


  /**
   * <p>
   * Getter method for the COM property "YomiDepartment"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64488) //= 0xfbe8. The runtime will prefer the VTID if present
  @VTID(74)
  java.lang.String yomiDepartment();


  /**
   * <p>
   * Setter method for the COM property "YomiDepartment"
   * </p>
   * @param yomiDepartment Mandatory java.lang.String parameter.
   */

  @DISPID(64488) //= 0xfbe8. The runtime will prefer the VTID if present
  @VTID(75)
  void yomiDepartment(
    java.lang.String yomiDepartment);


  /**
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(64631) //= 0xfc77. The runtime will prefer the VTID if present
  @VTID(76)
  IPictureDisp getPicture();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(64666) //= 0xfc9a. The runtime will prefer the VTID if present
  @VTID(77)
  boolean isUnifiedGroup();


  /**
   * @param groupType Mandatory RT_MSOutlook.OlUnifiedGroupFolderType parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64667) //= 0xfc9b. The runtime will prefer the VTID if present
  @VTID(78)
  RT_MSOutlook.MAPIFolder getUnifiedGroup(
    RT_MSOutlook.OlUnifiedGroupFolderType groupType);


  /**
   * @param groupType Mandatory RT_MSOutlook.OlUnifiedGroupFolderType parameter.
   * @param storeID Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64668) //= 0xfc9c. The runtime will prefer the VTID if present
  @VTID(79)
  RT_MSOutlook.MAPIFolder getUnifiedGroupFromStore(
    RT_MSOutlook.OlUnifiedGroupFolderType groupType,
    java.lang.String storeID);


  // Properties:
}

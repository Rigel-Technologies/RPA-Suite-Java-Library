package RT_MSOutlook  ;

import com4j.*;

@IID("{000630CA-0000-0000-C000-000000000046}")
public interface _ExchangeDistributionList extends Com4jObject {
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

  @DISPID(64244) //= 0xfaf4. The runtime will prefer the VTID if present
  @VTID(33)
  RT_MSOutlook.AddressEntries getMemberOfList();


  /**
   * @return  Returns a value of type RT_MSOutlook.AddressEntries
   */

  @DISPID(64246) //= 0xfaf6. The runtime will prefer the VTID if present
  @VTID(34)
  RT_MSOutlook.AddressEntries getExchangeDistributionListMembers();


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
   * Getter method for the COM property "Comments"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String comments();


  /**
   * <p>
   * Setter method for the COM property "Comments"
   * </p>
   * @param comments Mandatory java.lang.String parameter.
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(37)
  void comments(
    java.lang.String comments);


  /**
   * <p>
   * Getter method for the COM property "PrimarySmtpAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64245) //= 0xfaf5. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String primarySmtpAddress();


  /**
   * @return  Returns a value of type RT_MSOutlook.AddressEntries
   */

  @DISPID(64247) //= 0xfaf7. The runtime will prefer the VTID if present
  @VTID(39)
  RT_MSOutlook.AddressEntries getOwners();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(64666) //= 0xfc9a. The runtime will prefer the VTID if present
  @VTID(40)
  boolean isUnifiedGroup();


  /**
   * @param groupType Mandatory RT_MSOutlook.OlUnifiedGroupFolderType parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64667) //= 0xfc9b. The runtime will prefer the VTID if present
  @VTID(41)
  RT_MSOutlook.MAPIFolder getUnifiedGroup(
    RT_MSOutlook.OlUnifiedGroupFolderType groupType);


  /**
   * @param groupType Mandatory RT_MSOutlook.OlUnifiedGroupFolderType parameter.
   * @param storeID Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64668) //= 0xfc9c. The runtime will prefer the VTID if present
  @VTID(42)
  RT_MSOutlook.MAPIFolder getUnifiedGroupFromStore(
    RT_MSOutlook.OlUnifiedGroupFolderType groupType,
    java.lang.String storeID);


  // Properties:
}

package RT_MSOutlook  ;

import com4j.*;

@IID("{00063002-0000-0000-C000-000000000046}")
public interface _NameSpace extends Com4jObject {
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
   * Getter method for the COM property "CurrentUser"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Recipient
   */

  @DISPID(8449) //= 0x2101. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.Recipient currentUser();


  /**
   * <p>
   * Getter method for the COM property "Folders"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Folders
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._Folders folders();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8452) //= 0x2104. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String type();


  /**
   * <p>
   * Getter method for the COM property "AddressLists"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.AddressLists
   */

  @DISPID(8461) //= 0x210d. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook.AddressLists addressLists();


  /**
   * @param recipientName Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook.Recipient
   */

  @DISPID(8458) //= 0x210a. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.Recipient createRecipient(
    java.lang.String recipientName);


  /**
   * @param folderType Mandatory RT_MSOutlook.OlDefaultFolders parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(8459) //= 0x210b. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook.MAPIFolder getDefaultFolder(
    RT_MSOutlook.OlDefaultFolders folderType);


  /**
   * @param entryIDFolder Mandatory java.lang.String parameter.
   * @param entryIDStore Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(8456) //= 0x2108. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook.MAPIFolder getFolderFromID(
    java.lang.String entryIDFolder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object entryIDStore);


  /**
   * @param entryIDItem Mandatory java.lang.String parameter.
   * @param entryIDStore Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(8457) //= 0x2109. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getItemFromID(
    java.lang.String entryIDItem,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object entryIDStore);


  /**
   * @param entryID Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook.Recipient
   */

  @DISPID(8455) //= 0x2107. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook.Recipient getRecipientFromID(
    java.lang.String entryID);


  /**
   * @param recipient Mandatory RT_MSOutlook.Recipient parameter.
   * @param folderType Mandatory RT_MSOutlook.OlDefaultFolders parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(8460) //= 0x210c. The runtime will prefer the VTID if present
  @VTID(20)
  RT_MSOutlook.MAPIFolder getSharedDefaultFolder(
    RT_MSOutlook.Recipient recipient,
    RT_MSOutlook.OlDefaultFolders folderType);


  /**
   */

  @DISPID(8454) //= 0x2106. The runtime will prefer the VTID if present
  @VTID(21)
  void logoff();


  /**
   * @param profile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param showDialog Optional parameter. Default value is com4j.Variant.getMissing()
   * @param newSession Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(8453) //= 0x2105. The runtime will prefer the VTID if present
  @VTID(22)
  void logon(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object profile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object showDialog,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newSession);


  /**
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(8462) //= 0x210e. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.MAPIFolder pickFolder();


  /**
   */

  @DISPID(8471) //= 0x2117. The runtime will prefer the VTID if present
  @VTID(24)
  void refreshRemoteHeaders();


  /**
   * <p>
   * Getter method for the COM property "SyncObjects"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.SyncObjects
   */

  @DISPID(8472) //= 0x2118. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook.SyncObjects syncObjects();


  /**
   * @param store Mandatory java.lang.Object parameter.
   */

  @DISPID(8473) //= 0x2119. The runtime will prefer the VTID if present
  @VTID(26)
  void addStore(
    @MarshalAs(NativeType.VARIANT) java.lang.Object store);


  /**
   * @param folder Mandatory RT_MSOutlook.MAPIFolder parameter.
   */

  @DISPID(8474) //= 0x211a. The runtime will prefer the VTID if present
  @VTID(27)
  void removeStore(
    RT_MSOutlook.MAPIFolder folder);


  /**
   * <p>
   * Getter method for the COM property "Offline"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64076) //= 0xfa4c. The runtime will prefer the VTID if present
  @VTID(28)
  boolean offline();


  /**
   * @param contactItem Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(64013) //= 0xfa0d. The runtime will prefer the VTID if present
  @VTID(29)
  void dial(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contactItem);


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
   * Getter method for the COM property "ExchangeConnectionMode"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlExchangeConnectionMode
   */

  @DISPID(64193) //= 0xfac1. The runtime will prefer the VTID if present
  @VTID(31)
  RT_MSOutlook.OlExchangeConnectionMode exchangeConnectionMode();


  /**
   * @param store Mandatory java.lang.Object parameter.
   * @param type Mandatory RT_MSOutlook.OlStoreType parameter.
   */

  @DISPID(64197) //= 0xfac5. The runtime will prefer the VTID if present
  @VTID(32)
  void addStoreEx(
    @MarshalAs(NativeType.VARIANT) java.lang.Object store,
    RT_MSOutlook.OlStoreType type);


  /**
   * <p>
   * Getter method for the COM property "Accounts"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Accounts
   */

  @DISPID(64208) //= 0xfad0. The runtime will prefer the VTID if present
  @VTID(33)
  RT_MSOutlook._Accounts accounts();


  /**
   * <p>
   * Getter method for the COM property "CurrentProfileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64213) //= 0xfad5. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String currentProfileName();


  /**
   * <p>
   * Getter method for the COM property "Stores"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Stores
   */

  @DISPID(64216) //= 0xfad8. The runtime will prefer the VTID if present
  @VTID(35)
  RT_MSOutlook._Stores stores();


  /**
   * @return  Returns a value of type RT_MSOutlook._SelectNamesDialog
   */

  @DISPID(64225) //= 0xfae1. The runtime will prefer the VTID if present
  @VTID(36)
  RT_MSOutlook._SelectNamesDialog getSelectNamesDialog();


  /**
   * @param showProgressDialog Mandatory boolean parameter.
   */

  @DISPID(64215) //= 0xfad7. The runtime will prefer the VTID if present
  @VTID(37)
  void sendAndReceive(
    boolean showProgressDialog);


  /**
   * <p>
   * Getter method for the COM property "DefaultStore"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Store
   */

  @DISPID(64236) //= 0xfaec. The runtime will prefer the VTID if present
  @VTID(38)
  RT_MSOutlook._Store defaultStore();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook.AddressEntry
   */

  @DISPID(64260) //= 0xfb04. The runtime will prefer the VTID if present
  @VTID(39)
  RT_MSOutlook.AddressEntry getAddressEntryFromID(
    java.lang.String id);


  /**
   * @return  Returns a value of type RT_MSOutlook.AddressList
   */

  @DISPID(64261) //= 0xfb05. The runtime will prefer the VTID if present
  @VTID(40)
  RT_MSOutlook.AddressList getGlobalAddressList();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook._Store
   */

  @DISPID(64262) //= 0xfb06. The runtime will prefer the VTID if present
  @VTID(41)
  RT_MSOutlook._Store getStoreFromID(
    java.lang.String id);


  /**
   * <p>
   * Getter method for the COM property "Categories"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Categories
   */

  @DISPID(64421) //= 0xfba5. The runtime will prefer the VTID if present
  @VTID(42)
  RT_MSOutlook._Categories categories();


  /**
   * @param path Mandatory java.lang.String parameter.
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param downloadAttachments Optional parameter. Default value is com4j.Variant.getMissing()
   * @param useTTL Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64502) //= 0xfbf6. The runtime will prefer the VTID if present
  @VTID(43)
  RT_MSOutlook.MAPIFolder openSharedFolder(
    java.lang.String path,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object downloadAttachments,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object useTTL);


  /**
   * @param path Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64503) //= 0xfbf7. The runtime will prefer the VTID if present
  @VTID(44)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject openSharedItem(
    java.lang.String path);


  /**
   * @param context Mandatory java.lang.Object parameter.
   * @param provider Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook._SharingItem
   */

  @DISPID(64484) //= 0xfbe4. The runtime will prefer the VTID if present
  @VTID(45)
  RT_MSOutlook._SharingItem createSharingItem(
    @MarshalAs(NativeType.VARIANT) java.lang.Object context,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object provider);


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64517) //= 0xfc05. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String exchangeMailboxServerName();


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64516) //= 0xfc04. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String exchangeMailboxServerVersion();


  /**
   * @param firstEntryID Mandatory java.lang.String parameter.
   * @param secondEntryID Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(64508) //= 0xfbfc. The runtime will prefer the VTID if present
  @VTID(48)
  boolean compareEntryIDs(
    java.lang.String firstEntryID,
    java.lang.String secondEntryID);


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverXml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64515) //= 0xfc03. The runtime will prefer the VTID if present
  @VTID(49)
  java.lang.String autoDiscoverXml();


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverConnectionMode"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlAutoDiscoverConnectionMode
   */

  @DISPID(64558) //= 0xfc2e. The runtime will prefer the VTID if present
  @VTID(50)
  RT_MSOutlook.OlAutoDiscoverConnectionMode autoDiscoverConnectionMode();


  /**
   * @param addressEntry Mandatory RT_MSOutlook.AddressEntry parameter.
   * @return  Returns a value of type RT_MSOutlook.ContactCard
   */

  @DISPID(64645) //= 0xfc85. The runtime will prefer the VTID if present
  @VTID(51)
  RT_MSOutlook.ContactCard createContactCard(
    RT_MSOutlook.AddressEntry addressEntry);


  // Properties:
}

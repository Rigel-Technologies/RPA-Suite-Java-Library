package RT_MSOutlook  ;

import com4j.*;

@IID("{000630C5-0000-0000-C000-000000000046}")
public interface _Account extends Com4jObject {
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
   * Getter method for the COM property "AccountType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlAccountType
   */

  @DISPID(64210) //= 0xfad2. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.OlAccountType accountType();


  /**
   * <p>
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String displayName();


  /**
   * <p>
   * Getter method for the COM property "UserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64211) //= 0xfad3. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String userName();


  /**
   * <p>
   * Getter method for the COM property "SmtpAddress"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64212) //= 0xfad4. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String smtpAddress();


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverConnectionMode"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlAutoDiscoverConnectionMode
   */

  @DISPID(64623) //= 0xfc6f. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.OlAutoDiscoverConnectionMode autoDiscoverConnectionMode();


  /**
   * <p>
   * Getter method for the COM property "CurrentUser"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Recipient
   */

  @DISPID(64622) //= 0xfc6e. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook.Recipient currentUser();


  /**
   * <p>
   * Getter method for the COM property "AutoDiscoverXml"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64624) //= 0xfc70. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String autoDiscoverXml();


  /**
   * <p>
   * Getter method for the COM property "DeliveryStore"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Store
   */

  @DISPID(64614) //= 0xfc66. The runtime will prefer the VTID if present
  @VTID(18)
  RT_MSOutlook._Store deliveryStore();


  /**
   * <p>
   * Getter method for the COM property "ExchangeConnectionMode"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlExchangeConnectionMode
   */

  @DISPID(64615) //= 0xfc67. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook.OlExchangeConnectionMode exchangeConnectionMode();


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64616) //= 0xfc68. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String exchangeMailboxServerName();


  /**
   * <p>
   * Getter method for the COM property "ExchangeMailboxServerVersion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64617) //= 0xfc69. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String exchangeMailboxServerVersion();


  /**
   * @param id Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook.AddressEntry
   */

  @DISPID(64618) //= 0xfc6a. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook.AddressEntry getAddressEntryFromID(
    java.lang.String id);


  /**
   * @param entryID Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook.Recipient
   */

  @DISPID(64619) //= 0xfc6b. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.Recipient getRecipientFromID(
    java.lang.String entryID);


  /**
   * <p>
   * Getter method for the COM property "IOlkAccount"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(24)
  com4j.Com4jObject iOlkAccount();


  // Properties:
}

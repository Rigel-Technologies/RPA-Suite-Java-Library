package RT_MSOutlook  ;

import com4j.*;

@IID("{000630C7-0000-0000-C000-000000000046}")
public interface _Store extends Com4jObject {
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
   * Getter method for the COM property "DisplayName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String displayName();


  /**
   * <p>
   * Getter method for the COM property "StoreID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12552) //= 0x3108. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String storeID();


  /**
   * <p>
   * Getter method for the COM property "ExchangeStoreType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlExchangeStoreType
   */

  @DISPID(64218) //= 0xfada. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.OlExchangeStoreType exchangeStoreType();


  /**
   * <p>
   * Getter method for the COM property "FilePath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64221) //= 0xfadd. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String filePath();


  /**
   * <p>
   * Getter method for the COM property "IsCachedExchange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64222) //= 0xfade. The runtime will prefer the VTID if present
  @VTID(15)
  boolean isCachedExchange();


  /**
   * <p>
   * Getter method for the COM property "IsDataFileStore"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64223) //= 0xfadf. The runtime will prefer the VTID if present
  @VTID(16)
  boolean isDataFileStore();


  /**
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64219) //= 0xfadb. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook.MAPIFolder getRootFolder();


  /**
   * @return  Returns a value of type RT_MSOutlook._Folders
   */

  @DISPID(64220) //= 0xfadc. The runtime will prefer the VTID if present
  @VTID(18)
  RT_MSOutlook._Folders getSearchFolders();


  /**
   * <p>
   * Getter method for the COM property "IsOpen"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64224) //= 0xfae0. The runtime will prefer the VTID if present
  @VTID(19)
  boolean isOpen();


  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(20)
  com4j.Com4jObject mapiobject();


  /**
   * @return  Returns a value of type RT_MSOutlook._Rules
   */

  @DISPID(64265) //= 0xfb09. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook._Rules getRules();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook._PropertyAccessor propertyAccessor();


  /**
   * @param folderType Mandatory RT_MSOutlook.OlSpecialFolders parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(8456) //= 0x2108. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.MAPIFolder getSpecialFolder(
    RT_MSOutlook.OlSpecialFolders folderType);


  /**
   * <p>
   * Getter method for the COM property "IsInstantSearchEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64532) //= 0xfc14. The runtime will prefer the VTID if present
  @VTID(24)
  boolean isInstantSearchEnabled();


  /**
   */

  @DISPID(64590) //= 0xfc4e. The runtime will prefer the VTID if present
  @VTID(25)
  void refreshQuotaDisplay();


  /**
   * @param folderType Mandatory RT_MSOutlook.OlDefaultFolders parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64621) //= 0xfc6d. The runtime will prefer the VTID if present
  @VTID(26)
  RT_MSOutlook.MAPIFolder getDefaultFolder(
    RT_MSOutlook.OlDefaultFolders folderType);


  /**
   * <p>
   * Getter method for the COM property "IsConversationEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64630) //= 0xfc76. The runtime will prefer the VTID if present
  @VTID(27)
  boolean isConversationEnabled();


  /**
   * <p>
   * Getter method for the COM property "Categories"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Categories
   */

  @DISPID(64421) //= 0xfba5. The runtime will prefer the VTID if present
  @VTID(28)
  RT_MSOutlook._Categories categories();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param alias Mandatory java.lang.String parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param fAutoSubscribeMembers Mandatory boolean parameter.
   * @param groupType Mandatory RT_MSOutlook.OlUnifiedGroupType parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64669) //= 0xfc9d. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String createUnifiedGroup(
    java.lang.String name,
    java.lang.String alias,
    java.lang.String description,
    boolean fAutoSubscribeMembers,
    RT_MSOutlook.OlUnifiedGroupType groupType);


  /**
   * @param groupSmtpAddress Mandatory java.lang.String parameter.
   */

  @DISPID(64670) //= 0xfc9e. The runtime will prefer the VTID if present
  @VTID(30)
  void deleteUnifiedGroup(
    java.lang.String groupSmtpAddress);


  // Properties:
}

package RT_MSOutlook  ;

import com4j.*;
import com4j.stdole.IPictureDisp;

@IID("{00063006-0000-0000-C000-000000000046}")
public interface MAPIFolder extends Com4jObject {
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
   * Getter method for the COM property "DefaultItemType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlItemType
   */

  @DISPID(12550) //= 0x3106. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.OlItemType defaultItemType();


  /**
   * <p>
   * Getter method for the COM property "DefaultMessageClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12551) //= 0x3107. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String defaultMessageClass();


  /**
   * <p>
   * Getter method for the COM property "Description"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String description();


  /**
   * <p>
   * Setter method for the COM property "Description"
   * </p>
   * @param description Mandatory java.lang.String parameter.
   */

  @DISPID(12292) //= 0x3004. The runtime will prefer the VTID if present
  @VTID(14)
  void description(
    java.lang.String description);


  /**
   * <p>
   * Getter method for the COM property "EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String entryID();


  /**
   * <p>
   * Getter method for the COM property "Folders"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Folders
   */

  @DISPID(8451) //= 0x2103. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook._Folders folders();


  /**
   * <p>
   * Getter method for the COM property "Items"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Items
   */

  @DISPID(12544) //= 0x3100. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook._Items items();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(19)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "StoreID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12552) //= 0x3108. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String storeID();


  /**
   * <p>
   * Getter method for the COM property "UnReadItemCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(13827) //= 0x3603. The runtime will prefer the VTID if present
  @VTID(21)
  int unReadItemCount();


  /**
   * @param destinationFolder Mandatory RT_MSOutlook.MAPIFolder parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(61490) //= 0xf032. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook.MAPIFolder copyTo(
    RT_MSOutlook.MAPIFolder destinationFolder);


  /**
   */

  @DISPID(61509) //= 0xf045. The runtime will prefer the VTID if present
  @VTID(23)
  void delete();


  /**
   */

  @DISPID(12548) //= 0x3104. The runtime will prefer the VTID if present
  @VTID(24)
  void display();


  /**
   * @param displayMode Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook._Explorer
   */

  @DISPID(12545) //= 0x3101. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook._Explorer getExplorer(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayMode);


  /**
   * @param destinationFolder Mandatory RT_MSOutlook.MAPIFolder parameter.
   */

  @DISPID(61492) //= 0xf034. The runtime will prefer the VTID if present
  @VTID(26)
  void moveTo(
    RT_MSOutlook.MAPIFolder destinationFolder);


  /**
   * <p>
   * Getter method for the COM property "UserPermissions"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(12561) //= 0x3111. The runtime will prefer the VTID if present
  @VTID(27)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject userPermissions();


  /**
   * <p>
   * Getter method for the COM property "WebViewOn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12562) //= 0x3112. The runtime will prefer the VTID if present
  @VTID(28)
  boolean webViewOn();


  /**
   * <p>
   * Setter method for the COM property "WebViewOn"
   * </p>
   * @param webViewOn Mandatory boolean parameter.
   */

  @DISPID(12562) //= 0x3112. The runtime will prefer the VTID if present
  @VTID(29)
  void webViewOn(
    boolean webViewOn);


  /**
   * <p>
   * Getter method for the COM property "WebViewURL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12563) //= 0x3113. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String webViewURL();


  /**
   * <p>
   * Setter method for the COM property "WebViewURL"
   * </p>
   * @param webViewURL Mandatory java.lang.String parameter.
   */

  @DISPID(12563) //= 0x3113. The runtime will prefer the VTID if present
  @VTID(31)
  void webViewURL(
    java.lang.String webViewURL);


  /**
   * <p>
   * Getter method for the COM property "WebViewAllowNavigation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(12564) //= 0x3114. The runtime will prefer the VTID if present
  @VTID(32)
  boolean webViewAllowNavigation();


  /**
   * <p>
   * Setter method for the COM property "WebViewAllowNavigation"
   * </p>
   * @param webViewAllowNavigation Mandatory boolean parameter.
   */

  @DISPID(12564) //= 0x3114. The runtime will prefer the VTID if present
  @VTID(33)
  void webViewAllowNavigation(
    boolean webViewAllowNavigation);


  /**
   */

  @DISPID(12565) //= 0x3115. The runtime will prefer the VTID if present
  @VTID(34)
  void addToPFFavorites();


  /**
   * <p>
   * Getter method for the COM property "AddressBookName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64110) //= 0xfa6e. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String addressBookName();


  /**
   * <p>
   * Setter method for the COM property "AddressBookName"
   * </p>
   * @param addressBookName Mandatory java.lang.String parameter.
   */

  @DISPID(64110) //= 0xfa6e. The runtime will prefer the VTID if present
  @VTID(36)
  void addressBookName(
    java.lang.String addressBookName);


  /**
   * <p>
   * Getter method for the COM property "ShowAsOutlookAB"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64111) //= 0xfa6f. The runtime will prefer the VTID if present
  @VTID(37)
  boolean showAsOutlookAB();


  /**
   * <p>
   * Setter method for the COM property "ShowAsOutlookAB"
   * </p>
   * @param showAsOutlookAB Mandatory boolean parameter.
   */

  @DISPID(64111) //= 0xfa6f. The runtime will prefer the VTID if present
  @VTID(38)
  void showAsOutlookAB(
    boolean showAsOutlookAB);


  /**
   * <p>
   * Getter method for the COM property "FolderPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64120) //= 0xfa78. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String folderPath();


  /**
   * @param fNoUI Optional parameter. Default value is com4j.Variant.getMissing()
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(64097) //= 0xfa61. The runtime will prefer the VTID if present
  @VTID(40)
  void addToFavorites(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fNoUI,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name);


  /**
   * <p>
   * Getter method for the COM property "InAppFolderSyncObject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64075) //= 0xfa4b. The runtime will prefer the VTID if present
  @VTID(41)
  boolean inAppFolderSyncObject();


  /**
   * <p>
   * Setter method for the COM property "InAppFolderSyncObject"
   * </p>
   * @param inAppFolderSyncObject Mandatory boolean parameter.
   */

  @DISPID(64075) //= 0xfa4b. The runtime will prefer the VTID if present
  @VTID(42)
  void inAppFolderSyncObject(
    boolean inAppFolderSyncObject);


  /**
   * <p>
   * Getter method for the COM property "CurrentView"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.View
   */

  @DISPID(8704) //= 0x2200. The runtime will prefer the VTID if present
  @VTID(43)
  RT_MSOutlook.View currentView();


  /**
   * <p>
   * Getter method for the COM property "CustomViewsOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64070) //= 0xfa46. The runtime will prefer the VTID if present
  @VTID(44)
  boolean customViewsOnly();


  /**
   * <p>
   * Setter method for the COM property "CustomViewsOnly"
   * </p>
   * @param customViewsOnly Mandatory boolean parameter.
   */

  @DISPID(64070) //= 0xfa46. The runtime will prefer the VTID if present
  @VTID(45)
  void customViewsOnly(
    boolean customViewsOnly);


  /**
   * <p>
   * Getter method for the COM property "Views"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Views
   */

  @DISPID(12553) //= 0x3109. The runtime will prefer the VTID if present
  @VTID(46)
  RT_MSOutlook._Views views();


  @VTID(46)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook._Views.class})
  RT_MSOutlook.View views(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "MAPIOBJECT"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(61696) //= 0xf100. The runtime will prefer the VTID if present
  @VTID(47)
  com4j.Com4jObject mapiobject();


  /**
   * <p>
   * Getter method for the COM property "FullFolderPath"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64145) //= 0xfa91. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String fullFolderPath();


  /**
   * <p>
   * Getter method for the COM property "IsSharePointFolder"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64182) //= 0xfab6. The runtime will prefer the VTID if present
  @VTID(49)
  boolean isSharePointFolder();


  /**
   * <p>
   * Getter method for the COM property "ShowItemCount"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlShowItemCount
   */

  @DISPID(64194) //= 0xfac2. The runtime will prefer the VTID if present
  @VTID(50)
  RT_MSOutlook.OlShowItemCount showItemCount();


  /**
   * <p>
   * Setter method for the COM property "ShowItemCount"
   * </p>
   * @param showItemCount Mandatory RT_MSOutlook.OlShowItemCount parameter.
   */

  @DISPID(64194) //= 0xfac2. The runtime will prefer the VTID if present
  @VTID(51)
  void showItemCount(
    RT_MSOutlook.OlShowItemCount showItemCount);


  /**
   * <p>
   * Getter method for the COM property "Store"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Store
   */

  @DISPID(64217) //= 0xfad9. The runtime will prefer the VTID if present
  @VTID(52)
  RT_MSOutlook._Store store();


  /**
   * @param storageIdentifier Mandatory java.lang.String parameter.
   * @param storageIdentifierType Mandatory RT_MSOutlook.OlStorageIdentifierType parameter.
   * @return  Returns a value of type RT_MSOutlook._StorageItem
   */

  @DISPID(64264) //= 0xfb08. The runtime will prefer the VTID if present
  @VTID(53)
  RT_MSOutlook._StorageItem getStorage(
    java.lang.String storageIdentifier,
    RT_MSOutlook.OlStorageIdentifierType storageIdentifierType);


  /**
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tableContents Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook._Table
   */

  @DISPID(64285) //= 0xfb1d. The runtime will prefer the VTID if present
  @VTID(54)
  RT_MSOutlook._Table getTable(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tableContents);


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(55)
  RT_MSOutlook._PropertyAccessor propertyAccessor();


  /**
   * @return  Returns a value of type RT_MSOutlook._CalendarSharing
   */

  @DISPID(64418) //= 0xfba2. The runtime will prefer the VTID if present
  @VTID(56)
  RT_MSOutlook._CalendarSharing getCalendarExporter();


  /**
   * <p>
   * Getter method for the COM property "UserDefinedProperties"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._UserDefinedProperties
   */

  @DISPID(63510) //= 0xf816. The runtime will prefer the VTID if present
  @VTID(57)
  RT_MSOutlook._UserDefinedProperties userDefinedProperties();


  /**
   * @return  Returns a value of type IPictureDisp
   */

  @DISPID(64572) //= 0xfc3c. The runtime will prefer the VTID if present
  @VTID(58)
  IPictureDisp getCustomIcon();


  /**
   * @param picture Mandatory IPictureDisp parameter.
   */

  @DISPID(64573) //= 0xfc3d. The runtime will prefer the VTID if present
  @VTID(59)
  void setCustomIcon(
    IPictureDisp picture);


  // Properties:
}

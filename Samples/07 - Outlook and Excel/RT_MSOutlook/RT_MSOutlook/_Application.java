package RT_MSOutlook  ;

import com4j.*;

@IID("{00063001-0000-0000-C000-000000000046}")
public interface _Application extends Com4jObject {
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
   * Getter method for the COM property "Assistant"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Assistant
   */

  @DISPID(276) //= 0x114. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook.Assistant assistant();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Version"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(278) //= 0x116. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String version();


  /**
   * @return  Returns a value of type RT_MSOutlook._Explorer
   */

  @DISPID(273) //= 0x111. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook._Explorer activeExplorer();


  /**
   * @return  Returns a value of type RT_MSOutlook._Inspector
   */

  @DISPID(274) //= 0x112. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook._Inspector activeInspector();


  /**
   * @param itemType Mandatory RT_MSOutlook.OlItemType parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(266) //= 0x10a. The runtime will prefer the VTID if present
  @VTID(16)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createItem(
    RT_MSOutlook.OlItemType itemType);


  /**
   * @param templatePath Mandatory java.lang.String parameter.
   * @param inFolder Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(267) //= 0x10b. The runtime will prefer the VTID if present
  @VTID(17)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createItemFromTemplate(
    java.lang.String templatePath,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object inFolder);


  /**
   * @param objectName Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(277) //= 0x115. The runtime will prefer the VTID if present
  @VTID(18)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject createObject(
    java.lang.String objectName);


  /**
   * @param type Mandatory java.lang.String parameter.
   * @return  Returns a value of type RT_MSOutlook._NameSpace
   */

  @DISPID(272) //= 0x110. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook._NameSpace getNamespace(
    java.lang.String type);


  /**
   */

  @DISPID(275) //= 0x113. The runtime will prefer the VTID if present
  @VTID(20)
  void quit();


  /**
   * <p>
   * Getter method for the COM property "COMAddIns"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.COMAddIns
   */

  @DISPID(280) //= 0x118. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook.COMAddIns comAddIns();


  @VTID(21)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook.COMAddIns.class})
  RT_MSOutlook.COMAddIn comAddIns(
    java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "Explorers"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Explorers
   */

  @DISPID(281) //= 0x119. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook._Explorers explorers();


  /**
   * <p>
   * Getter method for the COM property "Inspectors"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Inspectors
   */

  @DISPID(282) //= 0x11a. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook._Inspectors inspectors();


  /**
   * <p>
   * Getter method for the COM property "LanguageSettings"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.LanguageSettings
   */

  @DISPID(283) //= 0x11b. The runtime will prefer the VTID if present
  @VTID(24)
  RT_MSOutlook.LanguageSettings languageSettings();


  /**
   * <p>
   * Getter method for the COM property "ProductCode"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(284) //= 0x11c. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String productCode();


  /**
   * <p>
   * Getter method for the COM property "AnswerWizard"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.AnswerWizard
   */

  @DISPID(285) //= 0x11d. The runtime will prefer the VTID if present
  @VTID(26)
  RT_MSOutlook.AnswerWizard answerWizard();


  /**
   * <p>
   * Getter method for the COM property "FeatureInstall"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MsoFeatureInstall
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(27)
  RT_MSOutlook.MsoFeatureInstall featureInstall();


  /**
   * <p>
   * Setter method for the COM property "FeatureInstall"
   * </p>
   * @param featureInstall Mandatory RT_MSOutlook.MsoFeatureInstall parameter.
   */

  @DISPID(286) //= 0x11e. The runtime will prefer the VTID if present
  @VTID(28)
  void featureInstall(
    RT_MSOutlook.MsoFeatureInstall featureInstall);


  /**
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(287) //= 0x11f. The runtime will prefer the VTID if present
  @VTID(29)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject activeWindow();


  /**
   * @param filePath Mandatory java.lang.String parameter.
   * @param destFolderPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64098) //= 0xfa62. The runtime will prefer the VTID if present
  @VTID(30)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject copyFile(
    java.lang.String filePath,
    java.lang.String destFolderPath);


  /**
   * @param scope Mandatory java.lang.String parameter.
   * @param filter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param searchSubFolders Optional parameter. Default value is com4j.Variant.getMissing()
   * @param tag Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RT_MSOutlook.Search
   */

  @DISPID(64101) //= 0xfa65. The runtime will prefer the VTID if present
  @VTID(31)
  RT_MSOutlook.Search advancedSearch(
    java.lang.String scope,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object filter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object searchSubFolders,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object tag);


  /**
   * @param lookInFolders Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(64108) //= 0xfa6c. The runtime will prefer the VTID if present
  @VTID(32)
  boolean isSearchSynchronous(
    java.lang.String lookInFolders);


  /**
   * @param pvar Mandatory java.lang.Object parameter.
   */

  @DISPID(64072) //= 0xfa48. The runtime will prefer the VTID if present
  @VTID(33)
  void getNewNickNames(
    java.lang.Object pvar);


  /**
   * <p>
   * Getter method for the COM property "Reminders"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._Reminders
   */

  @DISPID(64153) //= 0xfa99. The runtime will prefer the VTID if present
  @VTID(34)
  RT_MSOutlook._Reminders reminders();


  @VTID(34)
  @ReturnValue(defaultPropertyThrough={RT_MSOutlook._Reminders.class})
  RT_MSOutlook._Reminder reminders(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);

  /**
   * <p>
   * Getter method for the COM property "DefaultProfileName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64214) //= 0xfad6. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String defaultProfileName();


  /**
   * <p>
   * Getter method for the COM property "IsTrusted"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64499) //= 0xfbf3. The runtime will prefer the VTID if present
  @VTID(36)
  boolean isTrusted();


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @param referenceType Mandatory RT_MSOutlook.OlReferenceType parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64470) //= 0xfbd6. The runtime will prefer the VTID if present
  @VTID(37)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getObjectReference(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject item,
    RT_MSOutlook.OlReferenceType referenceType);


  /**
   * <p>
   * Getter method for the COM property "Assistance"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.IAssistance
   */

  @DISPID(64520) //= 0xfc08. The runtime will prefer the VTID if present
  @VTID(38)
  RT_MSOutlook.IAssistance assistance();


  /**
   * <p>
   * Getter method for the COM property "TimeZones"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._TimeZones
   */

  @DISPID(64553) //= 0xfc29. The runtime will prefer the VTID if present
  @VTID(39)
  RT_MSOutlook._TimeZones timeZones();


  /**
   * <p>
   * Getter method for the COM property "PickerDialog"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.PickerDialog
   */

  @DISPID(64613) //= 0xfc65. The runtime will prefer the VTID if present
  @VTID(40)
  RT_MSOutlook.PickerDialog pickerDialog();


  /**
   * @param regionName Mandatory java.lang.String parameter.
   */

  @DISPID(64639) //= 0xfc7f. The runtime will prefer the VTID if present
  @VTID(41)
  void refreshFormRegionDefinition(
    java.lang.String regionName);


  // Properties:
}

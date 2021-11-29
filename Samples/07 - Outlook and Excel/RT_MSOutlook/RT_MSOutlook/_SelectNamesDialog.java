package RT_MSOutlook  ;

import com4j.*;

@IID("{000630C8-0000-0000-C000-000000000046}")
public interface _SelectNamesDialog extends Com4jObject {
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
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64226) //= 0xfae2. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param caption Mandatory java.lang.String parameter.
   */

  @DISPID(64226) //= 0xfae2. The runtime will prefer the VTID if present
  @VTID(12)
  void caption(
    java.lang.String caption);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(61473) //= 0xf021. The runtime will prefer the VTID if present
  @VTID(13)
  boolean display();


  /**
   * <p>
   * Getter method for the COM property "Recipients"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.Recipients
   */

  @DISPID(63508) //= 0xf814. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook.Recipients recipients();


  /**
   * <p>
   * Setter method for the COM property "Recipients"
   * </p>
   * @param recipients Mandatory RT_MSOutlook.Recipients parameter.
   */

  @DISPID(63508) //= 0xf814. The runtime will prefer the VTID if present
  @VTID(15)
  void recipients(
    RT_MSOutlook.Recipients recipients);


  /**
   * <p>
   * Getter method for the COM property "BccLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64227) //= 0xfae3. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String bccLabel();


  /**
   * <p>
   * Setter method for the COM property "BccLabel"
   * </p>
   * @param bccLabel Mandatory java.lang.String parameter.
   */

  @DISPID(64227) //= 0xfae3. The runtime will prefer the VTID if present
  @VTID(17)
  void bccLabel(
    java.lang.String bccLabel);


  /**
   * <p>
   * Getter method for the COM property "CcLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64228) //= 0xfae4. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String ccLabel();


  /**
   * <p>
   * Setter method for the COM property "CcLabel"
   * </p>
   * @param ccLabel Mandatory java.lang.String parameter.
   */

  @DISPID(64228) //= 0xfae4. The runtime will prefer the VTID if present
  @VTID(19)
  void ccLabel(
    java.lang.String ccLabel);


  /**
   * <p>
   * Getter method for the COM property "ToLabel"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64229) //= 0xfae5. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String toLabel();


  /**
   * <p>
   * Setter method for the COM property "ToLabel"
   * </p>
   * @param toLabel Mandatory java.lang.String parameter.
   */

  @DISPID(64229) //= 0xfae5. The runtime will prefer the VTID if present
  @VTID(21)
  void toLabel(
    java.lang.String toLabel);


  /**
   * <p>
   * Getter method for the COM property "AllowMultipleSelection"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64230) //= 0xfae6. The runtime will prefer the VTID if present
  @VTID(22)
  boolean allowMultipleSelection();


  /**
   * <p>
   * Setter method for the COM property "AllowMultipleSelection"
   * </p>
   * @param allowMultipleSelection Mandatory boolean parameter.
   */

  @DISPID(64230) //= 0xfae6. The runtime will prefer the VTID if present
  @VTID(23)
  void allowMultipleSelection(
    boolean allowMultipleSelection);


  /**
   * <p>
   * Getter method for the COM property "ForceResolution"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64231) //= 0xfae7. The runtime will prefer the VTID if present
  @VTID(24)
  boolean forceResolution();


  /**
   * <p>
   * Setter method for the COM property "ForceResolution"
   * </p>
   * @param forceResolution Mandatory boolean parameter.
   */

  @DISPID(64231) //= 0xfae7. The runtime will prefer the VTID if present
  @VTID(25)
  void forceResolution(
    boolean forceResolution);


  /**
   * <p>
   * Getter method for the COM property "ShowOnlyInitialAddressList"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64232) //= 0xfae8. The runtime will prefer the VTID if present
  @VTID(26)
  boolean showOnlyInitialAddressList();


  /**
   * <p>
   * Setter method for the COM property "ShowOnlyInitialAddressList"
   * </p>
   * @param showOnlyInitialAddressList Mandatory boolean parameter.
   */

  @DISPID(64232) //= 0xfae8. The runtime will prefer the VTID if present
  @VTID(27)
  void showOnlyInitialAddressList(
    boolean showOnlyInitialAddressList);


  /**
   * <p>
   * Getter method for the COM property "NumberOfRecipientSelectors"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlRecipientSelectors
   */

  @DISPID(64233) //= 0xfae9. The runtime will prefer the VTID if present
  @VTID(28)
  RT_MSOutlook.OlRecipientSelectors numberOfRecipientSelectors();


  /**
   * <p>
   * Setter method for the COM property "NumberOfRecipientSelectors"
   * </p>
   * @param numberOfRecipientSelectors Mandatory RT_MSOutlook.OlRecipientSelectors parameter.
   */

  @DISPID(64233) //= 0xfae9. The runtime will prefer the VTID if present
  @VTID(29)
  void numberOfRecipientSelectors(
    RT_MSOutlook.OlRecipientSelectors numberOfRecipientSelectors);


  /**
   * <p>
   * Getter method for the COM property "InitialAddressList"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.AddressList
   */

  @DISPID(64234) //= 0xfaea. The runtime will prefer the VTID if present
  @VTID(30)
  RT_MSOutlook.AddressList initialAddressList();


  /**
   * <p>
   * Setter method for the COM property "InitialAddressList"
   * </p>
   * @param initialAddressList Mandatory RT_MSOutlook.AddressList parameter.
   */

  @DISPID(64234) //= 0xfaea. The runtime will prefer the VTID if present
  @VTID(31)
  void initialAddressList(
    RT_MSOutlook.AddressList initialAddressList);


  /**
   * @param defaultMode Mandatory RT_MSOutlook.OlDefaultSelectNamesDisplayMode parameter.
   */

  @DISPID(64235) //= 0xfaeb. The runtime will prefer the VTID if present
  @VTID(32)
  void setDefaultDisplayMode(
    RT_MSOutlook.OlDefaultSelectNamesDisplayMode defaultMode);


  // Properties:
}

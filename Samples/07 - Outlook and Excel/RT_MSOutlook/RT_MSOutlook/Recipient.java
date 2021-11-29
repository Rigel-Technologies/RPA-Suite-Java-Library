package RT_MSOutlook  ;

import com4j.*;

@IID("{00063045-0000-0000-C000-000000000046}")
public interface Recipient extends Com4jObject {
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

  @DISPID(109) //= 0x6d. The runtime will prefer the VTID if present
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
   * Getter method for the COM property "AddressEntry"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.AddressEntry
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook.AddressEntry addressEntry();


  /**
   * <p>
   * Setter method for the COM property "AddressEntry"
   * </p>
   * @param addressEntry Mandatory RT_MSOutlook.AddressEntry parameter.
   */

  @DISPID(121) //= 0x79. The runtime will prefer the VTID if present
  @VTID(13)
  void addressEntry(
    RT_MSOutlook.AddressEntry addressEntry);


  /**
   * <p>
   * Getter method for the COM property "AutoResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String autoResponse();


  /**
   * <p>
   * Setter method for the COM property "AutoResponse"
   * </p>
   * @param autoResponse Mandatory java.lang.String parameter.
   */

  @DISPID(106) //= 0x6a. The runtime will prefer the VTID if present
  @VTID(15)
  void autoResponse(
    java.lang.String autoResponse);


  /**
   * <p>
   * Getter method for the COM property "DisplayType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlDisplayType
   */

  @DISPID(14592) //= 0x3900. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook.OlDisplayType displayType();


  /**
   * <p>
   * Getter method for the COM property "EntryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(61470) //= 0xf01e. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String entryID();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(91) //= 0x5b. The runtime will prefer the VTID if present
  @VTID(18)
  int index();


  /**
   * <p>
   * Getter method for the COM property "MeetingResponseStatus"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlResponseStatus
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook.OlResponseStatus meetingResponseStatus();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(12289) //= 0x3001. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Resolved"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(100) //= 0x64. The runtime will prefer the VTID if present
  @VTID(21)
  boolean resolved();


  /**
   * <p>
   * Getter method for the COM property "TrackingStatus"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlTrackingStatus
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook.OlTrackingStatus trackingStatus();


  /**
   * <p>
   * Setter method for the COM property "TrackingStatus"
   * </p>
   * @param trackingStatus Mandatory RT_MSOutlook.OlTrackingStatus parameter.
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(23)
  void trackingStatus(
    RT_MSOutlook.OlTrackingStatus trackingStatus);


  /**
   * <p>
   * Getter method for the COM property "TrackingStatusTime"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(24)
  java.util.Date trackingStatusTime();


  /**
   * <p>
   * Setter method for the COM property "TrackingStatusTime"
   * </p>
   * @param trackingStatusTime Mandatory java.util.Date parameter.
   */

  @DISPID(119) //= 0x77. The runtime will prefer the VTID if present
  @VTID(25)
  void trackingStatusTime(
    java.util.Date trackingStatusTime);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(3093) //= 0xc15. The runtime will prefer the VTID if present
  @VTID(26)
  int type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param type Mandatory int parameter.
   */

  @DISPID(3093) //= 0xc15. The runtime will prefer the VTID if present
  @VTID(27)
  void type(
    int type);


  /**
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(28)
  void delete();


  /**
   * @param start Mandatory java.util.Date parameter.
   * @param minPerChar Mandatory int parameter.
   * @param completeFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String freeBusy(
    java.util.Date start,
    int minPerChar,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object completeFormat);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(30)
  boolean resolve();


  /**
   * <p>
   * Getter method for the COM property "PropertyAccessor"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PropertyAccessor
   */

  @DISPID(64253) //= 0xfafd. The runtime will prefer the VTID if present
  @VTID(31)
  RT_MSOutlook._PropertyAccessor propertyAccessor();


  /**
   * <p>
   * Getter method for the COM property "Sendable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64628) //= 0xfc74. The runtime will prefer the VTID if present
  @VTID(32)
  boolean sendable();


  /**
   * <p>
   * Setter method for the COM property "Sendable"
   * </p>
   * @param sendable Mandatory boolean parameter.
   */

  @DISPID(64628) //= 0xfc74. The runtime will prefer the VTID if present
  @VTID(33)
  void sendable(
    boolean sendable);


  // Properties:
}

package RT_MSOutlook  ;

import com4j.*;

@IID("{000630E2-0000-0000-C000-000000000046}")
public interface _CalendarSharing extends Com4jObject {
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
   * @param path Mandatory java.lang.String parameter.
   */

  @DISPID(64408) //= 0xfb98. The runtime will prefer the VTID if present
  @VTID(11)
  void saveAsICal(
    java.lang.String path);


  /**
   * @param mailFormat Mandatory RT_MSOutlook.OlCalendarMailFormat parameter.
   * @return  Returns a value of type RT_MSOutlook._MailItem
   */

  @DISPID(64409) //= 0xfb99. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._MailItem forwardAsICal(
    RT_MSOutlook.OlCalendarMailFormat mailFormat);


  /**
   * <p>
   * Getter method for the COM property "CalendarDetail"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlCalendarDetail
   */

  @DISPID(64410) //= 0xfb9a. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.OlCalendarDetail calendarDetail();


  /**
   * <p>
   * Setter method for the COM property "CalendarDetail"
   * </p>
   * @param calendarDetail Mandatory RT_MSOutlook.OlCalendarDetail parameter.
   */

  @DISPID(64410) //= 0xfb9a. The runtime will prefer the VTID if present
  @VTID(14)
  void calendarDetail(
    RT_MSOutlook.OlCalendarDetail calendarDetail);


  /**
   * <p>
   * Getter method for the COM property "EndDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64411) //= 0xfb9b. The runtime will prefer the VTID if present
  @VTID(15)
  java.util.Date endDate();


  /**
   * <p>
   * Setter method for the COM property "EndDate"
   * </p>
   * @param endDate Mandatory java.util.Date parameter.
   */

  @DISPID(64411) //= 0xfb9b. The runtime will prefer the VTID if present
  @VTID(16)
  void endDate(
    java.util.Date endDate);


  /**
   * <p>
   * Getter method for the COM property "Folder"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64412) //= 0xfb9c. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook.MAPIFolder folder();


  /**
   * <p>
   * Getter method for the COM property "IncludeAttachments"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64413) //= 0xfb9d. The runtime will prefer the VTID if present
  @VTID(18)
  boolean includeAttachments();


  /**
   * <p>
   * Setter method for the COM property "IncludeAttachments"
   * </p>
   * @param includeAttachments Mandatory boolean parameter.
   */

  @DISPID(64413) //= 0xfb9d. The runtime will prefer the VTID if present
  @VTID(19)
  void includeAttachments(
    boolean includeAttachments);


  /**
   * <p>
   * Getter method for the COM property "IncludePrivateDetails"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64414) //= 0xfb9e. The runtime will prefer the VTID if present
  @VTID(20)
  boolean includePrivateDetails();


  /**
   * <p>
   * Setter method for the COM property "IncludePrivateDetails"
   * </p>
   * @param includePrivateDetails Mandatory boolean parameter.
   */

  @DISPID(64414) //= 0xfb9e. The runtime will prefer the VTID if present
  @VTID(21)
  void includePrivateDetails(
    boolean includePrivateDetails);


  /**
   * <p>
   * Getter method for the COM property "RestrictToWorkingHours"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64415) //= 0xfb9f. The runtime will prefer the VTID if present
  @VTID(22)
  boolean restrictToWorkingHours();


  /**
   * <p>
   * Setter method for the COM property "RestrictToWorkingHours"
   * </p>
   * @param restrictToWorkingHours Mandatory boolean parameter.
   */

  @DISPID(64415) //= 0xfb9f. The runtime will prefer the VTID if present
  @VTID(23)
  void restrictToWorkingHours(
    boolean restrictToWorkingHours);


  /**
   * <p>
   * Getter method for the COM property "StartDate"
   * </p>
   * @return  Returns a value of type java.util.Date
   */

  @DISPID(64416) //= 0xfba0. The runtime will prefer the VTID if present
  @VTID(24)
  java.util.Date startDate();


  /**
   * <p>
   * Setter method for the COM property "StartDate"
   * </p>
   * @param startDate Mandatory java.util.Date parameter.
   */

  @DISPID(64416) //= 0xfba0. The runtime will prefer the VTID if present
  @VTID(25)
  void startDate(
    java.util.Date startDate);


  /**
   * <p>
   * Getter method for the COM property "IncludeWholeCalendar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64417) //= 0xfba1. The runtime will prefer the VTID if present
  @VTID(26)
  boolean includeWholeCalendar();


  /**
   * <p>
   * Setter method for the COM property "IncludeWholeCalendar"
   * </p>
   * @param includeWholeCalendar Mandatory boolean parameter.
   */

  @DISPID(64417) //= 0xfba1. The runtime will prefer the VTID if present
  @VTID(27)
  void includeWholeCalendar(
    boolean includeWholeCalendar);


  // Properties:
}

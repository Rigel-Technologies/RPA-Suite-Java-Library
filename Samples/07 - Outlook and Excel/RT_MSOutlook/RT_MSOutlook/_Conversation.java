package RT_MSOutlook  ;

import com4j.*;

@IID("{00063101-0000-0000-C000-000000000046}")
public interface _Conversation extends Com4jObject {
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
   * @return  Returns a value of type RT_MSOutlook._Table
   */

  @DISPID(64591) //= 0xfc4f. The runtime will prefer the VTID if present
  @VTID(11)
  RT_MSOutlook._Table getTable();


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type RT_MSOutlook._SimpleItems
   */

  @DISPID(64592) //= 0xfc50. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._SimpleItems getChildren(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject item);


  /**
   * @param item Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(64594) //= 0xfc52. The runtime will prefer the VTID if present
  @VTID(13)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getParent(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject item);


  /**
   * @return  Returns a value of type RT_MSOutlook._SimpleItems
   */

  @DISPID(64595) //= 0xfc53. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook._SimpleItems getRootItems();


  /**
   * @param store Mandatory RT_MSOutlook._Store parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64602) //= 0xfc5a. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String getAlwaysAssignCategories(
    RT_MSOutlook._Store store);


  /**
   * @param store Mandatory RT_MSOutlook._Store parameter.
   * @return  Returns a value of type RT_MSOutlook.OlAlwaysDeleteConversation
   */

  @DISPID(64603) //= 0xfc5b. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook.OlAlwaysDeleteConversation getAlwaysDelete(
    RT_MSOutlook._Store store);


  /**
   * @param store Mandatory RT_MSOutlook._Store parameter.
   * @return  Returns a value of type RT_MSOutlook.MAPIFolder
   */

  @DISPID(64604) //= 0xfc5c. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook.MAPIFolder getAlwaysMoveToFolder(
    RT_MSOutlook._Store store);


  /**
   */

  @DISPID(64605) //= 0xfc5d. The runtime will prefer the VTID if present
  @VTID(18)
  void markAsRead();


  /**
   */

  @DISPID(64606) //= 0xfc5e. The runtime will prefer the VTID if present
  @VTID(19)
  void markAsUnread();


  /**
   * @param categories Mandatory java.lang.String parameter.
   * @param store Mandatory RT_MSOutlook._Store parameter.
   */

  @DISPID(64607) //= 0xfc5f. The runtime will prefer the VTID if present
  @VTID(20)
  void setAlwaysAssignCategories(
    java.lang.String categories,
    RT_MSOutlook._Store store);


  /**
   * @param alwaysDelete Mandatory RT_MSOutlook.OlAlwaysDeleteConversation parameter.
   * @param store Mandatory RT_MSOutlook._Store parameter.
   */

  @DISPID(64608) //= 0xfc60. The runtime will prefer the VTID if present
  @VTID(21)
  void setAlwaysDelete(
    RT_MSOutlook.OlAlwaysDeleteConversation alwaysDelete,
    RT_MSOutlook._Store store);


  /**
   * @param moveToFolder Mandatory RT_MSOutlook.MAPIFolder parameter.
   * @param store Mandatory RT_MSOutlook._Store parameter.
   */

  @DISPID(64609) //= 0xfc61. The runtime will prefer the VTID if present
  @VTID(22)
  void setAlwaysMoveToFolder(
    RT_MSOutlook.MAPIFolder moveToFolder,
    RT_MSOutlook._Store store);


  /**
   * @param store Mandatory RT_MSOutlook._Store parameter.
   */

  @DISPID(64610) //= 0xfc62. The runtime will prefer the VTID if present
  @VTID(23)
  void clearAlwaysAssignCategories(
    RT_MSOutlook._Store store);


  /**
   * @param store Mandatory RT_MSOutlook._Store parameter.
   */

  @DISPID(64611) //= 0xfc63. The runtime will prefer the VTID if present
  @VTID(24)
  void stopAlwaysDelete(
    RT_MSOutlook._Store store);


  /**
   * @param store Mandatory RT_MSOutlook._Store parameter.
   */

  @DISPID(64612) //= 0xfc64. The runtime will prefer the VTID if present
  @VTID(25)
  void stopAlwaysMoveToFolder(
    RT_MSOutlook._Store store);


  /**
   * <p>
   * Getter method for the COM property "ConversationID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64629) //= 0xfc75. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String conversationID();


  // Properties:
}

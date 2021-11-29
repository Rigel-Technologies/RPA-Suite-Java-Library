package RT_MSOutlook  ;

import com4j.*;

@IID("{00063096-0000-0000-C000-000000000046}")
public interface _TableView extends Com4jObject {
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
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(11)
  void apply();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param saveOption Optional parameter. Default value is 0
   * @return  Returns a value of type RT_MSOutlook.View
   */

  @DISPID(61490) //= 0xf032. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook.View copy(
    java.lang.String name,
    @Optional RT_MSOutlook.OlViewSaveOption saveOption);


  /**
   */

  @DISPID(61514) //= 0xf04a. The runtime will prefer the VTID if present
  @VTID(13)
  void delete();


  /**
   */

  @DISPID(64068) //= 0xfa44. The runtime will prefer the VTID if present
  @VTID(14)
  void reset();


  /**
   */

  @DISPID(61512) //= 0xf048. The runtime will prefer the VTID if present
  @VTID(15)
  void save();


  /**
   * <p>
   * Getter method for the COM property "Language"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64065) //= 0xfa41. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String language();


  /**
   * <p>
   * Setter method for the COM property "Language"
   * </p>
   * @param language Mandatory java.lang.String parameter.
   */

  @DISPID(64065) //= 0xfa41. The runtime will prefer the VTID if present
  @VTID(17)
  void language(
    java.lang.String language);


  /**
   * <p>
   * Getter method for the COM property "LockUserChanges"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64064) //= 0xfa40. The runtime will prefer the VTID if present
  @VTID(18)
  boolean lockUserChanges();


  /**
   * <p>
   * Setter method for the COM property "LockUserChanges"
   * </p>
   * @param lockUserChanges Mandatory boolean parameter.
   */

  @DISPID(64064) //= 0xfa40. The runtime will prefer the VTID if present
  @VTID(19)
  void lockUserChanges(
    boolean lockUserChanges);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(20)
  @DefaultMethod
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(21)
  @DefaultMethod
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "SaveOption"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlViewSaveOption
   */

  @DISPID(64063) //= 0xfa3f. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook.OlViewSaveOption saveOption();


  /**
   * <p>
   * Getter method for the COM property "Standard"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64062) //= 0xfa3e. The runtime will prefer the VTID if present
  @VTID(23)
  boolean standard();


  /**
   * <p>
   * Getter method for the COM property "ViewType"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlViewType
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(24)
  RT_MSOutlook.OlViewType viewType();


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64060) //= 0xfa3c. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String xml();


  /**
   * <p>
   * Setter method for the COM property "XML"
   * </p>
   * @param xml Mandatory java.lang.String parameter.
   */

  @DISPID(64060) //= 0xfa3c. The runtime will prefer the VTID if present
  @VTID(26)
  void xml(
    java.lang.String xml);


  /**
   * @param date Mandatory java.util.Date parameter.
   */

  @DISPID(64054) //= 0xfa36. The runtime will prefer the VTID if present
  @VTID(27)
  void goToDate(
    java.util.Date date);


  /**
   * <p>
   * Getter method for the COM property "Filter"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String filter();


  /**
   * <p>
   * Setter method for the COM property "Filter"
   * </p>
   * @param filter Mandatory java.lang.String parameter.
   */

  @DISPID(409) //= 0x199. The runtime will prefer the VTID if present
  @VTID(29)
  void filter(
    java.lang.String filter);


  /**
   * <p>
   * Getter method for the COM property "ViewFields"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._ViewFields
   */

  @DISPID(64341) //= 0xfb55. The runtime will prefer the VTID if present
  @VTID(30)
  RT_MSOutlook._ViewFields viewFields();


  /**
   * <p>
   * Getter method for the COM property "GroupByFields"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._OrderFields
   */

  @DISPID(64344) //= 0xfb58. The runtime will prefer the VTID if present
  @VTID(31)
  RT_MSOutlook._OrderFields groupByFields();


  /**
   * <p>
   * Getter method for the COM property "SortFields"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._OrderFields
   */

  @DISPID(64346) //= 0xfb5a. The runtime will prefer the VTID if present
  @VTID(32)
  RT_MSOutlook._OrderFields sortFields();


  /**
   * <p>
   * Getter method for the COM property "MaxLinesInMultiLineView"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64347) //= 0xfb5b. The runtime will prefer the VTID if present
  @VTID(33)
  int maxLinesInMultiLineView();


  /**
   * <p>
   * Setter method for the COM property "MaxLinesInMultiLineView"
   * </p>
   * @param maxLinesInMultiLineView Mandatory int parameter.
   */

  @DISPID(64347) //= 0xfb5b. The runtime will prefer the VTID if present
  @VTID(34)
  void maxLinesInMultiLineView(
    int maxLinesInMultiLineView);


  /**
   * <p>
   * Getter method for the COM property "AutomaticGrouping"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64345) //= 0xfb59. The runtime will prefer the VTID if present
  @VTID(35)
  boolean automaticGrouping();


  /**
   * <p>
   * Setter method for the COM property "AutomaticGrouping"
   * </p>
   * @param automaticGrouping Mandatory boolean parameter.
   */

  @DISPID(64345) //= 0xfb59. The runtime will prefer the VTID if present
  @VTID(36)
  void automaticGrouping(
    boolean automaticGrouping);


  /**
   * <p>
   * Getter method for the COM property "DefaultExpandCollapseSetting"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlDefaultExpandCollapseSetting
   */

  @DISPID(64384) //= 0xfb80. The runtime will prefer the VTID if present
  @VTID(37)
  RT_MSOutlook.OlDefaultExpandCollapseSetting defaultExpandCollapseSetting();


  /**
   * <p>
   * Setter method for the COM property "DefaultExpandCollapseSetting"
   * </p>
   * @param defaultExpandCollapseSetting Mandatory RT_MSOutlook.OlDefaultExpandCollapseSetting parameter.
   */

  @DISPID(64384) //= 0xfb80. The runtime will prefer the VTID if present
  @VTID(38)
  void defaultExpandCollapseSetting(
    RT_MSOutlook.OlDefaultExpandCollapseSetting defaultExpandCollapseSetting);


  /**
   * <p>
   * Getter method for the COM property "AutomaticColumnSizing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64348) //= 0xfb5c. The runtime will prefer the VTID if present
  @VTID(39)
  boolean automaticColumnSizing();


  /**
   * <p>
   * Setter method for the COM property "AutomaticColumnSizing"
   * </p>
   * @param automaticColumnSizing Mandatory boolean parameter.
   */

  @DISPID(64348) //= 0xfb5c. The runtime will prefer the VTID if present
  @VTID(40)
  void automaticColumnSizing(
    boolean automaticColumnSizing);


  /**
   * <p>
   * Getter method for the COM property "MultiLine"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlMultiLine
   */

  @DISPID(64349) //= 0xfb5d. The runtime will prefer the VTID if present
  @VTID(41)
  RT_MSOutlook.OlMultiLine multiLine();


  /**
   * <p>
   * Setter method for the COM property "MultiLine"
   * </p>
   * @param multiLine Mandatory RT_MSOutlook.OlMultiLine parameter.
   */

  @DISPID(64349) //= 0xfb5d. The runtime will prefer the VTID if present
  @VTID(42)
  void multiLine(
    RT_MSOutlook.OlMultiLine multiLine);


  /**
   * <p>
   * Getter method for the COM property "MultiLineWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64350) //= 0xfb5e. The runtime will prefer the VTID if present
  @VTID(43)
  int multiLineWidth();


  /**
   * <p>
   * Setter method for the COM property "MultiLineWidth"
   * </p>
   * @param multiLineWidth Mandatory int parameter.
   */

  @DISPID(64350) //= 0xfb5e. The runtime will prefer the VTID if present
  @VTID(44)
  void multiLineWidth(
    int multiLineWidth);


  /**
   * <p>
   * Getter method for the COM property "AllowInCellEditing"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64351) //= 0xfb5f. The runtime will prefer the VTID if present
  @VTID(45)
  boolean allowInCellEditing();


  /**
   * <p>
   * Setter method for the COM property "AllowInCellEditing"
   * </p>
   * @param allowInCellEditing Mandatory boolean parameter.
   */

  @DISPID(64351) //= 0xfb5f. The runtime will prefer the VTID if present
  @VTID(46)
  void allowInCellEditing(
    boolean allowInCellEditing);


  /**
   * <p>
   * Getter method for the COM property "ShowNewItemRow"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64352) //= 0xfb60. The runtime will prefer the VTID if present
  @VTID(47)
  boolean showNewItemRow();


  /**
   * <p>
   * Setter method for the COM property "ShowNewItemRow"
   * </p>
   * @param showNewItemRow Mandatory boolean parameter.
   */

  @DISPID(64352) //= 0xfb60. The runtime will prefer the VTID if present
  @VTID(48)
  void showNewItemRow(
    boolean showNewItemRow);


  /**
   * <p>
   * Getter method for the COM property "GridLineStyle"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlGridLineStyle
   */

  @DISPID(64353) //= 0xfb61. The runtime will prefer the VTID if present
  @VTID(49)
  RT_MSOutlook.OlGridLineStyle gridLineStyle();


  /**
   * <p>
   * Setter method for the COM property "GridLineStyle"
   * </p>
   * @param gridLineStyle Mandatory RT_MSOutlook.OlGridLineStyle parameter.
   */

  @DISPID(64353) //= 0xfb61. The runtime will prefer the VTID if present
  @VTID(50)
  void gridLineStyle(
    RT_MSOutlook.OlGridLineStyle gridLineStyle);


  /**
   * <p>
   * Getter method for the COM property "ShowItemsInGroups"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64354) //= 0xfb62. The runtime will prefer the VTID if present
  @VTID(51)
  boolean showItemsInGroups();


  /**
   * <p>
   * Setter method for the COM property "ShowItemsInGroups"
   * </p>
   * @param showItemsInGroups Mandatory boolean parameter.
   */

  @DISPID(64354) //= 0xfb62. The runtime will prefer the VTID if present
  @VTID(52)
  void showItemsInGroups(
    boolean showItemsInGroups);


  /**
   * <p>
   * Getter method for the COM property "ShowReadingPane"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64355) //= 0xfb63. The runtime will prefer the VTID if present
  @VTID(53)
  boolean showReadingPane();


  /**
   * <p>
   * Setter method for the COM property "ShowReadingPane"
   * </p>
   * @param showReadingPane Mandatory boolean parameter.
   */

  @DISPID(64355) //= 0xfb63. The runtime will prefer the VTID if present
  @VTID(54)
  void showReadingPane(
    boolean showReadingPane);


  /**
   * <p>
   * Getter method for the COM property "HideReadingPaneHeaderInfo"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64356) //= 0xfb64. The runtime will prefer the VTID if present
  @VTID(55)
  boolean hideReadingPaneHeaderInfo();


  /**
   * <p>
   * Setter method for the COM property "HideReadingPaneHeaderInfo"
   * </p>
   * @param hideReadingPaneHeaderInfo Mandatory boolean parameter.
   */

  @DISPID(64356) //= 0xfb64. The runtime will prefer the VTID if present
  @VTID(56)
  void hideReadingPaneHeaderInfo(
    boolean hideReadingPaneHeaderInfo);


  /**
   * <p>
   * Getter method for the COM property "ShowUnreadAndFlaggedMessages"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64357) //= 0xfb65. The runtime will prefer the VTID if present
  @VTID(57)
  boolean showUnreadAndFlaggedMessages();


  /**
   * <p>
   * Setter method for the COM property "ShowUnreadAndFlaggedMessages"
   * </p>
   * @param showUnreadAndFlaggedMessages Mandatory boolean parameter.
   */

  @DISPID(64357) //= 0xfb65. The runtime will prefer the VTID if present
  @VTID(58)
  void showUnreadAndFlaggedMessages(
    boolean showUnreadAndFlaggedMessages);


  /**
   * <p>
   * Getter method for the COM property "RowFont"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._ViewFont
   */

  @DISPID(64360) //= 0xfb68. The runtime will prefer the VTID if present
  @VTID(59)
  RT_MSOutlook._ViewFont rowFont();


  /**
   * <p>
   * Getter method for the COM property "ColumnFont"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._ViewFont
   */

  @DISPID(64359) //= 0xfb67. The runtime will prefer the VTID if present
  @VTID(60)
  RT_MSOutlook._ViewFont columnFont();


  /**
   * <p>
   * Getter method for the COM property "AutoPreviewFont"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._ViewFont
   */

  @DISPID(64361) //= 0xfb69. The runtime will prefer the VTID if present
  @VTID(61)
  RT_MSOutlook._ViewFont autoPreviewFont();


  /**
   * <p>
   * Getter method for the COM property "AutoPreview"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlAutoPreview
   */

  @DISPID(64376) //= 0xfb78. The runtime will prefer the VTID if present
  @VTID(62)
  RT_MSOutlook.OlAutoPreview autoPreview();


  /**
   * <p>
   * Setter method for the COM property "AutoPreview"
   * </p>
   * @param autoPreview Mandatory RT_MSOutlook.OlAutoPreview parameter.
   */

  @DISPID(64376) //= 0xfb78. The runtime will prefer the VTID if present
  @VTID(63)
  void autoPreview(
    RT_MSOutlook.OlAutoPreview autoPreview);


  /**
   * <p>
   * Getter method for the COM property "AutoFormatRules"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._AutoFormatRules
   */

  @DISPID(64059) //= 0xfa3b. The runtime will prefer the VTID if present
  @VTID(64)
  RT_MSOutlook._AutoFormatRules autoFormatRules();


  /**
   * @return  Returns a value of type RT_MSOutlook._Table
   */

  @DISPID(64285) //= 0xfb1d. The runtime will prefer the VTID if present
  @VTID(65)
  RT_MSOutlook._Table getTable();


  /**
   * <p>
   * Getter method for the COM property "ShowConversationByDate"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64640) //= 0xfc80. The runtime will prefer the VTID if present
  @VTID(66)
  boolean showConversationByDate();


  /**
   * <p>
   * Setter method for the COM property "ShowConversationByDate"
   * </p>
   * @param showConversationByDate Mandatory boolean parameter.
   */

  @DISPID(64640) //= 0xfc80. The runtime will prefer the VTID if present
  @VTID(67)
  void showConversationByDate(
    boolean showConversationByDate);


  /**
   * <p>
   * Getter method for the COM property "ShowFullConversations"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64641) //= 0xfc81. The runtime will prefer the VTID if present
  @VTID(68)
  boolean showFullConversations();


  /**
   * <p>
   * Setter method for the COM property "ShowFullConversations"
   * </p>
   * @param showFullConversations Mandatory boolean parameter.
   */

  @DISPID(64641) //= 0xfc81. The runtime will prefer the VTID if present
  @VTID(69)
  void showFullConversations(
    boolean showFullConversations);


  /**
   * <p>
   * Getter method for the COM property "AlwaysExpandConversation"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64643) //= 0xfc83. The runtime will prefer the VTID if present
  @VTID(70)
  boolean alwaysExpandConversation();


  /**
   * <p>
   * Setter method for the COM property "AlwaysExpandConversation"
   * </p>
   * @param alwaysExpandConversation Mandatory boolean parameter.
   */

  @DISPID(64643) //= 0xfc83. The runtime will prefer the VTID if present
  @VTID(71)
  void alwaysExpandConversation(
    boolean alwaysExpandConversation);


  /**
   * <p>
   * Getter method for the COM property "ShowConversationSendersAboveSubject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64649) //= 0xfc89. The runtime will prefer the VTID if present
  @VTID(72)
  boolean showConversationSendersAboveSubject();


  /**
   * <p>
   * Setter method for the COM property "ShowConversationSendersAboveSubject"
   * </p>
   * @param showConversationSendersAboveSubject Mandatory boolean parameter.
   */

  @DISPID(64649) //= 0xfc89. The runtime will prefer the VTID if present
  @VTID(73)
  void showConversationSendersAboveSubject(
    boolean showConversationSendersAboveSubject);


  // Properties:
}

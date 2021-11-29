package RT_MSOutlook  ;

import com4j.*;

@IID("{000630CE-0000-0000-C000-000000000046}")
public interface _RuleActions extends Com4jObject {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(80) //= 0x50. The runtime will prefer the VTID if present
  @VTID(11)
  int count();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(81) //= 0x51. The runtime will prefer the VTID if present
  @VTID(12)
  RT_MSOutlook._RuleAction item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "CopyToFolder"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._MoveOrCopyRuleAction
   */

  @DISPID(64274) //= 0xfb12. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook._MoveOrCopyRuleAction copyToFolder();


  /**
   * <p>
   * Getter method for the COM property "DeletePermanently"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(64275) //= 0xfb13. The runtime will prefer the VTID if present
  @VTID(14)
  RT_MSOutlook._RuleAction deletePermanently();


  /**
   * <p>
   * Getter method for the COM property "Delete"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(61509) //= 0xf045. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook._RuleAction delete();


  /**
   * <p>
   * Getter method for the COM property "DesktopAlert"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(64279) //= 0xfb17. The runtime will prefer the VTID if present
  @VTID(16)
  RT_MSOutlook._RuleAction desktopAlert();


  /**
   * <p>
   * Getter method for the COM property "NotifyDelivery"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(64278) //= 0xfb16. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook._RuleAction notifyDelivery();


  /**
   * <p>
   * Getter method for the COM property "NotifyRead"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(64277) //= 0xfb15. The runtime will prefer the VTID if present
  @VTID(18)
  RT_MSOutlook._RuleAction notifyRead();


  /**
   * <p>
   * Getter method for the COM property "Stop"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(64276) //= 0xfb14. The runtime will prefer the VTID if present
  @VTID(19)
  RT_MSOutlook._RuleAction stop();


  /**
   * <p>
   * Getter method for the COM property "MoveToFolder"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._MoveOrCopyRuleAction
   */

  @DISPID(64280) //= 0xfb18. The runtime will prefer the VTID if present
  @VTID(20)
  RT_MSOutlook._MoveOrCopyRuleAction moveToFolder();


  /**
   * <p>
   * Getter method for the COM property "CC"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._SendRuleAction
   */

  @DISPID(64281) //= 0xfb19. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook._SendRuleAction cc();


  /**
   * <p>
   * Getter method for the COM property "Forward"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._SendRuleAction
   */

  @DISPID(64282) //= 0xfb1a. The runtime will prefer the VTID if present
  @VTID(22)
  RT_MSOutlook._SendRuleAction forward();


  /**
   * <p>
   * Getter method for the COM property "ForwardAsAttachment"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._SendRuleAction
   */

  @DISPID(64283) //= 0xfb1b. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook._SendRuleAction forwardAsAttachment();


  /**
   * <p>
   * Getter method for the COM property "Redirect"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._SendRuleAction
   */

  @DISPID(64284) //= 0xfb1c. The runtime will prefer the VTID if present
  @VTID(24)
  RT_MSOutlook._SendRuleAction redirect();


  /**
   * <p>
   * Getter method for the COM property "AssignToCategory"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._AssignToCategoryRuleAction
   */

  @DISPID(64290) //= 0xfb22. The runtime will prefer the VTID if present
  @VTID(25)
  RT_MSOutlook._AssignToCategoryRuleAction assignToCategory();


  /**
   * <p>
   * Getter method for the COM property "PlaySound"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._PlaySoundRuleAction
   */

  @DISPID(64291) //= 0xfb23. The runtime will prefer the VTID if present
  @VTID(26)
  RT_MSOutlook._PlaySoundRuleAction playSound();


  /**
   * <p>
   * Getter method for the COM property "MarkAsTask"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._MarkAsTaskRuleAction
   */

  @DISPID(64294) //= 0xfb26. The runtime will prefer the VTID if present
  @VTID(27)
  RT_MSOutlook._MarkAsTaskRuleAction markAsTask();


  /**
   * <p>
   * Getter method for the COM property "NewItemAlert"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._NewItemAlertRuleAction
   */

  @DISPID(64296) //= 0xfb28. The runtime will prefer the VTID if present
  @VTID(28)
  RT_MSOutlook._NewItemAlertRuleAction newItemAlert();


  /**
   * <p>
   * Getter method for the COM property "ClearCategories"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._RuleAction
   */

  @DISPID(64530) //= 0xfc12. The runtime will prefer the VTID if present
  @VTID(29)
  RT_MSOutlook._RuleAction clearCategories();


  // Properties:
}

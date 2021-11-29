package RT_MSOutlook  ;

import com4j.*;

@IID("{000630E6-0000-0000-C000-000000000046}")
public interface _NavigationPane extends Com4jObject {
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
   * Getter method for the COM property "IsCollapsed"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(64436) //= 0xfbb4. The runtime will prefer the VTID if present
  @VTID(11)
  boolean isCollapsed();


  /**
   * <p>
   * Setter method for the COM property "IsCollapsed"
   * </p>
   * @param isCollapsed Mandatory boolean parameter.
   */

  @DISPID(64436) //= 0xfbb4. The runtime will prefer the VTID if present
  @VTID(12)
  void isCollapsed(
    boolean isCollapsed);


  /**
   * <p>
   * Getter method for the COM property "CurrentModule"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._NavigationModule
   */

  @DISPID(64437) //= 0xfbb5. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook._NavigationModule currentModule();


  /**
   * <p>
   * Setter method for the COM property "CurrentModule"
   * </p>
   * @param currentModule Mandatory RT_MSOutlook._NavigationModule parameter.
   */

  @DISPID(64437) //= 0xfbb5. The runtime will prefer the VTID if present
  @VTID(14)
  void currentModule(
    RT_MSOutlook._NavigationModule currentModule);


  /**
   * <p>
   * Getter method for the COM property "DisplayedModuleCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64438) //= 0xfbb6. The runtime will prefer the VTID if present
  @VTID(15)
  int displayedModuleCount();


  /**
   * <p>
   * Setter method for the COM property "DisplayedModuleCount"
   * </p>
   * @param displayedModuleCount Mandatory int parameter.
   */

  @DISPID(64438) //= 0xfbb6. The runtime will prefer the VTID if present
  @VTID(16)
  void displayedModuleCount(
    int displayedModuleCount);


  /**
   * <p>
   * Getter method for the COM property "Modules"
   * </p>
   * @return  Returns a value of type RT_MSOutlook._NavigationModules
   */

  @DISPID(64439) //= 0xfbb7. The runtime will prefer the VTID if present
  @VTID(17)
  RT_MSOutlook._NavigationModules modules();


  // Properties:
}

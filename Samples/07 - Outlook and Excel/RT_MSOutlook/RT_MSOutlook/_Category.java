package RT_MSOutlook  ;

import com4j.*;

@IID("{000630E3-0000-0000-C000-000000000046}")
public interface _Category extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(8450) //= 0x2102. The runtime will prefer the VTID if present
  @VTID(12)
  void name(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlCategoryColor
   */

  @DISPID(64419) //= 0xfba3. The runtime will prefer the VTID if present
  @VTID(13)
  RT_MSOutlook.OlCategoryColor color();


  /**
   * <p>
   * Setter method for the COM property "Color"
   * </p>
   * @param color Mandatory RT_MSOutlook.OlCategoryColor parameter.
   */

  @DISPID(64419) //= 0xfba3. The runtime will prefer the VTID if present
  @VTID(14)
  void color(
    RT_MSOutlook.OlCategoryColor color);


  /**
   * <p>
   * Getter method for the COM property "ShortcutKey"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlCategoryShortcutKey
   */

  @DISPID(64420) //= 0xfba4. The runtime will prefer the VTID if present
  @VTID(15)
  RT_MSOutlook.OlCategoryShortcutKey shortcutKey();


  /**
   * <p>
   * Setter method for the COM property "ShortcutKey"
   * </p>
   * @param shortcutKey Mandatory RT_MSOutlook.OlCategoryShortcutKey parameter.
   */

  @DISPID(64420) //= 0xfba4. The runtime will prefer the VTID if present
  @VTID(16)
  void shortcutKey(
    RT_MSOutlook.OlCategoryShortcutKey shortcutKey);


  /**
   * <p>
   * Getter method for the COM property "CategoryID"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(64464) //= 0xfbd0. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String categoryID();


  /**
   * <p>
   * Getter method for the COM property "CategoryBorderColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64539) //= 0xfc1b. The runtime will prefer the VTID if present
  @VTID(18)
  int categoryBorderColor();


  /**
   * <p>
   * Getter method for the COM property "CategoryGradientTopColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64540) //= 0xfc1c. The runtime will prefer the VTID if present
  @VTID(19)
  int categoryGradientTopColor();


  /**
   * <p>
   * Getter method for the COM property "CategoryGradientBottomColor"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(64541) //= 0xfc1d. The runtime will prefer the VTID if present
  @VTID(20)
  int categoryGradientBottomColor();


  // Properties:
}

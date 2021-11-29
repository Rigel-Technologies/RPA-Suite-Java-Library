package RT_MSOutlook  ;

import com4j.*;

@IID("{00067366-0000-0000-C000-000000000046}")
public interface OlkControl extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "ItemProperty"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147356671) //= 0x8001f001. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String itemProperty();


  /**
   * <p>
   * Setter method for the COM property "ItemProperty"
   * </p>
   * @param itemProperty Mandatory java.lang.String parameter.
   */

  @DISPID(-2147356671) //= 0x8001f001. The runtime will prefer the VTID if present
  @VTID(8)
  void itemProperty(
    java.lang.String itemProperty);


  /**
   * <p>
   * Getter method for the COM property "ControlProperty"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147356669) //= 0x8001f003. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String controlProperty();


  /**
   * <p>
   * Setter method for the COM property "ControlProperty"
   * </p>
   * @param controlProperty Mandatory java.lang.String parameter.
   */

  @DISPID(-2147356669) //= 0x8001f003. The runtime will prefer the VTID if present
  @VTID(10)
  void controlProperty(
    java.lang.String controlProperty);


  /**
   * <p>
   * Getter method for the COM property "PossibleValues"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(-2147356668) //= 0x8001f004. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String possibleValues();


  /**
   * <p>
   * Setter method for the COM property "PossibleValues"
   * </p>
   * @param possibleValues Mandatory java.lang.String parameter.
   */

  @DISPID(-2147356668) //= 0x8001f004. The runtime will prefer the VTID if present
  @VTID(12)
  void possibleValues(
    java.lang.String possibleValues);


  /**
   * <p>
   * Getter method for the COM property "Format"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147356670) //= 0x8001f002. The runtime will prefer the VTID if present
  @VTID(13)
  int format();


  /**
   * <p>
   * Setter method for the COM property "Format"
   * </p>
   * @param format Mandatory int parameter.
   */

  @DISPID(-2147356670) //= 0x8001f002. The runtime will prefer the VTID if present
  @VTID(14)
  void format(
    int format);


  /**
   * <p>
   * Getter method for the COM property "EnableAutoLayout"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(-2147356655) //= 0x8001f011. The runtime will prefer the VTID if present
  @VTID(15)
  boolean enableAutoLayout();


  /**
   * <p>
   * Setter method for the COM property "EnableAutoLayout"
   * </p>
   * @param enableAutoLayout Mandatory boolean parameter.
   */

  @DISPID(-2147356655) //= 0x8001f011. The runtime will prefer the VTID if present
  @VTID(16)
  void enableAutoLayout(
    boolean enableAutoLayout);


  /**
   * <p>
   * Getter method for the COM property "MinimumWidth"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147356654) //= 0x8001f012. The runtime will prefer the VTID if present
  @VTID(17)
  int minimumWidth();


  /**
   * <p>
   * Setter method for the COM property "MinimumWidth"
   * </p>
   * @param minimumWidth Mandatory int parameter.
   */

  @DISPID(-2147356654) //= 0x8001f012. The runtime will prefer the VTID if present
  @VTID(18)
  void minimumWidth(
    int minimumWidth);


  /**
   * <p>
   * Getter method for the COM property "MinimumHeight"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(-2147356653) //= 0x8001f013. The runtime will prefer the VTID if present
  @VTID(19)
  int minimumHeight();


  /**
   * <p>
   * Setter method for the COM property "MinimumHeight"
   * </p>
   * @param minimumHeight Mandatory int parameter.
   */

  @DISPID(-2147356653) //= 0x8001f013. The runtime will prefer the VTID if present
  @VTID(20)
  void minimumHeight(
    int minimumHeight);


  /**
   * <p>
   * Getter method for the COM property "HorizontalLayout"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlHorizontalLayout
   */

  @DISPID(-2147356652) //= 0x8001f014. The runtime will prefer the VTID if present
  @VTID(21)
  RT_MSOutlook.OlHorizontalLayout horizontalLayout();


  /**
   * <p>
   * Setter method for the COM property "HorizontalLayout"
   * </p>
   * @param horizontalLayout Mandatory RT_MSOutlook.OlHorizontalLayout parameter.
   */

  @DISPID(-2147356652) //= 0x8001f014. The runtime will prefer the VTID if present
  @VTID(22)
  void horizontalLayout(
    RT_MSOutlook.OlHorizontalLayout horizontalLayout);


  /**
   * <p>
   * Getter method for the COM property "VerticalLayout"
   * </p>
   * @return  Returns a value of type RT_MSOutlook.OlVerticalLayout
   */

  @DISPID(-2147356651) //= 0x8001f015. The runtime will prefer the VTID if present
  @VTID(23)
  RT_MSOutlook.OlVerticalLayout verticalLayout();


  /**
   * <p>
   * Setter method for the COM property "VerticalLayout"
   * </p>
   * @param verticalLayout Mandatory RT_MSOutlook.OlVerticalLayout parameter.
   */

  @DISPID(-2147356651) //= 0x8001f015. The runtime will prefer the VTID if present
  @VTID(24)
  void verticalLayout(
    RT_MSOutlook.OlVerticalLayout verticalLayout);


  // Properties:
}

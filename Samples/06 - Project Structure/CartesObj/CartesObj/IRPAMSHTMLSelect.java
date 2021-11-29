package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLSelect Object
 */
@IID("{67F77C48-F519-4F97-B02F-8BD70376750A}")
public interface IRPAMSHTMLSelect extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String name();


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String optionValue(
    int index);


  /**
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String optionText(
    int index);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(41)
  int options();


  /**
   * <p>
   * Getter method for the COM property "Selected"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(42)
  int selected();


  /**
   * <p>
   * Setter method for the COM property "Selected"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(43)
  void selected(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(45)
  void text(
    java.lang.String value);


  // Properties:
}

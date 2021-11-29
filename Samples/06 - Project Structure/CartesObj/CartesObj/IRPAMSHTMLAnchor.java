package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAMSHTMLAnchor Object
 */
@IID("{3A4E0813-F343-4EE4-8AED-1999435A8445}")
public interface IRPAMSHTMLAnchor extends CartesObj.IRPAMSHTMLComponent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "href"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String href();


  /**
   * <p>
   * Setter method for the COM property "href"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(39)
  void href(
    java.lang.String value);


  // Properties:
}

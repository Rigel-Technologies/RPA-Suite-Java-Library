package CE_Data  ;

import com4j.*;

/**
 * Dispatch interface for XMLFile Object
 */
@IID("{2A3B27C7-50FD-4D6E-9141-9646CADDDC0B}")
public interface IXMLFile extends CE_Data.IXMLRecord {
  // Methods:
  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(13)
  void loadFromFile(
    java.lang.String filename);


  /**
   * @param filename Mandatory java.lang.String parameter.
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(14)
  void saveToFile(
    java.lang.String filename);


  /**
   * <p>
   * Getter method for the COM property "XML"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String xml();


  /**
   * <p>
   * Setter method for the COM property "XML"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(16)
  void xml(
    java.lang.String value);


  // Properties:
}

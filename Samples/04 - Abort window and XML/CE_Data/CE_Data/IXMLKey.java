package CE_Data  ;

import com4j.*;

/**
 * Dispatch interface for XMLKey Object
 */
@IID("{C6A18B0B-ED8E-41B3-B16B-C99092361557}")
public interface IXMLKey extends Com4jObject {
  // Methods:
  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String key();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int count();


  /**
   * <p>
   * Getter method for the COM property "AsString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String asString();


  /**
   * <p>
   * Setter method for the COM property "AsString"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  void asString(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ListAsString"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String listAsString(
    int index);


  /**
   * <p>
   * Setter method for the COM property "ListAsString"
   * </p>
   * @param index Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  void listAsString(
    int index,
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ListAsRecord"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type CE_Data.IXMLRecord
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  CE_Data.IXMLRecord listAsRecord(
    int index);


  /**
   * <p>
   * Setter method for the COM property "ListAsRecord"
   * </p>
   * @param index Mandatory int parameter.
   * @param value Mandatory CE_Data.IXMLRecord parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(14)
  void listAsRecord(
    int index,
    CE_Data.IXMLRecord value);


  /**
   * @param index Mandatory int parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(15)
  void delete(
    int index);


  /**
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void clear();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  int getPR();


  /**
   * @param value Mandatory CE_Data.IXMLKey parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  void setValue(
    CE_Data.IXMLKey value);


  // Properties:
}

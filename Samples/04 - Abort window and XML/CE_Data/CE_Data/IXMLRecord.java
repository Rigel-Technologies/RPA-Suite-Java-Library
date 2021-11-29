package CE_Data  ;

import com4j.*;

/**
 * Dispatch interface for XMLRecord Object
 */
@IID("{F512E8F8-F68F-4F0B-9A26-3805ECF40F83}")
public interface IXMLRecord extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void clear();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int getPR();


  /**
   * @param key Mandatory java.lang.String parameter.
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject getKey(
    java.lang.String key);


  /**
   * <p>
   * Getter method for the COM property "AsString"
   * </p>
   * @param key Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String asString(
    java.lang.String key);


  /**
   * <p>
   * Setter method for the COM property "AsString"
   * </p>
   * @param key Mandatory java.lang.String parameter.
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  void asString(
    java.lang.String key,
    java.lang.String value);


  /**
   * @param value Mandatory CE_Data.IXMLRecord parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  void setValue(
    CE_Data.IXMLRecord value);


  // Properties:
}

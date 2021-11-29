package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAVariable Object
 */
@IID("{45B22B11-4012-43D0-A793-4992DBF0AA5A}")
public interface IRPAVariable extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "name"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void name(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Descripcion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String descripcion();


  /**
   * <p>
   * Setter method for the COM property "Descripcion"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(10)
  void descripcion(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "api"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String api();


  /**
   * <p>
   * Getter method for the COM property "ComponentClass"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String componentClass();


  /**
   * <p>
   * Getter method for the COM property "Wrapper"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String wrapper();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  int capture();


  /**
   * <p>
   * Getter method for the COM property "Properties"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  int properties();


  /**
   * <p>
   * Getter method for the COM property "PropertyName"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String propertyName(
    int index);


  /**
   * <p>
   * Getter method for the COM property "PropertyValue"
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String propertyValue(
    java.lang.String name);


  /**
   * @param api Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(18)
  int captureFrom(
    java.lang.String api);


  /**
   * <p>
   * Getter method for the COM property "ImageFile"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String imageFile();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(20)
  int cloneAs(
    java.lang.String name);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(21)
  int componentExists();


  /**
   * <p>
   * Getter method for the COM property "HasRoute"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(22)
  int hasRoute();


  /**
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(23)
  int showRoute();


  // Properties:
}

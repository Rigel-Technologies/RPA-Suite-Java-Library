package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapTable Object
 */
@IID("{46617CBE-3729-410C-BFEC-9B84024496E1}")
public interface IRPASapTable extends CartesObj.IRPASapControl {
  // Methods:
  /**
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(33)
  int columnByName(
    java.lang.String name);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(34)
  int columns();


  /**
   */

  @DISPID(503) //= 0x1f7. The runtime will prefer the VTID if present
  @VTID(35)
  void configure();


  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(504) //= 0x1f8. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String doCell(
    int row,
    int column,
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(505) //= 0x1f9. The runtime will prefer the VTID if present
  @VTID(37)
  int rows();


  /**
   * <p>
   * Getter method for the COM property "VerticalScrollPosition"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(506) //= 0x1fa. The runtime will prefer the VTID if present
  @VTID(38)
  int verticalScrollPosition();


  /**
   * <p>
   * Setter method for the COM property "VerticalScrollPosition"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(506) //= 0x1fa. The runtime will prefer the VTID if present
  @VTID(39)
  void verticalScrollPosition(
    int value);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(507) //= 0x1fb. The runtime will prefer the VTID if present
  @VTID(40)
  int verticalScrollSize();


  // Properties:
}

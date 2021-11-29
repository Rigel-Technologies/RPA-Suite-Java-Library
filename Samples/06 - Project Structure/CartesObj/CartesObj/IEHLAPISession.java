package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for EHLAPISession Object
 */
@IID("{A28D5E7E-18E4-4854-A8CA-15287AE374D2}")
public interface IEHLAPISession extends CartesObj.IRPAComponent {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Columns"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(301) //= 0x12d. The runtime will prefer the VTID if present
  @VTID(20)
  int columns();


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(302) //= 0x12e. The runtime will prefer the VTID if present
  @VTID(21)
  int rows();


  /**
   * <p>
   * Getter method for the COM property "column"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(303) //= 0x12f. The runtime will prefer the VTID if present
  @VTID(22)
  int column();


  /**
   * <p>
   * Getter method for the COM property "row"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(304) //= 0x130. The runtime will prefer the VTID if present
  @VTID(23)
  int row();


  /**
   * <p>
   * Getter method for the COM property "Terminal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(305) //= 0x131. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String terminal();


  /**
   * <p>
   * Getter method for the COM property "Status"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(306) //= 0x132. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String status();


  /**
   * <p>
   * Getter method for the COM property "Connected"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(26)
  int connected();


  /**
   * <p>
   * Setter method for the COM property "Connected"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(307) //= 0x133. The runtime will prefer the VTID if present
  @VTID(27)
  void connected(
    int value);


  /**
   * @param row Mandatory int parameter.
   * @param column Mandatory int parameter.
   */

  @DISPID(308) //= 0x134. The runtime will prefer the VTID if present
  @VTID(28)
  void setCursor(
    int row,
    int column);


  /**
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(309) //= 0x135. The runtime will prefer the VTID if present
  @VTID(29)
  void sendKeys(
    java.lang.String value);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(310) //= 0x136. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String readAll();


  /**
   * @param top Mandatory int parameter.
   * @param left Mandatory int parameter.
   * @param bottom Mandatory int parameter.
   * @param right Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(311) //= 0x137. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String read(
    int top,
    int left,
    int bottom,
    int right);


  /**
   * <p>
   * Getter method for the COM property "Session"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(312) //= 0x138. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String session();


  /**
   * <p>
   * Getter method for the COM property "name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(313) //= 0x139. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String name();


  // Properties:
}

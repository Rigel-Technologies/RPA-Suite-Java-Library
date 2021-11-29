package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPAJava32Frame Object
 */
@IID("{A740B45B-D92C-4A61-BEF1-698BB525D818}")
public interface IRPAJava32Frame extends CartesObj.IRPAJava32Component {
  // Methods:
  /**
   * @return  Returns a value of type int
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(43)
  int handle();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String id();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String title();


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(46)
  void typeFromClipboard(
    int x,
    int y,
    java.lang.String value,
    int checkvalue);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String winClass();


  /**
   * @param method Mandatory java.lang.String parameter.
   * @param parameters Mandatory CartesObj.IRPAParameters parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String doWindows(
    java.lang.String method,
    CartesObj.IRPAParameters parameters);


  /**
   * @param value Mandatory int parameter.
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(49)
  void setVisible(
    int value);


  /**
   * @param x Mandatory int parameter.
   * @param y Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param checkvalue Mandatory int parameter.
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(50)
  void typeWord(
    int x,
    int y,
    java.lang.String value,
    int checkvalue);


  // Properties:
}

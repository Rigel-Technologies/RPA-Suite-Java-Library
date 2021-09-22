package CartesObj  ;

import com4j.*;

/**
 * Dispatch interface for RPASapCombobox Object
 */
@IID("{EF5FA18A-5E96-4AF0-964E-75AF9380BE8F}")
public interface IRPASapCombobox extends CartesObj.IRPASapControl {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "key"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String key();


  /**
   * <p>
   * Setter method for the COM property "key"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(501) //= 0x1f5. The runtime will prefer the VTID if present
  @VTID(34)
  void key(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Text"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String text();


  /**
   * <p>
   * Setter method for the COM property "Text"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(502) //= 0x1f6. The runtime will prefer the VTID if present
  @VTID(36)
  void text(
    java.lang.String value);


  // Properties:
}

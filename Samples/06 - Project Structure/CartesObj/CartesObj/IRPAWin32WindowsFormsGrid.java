package CartesObj  ;

import com4j.*;

/**
 * Windows Forms Grid
 */
@IID("{70D06061-DCBD-437A-9EE0-AA023D0F92E0}")
public interface IRPAWin32WindowsFormsGrid extends CartesObj.IRPAWin32Component {
  // Methods:
  /**
   * @param cell Mandatory CartesObj.IRPAWin32Accessibility parameter.
   */

  @DISPID(401) //= 0x191. The runtime will prefer the VTID if present
  @VTID(85)
  void scrollTo(
    CartesObj.IRPAWin32Accessibility cell);


  /**
   * <p>
   * Return the index Field
   * </p>
   * @param name Mandatory java.lang.String parameter.
   * @return  Returns a value of type int
   */

  @DISPID(402) //= 0x192. The runtime will prefer the VTID if present
  @VTID(86)
  int getFieldByName(
    java.lang.String name);


  /**
   * <p>
   * Return the amount of fields
   * </p>
   * <p>
   * Getter method for the COM property "Fields"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(403) //= 0x193. The runtime will prefer the VTID if present
  @VTID(87)
  int fields();


  /**
   * <p>
   * returns the indicated field
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type CartesObj.IRPAWin32Accessibility25
   */

  @DISPID(404) //= 0x194. The runtime will prefer the VTID if present
  @VTID(88)
  CartesObj.IRPAWin32Accessibility25 getField(
    int index);


  /**
   * @param row Mandatory int parameter.
   * @param field Mandatory int parameter.
   * @return  Returns a value of type CartesObj.IRPAWin32Accessibility
   */

  @DISPID(405) //= 0x195. The runtime will prefer the VTID if present
  @VTID(89)
  CartesObj.IRPAWin32Accessibility getCell(
    int row,
    int field);


  /**
   * <p>
   * Getter method for the COM property "Rows"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(406) //= 0x196. The runtime will prefer the VTID if present
  @VTID(90)
  int rows();


  /**
   * @param row Mandatory int parameter.
   * @param field Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(407) //= 0x197. The runtime will prefer the VTID if present
  @VTID(91)
  java.lang.String getCellValue(
    int row,
    int field);


  /**
   * @param row Mandatory int parameter.
   * @param field Mandatory int parameter.
   * @param value Mandatory java.lang.String parameter.
   * @param doubleclick Mandatory int parameter.
   * @param typed Mandatory int parameter.
   */

  @DISPID(408) //= 0x198. The runtime will prefer the VTID if present
  @VTID(92)
  void setCellValue(
    int row,
    int field,
    java.lang.String value,
    int doubleclick,
    int typed);


  // Properties:
}

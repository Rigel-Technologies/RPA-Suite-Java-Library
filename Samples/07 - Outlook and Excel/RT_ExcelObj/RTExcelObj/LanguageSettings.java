package RTExcelObj  ;

import com4j.*;

@IID("{000C0353-0000-0000-C000-000000000046}")
public interface LanguageSettings extends RTExcelObj._IMsoDispObj {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "LanguageID"
   * </p>
   * @param id Mandatory RTExcelObj.MsoAppLanguageID parameter.
   * @return  Returns a value of type int
   */

  @DISPID(1) //= 0x1. The runtime will prefer the VTID if present
  @VTID(9)
  int languageID(
    RTExcelObj.MsoAppLanguageID id);


  /**
   * <p>
   * Getter method for the COM property "LanguagePreferredForEditing"
   * </p>
   * @param lid Mandatory RTExcelObj.MsoLanguageID parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(2) //= 0x2. The runtime will prefer the VTID if present
  @VTID(10)
  boolean languagePreferredForEditing(
    RTExcelObj.MsoLanguageID lid);


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(3) //= 0x3. The runtime will prefer the VTID if present
  @VTID(11)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{EEE0091C-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBComponents extends RTExcelObj._VBComponents_Old {
  // Methods:
  /**
   * @param progId Mandatory java.lang.String parameter.
   * @return  Returns a value of type RTExcelObj._VBComponent
   */

  @DISPID(25) //= 0x19. The runtime will prefer the VTID if present
  @VTID(15)
  RTExcelObj._VBComponent addCustom(
    java.lang.String progId);


  /**
   * @param index Optional parameter. Default value is 0
   * @return  Returns a value of type RTExcelObj._VBComponent
   */

  @DISPID(26) //= 0x1a. The runtime will prefer the VTID if present
  @VTID(16)
  RTExcelObj._VBComponent addMTDesigner(
    @Optional @DefaultValue("0") int index);


  // Properties:
}

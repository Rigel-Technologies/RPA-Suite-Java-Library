package RTExcelObj  ;

import com4j.*;

@IID("{EEE00919-E393-11D1-BB03-00C04FB6C4A6}")
public interface _VBProjects extends RTExcelObj._VBProjects_Old {
  // Methods:
  /**
   * @param type Mandatory RTExcelObj.vbext_ProjectType parameter.
   * @return  Returns a value of type RTExcelObj._VBProject
   */

  @DISPID(137) //= 0x89. The runtime will prefer the VTID if present
  @VTID(12)
  RTExcelObj._VBProject add(
    RTExcelObj.vbext_ProjectType type);


  /**
   * @param lpc Mandatory RTExcelObj._VBProject parameter.
   */

  @DISPID(138) //= 0x8a. The runtime will prefer the VTID if present
  @VTID(13)
  void remove(
    RTExcelObj._VBProject lpc);


  /**
   * @param bstrPath Mandatory java.lang.String parameter.
   * @return  Returns a value of type RTExcelObj._VBProject
   */

  @DISPID(139) //= 0x8b. The runtime will prefer the VTID if present
  @VTID(14)
  RTExcelObj._VBProject open(
    java.lang.String bstrPath);


  // Properties:
}

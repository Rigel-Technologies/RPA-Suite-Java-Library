package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _dispVBProjectsEvents extends Com4jObject {
  // Methods:
  /**
   * @param vbProject Mandatory RTExcelObj._VBProject parameter.
   */

  @DISPID(1)
  void itemAdded(
    RTExcelObj._VBProject vbProject);


  /**
   * @param vbProject Mandatory RTExcelObj._VBProject parameter.
   */

  @DISPID(2)
  void itemRemoved(
    RTExcelObj._VBProject vbProject);


  /**
   * @param vbProject Mandatory RTExcelObj._VBProject parameter.
   * @param oldName Mandatory java.lang.String parameter.
   */

  @DISPID(3)
  void itemRenamed(
    RTExcelObj._VBProject vbProject,
    java.lang.String oldName);


  /**
   * @param vbProject Mandatory RTExcelObj._VBProject parameter.
   */

  @DISPID(4)
  void itemActivated(
    RTExcelObj._VBProject vbProject);


  // Properties:
}

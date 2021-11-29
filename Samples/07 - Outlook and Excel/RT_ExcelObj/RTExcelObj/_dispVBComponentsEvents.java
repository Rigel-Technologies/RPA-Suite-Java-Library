package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface _dispVBComponentsEvents extends Com4jObject {
  // Methods:
  /**
   * @param vbComponent Mandatory RTExcelObj._VBComponent parameter.
   */

  @DISPID(1)
  void itemAdded(
    RTExcelObj._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory RTExcelObj._VBComponent parameter.
   */

  @DISPID(2)
  void itemRemoved(
    RTExcelObj._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory RTExcelObj._VBComponent parameter.
   * @param oldName Mandatory java.lang.String parameter.
   */

  @DISPID(3)
  void itemRenamed(
    RTExcelObj._VBComponent vbComponent,
    java.lang.String oldName);


  /**
   * @param vbComponent Mandatory RTExcelObj._VBComponent parameter.
   */

  @DISPID(4)
  void itemSelected(
    RTExcelObj._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory RTExcelObj._VBComponent parameter.
   */

  @DISPID(5)
  void itemActivated(
    RTExcelObj._VBComponent vbComponent);


  /**
   * @param vbComponent Mandatory RTExcelObj._VBComponent parameter.
   */

  @DISPID(6)
  void itemReloaded(
    RTExcelObj._VBComponent vbComponent);


  // Properties:
}

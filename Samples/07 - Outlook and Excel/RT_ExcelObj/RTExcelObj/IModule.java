package RTExcelObj  ;

import com4j.*;

@IID("{000208AD-0001-0000-C000-000000000046}")
public interface IModule extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * @param lcid Mandatory int parameter.
   */

  @VTID(10)
  void activate(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(11)
  void copy(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * @param lcid Mandatory int parameter.
   */

  @VTID(12)
  void delete(
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String codeName();


  /**
   * <p>
   * Getter method for the COM property "_CodeName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String _CodeName();


  /**
   * <p>
   * Setter method for the COM property "_CodeName"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void _CodeName(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @VTID(16)
  int index(
    @LCID int lcid);


  /**
   * @param before Optional parameter. Default value is com4j.Variant.getMissing()
   * @param after Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(17)
  void move(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object before,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object after,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(19)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Next"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(20)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject next();


  /**
   * <p>
   * Getter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(21)
  java.lang.String onDoubleClick(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnDoubleClick"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(22)
  void onDoubleClick(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(23)
  java.lang.String onSheetActivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetActivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(24)
  void onSheetActivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String onSheetDeactivate(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "OnSheetDeactivate"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(26)
  void onSheetDeactivate(
    @LCID int lcid,
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "PageSetup"
   * </p>
   * @return  Returns a value of type RTExcelObj.PageSetup
   */

  @VTID(27)
  RTExcelObj.PageSetup pageSetup();


  /**
   * <p>
   * Getter method for the COM property "Previous"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(28)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject previous();


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(29)
  void __PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate,
    @LCID int lcid);


  /**
   */

  @VTID(30)
  void _Dummy18();


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(31)
  void _Protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "ProtectContents"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(32)
  boolean protectContents(
    @LCID int lcid);


  /**
   */

  @VTID(33)
  void _Dummy21();


  /**
   * <p>
   * Getter method for the COM property "ProtectionMode"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @VTID(34)
  boolean protectionMode(
    @LCID int lcid);


  /**
   */

  @VTID(35)
  void _Dummy23();


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(36)
  void _SaveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout,
    @LCID int lcid);


  /**
   * @param replace Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(37)
  void select(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object replace,
    @LCID int lcid);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   */

  @VTID(38)
  void unprotect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.XlSheetVisibility
   */

  @VTID(39)
  RTExcelObj.XlSheetVisibility visible(
    @LCID int lcid);


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param lcid Mandatory int parameter.
   * @param rhs Mandatory RTExcelObj.XlSheetVisibility parameter.
   */

  @VTID(40)
  void visible(
    @LCID int lcid,
    RTExcelObj.XlSheetVisibility rhs);


  /**
   * <p>
   * Getter method for the COM property "Shapes"
   * </p>
   * @return  Returns a value of type RTExcelObj.Shapes
   */

  @VTID(41)
  RTExcelObj.Shapes shapes();


  /**
   * @param filename Mandatory java.lang.Object parameter.
   * @param merge Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(42)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object insertFile(
    @MarshalAs(NativeType.VARIANT) java.lang.Object filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object merge);


  /**
   * @param filename Mandatory java.lang.String parameter.
   * @param fileFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param writeResPassword Optional parameter. Default value is com4j.Variant.getMissing()
   * @param readOnlyRecommended Optional parameter. Default value is com4j.Variant.getMissing()
   * @param createBackup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param addToMru Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textCodepage Optional parameter. Default value is com4j.Variant.getMissing()
   * @param textVisualLayout Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(43)
  void saveAs(
    java.lang.String filename,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object fileFormat,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object writeResPassword,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object readOnlyRecommended,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object createBackup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object addToMru,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textCodepage,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object textVisualLayout);


  /**
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @param drawingObjects Optional parameter. Default value is com4j.Variant.getMissing()
   * @param contents Optional parameter. Default value is com4j.Variant.getMissing()
   * @param scenarios Optional parameter. Default value is com4j.Variant.getMissing()
   * @param userInterfaceOnly Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(44)
  void protect(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object drawingObjects,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object contents,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object scenarios,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object userInterfaceOnly);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(45)
  void _PrintOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate);


  /**
   * @param from Optional parameter. Default value is com4j.Variant.getMissing()
   * @param to Optional parameter. Default value is com4j.Variant.getMissing()
   * @param copies Optional parameter. Default value is com4j.Variant.getMissing()
   * @param preview Optional parameter. Default value is com4j.Variant.getMissing()
   * @param activePrinter Optional parameter. Default value is com4j.Variant.getMissing()
   * @param printToFile Optional parameter. Default value is com4j.Variant.getMissing()
   * @param collate Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(46)
  void printOut(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object from,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object to,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object copies,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object preview,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object activePrinter,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object printToFile,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object collate);


  // Properties:
}

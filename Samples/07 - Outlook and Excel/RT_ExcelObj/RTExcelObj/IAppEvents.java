package RTExcelObj  ;

import com4j.*;

@IID("{00024413-0001-0000-C000-000000000046}")
public interface IAppEvents extends Com4jObject {
  // Methods:
  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @VTID(7)
  void newWorkbook(
    RTExcelObj._Workbook wb);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @VTID(8)
  void sheetSelectionChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(9)
  void sheetBeforeDoubleClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(10)
  void sheetBeforeRightClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(11)
  void sheetActivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(12)
  void sheetDeactivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(13)
  void sheetCalculate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @VTID(14)
  void sheetChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @VTID(15)
  void workbookOpen(
    RTExcelObj._Workbook wb);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @VTID(16)
  void workbookActivate(
    RTExcelObj._Workbook wb);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @VTID(17)
  void workbookDeactivate(
    RTExcelObj._Workbook wb);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(18)
  void workbookBeforeClose(
    RTExcelObj._Workbook wb,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(19)
  void workbookBeforeSave(
    RTExcelObj._Workbook wb,
    boolean saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(20)
  void workbookBeforePrint(
    RTExcelObj._Workbook wb,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(21)
  void workbookNewSheet(
    RTExcelObj._Workbook wb,
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @VTID(22)
  void workbookAddinInstall(
    RTExcelObj._Workbook wb);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @VTID(23)
  void workbookAddinUninstall(
    RTExcelObj._Workbook wb);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @VTID(24)
  void windowResize(
    RTExcelObj._Workbook wb,
    RTExcelObj.Window wn);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @VTID(25)
  void windowActivate(
    RTExcelObj._Workbook wb,
    RTExcelObj.Window wn);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @VTID(26)
  void windowDeactivate(
    RTExcelObj._Workbook wb,
    RTExcelObj.Window wn);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Hyperlink parameter.
   */

  @VTID(27)
  void sheetFollowHyperlink(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Hyperlink target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(28)
  void sheetPivotTableUpdate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable target);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(29)
  void workbookPivotTableCloseConnection(
    RTExcelObj._Workbook wb,
    RTExcelObj.PivotTable target);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(30)
  void workbookPivotTableOpenConnection(
    RTExcelObj._Workbook wb,
    RTExcelObj.PivotTable target);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param syncEventType Mandatory RTExcelObj.MsoSyncEventType parameter.
   */

  @VTID(31)
  void workbookSync(
    RTExcelObj._Workbook wb,
    RTExcelObj.MsoSyncEventType syncEventType);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(32)
  void workbookBeforeXmlImport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory RTExcelObj.XlXmlImportResult parameter.
   */

  @VTID(33)
  void workbookAfterXmlImport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    boolean isRefresh,
    RTExcelObj.XlXmlImportResult result);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(34)
  void workbookBeforeXmlExport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory RTExcelObj.XlXmlExportResult parameter.
   */

  @VTID(35)
  void workbookAfterXmlExport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    java.lang.String url,
    RTExcelObj.XlXmlExportResult result);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @VTID(36)
  void workbookRowsetComplete(
    RTExcelObj._Workbook wb,
    java.lang.String description,
    java.lang.String sheet,
    boolean success);


  /**
   */

  @VTID(37)
  void afterCalculate();


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param targetRange Mandatory RTExcelObj.Range parameter.
   */

  @VTID(38)
  void sheetPivotTableAfterValueChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    RTExcelObj.Range targetRange);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(39)
  void sheetPivotTableBeforeAllocateChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(40)
  void sheetPivotTableBeforeCommitChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   */

  @VTID(41)
  void sheetPivotTableBeforeDiscardChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd);


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @VTID(42)
  void protectedViewWindowOpen(
    RTExcelObj.ProtectedViewWindow pvw);


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(43)
  void protectedViewWindowBeforeEdit(
    RTExcelObj.ProtectedViewWindow pvw,
    Holder<Boolean> cancel);


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   * @param reason Mandatory RTExcelObj.XlProtectedViewCloseReason parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(44)
  void protectedViewWindowBeforeClose(
    RTExcelObj.ProtectedViewWindow pvw,
    RTExcelObj.XlProtectedViewCloseReason reason,
    Holder<Boolean> cancel);


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @VTID(45)
  void protectedViewWindowResize(
    RTExcelObj.ProtectedViewWindow pvw);


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @VTID(46)
  void protectedViewWindowActivate(
    RTExcelObj.ProtectedViewWindow pvw);


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @VTID(47)
  void protectedViewWindowDeactivate(
    RTExcelObj.ProtectedViewWindow pvw);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param success Mandatory boolean parameter.
   */

  @VTID(48)
  void workbookAfterSave(
    RTExcelObj._Workbook wb,
    boolean success);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param ch Mandatory RTExcelObj._Chart parameter.
   */

  @VTID(49)
  void workbookNewChart(
    RTExcelObj._Workbook wb,
    RTExcelObj._Chart ch);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(50)
  void sheetLensGalleryRenderComplete(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.TableObject parameter.
   */

  @VTID(51)
  void sheetTableUpdate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.TableObject target);


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param changes Mandatory RTExcelObj.ModelChanges parameter.
   */

  @VTID(52)
  void workbookModelChange(
    RTExcelObj._Workbook wb,
    RTExcelObj.ModelChanges changes);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(53)
  void sheetBeforeDelete(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00024412-0001-0000-C000-000000000046}")
public interface IWorkbookEvents extends Com4jObject {
  // Methods:
  /**
   */

  @VTID(7)
  void open();


  /**
   */

  @VTID(8)
  void activate();


  /**
   */

  @VTID(9)
  void deactivate();


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(10)
  void beforeClose(
    Holder<Boolean> cancel);


  /**
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(11)
  void beforeSave(
    boolean saveAsUI,
    Holder<Boolean> cancel);


  /**
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(12)
  void beforePrint(
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(13)
  void newSheet(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   */

  @VTID(14)
  void addinInstall();


  /**
   */

  @VTID(15)
  void addinUninstall();


  /**
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @VTID(16)
  void windowResize(
    RTExcelObj.Window wn);


  /**
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @VTID(17)
  void windowActivate(
    RTExcelObj.Window wn);


  /**
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @VTID(18)
  void windowDeactivate(
    RTExcelObj.Window wn);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @VTID(19)
  void sheetSelectionChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(20)
  void sheetBeforeDoubleClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(21)
  void sheetBeforeRightClick(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target,
    Holder<Boolean> cancel);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(22)
  void sheetActivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(23)
  void sheetDeactivate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(24)
  void sheetCalculate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @VTID(25)
  void sheetChange(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Range target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Hyperlink parameter.
   */

  @VTID(26)
  void sheetFollowHyperlink(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.Hyperlink target);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(27)
  void sheetPivotTableUpdate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable target);


  /**
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(28)
  void pivotTableCloseConnection(
    RTExcelObj.PivotTable target);


  /**
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(29)
  void pivotTableOpenConnection(
    RTExcelObj.PivotTable target);


  /**
   * @param syncEventType Mandatory RTExcelObj.MsoSyncEventType parameter.
   */

  @VTID(30)
  void sync(
    RTExcelObj.MsoSyncEventType syncEventType);


  /**
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(31)
  void beforeXmlImport(
    RTExcelObj.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel);


  /**
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory RTExcelObj.XlXmlImportResult parameter.
   */

  @VTID(32)
  void afterXmlImport(
    RTExcelObj.XmlMap map,
    boolean isRefresh,
    RTExcelObj.XlXmlImportResult result);


  /**
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(33)
  void beforeXmlExport(
    RTExcelObj.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel);


  /**
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory RTExcelObj.XlXmlExportResult parameter.
   */

  @VTID(34)
  void afterXmlExport(
    RTExcelObj.XmlMap map,
    java.lang.String url,
    RTExcelObj.XlXmlExportResult result);


  /**
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @VTID(35)
  void rowsetComplete(
    java.lang.String description,
    java.lang.String sheet,
    boolean success);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param targetRange Mandatory RTExcelObj.Range parameter.
   */

  @VTID(36)
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

  @VTID(37)
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

  @VTID(38)
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

  @VTID(39)
  void sheetPivotTableBeforeDiscardChanges(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(40)
  void sheetPivotTableChangeSync(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.PivotTable target);


  /**
   * @param success Mandatory boolean parameter.
   */

  @VTID(41)
  void afterSave(
    boolean success);


  /**
   * @param ch Mandatory RTExcelObj._Chart parameter.
   */

  @VTID(42)
  void newChart(
    RTExcelObj._Chart ch);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(43)
  void sheetLensGalleryRenderComplete(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.TableObject parameter.
   */

  @VTID(44)
  void sheetTableUpdate(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh,
    RTExcelObj.TableObject target);


  /**
   * @param changes Mandatory RTExcelObj.ModelChanges parameter.
   */

  @VTID(45)
  void modelChange(
    RTExcelObj.ModelChanges changes);


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @VTID(46)
  void sheetBeforeDelete(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject sh);


  // Properties:
}

package RTExcelObj.events;

import com4j.*;

@IID("{00024413-0000-0000-C000-000000000046}")
public abstract class AppEvents {
  // Methods:
  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @DISPID(1565)
  public void newWorkbook(
    RTExcelObj._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(1558)
  public void sheetSelectionChange(
    com4j.Com4jObject sh,
    RTExcelObj.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1559)
  public void sheetBeforeDoubleClick(
    com4j.Com4jObject sh,
    RTExcelObj.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1560)
  public void sheetBeforeRightClick(
    com4j.Com4jObject sh,
    RTExcelObj.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1561)
  public void sheetActivate(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1562)
  public void sheetDeactivate(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1563)
  public void sheetCalculate(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(1564)
  public void sheetChange(
    com4j.Com4jObject sh,
    RTExcelObj.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @DISPID(1567)
  public void workbookOpen(
    RTExcelObj._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @DISPID(1568)
  public void workbookActivate(
    RTExcelObj._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @DISPID(1569)
  public void workbookDeactivate(
    RTExcelObj._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1570)
  public void workbookBeforeClose(
    RTExcelObj._Workbook wb,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param saveAsUI Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1571)
  public void workbookBeforeSave(
    RTExcelObj._Workbook wb,
    boolean saveAsUI,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1572)
  public void workbookBeforePrint(
    RTExcelObj._Workbook wb,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(1573)
  public void workbookNewSheet(
    RTExcelObj._Workbook wb,
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @DISPID(1574)
  public void workbookAddinInstall(
    RTExcelObj._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   */

  @DISPID(1575)
  public void workbookAddinUninstall(
    RTExcelObj._Workbook wb) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @DISPID(1554)
  public void windowResize(
    RTExcelObj._Workbook wb,
    RTExcelObj.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @DISPID(1556)
  public void windowActivate(
    RTExcelObj._Workbook wb,
    RTExcelObj.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param wn Mandatory RTExcelObj.Window parameter.
   */

  @DISPID(1557)
  public void windowDeactivate(
    RTExcelObj._Workbook wb,
    RTExcelObj.Window wn) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.Hyperlink parameter.
   */

  @DISPID(1854)
  public void sheetFollowHyperlink(
    com4j.Com4jObject sh,
    RTExcelObj.Hyperlink target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @DISPID(2157)
  public void sheetPivotTableUpdate(
    com4j.Com4jObject sh,
    RTExcelObj.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @DISPID(2160)
  public void workbookPivotTableCloseConnection(
    RTExcelObj._Workbook wb,
    RTExcelObj.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @DISPID(2161)
  public void workbookPivotTableOpenConnection(
    RTExcelObj._Workbook wb,
    RTExcelObj.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param syncEventType Mandatory RTExcelObj.MsoSyncEventType parameter.
   */

  @DISPID(2289)
  public void workbookSync(
    RTExcelObj._Workbook wb,
    RTExcelObj.MsoSyncEventType syncEventType) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2290)
  public void workbookBeforeXmlImport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    java.lang.String url,
    boolean isRefresh,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param isRefresh Mandatory boolean parameter.
   * @param result Mandatory RTExcelObj.XlXmlImportResult parameter.
   */

  @DISPID(2291)
  public void workbookAfterXmlImport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    boolean isRefresh,
    RTExcelObj.XlXmlImportResult result) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2292)
  public void workbookBeforeXmlExport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    java.lang.String url,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param map Mandatory RTExcelObj.XmlMap parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param result Mandatory RTExcelObj.XlXmlExportResult parameter.
   */

  @DISPID(2293)
  public void workbookAfterXmlExport(
    RTExcelObj._Workbook wb,
    RTExcelObj.XmlMap map,
    java.lang.String url,
    RTExcelObj.XlXmlExportResult result) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param description Mandatory java.lang.String parameter.
   * @param sheet Mandatory java.lang.String parameter.
   * @param success Mandatory boolean parameter.
   */

  @DISPID(2611)
  public void workbookRowsetComplete(
    RTExcelObj._Workbook wb,
    java.lang.String description,
    java.lang.String sheet,
    boolean success) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(2612)
  public void afterCalculate() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param targetRange Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(2895)
  public void sheetPivotTableAfterValueChange(
    com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    RTExcelObj.Range targetRange) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2896)
  public void sheetPivotTableBeforeAllocateChanges(
    com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2897)
  public void sheetPivotTableBeforeCommitChanges(
    com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   */

  @DISPID(2898)
  public void sheetPivotTableBeforeDiscardChanges(
    com4j.Com4jObject sh,
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @DISPID(2903)
  public void protectedViewWindowOpen(
    RTExcelObj.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2905)
  public void protectedViewWindowBeforeEdit(
    RTExcelObj.ProtectedViewWindow pvw,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   * @param reason Mandatory RTExcelObj.XlProtectedViewCloseReason parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2906)
  public void protectedViewWindowBeforeClose(
    RTExcelObj.ProtectedViewWindow pvw,
    RTExcelObj.XlProtectedViewCloseReason reason,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @DISPID(2908)
  public void protectedViewWindowResize(
    RTExcelObj.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @DISPID(2909)
  public void protectedViewWindowActivate(
    RTExcelObj.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param pvw Mandatory RTExcelObj.ProtectedViewWindow parameter.
   */

  @DISPID(2910)
  public void protectedViewWindowDeactivate(
    RTExcelObj.ProtectedViewWindow pvw) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param success Mandatory boolean parameter.
   */

  @DISPID(2911)
  public void workbookAfterSave(
    RTExcelObj._Workbook wb,
    boolean success) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param ch Mandatory RTExcelObj._Chart parameter.
   */

  @DISPID(2912)
  public void workbookNewChart(
    RTExcelObj._Workbook wb,
    RTExcelObj._Chart ch) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(3075)
  public void sheetLensGalleryRenderComplete(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   * @param target Mandatory RTExcelObj.TableObject parameter.
   */

  @DISPID(3076)
  public void sheetTableUpdate(
    com4j.Com4jObject sh,
    RTExcelObj.TableObject target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param wb Mandatory RTExcelObj._Workbook parameter.
   * @param changes Mandatory RTExcelObj.ModelChanges parameter.
   */

  @DISPID(3080)
  public void workbookModelChange(
    RTExcelObj._Workbook wb,
    RTExcelObj.ModelChanges changes) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param sh Mandatory com4j.Com4jObject parameter.
   */

  @DISPID(3079)
  public void sheetBeforeDelete(
    com4j.Com4jObject sh) {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

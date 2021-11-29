package RTExcelObj  ;

import com4j.*;

@IID("{00024411-0001-0000-C000-000000000046}")
public interface IDocEvents extends Com4jObject {
  // Methods:
  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @VTID(7)
  void selectionChange(
    RTExcelObj.Range target);


  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(8)
  void beforeDoubleClick(
    RTExcelObj.Range target,
    Holder<Boolean> cancel);


  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(9)
  void beforeRightClick(
    RTExcelObj.Range target,
    Holder<Boolean> cancel);


  /**
   */

  @VTID(10)
  void activate();


  /**
   */

  @VTID(11)
  void deactivate();


  /**
   */

  @VTID(12)
  void calculate();


  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @VTID(13)
  void change(
    RTExcelObj.Range target);


  /**
   * @param target Mandatory RTExcelObj.Hyperlink parameter.
   */

  @VTID(14)
  void followHyperlink(
    RTExcelObj.Hyperlink target);


  /**
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(15)
  void pivotTableUpdate(
    RTExcelObj.PivotTable target);


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param targetRange Mandatory RTExcelObj.Range parameter.
   */

  @VTID(16)
  void pivotTableAfterValueChange(
    RTExcelObj.PivotTable targetPivotTable,
    RTExcelObj.Range targetRange);


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(17)
  void pivotTableBeforeAllocateChanges(
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel);


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @VTID(18)
  void pivotTableBeforeCommitChanges(
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel);


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   */

  @VTID(19)
  void pivotTableBeforeDiscardChanges(
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd);


  /**
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @VTID(20)
  void pivotTableChangeSync(
    RTExcelObj.PivotTable target);


  /**
   */

  @VTID(21)
  void lensGalleryRenderComplete();


  /**
   * @param target Mandatory RTExcelObj.TableObject parameter.
   */

  @VTID(22)
  void tableUpdate(
    RTExcelObj.TableObject target);


  /**
   */

  @VTID(23)
  void beforeDelete();


  // Properties:
}

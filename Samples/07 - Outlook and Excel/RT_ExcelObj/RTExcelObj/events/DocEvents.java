package RTExcelObj.events;

import com4j.*;

@IID("{00024411-0000-0000-C000-000000000046}")
public abstract class DocEvents {
  // Methods:
  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(1543)
  public void selectionChange(
    RTExcelObj.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1537)
  public void beforeDoubleClick(
    RTExcelObj.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(1534)
  public void beforeRightClick(
    RTExcelObj.Range target,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(304)
  public void activate() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(1530)
  public void deactivate() {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(279)
  public void calculate() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(1545)
  public void change(
    RTExcelObj.Range target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory RTExcelObj.Hyperlink parameter.
   */

  @DISPID(1470)
  public void followHyperlink(
    RTExcelObj.Hyperlink target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @DISPID(2156)
  public void pivotTableUpdate(
    RTExcelObj.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param targetRange Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(2886)
  public void pivotTableAfterValueChange(
    RTExcelObj.PivotTable targetPivotTable,
    RTExcelObj.Range targetRange) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2889)
  public void pivotTableBeforeAllocateChanges(
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   * @param cancel Mandatory Holder<Boolean> parameter.
   */

  @DISPID(2892)
  public void pivotTableBeforeCommitChanges(
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd,
    Holder<Boolean> cancel) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param targetPivotTable Mandatory RTExcelObj.PivotTable parameter.
   * @param valueChangeStart Mandatory int parameter.
   * @param valueChangeEnd Mandatory int parameter.
   */

  @DISPID(2893)
  public void pivotTableBeforeDiscardChanges(
    RTExcelObj.PivotTable targetPivotTable,
    int valueChangeStart,
    int valueChangeEnd) {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory RTExcelObj.PivotTable parameter.
   */

  @DISPID(2894)
  public void pivotTableChangeSync(
    RTExcelObj.PivotTable target) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(3072)
  public void lensGalleryRenderComplete() {
        throw new UnsupportedOperationException();
  }


  /**
   * @param target Mandatory RTExcelObj.TableObject parameter.
   */

  @DISPID(3073)
  public void tableUpdate(
    RTExcelObj.TableObject target) {
        throw new UnsupportedOperationException();
  }


  /**
   */

  @DISPID(3074)
  public void beforeDelete() {
        throw new UnsupportedOperationException();
  }


  // Properties:
}

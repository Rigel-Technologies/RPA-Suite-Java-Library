package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotCell extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   */

  @DISPID(148)
  @PropGet
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   */

  @DISPID(149)
  @PropGet
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   */

  @DISPID(150)
  @PropGet
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "PivotCellType"
   * </p>
   */

  @DISPID(2189)
  @PropGet
  RTExcelObj.XlPivotCellType pivotCellType();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   */

  @DISPID(716)
  @PropGet
  RTExcelObj.PivotTable pivotTable();


  /**
   * <p>
   * Getter method for the COM property "DataField"
   * </p>
   */

  @DISPID(2091)
  @PropGet
  RTExcelObj.PivotField dataField();


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   */

  @DISPID(731)
  @PropGet
  RTExcelObj.PivotField pivotField();


  /**
   * <p>
   * Getter method for the COM property "PivotItem"
   * </p>
   */

  @DISPID(740)
  @PropGet
  RTExcelObj.PivotItem pivotItem();


  /**
   * <p>
   * Getter method for the COM property "RowItems"
   * </p>
   */

  @DISPID(2190)
  @PropGet
  RTExcelObj.PivotItemList rowItems();


  /**
   * <p>
   * Getter method for the COM property "ColumnItems"
   * </p>
   */

  @DISPID(2191)
  @PropGet
  RTExcelObj.PivotItemList columnItems();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   */

  @DISPID(197)
  @PropGet
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "Dummy18"
   * </p>
   */

  @DISPID(2295)
  @PropGet
  java.lang.String dummy18();


  /**
   * <p>
   * Getter method for the COM property "CustomSubtotalFunction"
   * </p>
   */

  @DISPID(2193)
  @PropGet
  RTExcelObj.XlConsolidationFunction customSubtotalFunction();


  /**
   * <p>
   * Getter method for the COM property "PivotRowLine"
   * </p>
   */

  @DISPID(2673)
  @PropGet
  RTExcelObj.PivotLine pivotRowLine();


  /**
   * <p>
   * Getter method for the COM property "PivotColumnLine"
   * </p>
   */

  @DISPID(2674)
  @PropGet
  RTExcelObj.PivotLine pivotColumnLine();


  /**
   */

  @DISPID(2928)
  void allocateChange();


  /**
   */

  @DISPID(2929)
  void discardChange();


  /**
   * <p>
   * Getter method for the COM property "DataSourceValue"
   * </p>
   */

  @DISPID(2930)
  @PropGet
  java.lang.Object dataSourceValue();


  /**
   * <p>
   * Getter method for the COM property "CellChanged"
   * </p>
   */

  @DISPID(2931)
  @PropGet
  RTExcelObj.XlCellChangedState cellChanged();


  /**
   * <p>
   * Getter method for the COM property "MDX"
   * </p>
   */

  @DISPID(2123)
  @PropGet
  java.lang.String mdx();


  /**
   * <p>
   * Getter method for the COM property "ServerActions"
   * </p>
   */

  @DISPID(2491)
  @PropGet
  RTExcelObj.Actions serverActions();


  // Properties:
}

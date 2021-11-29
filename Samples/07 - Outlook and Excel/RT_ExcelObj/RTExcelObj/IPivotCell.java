package RTExcelObj  ;

import com4j.*;

@IID("{00024458-0001-0000-C000-000000000046}")
public interface IPivotCell extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "PivotCellType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotCellType
   */

  @VTID(10)
  RTExcelObj.XlPivotCellType pivotCellType();


  /**
   * <p>
   * Getter method for the COM property "PivotTable"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotTable
   */

  @VTID(11)
  RTExcelObj.PivotTable pivotTable();


  /**
   * <p>
   * Getter method for the COM property "DataField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(12)
  RTExcelObj.PivotField dataField();


  /**
   * <p>
   * Getter method for the COM property "PivotField"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(13)
  RTExcelObj.PivotField pivotField();


  /**
   * <p>
   * Getter method for the COM property "PivotItem"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotItem
   */

  @VTID(14)
  RTExcelObj.PivotItem pivotItem();


  /**
   * <p>
   * Getter method for the COM property "RowItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotItemList
   */

  @VTID(15)
  RTExcelObj.PivotItemList rowItems();


  /**
   * <p>
   * Getter method for the COM property "ColumnItems"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotItemList
   */

  @VTID(16)
  RTExcelObj.PivotItemList columnItems();


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(17)
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "Dummy18"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(18)
  java.lang.String dummy18();


  /**
   * <p>
   * Getter method for the COM property "CustomSubtotalFunction"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlConsolidationFunction
   */

  @VTID(19)
  RTExcelObj.XlConsolidationFunction customSubtotalFunction();


  /**
   * <p>
   * Getter method for the COM property "PivotRowLine"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotLine
   */

  @VTID(20)
  RTExcelObj.PivotLine pivotRowLine();


  /**
   * <p>
   * Getter method for the COM property "PivotColumnLine"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotLine
   */

  @VTID(21)
  RTExcelObj.PivotLine pivotColumnLine();


  /**
   */

  @VTID(22)
  void allocateChange();


  /**
   */

  @VTID(23)
  void discardChange();


  /**
   * <p>
   * Getter method for the COM property "DataSourceValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(24)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object dataSourceValue();


  /**
   * <p>
   * Getter method for the COM property "CellChanged"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCellChangedState
   */

  @VTID(25)
  RTExcelObj.XlCellChangedState cellChanged();


  /**
   * <p>
   * Getter method for the COM property "MDX"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String mdx();


  /**
   * <p>
   * Getter method for the COM property "ServerActions"
   * </p>
   * @return  Returns a value of type RTExcelObj.Actions
   */

  @VTID(27)
  RTExcelObj.Actions serverActions();


  // Properties:
}

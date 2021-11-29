package RTExcelObj  ;

import com4j.*;

@IID("{000244C0-0001-0000-C000-000000000046}")
public interface IValueChange extends Com4jObject {
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
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int order();


  /**
   * <p>
   * Getter method for the COM property "VisibleInPivotTable"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(11)
  boolean visibleInPivotTable();


  /**
   * <p>
   * Getter method for the COM property "PivotCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotCell
   */

  @VTID(12)
  RTExcelObj.PivotCell pivotCell();


  /**
   * <p>
   * Getter method for the COM property "Tuple"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String tuple();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type double
   */

  @VTID(14)
  double value();


  /**
   * <p>
   * Getter method for the COM property "AllocationValue"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlAllocationValue
   */

  @VTID(15)
  RTExcelObj.XlAllocationValue allocationValue();


  /**
   * <p>
   * Getter method for the COM property "AllocationMethod"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlAllocationMethod
   */

  @VTID(16)
  RTExcelObj.XlAllocationMethod allocationMethod();


  /**
   * <p>
   * Getter method for the COM property "AllocationWeightExpression"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(17)
  java.lang.String allocationWeightExpression();


  /**
   */

  @VTID(18)
  void delete();


  // Properties:
}

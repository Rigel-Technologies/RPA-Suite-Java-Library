package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ValueChange extends Com4jObject {
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
   * Getter method for the COM property "Order"
   * </p>
   */

  @DISPID(192)
  @PropGet
  int order();


  /**
   * <p>
   * Getter method for the COM property "VisibleInPivotTable"
   * </p>
   */

  @DISPID(2971)
  @PropGet
  boolean visibleInPivotTable();


  /**
   * <p>
   * Getter method for the COM property "PivotCell"
   * </p>
   */

  @DISPID(2013)
  @PropGet
  RTExcelObj.PivotCell pivotCell();


  /**
   * <p>
   * Getter method for the COM property "Tuple"
   * </p>
   */

  @DISPID(2972)
  @PropGet
  java.lang.String tuple();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  double value();


  /**
   * <p>
   * Getter method for the COM property "AllocationValue"
   * </p>
   */

  @DISPID(2874)
  @PropGet
  RTExcelObj.XlAllocationValue allocationValue();


  /**
   * <p>
   * Getter method for the COM property "AllocationMethod"
   * </p>
   */

  @DISPID(2875)
  @PropGet
  RTExcelObj.XlAllocationMethod allocationMethod();


  /**
   * <p>
   * Getter method for the COM property "AllocationWeightExpression"
   * </p>
   */

  @DISPID(2876)
  @PropGet
  java.lang.String allocationWeightExpression();


  /**
   */

  @DISPID(117)
  void delete();


  // Properties:
}

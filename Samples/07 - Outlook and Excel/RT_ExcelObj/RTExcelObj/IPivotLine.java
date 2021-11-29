package RTExcelObj  ;

import com4j.*;

@IID("{00024480-0001-0000-C000-000000000046}")
public interface IPivotLine extends Com4jObject {
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
   * Getter method for the COM property "LineType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPivotLineType
   */

  @VTID(10)
  RTExcelObj.XlPivotLineType lineType();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(11)
  int position();


  /**
   * <p>
   * Getter method for the COM property "PivotLineCells"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotLineCells
   */

  @VTID(12)
  RTExcelObj.PivotLineCells pivotLineCells();


  /**
   * <p>
   * Getter method for the COM property "PivotLineCellsFull"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotLineCells
   */

  @VTID(13)
  RTExcelObj.PivotLineCells pivotLineCellsFull();


  // Properties:
}

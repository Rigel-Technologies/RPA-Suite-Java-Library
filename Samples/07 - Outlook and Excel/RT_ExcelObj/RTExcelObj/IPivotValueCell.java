package RTExcelObj  ;

import com4j.*;

@IID("{000244CF-0001-0000-C000-000000000046}")
public interface IPivotValueCell extends Com4jObject {
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
   * Getter method for the COM property "PivotCell"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotCell
   */

  @VTID(10)
  RTExcelObj.PivotCell pivotCell();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  /**
   */

  @VTID(12)
  void showDetail();


  /**
   * <p>
   * Getter method for the COM property "ServerActions"
   * </p>
   * @return  Returns a value of type RTExcelObj.Actions
   */

  @VTID(13)
  RTExcelObj.Actions serverActions();


  // Properties:
}

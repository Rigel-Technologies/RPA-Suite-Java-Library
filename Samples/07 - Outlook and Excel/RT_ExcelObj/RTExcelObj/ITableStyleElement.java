package RTExcelObj  ;

import com4j.*;

@IID("{000244A5-0001-0000-C000-000000000046}")
public interface ITableStyleElement extends Com4jObject {
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
   * Getter method for the COM property "HasFormat"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean hasFormat();


  /**
   * <p>
   * Getter method for the COM property "Interior"
   * </p>
   * @return  Returns a value of type RTExcelObj.Interior
   */

  @VTID(11)
  RTExcelObj.Interior interior();


  /**
   * <p>
   * Getter method for the COM property "Borders"
   * </p>
   * @return  Returns a value of type RTExcelObj.Borders
   */

  @VTID(12)
  RTExcelObj.Borders borders();


  /**
   * <p>
   * Getter method for the COM property "Font"
   * </p>
   * @return  Returns a value of type RTExcelObj.Font
   */

  @VTID(13)
  RTExcelObj.Font font();


  /**
   * <p>
   * Getter method for the COM property "StripeSize"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(14)
  int stripeSize();


  /**
   * <p>
   * Setter method for the COM property "StripeSize"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(15)
  void stripeSize(
    int rhs);


  /**
   */

  @VTID(16)
  void clear();


  // Properties:
}

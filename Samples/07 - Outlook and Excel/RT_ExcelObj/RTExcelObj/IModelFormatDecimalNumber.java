package RTExcelObj  ;

import com4j.*;

@IID("{000244F1-0001-0000-C000-000000000046}")
public interface IModelFormatDecimalNumber extends Com4jObject {
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
   * Getter method for the COM property "UseThousandSeparator"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean useThousandSeparator();


  /**
   * <p>
   * Setter method for the COM property "UseThousandSeparator"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void useThousandSeparator(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "DecimalPlaces"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(12)
  int decimalPlaces();


  /**
   * <p>
   * Setter method for the COM property "DecimalPlaces"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(13)
  void decimalPlaces(
    int rhs);


  // Properties:
}

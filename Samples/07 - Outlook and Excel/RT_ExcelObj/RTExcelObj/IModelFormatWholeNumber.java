package RTExcelObj  ;

import com4j.*;

@IID("{000244F2-0001-0000-C000-000000000046}")
public interface IModelFormatWholeNumber extends Com4jObject {
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


  // Properties:
}

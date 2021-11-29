package RTExcelObj  ;

import com4j.*;

@IID("{000244BF-0001-0000-C000-000000000046}")
public interface INegativeBarFormat extends Com4jObject {
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
   * Getter method for the COM property "ColorType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlDataBarNegativeColorType
   */

  @VTID(10)
  RTExcelObj.XlDataBarNegativeColorType colorType();


  /**
   * <p>
   * Setter method for the COM property "ColorType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarNegativeColorType parameter.
   */

  @VTID(11)
  void colorType(
    RTExcelObj.XlDataBarNegativeColorType rhs);


  /**
   * <p>
   * Getter method for the COM property "BorderColorType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlDataBarNegativeColorType
   */

  @VTID(12)
  RTExcelObj.XlDataBarNegativeColorType borderColorType();


  /**
   * <p>
   * Setter method for the COM property "BorderColorType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlDataBarNegativeColorType parameter.
   */

  @VTID(13)
  void borderColorType(
    RTExcelObj.XlDataBarNegativeColorType rhs);


  /**
   * <p>
   * Getter method for the COM property "Color"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(14)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject color();


  /**
   * <p>
   * Getter method for the COM property "BorderColor"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(15)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject borderColor();


  // Properties:
}

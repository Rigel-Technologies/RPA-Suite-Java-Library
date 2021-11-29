package RTExcelObj  ;

import com4j.*;

@IID("{00024492-0001-0000-C000-000000000046}")
public interface IConditionValue extends Com4jObject {
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
   * @param newtype Mandatory RTExcelObj.XlConditionValueTypes parameter.
   * @param newvalue Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(10)
  void modify(
    RTExcelObj.XlConditionValueTypes newtype,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object newvalue);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlConditionValueTypes
   */

  @VTID(11)
  RTExcelObj.XlConditionValueTypes type();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  // Properties:
}

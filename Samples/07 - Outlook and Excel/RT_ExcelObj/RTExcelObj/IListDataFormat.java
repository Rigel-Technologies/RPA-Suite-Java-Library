package RTExcelObj  ;

import com4j.*;

@IID("{0002447D-0001-0000-C000-000000000046}")
public interface IListDataFormat extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlListDataType
   */

  @VTID(10)
  @DefaultMethod
  RTExcelObj.XlListDataType _Default();


  /**
   * <p>
   * Getter method for the COM property "Choices"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(11)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object choices();


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
   * Getter method for the COM property "DefaultValue"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(13)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object defaultValue();


  /**
   * <p>
   * Getter method for the COM property "IsPercent"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean isPercent();


  /**
   * <p>
   * Getter method for the COM property "lcid"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(15)
  int lcid();


  /**
   * <p>
   * Getter method for the COM property "MaxCharacters"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(16)
  int maxCharacters();


  /**
   * <p>
   * Getter method for the COM property "MaxNumber"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(17)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object maxNumber();


  /**
   * <p>
   * Getter method for the COM property "MinNumber"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(18)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object minNumber();


  /**
   * <p>
   * Getter method for the COM property "Required"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean required();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlListDataType
   */

  @VTID(20)
  RTExcelObj.XlListDataType type();


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean readOnly();


  /**
   * <p>
   * Getter method for the COM property "AllowFillIn"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean allowFillIn();


  // Properties:
}

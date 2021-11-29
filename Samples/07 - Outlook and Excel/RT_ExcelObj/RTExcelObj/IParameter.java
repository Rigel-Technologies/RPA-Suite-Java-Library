package RTExcelObj  ;

import com4j.*;

@IID("{0002442A-0001-0000-C000-000000000046}")
public interface IParameter extends Com4jObject {
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
   * Getter method for the COM property "DataType"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlParameterDataType
   */

  @VTID(10)
  RTExcelObj.XlParameterDataType dataType();


  /**
   * <p>
   * Setter method for the COM property "DataType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlParameterDataType parameter.
   */

  @VTID(11)
  void dataType(
    RTExcelObj.XlParameterDataType rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlParameterType
   */

  @VTID(12)
  RTExcelObj.XlParameterType type();


  /**
   * <p>
   * Getter method for the COM property "PromptString"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(13)
  java.lang.String promptString();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(14)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object value();


  /**
   * <p>
   * Getter method for the COM property "SourceRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(15)
  RTExcelObj.Range sourceRange();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(16)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(17)
  void name(
    java.lang.String rhs);


  /**
   * @param type Mandatory RTExcelObj.XlParameterType parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @VTID(18)
  void setParam(
    RTExcelObj.XlParameterType type,
    @MarshalAs(NativeType.VARIANT) java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "RefreshOnChange"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(19)
  boolean refreshOnChange();


  /**
   * <p>
   * Setter method for the COM property "RefreshOnChange"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(20)
  void refreshOnChange(
    boolean rhs);


  // Properties:
}

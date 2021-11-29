package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Parameter extends Com4jObject {
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
   * Getter method for the COM property "DataType"
   * </p>
   */

  @DISPID(722)
  @PropGet
  RTExcelObj.XlParameterDataType dataType();


  /**
   * <p>
   * Setter method for the COM property "DataType"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlParameterDataType parameter.
   */

  @DISPID(722)
  @PropPut
  void dataType(
    RTExcelObj.XlParameterDataType rhs);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlParameterType type();


  /**
   * <p>
   * Getter method for the COM property "PromptString"
   * </p>
   */

  @DISPID(1599)
  @PropGet
  java.lang.String promptString();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.Object value();


  /**
   * <p>
   * Getter method for the COM property "SourceRange"
   * </p>
   */

  @DISPID(1600)
  @PropGet
  RTExcelObj.Range sourceRange();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(110)
  @PropPut
  void name(
    java.lang.String rhs);


  /**
   * @param type Mandatory RTExcelObj.XlParameterType parameter.
   * @param value Mandatory java.lang.Object parameter.
   */

  @DISPID(1601)
  void setParam(
    RTExcelObj.XlParameterType type,
    java.lang.Object value);


  /**
   * <p>
   * Getter method for the COM property "RefreshOnChange"
   * </p>
   */

  @DISPID(1879)
  @PropGet
  boolean refreshOnChange();


  /**
   * <p>
   * Setter method for the COM property "RefreshOnChange"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1879)
  @PropPut
  void refreshOnChange(
    boolean rhs);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ListDataFormat extends Com4jObject {
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
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  RTExcelObj.XlListDataType _Default();


  /**
   * <p>
   * Getter method for the COM property "Choices"
   * </p>
   */

  @DISPID(2348)
  @PropGet
  java.lang.Object choices();


  /**
   * <p>
   * Getter method for the COM property "DecimalPlaces"
   * </p>
   */

  @DISPID(2349)
  @PropGet
  int decimalPlaces();


  /**
   * <p>
   * Getter method for the COM property "DefaultValue"
   * </p>
   */

  @DISPID(2350)
  @PropGet
  java.lang.Object defaultValue();


  /**
   * <p>
   * Getter method for the COM property "IsPercent"
   * </p>
   */

  @DISPID(2351)
  @PropGet
  boolean isPercent();


  /**
   * <p>
   * Getter method for the COM property "lcid"
   * </p>
   */

  @DISPID(2352)
  @PropGet
  int lcid();


  /**
   * <p>
   * Getter method for the COM property "MaxCharacters"
   * </p>
   */

  @DISPID(2353)
  @PropGet
  int maxCharacters();


  /**
   * <p>
   * Getter method for the COM property "MaxNumber"
   * </p>
   */

  @DISPID(2354)
  @PropGet
  java.lang.Object maxNumber();


  /**
   * <p>
   * Getter method for the COM property "MinNumber"
   * </p>
   */

  @DISPID(2355)
  @PropGet
  java.lang.Object minNumber();


  /**
   * <p>
   * Getter method for the COM property "Required"
   * </p>
   */

  @DISPID(2356)
  @PropGet
  boolean required();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlListDataType type();


  /**
   * <p>
   * Getter method for the COM property "ReadOnly"
   * </p>
   */

  @DISPID(296)
  @PropGet
  boolean readOnly();


  /**
   * <p>
   * Getter method for the COM property "AllowFillIn"
   * </p>
   */

  @DISPID(2357)
  @PropGet
  boolean allowFillIn();


  // Properties:
}

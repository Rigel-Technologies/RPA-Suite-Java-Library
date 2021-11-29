package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Sparkline extends Com4jObject {
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
   * Getter method for the COM property "Location"
   * </p>
   */

  @DISPID(1397)
  @PropGet
  RTExcelObj.Range location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(1397)
  @PropPut
  void location(
    RTExcelObj.Range rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceData"
   * </p>
   */

  @DISPID(686)
  @PropGet
  java.lang.String sourceData();


  /**
   * <p>
   * Setter method for the COM property "SourceData"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(686)
  @PropPut
  void sourceData(
    java.lang.String rhs);


  /**
   * @param range Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(2949)
  void modifyLocation(
    RTExcelObj.Range range);


  /**
   * @param formula Mandatory java.lang.String parameter.
   */

  @DISPID(2950)
  void modifySourceData(
    java.lang.String formula);


  // Properties:
}

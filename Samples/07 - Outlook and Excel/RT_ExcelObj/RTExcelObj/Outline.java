package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Outline extends Com4jObject {
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
   * Getter method for the COM property "AutomaticStyles"
   * </p>
   */

  @DISPID(959)
  @PropGet
  boolean automaticStyles();


  /**
   * <p>
   * Setter method for the COM property "AutomaticStyles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(959)
  @PropPut
  void automaticStyles(
    boolean rhs);


  /**
   * @param rowLevels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnLevels Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(960)
  java.lang.Object showLevels(
    @Optional java.lang.Object rowLevels,
    @Optional java.lang.Object columnLevels);


  /**
   * <p>
   * Getter method for the COM property "SummaryColumn"
   * </p>
   */

  @DISPID(961)
  @PropGet
  RTExcelObj.XlSummaryColumn summaryColumn();


  /**
   * <p>
   * Setter method for the COM property "SummaryColumn"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSummaryColumn parameter.
   */

  @DISPID(961)
  @PropPut
  void summaryColumn(
    RTExcelObj.XlSummaryColumn rhs);


  /**
   * <p>
   * Getter method for the COM property "SummaryRow"
   * </p>
   */

  @DISPID(902)
  @PropGet
  RTExcelObj.XlSummaryRow summaryRow();


  /**
   * <p>
   * Setter method for the COM property "SummaryRow"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSummaryRow parameter.
   */

  @DISPID(902)
  @PropPut
  void summaryRow(
    RTExcelObj.XlSummaryRow rhs);


  // Properties:
}

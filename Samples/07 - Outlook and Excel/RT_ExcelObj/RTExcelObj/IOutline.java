package RTExcelObj  ;

import com4j.*;

@IID("{000208AB-0001-0000-C000-000000000046}")
public interface IOutline extends Com4jObject {
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
   * Getter method for the COM property "AutomaticStyles"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(10)
  boolean automaticStyles();


  /**
   * <p>
   * Setter method for the COM property "AutomaticStyles"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(11)
  void automaticStyles(
    boolean rhs);


  /**
   * @param rowLevels Optional parameter. Default value is com4j.Variant.getMissing()
   * @param columnLevels Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(12)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object showLevels(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object rowLevels,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object columnLevels);


  /**
   * <p>
   * Getter method for the COM property "SummaryColumn"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSummaryColumn
   */

  @VTID(13)
  RTExcelObj.XlSummaryColumn summaryColumn();


  /**
   * <p>
   * Setter method for the COM property "SummaryColumn"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSummaryColumn parameter.
   */

  @VTID(14)
  void summaryColumn(
    RTExcelObj.XlSummaryColumn rhs);


  /**
   * <p>
   * Getter method for the COM property "SummaryRow"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSummaryRow
   */

  @VTID(15)
  RTExcelObj.XlSummaryRow summaryRow();


  /**
   * <p>
   * Setter method for the COM property "SummaryRow"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSummaryRow parameter.
   */

  @VTID(16)
  void summaryRow(
    RTExcelObj.XlSummaryRow rhs);


  // Properties:
}

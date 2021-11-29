package RTExcelObj  ;

import com4j.*;

@IID("{00024473-0001-0000-C000-000000000046}")
public interface IListColumn extends Com4jObject {
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
   */

  @VTID(10)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "ListDataFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.ListDataFormat
   */

  @VTID(12)
  RTExcelObj.ListDataFormat listDataFormat();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int index();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(14)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(15)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(16)
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "TotalsCalculation"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlTotalsCalculation
   */

  @VTID(17)
  RTExcelObj.XlTotalsCalculation totalsCalculation();


  /**
   * <p>
   * Setter method for the COM property "TotalsCalculation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTotalsCalculation parameter.
   */

  @VTID(18)
  void totalsCalculation(
    RTExcelObj.XlTotalsCalculation rhs);


  /**
   * <p>
   * Getter method for the COM property "XPath"
   * </p>
   * @return  Returns a value of type RTExcelObj.XPath
   */

  @VTID(19)
  RTExcelObj.XPath xPath();


  /**
   * <p>
   * Getter method for the COM property "SharePointFormula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(20)
  java.lang.String sharePointFormula();


  /**
   * <p>
   * Getter method for the COM property "DataBodyRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(21)
  RTExcelObj.Range dataBodyRange();


  /**
   * <p>
   * Getter method for the COM property "Total"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(22)
  RTExcelObj.Range total();


  // Properties:
}

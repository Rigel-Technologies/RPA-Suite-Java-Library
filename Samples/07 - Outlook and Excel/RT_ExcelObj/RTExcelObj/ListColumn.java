package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ListColumn extends Com4jObject {
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
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Getter method for the COM property "ListDataFormat"
   * </p>
   */

  @DISPID(2321)
  @PropGet
  RTExcelObj.ListDataFormat listDataFormat();


  /**
   * <p>
   * Getter method for the COM property "Index"
   * </p>
   */

  @DISPID(486)
  @PropGet
  int index();


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
   * <p>
   * Getter method for the COM property "Range"
   * </p>
   */

  @DISPID(197)
  @PropGet
  RTExcelObj.Range range();


  /**
   * <p>
   * Getter method for the COM property "TotalsCalculation"
   * </p>
   */

  @DISPID(2322)
  @PropGet
  RTExcelObj.XlTotalsCalculation totalsCalculation();


  /**
   * <p>
   * Setter method for the COM property "TotalsCalculation"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlTotalsCalculation parameter.
   */

  @DISPID(2322)
  @PropPut
  void totalsCalculation(
    RTExcelObj.XlTotalsCalculation rhs);


  /**
   * <p>
   * Getter method for the COM property "XPath"
   * </p>
   */

  @DISPID(2258)
  @PropGet
  RTExcelObj.XPath xPath();


  /**
   * <p>
   * Getter method for the COM property "SharePointFormula"
   * </p>
   */

  @DISPID(2323)
  @PropGet
  java.lang.String sharePointFormula();


  /**
   * <p>
   * Getter method for the COM property "DataBodyRange"
   * </p>
   */

  @DISPID(705)
  @PropGet
  RTExcelObj.Range dataBodyRange();


  /**
   * <p>
   * Getter method for the COM property "Total"
   * </p>
   */

  @DISPID(2681)
  @PropGet
  RTExcelObj.Range total();


  // Properties:
}

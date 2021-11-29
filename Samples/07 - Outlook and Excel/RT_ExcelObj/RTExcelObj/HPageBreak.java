package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface HPageBreak extends Com4jObject {
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
  RTExcelObj._Worksheet parent();


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param direction Mandatory RTExcelObj.XlDirection parameter.
   * @param regionIndex Mandatory int parameter.
   */

  @DISPID(1420)
  void dragOff(
    RTExcelObj.XlDirection direction,
    int regionIndex);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlPageBreak type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPageBreak parameter.
   */

  @DISPID(108)
  @PropPut
  void type(
    RTExcelObj.XlPageBreak rhs);


  /**
   * <p>
   * Getter method for the COM property "Extent"
   * </p>
   */

  @DISPID(1422)
  @PropGet
  RTExcelObj.XlPageBreakExtent extent();


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


  // Properties:
}

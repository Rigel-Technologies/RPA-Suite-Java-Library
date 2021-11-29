package RTExcelObj  ;

import com4j.*;

@IID("{00024401-0001-0000-C000-000000000046}")
public interface IHPageBreak extends Com4jObject {
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
   * @return  Returns a value of type RTExcelObj._Worksheet
   */

  @VTID(9)
  RTExcelObj._Worksheet parent();


  /**
   */

  @VTID(10)
  void delete();


  /**
   * @param direction Mandatory RTExcelObj.XlDirection parameter.
   * @param regionIndex Mandatory int parameter.
   */

  @VTID(11)
  void dragOff(
    RTExcelObj.XlDirection direction,
    int regionIndex);


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPageBreak
   */

  @VTID(12)
  RTExcelObj.XlPageBreak type();


  /**
   * <p>
   * Setter method for the COM property "Type"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlPageBreak parameter.
   */

  @VTID(13)
  void type(
    RTExcelObj.XlPageBreak rhs);


  /**
   * <p>
   * Getter method for the COM property "Extent"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlPageBreakExtent
   */

  @VTID(14)
  RTExcelObj.XlPageBreakExtent extent();


  /**
   * <p>
   * Getter method for the COM property "Location"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(15)
  RTExcelObj.Range location();


  /**
   * <p>
   * Setter method for the COM property "Location"
   * </p>
   * @param rhs Mandatory RTExcelObj.Range parameter.
   */

  @VTID(16)
  void location(
    RTExcelObj.Range rhs);


  // Properties:
}

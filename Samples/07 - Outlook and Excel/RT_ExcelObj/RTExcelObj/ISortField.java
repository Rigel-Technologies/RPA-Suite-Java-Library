package RTExcelObj  ;

import com4j.*;

@IID("{000244A9-0001-0000-C000-000000000046}")
public interface ISortField extends Com4jObject {
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
   * Getter method for the COM property "SortOn"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSortOn
   */

  @VTID(10)
  RTExcelObj.XlSortOn sortOn();


  /**
   * <p>
   * Setter method for the COM property "SortOn"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortOn parameter.
   */

  @VTID(11)
  void sortOn(
    RTExcelObj.XlSortOn rhs);


  /**
   * <p>
   * Getter method for the COM property "SortOnValue"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @VTID(12)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject sortOnValue();


  /**
   * <p>
   * Getter method for the COM property "Key"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(13)
  RTExcelObj.Range key();


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSortOrder
   */

  @VTID(14)
  RTExcelObj.XlSortOrder order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortOrder parameter.
   */

  @VTID(15)
  void order(
    RTExcelObj.XlSortOrder rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomOrder"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(16)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object customOrder();


  /**
   * <p>
   * Setter method for the COM property "CustomOrder"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @VTID(17)
  void customOrder(
    @MarshalAs(NativeType.VARIANT) java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DataOption"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlSortDataOption
   */

  @VTID(18)
  RTExcelObj.XlSortDataOption dataOption();


  /**
   * <p>
   * Setter method for the COM property "DataOption"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortDataOption parameter.
   */

  @VTID(19)
  void dataOption(
    RTExcelObj.XlSortDataOption rhs);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(20)
  int priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(21)
  void priority(
    int rhs);


  /**
   */

  @VTID(22)
  void delete();


  /**
   * @param key Mandatory RTExcelObj.Range parameter.
   */

  @VTID(23)
  void modifyKey(
    RTExcelObj.Range key);


  /**
   * @param icon Mandatory RTExcelObj.Icon parameter.
   */

  @VTID(24)
  void setIcon(
    RTExcelObj.Icon icon);


  // Properties:
}

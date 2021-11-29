package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SortField extends Com4jObject {
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
   * Getter method for the COM property "SortOn"
   * </p>
   */

  @DISPID(2741)
  @PropGet
  RTExcelObj.XlSortOn sortOn();


  /**
   * <p>
   * Setter method for the COM property "SortOn"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortOn parameter.
   */

  @DISPID(2741)
  @PropPut
  void sortOn(
    RTExcelObj.XlSortOn rhs);


  /**
   * <p>
   * Getter method for the COM property "SortOnValue"
   * </p>
   */

  @DISPID(2742)
  @PropGet
  com4j.Com4jObject sortOnValue();


  /**
   * <p>
   * Getter method for the COM property "Key"
   * </p>
   */

  @DISPID(155)
  @PropGet
  RTExcelObj.Range key();


  /**
   * <p>
   * Getter method for the COM property "Order"
   * </p>
   */

  @DISPID(192)
  @PropGet
  RTExcelObj.XlSortOrder order();


  /**
   * <p>
   * Setter method for the COM property "Order"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortOrder parameter.
   */

  @DISPID(192)
  @PropPut
  void order(
    RTExcelObj.XlSortOrder rhs);


  /**
   * <p>
   * Getter method for the COM property "CustomOrder"
   * </p>
   */

  @DISPID(2743)
  @PropGet
  java.lang.Object customOrder();


  /**
   * <p>
   * Setter method for the COM property "CustomOrder"
   * </p>
   * @param rhs Mandatory java.lang.Object parameter.
   */

  @DISPID(2743)
  @PropPut
  void customOrder(
    java.lang.Object rhs);


  /**
   * <p>
   * Getter method for the COM property "DataOption"
   * </p>
   */

  @DISPID(2744)
  @PropGet
  RTExcelObj.XlSortDataOption dataOption();


  /**
   * <p>
   * Setter method for the COM property "DataOption"
   * </p>
   * @param rhs Mandatory RTExcelObj.XlSortDataOption parameter.
   */

  @DISPID(2744)
  @PropPut
  void dataOption(
    RTExcelObj.XlSortDataOption rhs);


  /**
   * <p>
   * Getter method for the COM property "Priority"
   * </p>
   */

  @DISPID(985)
  @PropGet
  int priority();


  /**
   * <p>
   * Setter method for the COM property "Priority"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(985)
  @PropPut
  void priority(
    int rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * @param key Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(2745)
  void modifyKey(
    RTExcelObj.Range key);


  /**
   * @param icon Mandatory RTExcelObj.Icon parameter.
   */

  @DISPID(2746)
  void setIcon(
    RTExcelObj.Icon icon);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface ControlFormat extends Com4jObject {
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
   * @param text Mandatory java.lang.String parameter.
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(851)
  void addItem(
    java.lang.String text,
    @Optional java.lang.Object index);


  /**
   */

  @DISPID(853)
  void removeAllItems();


  /**
   * @param index Mandatory int parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(852)
  void removeItem(
    int index,
    @Optional java.lang.Object count);


  /**
   * <p>
   * Getter method for the COM property "DropDownLines"
   * </p>
   */

  @DISPID(848)
  @PropGet
  int dropDownLines();


  /**
   * <p>
   * Setter method for the COM property "DropDownLines"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(848)
  @PropPut
  void dropDownLines(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   */

  @DISPID(600)
  @PropGet
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(600)
  @PropPut
  void enabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LargeChange"
   * </p>
   */

  @DISPID(845)
  @PropGet
  int largeChange();


  /**
   * <p>
   * Setter method for the COM property "LargeChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(845)
  @PropPut
  void largeChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LinkedCell"
   * </p>
   */

  @DISPID(1058)
  @PropGet
  java.lang.String linkedCell();


  /**
   * <p>
   * Setter method for the COM property "LinkedCell"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(1058)
  @PropPut
  void linkedCell(
    java.lang.String rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(861)
  java.lang.Object list(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "ListCount"
   * </p>
   */

  @DISPID(849)
  @PropGet
  int listCount();


  /**
   * <p>
   * Setter method for the COM property "ListCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(849)
  @PropPut
  void listCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ListFillRange"
   * </p>
   */

  @DISPID(847)
  @PropGet
  java.lang.String listFillRange();


  /**
   * <p>
   * Setter method for the COM property "ListFillRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(847)
  @PropPut
  void listFillRange(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListIndex"
   * </p>
   */

  @DISPID(850)
  @PropGet
  int listIndex();


  /**
   * <p>
   * Setter method for the COM property "ListIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(850)
  @PropPut
  void listIndex(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LockedText"
   * </p>
   */

  @DISPID(616)
  @PropGet
  boolean lockedText();


  /**
   * <p>
   * Setter method for the COM property "LockedText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(616)
  @PropPut
  void lockedText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Max"
   * </p>
   */

  @DISPID(842)
  @PropGet
  int max();


  /**
   * <p>
   * Setter method for the COM property "Max"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(842)
  @PropPut
  void max(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Min"
   * </p>
   */

  @DISPID(843)
  @PropGet
  int min();


  /**
   * <p>
   * Setter method for the COM property "Min"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(843)
  @PropPut
  void min(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MultiSelect"
   * </p>
   */

  @DISPID(32)
  @PropGet
  int multiSelect();


  /**
   * <p>
   * Setter method for the COM property "MultiSelect"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(32)
  @PropPut
  void multiSelect(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   */

  @DISPID(618)
  @PropGet
  boolean printObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(618)
  @PropPut
  void printObject(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SmallChange"
   * </p>
   */

  @DISPID(844)
  @PropGet
  int smallChange();


  /**
   * <p>
   * Setter method for the COM property "SmallChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(844)
  @PropPut
  void smallChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  int _Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void _Default(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  int value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(6)
  @PropPut
  void value(
    int rhs);


  // Properties:
}

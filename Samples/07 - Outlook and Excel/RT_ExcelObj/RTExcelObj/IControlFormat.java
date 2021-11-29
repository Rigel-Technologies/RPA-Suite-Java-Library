package RTExcelObj  ;

import com4j.*;

@IID("{00024440-0001-0000-C000-000000000046}")
public interface IControlFormat extends Com4jObject {
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
   * @param text Mandatory java.lang.String parameter.
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(10)
  void addItem(
    java.lang.String text,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   */

  @VTID(11)
  void removeAllItems();


  /**
   * @param index Mandatory int parameter.
   * @param count Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @VTID(12)
  void removeItem(
    int index,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object count);


  /**
   * <p>
   * Getter method for the COM property "DropDownLines"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int dropDownLines();


  /**
   * <p>
   * Setter method for the COM property "DropDownLines"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(14)
  void dropDownLines(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Enabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean enabled();


  /**
   * <p>
   * Setter method for the COM property "Enabled"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void enabled(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "LargeChange"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(17)
  int largeChange();


  /**
   * <p>
   * Setter method for the COM property "LargeChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(18)
  void largeChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LinkedCell"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String linkedCell();


  /**
   * <p>
   * Setter method for the COM property "LinkedCell"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(20)
  void linkedCell(
    java.lang.String rhs);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(21)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object list(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "ListCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(22)
  int listCount();


  /**
   * <p>
   * Setter method for the COM property "ListCount"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(23)
  void listCount(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ListFillRange"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String listFillRange();


  /**
   * <p>
   * Setter method for the COM property "ListFillRange"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void listFillRange(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ListIndex"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(26)
  int listIndex();


  /**
   * <p>
   * Setter method for the COM property "ListIndex"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(27)
  void listIndex(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "LockedText"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(28)
  boolean lockedText();


  /**
   * <p>
   * Setter method for the COM property "LockedText"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(29)
  void lockedText(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "Max"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(30)
  int max();


  /**
   * <p>
   * Setter method for the COM property "Max"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(31)
  void max(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Min"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(32)
  int min();


  /**
   * <p>
   * Setter method for the COM property "Min"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(33)
  void min(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "MultiSelect"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(34)
  int multiSelect();


  /**
   * <p>
   * Setter method for the COM property "MultiSelect"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(35)
  void multiSelect(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "PrintObject"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(36)
  boolean printObject();


  /**
   * <p>
   * Setter method for the COM property "PrintObject"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(37)
  void printObject(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SmallChange"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(38)
  int smallChange();


  /**
   * <p>
   * Setter method for the COM property "SmallChange"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(39)
  void smallChange(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(40)
  @DefaultMethod
  int _Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(41)
  @DefaultMethod
  void _Default(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(42)
  int value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(43)
  void value(
    int rhs);


  // Properties:
}

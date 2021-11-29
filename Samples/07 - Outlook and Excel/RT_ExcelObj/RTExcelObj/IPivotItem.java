package RTExcelObj  ;

import com4j.*;

@IID("{00020876-0001-0000-C000-000000000046}")
public interface IPivotItem extends Com4jObject {
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
   * @return  Returns a value of type RTExcelObj.PivotField
   */

  @VTID(9)
  RTExcelObj.PivotField parent();


  /**
   * <p>
   * Getter method for the COM property "ChildItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(10)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object childItems(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "DataRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(11)
  RTExcelObj.Range dataRange();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  @DefaultMethod
  java.lang.String _Default();


  /**
   * <p>
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(13)
  @DefaultMethod
  void _Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LabelRange"
   * </p>
   * @return  Returns a value of type RTExcelObj.Range
   */

  @VTID(14)
  RTExcelObj.Range labelRange();


  /**
   * <p>
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(15)
  java.lang.String name();


  /**
   * <p>
   * Setter method for the COM property "Name"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(16)
  void name(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "ParentItem"
   * </p>
   * @return  Returns a value of type RTExcelObj.PivotItem
   */

  @VTID(17)
  RTExcelObj.PivotItem parentItem();


  /**
   * <p>
   * Getter method for the COM property "ParentShowDetail"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean parentShowDetail();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(19)
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @VTID(20)
  void position(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowDetail"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(21)
  boolean showDetail();


  /**
   * <p>
   * Setter method for the COM property "ShowDetail"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(22)
  void showDetail(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.Object
   */

  @VTID(23)
  @ReturnValue(type=NativeType.VARIANT)
  java.lang.Object sourceName();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(25)
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(26)
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(27)
  void visible(
    boolean rhs);


  /**
   */

  @VTID(28)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "IsCalculated"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(29)
  boolean isCalculated();


  /**
   * <p>
   * Getter method for the COM property "RecordCount"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(30)
  int recordCount();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(31)
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(32)
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(33)
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(34)
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DrilledDown"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(35)
  boolean drilledDown();


  /**
   * <p>
   * Setter method for the COM property "DrilledDown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(36)
  void drilledDown(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFormula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(37)
  java.lang.String standardFormula();


  /**
   * <p>
   * Setter method for the COM property "StandardFormula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @VTID(38)
  void standardFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceNameStandard"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(39)
  java.lang.String sourceNameStandard();


  /**
   * @param field Mandatory java.lang.String parameter.
   */

  @VTID(40)
  void drillTo(
    java.lang.String field);


  // Properties:
}

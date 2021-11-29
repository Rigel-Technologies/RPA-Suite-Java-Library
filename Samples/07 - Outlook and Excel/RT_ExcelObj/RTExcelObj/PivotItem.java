package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotItem extends Com4jObject {
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
  RTExcelObj.PivotField parent();


  /**
   * <p>
   * Getter method for the COM property "ChildItems"
   * </p>
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(730)
  @PropGet
  java.lang.Object childItems(
    @Optional java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "DataRange"
   * </p>
   */

  @DISPID(720)
  @PropGet
  RTExcelObj.Range dataRange();


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
   * Setter method for the COM property "_Default"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(0)
  @PropPut
  @DefaultMethod
  void _Default(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "LabelRange"
   * </p>
   */

  @DISPID(719)
  @PropGet
  RTExcelObj.Range labelRange();


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
   * Getter method for the COM property "ParentItem"
   * </p>
   */

  @DISPID(741)
  @PropGet
  RTExcelObj.PivotItem parentItem();


  /**
   * <p>
   * Getter method for the COM property "ParentShowDetail"
   * </p>
   */

  @DISPID(739)
  @PropGet
  boolean parentShowDetail();


  /**
   * <p>
   * Getter method for the COM property "Position"
   * </p>
   */

  @DISPID(133)
  @PropGet
  int position();


  /**
   * <p>
   * Setter method for the COM property "Position"
   * </p>
   * @param rhs Mandatory int parameter.
   */

  @DISPID(133)
  @PropPut
  void position(
    int rhs);


  /**
   * <p>
   * Getter method for the COM property "ShowDetail"
   * </p>
   */

  @DISPID(585)
  @PropGet
  boolean showDetail();


  /**
   * <p>
   * Setter method for the COM property "ShowDetail"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(585)
  @PropPut
  void showDetail(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(721)
  @PropGet
  java.lang.Object sourceName();


  /**
   * <p>
   * Getter method for the COM property "Value"
   * </p>
   */

  @DISPID(6)
  @PropGet
  java.lang.String value();


  /**
   * <p>
   * Setter method for the COM property "Value"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(6)
  @PropPut
  void value(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Visible"
   * </p>
   */

  @DISPID(558)
  @PropGet
  boolean visible();


  /**
   * <p>
   * Setter method for the COM property "Visible"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(558)
  @PropPut
  void visible(
    boolean rhs);


  /**
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "IsCalculated"
   * </p>
   */

  @DISPID(1512)
  @PropGet
  boolean isCalculated();


  /**
   * <p>
   * Getter method for the COM property "RecordCount"
   * </p>
   */

  @DISPID(1478)
  @PropGet
  int recordCount();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   */

  @DISPID(261)
  @PropGet
  java.lang.String formula();


  /**
   * <p>
   * Setter method for the COM property "Formula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(261)
  @PropPut
  void formula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "Caption"
   * </p>
   */

  @DISPID(139)
  @PropGet
  java.lang.String caption();


  /**
   * <p>
   * Setter method for the COM property "Caption"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(139)
  @PropPut
  void caption(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "DrilledDown"
   * </p>
   */

  @DISPID(1850)
  @PropGet
  boolean drilledDown();


  /**
   * <p>
   * Setter method for the COM property "DrilledDown"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(1850)
  @PropPut
  void drilledDown(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "StandardFormula"
   * </p>
   */

  @DISPID(2084)
  @PropGet
  java.lang.String standardFormula();


  /**
   * <p>
   * Setter method for the COM property "StandardFormula"
   * </p>
   * @param rhs Mandatory java.lang.String parameter.
   */

  @DISPID(2084)
  @PropPut
  void standardFormula(
    java.lang.String rhs);


  /**
   * <p>
   * Getter method for the COM property "SourceNameStandard"
   * </p>
   */

  @DISPID(2148)
  @PropGet
  java.lang.String sourceNameStandard();


  /**
   * @param field Mandatory java.lang.String parameter.
   */

  @DISPID(2580)
  void drillTo(
    java.lang.String field);


  // Properties:
}

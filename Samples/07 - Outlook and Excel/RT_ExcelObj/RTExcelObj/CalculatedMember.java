package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface CalculatedMember extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   */

  @DISPID(110)
  @PropGet
  java.lang.String name();


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
   * Getter method for the COM property "SourceName"
   * </p>
   */

  @DISPID(721)
  @PropGet
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "SolveOrder"
   * </p>
   */

  @DISPID(2187)
  @PropGet
  int solveOrder();


  /**
   * <p>
   * Getter method for the COM property "IsValid"
   * </p>
   */

  @DISPID(2188)
  @PropGet
  boolean isValid();


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
   */

  @DISPID(117)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   */

  @DISPID(108)
  @PropGet
  RTExcelObj.XlCalculatedMemberType type();


  /**
   * <p>
   * Getter method for the COM property "Dynamic"
   * </p>
   */

  @DISPID(2926)
  @PropGet
  boolean dynamic();


  /**
   * <p>
   * Getter method for the COM property "DisplayFolder"
   * </p>
   */

  @DISPID(2927)
  @PropGet
  java.lang.String displayFolder();


  /**
   * <p>
   * Getter method for the COM property "HierarchizeDistinct"
   * </p>
   */

  @DISPID(2925)
  @PropGet
  boolean hierarchizeDistinct();


  /**
   * <p>
   * Setter method for the COM property "HierarchizeDistinct"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2925)
  @PropPut
  void hierarchizeDistinct(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FlattenHierarchies"
   * </p>
   */

  @DISPID(2924)
  @PropGet
  boolean flattenHierarchies();


  /**
   * <p>
   * Setter method for the COM property "FlattenHierarchies"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(2924)
  @PropPut
  void flattenHierarchies(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MeasureGroup"
   * </p>
   */

  @DISPID(3092)
  @PropGet
  java.lang.String measureGroup();


  /**
   * <p>
   * Getter method for the COM property "ParentHierarchy"
   * </p>
   */

  @DISPID(3093)
  @PropGet
  java.lang.String parentHierarchy();


  /**
   * <p>
   * Getter method for the COM property "ParentMember"
   * </p>
   */

  @DISPID(3094)
  @PropGet
  java.lang.String parentMember();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   */

  @DISPID(193)
  @PropGet
  RTExcelObj.XlCalcMemNumberFormatType numberFormat();


  // Properties:
}

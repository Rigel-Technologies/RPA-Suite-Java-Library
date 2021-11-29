package RTExcelObj  ;

import com4j.*;

@IID("{00024455-0001-0000-C000-000000000046}")
public interface ICalculatedMember extends Com4jObject {
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
   * Getter method for the COM property "Name"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(10)
  java.lang.String name();


  /**
   * <p>
   * Getter method for the COM property "Formula"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(11)
  java.lang.String formula();


  /**
   * <p>
   * Getter method for the COM property "SourceName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(12)
  java.lang.String sourceName();


  /**
   * <p>
   * Getter method for the COM property "SolveOrder"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int solveOrder();


  /**
   * <p>
   * Getter method for the COM property "IsValid"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(14)
  boolean isValid();


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(15)
  @DefaultMethod
  java.lang.String _Default();


  /**
   */

  @VTID(16)
  void delete();


  /**
   * <p>
   * Getter method for the COM property "Type"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCalculatedMemberType
   */

  @VTID(17)
  RTExcelObj.XlCalculatedMemberType type();


  /**
   * <p>
   * Getter method for the COM property "Dynamic"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(18)
  boolean dynamic();


  /**
   * <p>
   * Getter method for the COM property "DisplayFolder"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(19)
  java.lang.String displayFolder();


  /**
   * <p>
   * Getter method for the COM property "HierarchizeDistinct"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(20)
  boolean hierarchizeDistinct();


  /**
   * <p>
   * Setter method for the COM property "HierarchizeDistinct"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(21)
  void hierarchizeDistinct(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "FlattenHierarchies"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(22)
  boolean flattenHierarchies();


  /**
   * <p>
   * Setter method for the COM property "FlattenHierarchies"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(23)
  void flattenHierarchies(
    boolean rhs);


  /**
   * <p>
   * Getter method for the COM property "MeasureGroup"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(24)
  java.lang.String measureGroup();


  /**
   * <p>
   * Getter method for the COM property "ParentHierarchy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(25)
  java.lang.String parentHierarchy();


  /**
   * <p>
   * Getter method for the COM property "ParentMember"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @VTID(26)
  java.lang.String parentMember();


  /**
   * <p>
   * Getter method for the COM property "NumberFormat"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCalcMemNumberFormatType
   */

  @VTID(27)
  RTExcelObj.XlCalcMemNumberFormatType numberFormat();


  // Properties:
}

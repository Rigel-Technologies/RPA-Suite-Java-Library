package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface SparklineGroups extends Com4jObject,Iterable<Com4jObject> {
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
   * @param type Mandatory RTExcelObj.XlSparkType parameter.
   * @param sourceData Mandatory java.lang.String parameter.
   */

  @DISPID(181)
  RTExcelObj.SparklineGroup add(
    RTExcelObj.XlSparkType type,
    java.lang.String sourceData);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  @PropGet
  RTExcelObj.SparklineGroup item(
    java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4)
  @PropGet
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  RTExcelObj.SparklineGroup _Default(
    java.lang.Object index);


  /**
   */

  @DISPID(111)
  void clear();


  /**
   */

  @DISPID(2947)
  void clearGroups();


  /**
   * @param location Mandatory RTExcelObj.Range parameter.
   */

  @DISPID(46)
  void group(
    RTExcelObj.Range location);


  /**
   */

  @DISPID(244)
  void ungroup();


  // Properties:
}

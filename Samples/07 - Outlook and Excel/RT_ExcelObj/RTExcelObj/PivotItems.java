package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface PivotItems extends Com4jObject,Iterable<Com4jObject> {
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
   * @param name Mandatory java.lang.String parameter.
   */

  @DISPID(181)
  void add(
    java.lang.String name);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * @param index Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  com4j.Com4jObject item(
    java.lang.Object index);


  /**
   */

  @DISPID(-4)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

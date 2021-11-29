package RTExcelObj  ;

import com4j.*;

@IID("{00020400-0000-0000-C000-000000000046}")
public interface Queries extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   */

  @DISPID(118)
  @PropGet
  int count();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   */

  @DISPID(181)
  RTExcelObj.WorkbookQuery add(
    java.lang.String name,
    java.lang.String formula,
    @Optional java.lang.Object description);


  /**
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(170)
  RTExcelObj.WorkbookQuery item(
    java.lang.Object nameOrIndex);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   */

  @DISPID(0)
  @PropGet
  @DefaultMethod
  RTExcelObj.WorkbookQuery _Default(
    java.lang.Object nameOrIndex);


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
   * Getter method for the COM property "FastCombine"
   * </p>
   */

  @DISPID(3203)
  @PropGet
  boolean fastCombine();


  /**
   * <p>
   * Setter method for the COM property "FastCombine"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @DISPID(3203)
  @PropPut
  void fastCombine(
    boolean rhs);


  // Properties:
}

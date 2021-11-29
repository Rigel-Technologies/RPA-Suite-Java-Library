package RTExcelObj  ;

import com4j.*;

@IID("{000244EC-0001-0000-C000-000000000046}")
public interface IQueries extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(10)
  int count();


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.String parameter.
   * @param description Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.WorkbookQuery
   */

  @VTID(11)
  RTExcelObj.WorkbookQuery add(
    java.lang.String name,
    java.lang.String formula,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object description);


  /**
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.WorkbookQuery
   */

  @VTID(12)
  RTExcelObj.WorkbookQuery item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param nameOrIndex Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.WorkbookQuery
   */

  @VTID(13)
  @DefaultMethod
  RTExcelObj.WorkbookQuery _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object nameOrIndex);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "FastCombine"
   * </p>
   * @return  Returns a value of type boolean
   */

  @VTID(15)
  boolean fastCombine();


  /**
   * <p>
   * Setter method for the COM property "FastCombine"
   * </p>
   * @param rhs Mandatory boolean parameter.
   */

  @VTID(16)
  void fastCombine(
    boolean rhs);


  // Properties:
}

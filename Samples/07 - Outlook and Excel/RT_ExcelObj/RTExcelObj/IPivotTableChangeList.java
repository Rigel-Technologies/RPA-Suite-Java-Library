package RTExcelObj  ;

import com4j.*;

@IID("{000244C1-0001-0000-C000-000000000046}")
public interface IPivotTableChangeList extends Com4jObject,Iterable<Com4jObject> {
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
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.ValueChange
   */

  @VTID(10)
  @DefaultMethod
  RTExcelObj.ValueChange _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.ValueChange
   */

  @VTID(12)
  RTExcelObj.ValueChange item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int count();


  /**
   * @param tuple Mandatory java.lang.String parameter.
   * @param value Mandatory double parameter.
   * @param allocationValue Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allocationMethod Optional parameter. Default value is com4j.Variant.getMissing()
   * @param allocationWeightExpression Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.ValueChange
   */

  @VTID(14)
  RTExcelObj.ValueChange add(
    java.lang.String tuple,
    double value,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allocationValue,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allocationMethod,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object allocationWeightExpression);


  // Properties:
}

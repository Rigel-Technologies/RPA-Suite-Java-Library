package RTExcelObj  ;

import com4j.*;

@IID("{000208B8-0001-0000-C000-000000000046}")
public interface INames extends Com4jObject,Iterable<Com4jObject> {
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
   * @param name Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param visible Optional parameter. Default value is com4j.Variant.getMissing()
   * @param macroType Optional parameter. Default value is com4j.Variant.getMissing()
   * @param shortcutKey Optional parameter. Default value is com4j.Variant.getMissing()
   * @param category Optional parameter. Default value is com4j.Variant.getMissing()
   * @param nameLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersToLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param categoryLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersToR1C1 Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersToR1C1Local Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.Name
   */

  @VTID(10)
  RTExcelObj.Name add(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object name,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refersTo,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object visible,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object macroType,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object shortcutKey,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object category,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object nameLocal,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refersToLocal,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object categoryLocal,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refersToR1C1,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refersToR1C1Local);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param indexLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Name
   */

  @VTID(11)
  RTExcelObj.Name item(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object indexLocal,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refersTo,
    @LCID int lcid);


  /**
   * @param index Optional parameter. Default value is com4j.Variant.getMissing()
   * @param indexLocal Optional parameter. Default value is com4j.Variant.getMissing()
   * @param refersTo Optional parameter. Default value is com4j.Variant.getMissing()
   * @param lcid Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.Name
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.Name _Default(
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object index,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object indexLocal,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object refersTo,
    @LCID int lcid);


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(13)
  int count();


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(14)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

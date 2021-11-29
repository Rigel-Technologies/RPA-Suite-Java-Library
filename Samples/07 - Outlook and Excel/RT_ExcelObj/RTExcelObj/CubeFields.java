package RTExcelObj  ;

import com4j.*;

@IID("{0002444D-0000-0000-C000-000000000046}")
public interface CubeFields extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Application"
   * </p>
   * @return  Returns a value of type RTExcelObj._Application
   */

  @DISPID(148) //= 0x94. The runtime will prefer the VTID if present
  @VTID(7)
  RTExcelObj._Application application();


  /**
   * <p>
   * Getter method for the COM property "Creator"
   * </p>
   * @return  Returns a value of type RTExcelObj.XlCreator
   */

  @DISPID(149) //= 0x95. The runtime will prefer the VTID if present
  @VTID(8)
  RTExcelObj.XlCreator creator();


  /**
   * <p>
   * Getter method for the COM property "Parent"
   * </p>
   * @return  Returns a value of type com4j.Com4jObject
   */

  @DISPID(150) //= 0x96. The runtime will prefer the VTID if present
  @VTID(9)
  @ReturnValue(type=NativeType.Dispatch)
  com4j.Com4jObject parent();


  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(118) //= 0x76. The runtime will prefer the VTID if present
  @VTID(10)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.CubeField
   */

  @DISPID(170) //= 0xaa. The runtime will prefer the VTID if present
  @VTID(11)
  RTExcelObj.CubeField item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.CubeField
   */

  @DISPID(0) //= 0x0. The runtime will prefer the VTID if present
  @VTID(12)
  @DefaultMethod
  RTExcelObj.CubeField _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @DISPID(-4) //= 0xfffffffc. The runtime will prefer the VTID if present
  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param name Mandatory java.lang.String parameter.
   * @param caption Mandatory java.lang.String parameter.
   * @return  Returns a value of type RTExcelObj.CubeField
   */

  @DISPID(2186) //= 0x88a. The runtime will prefer the VTID if present
  @VTID(14)
  RTExcelObj.CubeField addSet(
    java.lang.String name,
    java.lang.String caption);


  /**
   * @param attributeHierarchy Mandatory java.lang.Object parameter.
   * @param function Mandatory RTExcelObj.XlConsolidationFunction parameter.
   * @param caption Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.CubeField
   */

  @DISPID(3089) //= 0xc11. The runtime will prefer the VTID if present
  @VTID(15)
  RTExcelObj.CubeField getMeasure(
    @MarshalAs(NativeType.VARIANT) java.lang.Object attributeHierarchy,
    RTExcelObj.XlConsolidationFunction function,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object caption);


  // Properties:
}

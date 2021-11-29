package RTExcelObj  ;

import com4j.*;

@IID("{00024454-0001-0000-C000-000000000046}")
public interface ICalculatedMembers extends Com4jObject,Iterable<Com4jObject> {
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
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.CalculatedMember
   */

  @VTID(11)
  RTExcelObj.CalculatedMember item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.CalculatedMember
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.CalculatedMember _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.String parameter.
   * @param solveOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.CalculatedMember
   */

  @VTID(14)
  RTExcelObj.CalculatedMember _Add(
    java.lang.String name,
    java.lang.String formula,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object solveOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.Object parameter.
   * @param solveOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param dynamic Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayFolder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param hierarchizeDistinct Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.CalculatedMember
   */

  @VTID(15)
  RTExcelObj.CalculatedMember add(
    java.lang.String name,
    @MarshalAs(NativeType.VARIANT) java.lang.Object formula,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object solveOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object dynamic,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayFolder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object hierarchizeDistinct);


  /**
   * @param name Mandatory java.lang.String parameter.
   * @param formula Mandatory java.lang.Object parameter.
   * @param solveOrder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param type Optional parameter. Default value is com4j.Variant.getMissing()
   * @param displayFolder Optional parameter. Default value is com4j.Variant.getMissing()
   * @param measureGroup Optional parameter. Default value is com4j.Variant.getMissing()
   * @param parentHierarchy Optional parameter. Default value is com4j.Variant.getMissing()
   * @param parentMember Optional parameter. Default value is com4j.Variant.getMissing()
   * @param numberFormat Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.CalculatedMember
   */

  @VTID(16)
  RTExcelObj.CalculatedMember addCalculatedMember(
    java.lang.String name,
    @MarshalAs(NativeType.VARIANT) java.lang.Object formula,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object solveOrder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object type,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object displayFolder,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object measureGroup,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object parentHierarchy,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object parentMember,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object numberFormat);


  // Properties:
}

package RTExcelObj  ;

import com4j.*;

@IID("{0002446A-0001-0000-C000-000000000046}")
public interface IAllowEditRanges extends Com4jObject,Iterable<Com4jObject> {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Count"
   * </p>
   * @return  Returns a value of type int
   */

  @VTID(7)
  int count();


  /**
   * <p>
   * Getter method for the COM property "Item"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.AllowEditRange
   */

  @VTID(8)
  RTExcelObj.AllowEditRange item(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * @param title Mandatory java.lang.String parameter.
   * @param range Mandatory RTExcelObj.Range parameter.
   * @param password Optional parameter. Default value is com4j.Variant.getMissing()
   * @return  Returns a value of type RTExcelObj.AllowEditRange
   */

  @VTID(9)
  RTExcelObj.AllowEditRange add(
    java.lang.String title,
    RTExcelObj.Range range,
    @Optional @MarshalAs(NativeType.VARIANT) java.lang.Object password);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory java.lang.Object parameter.
   * @return  Returns a value of type RTExcelObj.AllowEditRange
   */

  @VTID(10)
  @DefaultMethod
  RTExcelObj.AllowEditRange _Default(
    @MarshalAs(NativeType.VARIANT) java.lang.Object index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(11)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}

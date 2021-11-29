package RTExcelObj  ;

import com4j.*;

@IID("{00024405-0001-0000-C000-000000000046}")
public interface IVPageBreaks extends Com4jObject,Iterable<Com4jObject> {
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
   * @param index Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.VPageBreak
   */

  @VTID(11)
  RTExcelObj.VPageBreak item(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory int parameter.
   * @return  Returns a value of type RTExcelObj.VPageBreak
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.VPageBreak _Default(
    int index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  /**
   * @param before Mandatory com4j.Com4jObject parameter.
   * @return  Returns a value of type RTExcelObj.VPageBreak
   */

  @VTID(14)
  RTExcelObj.VPageBreak add(
    @MarshalAs(NativeType.Dispatch) com4j.Com4jObject before);


  // Properties:
}

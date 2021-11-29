package RTExcelObj  ;

import com4j.*;

@IID("{000244A6-0001-0000-C000-000000000046}")
public interface ITableStyleElements extends Com4jObject,Iterable<Com4jObject> {
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
   * @param index Mandatory RTExcelObj.XlTableStyleElementType parameter.
   * @return  Returns a value of type RTExcelObj.TableStyleElement
   */

  @VTID(11)
  RTExcelObj.TableStyleElement item(
    RTExcelObj.XlTableStyleElementType index);


  /**
   * <p>
   * Getter method for the COM property "_Default"
   * </p>
   * @param index Mandatory RTExcelObj.XlTableStyleElementType parameter.
   * @return  Returns a value of type RTExcelObj.TableStyleElement
   */

  @VTID(12)
  @DefaultMethod
  RTExcelObj.TableStyleElement _Default(
    RTExcelObj.XlTableStyleElementType index);


  /**
   * <p>
   * Getter method for the COM property "_NewEnum"
   * </p>
   */

  @VTID(13)
  java.util.Iterator<Com4jObject> iterator();

  // Properties:
}
